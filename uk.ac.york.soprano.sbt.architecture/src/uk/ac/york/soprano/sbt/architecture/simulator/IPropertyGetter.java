package uk.ac.york.soprano.sbt.architecture.simulator;

public interface IPropertyGetter {
	public IParamServiceCallback getAsync();
	public Object getSync() throws ParameterGetTimedOut;
}
