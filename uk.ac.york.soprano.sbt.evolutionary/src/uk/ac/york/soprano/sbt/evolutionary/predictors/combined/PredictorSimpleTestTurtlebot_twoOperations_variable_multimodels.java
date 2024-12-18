package uk.ac.york.soprano.sbt.evolutionary.predictors.combined;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;

import tech.tablesaw.api.Table;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.MetricInstance;
import uk.ac.york.soprano.sbt.evolutionary.predictors.*;
import uk.ac.york.soprano.sbt.evolutionary.utilities.temp.SESAMEModelLoader;

public class PredictorSimpleTestTurtlebot_twoOperations_variable_multimodels {
	public static Optional<FuzzingTestConversion> convertToCSVInDir(Test t, String testFileName, File baseDirPath) {
		try {

			if (!baseDirPath.exists()) {
				baseDirPath.mkdirs();
			}

			String csvFileName = testFileName;
			File outFile = new File(baseDirPath.getAbsolutePath() + File.separator + csvFileName);
			FuzzingTestConversion ftc = new FuzzingTestConversion(t);
			Table converted = ftc.convert();
			ftc.saveTableToCSV(converted, outFile);
			ftc.getOperationInfo();
			return Optional.of(ftc);

		} catch (InvalidEndType e) {
			e.printStackTrace();
		} catch (UnknownLength e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (MissingColumnFor e) {
			e.printStackTrace();
		} catch (ConversionFailedColError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return Optional.empty();
	}

	public static Optional<Double> getMetricValue(Test t, String targetMetricName) throws IOException {
		for (MetricInstance m : t.getMetrics()) {
			if (m.getMetric().getName().equals(targetMetricName)) {
				Double res = m.getResult().getValue();
				return Optional.of(res);
			}
		}

		return Optional.empty();
	}

	public static void main(String[] args) {
		ArrayList<String> modelFiles = new ArrayList<String>();
		modelFiles.add("/home/simtesting/simtesting/simulationBasedTesting/uk.ac.york.sesame.testing.evolutionary/src/uk/ac/york/sesame/testing/evolutionary/predictors/testmodel/turtleMRS-twoOperations-1024-run1.model");
		modelFiles.add("/home/simtesting/simtesting/simulationBasedTesting/uk.ac.york.sesame.testing.evolutionary/src/uk/ac/york/sesame/testing/evolutionary/predictors/testmodel/turtleMRS-twoOperations-704-failedrun.model");
		modelFiles.add("/home/simtesting/simtesting/simulationBasedTesting/uk.ac.york.sesame.testing.evolutionary/src/uk/ac/york/sesame/testing/evolutionary/predictors/testmodel/turtleMRS-twoOperations-512-variable.model");

		String campaignName = "validatePredictor_variable";
		String outputDirName = "/home/simtesting/academic/soprano/SPWorkerTemp/notebooks/predictor/temp-data-variable-multimodels";
		String targetMetricName = "distanceToPoint3D";

		File baseDirectory = new File(outputDirName);
		File metricsFile = new File(outputDirName + "/metrics.csv");
		int metricFileNum = 0;

		try {
			FileWriter metricsFileWriter = new FileWriter(metricsFile);
			
			FileWriter logWriter = new FileWriter(outputDirName + "/operationAndMetricLog.csv");
			metricsFileWriter.write("testName," + targetMetricName + "\n");

			for (String modelFile : modelFiles) {
				metricFileNum++;
				SESAMEModelLoader loader = new SESAMEModelLoader(modelFile);
				Resource model = loader.loadTestingSpace();
				//TestingSpace testingSpace = loader.getTestingSpace(model);
				Optional<TestCampaign> testCampaign_o = loader.getTestCampaign(model, campaignName);

				logWriter.write("testID,metricValue,rv_start,rv_end,rv_intensity,vel_start,vel_end,vel_intensity\n");

				if (testCampaign_o.isPresent()) {
					TestCampaign tc = testCampaign_o.get();
					for (Test t : tc.getPerformedTests()) {

						Optional<Double> mv_o = getMetricValue(t, targetMetricName);
						if (mv_o.isPresent()) {
							Double mv = mv_o.get();
							if (isValid(mv)) {
								System.out.println("Processing test to CSV file " + t.getName());
								String testFile = "MODELFILE" + Integer.toString(metricFileNum) + "_" + t.getName();
								Optional<FuzzingTestConversion> ftc_o = convertToCSVInDir(t, testFile, baseDirectory);
								logOperationsAndMetrics(logWriter, testFile, ftc_o, mv);
								metricsFileWriter.write(testFile + "," + mv.toString() + "\n");
							} else {
								System.err.println("SKIPPING test " + t.getName() + " failed/outlier metric value - "
										+ t.getName());
							}
						}
					}
				}
			}

			metricsFileWriter.close();
			logWriter.close();

		} catch (EolModelLoadingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void logOperationsAndMetrics(FileWriter logWriter, String testID,
			Optional<FuzzingTestConversion> ftc_o, Double mv) throws IOException {
		if (ftc_o.isPresent()) {
			FuzzingTestConversion ftc = ftc_o.get();
			HashMap<String, String> maps = ftc.getOperationInfo();
			String key1 = "reverseVehicle_variable";
			String key2 = "distortVelocity_variable";
			String opString1 = maps.get(key1);
			String opString2 = maps.get(key2);

			if (opString1 == null) {
				opString1 = "0.0,0.0,0.0";
			}

			if (opString2 == null) {
				opString2 = "0.0,0.0,0.0";
			}

			String opStrings = testID + "," + mv.toString() + "," + opString1 + "," + opString2;
			logWriter.write(opStrings + "\n");
		}
	}

	private static boolean isValid(Double mv) {
		if ((mv < -1) || (mv > 100)) {
			return false;
		} else
			return true;
	}
}
