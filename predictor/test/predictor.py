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
from sktime.transformations.panel.compose import ColumnConcatenator

from sktime.performance_metrics.forecasting import MeanAbsoluteError
from sktime.performance_metrics.forecasting import MeanSquaredError
from sktime.performance_metrics.forecasting import median_absolute_percentage_error
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
        pipe = pipeline_gen_func()
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
        # get classes
        train_class = metricval_to_class(metrics_train, metric_max, metric_min, class_count)
        test_class = metricval_to_class(metrics_test, metric_max, metric_min, class_count)
        pipe = pipeline_gen_func()
        pipe.fit(train_data, train_class)
        print("%s classifier fit done!", alg_name)
        accuracy = pipe.score(test_data, test_class)
        print("Score on test data = ",score)
        predicted_class = tsfc.predict(test_data)
        actual_class = test_class
        # Not sure why have to take index 0 here
        #diff_ids = np.where((predicted_class-actual_class) != 0)[0]
        class_diff = predicted_class-actual_class
        diff_ids = np.where(abs(class_diff) > 1)[0]
        diff_names = np.array(data_files_test)[diff_ids]
        diffs = pd.DataFrame({'diff_id':diff_ids, 'diff_names':diff_names, 'predicted_class':predicted_class[diff_ids], 'actual_class':actual_class[diff_ids]}, columns=["diff_id", "diff_names", "predicted_class", "actual_class"])
        predicted_vs_actual = pd.DataFrame({'predicted_class':predicted_class, 'actual_class':actual_class}, columns = ['predicted_class', 'actual_class'])
        return [pipe, score, predicted_vs_actual, diffs]

def create_tsf_regression(n_estimators=200):
    combiner = ColumnConcatenator()
    log.debug("Constructing TSF regressor with n_estimators=%u", n_estimators)
    tsfr = combiner * TimeSeriesForestRegressor(n_estimators=n_estimators, n_jobs=-1)
    return tsfr

def create_tsfresh_windowed_regression(n_estimators, windowsize):
    feature_name = "jrh_windowed_features_calculation_fixedsize"
    # TODO: try other features as well?
    settings = {}
    log.debug("create windowsize=" + str(windowsize))
    settings[feature_name] = {"windowsize" : windowsize}
    col_names = ['distortVelocity_variable', "reverseVehicle_variable"]
    features_selected = list(map(lambda col_name: col_name + "__" + feature_name + "__windowsize_" + str(windowsize), col_names))
#   features_selected = list(map(lambda col_name: col_name + "__" + feature_name, col_names))

    for fn in features_selected:
        settings[fn] = {"windowsize" : windowsize}
    
    print("features_selected = " + str(features_selected))
    t_features = TSFreshFeatureExtractor(default_fc_parameters=settings, kind_to_fc_parameters=features_selected, show_warnings=False)
    gregressor = GradientBoostingRegressor(n_estimators=n_estimators)
    pipeline = make_pipeline(t_features, StandardScaler(with_mean=False), gregressor)
    return pipeline

def create_hivecote2():
    hive_cote = HIVECOTEV2()
    return hive_cote

def create_rocket(num_kernels):
    rocket_pipeline = make_pipeline(Rocket(num_kernels=num_kernels, n_jobs=-1), StandardScaler(with_mean=False), RidgeCV(alphas=(0.1, 1.0, 50.0))) 
    return rocket_pipeline

def plot_regression(predicted_vs_actual, filename="regression.pdf"):
    plt.plot(predicted_vs_actual["predicted_val"], predicted_vs_actual["actual_val"],'x')
    plt.axline((1,1),(2,2), marker="None", linestyle="dotted", color="Black")
    plt.xlabel("Predicted value of distance to sensitive point")
    plt.ylabel("Actual value of distance to sensitive point")
    plt.xlim([-2, 4.0])
    plt.ylim([0, 4.0])
    plt.title("Predicted vs actual distance for turtlebot with fixed fuzzing")
    plt.savefig(filename)

