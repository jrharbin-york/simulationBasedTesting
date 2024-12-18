package uk.ac.york.soprano.sbt.evolutionary.distributed;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import net.razorvine.pyro.PyroException;
import net.razorvine.pyro.PyroProxy;

public class WorkerNode {
	private String hostname;
	private PyroProxy daemon;
	private String exptRunID;
	
	public Optional<PreInitCheckStatus> getStatusFromCode(int value) {
		if (value == 0) return Optional.of(PreInitCheckStatus.DEPS_OK);
		if (value == 1) return Optional.of(PreInitCheckStatus.MISSING_DEP);
		return Optional.empty();
	}
	
	public WorkerNode(String ipAddress) throws UnknownWorker {
		this.hostname = ipAddress.replace(".", "_");
		
		try {
			System.out.println("Getting Pyro daemon at hostname " + hostname);
			this.daemon = PyroDaemons.getPyroDaemonByHost(hostname);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getHostname() {
		return hostname;
	}
	
	public PyroProxy getDaemon() {
		return daemon;
	}
	
	public void initExperimentOnNode(SOPRANODistributedExperiment expt) throws PreInitFailed {
		String campaignID = expt.getCampaign().getName();
		Map<String, List<String>> deps = expt.getDependencies();
		try {
			System.out.println(deps);
			System.out.println("Sending pre-initialization for experiment " + campaignID);
			Object result = daemon.call("pre_init_experiment", campaignID, deps);
			// If the object is an array... first element is the code, the second the run ID
			if (result instanceof ArrayList) {
				int resCode = (Integer)((ArrayList)result).get(0);
				this.exptRunID = (String)((ArrayList)result).get(1);
				Optional<PreInitCheckStatus> status_o = getStatusFromCode(resCode);
				if (status_o.isPresent()) {
					PreInitCheckStatus status = status_o.get();
					if (status == PreInitCheckStatus.MISSING_DEP) {
						throw new PreInitFailed(status);
					}
				}
			}
		} catch (PyroException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void terminateExperimentOnNode(SOPRANODistributedExperiment expt) {
		String campaignID = expt.getCampaign().getName();
		String urunID = this.exptRunID;
		try {
			Integer result = (Integer)daemon.call("terminate_experiment", campaignID, urunID);
			// TODO: check status
		} catch (PyroException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void submitTest(RemoteTest t) throws SOPRANORemoteError {
		String testIDClass = t.getTestID();
		try {
			Object result = daemon.call("submit_test", testIDClass);
			String testRunID = (String)result;
			t.registerRunID(testRunID);
			System.out.println("Submitting test to worker " + this + "... received run ID from dameon " + testRunID);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void daemonGetVersion() {
		Object res;
		try {
			res = daemon.call("get_version_id");
			System.out.println("get_version_id result=" + (Double)res);
		} catch (PyroException | IOException e) {
			e.printStackTrace();
		}
	}
}
