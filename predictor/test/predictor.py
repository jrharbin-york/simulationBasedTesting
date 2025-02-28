from sktime.datatypes import check_raise, convert_to
from sktime.transformations.panel.rocket import Rocket, MiniRocket, MiniRocketMultivariate, MultiRocketMultivariate
from sktime.transformations.panel.summarize import RandomIntervalFeatureExtractor
from sktime.transformations.compose import FeatureUnion
from sktime.transformations.series.binning import TimeBinAggregate
from sktime.transformations.series.summarize import WindowSummarizer
from sktime.transformations.series.impute import Imputer
from sktime.classification.interval_based import TimeSeriesForestClassifier
from sktime.regression.interval_based import TimeSeriesForestRegressor
from sktime.classification.ensemble import ComposableTimeSeriesForestClassifier
from sktime.classification.deep_learning import MVTSTransformerClassifier

from sktime.transformations.panel.compose import ColumnConcatenator

from sktime.performance_metrics.forecasting import MeanAbsoluteError
from sktime.performance_metrics.forecasting import MeanSquaredError
from sktime.performance_metrics.forecasting import median_absolute_percentage_error
from sklearn.metrics import top_k_accuracy_score
from sklearn.metrics import r2_score

from matplotlib import pyplot as plt
from sktime.utils.plotting import plot_series
from sklearn.model_selection import train_test_split
from sklearn.model_selection import KFold

from timeit import default_timer as timer

from sklearn.linear_model import RidgeClassifierCV, RidgeCV, SGDClassifier, SGDRegressor
from sklearn.ensemble import RandomForestClassifier
from sklearn.preprocessing import StandardScaler
from sklearn.svm import LinearSVC, LinearSVR
from sklearn.metrics import confusion_matrix
from sklearn.metrics import ConfusionMatrixDisplay

import tsfresh
from tsfresh.feature_extraction.settings import ComprehensiveFCParameters
from sktime.transformations.panel.tsfresh import TSFreshFeatureExtractor
from sklearn.tree import DecisionTreeRegressor
from sklearn.ensemble import RandomForestRegressor
from sklearn.ensemble import GradientBoostingRegressor
from sklearn.ensemble import AdaBoostRegressor

from sklearn.ensemble import GradientBoostingClassifier

import datetime as dt
import numpy as np
import glob
import sys
import pandas as pd
import os
import structlog
from sktime.pipeline import make_pipeline
from tabulate import tabulate

log = structlog.get_logger()

k_fold_shuffle = True

def load_individual_instance(filename, needed_columns):
    df = pd.read_csv(filename)
    for col in needed_columns:
        if not (col in df.columns):
            df[col] = 0.0
            # Ensure all the columns are in the correct order!
    return df[needed_columns]

def create_combined_data(base_dir, filenames, needed_columns):
    combined_data_m = map(lambda file: load_individual_instance(base_dir + "/" + file, needed_columns), filenames)
    combined_data = list(combined_data_m)
    print("Check data: ",check_raise(combined_data, mtype="df-list"))
    return combined_data

