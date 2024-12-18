package uk.ac.york.soprano.sbt.evolutionary.phytestingselection;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation;

public class MissingTimingPair extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public MissingTimingPair(FuzzingOperation op) {
		
	}
}
