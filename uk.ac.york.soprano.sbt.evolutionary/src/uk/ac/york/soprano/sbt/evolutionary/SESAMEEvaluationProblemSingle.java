package uk.ac.york.soprano.sbt.evolutionary;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.TopicPartition;
import org.apache.kafka.common.serialization.LongDeserializer;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;

import uk.ac.york.soprano.sbt.architecture.data.ControlMessage;
import uk.ac.york.soprano.sbt.architecture.data.MetricMessage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.ExecutionEndTrigger;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingSpace;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TimeBasedEnd;
import uk.ac.york.soprano.sbt.evolutionary.utilities.MissingPropertiesFile;
import uk.ac.york.soprano.sbt.evolutionary.utilities.MissingProperty;
import uk.ac.york.soprano.sbt.evolutionary.utilities.SESAMEEGLExecutor;
import uk.ac.york.soprano.sbt.evolutionary.utilities.TestRunnerUtils;
import uk.ac.york.soprano.sbt.evolutionary.utilities.temp.SESAMEModelLoader;

public class SESAMEEvaluationProblemSingle extends SESAMEEvaluationProblemBase {

	private static final long serialVersionUID = 1L;
	
	private KafkaMetricConsumer metricConsumer;
	private ControlProducer controlProducer;
	
	private String spaceModelFileName;
	private String campaignName;
	private String orchestratorBasePath;

	private SESAMEEGLExecutor eglEx;
	private String codeGenerationDirectory;
	
    private static final boolean DEBUG_ACTUALLY_GENERATE_EGL = true;
	
	// Disable for debug run/fake metrics
	private static final boolean DEBUG_ACTUALLY_RUN = false;
	private static final boolean DUMMY_EVAL = !DEBUG_ACTUALLY_RUN;
	

	
	private static final boolean RECORD_ROSBAG = true;

	private static final long DEFAULT_HARDCODED_DELAY = 100;
	
	private static final double FIXED_WORST_CASE_END_TIME = 1000.0;
	
	private static final long DEFAULT_KILL_DELAY = 5;
	private static final long DEFAULT_DELAY_BETWEEN_TERMINATE_SCRIPTS = 5;
	private static final long DEFAULT_WAIT_FOR_FINALISE_DELAY = 5;
	private static final long DEFAULT_MODEL_SAVING_DELAY = 3;
	private static final double MODEL_SAVING_DELAY_IN_DEBUG_MODE = 0.5;
	
	private static final boolean USE_METRIC_TIME_END_TIME = true;

	private static final boolean TERMINATE_EXECUTION_ON_MISSING_PROPERTY = true;
	
	public SESAMEEvaluationProblemSingle(String orchestratorBasePath, SESAMEModelLoader loader,
			String spaceModelFileName, Resource testSpaceModel, TestingSpace testingSpace,
			Optional<TestCampaign> testCampaign_o, String codeGenerationDirectory, boolean conditionBased,
			int conditionDepth, String grammarPath) throws EolModelLoadingException, InvalidTestCampaign, StreamSetupFailed, MissingGrammarFile {
		super(orchestratorBasePath, loader,	spaceModelFileName, testSpaceModel, testingSpace, testCampaign_o, codeGenerationDirectory, conditionBased,	conditionDepth, grammarPath);
	
		this.codeGenerationDirectory = codeGenerationDirectory;
		this.orchestratorBasePath = orchestratorBasePath;
		this.spaceModelFileName = spaceModelFileName;
		

	setupMetricListener(selectedCampaign);
	setupControlProducer();
	condGenerator = new ConditionGenerator(grammarPath, selectedCampaign, conditionDepth);
	}
	