def run_regression_or_classifier(regression, pipeline_gen_func, alg_name, params):
    base_dir = params["base_dir"]
    data_files_train = params["data_files_train"]
    data_files_test = params["data_files_test"]
    metrics_train_pandas = params["metrics_train_pandas"]
    metrics_test_pandas = params["metrics_test_pandas"]
    target_metric_name = params["target_metric_name"]
    needed_columns = params["needed_columns"]
    alg_name = params["target_metric_name"]
        
    train_data = create_combined_data(base_dir, data_files_train, needed_columns)
    test_data = create_combined_data(base_dir, data_files_test, needed_columns)
    metrics_train = np.array(metrics_train_pandas[target_metric_name])
    metrics_test =  np.array(metrics_test_pandas[target_metric_name])
    log.debug("Check data format train_metrics: %s",check_raise(metrics_test, mtype="np.ndarray"))
    log.debug("Check data format test_metrics: %s",check_raise(metrics_train, mtype="np.ndarray"))

    if regression:
        # regressor
        pipe = pipeline_gen_func(params)
        pipe.fit(train_data, metrics_train)
        log.info("%s regressor fit done!", alg_name)
        r2_score = pipe.score(test_data, metrics_test)
        log.info("r2 Score on test data = %s", r2_score)
        predicted_val = pipe.predict(test_data)
        actual_val = metrics_test
        predicted_vs_actual = pd.DataFrame({'predicted_val':predicted_val, 'actual_val':actual_val}, columns = ['predicted_val', 'actual_val'])
        return [pipe, r2_score, predicted_vs_actual]
    else:
        #classifier
        class_count = params["class_count"]
        metric_max = np.max([np.max(metrics_train), np.max(metrics_test)])
        if class_count is None:
            train_class = metrics_train
            test_class = metrics_test
        else:
            metric_min = np.min([np.min(metrics_train), np.min(metrics_test)])
            train_class = metricval_to_class(metrics_train, metric_max, metric_min, class_count)
            test_class = metricval_to_class(metrics_test, metric_max, metric_min, class_count)

        pipe = pipeline_gen_func(params)
        pipe.fit(train_data, train_class)
        print("%s classifier fit done!" % alg_name)
        accuracy = pipe.score(test_data, test_class)
        print("Accuracy on test data = ", accuracy)
        predicted_class = pipe.predict(test_data)
        predicted_class_probs = pipe.predict_proba(test_data)
        class_labels = np.arange(0,len(predicted_class_probs[0]))
        actual_class = test_class
        predicted_vs_actual = pd.DataFrame({'predicted_class':predicted_class, 'actual_class':actual_class}, columns = ['predicted_class', 'actual_class'])
        return [pipe, accuracy, predicted_vs_actual, class_labels, predicted_class_probs]

def create_tsf_regression(n_estimators=200, min_interval=3):
    combiner = ColumnConcatenator()
    log.debug("Constructing TSF regressor with n_estimators=%u", n_estimators)
    tsfr = combiner * TimeSeriesForestRegressor(n_estimators=n_estimators, n_jobs=-1)
    return tsfr

def create_tsfresh_windowed_regression(params, n_estimators, windowsize, res_samples_per_second, max_depth=3, learning_rate=0.1, loss="squared_error"):
    feature_name = "jrh_windowed_features_calculation_fixedsize"
    settings = {}
    log.debug("create windowsize=" + str(windowsize))
    settings[feature_name] = {"windowsize" : windowsize, "resolution_samples_per_second" : res_samples_per_second }
    col_names = params["needed_columns"]

    features_selected = list(map(lambda col_name: col_name + "__" + feature_name + "__windowsize_" + str(windowsize) + "__resolution_samples_per_second_" + str(res_samples_per_second), col_names))

    for fn in features_selected:
        settings[fn] = {"windowsize" : windowsize}
    
    print("features_selected = " + str(features_selected))
    t_features = TSFreshFeatureExtractor(default_fc_parameters=settings, kind_to_fc_parameters=features_selected, show_warnings=False)
    gregressor = GradientBoostingRegressor(n_estimators=n_estimators, max_depth=max_depth)
    pipeline = make_pipeline(t_features, StandardScaler(with_mean=False), gregressor)
    return pipeline

