package uk.ac.york.soprano.sbt.setup;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Optional;
import java.util.Properties;

public class DiscoverPaths {
	private static boolean isRepoBase(File dir) {
		boolean check = new File(dir, "uk.ac.york.soprano.sbt.generator").exists();
		return check;
	}

	public static Optional<File> scanParentsForRepoBase(File dir) {
		System.out.println("scanParentsForRepoBase: scanning " + dir.getAbsolutePath());
		if (isRepoBase(dir)) {
			return Optional.of(dir);
		} else {
			String parent = dir.getParent();
			if (parent == null) {
				return Optional.empty();
			} else {
				return scanParentsForRepoBase(new File(parent));
			}
		}
	}

	public static Optional<File> findRepoBase() {
		String currentProjectDir = System.getProperty("user.dir");
		Optional<File> repoBaseDir = scanParentsForRepoBase(new File(currentProjectDir));
		return repoBaseDir;
	}

	public static File findGeneratorProject(File repoBaseDir) {
		return new File(repoBaseDir, "uk.ac.york.soprano.sbt.generator");
	}

	public static File getModelDirectory(File repoBaseDir) {
		return new File(repoBaseDir, "/uk.ac.york.soprano.sbt.dsl/models/");
	}

	public static String getModelDirectoryAsString() throws ErrorGettingPath {
		Optional<File> repoBaseDir_o = findRepoBase(); 
		if (repoBaseDir_o.isPresent()) {
			return getModelDirectory(repoBaseDir_o.get()).getAbsolutePath();
		} else {
			throw new ErrorGettingPath();
		}
	}
	
	public static File propertiesFile() {
		String homeDir = System.getProperty("user.home");
		return new File(homeDir + "/simtesting.properties");
	}
	
	public static void updatePropertiesFile(Properties props) throws FileNotFoundException, IOException {
		File propsLocation = propertiesFile();
		props.store(new FileOutputStream(propsLocation), "Auto-generated properties");
	}

	public static void main(String[] args) {
		
		Properties props = new Properties();
		Optional<File> repoBaseDir_o = findRepoBase();
		if (repoBaseDir_o.isPresent()) {
			File repoBaseDir = repoBaseDir_o.get();
			String homeDir_s = System.getProperty("user.home");
			File homeDir = new File(homeDir_s); 
			File metamodelDir = new File(repoBaseDir, "/uk.ac.york.soprano.sbt.dsl/models/");
			File metamodelFile = new File(metamodelDir, "TestingMM.ecore");
			File autoRunnerScripts = new File(repoBaseDir, "/uk.ac.york.soprano.sbt.evolutionary/scripts/");
			File codeGenSharedDir = new File(homeDir, "/shared-code/"); 
						
			File genProjectDir = findGeneratorProject(repoBaseDir);
			System.out.println("Generator project dir:" + genProjectDir.getAbsolutePath());
			props.setProperty("METAMODEL_DIR", metamodelDir.getAbsolutePath());
			props.setProperty("TESTING_METAMODEL_FILE", metamodelFile.getAbsolutePath());
			props.setProperty("GENERATOR_PROJECT_DIR", genProjectDir.getAbsolutePath());
			props.setProperty("LOCAL_AUTO_RUNNER_SCRIPTS_DIR", autoRunnerScripts.getAbsolutePath());
			props.setProperty("SHARED_CODE_DIRECTORY", codeGenSharedDir.getAbsolutePath());
			
			try {
				updatePropertiesFile(props);
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(props);
			System.out.println("These properties updated and stored at " + propertiesFile().getAbsolutePath());			
		}
	}
}
