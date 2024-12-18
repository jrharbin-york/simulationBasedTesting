package uk.ac.york.soprano.sbt.evolutionary.distributed.remapping.test;

import org.eclipse.emf.common.util.EList;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackageFactory;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ContainerDependency;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.DistributedExecutionStrategy;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionFactory;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperationsFactory;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.RandomValueFromSetOperation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.EventBasedVariable;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackageFactory;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ROSSimulator;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ROSVariableConfiguration;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.SimVariableConfiguration;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.XMLConfigLocation;
import uk.ac.york.soprano.sbt.evolutionary.SESAMETestSolution;
import uk.ac.york.soprano.sbt.evolutionary.distributed.RemoteTest;
import uk.ac.york.soprano.sbt.evolutionary.distributed.SOPRANODistributedExperiment;
import uk.ac.york.soprano.sbt.evolutionary.utilities.temp.SESAMEModelLoader;

public class RemappingTest {

	public static void main(String[] args) throws InterruptedException {
		TestingPackageFactory tf = TestingPackageFactory.eINSTANCE;
		FuzzingOperationsFactory ff = FuzzingOperationsFactory.eINSTANCE;
		ExecutionFactory ef = ExecutionFactory.eINSTANCE;
		MRSPackageFactory mf = MRSPackageFactory.eINSTANCE;
		
		MRS mrs = mf.createMRS();
		ROSSimulator rsim = mf.createROSSimulator();
		mrs.setSimulator(rsim);

		
		RandomValueFromSetOperation rvf = ff.createRandomValueFromSetOperation();
		rvf.setName("/pmb2_1/scan_raw");
		
		EventBasedVariable ev = mf.createEventBasedVariable();
		XMLConfigLocation l = mf.createXMLConfigLocation();
		ContainerDependency cd = ef.createContainerDependency();
		
		ROSVariableConfiguration rosvc = mf.createROSVariableConfiguration();
		rosvc.setVar(ev);
		rosvc.setLaunchFileloc(l);
		
		EList<SimVariableConfiguration> svcs = rsim.getVarConfigs();
		svcs.add(rosvc);
		
		rvf.setVariableToAffect(ev);
		rsim.setSimulationDependency(cd);
		cd.setImageName("cuda_v6_fixedscript");
		
		l.setFileName("/opt/pal/gallium/share/pmb2_2dnav_gazebo/launch/navigation.launch");
		l.setXpathExpression("/launch/node[@name='laser_filter']/remap[@from='scan']/@to");
		l.setRoot(cd);
		
		ev.setName("TEST");
		rvf.setVariableToAffect(ev);
		
		TestCampaign tc = tf.createTestCampaign();
						
		SESAMETestSolution sol = new SESAMETestSolution(tc);
		sol.getInternalType().getOperations().add(rvf);
		
		SESAMEModelLoader loader = new SESAMEModelLoader("/tmp/test.model");
		DistributedExecutionStrategy distExec = ef.createDistributedExecutionStrategy();
		
		// These params are not needed since not doing real code generation
		SOPRANODistributedExperiment distributedExpt = new SOPRANODistributedExperiment(tc, distExec, loader, "", "", mrs);
				
		System.out.println("Running test for remapping");
		RemoteTest rt = new RemoteTest("Test_001", distributedExpt, sol);
		rt.ensureRemappingsForTest();
	}
}