def create_tsfresh_windowed_classifier(params, n_estimators, windowsize, res_samples_per_second, max_depth=3):
    feature_name = "jrh_windowed_features_calculation_fixedsize"
    # TODO: try other features as well?
    settings = {}
    log.debug("create windowsize=" + str(windowsize))
    settings[feature_name] = {"windowsize" : windowsize, "resolution_samples_per_second" : res_samples_per_second }
    col_names = params["needed_columns"]

    features_selected = list(map(lambda col_name: col_name + "__" + feature_name + "__windowsize_" + str(windowsize) + "__resolution_samples_per_second_" + str(res_samples_per_second), col_names))

    for fn in features_selected:
        settings[fn] = {"windowsize" : windowsize}
    
    print("features_selected = " + str(features_selected))
    t_features = TSFreshFeatureExtractor(default_fc_parameters=settings, kind_to_fc_parameters=features_selected, show_warnings=False)
    gclassifier = GradientBoostingClassifier(n_estimators=n_estimators, max_depth=max_depth)
    pipeline = make_pipeline(t_features, StandardScaler(with_mean=False), gclassifier)
    return pipeline

def create_hivecote2():
    hive_cote = HIVECOTEV2()
    return hive_cote

def create_rocket(num_kernels, max_alpha):
    rocket_pipeline = make_pipeline(Rocket(num_kernels=num_kernels, n_jobs=-1), StandardScaler(with_mean=False), RidgeCV(alphas=(0.1, 1.0, max_alpha))) 
    return rocket_pipeline

def create_rocket_with_regtrees(num_kernels, n_estimators, max_depth=3):
    gregressor = GradientBoostingRegressor(n_estimators=n_estimators, max_depth=max_depth)
    rocket_pipeline = make_pipeline(Rocket(num_kernels=num_kernels, n_jobs=-1), StandardScaler(with_mean=False), gregressor)
    return rocket_pipeline

def create_mvts(num_heads=4, d_model=64, num_epochs=10):
    log.debug("num_heads=%u, d_model=%u" % (num_heads, d_model))
    model = MVTSTransformerClassifier(n_heads=num_heads, d_model=d_model, num_epochs=num_epochs)
    return model

def plot_regression(predicted_vs_actual, filename="regression.pdf"):
    plt.plot(predicted_vs_actual["predicted_val"], predicted_vs_actual["actual_val"],'x')
    plt.axline((1,1),(2,2), marker="None", linestyle="dotted", color="Black")
    plt.xlabel("Predicted value of distance to sensitive point")
    plt.ylabel("Actual value of distance to sensitive point")
    plt.xlim([-2, 4.0])
    plt.ylim([0, 4.0])
    plt.title("Predicted vs actual distance for turtlebot with fixed fuzzing")
    plt.savefig(filename)

def plot_confusion_matrix(predicted_vs_actual, filename="confusion.pdf", normalize=None):
    cm = confusion_matrix(predicted_vs_actual["actual_class"], predicted_vs_actual["predicted_class"], normalize=normalize)
    cmd = ConfusionMatrixDisplay(cm)
    cmd.plot()
    plt.savefig(filename)
    return None

def read_data(results_directory, mfile):
    data_files = list(map(os.path.basename, sorted(glob.glob(results_directory + "/MODELFILE*"))))
    metrics = pd.read_csv(mfile)
    return data_files, metrics

