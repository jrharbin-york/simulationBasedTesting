package uk.ac.york.soprano.sbt.evolutionary.dslwrapper;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation;
import uk.ac.york.soprano.sbt.evolutionary.ConditionGenerator;

public class ConditionBasedWrapperFactory extends FuzzingOperationWrapperFactory {
	private ConditionGenerator cg;
	
	public ConditionBasedWrapperFactory(ConditionGenerator cg) {
		this.cg = cg;
	}

	@Override
	public FuzzingOperationWrapper createFromDSLObject(FuzzingOperation a) throws InvalidFuzzingOperation {
		// TODO Check the fuzzing operation is a condition-based operation
		FuzzingOperationWrapper fw = new FuzzingOperationWrapper(a, cg);
		return fw;
	}
	
	public ConditionGenerator getConditionGenerator() {
		return cg;
	}
}
