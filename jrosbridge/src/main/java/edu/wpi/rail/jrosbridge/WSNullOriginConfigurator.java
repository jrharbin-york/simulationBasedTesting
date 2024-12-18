package edu.wpi.rail.jrosbridge;

import java.util.Arrays;
import java.util.Map;
import java.util.List;

import javax.websocket.*;

// JRH: fix for https://github.com/RobotWebTools/rosbridge_suite/issues/488
//
// From Github issue:
// jrosbridge has a couple of options for both maintaining spec conformance (RFC6454, RFC6455) and working with rosbridge/Autobahn:
//
// Omit the Origin field entirely. Autobahn will treat this as "null" origin, which is explicitly allowed by rosbridge since 
//
// Default to supporting local files as we had before Autobahn. #469 which is released in 0.11.5.
// Specify "null" as the Origin value, similarly supported since
// Default to supporting local files as we had before Autobahn. #469. Since jrosbridge is not a browser it is not required to do this, but it is allowed by the spec.

// JRH: this chooses to specify null is the origin value 

public class WSNullOriginConfigurator extends ClientEndpointConfig.Configurator{
    @Override
    public void beforeRequest(Map<String, List<String>> headers) {
        headers.put("Origin", Arrays.asList("null"));
    }

    @Override
    public void afterResponse(HandshakeResponse hr) {
        Map<String, List<String>> headers = hr.getHeaders();
        System.out.println("WSNullOriginConfigurator: headers -> "+headers);
    }
}