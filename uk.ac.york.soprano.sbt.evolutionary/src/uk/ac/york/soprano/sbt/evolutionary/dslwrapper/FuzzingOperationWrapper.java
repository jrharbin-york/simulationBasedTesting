package uk.ac.york.soprano.sbt.evolutionary.dslwrapper;

import java.security.SecureRandom;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import it.units.malelab.jgea.representation.tree.Tree;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.*;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.GenericVariable;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.StandardGrammar.Condition;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.StandardGrammar.ConditionConstraint;
import uk.ac.york.soprano.sbt.evolutionary.*;
import uk.ac.york.soprano.sbt.evolutionary.grammar.ConversionFailed;
import uk.ac.york.soprano.sbt.evolutionary.utilities.RandomFunctions;

public class FuzzingOperationWrapper {

	// This should always be true in practical testing... the only reason to set it to
	// false is if e.g. testing with fixed parameters, e.g. for diversity testing during turtlesim
	private static final boolean REDUCE_OPERATION_PARAMETERS = true;
	
	// This indicates whether to reduce timing... if not it will be held constant
	private static final boolean REDUCE_TIMING = true;
	
	private Tree<String> storedStartTree;
	private Tree<String> storedEndTree;
	
	private FuzzingOperation fuzzOp;
	private ActivationWrapper actW;
	protected ConditionGenerator cg;
	
	public FuzzingOperationWrapper(FuzzingOperation fuzzOp) throws InvalidFuzzingOperation {
		this.actW = new ActivationWrapper(fuzzOp);
		this.fuzzOp = fuzzOp;
	}
	
	public FuzzingOperationWrapper(FuzzingOperation fuzzOp, ConditionGenerator cg) throws InvalidFuzzingOperation {
		this.actW = new ActivationWrapper(fuzzOp);
		this.fuzzOp = fuzzOp;
	}
	
	public FuzzingOperationWrapper(FuzzingOperation fuzzOp, Tree<String> startTree, Tree<String> endTree,	ConditionGenerator cg) {
		// This has to be duplicated here just to be sure
		this.actW = new ActivationWrapper(fuzzOp);
		this.fuzzOp = EcoreUtil.copy(fuzzOp);
		if (startTree != null) {
			this.storedStartTree = Tree.copyOf(startTree);
		}
		if (endTree != null) {
			this.storedEndTree = Tree.copyOf(endTree);
		}
		this.cg = cg;
	}

