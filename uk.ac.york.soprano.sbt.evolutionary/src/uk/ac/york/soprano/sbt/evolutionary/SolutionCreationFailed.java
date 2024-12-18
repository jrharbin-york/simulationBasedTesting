package uk.ac.york.soprano.sbt.evolutionary;

import uk.ac.york.soprano.sbt.evolutionary.grammar.ConversionFailed;

public class SolutionCreationFailed extends RuntimeException {
	private static final long serialVersionUID = 1L;
	Exception cause;

	public SolutionCreationFailed(ConversionFailed e) {
		this.cause = e;
	}
	
	public SolutionCreationFailed(ParamError e) {
		this.cause = e;
	}

	public SolutionCreationFailed(ConstraintsNotMet e) {
		this.cause = e;
	}
}
