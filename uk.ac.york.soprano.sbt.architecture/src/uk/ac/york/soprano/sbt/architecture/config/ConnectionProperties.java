package uk.ac.york.soprano.sbt.architecture.config;

import java.util.HashMap;

public class ConnectionProperties {
	
	public final static String HOSTNAME = "HOSTNAME";
	public final static String PORT = "PORT";
	public final static String STEP_SIZE = "STEP_SIZE"; 
	
	HashMap<String, Object> properties = new HashMap<String, Object>();

	public HashMap<String, Object> getProperties() {
		return properties;
	}

	public void setProperties(HashMap<String, Object> properties) {
		this.properties = properties;
	}
}