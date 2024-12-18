package uk.ac.york.soprano.sbt.architecture.ros.test;

import java.util.HashMap;

import uk.ac.york.soprano.sbt.architecture.config.ConnectionProperties;
import uk.ac.york.soprano.sbt.architecture.ros.ROSSimulator;
import uk.ac.york.soprano.sbt.architecture.simulator.SubscriptionFailure;

public class ROSConnectionTest {

	public static void main(String[] args) {
		ROSSimulator rosSim = new ROSSimulator();
		ConnectionProperties cp = new ConnectionProperties();
		HashMap<String, Object> propsMap = new HashMap<String, Object>();
		propsMap.put(ConnectionProperties.HOSTNAME, "0.0.0.0");
		propsMap.put(ConnectionProperties.PORT, 9090);
		cp.setProperties(propsMap);
		rosSim.connect(cp);
		System.out.println("Connected to rosbridge");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		rosSim.debugEnsureDisplayMessages();

		Thread test_read_chatter = new Thread() {
			public void run() {
				try {
					rosSim.consumeFromTopic("/chatter", "std_msgs/String", true, "IN", true);
				} catch (SubscriptionFailure e) {
					System.out.println("Subscription to /chatter Failed - Continuing");
				}
			}

		};
		test_read_chatter.start();

		try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Terminating ros connection");
		rosSim.disconnect();

	}

}
