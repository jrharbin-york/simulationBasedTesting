package uk.ac.york.soprano.sbt.architecture.ros;

import edu.wpi.rail.jrosbridge.Ros;

public class ROS2ParameterInterface {
	protected String componentName;
	protected String paramName;	
	protected Ros ros;
	
	public ROS2ParameterInterface(String componentName, String paramName, Ros ros) {
		this.componentName = componentName;
		this.paramName = paramName;
		this.ros = ros;
	}
}
