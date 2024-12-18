package uk.ac.york.soprano.sbt.evolutionary.test;

import uk.ac.york.soprano.sbt.architecture.data.ControlMessage;
import uk.ac.york.soprano.sbt.evolutionary.ControlProducer;

public class TestControlProducerMessage {
	public static void main(String [] args) {
		ControlProducer cp = new ControlProducer();
		cp.send(ControlMessage.CONTROL_COMMAND.GET_OPERATION_RECORDED_TIMINGS);
		cp.close();
		System.out.println("Control message GET_OPERATION_RECORDED_TIMINGS sent");	
	}
}