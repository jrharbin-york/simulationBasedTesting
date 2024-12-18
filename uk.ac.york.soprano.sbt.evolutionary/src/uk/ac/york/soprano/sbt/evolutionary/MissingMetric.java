package uk.ac.york.soprano.sbt.evolutionary;

public class MissingMetric extends Exception {
	private static final long serialVersionUID = 1L;
	private String targetID;
	
	public MissingMetric(String targetID) {
		this.targetID = targetID;
	}
	
	public String getTargetID() {
		return targetID;
	}
}
