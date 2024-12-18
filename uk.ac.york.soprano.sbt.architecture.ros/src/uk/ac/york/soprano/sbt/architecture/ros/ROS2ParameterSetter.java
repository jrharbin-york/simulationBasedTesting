package uk.ac.york.soprano.sbt.architecture.ros;

import edu.wpi.rail.jrosbridge.Ros;
import edu.wpi.rail.jrosbridge.Service;
import edu.wpi.rail.jrosbridge.services.ServiceRequest;
import uk.ac.york.soprano.sbt.architecture.simulator.IPropertySetter;
import uk.ac.york.soprano.sbt.architecture.simulator.ParameterGetTimedOut;

public class ROS2ParameterSetter extends ROS2ParameterInterface implements IPropertySetter {

	// Include an internal property getter to retrieve original value
	private ROS2ParameterGetter getter;
	private Object originalValue;
	private boolean isSet = false;
	private boolean isRestored = false;
	
	private String srvName;
	private String srvType = "rcl_interfaces/srv/SetParameters";
	private Service srv;
	
	public ROS2ParameterSetter(String componentName, String paramName, Ros ros) {
		super(componentName, paramName, ros);
		srvName = componentName + "/set_parameters";
		srv = new Service(this.ros, srvName, srvType);
		getter = new ROS2ParameterGetter(componentName, paramName, ros);
	}
	
	private String parametersStrForDouble(Double dv) {
		//https://docs.ros2.org/foxy/api/rcl_interfaces/msg/ParameterValue.html
		int paramTypeNum = 3;
		String paramStr = "{\"name\" : \"" + paramName + "\", \"value\" : { \"type\": " + Integer.toString(paramTypeNum) + ", \"double_value\" : " + Double.toString(dv) + "}}";
		return paramStr;
	}
	
	private String parametersStrForInteger(Integer value) {
		//https://docs.ros2.org/foxy/api/rcl_interfaces/msg/ParameterValue.html
		int paramTypeNum = 2;
		String paramStr = "{\"name\" : \"" + paramName + "\", \"value\" : { \"type\": " + Integer.toString(paramTypeNum) + ", \"integer_value\" : " + Integer.toString((Integer)value) + "}}";
		return paramStr;
	}
	
	private String parameterStrForSet(Object value) throws UnknownTypeForParameter {
		String paramStr = "";
		if (value instanceof Double) {
			paramStr = parametersStrForDouble((Double)value);
		}
		
		if (value instanceof Integer) {
			paramStr = parametersStrForInteger((Integer)value);
		}
		
		if (paramStr == "") {
			throw new UnknownTypeForParameter(value);
		}
		
		String paramSRVContent = "{\"parameters\": [" + paramStr + "]}";
		return paramSRVContent;
	}
	
	private void internalSet(Object value) {
		String paramSRVContent;
		try {
			paramSRVContent = parameterStrForSet(value);
			ServiceRequest rq = new ServiceRequest(paramSRVContent);
			// TODO: handle failure status from the service call
			System.out.println("PARAM: internalSet() in ROS2ParamSetter called for " + this.toString());
			srv.callService(rq, new ROSSetParamServiceCallback(paramName, value));
			System.out.println("PARAM: set callback in ROS2ParamSetter completed");
		} catch (UnknownTypeForParameter e) {
			System.err.println("Unknown type for parameter: " + e.toString() + "-" + this.toString());
			e.printStackTrace();
		}
	}
	
	@Override
	public void set(Object value) {
		// Need to store the original value
		try {
			System.out.println("PARAM: set() in ROS2ParamSetter called for " + this.toString() + " - calling getter to record original value");
			originalValue = getter.getSync();
			System.out.println("PARAM: originalValue in ROS2ParamSetter.set for " + paramName + " = " + originalValue);
		} catch (ParameterGetTimedOut e) {
			e.printStackTrace();
		}
		
		// TODO: do we need a wait before calling here?
		internalSet(value);
		isSet = true;
	}
	
	@Override
	public void setRelative(Object value) {
		// Need to store the original value
		try {
			System.out.println("set called for " + this.toString());
			originalValue = getter.getSync();
			System.out.println("originalValue for " + paramName + " = " + originalValue);
		} catch (ParameterGetTimedOut e) {
			e.printStackTrace();
		}
		
		// TODO: do we need a wait before calling here?
		internalSet(value);
		isSet = true;
	}
	
	public void restoreOriginalValue() {
		internalSet(originalValue);
		isRestored = true;
	}

	@Override
	public boolean isSet() {
		return isSet;
	}
	
	@Override
	public boolean isRestored() {
		return isRestored;
	}

}
