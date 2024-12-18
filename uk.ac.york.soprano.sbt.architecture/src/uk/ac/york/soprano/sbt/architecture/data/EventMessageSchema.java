package uk.ac.york.soprano.sbt.architecture.data;

import java.io.IOException;

import org.apache.flink.api.common.serialization.DeserializationSchema;
import org.apache.flink.api.common.serialization.SerializationSchema;
import org.apache.flink.api.common.typeinfo.TypeInformation;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.core.JsonProcessingException;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.databind.ObjectMapper;

public class EventMessageSchema implements DeserializationSchema<EventMessage>, SerializationSchema<EventMessage> {

	static ObjectMapper objectMapper = new ObjectMapper();
	@Override
	public TypeInformation<EventMessage> getProducedType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EventMessage deserialize(byte[] message) throws IOException {
		return objectMapper.readValue(message, EventMessage.class);
	}

	@Override
	public boolean isEndOfStream(EventMessage nextElement) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public byte[] serialize(EventMessage element) {
		if(objectMapper == null) {
            objectMapper = new ObjectMapper();
        }
        try {
            return objectMapper.writeValueAsString(element).getBytes();
        } catch (JsonProcessingException e) {
			e.printStackTrace();
		}
        return new byte[0];
	}

}
