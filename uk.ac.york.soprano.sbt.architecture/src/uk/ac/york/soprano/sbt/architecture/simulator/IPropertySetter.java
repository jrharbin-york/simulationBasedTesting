package uk.ac.york.soprano.sbt.architecture.simulator;

public interface IPropertySetter {
	public void set(Object val) throws InvalidPropertyType;
	public void setRelative(Object value) throws InvalidPropertyType;
	public boolean isRestored();

	public void restoreOriginalValue() throws RestoreFailed;
	public boolean isSet();

}
