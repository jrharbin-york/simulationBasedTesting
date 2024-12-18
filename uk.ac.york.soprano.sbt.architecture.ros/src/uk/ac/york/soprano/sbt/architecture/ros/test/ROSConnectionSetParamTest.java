package uk.ac.york.soprano.sbt.architecture.ros.test;

import java.util.HashMap;
import java.util.Properties;

import uk.ac.york.soprano.sbt.architecture.config.ConnectionProperties;
import uk.ac.york.soprano.sbt.architecture.ros.ROSSimulator;
import uk.ac.york.soprano.sbt.architecture.simulator.IPropertySetter;
import uk.ac.york.soprano.sbt.architecture.simulator.InvalidPropertyType;
import uk.ac.york.soprano.sbt.architecture.simulator.RestoreFailed;

public class ROSConnectionSetParamTest {
	public static void main(String[] args) {
		ROSSimulator rosSim = new ROSSimulator();
		ConnectionProperties cp = new ConnectionProperties();
		HashMap<String, Object> propsMap = new HashMap<String, Object>();
		propsMap.put(ConnectionProperties.HOSTNAME, "0.0.0.0");
		propsMap.put(ConnectionProperties.PORT, 9090);
		cp.setProperties(propsMap);
		rosSim.connect(cp);
		
		System.out.println("Connected to rosbridge");

		// Wait before changing parameter
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Properties paramProps = new Properties();
		paramProps.setProperty("componentName", "/turtlesim");
		paramProps.setProperty("paramName", "background_r");
		IPropertySetter setter = rosSim.getPropertySetter(paramProps);
		
		int v = 69;
		try {
			setter.set(v);
			// Wait before changing parameter back
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// Restore
			setter.restoreOriginalValue();
		} catch (InvalidPropertyType e) {
			e.printStackTrace();
		} catch (RestoreFailed e) {
			e.printStackTrace();
		}
		
		System.out.println("Terminating ros connection");
		rosSim.disconnect();

	}

}
