package uk.ac.york.soprano.sbt.architecture.ros.test;

import java.util.HashMap;

import uk.ac.york.soprano.sbt.architecture.config.ConnectionProperties;
import uk.ac.york.soprano.sbt.architecture.data.EventMessage;
import uk.ac.york.soprano.sbt.architecture.ros.ROSSimulator;

public class ROSMessageOutTest {

	public static EventMessage createCustomMessage() {
		String topicType = "std_msgs/Bool";
		//String topicName = "/pmb2_1/pause_navigation";
		String topicName = "/out_msg_topic";
		String value = "{\"data\": true }";
		EventMessage em = new EventMessage(topicName, topicType, value);
		return em;
	}
	
	public static void main(String[] args) {
		ROSSimulator rosSim = new ROSSimulator();
		ConnectionProperties cp = new ConnectionProperties();
		HashMap<String, Object> propsMap = new HashMap<String, Object>();
		propsMap.put(ConnectionProperties.HOSTNAME, "0.0.0.0");
		propsMap.put(ConnectionProperties.PORT, 9090);
		cp.setProperties(propsMap);
		rosSim.connect(cp);
		System.out.println("Connected to rosbridge");

		EventMessage em = createCustomMessage();
		rosSim.publishToTopic(em.getTopic(), em.getType(), em.getValue().toString());
		
		rosSim.debugEnsureDisplayMessages();

		System.out.println("Terminating ros connection");
		rosSim.disconnect();

	}

}
