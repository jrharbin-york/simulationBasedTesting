package uk.ac.york.soprano.sbt.evolutionary.utilities;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EgxModule;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;
import org.eclipse.epsilon.eol.types.EolAnyType;

public class SESAMEEGLExecutor {
	private String testingModelPath;
	
	// TODO: orchestratorBasePath needs to be configured properly
	//private String orchestratorBasePath = "/home/jharbin/academic/sesame/WP6/uk.ac.york.sesame.testing.generator/";
		
	private String orchestratorBasePath;
	private String codeOutputPath;
	
	public SESAMEEGLExecutor(String orchestratorBasePath, String testingModelPath, String ___UNUSED_mrsModelPath, String campaignName, String codeOutputPath) {
		System.out.println("SESAMEEGLExecutor - testing model path is " + testingModelPath);
		this.testingModelPath = testingModelPath;
		this.codeOutputPath = codeOutputPath;
		this.orchestratorBasePath = orchestratorBasePath;
		System.out.println("orchestratorBasePath = " + orchestratorBasePath);
	}
	
	protected static ArrayList<String> registerMMs() throws IOException, MissingProperty, MissingPropertiesFile {

		System.out.println("CURRENT USER.DIR = " + System.getProperty("user.dir"));
		ArrayList<String> mmURIs = new ArrayList<String>();
		Resource.Factory xmiFactory = new XMIResourceFactoryImpl();
		
		//String modelPath = PathDefinitions.getPath(PathDefinitions.PathSpec.MODEL_PATH);
		//Resource mrsMM = xmiFactory.createResource(URI.createFileURI(modelPath + "ExSceMM.ecore"));
		//mrsMM.load(null);
		//EPackage pkgMRS = (EPackage) mrsMM.getContents().get(0);
		//EPackage.Registry.INSTANCE.put(pkgMRS.getNsURI(), pkgMRS);
		//mmURIs.add(pkgMRS.getNsURI());
		
		String ecoreMetamodelFile = PathLookupFromProperties.getProperty(PathLookupFromProperties.PathSpec.TESTING_METAMODEL_FILE);
		Resource testingMM = xmiFactory.createResource(URI.createFileURI(ecoreMetamodelFile));
		testingMM.load(null);

		TreeIterator<EObject> allContents = testingMM.getAllContents();
		while (allContents.hasNext()) {
			EObject element = allContents.next();
			//System.out.println("The Element: " + element);

			if (element.eClass().getName().equals("EPackage")) {
				EPackage.Registry.INSTANCE.put(((EPackage) element).getNsURI(), element);
				mmURIs.add(((EPackage) element).getNsURI());
			}
		}
		return mmURIs;
	}
	
	private EmfModel createAndLoadAnEmfModel(String metamodelURI, String modelFile, String modelName, String readOnLoad,
			String storeOnDisposal) throws EolModelLoadingException {
			
		EmfModel theModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_METAMODEL_URI, metamodelURI);
		properties.put(EmfModel.PROPERTY_MODEL_FILE, modelFile);
		properties.put(EmfModel.PROPERTY_NAME, modelName);
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad);
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal);
		//
		properties.put(EmfModel.PROPERTY_CACHED, "false");
		//
		theModel.load(properties, (IRelativePathResolver) null);
		return theModel;
	}

	public void run() throws MissingProperty, MissingPropertiesFile {
		try {
			registerMMs();
			
			EmfModel testingModel = createAndLoadAnEmfModel("TestingMM", this.testingModelPath, "Testing", "true","true");
			//testingModel.clearCache();
			
			// EGX
			// Create the standalone EgxModule
			
		
			// https://www.eclipse.org/epsilon/doc/articles/code-generation-tutorial-egl/
			EglFileGeneratingTemplateFactory factory = new EglFileGeneratingTemplateFactory();
		
			
			//
			
		
			
			EgxModule egxModule = new EgxModule(factory);

			egxModule.getContext().getFrameStack().put(new Variable("path", codeOutputPath, new EolAnyType()));
			// TODO: orchestrator needs to only generate test code for the given test campaign
			java.net.URI EgxFile = new File(orchestratorBasePath + "/files/orchestrator.egx").toURI();
			
			System.out.println(EgxFile);
			try {
				egxModule.parse(EgxFile);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			factory.setOutputRoot(new File(codeOutputPath).toURI().toString());
			//egxModule.getContext().getModelRepository().addModel(mrsModel);
			List<IModel> m = egxModule.getContext().getModelRepository().getModels();
			System.out.println("Count of models in repo = " + m.size());
			
			egxModule.getContext().getModelRepository().addModel(testingModel);
			
			egxModule.execute();
			testingModel.dispose();
			// EGX END
			// JRH: shouldn't need to create new pom.xml if we have produced the code locally within this project

		} catch (EolModelLoadingException e) {
			e.printStackTrace();
		} catch (EolRuntimeException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		}
	}
}