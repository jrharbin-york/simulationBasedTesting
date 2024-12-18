package uk.ac.york.soprano.sbt.evolutionary.distributed.staticvariables;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.RandomValueFromSetOperation;
import uk.ac.york.soprano.sbt.evolutionary.distributed.staticvariables.operationexecutors.OperationExecutor;
import uk.ac.york.soprano.sbt.evolutionary.distributed.staticvariables.operationexecutors.RandomValueFromSetExecutor;

public class StaticOperationExecutoryFactory {

	public OperationExecutor createOperationExecutor(FuzzingOperation op) throws InvalidExecutorForOperation {
		if (op instanceof RandomValueFromSetOperation) {
			return new RandomValueFromSetExecutor((RandomValueFromSetOperation)op);
		} 
		
		throw new InvalidExecutorForOperation(op);
	}
	
}