def test_regression(id_code, alg_name, alg_func, fig_filename_func, pd_res, base_dir_full, summary_res, alg_param1, alg_param2, k=5):
    params = {}
    params["base_dir"] = base_dir_full
    params["target_metric_name"] = "distanceToPoint3D"
    params["needed_columns"] = ['distortVelocity_variable', "reverseVehicle_variable"]
    
    mfile = base_dir_full + "/metrics.csv"
    data_files, metrics = read_data(base_dir_full, mfile)

    alg_func_delayed = lambda params: alg_func(alg_param1, alg_param2, params)
 
    k=5
    kf = KFold(n_splits=k, shuffle=k_fold_shuffle)

    # Accumulate these over all splits
    r2_score_all_splits = []
    mse_all_splits = []
    rmse_all_splits = []
    
    for i, (train_index, test_index) in enumerate(kf.split(data_files)):
        # Split the data for k_fold validation
        params["data_files_train"] = [data_files[i] for i in train_index]
        params["metrics_train_pandas"] = metrics.iloc[train_index]
        params["data_files_test"] = [data_files[i] for i in test_index]
        params["metrics_test_pandas"] = metrics.iloc[test_index]
        log.debug(f"Fold {i}:")
        fig_filename = fig_filename_func(id_code, i)

        time_start = timer()
        pipeline, r2_score_from_reg, predicted_vs_actual = run_regression_or_classifier(True, alg_func_delayed, alg_name, params)
        
        time_end = timer()
        time_diff = time_end - time_start

        mse_c = MeanSquaredError()
        rmse_c = MeanSquaredError(square_root=True)

        r2se = r2_score(predicted_vs_actual["actual_val"], predicted_vs_actual["predicted_val"], multioutput='uniform_average')

        mse = mse_c(predicted_vs_actual["actual_val"], predicted_vs_actual["predicted_val"])
        rmse = rmse_c(predicted_vs_actual["actual_val"], predicted_vs_actual["predicted_val"])

        log.debug("r2_score from regression run = %f, r2_score locally computed = %f", r2_score_from_reg, r2se)

        # Fix: needed to set multioutput='uniform_average'
        if abs(r2se - r2_score_from_reg) > 1e-6:
            log.error("Discrepancy between r2_score computed in pipeline and r2_score computed from sklearn")
            sys.exit(-1)

        r2_score_all_splits = np.append(r2_score_all_splits, r2se)
        mse_all_splits = np.append(mse_all_splits, mse)
        rmse_all_splits = np.append(rmse_all_splits, rmse)
         
        results_this_test = {"id":id_code, "k_split":i, "param1":alg_param1, "param2":alg_param2, "r2_score":r2_score_from_reg, "filename_graph":fig_filename, "time_diff":time_diff, "mse":mse, "rmse":rmse }
        pd_res.loc[len(pd_res)] = results_this_test
        # change filename
        log.debug("Plotting regression plot to %s", fig_filename)
        plot_regression(predicted_vs_actual, fig_filename)

    mean_r2 = np.mean(r2_score_all_splits)
    mean_mse = np.mean(mse_all_splits)
    mean_rmse = np.mean(rmse_all_splits)

    stddev_r2 = np.std(r2_score_all_splits)
    stddev_mse = np.std(mse_all_splits)
    stddev_rmse = np.std(rmse_all_splits)

    summary_this_test = {"param1":alg_param1, "param2":alg_param2, "r2_score_mean":mean_r2, "mse_mean":mean_mse, "rmse_mean":mean_rmse, "r2_score_stddev":stddev_r2, "mse_score_stddev":stddev_mse, "rmse_score_stddev":stddev_rmse}
    summary_res.loc[len(summary_res)] = summary_this_test

    log.info("Mean r2 all splits = %f, stddev r2 all splits = %f", mean_r2, stddev_r2)
    log.info("Mean MSE all splits = %f, stddev MSE all splits = %f", mean_mse, stddev_mse)
    log.info("Mean RMSE all splits = %f, stddev RMSE all splits = %f", mean_rmse, stddev_rmse)

    return pd_res, summary_res

