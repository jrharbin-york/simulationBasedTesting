package uk.ac.york.soprano.sbt.architecture.simulator;

import java.util.Properties;

public interface ICommandInvoker {
	
	public Object invoke(String commandName, Properties params);

}
