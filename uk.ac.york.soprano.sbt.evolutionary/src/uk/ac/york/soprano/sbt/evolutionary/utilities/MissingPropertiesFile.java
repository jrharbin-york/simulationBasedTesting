package uk.ac.york.soprano.sbt.evolutionary.utilities;

import java.io.File;

public class MissingPropertiesFile extends Exception {
	private static final long serialVersionUID = 1L;
	private File propsExpectedLocation;
	
	public MissingPropertiesFile(File propsExpectedLocation) {
		this.propsExpectedLocation = propsExpectedLocation;
	}

	public String getExpectedLocationPath() {
		return propsExpectedLocation.getAbsolutePath();
	}

}
