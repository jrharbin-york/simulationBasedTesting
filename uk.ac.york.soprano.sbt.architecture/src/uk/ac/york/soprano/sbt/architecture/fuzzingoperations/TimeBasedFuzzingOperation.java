package uk.ac.york.soprano.sbt.architecture.fuzzingoperations;

import org.apache.flink.util.Collector;

import uk.ac.york.soprano.sbt.architecture.data.EventMessage;
import uk.ac.york.soprano.sbt.architecture.data.MetricMessage;
import uk.ac.york.soprano.sbt.architecture.simulator.SimCore;

public abstract class TimeBasedFuzzingOperation extends FuzzingOperation {
	private static final long serialVersionUID = 1L;
	
	protected double start;
	protected double end;

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public double getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public double getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public TimeBasedFuzzingOperation(String topic, double start, double end) {
		super(topic);
		this.start = start;
		this.end = end;
	}
	
	public boolean isReadyNow() {
		double time = SimCore.getInstance().getTime();
		System.out.println("time=" + time + ",start=" + start + ",end=" + end);
		return (time >= start) && (time <= end);
	}
	
	public void processElement2(MetricMessage value, Context ctx, Collector<EventMessage> out) throws Exception {
		// TimeBasedAttacks ignore their metrics
	}
}
