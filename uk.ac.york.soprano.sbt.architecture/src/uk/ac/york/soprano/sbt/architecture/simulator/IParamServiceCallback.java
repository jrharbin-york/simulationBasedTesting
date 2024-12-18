package uk.ac.york.soprano.sbt.architecture.simulator;

public interface IParamServiceCallback {
	public Object getValue() throws ValueNotReady;
	public boolean isReady();
}
