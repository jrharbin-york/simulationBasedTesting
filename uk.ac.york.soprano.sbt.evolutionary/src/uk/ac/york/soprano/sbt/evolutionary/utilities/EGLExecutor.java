package uk.ac.york.soprano.sbt.evolutionary.utilities;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;

import org.eclipse.epsilon.egl.EglFileGeneratingTemplate;
import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;
import org.eclipse.epsilon.egl.exceptions.EglRuntimeException;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;

public class EGLExecutor {
	//private final String METAMODEL_FILE = "ecore-metamodels-combined/atlas.ecore";
	private String metamodelFile;
	private String eglFileName;
	
	public EGLExecutor(String metamodelFile, String eglFile) {
		this.metamodelFile = metamodelFile;
		this.eglFileName = eglFile;
	}
	
	public void executeEGL(String sourceModelFile, String eglOutput) throws EglRuntimeException, URISyntaxException, IOException, EolModelLoadingException {
		EmfModel sourceModelForEGL = loadModel(metamodelFile, sourceModelFile, "Target");
		// EGL factory and module
		EglFileGeneratingTemplateFactory factory = new EglFileGeneratingTemplateFactory();
		EglTemplateFactoryModuleAdapter eglModule = new EglTemplateFactoryModuleAdapter(factory);
		eglModule.getContext().getModelRepository().addModel(sourceModelForEGL);

		java.net.URI EglFile = new java.net.URI(eglFileName);
		System.out.println(EglFile);
		
		EglFileGeneratingTemplate template = (EglFileGeneratingTemplate)factory.load(EglFile);
		template.process();
				
		// Set the target file, ie. where the results will be generated to.
		// TODO: replace the path for the Java generated DSL here
		File target = new File(eglOutput);
		System.out.println("target= " + target.toString());
		target.createNewFile();
		template.generate(target.toURI().toString());
	}
	
	private EmfModel loadModel(String metaModelFilePath, String modelFilePath, String modelName) throws EolModelLoadingException {
	    EmfModel model =  new EmfModel();
		ArrayList<String> metamodelFilesTarget = new ArrayList<String>();
		System.out.println("Metamodel file path = " + new File(metaModelFilePath).getAbsolutePath());
		metamodelFilesTarget.add(new File(metaModelFilePath).getAbsolutePath());
		model.setMetamodelFiles(metamodelFilesTarget);
		model.setName("Target");
		model.setModelFile(modelFilePath);
		model.setStoredOnDisposal(true);
		model.load();
		return model;
	}
}
