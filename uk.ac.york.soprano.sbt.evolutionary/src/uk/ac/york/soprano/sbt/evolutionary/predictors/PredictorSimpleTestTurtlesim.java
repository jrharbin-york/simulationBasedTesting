package uk.ac.york.soprano.sbt.evolutionary.predictors;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Optional;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;

import tech.tablesaw.api.Table;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.MetricInstance;
import uk.ac.york.soprano.sbt.evolutionary.utilities.temp.SESAMEModelLoader;

public class PredictorSimpleTestTurtlesim {
	public static void convertToCSVInDir(Test t, File baseDirPath) {
		try {

			if (!baseDirPath.exists()) {
				baseDirPath.mkdirs();
			}

			String csvFileName = t.getName() + ".csv";
			File outFile = new File(baseDirPath.getAbsolutePath() + File.separator + csvFileName);

			FuzzingTestConversion ftc = new FuzzingTestConversion(t);
			Table converted = ftc.convert();
			ftc.saveTableToCSV(converted, outFile);
		} catch (InvalidEndType e) {
			e.printStackTrace();
		} catch (UnknownLength e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (MissingColumnFor e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ConversionFailedColError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		// Load the model - hardcoded
		
		//String modelFile = args[0];
		//String campaignName = args[1];
		//String outputDirName = args[2];
		//String testTrainLimit_s = args[3];
		//String targetMetricName = args[4];

		String modelFile = "/home/simtesting/simtesting/simulationBasedTesting/uk.ac.york.sesame.testing.evolutionary/src/uk/ac/york/sesame/testing/evolutionary/predictors/testmodel/turtleMRS-256-fixedfuzzing.model";
		String campaignName = "validatePredictor";
		String outputDirName = "/home/simtesting/academic/soprano/SPWorkerTemp/notebooks/predictor/temp-data-256-turtlesim-fixedfuzzing/";
		String testTrainLimit_s = "192";
		String targetMetricName = "distanceToPoint";
		
		String outputDirTrain = outputDirName + "/train/";
		String outputDirTest = outputDirName + "/test/";

		File baseDirectoryTrain = new File(outputDirTrain);
		File baseDirectoryTest = new File(outputDirTest);

		File metricsTrainFile = new File(outputDirName + "/metrics-train.csv");
		File metricsTestFile = new File(outputDirName + "/metrics-test.csv");
		
		int testTrainLimit = Integer.parseInt(testTrainLimit_s);

		try {
			SESAMEModelLoader loader = new SESAMEModelLoader(modelFile);
			Resource model = loader.loadTestingSpace();
			//TestingSpace testingSpace = loader.getTestingSpace(model);
			Optional<TestCampaign> testCampaign_o = loader.getTestCampaign(model, campaignName);
			
			FileWriter metricsTrainFileWriter = new FileWriter(metricsTrainFile);
			FileWriter metricsTestFileWriter = new FileWriter(metricsTestFile);
			metricsTrainFileWriter.write(targetMetricName + "\n");
			metricsTestFileWriter.write(targetMetricName + "\n");
			
			if (testCampaign_o.isPresent()) {
				TestCampaign tc = testCampaign_o.get();
				// Get the results from the front
				//<CampaignResultSet> resFront = tc.getResultSets();
				// for (CampaignResultSet r : resFront) {
				// if (r.getName().contains(resultSetName)) {
				int testCount = 0;
				for (Test t : tc.getPerformedTests()) {
					int testNum = testCount;
					testCount++;

					File dir;
					FileWriter metricFileW;
					if (testNum < testTrainLimit) {
						dir = baseDirectoryTrain;
						metricFileW = metricsTrainFileWriter;
					} else {
						dir = baseDirectoryTest;
						metricFileW = metricsTestFileWriter;
					}
						
					Optional<Double> mv_o = getMetricValue(t, targetMetricName);
					if (mv_o.isPresent()) {
						Double mv = mv_o.get();
						if (isValid(mv)) {
							System.out.println("Processing test to CSV file " + t.getName());
							convertToCSVInDir(t, dir);
							metricFileW.write(mv.toString() + "\n");
						} else {
							System.err.println("SKIPPING test " + t.getName() + " failed/outlier metric value - " + t.getName());
						}
					}
				}
			}
			metricsTestFileWriter.close();
			metricsTrainFileWriter.close();
		} catch (EolModelLoadingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static boolean isValid(Double mv) {
		if ((mv < -1) || (mv > 100)) {
			return false;
		} else
			return true;
	}
}
