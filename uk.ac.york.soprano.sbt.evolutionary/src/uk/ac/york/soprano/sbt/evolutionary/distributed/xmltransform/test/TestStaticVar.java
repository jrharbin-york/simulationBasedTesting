package uk.ac.york.soprano.sbt.evolutionary.distributed.xmltransform.test;

import java.util.Random;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackageFactory;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ContainerDependency;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.DistributedExecutionStrategy;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionFactory;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.DoubleRange;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperationsFactory;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.RandomValueFromSetOperation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackageFactory;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.StaticVariable;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.XMLConfigLocation;
import uk.ac.york.soprano.sbt.evolutionary.SESAMETestSolution;
import uk.ac.york.soprano.sbt.evolutionary.distributed.RemoteTest;
import uk.ac.york.soprano.sbt.evolutionary.distributed.SOPRANODistributedExperiment;
import uk.ac.york.soprano.sbt.evolutionary.utilities.temp.SESAMEModelLoader;

public class TestStaticVar {
	public static void main(String [] args) {
		TestingPackageFactory tf = TestingPackageFactory.eINSTANCE;
		FuzzingOperationsFactory ff = FuzzingOperationsFactory.eINSTANCE;
		ExecutionFactory ef = ExecutionFactory.eINSTANCE;
		MRSPackageFactory mf = MRSPackageFactory.eINSTANCE;
		
		RandomValueFromSetOperation rvf = ff.createRandomValueFromSetOperation();
		StaticVariable sv = mf.createStaticVariable();
		XMLConfigLocation l = mf.createXMLConfigLocation();
		ContainerDependency cd = ef.createContainerDependency();
		cd.setImageName("cuda_v6_fixedscript");
		l.setFileName("/home/user/sesame_ws/install/share/pal_gazebo_worlds/worlds/pal_kitchen.world");
		l.setXpathExpression("/sdf/world/physics/max_step_size");
		l.setRoot(cd);
		
		sv.setName("TEST");
		sv.getLocations().add(l);
		
		rvf.setVariableToAffect(sv);
		
		DoubleRange rvfInfo = ff.createDoubleRange();
		rvfInfo.setLowerBound(0.0);
		rvfInfo.setUpperBound(10.0);
		
		rvf.getValueSet().add(rvfInfo);
		
		MRS mrs = null;
		
		TestCampaign tc = tf.createTestCampaign();
						
		SESAMETestSolution sol = new SESAMETestSolution(tc);
		sol.getInternalType().getOperations().add(rvf);
		
		SESAMEModelLoader loader = new SESAMEModelLoader("/tmp/test.model");
		DistributedExecutionStrategy distExec = ef.createDistributedExecutionStrategy();
		
		// These params are not needed since not doing real code generation
		SOPRANODistributedExperiment distributedExpt = new SOPRANODistributedExperiment(tc, distExec, loader, "", "", mrs);
				
		System.out.println("Running test");
		RemoteTest rt = new RemoteTest("Test_001", distributedExpt, sol);
		
		Random rng = new Random();
		rt.handleStaticFuzzingForTest(rng);
	}
}
