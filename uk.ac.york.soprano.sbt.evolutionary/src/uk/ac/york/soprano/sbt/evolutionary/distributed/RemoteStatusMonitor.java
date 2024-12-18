package uk.ac.york.soprano.sbt.evolutionary.distributed;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

import net.razorvine.pyro.*;
import uk.ac.york.soprano.sbt.evolutionary.InvalidTestCampaign;

public class RemoteStatusMonitor {
	private WorkerNode remoteWorker;
	private RemoteTest remoteTest;
	
	private SOPRANOExperimentManager manager;
	private Optional<RemoteMetricMonitor> metricMonitor;
	
	private Thread statusMonitorThread;
	
	private PyroProxy daemon;
	
	private final int STATUS_MONITOR_MS = 1000;
	
	private boolean statusLoopRunning = true;
	
	private TestStatus previousStatus = TestStatus.PENDING;
	
	public Optional<TestStatus> getStatusFromCode(int value) {
		if (value == 0) return Optional.of(TestStatus.RUNNING);
		if (value == 1) return Optional.of(TestStatus.PENDING);
		if (value == 2) return Optional.of(TestStatus.COMPLETED);
		if (value == 3) return Optional.of(TestStatus.FAILED);
		return Optional.empty();
	}
	
//	private boolean statusIsCompleted(TestStatus s) {
//		return (s != TestStatus.RUNNING);
//	}
	
	public RemoteStatusMonitor(SOPRANOExperimentManager manager, RemoteTest remoteTest, WorkerNode remoteWorker) throws InvalidTestCampaign  {
		// Need to connect to the remote system
		this.remoteWorker = remoteWorker;
		this.remoteTest = remoteTest;
		this.manager = manager;
		RemoteMetricMonitor rmm = new RemoteMetricMonitor(manager, remoteTest, remoteWorker);
		metricMonitor = Optional.of(rmm);	
		
		// Prepare the allocation manager thread
		statusMonitorThread = new Thread() {
			public void run() {
				pollStatusLoop();
			}
		};
	}
	
	public void handleStatusChange(TestStatus newStatus, TestStatus previousStatus) {
		if (newStatus == TestStatus.RUNNING) {
			// Start the metric monitor for this test
			
			if (metricMonitor.isPresent()) {
				RemoteMetricMonitor rmm = metricMonitor.get();
				rmm.start();
			} else {
				System.out.println("Cannot start metric monitor for remote test " + remoteTest.getTestID() + " - it was not created due to earlier error");
			}
		};
		
		if ((newStatus == TestStatus.COMPLETED) || (newStatus == TestStatus.FAILED)) {
			// Stop the metric monitor - notify the completion to remove it from running tests
			if (metricMonitor.isPresent())
			{
				RemoteMetricMonitor rmm = metricMonitor.get();
				rmm.stop();
				try {
					manager.notifyTestCompletion(remoteTest);
					// Once we know it has completed... stop polling for status
					this.stop();
				} catch (TestNotRunning e) {
					e.printStackTrace();
				}
				this.statusLoopRunning = false;
				
			}
		};
	}
	
	public void pollStatusOfTest(RemoteTest t) throws SOPRANORemoteError {
		// Send the registration
		Optional<String> testRunID_o = t.getRunUUID();
		String testID = t.getTestID();
		try {
			if (!testRunID_o.isPresent()) {
				throw new RuntimeException("Test has no run UUID - cannot monitor");
			} else {
				String testRunID = testRunID_o.get();
				Integer result = (Integer)daemon.call("poll_for_status", testRunID, testID);
				int statusCode = result;
				Optional<TestStatus> status_o = getStatusFromCode(statusCode);
				if (status_o.isPresent()) {
					TestStatus status = status_o.get();
					System.out.println("Received status message for test " + t.getTestID() + " on worker " + remoteWorker.getHostname() +  "=" + status);
					t.setStatus(status);
					
					if (status != previousStatus) {
						handleStatusChange(status, previousStatus);
						previousStatus = status;
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void stop() {
		statusLoopRunning = false;
	}
	
	public void start() {
		try {
			// Need to look up a unique daemon object for each monitor thread!
			// getPyroDaemonByHost now does this
			String hostname = remoteWorker.getHostname();
			this.daemon = PyroDaemons.getPyroDaemonByHost(hostname);
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownWorker e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		statusMonitorThread.start();
	}
	
	public void pollStatusLoop() {
		while (statusLoopRunning) {
			try {
				pollStatusOfTest(remoteTest);
				TimeUnit.MILLISECONDS.sleep(STATUS_MONITOR_MS);
				
			} catch (SOPRANORemoteError e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		this.daemon.close();
	}
}

