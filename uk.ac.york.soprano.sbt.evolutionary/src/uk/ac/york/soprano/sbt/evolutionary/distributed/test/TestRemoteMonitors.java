package uk.ac.york.soprano.sbt.evolutionary.distributed.test;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackageFactory;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.DistributedExecutionStrategy;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionFactory;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperationsFactory;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackageFactory;
import uk.ac.york.soprano.sbt.evolutionary.InvalidTestCampaign;
import uk.ac.york.soprano.sbt.evolutionary.SESAMETestSolution;
import uk.ac.york.soprano.sbt.evolutionary.distributed.RemoteStatusMonitor;
import uk.ac.york.soprano.sbt.evolutionary.distributed.RemoteTest;
import uk.ac.york.soprano.sbt.evolutionary.distributed.SOPRANODistributedExperiment;
import uk.ac.york.soprano.sbt.evolutionary.distributed.SOPRANOExperimentManager;
import uk.ac.york.soprano.sbt.evolutionary.distributed.UnknownWorker;
import uk.ac.york.soprano.sbt.evolutionary.distributed.WorkerNode;
import uk.ac.york.soprano.sbt.evolutionary.utilities.temp.SESAMEModelLoader;

public class TestRemoteMonitors {

	static TestingPackageFactory tf = TestingPackageFactory.eINSTANCE;
	FuzzingOperationsFactory ff = FuzzingOperationsFactory.eINSTANCE;
	static ExecutionFactory ef = ExecutionFactory.eINSTANCE;
	MRSPackageFactory mf = MRSPackageFactory.eINSTANCE;

	private static final int WORKER_COUNT = 100;
	private static SOPRANOExperimentManager manager = null;
	private static WorkerNode remoteWorker;
	private static TestCampaign tc = tf.createTestCampaign();
	private static SESAMEModelLoader loader = new SESAMEModelLoader("/tmp/test.model");
	private static DistributedExecutionStrategy distExec = ef.createDistributedExecutionStrategy();
	// These params are not needed since not doing code generation
	private static MRS mrs = null;
	private static SOPRANODistributedExperiment distributedExpt = new SOPRANODistributedExperiment(tc, distExec, loader,
			"", "", mrs);

	public static void createMonitor(int count) {
		try {
			remoteWorker = new WorkerNode("192.168.1.238");

			System.out.println("Creating monitor " + count);
			// RemoteTest(String testID, SOPRANODistributedExperiment expt,
			// SESAMETestSolution solution)
			String testID = "test" + Integer.toString(count);

			SESAMETestSolution sol = new SESAMETestSolution(tc);
			RemoteTest remoteTest = new RemoteTest(testID, distributedExpt, sol);
			// Run ID doesn't matter in this test
			remoteTest.registerRunID("eijrujuewuehuuhhueuh");
			RemoteStatusMonitor rsm = new RemoteStatusMonitor(manager, remoteTest, remoteWorker);
			rsm.start();

		} catch (UnknownWorker e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidTestCampaign e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		for (int i = 0; i < WORKER_COUNT; i++) {
			createMonitor(i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
