package uk.ac.york.soprano.sbt.architecture.utilities;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class ParsingUtils {

	private static Object navigate(JSONObject obj2, String navField) {
		// if navField ends in [integer] extract from the corresponding array
		if (navField.contains("[")) {
			String indexStr = navField.split("\\[")[1].split("\\]")[0];
			String arrayName = navField.split("\\[")[0];
			int subIndex = Integer.parseInt(indexStr);
			// get the index array
			JSONArray arr = (JSONArray)obj2.get(arrayName);
			return arr.get(subIndex);
		} else {
			return obj2.get(navField);
		}
	}
	
	public static String updateValue(String message, String parameterName, String newValue) {
		JSONObject obj = (JSONObject) JSONValue.parse(message);
//	      JSONArray array = (JSONArray)obj;
//	      JSONObject obj2 = (JSONObject)array.get(0);
		String[] split = parameterName.split("\\.");
		JSONObject obj2 = null;
		for (int i = 1; i < split.length; i++) {
			if (i != split.length - 1) {
				//obj2 = (JSONObject) obj.get(split[i].toLowerCase());
				obj2 = (JSONObject) navigate(obj2, split[i]);
			} else {
				obj2.put(split[i].toLowerCase(), newValue);
				return obj.toString();
			}
		}
		return obj.toString();
	}
	
	public static JSONObject updateJSONObject(JSONObject obj, String parameterName, Object newValue) throws JSONLookupFailed {
		String[] split = parameterName.split("\\.");
		JSONObject obj2 = obj;
		for (int i = 1; i < split.length; i++) {
			if (i != split.length - 1) {
				// obj2 is null, then there will be an invalid value
				//obj2 = (JSONObject) obj2.get(split[i].toLowerCase());
				obj2 = (JSONObject) navigate(obj2, split[i]);
										
				if (obj2 == null) {
					throw new JSONLookupFailed(obj, parameterName, "getField", obj2);
				}
			} else {
				obj2.put(split[i].toLowerCase(), newValue);
				return obj;
			}
		}
		return obj;
	}
	

	
	public static JSONObject updateJSONObject(JSONObject obj, String parameterName, UpdateLambda updateFunc) throws JSONLookupFailed {
		String[] split = parameterName.split("\\.");
		JSONObject obj2 = obj;
		for (int i = 1; i < split.length; i++) {
			if (i != split.length - 1) {
				obj2 = (JSONObject) navigate(obj2, split[i]);
				// navigation failed, obj2 is null, then there will be an invalid value
				if (obj2 == null) {
					throw new JSONLookupFailed(obj, parameterName, "getField", obj2);
				}
			} else {
				Object orig = obj2.get(split[i].toLowerCase());
				obj2.put(split[i].toLowerCase(), updateFunc.op(orig));
				return obj;
			}
		}
		return obj;
	}
	
	public static JSONObject convertJSONObjectPart(JSONObject obj, String parameterStr, ObjectConvertOperation conversionOp) throws JSONLookupFailed {
		String[] split = parameterStr.split("\\.");
		JSONObject obj2 = null;
		for (int i = 1; i < split.length; i++) {
			if (i != split.length - 1) {
				obj2 = (JSONObject) navigate(obj2, split[i]);
				if (obj2 == null) {
					throw new JSONLookupFailed(obj, parameterStr, "getField", obj2);
				}
			} else {
				//Object current = obj2.get(split[i].toLowerCase());
				Object current = navigate(obj2, split[i]);
				obj2.put(split[i].toLowerCase(), conversionOp.op(current));
				return obj;
			}
		}
		return obj;
	}
	
	public static Object getField(JSONObject obj, String parameterStr) throws JSONLookupFailed {
		String[] split = parameterStr.split("\\.");
		JSONObject obj2 = obj;
		for (int i = 0; i < split.length; i++) {
			//Object val = obj2.get(split[i].toLowerCase());
			Object val = navigate(obj2, split[i]);
			if (val == null) {
				throw new JSONLookupFailed(obj, parameterStr, "getField", obj2);
			}
			
			if (val instanceof JSONObject) {
				obj2 = (JSONObject)val;
			}
			if (val instanceof Double) {
				return (Double)val;
			}
			if (val instanceof Integer) {
				return (Integer)val;
			}
		}
		return obj2;
	}
}