def test_classification(id_code, alg_name, alg_func, fig_filename_func, pd_res, expt_config, summary_res, alg_param1, alg_param2, k=5):
    params = {}
    
    params["base_dir"] = expt_config["data_dir_base"]
    params["target_metric_name"] = expt_config["target_metric_name"]
    params["needed_columns"] = expt_config["needed_columns"]
    params["class_count"] = None
    
    mfile = expt_config["data_dir_base"] + "/metrics.csv"
    data_files, metrics = read_data(expt_config["data_dir_base"], mfile)

    alg_func_delayed = lambda params: alg_func(alg_param1, alg_param2, params)

    accuracy_top_limit = 2

    # Accumulate these over all splits
    accuracy_all_splits = []
    top_k_accuracy_all_splits = []
    rmse_all_splits = []

    k=5
    kf = KFold(n_splits=k, shuffle=k_fold_shuffle)
    
    for i, (train_index, test_index) in enumerate(kf.split(data_files)):
        params["data_files_train"] = [data_files[i] for i in train_index]
        params["metrics_train_pandas"] = metrics.iloc[train_index]
        params["data_files_test"] = [data_files[i] for i in test_index]
        params["metrics_test_pandas"] = metrics.iloc[test_index]

        time_start = timer()
        pipeline, accuracy_score, predicted_vs_actual, class_labels, class_probs = run_regression_or_classifier(False, alg_func_delayed, alg_name, params)
        time_end = timer()
        time_diff = time_end - time_start
        
        top_k_accuracy = 0.0
        log.debug("Classification accuracy = %f, top k accuracy this split = %f" % (accuracy_score, top_k_accuracy))
        # top k accuracy is broken because labels do not match 
#        top_k_accuracy = top_k_accuracy_score(predicted_vs_actual["actual_class"], class_probs, k=accuracy_top_limit, labels=class_labels, normalize=True)

        accuracy_all_splits = np.append(accuracy_all_splits, accuracy_score)
        top_k_accuracy_all_splits = np.append(top_k_accuracy_all_splits, top_k_accuracy)

        fig_filename = fig_filename_func(id_code, i)
                
        results_this_test = {"id":id_code, "k_split":i, "param1":alg_param1, "param2":alg_param2, "filename_graph":fig_filename, "time_diff":time_diff, "accuracy_score":accuracy_score, "top_k_accuracy_score":top_k_accuracy_score }
        pd_res.loc[len(pd_res)] = results_this_test

        #plot_regression(predicted_vs_actual, "fixedfuzzing_multimodels_twooperations_turtlebot.pdf")
        log.debug("Plotting confusion matrix to %s", fig_filename)
        plot_confusion_matrix(predicted_vs_actual, fig_filename)
        log.debug("Plot done")

    mean_accuracy = np.mean(accuracy_all_splits)
    min_accuracy = np.min(accuracy_all_splits)
    max_accuracy = np.max(accuracy_all_splits)
    
    mean_top_k_accuracy = np.mean(top_k_accuracy_all_splits)
    stddev_accuracy = np.std(accuracy_all_splits)
    stddev_top_k_accuracy = np.std(top_k_accuracy_all_splits)
    
    summary_this_test = {"param1":alg_param1, "param2":alg_param2, "mean_accuracy":mean_accuracy, "min_accuracy":min_accuracy, "max_accuracy":max_accuracy, "mean_top_k_accuracy": mean_top_k_accuracy, "stddev_accuracy": stddev_accuracy, "stddev_top_k_accuracy": stddev_top_k_accuracy}
    summary_res.loc[len(summary_res)] = summary_this_test
    return pd_res, summary_res
   
