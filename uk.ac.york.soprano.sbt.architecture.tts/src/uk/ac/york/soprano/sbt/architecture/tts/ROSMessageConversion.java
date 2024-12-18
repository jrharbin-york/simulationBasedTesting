package uk.ac.york.soprano.sbt.architecture.tts;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Optional;

import com.googlecode.protobuf.format.JsonFormat;

import simlog.server.ROSMessage;

public class ROSMessageConversion {
		
	public static JsonFormat jsf = new JsonFormat();
	public static boolean DEBUG_CONVERSION = false;
	
	/** Optional is used because if the message is not properly formatted or converted,
	 *  empty will be returned. Otherwise, it will return it wrapped in an option */
	public static Optional<ROSMessage> fromJsonString(String s) {
		ROSMessage.Builder rosbuild = ROSMessage.newBuilder();
		InputStream stream = new ByteArrayInputStream(s.getBytes(StandardCharsets.UTF_8));
		try {
			jsf.merge(stream, rosbuild);
			ROSMessage rosmsg = rosbuild.build();
			return Optional.of(rosmsg);
		} catch (IOException e) {
			return Optional.empty();
		}

	}
	
	/** Returns the content wrapped in an option */ 
	public static String toJsonString(ROSMessage m) {
		String jsonString = jsf.printToString(m);
		return jsonString;
	}	
}
