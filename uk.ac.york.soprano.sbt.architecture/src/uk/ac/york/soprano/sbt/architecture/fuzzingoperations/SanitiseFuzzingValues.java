package uk.ac.york.soprano.sbt.architecture.fuzzingoperations;

import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.util.Collector;

import org.json.simple.*;

import uk.ac.york.soprano.sbt.architecture.data.EventMessage;

// TODO: this only processes ranges in the base_scan
// Try removing nulls from the values
public class SanitiseFuzzingValues implements FlatMapFunction<EventMessage, EventMessage> {

	private static final long serialVersionUID = 1L;
	private static final boolean DEBUG_MESSAGE_CLEANING = false;
	private static final Object RANGE_MAX_VALUE = 10000.0;
	
	public SanitiseFuzzingValues() {
		
	}
	
	public void flatMap(EventMessage value, Collector<EventMessage> out) {
		String targetTopic = "base_scan";
		String topic = value.getTopic();
		if (topic.contains(targetTopic)) {
			Object obj = JSONValue.parse(value.getValue().toString());
      		JSONObject jo = (JSONObject)obj;
      		
			if (DEBUG_MESSAGE_CLEANING) {
				System.out.println(this.getClass().getName() + ": JSONFuzzingOperation.fuzzTransformString received message JSON " + jo.toString());
			}
			
			JSONObject joNew = transformPathMessage(jo);
			EventMessage valueOut = new EventMessage(value);
			valueOut.setValue(joNew.toString());
			
			if (DEBUG_MESSAGE_CLEANING) {
				System.out.println(this.getClass().getName() +  ": JSONFuzzingOperation.fuzzTransformMessage modified it to " + joNew.toString());
			}
			
			out.collect(valueOut);
		} else {
			out.collect(value);
		}
	}

	private JSONObject transformPathMessage(JSONObject jo) {
		JSONArray ja = (JSONArray) jo.get("ranges");
		sanitisePathArray(ja);
		return jo;
	}
	
	private JSONArray sanitisePathArray(JSONArray j) {
		// Remove null values from the ranges
		int pointCount = j.size();
		for (int i = 0; i < pointCount; i++) {
			Double originalRange = (Double)j.get(i);
			if (originalRange == null) {
				j.set(i, RANGE_MAX_VALUE);
			}
		}
		return j;
	}
}