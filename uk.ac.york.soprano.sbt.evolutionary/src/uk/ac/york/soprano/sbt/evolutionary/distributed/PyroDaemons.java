package uk.ac.york.soprano.sbt.evolutionary.distributed;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.razorvine.pyro.NameServerProxy;
import net.razorvine.pyro.PyroException;
import net.razorvine.pyro.PyroProxy;

public class PyroDaemons {
	
	// TODO: Name server for Pyro
	private static String DEFAULT_NS_HOSTNAME = "192.168.1.238";
	private static int DEFAULT_NS_PORT = 9523;
		
	private static String nsHostname = DEFAULT_NS_HOSTNAME;
	private static int nsPort = DEFAULT_NS_PORT;
	
	private static NameServerProxy ns_single;
	private static Map<String,PyroProxy> proxies_by_host = new HashMap<String,PyroProxy>();
	 
	public static void setHostname(String newHostname) {
		nsHostname = newHostname;
		System.out.println("Set Pyro hostname to " + nsHostname);
	}
	
	public static NameServerProxy getNameserver() throws IOException {
		if(ns_single == null) {
			ns_single = NameServerProxy.locateNS(nsHostname, nsPort);
		}
		return ns_single;
	}
	
	public static PyroProxy getPyroDaemonByHost(String targetPyroNameSuffix) throws UnknownWorker, IOException {
		NameServerProxy ns = PyroDaemons.getNameserver();
		String targetPyroName = "SOPRANOWorkerDaemon_" + targetPyroNameSuffix;
		
		try {
			PyroProxy daemon = new PyroProxy(getNameserver().lookup(targetPyroName));
			return daemon;
		} catch (PyroException e) {
			throw new UnknownWorker(targetPyroNameSuffix);
		}
	}
}
