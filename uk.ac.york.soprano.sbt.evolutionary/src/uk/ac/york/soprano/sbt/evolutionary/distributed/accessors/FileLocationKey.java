package uk.ac.york.soprano.sbt.evolutionary.distributed.accessors;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ContainerDependency;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.FileLocation;

public class FileLocationKey {
	public static String forDepFile(ContainerDependency dep, FileLocation fl) {
		String imageName = ((ContainerDependency)dep).getImageName();
		String fileName = fl.getFileName();
		String key = imageName + "-" + fileName;
		return key;
	}
}
