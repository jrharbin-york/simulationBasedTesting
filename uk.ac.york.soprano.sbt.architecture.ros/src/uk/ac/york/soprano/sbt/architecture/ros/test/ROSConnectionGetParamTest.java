package uk.ac.york.soprano.sbt.architecture.ros.test;

import java.util.HashMap;
import java.util.Properties;

import uk.ac.york.soprano.sbt.architecture.config.ConnectionProperties;
import uk.ac.york.soprano.sbt.architecture.ros.ROSSimulator;
import uk.ac.york.soprano.sbt.architecture.simulator.IParamServiceCallback;
import uk.ac.york.soprano.sbt.architecture.simulator.IPropertyGetter;
import uk.ac.york.soprano.sbt.architecture.simulator.ValueNotReady;

public class ROSConnectionGetParamTest {
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
		IPropertyGetter getter = rosSim.getPropertyGetter(paramProps);
		IParamServiceCallback res = getter.getAsync();
		
		while (!res.isReady()) {
			try {
				System.out.println("Not ready");
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		Object v;
		try {
			v = res.getValue();		
			System.out.println("ROSConnectionGetParamTest: value received = " + v);
		} catch (ValueNotReady e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Terminating ros connection");
		rosSim.disconnect();

	}

}
