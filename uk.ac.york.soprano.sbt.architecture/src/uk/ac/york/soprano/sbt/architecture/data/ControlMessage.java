package uk.ac.york.soprano.sbt.architecture.data;

import java.util.Map;

import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serializer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ControlMessage implements IData, Serializer, Deserializer {

	private static long controlMessageCounter = 0;
	private static ObjectMapper objectMapper = new ObjectMapper();

	public enum CONTROL_COMMAND {
		END_SIMULATION, GET_OPERATION_RECORDED_TIMINGS
		// Other control commands here - need to set up in commandToString
	}

	public class UnknownCommand extends Exception {
		private static final long serialVersionUID = 1L;
		private CONTROL_COMMAND cmd;

		public UnknownCommand(CONTROL_COMMAND cmd) {
			this.cmd = cmd;
		}
	}

	Long id = controlMessageCounter++;
	String testID;
	long timestamp;
	private CONTROL_COMMAND command;

	public ControlMessage() {

	}

	public ControlMessage(ControlMessage other) {
		this.id = other.id;
		this.testID = other.testID;
		this.timestamp = other.timestamp;
		this.command = other.command;
	}

	public ControlMessage(CONTROL_COMMAND cmd) {
		this();
		this.command = cmd;
	}

	public boolean containsCommand(CONTROL_COMMAND cmd) {
		return this.command.equals(cmd);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
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
			}
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		return serializedDataArray;
	}

	@Override
	public String toString() {
		try {
			return "ControlMessage (id: " + this.id + ", value: " + timestamp + " + timestamp " + command
					+ commandToString(this.command);
		} catch (UnknownCommand e) {
			e.printStackTrace();
			return "INVALID-COMMAND";
		}
	}

	private String commandToString(CONTROL_COMMAND cmd) throws UnknownCommand {
		if (cmd == CONTROL_COMMAND.END_SIMULATION) {
			return "END_SIMULATION";
		}

		if (cmd == CONTROL_COMMAND.GET_OPERATION_RECORDED_TIMINGS) {
			return "GET_OPERATION_RECORDED_TIMINGS";
		}
		throw new UnknownCommand(cmd);
	}

	@Override
	public Object deserialize(String arg0, byte[] data) {
		ControlMessage em = null;
		try {
			if (data != null) {
				em = (ControlMessage) objectMapper.readValue(data, ControlMessage.class);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return em;
	}

	@Override
	public void configure(Map configs, boolean isKey) {
		Serializer.super.configure(configs, isKey);
	}

	@Override
	public void close() {
		Serializer.super.close();
	}
}
