package uk.ac.york.soprano.sbt.evolutionary.distributed;

public class TestNotRunning extends Exception {
	private RemoteTest t;
	private static final long serialVersionUID = 1L;
	
	public TestNotRunning(RemoteTest t) {
		this.t = t;
	}
	
	public RemoteTest getRemoteTest() {
		return t;
	}
}
