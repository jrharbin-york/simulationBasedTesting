package uk.ac.york.soprano.sbt.architecture.metrics;

import org.apache.flink.streaming.api.functions.co.CoProcessFunction;
import org.apache.flink.util.Collector;

import uk.ac.york.soprano.sbt.architecture.data.ControlMessage;
import uk.ac.york.soprano.sbt.architecture.data.EventMessage;
import uk.ac.york.soprano.sbt.architecture.data.MetricMessage;

/** This metric message type can provide direct metric messages **/
public abstract class DirectMessageGenerationMetric extends CoProcessFunction<EventMessage, ControlMessage, MetricMessage> {

	private static final long serialVersionUID = 1L;
	
	public abstract void processElement2(ControlMessage controlMsg, CoProcessFunction<EventMessage, ControlMessage, MetricMessage>.Context arg1, Collector<MetricMessage> arg2);
}