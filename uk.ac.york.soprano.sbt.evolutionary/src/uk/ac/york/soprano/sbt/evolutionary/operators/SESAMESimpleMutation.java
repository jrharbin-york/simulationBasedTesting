package uk.ac.york.soprano.sbt.evolutionary.operators;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Optional;
import java.util.Random;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import it.units.malelab.jgea.representation.tree.Tree;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.*;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.StandardGrammar.Condition;
import uk.ac.york.soprano.sbt.evolutionary.ConditionGenerator;
import uk.ac.york.soprano.sbt.evolutionary.ParamError;
import uk.ac.york.soprano.sbt.evolutionary.SESAMETestSolution;
import uk.ac.york.soprano.sbt.evolutionary.dslwrapper.FuzzingOperationWrapper;
import uk.ac.york.soprano.sbt.evolutionary.grammar.ConversionFailed;
import uk.ac.york.soprano.sbt.evolutionary.utilities.RandomFunctions;

// TODO: check mutation logic against the changes that I made with Simos on github last year
// Things to check: ensuring all Java object representations etc are fresh
// I think it has to be ensured in the crossover operation - ensuring creating a fresh one
public class SESAMESimpleMutation extends SESAMEMutation {

	public enum TimeSpecChangeOp {
		CHANGE_LENGTH, CHANGE_START_CONDITION, CHANGE_END_CONDITION
	}

	public enum ConditionMutationSelection {
		SELECT_START, SELECT_END
	}

	protected final double DEFAULT_PROB_OF_TEMPORAL_MUTATION = 1.0 / 3.0;
	protected final double DEFAULT_PROB_OF_PARAM_CHANGE = 1.0 / 3.0;
	protected final double DEFAULT_PROB_OF_PARTICIPANT_CHANGE = 1.0 / 3.0;

	protected double probTemporalMutation = DEFAULT_PROB_OF_TEMPORAL_MUTATION;
	protected double probParamMutation = DEFAULT_PROB_OF_PARAM_CHANGE;
	protected double probParticipantMutation = DEFAULT_PROB_OF_PARTICIPANT_CHANGE;

	private final double PROB_OF_TIMESPEC_CHANGE_END = 0.5;

	private static final long serialVersionUID = 1L;
	private static final double PROB_SELECT_START_OR_END = 0.5;

	protected Random rng;
	protected FileWriter mutationLog;
	protected ConditionGenerator condGenerator;

	public SESAMESimpleMutation(Random rng, FileWriter mutationLog, double probTemporalMut, double probParamMut,
			ConditionGenerator cg) throws IOException {
		this.rng = rng;
		this.probTemporalMutation = probTemporalMut;
		this.probParamMutation = probParamMut;
		this.condGenerator = cg;

		this.mutationLog = mutationLog;
		mutationLog.write("probTemporalMutation=" + probTemporalMut + "\n");
		mutationLog.write("probParamMutation=" + probParamMut + "\n");
	}

	// This only applies to the start condition + time length
	public TimeSpecChangeOp getTimeSpecChangeOperationStartLength() {
		double v = rng.nextDouble();
		if (v < PROB_OF_TIMESPEC_CHANGE_END) {
			return TimeSpecChangeOp.CHANGE_LENGTH;
		} else {
			return TimeSpecChangeOp.CHANGE_START_CONDITION;
		}
	}

	// This only applies to the start condition + end condition
	public TimeSpecChangeOp getTimeSpecChangeOperationStartEnd() {
		double v = rng.nextDouble();
		if (v < PROB_OF_TIMESPEC_CHANGE_END) {
			return TimeSpecChangeOp.CHANGE_START_CONDITION;
		} else {
			return TimeSpecChangeOp.CHANGE_END_CONDITION;
		}
	}

	// This should be pushed into a subclass to indicate that it only does totally
	// random time generation. Other approaches, e.g. time shifting are possible.
	private void mutateFixedTimeSpec(FixedTimeActivation aft, FixedTimeActivation aftSpace) {
		// Look up the attack that it is based upon
		double startTime;
		double endTime;
		double limitStartTime = aftSpace.getStartTime();
		double limitEndTime = aftSpace.getEndTime();

		startTime = RandomFunctions.randomDoubleInRange(rng, limitStartTime, limitEndTime);
		endTime = RandomFunctions.randomDoubleInRange(rng, startTime, limitEndTime);
		aft.setStartTime(startTime);
		aft.setEndTime(endTime);
	}

