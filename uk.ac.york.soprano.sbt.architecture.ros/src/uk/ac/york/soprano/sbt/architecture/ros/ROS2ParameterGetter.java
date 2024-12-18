package uk.ac.york.soprano.sbt.architecture.ros;
import edu.wpi.rail.jrosbridge.Ros;
import edu.wpi.rail.jrosbridge.Service;
import edu.wpi.rail.jrosbridge.services.ServiceRequest;
import uk.ac.york.soprano.sbt.architecture.simulator.*;

public class ROS2ParameterGetter extends ROS2ParameterInterface implements IPropertyGetter {

	private String srvName;
	private String srvType = "rcl_interfaces/srv/GetParameters";
	private Service srv;
	private final int SYNC_WAIT_BEFORE_RETRY_MSEC = 100;
	
	public ROS2ParameterGetter(String componentName, String paramName, Ros ros) {
		super(componentName, paramName, ros);
		srvName = componentName + "/get_parameters";
		srv = new Service(this.ros, srvName, srvType);
	}

	@Override
	public IParamServiceCallback getAsync() {
		// TODO: only doing integer parameters
		int paramTypeNum = 2;
		String paramSRVContent = "{\"names\": [\"" + paramName + "\"]}";
		System.out.println(paramSRVContent);
		System.out.println("PARAM: getAsync() called - making service call " + paramSRVContent);
		ServiceRequest rq = new ServiceRequest(paramSRVContent);
		ROSGetParamServiceCallback callback = new ROSGetParamServiceCallback(paramName);
		srv.callService(rq, callback);
		System.out.println("PARAM: getAsync() called - making service call " + paramSRVContent);
		return callback;
	}

	@Override
	public Object getSync() throws ParameterGetTimedOut {
		// Wait until the async value is ready
		// TODO: add a timeout here!
		IParamServiceCallback resCallback = getAsync();
		while (!resCallback.isReady()) {
			try {
				System.out.println("PARAM: waiting for service call result");
				Thread.sleep(SYNC_WAIT_BEFORE_RETRY_MSEC);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		try {
			Object orig = resCallback.getValue();
			System.out.println("PARAM: get service call returned " + orig.toString());
			return orig;
		} catch (ValueNotReady e) {
			// TODO: ROS specific type here...
			System.err.println("Value not ready");
			e.printStackTrace(System.err);
			throw new ParameterGetTimedOut();
		} 
	}
}
