package uk.ac.york.soprano.sbt.evolutionary.distributed.accessors;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;

import javax.xml.transform.stream.StreamResult;

import org.xml.sax.InputSource;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.FileLocation;
import uk.ac.york.soprano.sbt.evolutionary.utilities.MissingPropertiesFile;
import uk.ac.york.soprano.sbt.evolutionary.utilities.MissingProperty;

public abstract class FileAccessorFromDependency {
	public abstract InputSource getConfigFileInput(FileLocation loc);
	public abstract String getOutputFileName(FileLocation loc) throws MissingProperty, MissingPropertiesFile;
	
	/** This will e.g. write back the files to the container 
	 * @throws FinaliseFailed */
	public abstract void finalise() throws FinaliseFailed;
	
	private void ensureStreamDirectoryExists(String filePath) throws IOException {
		Path filep = Path.of(filePath);
		Path dirPath = filep.getParent();
		Files.createDirectories(dirPath);
	}
	
	public Optional<StreamResult> getStreamForOutputResult(FileLocation loc) {
		try {
			String fileName = this.getOutputFileName(loc); 
			ensureStreamDirectoryExists(fileName);
			return Optional.of(new StreamResult(new File(fileName)));
		} catch (MissingProperty | MissingPropertiesFile e) {
			e.printStackTrace();
			return Optional.empty();
		} catch (IOException e) {
			e.printStackTrace();
			return Optional.empty();
			// TODO: convert this to a DirectoryCreationFailed exception and raise
		}
	}
}
