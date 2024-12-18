package uk.ac.york.soprano.sbt.evolutionary.distributed;

import java.io.IOException;
import java.net.UnknownHostException;

import java.util.HashMap;

import java.util.Map;

import java.util.concurrent.TimeUnit;

import net.razorvine.pyro.*;
import uk.ac.york.soprano.sbt.architecture.data.MetricMessage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign;
import uk.ac.york.soprano.sbt.evolutionary.InvalidTestCampaign;
import uk.ac.york.soprano.sbt.evolutionary.SESAMETestSolution;

public class RemoteMetricMonitor {
	
	private static final long METRIC_MONITOR_SETUP_DELAY_MS = 5000;
	private static final boolean UPDATE_DSL_METRICS_DYNAMICALLY = true;
	private static final boolean SAVE_MODEL_DYNAMICALLY = true;
	private WorkerNode remoteWorker;
	private RemoteTest remoteTest;
	
	private PyroMetricConsumer metricConsumer;
	
	private SOPRANOExperimentManager manager;
	private Thread metricMonitorThread;
	private PyroProxy metricDaemon;
	
	private final int METRIC_MONITOR_MS = 3000;
	
	private boolean metricLoopRunning = false;
	
	public RemoteMetricMonitor(SOPRANOExperimentManager manager, RemoteTest remoteTest, WorkerNode remoteWorker) throws InvalidTestCampaign  {
		// Need to connect to the remote system
		this.remoteWorker = remoteWorker;
		this.remoteTest = remoteTest;
		this.manager = manager;
		
		SESAMETestSolution sol = remoteTest.getSolution();
		TestCampaign selectedCampaign = remoteTest.getSolution().getInternalType().getParentCampaign();
		if (selectedCampaign == null) {
			throw new InvalidTestCampaign();
		}
		
		try {
			this.metricConsumer = new PyroMetricConsumer(selectedCampaign, sol);
		} catch (InvalidTestCampaign e) {
			e.printStackTrace();
		}
		
		// Prepare the allocation manager thread
		metricMonitorThread = new Thread() {
			public void run() {
				pollMetricLoop();
			}
		};
	}
	
	public void updateMetricsToConsumer(HashMap<String,Object> metricData) {
		// Update the metric values from this hashmap by converting to metric messages
		for (Map.Entry<String, Object> me : metricData.entrySet()) {
			String metricName = me.getKey();
			Object value = me.getValue();
			String testID = remoteTest.getTestID();
			if (value instanceof Double) {
				Double v = (Double)value;
				MetricMessage msg = new MetricMessage(testID, metricName, v);
				System.out.println("created MetricMessage = " + msg.toString());
				metricConsumer.storeArrivingMessage(msg);
			}
		}
	}
	
	public void pollMetricsForTest() throws SOPRANORemoteError {
		try {
			String testID = remoteTest.getTestID();
			Object result = metricDaemon.call("get_all_metrics", testID);
			System.out.println("pollMetricsForTest for test " + testID + ": results = " + result + ",result class=" + result.getClass());
			if (result instanceof HashMap) {
				HashMap<String,Object> metricData = (HashMap<String,Object>)result;
				updateMetricsToConsumer(metricData);
			}
			
			if (UPDATE_DSL_METRICS_DYNAMICALLY) {
				metricConsumer.updateDSLDynamically();
				if (SAVE_MODEL_DYNAMICALLY) {
					manager.dynamicallySaveModel();
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void stop() {
		// TODO: need to do one final poll here to ensure the metrics are updated at the end of simulation
		// will also have to add a delay to the worker, or ensure previous metric results are still held
		metricLoopRunning = false;
		metricConsumer.finaliseUpdates();				
		// TODO: finalise metrics for worker
	}
	
	public void start() {
		
		try {
			
			try {
				TimeUnit.MILLISECONDS.sleep(METRIC_MONITOR_SETUP_DELAY_MS);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			String hostname = remoteWorker.getHostname();
			this.metricDaemon = PyroDaemons.getPyroDaemonByHost(hostname);

			metricLoopRunning = true;
			metricMonitorThread.start();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (UnknownWorker e) {
			e.printStackTrace();
		}
	}
	
	public void pollMetricLoop() {
		while (metricLoopRunning) {
			try {
				pollMetricsForTest();
				TimeUnit.MILLISECONDS.sleep(METRIC_MONITOR_MS);	
			} catch (SOPRANORemoteError e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		metricDaemon.close();
	}
}