def run_test(expt_config, alg_name, regression, alg_func, alg_params1, alg_params2):
    if regression:
        individual_results = pd.DataFrame(columns=["id", "param1", "param2", "k_split", "r2_score", "mse", "rmse", "filename_graph", "time_diff"])
        stats_results = pd.DataFrame(columns=["param1", "param2", "r2_score_mean", "mse_mean", "rmse_mean", "r2_score_stddev", "mse_score_stddev", "rmse_score_stddev"])
        name_base = "regression"
    else:
        individual_results = pd.DataFrame(columns=["id", "param1", "param2", "k_split", "accuracy_score", "top_k_accuracy_score", "filename_graph", "time_diff"])
        stats_results = pd.DataFrame(columns=["param1", "param2", "mean_accuracy", "min_accuracy", "max_accuracy", "mean_top_k_accuracy", "stddev_accuracy", "stddev_top_k_accuracy"])
        name_base = "classification"
        
    results_file = name_base + "-" + alg_name + "-res.csv"
    summary_file = name_base + "-" + alg_name + "-summary-stats.csv"
    # ID, mape, r2

    id_num = 0
    for param1 in alg_params1:
        for param2 in alg_params2:
            fig_filename_func = lambda id_num, k_split: name_base + "-" + alg_name + "-ID" + str(id_num) + "-" + str(param1) + "-" + str(param2) + "-" + "k_split" + str(k_split) +".png"
            id_num+=1
            id_code = "ID" + str(id_num)
            if regression:
                individual_results, stats_results = test_regression(id_code, alg_name, alg_func, fig_filename_func, individual_results, expt_config, stats_results, alg_param1=param1, alg_param2=param2)
            else:
                individual_results, stats_results = test_classification(id_code, alg_name, alg_func, fig_filename_func, individual_results, expt_config, stats_results, alg_param1=param1, alg_param2=param2)
            print(tabulate(stats_results, headers="keys"))
            individual_results.to_csv(results_file, sep=",")
            print(tabulate(individual_results, headers="keys"))
            stats_results.to_csv(summary_file, sep=",")

    print(tabulate(stats_results, headers="keys"))
    individual_results.to_csv(results_file, sep=",")
    print(tabulate(individual_results, headers="keys"))
    stats_results.to_csv(summary_file, sep=",")
 
data_dir_base_turtlebot = "/home/jharbin/academic/soprano/predictor/test-data/temp-data-variable-multimodels"
data_dir_base_pal_5000 = "/home/jharbin/academic/soprano/simulationBasedTesting/predictor/test/temp-data-pal-multimodels-5000-samples"
data_dir_base_pal_500 = "/home/jharbin/academic/soprano/simulationBasedTesting/predictor/test/temp-data-pal-multimodels-500-samples"

data_dir_base_pal_500_handover = "/home/jharbin/academic/soprano/simulationBasedTesting/predictor/test/temp-data-pal-multimodels-500-samples-handover"

expt_config_turtlebot = { "data_dir_base" : data_dir_base_turtlebot, 
                          "target_metric_name" : "distanceToPoint3D", 
                          "needed_columns" : ['distortVelocity_variable', "reverseVehicle_variable"] 
                         }

pal_cols_fuzzing = ['dosAttackTrigger',
                    'distortBaseScanPMB2', 
                    'distortBaseScanOmni',
                    'distortBaseScanTiago',
                    'packetLossLaserScanOmni',
                    'packetLossLaserScanPMB2',
                    'packetLossLaserScanTiago',
                    'delayBaseScanOmni',
                    'delayBaseScanPMB2',
                    'delayBaseScanTiago1']

pal_cols_vars = ['omni-posX','omni-posY','pmb2-posX','pmb2-posY','tiago-posX','tiago-posY']

expt_config_pal_missed_offline = { "data_dir_base" : "/home/jharbin/academic/soprano/simulationBasedTesting/predictor/test/pal-rosbags-multimodel", 
                                   "target_metric_name" : "M1_countObjectsMissed", 
                                   "needed_columns" : pal_cols_fuzzing
                                  }

expt_config_pal_missed_online = { "data_dir_base" : "/home/jharbin/academic/soprano/simulationBasedTesting/predictor/test/pal-rosbags-multimodel",
                                  "target_metric_name" : "M1_countObjectsMissed", 
                                  "needed_columns" : pal_cols_fuzzing + pal_cols_vars
                                 }

expt_config_pal_missed_offline50 = { "data_dir_base" : "/home/jharbin/academic/soprano/simulationBasedTesting/predictor/test/pal-rosbags-multimodel-checkpoint50", 
                                     "target_metric_name" : "M1_countObjectsMissed", 
                                     "needed_columns" : pal_cols_fuzzing
                                    }

