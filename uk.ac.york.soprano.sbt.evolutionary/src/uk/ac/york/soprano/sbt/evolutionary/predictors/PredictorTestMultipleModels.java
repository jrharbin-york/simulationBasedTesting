package uk.ac.york.soprano.sbt.evolutionary.predictors;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;

import tech.tablesaw.api.Table;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FixedTimeActivation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.MetricInstance;
import uk.ac.york.soprano.sbt.evolutionary.utilities.temp.SESAMEModelLoader;

public class PredictorTestMultipleModels {
	private static final int NEW_DATA_PER_ORIG = 4;
	private static Random rng = new Random();

	public static int convertToMultipleCSVSInDir(Test t, File baseDirPath, String filePrefix, double timeLength) {
		try {
			if (!baseDirPath.exists()) {
				baseDirPath.mkdirs();
			}

			if (filePrefix.length() > 0) {
				filePrefix = filePrefix + "-";
			}

			String csvFileName = t.getName() + ".csv";

			// Augment the data by converting values
			for (int i = 0; i < NEW_DATA_PER_ORIG; i++) {
				List<FuzzingOperation> ops = (List<FuzzingOperation>) EcoreUtil.copyAll(t.getOperations());
				FuzzingTestConversion ftc = new FuzzingTestConversion(t);
				
				double MAX_DOSATTACK_LEN = 50.0;
				double EARLY_SAFE_ZONE = 50.0;
				
				// Modify the operations here
				if (i == 1) {
					// Change the time length of the DOS attack to a fixed integer num
					Optional<FuzzingOperation> dosAttack_o = findOperationByName(ops, "dosAttackTrigger");
					if (dosAttack_o.isPresent()) {
						FuzzingOperation dosAttack = dosAttack_o.get();
						FuzzingOperation dosNew = EcoreUtil.copy(dosAttack);
						if (dosNew.getActivation() instanceof FixedTimeActivation) {
							FixedTimeActivation a = (FixedTimeActivation) dosNew.getActivation();
							double len = rng.nextDouble() * MAX_DOSATTACK_LEN;
							a.setEndTime(a.getStartTime() + (int)len);
							ops.remove(dosAttack);
							ops.add(dosNew);
						}
					}
				}

				if (i > 2) {
					Optional<FuzzingOperation> notDosAttack_o = findOperationNotNamed(ops, "dosAttackTrigger");
					if (notDosAttack_o.isPresent()) {
						FuzzingOperation notDosAttack = notDosAttack_o.get();
						// Add additional new transformations at the start - before 50 seconds
						FuzzingOperation opNew = EcoreUtil.copy(notDosAttack);
						if (opNew.getActivation() instanceof FixedTimeActivation) {
							FixedTimeActivation a = (FixedTimeActivation) opNew.getActivation();
							double time1 = rng.nextDouble() * EARLY_SAFE_ZONE;
							double time2 = rng.nextDouble() * EARLY_SAFE_ZONE;
							double startTime = Math.min(time1, time2);
							double endTime = Math.max(time1, time2);
							a.setStartTime(startTime);
							a.setEndTime(endTime);
							ops.add(opNew);
						}
					}
				}

				File outFile = new File(baseDirPath.getAbsolutePath() + File.separator + filePrefix + csvFileName
						+ Integer.toString(i));
				Table converted = ftc.convert(ops);
				ftc.saveTableToCSV(converted, outFile);
			}
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
		return NEW_DATA_PER_ORIG;
	}

	private static Optional<FuzzingOperation> findOperationNotNamed(List<FuzzingOperation> ops, String name) {
		double prob = 1.0 / (double) (ops.size() - 1);
		for (FuzzingOperation op : ops) {
			if (!op.getFromTemplate().getName().equals(name)) {
				double v = rng.nextDouble();
				if (v < prob) {
					return Optional.of(op);
				}
			}
		}
		return Optional.empty();
	}

	private static Optional<FuzzingOperation> findOperationByName(List<FuzzingOperation> ops, String name) {
		// TODO Auto-generated method stub
		for (FuzzingOperation op : ops) {
			if (op.getFromTemplate().getName().equals(name)) {
				return Optional.of(op);
			}
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

		List<String> modelFiles = new ArrayList<String>();
		modelFiles.add(
				"/home/simtesting/simtesting/simulationBasedTesting/uk.ac.york.sesame.testing.evolutionary/src/uk/ac/york/sesame/testing/evolutionary/predictors/testmodel/TestingPAL-coverage_2024_07_08.model");
		modelFiles.add(
				"/home/simtesting/simtesting/simulationBasedTesting/uk.ac.york.sesame.testing.evolutionary/src/uk/ac/york/sesame/testing/evolutionary/predictors/testmodel/TestingPAL-coverage_2024_07_15.model");
		modelFiles.add(
				"/home/simtesting/simtesting/simulationBasedTesting/uk.ac.york.sesame.testing.evolutionary/src/uk/ac/york/sesame/testing/evolutionary/predictors/testmodel/TestingPAL-coverage_2024_07_22.model");
		modelFiles.add(
				"/home/simtesting/simtesting/simulationBasedTesting/uk.ac.york.sesame.testing.evolutionary/src/uk/ac/york/sesame/testing/evolutionary/predictors/testmodel/TestingPAL-coverage_2024_07_29.model");
		String campaignName = "scenario2-eddi-timebased-faults-coverage";
		String outputDirName = "/home/simtesting/academic/soprano/SPWorkerTemp/notebooks/predictor/temp-data-400-objectsdelivered-multi";
		String testTrainLimit_s = "1200";
		String targetMetricName = "M1_countObjectsDelivered";

		// String modelFile =
		// "/home/simtesting/simtesting/simulationBasedTesting/uk.ac.york.sesame.testing.evolutionary/src/uk/ac/york/sesame/testing/evolutionary/predictors/testmodel/TestingPAL-coverage_2024_07_15.model";
		// String campaignName = "scenario2-eddi-timebased-faults-coverage";
		String outputDirTrain = outputDirName + "/train/";
		String outputDirTest = outputDirName + "/test/";
		// String resultSetName = "NONDOM-18_01_2024_11_12_20-intermediate-64";

		// String targetMetricName = "M1_countObjectsMissed";

		File baseDirectoryTrain = new File(outputDirTrain);
		File baseDirectoryTest = new File(outputDirTest);

		File metricsTrainFile = new File(outputDirName + "/metrics-train.csv");
		File metricsTestFile = new File(outputDirName + "/metrics-test.csv");

		try {
			FileWriter metricsTrainFileWriter = new FileWriter(metricsTrainFile);
			FileWriter metricsTestFileWriter = new FileWriter(metricsTestFile);
			metricsTrainFileWriter.write(targetMetricName + "\n");
			metricsTestFileWriter.write(targetMetricName + "\n");

			int testTrainLimit = Integer.parseInt(testTrainLimit_s);
			int testCount = 0;

			for (String modelFile : modelFiles) {
				String modelFileNameInDir = new File(modelFile).getName();
				SESAMEModelLoader loader = new SESAMEModelLoader(modelFile);
				Resource model = loader.loadTestingSpace();
				//TestingSpace testingSpace = loader.getTestingSpace(model);
				Optional<TestCampaign> testCampaign_o = loader.getTestCampaign(model, campaignName);

				if (testCampaign_o.isPresent()) {
					TestCampaign tc = testCampaign_o.get();
					List<Test> allTestsInCampaign = tc.getPerformedTests();
					for (Test t : allTestsInCampaign) {
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
								System.out.println("Processing test to CSV file " + t.getName() + " under dir "
										+ dir.getAbsolutePath());
								int testsProduced = convertToMultipleCSVSInDir(t, dir, modelFileNameInDir, 500);
								// Since multiple tests have the same metric
								for (int i = 0; i < testsProduced; i++) {
									metricFileW.write(mv.toString() + "\n");
								}
							} else {
								System.err.println("SKIPPING test " + t.getName() + " failed/outlier metric value - "
										+ t.getName());
							}
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
