package uk.ac.york.soprano.sbt.architecture.ros;

import edu.wpi.rail.jrosbridge.callback.ServiceCallback;
import edu.wpi.rail.jrosbridge.services.ServiceResponse;

public class ROSSetParamServiceCallback implements ServiceCallback {
        private String paramName;
        private Object paramVal;

        public ROSSetParamServiceCallback(String paramName, Object value) {
                this.paramName = paramName;
                this.paramVal = value;
        }
        
        public void handleServiceResponse(ServiceResponse response) {
                System.out.println("Response received: " + response);
                response.toJsonObject();
                boolean responseOK = response.getResult();
                System.out.println("Service call to set paramName=" + paramName + " -> " + paramVal + " responded: " + responseOK);
        }
}