def read_data(results_directory, mfile):
    data_files = list(map(os.path.basename, sorted(glob.glob(results_directory + "/MODELFILE*"))))
    metrics = pd.read_csv(mfile)
    return data_files, metrics

def test_regression(id_code, alg_func, fig_filename_func, pd_res, base_dir_full, summary_res, alg_param1, alg_param2, k=5):
    params = {}
    params["base_dir"] = base_dir_full
    params["target_metric_name"] = "distanceToPoint3D"
    params["needed_columns"] = ['distortVelocity_variable', "reverseVehicle_variable"]
    mfile = base_dir_full + "/metrics.csv"
    data_files, metrics = read_data(base_dir_full, mfile)

    alg_func_delayed = lambda: alg_func(alg_param1, alg_param2)
 
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
        pipeline, r2_score_from_reg, predicted_vs_actual = run_regression_or_classifier(True, alg_func_delayed, "TSF", params)
        
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
        log.debug("Plotting to %s", fig_filename)
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

def test_classification(pd_res, base_dir_full):
    # Split the data according to the policy
    params = {}
    
    params["base_dir"] = base_dir_full
    params["target_metric_name"] = "distanceToPoint3D"
    params["needed_columns"] = ['distortVelocity_variable', "reverseVehicle_variable"]
    mfile = base_dir_full + "/metrics.csv"
    data_files, metrics = read_data(base_dir_full, mfile)

    # Generate new random state
        
    params["data_files_train"], params["data_files_test"], params["metrics_train_pandas"], params["metrics_test_pandas"] = train_test_split(data_files, metrics, test_size=0.2, random_state=0)
    pipeline, r2_score, predicted_vs_actual = run_regression_or_classifier(True, create_tsf_regression, "TSF", params)
    plot_regression(predicted_vs_actual, "fixedfuzzing_multimodels_twooperations_turtlebot.pdf")
    log.info("Plot done")
   
def run_test(alg_name, alg_func, alg_params1, alg_params2):
    regression_results = pd.DataFrame(columns=["id", "param1", "param2", "k_split", "r2_score", "mse", "rmse", "filename_graph", "time_diff"])
    stats_results = pd.DataFrame(columns=["param1", "param2", "r2_score_mean", "mse_mean", "rmse_mean", "r2_score_stddev", "mse_score_stddev", "rmse_score_stddev"])
    results_file = "regression-" + alg_name + "-res.csv"
    summary_file = "regression-" + alg_name + "-summary-stats.csv"
    # ID, mape, r2

    id_num = 0
    for param1 in alg_params1:
        for param2 in alg_params2:
            fig_filename_func = lambda id_num, k_split: "regression-" + alg_name + "-ID" + str(id_num) + "k_split" + str(k_split)  +".png"
            id_num+=1
            id_code = "ID" + str(id_num)
            data_dir_base = "/home/jharbin/academic/soprano/predictor/test-data/temp-data-variable-multimodels"
            regression_results, stats_results = test_regression(id_code, alg_func, fig_filename_func, regression_results, data_dir_base, stats_results, alg_param1=param1, alg_param2=param2)
        
    print(tabulate(stats_results, headers="keys"))
    regression_results.to_csv(results_file, sep=",")

    print(tabulate(regression_results, headers="keys"))
    stats_results.to_csv(summary_file, sep=",")
          
#run_test("TSF", lambda n_estimators: create_tsf_regression(n_estimators), [5,20,50,100,200])
#First alg is the n_estimators
#Second alg is the window length

n_estimator_choices = [5,20,50,100,200,300]
window_size_choices_secs = [0.5,1,2,5,10]

run_test("Windowed", lambda n_estimators, window_size_choice: create_tsfresh_windowed_regression(n_estimators, window_size_choice), alg_params1=n_estimator_choices, alg_params2=window_size_choices_secs)
#run_test("HIVECOTE", lambda n_kernels: create_hivecote2(), [10000])
#run_test("Rocket", lambda n_kernels: create_rocket(n_kernels), [10000])
