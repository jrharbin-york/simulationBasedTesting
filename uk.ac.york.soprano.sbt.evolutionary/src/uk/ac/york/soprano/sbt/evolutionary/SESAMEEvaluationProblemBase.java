package uk.ac.york.soprano.sbt.evolutionary;

import java.security.SecureRandom;
import java.util.Optional;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.uma.jmetal.problem.Problem;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingSpace;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.*;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS;
import uk.ac.york.soprano.sbt.evolutionary.dslwrapper.*;
import uk.ac.york.soprano.sbt.evolutionary.grammar.ConversionFailed;
import uk.ac.york.soprano.sbt.evolutionary.utilities.temp.SESAMEModelLoader;

public abstract class SESAMEEvaluationProblemBase implements Problem<SESAMETestSolution> {

	private static final long serialVersionUID = 1L;

	protected SESAMEModelLoader loader;

	private static final boolean INITIAL_OPERATION_RANDOM_SEED = true;

	final double INCLUDE_FuzzingOperation_PROB = 0.5;

	private boolean conditionBased;

	protected SecureRandom rng;

	private int variableFixedSize;
	private int constraintCount = 0;

	protected ConditionGenerator condGenerator;
	protected TestCampaign selectedCampaign;
	protected MRS mrs;

	public SESAMEEvaluationProblemBase(String orchestratorBasePath, SESAMEModelLoader loader, String spaceModelFileName,
			Resource testingSpaceModel, TestingSpace testingSpace, Optional<TestCampaign> tc_o,
			String codeGenerationDirectory, boolean conditionBased, int conditionDepth, String grammarPath)
			throws InvalidTestCampaign, StreamSetupFailed, EolModelLoadingException, MissingGrammarFile {

		// TODO: mrsModelFile is not currently used - until the bug is fixed and there
		// is a separate model again
		// String __mrsModelFile = "testingMRS.model";
		// eglEx = new SESAMEEGLExecutor(spaceModelFileName, __mrsModelFile,
		// campaignName, codeGenerationDirectory);
		mrs = testingSpace.getMrs();

		// TODO: initializing this rng properly for repeatable experiments
		rng = new SecureRandom();
		this.loader = loader;

		if (tc_o.isPresent()) {
			selectedCampaign = tc_o.get();
			condGenerator = new ConditionGenerator(grammarPath, selectedCampaign, conditionDepth);
		} else {
			throw new InvalidTestCampaign();
		}
	}

	public TestCampaign getCampaign() {
		return selectedCampaign;
	}

	public ConditionGenerator getCondGenerator() {
		return condGenerator;
	}

	public int getNumberOfVariables() {
		return variableFixedSize;
	}

	// TODO: this should be a method upon TestCampaign when it is figured out how
	// to create them with the genmodel
	public int getNumberOfMetricsInTestCampaign(TestCampaign tc) {
		return (int) tc.getMetrics().stream().filter(m -> m.isUseInOptimisation()).count();
	}

	public int getNumberOfObjectives() {
		return getNumberOfMetricsInTestCampaign(selectedCampaign);
	}

	public int getNumberOfConstraints() {
		return constraintCount;
	}

	public String getName() {
		return "SESAMEEvaluationProblem";
	}

	// TODO: this should be used for the distributed runner as well?
	protected void waitUntilMetricTime(MetricConsumerBase metricConsumer, double waitTime,
			double worstCaseTimeSeconds) {
		long worstCaseEndTime = System.currentTimeMillis() + (long) ((double) worstCaseTimeSeconds * 1000);
		boolean metricDone = false;
		while (!metricDone && (System.currentTimeMillis() < worstCaseEndTime)) {
			try {
				Thread.sleep(500);

			} catch (InterruptedException e) {
			}

			double metricTime = metricConsumer.getTimestamp();
			System.out.print(".");
			metricDone = (metricTime > waitTime);
		}

		if (metricDone) {
			System.out.println("Done");
		} else {
			System.out.println("Ending due to no response at worst case cutoff time");
		}
	}

	protected Optional<String> getRecordLocationForMRS() {
		if (mrs != null && mrs.getRecordFileLocation() != null) {
			return Optional.of(mrs.getRecordFileLocation());
		} else {
			return Optional.empty();
		}
	}

	public boolean shouldIncludeFuzzingOperation(FuzzingOperation a) {
		double prob = a.getInclusionProbability();
		double v = rng.nextDouble();
		return (v < prob);
	}

	private void addSingleOperationFromTemplate(FuzzingOperation opTemplate, SESAMETestSolution sol) {
			// FuzzingOperations produced as a "subset" of each of the selected FuzzingOperations
			// TODO: this should be configurable somehow by setting parameters on the Factory

			try {
				FuzzingOperationWrapperFactory wf;
				if (conditionBased) {
					wf = new ConditionBasedWrapperFactory(condGenerator);
				} else {
					wf = new FuzzingOperationWrapperFactory();
                }

				FuzzingOperationWrapper templateOpWrapped = wf.createFromDSLObject(opTemplate);
				FuzzingOperationWrapper genOpWrapped = templateOpWrapped.reductionOfOperation(rng);
				
				// Ensure the from template reference is set to reflect the origin of the object
				genOpWrapped.getFuzzingOperation().setFromTemplate(opTemplate);
								
				// Now seeds are going to be set explicitly 
				// TODO: if mutating and want to increase diversity, need to update the seeds there...
				if (INITIAL_OPERATION_RANDOM_SEED) {
					genOpWrapped.getFuzzingOperation().setSeed(rng.nextLong());
				}
				
				
				int i = sol.getNumberOfVariables();
				sol.addContents(i++, genOpWrapped);
			} catch (ConversionFailed e) {
				e.printStackTrace();
			} catch (ParamError e) {
				e.printStackTrace();
			} catch (ConstraintsNotMet e) {
				e.printStackTrace();
			} catch (InvalidOperation e) {
				e.printStackTrace();
			} catch (InvalidFuzzingOperation e) {
				e.printStackTrace();
			} catch (InvalidActivationToReduce e) {
				e.printStackTrace();
			}
	}
	
	public SESAMETestSolution createSolution() {
		// Needs to create the initial selections from the TestingSpace and constraints
		// from TestCampaign
		SESAMETestSolution sol = new SESAMETestSolution(selectedCampaign);

		// Get a list of operations to include and include them if necessary
		EList<FuzzingOperation> fuzzingOperationsInCampaign = selectedCampaign.getIncludedOperations();
		for (FuzzingOperation opTemplate : fuzzingOperationsInCampaign) {
			if (shouldIncludeFuzzingOperation(opTemplate)) {
				addSingleOperationFromTemplate(opTemplate, sol);
			}
		}
		
		// There should always be at least one element in the solution if the campaign 
		// has some ... so include a random selection below if there are none
		if ((sol.getNumberOfVariables() == 0) && (fuzzingOperationsInCampaign.size() > 0)) {
			FuzzingOperation baseFuzzingOperation = getRandomFuzzingOperation(fuzzingOperationsInCampaign);
			addSingleOperationFromTemplate(baseFuzzingOperation, sol);
		}
		
		return sol;
	}

	private FuzzingOperation getRandomFuzzingOperation(EList<FuzzingOperation> FuzzingOperations) {
		int listSize = FuzzingOperations.size();
		int randomIndex = rng.nextInt(listSize);
		return FuzzingOperations.get(randomIndex);
	}

	public abstract void shutDownMetricListener();

	public void ensureFinalModelSaved() {
		loader.saveTestingSpace();
	}
}
