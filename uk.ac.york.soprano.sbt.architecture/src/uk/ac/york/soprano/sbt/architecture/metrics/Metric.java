package uk.ac.york.soprano.sbt.architecture.metrics;

import org.apache.flink.streaming.api.functions.co.CoProcessFunction;
import org.apache.flink.util.Collector;

import uk.ac.york.soprano.sbt.architecture.data.ControlMessage;
import uk.ac.york.soprano.sbt.architecture.data.EventMessage;

public abstract class Metric extends CoProcessFunction<EventMessage, ControlMessage, Double> {

	private static final long serialVersionUID = 1L;
	
	protected void metricLog(String str) {
		System.out.println(this.getClass().getCanonicalName() + ":" + str);
	}
	
	// Default is no response to control message
	public void processElement2(ControlMessage controlMsg, CoProcessFunction<EventMessage, ControlMessage, Double>.Context arg1, Collector<Double> arg2) throws Exception {
		
	}
}