package uk.ac.york.soprano.sbt.evolutionary.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import uk.ac.york.soprano.sbt.architecture.data.MetricMessage;

public class TestMetricMessages {
	public static void main(String [] args ) {
		MetricMessage msg = new MetricMessage("testID_866", "attackR3200", 3.63);
		msg.setSpecialInfo("START");
		System.out.println("msg = " + msg);
		ObjectMapper objectMapper = new ObjectMapper();
				
		try {
			String written = objectMapper.writeValueAsString(msg);
			System.out.println("out = " + written);
			MetricMessage msg2 = objectMapper.readValue(written, MetricMessage.class);
			System.out.println("msg2 = " + msg2);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
