package uk.ac.york.soprano.sbt.architecture.data;

import java.io.File;

public interface ILogger {
	
	public String getType();
	public Boolean appendLine(String line);
	public String readLine(int lineNumber);
	public File readFile(String path);

}
