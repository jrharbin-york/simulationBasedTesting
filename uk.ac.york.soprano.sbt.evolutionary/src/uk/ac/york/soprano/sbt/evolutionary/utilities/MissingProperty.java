package uk.ac.york.soprano.sbt.evolutionary.utilities;

public class MissingProperty extends Exception {
	private static final long serialVersionUID = 1L;
	private String key;

	public MissingProperty(String key) {
		this.key = key;
	}
	
	public String getKey() {
		return key;
	}
}
