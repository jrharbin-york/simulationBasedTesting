package uk.ac.york.soprano.sbt.evolutionary.phytestingselection;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation;

public interface FuzzOpLambdaFunction {
	public Double operation(FuzzingOperation fo);
}
