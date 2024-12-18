package uk.ac.york.soprano.sbt.architecture.data;

import java.util.HashMap;

public abstract class DataStream implements IData {

	public abstract DataStream consume();

	public abstract void publish(Object value);

	HashMap<String, Object> queueProducers = new HashMap<String, Object>();
	HashMap<String, Object> queueConsumers = new HashMap<String, Object>();

	public HashMap<String, Object> getQueueProducers() {
		return queueProducers;
	}

	public void setQueueProducers(HashMap<String, Object> queueProducers) {
		this.queueProducers = queueProducers;
	}

	public HashMap<String, Object> getQueueConsumers() {
		return queueConsumers;
	}

	public void setQueueConsumers(HashMap<String, Object> queueConsumers) {
		this.queueConsumers = queueConsumers;
	}

}