	private void mutateConditionBased(FuzzingOperationWrapper sfow, ConditionBasedActivation aa, ConditionMutationSelection s) throws MutationFailed, IOException {
		try {
			if (s == ConditionMutationSelection.SELECT_START) {
				Tree<String> t = sfow.getStoredStartTree();
				mutationLog.write("Mutating start condition: original is " + t + "\n");
				Tree<String> tNew = condGenerator.mutate(t, rng);
				mutationLog.write("Mutating start condition: mutated to " + tNew + "\n");
				Condition cNew = condGenerator.convert(tNew);
				mutationLog.write("Mutation condition = " + condGenerator.conditionToString(cNew) + "\n");
				aa.setStarting(cNew);
				sfow.setStoredStartTree(tNew);
			}

			if (s == ConditionMutationSelection.SELECT_END) {
				Tree<String> t = sfow.getStoredEndTree();
				mutationLog.write("Mutating end condition: original is " + t + "\n");
				Tree<String> tNew = condGenerator.mutate(t, rng);
				mutationLog.write("Mutating end condition: mutated to " + tNew + "\n");
				Condition cNew = condGenerator.convert(tNew);
				mutationLog.write("Mutation condition = " + condGenerator.conditionToString(cNew) + "\n");
				aa.setEnding(cNew);
				sfow.setStoredEndTree(tNew);
			}
		} catch (ConversionFailed e) {
			e.printStackTrace();
			throw new MutationFailed(e);
		}
	}

	private void mutateIndividualActivation(FuzzingOperationWrapper sfow, Activation aa, Activation aaSpace)
			throws MutationFailed, IOException {
		if ((aa instanceof FixedTimeActivation) && (aaSpace instanceof FixedTimeActivation)) {
			mutateFixedTimeSpec((FixedTimeActivation) aa, (FixedTimeActivation) aaSpace);
		}

		if ((aa instanceof ConditionBasedActivation)) {
			// TODO: select start and end
			double next = rng.nextDouble();
			ConditionMutationSelection selection;
			if (next < PROB_SELECT_START_OR_END) {
				selection = ConditionMutationSelection.SELECT_START;
			} else {
				selection = ConditionMutationSelection.SELECT_END;
			}

			mutateConditionBased((FuzzingOperationWrapper)sfow, (ConditionBasedActivation) aa, selection);
		}
	}

	private void mutateActivations(FuzzingOperationWrapper sfow) throws MutationFailed, IOException {
		Activation aa = sfow.getActivation();
		
		Optional<Activation> aaSpace = sfow.getTemplateActivation();
		if (aaSpace.isPresent()) {
			mutateIndividualActivation(sfow, aa, aaSpace.get());
		}
	}
	
	private void reduceValueSet(EList<ValueSet> newValueSet, EList<ValueSet> origValueSet) {
		FuzzingOperationsFactory af = FuzzingOperationsFactory.eINSTANCE;
		newValueSet.clear();

		for (ValueSet vsOrig : origValueSet) {
			// TODO: better way of dispatching upon this type here
			if (vsOrig instanceof DoubleRange) {
				// Create new valueSet
				double lb;
				double ub;
				double origLB = ((DoubleRange) vsOrig).getLowerBound();
				double origUB = ((DoubleRange) vsOrig).getUpperBound();
				lb = RandomFunctions.randomDoubleInRange(rng, origLB, origUB);
				ub = RandomFunctions.randomDoubleInRange(rng, lb, origUB);
				DoubleRange vs = af.createDoubleRange();
				// Property name must be set
				vs.setPropertyName(((DoubleRange) vsOrig).getPropertyName());
				vs.setLowerBound(lb);
				vs.setUpperBound(ub);
				newValueSet.add(vs);
			}
		}
	}

