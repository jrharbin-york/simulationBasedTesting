package uk.ac.york.soprano.sbt.architecture.metrics.flink;

import java.io.IOException;

import org.apache.flink.configuration.Configuration;
import org.apache.flink.streaming.api.functions.sink.RichSinkFunction;

import net.razorvine.pyro.NameServerProxy;
import net.razorvine.pyro.PyroProxy;
import uk.ac.york.soprano.sbt.architecture.data.*;

public class PyroMetricFlinkSink extends RichSinkFunction<MetricMessage> {
	private static final long serialVersionUID = 1L;
	
	private final boolean DEBUG_PYRO_COMMS = false;
	
	private PyroProxy metricDaemon;
	private NameServerProxy ns_single;
	
	private String nsHostname;
	private int nsPort;
	private String testID;
	private String workerPyroName;
	
	public PyroMetricFlinkSink(String testID, String nsHostname, int nsPort, String workerPyroName) {
		this.nsHostname = nsHostname;
		this.nsPort = nsPort;
		this.workerPyroName = workerPyroName;
		this.testID = testID;			
	}
	
	@Override
	public void open(Configuration parameters) {
		try {
			super.open(parameters);
		} catch (Exception e) {
			e.printStackTrace();
			e.printStackTrace(System.out);
		}
	    // Initialize resources (e.g., database connections, file writers)
		
		try {
			this.ns_single = NameServerProxy.locateNS(nsHostname, nsPort);
			// We always connect to the worker metric holder with the current test ID
			//this.metricDaemon = new PyroProxy(ns_single.lookup("MetricValueHistory" + "_" + testID));
			// TODO: put in hostname/IP for worker
			this.metricDaemon = new PyroProxy(ns_single.lookup(workerPyroName));
			System.out.println("metricDaemon setup for Pyro");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("metricDaemon FAILED setup for Pyro");
			System.err.println("metricDaemon FAILED setup for Pyro");
			e.printStackTrace();
			e.printStackTrace(System.out);
		}
	}
	
	private void sendMetricMessage(String metricName, Double value, double timestamp) {
    	// TODO: can we get the runUUID here? as a parameter passed from the daemon?
    	try {
    		if (DEBUG_PYRO_COMMS) {
    			System.out.println("metricName=" + metricName + ",value=" + value + ",timeStamp" + timestamp);
    		}
    		
    		Object result = metricDaemon.call("update_metric", testID, metricName, value, timestamp);
    		
    		if (DEBUG_PYRO_COMMS) {
    			System.out.println("PyroMetricFlinkSink invoke result code: " + result);
    		}
    	} catch (Exception e) {
    		e.printStackTrace();
    		// This is to ensure the Pyro exception is logged to the stdout logs as well 
    		System.out.println("Pyro exception:");
    		e.printStackTrace(System.out);
    	}
	}
	
	public void __test_sendMetricMessage(String metricName, Double value, double timestamp) {
		sendMetricMessage(metricName, value, timestamp);
	}
	
	@Override
    public void invoke(MetricMessage mmsg, Context context) {
    	//System.out.println("invoke pyro sink");
        // Get Pyro object for "MetricValueHolder" for local IP
    	// TODO: can we get the runUUID here? as a parameter passed from the daemon?
    	String metricName = mmsg.getMetricName();
    	Double value = (Double)mmsg.getValue();
    	double timestamp = mmsg.getTimestamp();
    	sendMetricMessage(metricName, value, timestamp);
    }
	
	/** Ensure the proxy is released at the end of the experiment, otherwise, longer-running
	 *  experiments will eventually exhaust the Pyro thread pool! **/
	public void releaseProxy() {
		metricDaemon.close();
	}
}