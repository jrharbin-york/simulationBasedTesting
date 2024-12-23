package uk.ac.york.soprano.sbt.generator;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class ModelPathDefinitions {
	
	private static Properties loadProperties() throws MissingPropertiesFile {
		String homeDir = System.getProperty("user.home");
		File propsFile = new File(homeDir, "simtesting.properties");
		
		try {
			Properties props = new Properties();
			props.load(new FileInputStream(propsFile));
			return props;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new MissingPropertiesFile(propsFile);
		}
		
	}
	
	public static String getProperty(String key) throws MissingProperty {
		
		try {	
			Properties props = loadProperties();
			return props.getProperty(key);
		} catch (MissingPropertiesFile e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new MissingProperty(key);
		}
	}
}
