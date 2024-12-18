package uk.ac.york.soprano.sbt.evolutionary.utilities;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

import org.buildobjects.process.ProcResult;

import uk.ac.york.soprano.sbt.architecture.utilities.ExptHelper;

public class TestRunnerUtils {
    //static String ABS_SCRIPT_DIR = PathDefinitions.getPath(PathDefinitions.PathSpec.AUTO_RUNNER_SCRIPTS);
//	static String ABS_SCRIPT_DIR;
//	static String ABS_SCRIPT_DIR = 
			
	public static void getScriptDir() {
		
	}

	public static void exec(String mainClass, String codeGenerationDir) throws IOException, MissingProperty, MissingPropertiesFile {
		//ExptHelper.runScriptNew(ABS_SCRIPT_DIR, "./execute_testrunner_xterm.sh", mainClass);
		String ABS_SCRIPT_DIR = PathLookupFromProperties.getProperty(PathLookupFromProperties.PathSpec.LOCAL_AUTO_RUNNER_SCRIPTS_DIR);
		ExptHelper.startCmd(ABS_SCRIPT_DIR, "./execute_testrunner_xterm.sh " +  mainClass + " " + codeGenerationDir);
	}

	public static void compileProject(String projectDir) throws IOException, MissingProperty, MissingPropertiesFile {
		// original script launcher
		//ExptHelper.startCmd(ABS_SCRIPT_DIR, "./compile_project_xterm.sh " + projectDir);
		
		String ABS_SCRIPT_DIR = PathLookupFromProperties.getProperty(PathLookupFromProperties.PathSpec.LOCAL_AUTO_RUNNER_SCRIPTS_DIR);
		// new script launcher to run the compilation in the main process
		Optional<ProcResult> res_o = ExptHelper.runScriptWithArgs(ABS_SCRIPT_DIR, "./compile_project.sh", projectDir);
		if (res_o.isPresent()) {
			ProcResult res = res_o.get();
			String output = res.getOutputString();
			System.out.println("Compilation output" + output);
		} else {
			
		}
	}

	public static void killProcesses() throws MissingProperty, MissingPropertiesFile {
		String ABS_SCRIPT_DIR = PathLookupFromProperties.getProperty(PathLookupFromProperties.PathSpec.LOCAL_AUTO_RUNNER_SCRIPTS_DIR);
		ExptHelper.runScriptNew(ABS_SCRIPT_DIR, "./terminate_sim.sh");
	}
	
	public static void runCustomTerminateScript(String terminateScript) throws MissingProperty, MissingPropertiesFile {
		try {
			String ABS_SCRIPT_DIR = PathLookupFromProperties.getProperty(PathLookupFromProperties.PathSpec.LOCAL_AUTO_RUNNER_SCRIPTS_DIR);
			ExptHelper.runScriptNew(ABS_SCRIPT_DIR, terminateScript);
		} catch (org.buildobjects.process.ExternalProcessFailureException e) {
			System.out.println("Ignoring failure of the termination script");
		}
	}
	
	public static void clearKafka() throws MissingProperty, MissingPropertiesFile {
		String ABS_SCRIPT_DIR = PathLookupFromProperties.getProperty(PathLookupFromProperties.PathSpec.LOCAL_AUTO_RUNNER_SCRIPTS_DIR);
		ExptHelper.runScriptNew(ABS_SCRIPT_DIR, "./clear_kafka.sh");
	}

	public static void waitForSeconds(double timeDelaySeconds) {
		long endTimeMillis = System.currentTimeMillis() + (long)((double)timeDelaySeconds * 1000);
		while (System.currentTimeMillis() < endTimeMillis) {
			try {
				Thread.sleep(endTimeMillis - System.currentTimeMillis());
			} catch (InterruptedException e) {
				
			}
		}
	}

	public static void recordSim(String recordLauncher, String fileIDName) {
		Path p = Paths.get(recordLauncher);
		String parentDir = p.getParent().toString();
		ExptHelper.runScriptNewThread(parentDir, recordLauncher + " " + fileIDName);
	}
}
