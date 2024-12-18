package uk.ac.york.soprano.sbt.architecture.data;

import java.io.IOException;

import org.apache.flink.api.common.serialization.DeserializationSchema;
import org.apache.flink.api.common.serialization.SerializationSchema;
import org.apache.flink.api.common.typeinfo.TypeInformation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ControlMessageSchema implements DeserializationSchema<ControlMessage>, SerializationSchema<ControlMessage> {

	private static final long serialVersionUID = 1L;
	static ObjectMapper objectMapper = new ObjectMapper();
	@Override
	public TypeInformation<ControlMessage> getProducedType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ControlMessage deserialize(byte[] message) throws IOException {
		return objectMapper.readValue(message, ControlMessage.class);
	}

	@Override
	public boolean isEndOfStream(ControlMessage nextElement) {
		return false;
	}

	@Override
	public byte[] serialize(ControlMessage element) {
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
