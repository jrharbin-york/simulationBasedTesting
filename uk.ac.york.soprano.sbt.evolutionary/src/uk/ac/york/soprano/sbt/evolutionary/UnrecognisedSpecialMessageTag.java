package uk.ac.york.soprano.sbt.evolutionary;

public class UnrecognisedSpecialMessageTag extends Exception {
	private String tag;
	private static final long serialVersionUID = 1L;

	public UnrecognisedSpecialMessageTag(String tag) {
		this.tag = tag;
	}
}
