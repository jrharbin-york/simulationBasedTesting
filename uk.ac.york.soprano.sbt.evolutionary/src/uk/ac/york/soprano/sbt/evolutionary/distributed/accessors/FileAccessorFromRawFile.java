package uk.ac.york.soprano.sbt.evolutionary.distributed.accessors;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import org.xml.sax.InputSource;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.FileLocation;

public class FileAccessorFromRawFile extends FileAccessorFromDependency {

	private String originalFileName;
	private String tempFileName;

	public FileAccessorFromRawFile(String rawFileName) throws TempFileCreationFailed {
		try {
			this.originalFileName = rawFileName;
			Path tmpPath = Path.of("/tmp/");
			this.tempFileName = Files.createTempFile(tmpPath, "configFileRaw", ".cfg").getFileName().toAbsolutePath().toString();
			System.out.println("Created FileAccessorFromRawFile - " + this.originalFileName + " to temp output -> " + this.tempFileName);
		} catch (IOException e) {
			throw new TempFileCreationFailed(this);
		}		
	}

	@Override
	public InputSource getConfigFileInput(FileLocation loc) {
        InputSource source = new InputSource(originalFileName);
		return source;
	}

	@Override
	public void finalise() throws FinaliseFailed {
		try {
			Path input = Path.of(tempFileName);
			Path output = Path.of(originalFileName);
			// Copy from temp file back to the original file
			Files.copy(input, output, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			throw new FinaliseFailed(this);
		}
	}

	@Override
	public String getOutputFileName(FileLocation loc) {
		return tempFileName;
	}
}
