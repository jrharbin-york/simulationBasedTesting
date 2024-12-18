package uk.ac.york.soprano.sbt.evolutionary.distributed;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;

import org.eclipse.emf.common.util.EList;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.GenericVariable;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.SimVariableConfiguration;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Simulator;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.StaticVariable;
import uk.ac.york.soprano.sbt.evolutionary.SESAMETestSolution;
import uk.ac.york.soprano.sbt.evolutionary.distributed.accessors.TempFileCreationFailed;
import uk.ac.york.soprano.sbt.evolutionary.distributed.remapping.*;
import uk.ac.york.soprano.sbt.evolutionary.distributed.remapping.transformers.ConfigTransformer;
import uk.ac.york.soprano.sbt.evolutionary.distributed.remapping.transformers.ConfigTransformerFactory;
import uk.ac.york.soprano.sbt.evolutionary.distributed.remapping.transformers.XPathLookupFailure;
import uk.ac.york.soprano.sbt.evolutionary.distributed.staticvariables.InvalidExecutorForOperation;
import uk.ac.york.soprano.sbt.evolutionary.distributed.staticvariables.InvalidTransformerForVariable;
import uk.ac.york.soprano.sbt.evolutionary.distributed.staticvariables.StaticOperationExecutoryFactory;
import uk.ac.york.soprano.sbt.evolutionary.distributed.staticvariables.TransformFailed;
import uk.ac.york.soprano.sbt.evolutionary.distributed.staticvariables.operationexecutors.OperationExecutor;
import uk.ac.york.soprano.sbt.evolutionary.dslwrapper.FuzzingOperationWrapper;
import uk.ac.york.soprano.sbt.evolutionary.dslwrapper.InvalidFuzzingOperation;
import uk.ac.york.soprano.sbt.evolutionary.utilities.MissingPropertiesFile;
import uk.ac.york.soprano.sbt.evolutionary.utilities.MissingProperty;

public class RemoteTest implements Comparable<RemoteTest> {
	private static final boolean REMAP_ALL_VARIABLES = false;
	private String testID;
	private SOPRANODistributedExperiment expt;
	private TestStatus status = TestStatus.RUNNING;
	private SESAMETestSolution solution;
	
	private Optional<String> testRunUUID;
	
	public RemoteTest(String testID, SOPRANODistributedExperiment expt, SESAMETestSolution solution) {
		this.testID = testID;
		this.expt = expt;
		this.solution = solution;
	}
	
	public static RemoteTest fromSolution(SESAMETestSolution s, SOPRANODistributedExperiment expt) {
		String testID = s.getInternalType().getName();
		return new RemoteTest(testID, expt, s);
	}

	public String getTestID() {
		return testID;
	}

	public void registerRunID(String testRunID) {
		// TODO Auto-generated method stub
		this.testRunUUID = Optional.of(testRunID);	
	}
	
	public void ensureRemappingsForTest() {
		// Need to get the MRS information to find out what type of simulation is used in this model
		MRS mrs = expt.getMRS();
		Simulator sim = mrs.getSimulator();
		EList<SimVariableConfiguration> svc = sim.getVarConfigs();
		SimulationRemapperFactory srFactory = new SimulationRemapperFactory();
		try {
			SimulationRemapper sr = srFactory.createRemapping(sim);
			for (SimVariableConfiguration sv : svc) {
				// Test if the model contains this variable in any fuzzing operations
				// or if we should include it anyway...
				boolean shouldInclude = REMAP_ALL_VARIABLES || operationsContainVariable(sv);
				if (shouldInclude) {
					System.out.println("Performing remapping for dynamic variable " + sv.getVar().getName());
					sr.performRemappingForVariable(this, sv);
				} else {
					System.out.println("Skipping remapping for dynamic variable " + sv.getVar().getName());
				}
			}
		} catch (SimulationTypeNotRecognisedForRemapping e) {
			e.printStackTrace();
		} catch (InvalidSimulatorVariableType e) {
			e.printStackTrace();
		} catch (InvalidTransformerForVariable e) {
			e.printStackTrace();
		} catch (TransformFailed e) {
			e.printStackTrace();
		} catch (XPathLookupFailure e) {
			e.printStackTrace();
		}
	}
	
	private boolean operationsContainVariable(SimVariableConfiguration sv) {
		// TODO Scan the model and determine if it contains the given variable
		return false;
	}

	public synchronized void handleStaticFuzzingForTest(Random rng) {
		ConfigTransformerFactory ctFactory = new ConfigTransformerFactory();
		StaticOperationExecutoryFactory soFactory = new StaticOperationExecutoryFactory();
	
		try {
		SESAMETestSolution sol = this.getSolution();
		// For all fuzzing operations, find the static variables
		List<FuzzingOperation> staticOps = sol.getAllStaticOperations();
		
		// Use a map which overrides file locations with raw file names (of the temporary file)
		// This is so multiple modifications of the same input file can be applied sequentially
		// Otherwise, each modification would be on a fresh copy of the file from Docker, 
		// and only the last would be applied
		
		// The key is <IMAGE-NAME>-<FILE_NAME>
		Map<String,String> fileLocationOverrides = new HashMap<String,String>();
		
		for (FuzzingOperation op : staticOps) {
			FuzzingOperationWrapper wrop = new FuzzingOperationWrapper(op);
			Optional<GenericVariable> gv_o = wrop.getVariableToAffect();

			// This verifies that all operations processed are static
			if ((gv_o.isPresent()) && (gv_o.get() instanceof StaticVariable)) {
				GenericVariable gv = gv_o.get();
				StaticVariable sv = (StaticVariable)gv;
				List<ConfigTransformer> tfs = ctFactory.createTransformers(this, sv, fileLocationOverrides);
				// When there are multiple locations for a variable, we store the first modified object
				// so we can ensure later locations can be set to the same value
				Optional<Object> lastModified = Optional.empty();
				for (ConfigTransformer tf : tfs) {
					OperationExecutor exec = soFactory.createOperationExecutor(op);
					// TODO: should be storing the last modified variables in a map here
					// lastModified may not be relevant to this variable here
					lastModified = tf.transform(rng, exec, lastModified);
				}
				sv.getLocations();
			} else {
				System.err.println("handleStaticFuzzingForTest: missing variable or not a static variable - " + gv_o.toString());
				System.exit(-1);
			}
		}
		} catch (InvalidTransformerForVariable e) {
			e.printStackTrace();
		} catch (InvalidExecutorForOperation e) {
			e.printStackTrace();
		} catch (TransformFailed e) {
			e.printStackTrace();
		} catch (InvalidFuzzingOperation e) {
			e.printStackTrace();
		} catch (XPathLookupFailure e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MissingProperty e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MissingPropertiesFile e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TempFileCreationFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Optional<String> getRunUUID() {
		return testRunUUID;
	}

	public int compareTo(RemoteTest other) {
		return testID.compareTo(other.testID);
	}

	public void setStatus(TestStatus testStatus) {
		this.status = testStatus;
	}
	
	public boolean isStillRunning() {
		return (this.status == TestStatus.RUNNING);
	}
	
	public SESAMETestSolution getSolution() {
		return solution;
	}


}