	private static void reduceValueSet(Random rng, EList<ValueSet> newValueSet, EList<ValueSet> origValueSet) {
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

	private static void reduceDoubleRange(Random rng, DoubleRange drNew, DoubleRange drOrig) {
		double lb;
		double ub;
		double origLB = ((DoubleRange) drOrig).getLowerBound();
		double origUB = ((DoubleRange) drOrig).getUpperBound();
		lb = RandomFunctions.randomDoubleInRange(rng, origLB, origUB);
		ub = RandomFunctions.randomDoubleInRange(rng, lb, origUB);
		drNew.setPropertyName(drOrig.getPropertyName());
		drNew.setLowerBound(lb);
		drNew.setUpperBound(ub);
	}

	private static void reduceCustomParameters(Random rng, EList<ValueSet> newParams, EList<ValueSet> origParams)
			throws ParamError {
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
				vs.setPropertyName(((IntRange) vsOrig).getPropertyName());
				vs.setLowerBound(lb);
				vs.setUpperBound(ub);
				newParams.add(vs);
			}

			// Reduce the maximum and minimum point to a single point - ideally
			// this should be configurable
			if (vsOrig instanceof PointRange) {
				Point origLB = ((PointRange) vsOrig).getMinPoint();
				Point origUB = ((PointRange) vsOrig).getMaxPoint();
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
				EList<String> origSet = ((StringSet) vsOrig).getChoices();
				Optional<String> elt_o = RandomFunctions.randomElementInList(rng, origSet);
				if (elt_o.isPresent()) {
					String elt = elt_o.get();
					StringSet vs = af.createStringSet();

					// Property name must be set
					vs.setPropertyName(((StringSet) vsOrig).getPropertyName());
					vs.getChoices().clear();
					vs.getChoices().add(elt);
					newParams.add(vs);
				} else {
					throw new ParamError("Zero-length string set");
				}
			}
		}
	}

	public static void reduceOperationSpecific(Random rng, FuzzingOperation newA, FuzzingOperation original) throws ParamError {
		// TODO: better way of dispatching upon this type here
    	// Factor these out into the DSL generated code? - each DSL type knows how to reduce
		// its parameters
		if (original instanceof RandomValueFromSetOperation) {
			RandomValueFromSetOperation rvfsO = (RandomValueFromSetOperation) original;
			RandomValueFromSetOperation rvfsN = (RandomValueFromSetOperation) newA;
			reduceValueSet(rng, rvfsN.getValueSet(), rvfsO.getValueSet());
		}

		if (original instanceof CustomFuzzingOperation) {
			CustomFuzzingOperation cfoO = (CustomFuzzingOperation) original;
			CustomFuzzingOperation cfoN = (CustomFuzzingOperation) newA;
			reduceCustomParameters(rng, cfoN.getParams(), cfoO.getParams());
		}

		if (original instanceof PacketLossNetworkOperation) {
			PacketLossNetworkOperation cfoO = (PacketLossNetworkOperation) original;
			PacketLossNetworkOperation cfoN = (PacketLossNetworkOperation) newA;
			reduceDoubleRange(rng, cfoN.getFrequency(), cfoO.getFrequency());
		}
		
		if (original instanceof LatencyNetworkOperation) {
			LatencyNetworkOperation cfoO = (LatencyNetworkOperation)original;
			LatencyNetworkOperation cfoN = (LatencyNetworkOperation)newA;
			reduceDoubleRange(rng, cfoN.getLatency(), cfoO.getLatency());
		}
	}

	public String generateDebugInfo() {
		return this.toString();
	}
	
	public String toString() {
        String output = fuzzOp.getClass().getCanonicalName().toString();
        output = output + actW.activationToString() + "\n";
        return output;
	}

	public FuzzingOperationWrapper dup() {
		return new FuzzingOperationWrapper(this.fuzzOp, this.storedStartTree, this.storedEndTree, this.cg);
	}
	
	public FuzzingOperation getFuzzingOperation() {
		return fuzzOp;
	}
	
    public FuzzingOperationWrapper reductionOfTimeBasedOperation(SecureRandom rng) throws InvalidFuzzingOperation, ParamError {
        FuzzingOperation dynOp = this.getFuzzingOperation();
        FuzzingOperation newA = EcoreUtil.copy(dynOp);
        FixedTimeActivation origAA = (FixedTimeActivation)this.actW.getActivation();
        FixedTimeActivation newAA = EcoreUtil.copy(origAA);
        double startTime;
        double endTime;
        double origStartTime = ((FixedTimeActivation) origAA).getStartTime();
        double origEndTime = ((FixedTimeActivation) origAA).getEndTime();
        if (REDUCE_TIMING) {
        	startTime = RandomFunctions.randomDoubleInRange(rng, origStartTime, origEndTime);
        	endTime = RandomFunctions.randomDoubleInRange(rng, startTime, origEndTime);
        } else {
        	startTime = origStartTime;
        	endTime = origEndTime;
        }
        	((FixedTimeActivation) newAA).setStartTime(startTime);
        	((FixedTimeActivation) newAA).setEndTime(endTime);
        newA.setActivation(newAA);
        
        if (REDUCE_OPERATION_PARAMETERS) {
        	reduceOperationSpecific(rng, newA, (FuzzingOperation)this.getFuzzingOperation());
        }
        
        return new FuzzingOperationWrapper(newA);
    }
    
    public FuzzingOperationWrapper reductionOfStaticOperation(SecureRandom rng) throws InvalidFuzzingOperation, ParamError {
        FuzzingOperation dynOp = this.getFuzzingOperation();
        FuzzingOperation newA = EcoreUtil.copy(dynOp);
        FuzzingOperationsFactory fFactory = FuzzingOperationsFactory.eINSTANCE;
        ConstantActivation newAA = fFactory.createConstantActivation();
        newA.setActivation(newAA);
        
        if (REDUCE_OPERATION_PARAMETERS) {
        	reduceOperationSpecific(rng, newA, (FuzzingOperation)this.getFuzzingOperation());
        }
        
        return new FuzzingOperationWrapper(newA);
    }

    public FuzzingOperationWrapper reductionOfConditionBasedOperation(SecureRandom rng) throws ParamError, ConversionFailed, ConstraintsNotMet {
        // cg has to come from the wrapper factory - has to be condition based
        FuzzingOperation newA = EcoreUtil.copy(fuzzOp);
        List<ConditionConstraint> ccs = fuzzOp.getConditionConstraints();

        newA.setFromTemplate((FuzzingOperation)this);
        Tree<String> startTree = cg.generateOneWithConstraints(ccs);
        
        // TODO: currently only the start condition is constrained.
        Tree<String> endTree = cg.generateOne();
        
        // Store the starting and ending trees with this individual
        System.out.println("startTree = " + startTree);
        System.out.println("endTree = " + endTree);

        Condition start = cg.convert(startTree);
        Condition end = cg.convert(endTree);
        FuzzingOperationsFactory f = FuzzingOperationsFactory.eINSTANCE;
        ConditionBasedActivation ca = f.createConditionBasedActivation();
        ca.setStarting(start);
        ca.setEnding(end);
        newA.setActivation(ca);

        if (REDUCE_OPERATION_PARAMETERS) {
        	reduceOperationSpecific(rng, newA, (FuzzingOperation)this.getFuzzingOperation());
        }

        // Ensure the new individual has the stored start trees and end trees
        return new FuzzingOperationWrapper(newA, startTree, endTree, cg);
    }
	
	public FuzzingOperationWrapper reductionOfOperation(SecureRandom rng) throws ConstraintsNotMet, ConversionFailed, ParamError, InvalidFuzzingOperation, InvalidActivationToReduce {
		
		FuzzingOperationWrapper newOp;
		
		if (actW.isFixedTimeBased()) {
			newOp = reductionOfTimeBasedOperation(rng);
			newOp.setFromTemplate(this);
			return newOp;
		}
		
		if (actW.isConditionBased()) {
			newOp = reductionOfConditionBasedOperation(rng);
			newOp.setFromTemplate(this);
			return newOp;
		}
		
		if (actW.isStatic()) {
			newOp = reductionOfStaticOperation(rng);
			newOp.setFromTemplate(this);
			return newOp;
		}
		
		throw new InvalidActivationToReduce(actW);
	}

	public void checkConstraints() {

	}
	
	public boolean isDynamic() {
		return false;
	}

	public String getName() {
		return fuzzOp.getName();
	}
	
	public Tree<String> getStoredStartTree() {
		return storedStartTree;
	}

	public Tree<String> getStoredEndTree() {
		return storedEndTree;
	}
	
	public void setStoredStartTree(Tree<String> tNew) {
		storedStartTree = tNew;
	}

	public void setStoredEndTree(Tree<String> tNew) {
		storedEndTree = tNew;
	}
	
	public Activation getActivation() {
		return actW.getActivation();
	}
	
	public ActivationWrapper getActivationWrapper() {
		return actW;
	}

	public void setActivation(Activation a) {
		actW.setActivation(a);
	}
	
    public ConditionGenerator getConditionGenerator() {
        return cg;
    }
    
    public void setFromTemplate(FuzzingOperationWrapper templateWrapper) {
    	FuzzingOperation originalOp = templateWrapper.getFuzzingOperation().getFromTemplate();
    	this.getFuzzingOperation().setFromTemplate(originalOp);
    }

    public Optional<Activation> getTemplateActivation() {
        FuzzingOperation f = fuzzOp.getFromTemplate();
        
        if (f instanceof VariableOperation) {
                return Optional.of(((VariableOperation)f).getActivation());
        } 
        
        if (f instanceof NetworkFuzzingOperation) {
                return Optional.of(((NetworkFuzzingOperation)f).getActivation());
        }
        
        return Optional.empty();
    }

	public static boolean opIsStatic(FuzzingOperation o) {
		if (o instanceof VariableOperation) {
			if (((VariableOperation)o).getActivation() instanceof ConstantActivation) {
				return true;
			}
		}
		
		return false;
	}

	public Optional<GenericVariable> getVariableToAffect() {
		if (fuzzOp instanceof VariableOperation) {
			return Optional.of(((VariableOperation)fuzzOp).getVariableToAffect());
		} 
		
		if (fuzzOp instanceof NetworkFuzzingOperation) {
			return Optional.of(((NetworkFuzzingOperation)fuzzOp).getVariableToAffect());
		} 
		
		return Optional.empty();
	}
	
}
