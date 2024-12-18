package uk.ac.york.soprano.sbt.evolutionary.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PathLookupFromProperties {
	
	public static enum PathSpec {
		LOCAL_AUTO_RUNNER_SCRIPTS_DIR,
		TESTING_METAMODEL_FILE,
		SHARED_CODE_DIRECTORY
	}
	
	private static Properties cachedProps;
	
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
	
	public static String getProperty(PathSpec key) throws MissingProperty, MissingPropertiesFile {
		
		String keyName = key.toString();
		if (cachedProps == null) {
			cachedProps = loadProperties();
		}
			
		if (cachedProps.containsKey(keyName)) {
			return cachedProps.getProperty(keyName);
		} else {
			throw new MissingProperty(keyName);
		}
	}
}