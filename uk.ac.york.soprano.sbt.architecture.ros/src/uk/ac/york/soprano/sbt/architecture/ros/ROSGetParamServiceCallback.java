package uk.ac.york.soprano.sbt.architecture.ros;

import edu.wpi.rail.jrosbridge.callback.ServiceCallback;
import edu.wpi.rail.jrosbridge.services.ServiceResponse;
import uk.ac.york.soprano.sbt.architecture.simulator.IParamServiceCallback;
import uk.ac.york.soprano.sbt.architecture.simulator.ValueNotReady;

import java.util.Optional;

import javax.json.*;

public class ROSGetParamServiceCallback implements IParamServiceCallback, ServiceCallback {

	private String paramName;
	private boolean ready = false;
	private Optional<Object> value = Optional.empty();
	
	public ROSGetParamServiceCallback(String paramName) {
		this.paramName = paramName;
	}

	@Override
	public void handleServiceResponse(ServiceResponse response) {
        System.out.println("Response received: " + response);
        // TODO: handling based upon parameter type
        boolean responseOK = response.getResult();
        JsonObject resJson = response.toJsonObject();
        JsonArray jaVals = resJson.getJsonArray("values");
        JsonObject valDetails = (JsonObject)jaVals.get(0);
        int intVal = valDetails.getInt("integer_value");
        System.out.println("Value received = " + intVal);
        value = Optional.of(intVal);
        System.out.println("Service call to get paramName=" + paramName + " responded: " + responseOK);
        ready = true;
	}

	@Override
	public Object getValue() throws ValueNotReady {
		if (value.isPresent()) {
			return value.get();
		} else {
			throw new ValueNotReady(paramName);
		}
	}

	@Override
	public boolean isReady() {
		return ready;
	}

}
