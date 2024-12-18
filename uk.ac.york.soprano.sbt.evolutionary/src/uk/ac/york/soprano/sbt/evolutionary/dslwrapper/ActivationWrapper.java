package uk.ac.york.soprano.sbt.evolutionary.dslwrapper;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.*;

public class ActivationWrapper {
	private Activation a;
	
	public ActivationWrapper(FuzzingOperation op) throws InvalidFuzzingOperation {
		if (op instanceof VariableOperation) {
			this.a = ((VariableOperation) op).getActivation();
		}
		
		if (op instanceof NetworkFuzzingOperation) {
			this.a = ((NetworkFuzzingOperation) op).getActivation();
		}
		
		if (this.a == null) {
			throw new InvalidFuzzingOperation(op);
		}
	}
	
	public boolean isStatic() {
		return (a instanceof ConstantActivation);
	}
	
	public boolean isDynamic() {
		return (a instanceof DynamicActivation);
	}
	
	public boolean isConditionBased() {
		return (a instanceof ConditionBasedActivation);
	}
	
	public boolean isFixedTimeBased() {
		return (a instanceof FixedTimeActivation);
	}
	
	public Activation getActivation() {
		return a;
	}
	
//	public Activation getReduction() {
//		
//	}

	public String activationToString() {
		if (a instanceof ConstantActivation) {
			return "<CONSTANT>";
		}
		
		if (a instanceof FixedTimeActivation) {
			return "[" + ((FixedTimeActivation) a).getStartTime() + "-" + ((FixedTimeActivation) a).getEndTime();
		}
		
		if (a instanceof ConditionBasedActivation) {
			
		}
		
		
		throw new InvalidActivation(a);
	}

	public void setActivation(Activation a) {
		this.a = a;
	}
	
}
