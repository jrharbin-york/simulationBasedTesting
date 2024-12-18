package uk.ac.york.soprano.sbt.generator;

public class MissingProperty extends Exception {
	private static final long serialVersionUID = 1L;
	
	private String key;

	public MissingProperty(String key) {
		this.key = key;
	}
	
	public String toString() {
		return "<MissingProperty:" + key + ">";
	}
}