expt_config_pal_missed_online50 = { "data_dir_base" : "/home/jharbin/academic/soprano/simulationBasedTesting/predictor/test/pal-rosbags-multimodel-checkpoint50",
                                    "target_metric_name" : "M1_countObjectsMissed", 
                                    "needed_columns" : pal_cols_fuzzing + pal_cols_vars
                                   }

expt_config_pal_missed_offline150 = { "data_dir_base" : "/home/jharbin/academic/soprano/simulationBasedTesting/predictor/test/pal-rosbags-multimodel-checkpoint150", 
                                      "target_metric_name" : "M1_countObjectsMissed", 
                                      "needed_columns" : pal_cols_fuzzing
                                     }

expt_config_pal_missed_online150 = { "data_dir_base" : "/home/jharbin/academic/soprano/simulationBasedTesting/predictor/test/pal-rosbags-multimodel-checkpoint150",
                                     "target_metric_name" : "M1_countObjectsMissed", 
                                    "needed_columns" : pal_cols_fuzzing + pal_cols_vars
                                    }

#run_test("TSF", lambda n_estimators: create_tsf_regression(n_estimators), [5,20,50,100,200])
#First alg is the n_estimators
#Second alg is the window length

# Range of params for window sizes
n_estimator_choices = [5,20,50,100,200,300]
window_size_choices_secs = [0.5,1,2,5,10]
max_depth_choices=[2,3,4,5,6,7,8]

# TSF also uses n_estimator
tsf_min_intervals = [1,2,3,5,10,20] # 3 is the default

# Rocket params: number of kernels and maximum alpha
rocket_kernels = [100,1000,5000,10000,50000]
rocket_max_alphas = [5,10,15,20,50]

n_estimator_choices_pal = [5,50,200,500]
window_size_choices_pal_secs_lores = [1,2,5]
#window_size_choices_pal_secs_hires = [0.2,0.5,1,2,5]

n_estimator_choices_pal = [200,500]
#window_size_choices_pal_secs_hires = [0.2,0.5]
window_size_choices_pal_secs_hires = [50.0, 20.0, 5.0, 2.0,1.0]
max_depth_choices_pal=[3,4,5,6,7,8]

learning_rates=[0.1,0.05,0.03, 0.2, 0.3]

#run_test("Windowed", lambda n_estimators, window_size_choice: create_tsfresh_windowed_regression(n_estimators, window_size_choice), alg_params1=n_estimator_choices, alg_params2=window_size_choices_secs)

# type num_features = n_vars * 2 - e.g. 2 windows per variable time series

# pipeline gen functions have arg1, arg2, and the params



#run_test(data_dir_base_turtlebot,
#         "Windowed-LR-MaxDepth4-Quantile",
#         True,
#         lambda n_estimators, lr, params:
#         create_tsfresh_windowed_regression(params,
#                                            n_estimators,
#                                            fixed_windowsize_chosen,
#                                            res_samples_per_second=10.0,
#                                            max_depth=4,
#                                            learning_rate=lr,
#                                            loss="quantile"),
#         alg_params1=n_estimator_choices,
#         alg_params2=learning_rates)

# run_test(expt_config_pal_missed_offline50,
#          "PAL-Missed-Offline50Check",
#          False,
#          lambda n_estimators, windowsize, params:
#          create_tsfresh_windowed_classifier(params,
#                                             n_estimators,
#                                             windowsize,
#                                             res_samples_per_second=10.0,
#                                             max_depth=4),
#          alg_params1=[100,300,1000], # n_estimators
#          alg_params2=[10.0, 5.0, 2.0, 1.0]) # windowsizes

run_test(expt_config_pal_missed_offline50,
         "PAL-Missed-Offline50Check",
         False,
         lambda n_estimators, windowsize, params:
         create_tsfresh_windowed_classifier(params,
                                            n_estimators,
                                            windowsize,
                                            res_samples_per_second=10.0,
                                            max_depth=4),
         alg_params1=[300], # n_estimators
         alg_params2=[1.0]) # windowsizes

