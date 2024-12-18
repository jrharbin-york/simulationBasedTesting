package uk.ac.york.soprano.sbt.evolutionary.predictors.combined;

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
import uk.ac.york.soprano.sbt.evolutionary.predictors.*;
import uk.ac.york.soprano.sbt.evolutionary.utilities.temp.SESAMEModelLoader;

public class PredictorSimpleTestTurtlebot {
	public static void convertToCSVInDir(Test t, File baseDirPath) {
		try {

			if (!baseDirPath.exists()) {
				baseDirPath.mkdirs();
			} 

			String csvFileName = t.getName();
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

		String modelFile = "/home/simtesting/simtesting/simulationBasedTesting/uk.ac.york.sesame.testing.evolutionary/src/uk/ac/york/sesame/testing/evolutionary/predictors/testmodel/turtlebotMRS-256-fixedfuzzing.model";
		String campaignName = "validatePredictor";
		String outputDirName = "/home/simtesting/academic/soprano/SPWorkerTemp/notebooks/predictor/temp-data-256-turtlebot-fixedfuzzing-combined/";
		String targetMetricName = "distanceToPoint3D";
		

		File baseDirectory = new File(outputDirName);
		File metricsFile = new File(outputDirName + "/metrics.csv");

		try {
			SESAMEModelLoader loader = new SESAMEModelLoader(modelFile);
			Resource model = loader.loadTestingSpace();
			//TestingSpace testingSpace = loader.getTestingSpace(model);
			Optional<TestCampaign> testCampaign_o = loader.getTestCampaign(model, campaignName);
			
			FileWriter metricsFileWriter = new FileWriter(metricsFile);
			metricsFileWriter.write("testName," + targetMetricName + "\n");
			
			if (testCampaign_o.isPresent()) {
				TestCampaign tc = testCampaign_o.get();
				for (Test t : tc.getPerformedTests()) {
					
					Optional<Double> mv_o = getMetricValue(t, targetMetricName);
					if (mv_o.isPresent()) {
						Double mv = mv_o.get();
						if (isValid(mv)) {
							System.out.println("Processing test to CSV file " + t.getName());
							convertToCSVInDir(t, baseDirectory);
							String testID = t.getName();
							metricsFileWriter.write(testID + "," + mv.toString() + "\n");
						} else {
							System.err.println("SKIPPING test " + t.getName() + " failed/outlier metric value - " + t.getName());
						}
					}
				}
			}
			
			metricsFileWriter.close();
			
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
