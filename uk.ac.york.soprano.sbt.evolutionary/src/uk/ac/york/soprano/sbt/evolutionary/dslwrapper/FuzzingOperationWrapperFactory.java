package uk.ac.york.soprano.sbt.evolutionary.dslwrapper;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation;

public class FuzzingOperationWrapperFactory {
	
	public FuzzingOperationWrapper createFromDSLObject(FuzzingOperation a) throws InvalidFuzzingOperation {
		return new FuzzingOperationWrapper(a);
	}
}