run_test(expt_config_pal_missed_online50,
         "PAL-Missed-Online50Check",
         False,
         lambda n_estimators, windowsize, params:
         create_tsfresh_windowed_classifier(params,
                                            n_estimators,
                                            windowsize,
                                            res_samples_per_second=10.0,
                                            max_depth=4),
         alg_params1=[300], # n_estimators
         alg_params2=[1.0]) # windowsizes

run_test(expt_config_pal_missed_offline150,
         "PAL-Missed-Offline150Check",
         False,
         lambda n_estimators, windowsize, params:
         create_tsfresh_windowed_classifier(params,
                                            n_estimators,
                                            windowsize,
                                            res_samples_per_second=10.0,
                                            max_depth=4),
         alg_params1=[300], # n_estimators
         alg_params2=[1.0]) # windowsizes

run_test(expt_config_pal_missed_online150,
         "PAL-Missed-Online150Check",
         False,
         lambda n_estimators, windowsize, params:
         create_tsfresh_windowed_classifier(params,
                                            n_estimators,
                                            windowsize,
                                            res_samples_per_second=10.0,
                                            max_depth=4),
         alg_params1=[300], # n_estimators
         alg_params2=[1.0]) # windowsizes


#run_test("Rocket", lambda n_kernels, max_alpha: create_rocket(n_kernels, max_alpha), rocket_kernels, rocket_max_alphas)
#run_test("Rocket", lambda n_kernels, max_alpha: create_rocket(n_kernels, max_alpha), rocket_kernels, rocket_max_alphas)

#run_test(data_dir_base_pal_500, "WindowedClassifierPAL_LoRes", False, lambda n_estimators, window_size_choice: create_tsfresh_windowed_classifier(n_estimators, window_size_choice, res_samples_per_second=1.0), n_estimator_choices_pal, window_size_choices_pal_secs_lores)

# num_heads, d_model

mvts_num_heads_options = [4,8,16]
mvts_num_dmodel_options = [64,128,256]

#run_test(data_dir_base_pal_500, "WindowedClassifierPAL_MVTS", False, lambda num_heads, d_model: create_mvts(num_heads=num_heads, d_model=d_model), mvts_num_heads_options, mvts_num_dmodel_options)

#run_test(data_dir_base_pal_500, "WindowedClassifierPAL_LoRes_Depth", False, lambda max_depth_choice, window_size_choice: create_tsfresh_windowed_classifier(500, window_size_choice, res_samples_per_second=1.0,max_depth=max_depth_choice), max_depth_choices_pal, window_size_choices_pal_secs_lores)


#run_test(data_dir_base_pal_500_handover, "WindowedClassifierPAL_LoRes_Handover", True, lambda n_estimators, window_size_choice: create_tsfresh_windowed_regression(n_estimators, window_size_choice, res_samples_per_second=1.0), n_estimator_choices_pal, window_size_choices_pal_secs_lores)

#run_test(data_dir_base_pal_5000, "WindowedClassifierPAL_HiRes", False, lambda n_estimators, window_size_choice: create_tsfresh_windowed_classifier(n_estimators, window_size_choice, res_samples_per_second=10.0), n_estimator_choices_pal, window_size_choices_pal_secs_hires)

#run_test(data_dir_base, "Rocket", True, lambda n_kernels, max_alpha: create_rocket(n_kernels, max_alpha), rocket_kernels, rocket_max_alphas)

# TODO: rocket with the emsemble regressor tree

#run_test("TSF", lambda n_estimators, min_interval: create_tsf_regression(n_estimators, min_interval), n_estimator_choices, tsf_min_intervals)


#run_test("Windowed-window0.5-depths", lambda n_estimators, max_depth: create_tsfresh_windowed_regression(n_estimators, 0.5, max_depth), alg_params1=n_estimator_choices, alg_params2=max_depth_choices)
