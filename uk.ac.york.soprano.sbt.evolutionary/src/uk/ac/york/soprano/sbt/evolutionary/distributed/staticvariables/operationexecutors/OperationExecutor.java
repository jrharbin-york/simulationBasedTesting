package uk.ac.york.soprano.sbt.evolutionary.distributed.staticvariables.operationexecutors;

import java.util.Random;

import uk.ac.york.soprano.sbt.evolutionary.dslwrapper.InvalidOperation;

public abstract class OperationExecutor {
	public abstract Object exec(Random rng, Object input) throws InvalidOperation;
}
