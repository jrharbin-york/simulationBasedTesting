package uk.ac.york.soprano.sbt.evolutionary.utilities;

// TODO: this can be deleted once the new PathDefinitions lookup from the properties file is working
public class PathDefinitions_old {
	public static enum PathSpec {
		MODEL_PATH,
		REPO_BASE_PATH,
		AUTO_RUNNER_SCRIPTS,
		STANDARD_GRAMMAR_PATH_BASE
	}
	
	private static String REPO_BASE_PATH = "/home/jharbin/academic/sesame/WP6/";
	
	public static String getPath(PathSpec ps) {
		if (ps == PathSpec.MODEL_PATH) {
			return REPO_BASE_PATH + "/uk.ac.york.sesame.testing.dsl/models/";
		}

		if (ps == PathSpec.REPO_BASE_PATH) {
			return REPO_BASE_PATH;
		}

		if (ps == PathSpec.AUTO_RUNNER_SCRIPTS) {
		    return REPO_BASE_PATH + "/uk.ac.york.sesame.testing.evolutionary/scripts/";
		}
		
		if (ps == PathSpec.STANDARD_GRAMMAR_PATH_BASE) {
		    return REPO_BASE_PATH + "/uk.ac.york.sesame.testing.generator/files/grammar/sesame-standardgrammar-";
		}
		    
		// Should really raise "UnknownPath" exception here, but when it is accessed by
		// the generator, gets uk.ac.york.sesame.testing.evolutionary.utilities.UnknownPath cannot be found by uk.ac.york.sesame.testing.generator_
		return "";
	}
}
