package uk.ac.york.soprano.sbt.evolutionary.distributed.remapping.transformers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ContainerDependency;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.Dependency;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.*;
import uk.ac.york.soprano.sbt.evolutionary.distributed.RemoteTest;
import uk.ac.york.soprano.sbt.evolutionary.distributed.accessors.FileAccessorFromDependency;
import uk.ac.york.soprano.sbt.evolutionary.distributed.accessors.FileAccessorFromDocker;
import uk.ac.york.soprano.sbt.evolutionary.distributed.accessors.FileAccessorFromRawFile;
import uk.ac.york.soprano.sbt.evolutionary.distributed.accessors.FileLocationKey;
import uk.ac.york.soprano.sbt.evolutionary.distributed.accessors.TempFileCreationFailed;
import uk.ac.york.soprano.sbt.evolutionary.distributed.staticvariables.InvalidTransformerForVariable;
import uk.ac.york.soprano.sbt.evolutionary.utilities.MissingPropertiesFile;
import uk.ac.york.soprano.sbt.evolutionary.utilities.MissingProperty;

public class ConfigTransformerFactory {
	public List<ConfigTransformer> createTransformers(RemoteTest rt, StaticVariable sv, Map<String,String> fileLocationOverrides) throws InvalidTransformerForVariable, MissingProperty, MissingPropertiesFile, TempFileCreationFailed {
		List<ConfigLocation> locs = sv.getLocations();
		
		List<ConfigTransformer> txs = new ArrayList<ConfigTransformer>();
		
		for (ConfigLocation l : locs) {
			Dependency depRoot = l.getRoot();
			
			System.out.println("fileLocationOverrides count:" + fileLocationOverrides.size());
			
			FileAccessorFromDependency accessor = null;
			// TODO: support other containers here
			// The file location overrides should really be pushed up into FileAccessorFromDependency
			if (depRoot instanceof ContainerDependency && (l instanceof FileLocation)) {
				
				FileLocation fl = (FileLocation)l;
				String key = FileLocationKey.forDepFile((ContainerDependency) depRoot, fl);
				
				if (!fileLocationOverrides.containsKey(key)) { 
					FileAccessorFromDocker accessorDocker = new FileAccessorFromDocker(rt, (ContainerDependency)depRoot);
					accessor = (FileAccessorFromDependency)accessorDocker;
					try {
						// Set up an override so future references to this file will use this transformers output file
						String outputFile = accessorDocker.getOutputFileName(fl);
						fileLocationOverrides.put(key, outputFile);
					} catch (MissingProperty e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (MissingPropertiesFile e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				} else {
					String tempLocation = fileLocationOverrides.get(key);
					accessor = new FileAccessorFromRawFile(tempLocation);
					String newOutputFile = accessor.getOutputFileName(fl);
					fileLocationOverrides.put(key, newOutputFile);
				}
			}
			
			if (accessor == null) {
				throw new InvalidTransformerForVariable(sv);
			}
			
			if (l instanceof XMLConfigLocation) {
				XMLConfigLocation xl = (XMLConfigLocation)l;
				txs.add(new XMLConfigTransformer(accessor, xl));
			}
		}
		
		return txs;
	}
}
