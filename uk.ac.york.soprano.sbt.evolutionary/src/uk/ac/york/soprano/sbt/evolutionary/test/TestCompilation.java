package uk.ac.york.soprano.sbt.evolutionary.test;

import uk.ac.york.soprano.sbt.evolutionary.utilities.MissingPropertiesFile;
import uk.ac.york.soprano.sbt.evolutionary.utilities.MissingProperty;
import uk.ac.york.soprano.sbt.evolutionary.utilities.SESAMEEGLExecutor;

public class TestCompilation {
	public static void test1(String[] args) {
		String __mrsModelFile = "testingMRS.model";
		String spaceModelFileName = "/home/jharbin/academic/sesame/WP6/uk.ac.york.sesame.testing.dsl/models/testingHealthcareSpace.model";
		String campaignName = "firstExperiment";
		final String CODE_GENERATION_DIRECTORY = "/home/jharbin/academic/sesame/WP6/uk.ac.york.sesame.testing.evolutionary/src/uk/ac/york/sesame/testing/evolutionary/generatedTests/";
		final String orchestratorBasePath = "/home/jharbin/academic/sesame/WP6/uk.ac.york.sesame.testing.generator/";
		
		SESAMEEGLExecutor eglEx = new SESAMEEGLExecutor(orchestratorBasePath, spaceModelFileName, __mrsModelFile, campaignName, CODE_GENERATION_DIRECTORY);
		System.out.println("eglEx - executor created");
		try {
			eglEx.run();
		} catch (MissingProperty e) {
			e.printStackTrace();
		} catch (MissingPropertiesFile e) {
			e.printStackTrace();
		}
		System.out.println("eglEx - executor ran");
	}
	
	public static void main(String[] args) {
		test1(args);
	}
}