	private void setupMetricListener(TestCampaign campaign) throws StreamSetupFailed, InvalidTestCampaign {
		
		// TODO: move these properties - except for the bootstrap.servers: into the Consumer
		Properties properties = new Properties();
		properties.setProperty("bootstrap.servers", "localhost:9092");
		properties.setProperty("group.id", "test");
		properties.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, LongDeserializer.class.getName());
		properties.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, MetricMessage.class.getName());


		List<TopicPartition> parts = new ArrayList<TopicPartition>();
		metricConsumer = new KafkaMetricConsumer(campaign, properties, parts);
		Thread t = new Thread(metricConsumer);
		t.start();
	}


	
	private void setupControlProducer() {
		controlProducer = new ControlProducer();
	}
	
	public void performSESAMETest(SESAMETestSolution solution) {
		// For distributed, this needs to be wrapped and provided as a solution
				
		try {
			String mainClassName = solution.getMainClassName();

			metricConsumer.setSolution(solution);

			System.out.println("Running test for " + solution);
			// This ensures that the new test is installed in the model
			
			solution.setOperationSequenceNums();
			
			solution.ensureModelUpdated(selectedCampaign);
			loader.saveTestingSpace();
			// THIS is a temporary change to test if caching is causing the model to be stale for EGL??? 
			//String novelModelFile = "/tmp/testingspace-updated-after-" + mainClassName + ".model";
			//loader.saveTestingSpaceToNewFile(novelModelFile);
			System.out.println("Model updated");
			
			System.out.print("Waiting to begin code generation...");
			System.out.flush();
			
			if (DEBUG_ACTUALLY_GENERATE_EGL) { 
				TestRunnerUtils.waitForSeconds(DEFAULT_MODEL_SAVING_DELAY);
			} else {
				TestRunnerUtils.waitForSeconds(MODEL_SAVING_DELAY_IN_DEBUG_MODE);
			}
			
			if (DEBUG_ACTUALLY_GENERATE_EGL) {
				// This transform the testing space model into code - by invoking EGX/EGL
				// The MRS model file is currently redundant due to the temporary approach of merging the models
				String __mrsModelFile = "testingMRS.model";
				eglEx = new SESAMEEGLExecutor(orchestratorBasePath, spaceModelFileName, __mrsModelFile, campaignName, codeGenerationDirectory);
				eglEx.run();
			}
			
			System.out.println("code generation done");

			if (DEBUG_ACTUALLY_RUN) {
				// Invoke maven script to ensure that the project is rebuilt
				TestRunnerUtils.compileProject(codeGenerationDirectory);
				
				System.out.println("Compilation completed");

				// Invokes the main method for this code
				System.out.print("Launching test runner for " + mainClassName + "... (classpath " + codeGenerationDirectory + ")");
				System.out.flush();
				TestRunnerUtils.exec(mainClassName, codeGenerationDirectory);
				System.out.println("Testrunner " + mainClassName + " launched");		
				System.out.flush();
										
				if (RECORD_ROSBAG) {
					Optional<String> recordLauncherFile_o = getRecordLocationForMRS();
					if (recordLauncherFile_o.isPresent()) {
						String recordLauncherFile = recordLauncherFile_o.get();				
						// TODO: this should be generalised so it is either specified in the
						// 	model or the recording is based on the simulation type
						System.out.println("Rosbag recording started via " + recordLauncherFile + "...");
						TestRunnerUtils.recordSim(recordLauncherFile, solution.getName());
						System.out.flush();
					}
				}
				
				System.out.flush();
				
				// Need to wait for simulation completion here...
				// If no trigger specified specifically for this test, use the default for the
				// campaign
				ExecutionEndTrigger et;
				long waitTimeSeconds = DEFAULT_HARDCODED_DELAY;
				et = selectedCampaign.getEndTrigger();

				// Wait for the time given in the model under the test
				if (et instanceof TimeBasedEnd) {
					waitTimeSeconds = ((TimeBasedEnd)et).getTimeLimitSeconds();
					System.out.print("Using selected fixed time delay...");		
					System.out.flush();
				} else {
					System.out.print("Using hardcoded delay...");
				}
				
				if (!USE_METRIC_TIME_END_TIME) {
					waitTimeSeconds = waitTimeSeconds - DEFAULT_WAIT_FOR_FINALISE_DELAY;
					metricConsumer.setLastValidTimestamp(waitTimeSeconds);
					System.out.print("Waiting " + waitTimeSeconds + " seconds...");
					TestRunnerUtils.waitForSeconds(waitTimeSeconds);
					System.out.println("done");
				} else {
				    double WORST_CASE_END_TIME = Math.max(waitTimeSeconds * 2, FIXED_WORST_CASE_END_TIME);
				    metricConsumer.setLastValidTimestamp(waitTimeSeconds);
				   waitUntilMetricTime(metricConsumer, waitTimeSeconds, WORST_CASE_END_TIME);
				}

				// Send the end of simulation message
				// TODO: for now the end of simulation message is used for both
				// time tracking and start-end tracking
				controlProducer.send(ControlMessage.CONTROL_COMMAND.END_SIMULATION);
				// Send the time tracking message
				//controlProducer.send(ControlMessage.CONTROL_COMMAND.GET_OPERATION_RECORDED_TIMINGS);
				metricConsumer.notifyFinalise();
				System.out.print("Finalising: Waiting for metrics to come back from test runner " + waitTimeSeconds + " seconds...");
				TestRunnerUtils.waitForSeconds(DEFAULT_WAIT_FOR_FINALISE_DELAY);
				System.out.println("done");
				
				// Ensure that the model is updated with the metric results
				metricConsumer.finaliseUpdates();				

				String customTerminateScript = mrs.getCustomTerminateFileLocation();
				if (customTerminateScript != null) {
					System.out.println("Running custom termination script " + customTerminateScript);
					TestRunnerUtils.runCustomTerminateScript(customTerminateScript);
					TestRunnerUtils.waitForSeconds(DEFAULT_DELAY_BETWEEN_TERMINATE_SCRIPTS);
				}
				
				System.out.println("Running standard termination script");
				TestRunnerUtils.killProcesses();
				
				TestRunnerUtils.clearKafka();
				System.out.print("Waiting for simulation processes to be killed...");
				System.out.flush();
				TestRunnerUtils.waitForSeconds(DEFAULT_KILL_DELAY);
				System.out.print("done");
				
				metricConsumer.clearTopic();

			}

			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("Probably a metric returned something non-numeric");
			e.printStackTrace();
		} catch (MissingProperty mp) {
			mp.printStackTrace();
			
			// Assuming we should exit on a missing property
			if (TERMINATE_EXECUTION_ON_MISSING_PROPERTY) {
				System.err.println("Exiting due to missing property in properties file " + mp.getKey());
				System.exit(-1);
			}
		} catch (MissingPropertiesFile mpf) {
			// TODO Auto-generated catch block
			mpf.printStackTrace();
			if (TERMINATE_EXECUTION_ON_MISSING_PROPERTY) {
				System.err.println("Exiting due to missing properties file at " + mpf.getExpectedLocationPath());
				System.exit(-1);
			}
		}
	}
	

	
	private void dummyEval(SESAMETestSolution solution) {
		int metricCount = selectedCampaign.getMetrics().size();
		for (int i = 0; i < metricCount; i++) {
			double v = rng.nextDouble();
			System.out.println("Dummy evaluation of solution " + solution + " - metric " + i + " is " + v);
			solution.setObjective(i, v);
		}
		
		solution.setOperationSequenceNums();
		solution.ensureModelUpdated(selectedCampaign); 
		loader.saveTestingSpace();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void evaluate(SESAMETestSolution solution) {
		if (!DUMMY_EVAL) {
			performSESAMETest(solution);
		} else {	
			dummyEval(solution);
		}
	}
	
	public void shutDownMetricListener() {
		metricConsumer.close();
	}
}
