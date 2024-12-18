package uk.ac.york.soprano.sbt.evolutionary.phytestingselection;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test;

public class NoOperations extends Exception {

	private Test t;
	private static final long serialVersionUID = 1L;

	public NoOperations(Test t) {
		this.t = t;
	}

	public Test getT() {
		return t;
	}

	public void setT(Test t) {
		this.t = t;
	}
	
}
