package uk.ac.york.soprano.sbt.architecture.fuzzingoperations;

import org.apache.flink.streaming.api.functions.co.CoProcessFunction;
import org.apache.flink.util.Collector;

import uk.ac.york.soprano.sbt.architecture.data.EventMessage;
import uk.ac.york.soprano.sbt.architecture.data.MetricMessage;

public abstract class FuzzingOperation extends CoProcessFunction<EventMessage, MetricMessage, EventMessage> {
	private static final long serialVersionUID = 1L;
	
	protected String topic;

	protected String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public FuzzingOperation(String topic) {
		this.topic = topic;
	}
	
	protected abstract String getUniqueID();

	abstract public boolean isReadyNow();

	public abstract void processElement1(EventMessage value, Context ctx, Collector<EventMessage> out) throws Exception;
	public abstract void processElement2(MetricMessage value, Context ctx, Collector<EventMessage> out) throws Exception;
	
	public void preprocessing() {
		System.out.println("FuzzingOperation: empty preprocessing phase");
	}
}
