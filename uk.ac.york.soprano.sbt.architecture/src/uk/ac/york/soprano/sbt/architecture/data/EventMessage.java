package uk.ac.york.soprano.sbt.architecture.data;

import java.time.Instant;
import java.util.Map;

import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serializer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EventMessage implements IData, Serializer, Deserializer {
	
	private static ObjectMapper objectMapper = new ObjectMapper();
	
	String id;
	Object value;
	long timestamp;
	// Records the wall-clock time of the arrival of this message
	long IN_walltime;
	
	// This is only used for debugging specific operations, e.g. the ordering of delay operations
	long debugSequenceNumber;
	
	// When using delay operations, records the start time of message
	double simTimeIn; 
	String topic;
	String type;
	
	public EventMessage() {
		
	}
	
	public void setDebugSequenceNumber(long seqnum) {
		this.debugSequenceNumber = seqnum;
	}
	
	public long getDebugSequenceNumber() {
		return debugSequenceNumber;
	}
	
	public void setSimTimeIn(double time) {
		this.simTimeIn = time;
	}
	
	public double getSimTimeIn() {
		return simTimeIn;
	}
	
	public EventMessage(EventMessage other) {
		this.id = other.id;
		this.value = other.value;
		this.timestamp = other.timestamp;
		this.IN_walltime = other.IN_walltime;
		this.topic = other.topic;
		this.type = other.type;
	}
	
	public EventMessage(String topicName, String topicType, Object val) {
		this.topic = topicName;
		this.type = topicType;
		this.value = val;
	}
	
	private long getWallTime() {
		Instant instant = Instant.now();
		long timeStampMillis = instant.toEpochMilli();
		return timeStampMillis;
	}
	
	public void setIN_walltime(long specific) {
		this.IN_walltime = specific;
	}
	
	public long getIN_walltime() {
		return this.IN_walltime;
	}
	
	public void setIN_walltime_from_current() {
		if (this.IN_walltime == 0) {
			this.IN_walltime = getWallTime();
		} 
	}
		
	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public byte[] serialize(String arg0, Object arg1) {
		return convertObjectToByteArray(arg1);
	}
	
	public byte[] convertObjectToByteArray(Object obj) {
		byte[] serializedDataArray = null;
		try {
			if (obj != null) {
				serializedDataArray = objectMapper.writeValueAsBytes(obj);
//				 System.out.println(gson.toJson(serializedDataArray));
				// serializedDataArray = gson.toJson(obj).getBytes();
			}
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		return serializedDataArray;
	}
	
	@Override
	public String toString() {
		return "EventMessage (id: " + this.id + ", value: " + this.value + ", topic: " + this.topic + ", timestamp" + this.timestamp + ", type: " + this.type +")";
	}

	@Override
	public Object deserialize(String arg0, byte[] data) {
		EventMessage em = null;
		try {
			if (data != null) {
				em = (EventMessage) objectMapper.readValue(data, EventMessage.class);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return em;
	}

	@Override
	public void configure(Map configs, boolean isKey) {
		// TODO Auto-generated method stub
		Serializer.super.configure(configs, isKey);
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		Serializer.super.close();
	}
}
