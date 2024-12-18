package uk.ac.york.soprano.sbt.architecture.fuzzingoperations;

import java.io.IOException;

import org.apache.flink.api.common.state.MapState;
import org.apache.flink.api.common.state.MapStateDescriptor;
import org.apache.flink.api.common.state.ValueState;
import org.apache.flink.api.common.state.ValueStateDescriptor;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.streaming.api.functions.co.CoProcessFunction;
import org.apache.flink.util.Collector;

import uk.ac.york.soprano.sbt.architecture.data.EventMessage;
import uk.ac.york.soprano.sbt.architecture.data.MetricMessage;

public abstract class ConditionBasedGeneral extends FuzzingOperation {

	protected MapState<String, Object> varState;
	protected ValueState<Boolean> isActive;
	protected ValueState<Boolean> isTimerSetState;
	protected ValueState<Integer> activationCount;

	protected int maxActivations = 1;

	public boolean isReadyNow() {
		boolean res = false;
		try {
			if (isActive.value() != null) {
				res = isActive.value();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return res;
	}

	public void open(Configuration parameters) throws Exception {
		varState = getRuntimeContext().getMapState(new MapStateDescriptor<>("varState", String.class, Object.class));
		isActive = getRuntimeContext().getState(new ValueStateDescriptor<>("isActive", Boolean.class));
		isTimerSetState = getRuntimeContext().getState(new ValueStateDescriptor<>("isTimerSetState", Boolean.class));
		activationCount = getRuntimeContext().getState(new ValueStateDescriptor<>("activationCount", Integer.class));
	}

	protected void updateStateFrom(MetricMessage value) {
		try {
			String k = value.getMetricName();
			Object v = value.getValue();
			System.out.println("updateStateFrom k=" + k + "," + v);
			varState.put(k, v);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected abstract boolean evalStartCondition();

	public enum ConditionBasedState {
		INACTIVE,
		ACTIVE
	}



	protected boolean shouldActivateByCount() throws IOException {
		if (activationCount.value() == null) {
			activationCount.update(0);
		}

		return (activationCount.value() < maxActivations);
	}

	private static final long serialVersionUID = 1L;

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public ConditionBasedGeneral(String topic) {
		super(topic);
	}

	public void processElement2(MetricMessage value,
			CoProcessFunction<EventMessage, MetricMessage, EventMessage>.Context ctx, Collector<EventMessage> out)
			throws Exception {
		updateStateFrom(value);
		checkConditionState(ctx);
	}

	protected abstract void checkConditionState(
			CoProcessFunction<EventMessage, MetricMessage, EventMessage>.Context ctx);
}