	private void reduceCustomParameters(EList<ValueSet> newParams, EList<ValueSet> origParams ) throws ParamError {
		boolean reduceRangeToSingle = true;
		FuzzingOperationsFactory af = FuzzingOperationsFactory.eINSTANCE;
		newParams.clear();

		// TODO: better way of dispatching upon this type here
		for (ValueSet vsOrig : origParams) {
			if (vsOrig instanceof DoubleRange) {
				double lb;
				double ub;
				double origLB = ((DoubleRange) vsOrig).getLowerBound();
				double origUB = ((DoubleRange) vsOrig).getUpperBound();
				lb = RandomFunctions.randomDoubleInRange(rng, origLB, origUB);
				ub = RandomFunctions.randomDoubleInRange(rng, lb, origUB);
				DoubleRange vs = af.createDoubleRange();
				// Property name must be set
				vs.setPropertyName(((DoubleRange) vsOrig).getPropertyName());
				vs.setLowerBound(lb);
				vs.setUpperBound(ub);
				newParams.add(vs);
			}

			if (vsOrig instanceof IntRange) {
				int lb;
				int ub;
			
				int origLB = ((IntRange) vsOrig).getLowerBound();
				int origUB = ((IntRange) vsOrig).getUpperBound();
				if (!reduceRangeToSingle) {
					lb = RandomFunctions.randomIntInRange(rng, origLB, origUB);
					ub = RandomFunctions.randomIntInRange(rng, lb, origUB);
				} else {
					lb = RandomFunctions.randomIntInRange(rng, origLB, origUB);
					ub = lb;
				}
				IntRange vs = af.createIntRange();
				// Property name must be set
				vs.setPropertyName(((IntRange)vsOrig).getPropertyName());
				vs.setLowerBound(lb);
				vs.setUpperBound(ub);
				newParams.add(vs);
			}
			
			// Reduce the maximum and minimum point to a single point - ideally
			// this should be configurable
			if (vsOrig instanceof PointRange) {
				Point origLB = ((PointRange)vsOrig).getMinPoint();
				Point origUB = ((PointRange)vsOrig).getMaxPoint();
				if ((origLB == null) || (origUB == null)) {
					throw new ParamError("Missing minpoint and maxpoint in PointRange");
				} else {
					Point lb = RandomFunctions.randomPointInRange(rng, origLB, origUB);
					Point ub = EcoreUtil.copy(lb);
					PointRange vs = af.createPointRange();
					// Property name must be set
					vs.setPropertyName(((PointRange) vsOrig).getPropertyName());
					vs.setMinPoint(lb);
					vs.setMaxPoint(ub);
					newParams.add(vs);
				}
			}
			
			// Choose a single element from the set
			if (vsOrig instanceof StringSet) {
				EList<String> origSet = ((StringSet)vsOrig).getChoices();
				Optional<String> elt_o = RandomFunctions.randomElementInList(rng, origSet);
				if (elt_o.isPresent()) {
					String elt = elt_o.get();
					StringSet vs = af.createStringSet();
								
				// Property name must be set
				vs.setPropertyName(((StringSet)vsOrig).getPropertyName());
				vs.getChoices().clear();
				vs.getChoices().add(elt);
				newParams.add(vs);
				} else {
					throw new ParamError("Zero-length string set");
				}
			}
		}
	}
	
	public void reduceOperationSpecific(FuzzingOperation newA, FuzzingOperation original) throws ParamError {
		// TODO: better way of dispatching upon this type here
		// this is repeated code between the initial generation
		if (original instanceof RandomValueFromSetOperation) {
			RandomValueFromSetOperation rvfsO = (RandomValueFromSetOperation) original;
			RandomValueFromSetOperation rvfsN = (RandomValueFromSetOperation) newA;
			reduceValueSet(rvfsN.getValueSet(), rvfsO.getValueSet());
		}

		if (original instanceof CustomFuzzingOperation) {
			CustomFuzzingOperation cfoO = (CustomFuzzingOperation) original;
			CustomFuzzingOperation cfoN = (CustomFuzzingOperation) newA;
			reduceCustomParameters(cfoN.getParams(), cfoO.getParams());
		}
	}

	private void newParameters(FuzzingOperationWrapper sfow) {
		FuzzingOperation newOp = sfow.getFuzzingOperation();
		FuzzingOperation original = newOp.getFromTemplate();
		try {
			reduceOperationSpecific(newOp, original);
		} catch (ParamError e) {
			e.printStackTrace();
		}
	}

	public void logWithoutError(String s) {
		try {
			mutationLog.write(s + "\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void modifyGivenRecord(FuzzingOperationWrapper sta) throws IOException {
		if ((rng.nextDouble() < probTemporalMutation) && sta.isDynamic()) {
			logWithoutError("Performing temporal mutation on " + sta.getName());
			try {
				// Can cast to DynamicOperation as it has been checked above
				mutateActivations(sta);
				
			} catch (MutationFailed e) {
				// TODO: log the failed mutation because of the conversion error
				// should we raise it again
				e.printStackTrace();
			}
		}

		if (rng.nextDouble() < probParamMutation) {
			logWithoutError("Performing parameter mutation on " + sta.getName());
			newParameters(sta);
		}
	}

	public double getMutationProbability() {
		return 1.0;
	}

	public SESAMETestSolution execute(SESAMETestSolution sol) {
		try {
			// Pre-mutation debugging
			mutationLog.write(sol.toString() + "\n");
			for (int i = 0; i < sol.getNumberOfVariables(); i++) {
				FuzzingOperationWrapper sta = sol.getVariable(i);
				System.out.println("Before modification SESAMETestSolution=" + sta);
				modifyGivenRecord(sta);
			}
			// Post-mutation debugging
			mutationLog.write(sol.toString() + "\n");
			mutationLog.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return sol;
	}

	public void closeLog() throws IOException {
		mutationLog.close();
	}
}
