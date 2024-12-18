package uk.ac.york.soprano.sbt.evolutionary.utilities.temp;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EgxModule;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelElementTypeNotFoundException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;
import org.eclipse.epsilon.eol.types.EolAnyType;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackageFactory;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingSpace;

public class TestModelMutationAndEGLCall {
	private static String metamodelURI = "TestingMM";
	private static String modelFile = "/home/jharbin/eclipse-workspace/localAutoGen/models/testingHealthcareSpace.model";
	
	public static void main(String [] args) {
		
		SESAMEModelLoader loader = new SESAMEModelLoader(modelFile);
		try {
			Resource r = loader.loadTestingSpace();
			
			TestingPackageFactory tFactory = TestingPackageFactory.eINSTANCE;
			TestingSpace space = (TestingSpace) r.getContents().get(0);
			
			// First call
			codeGeneration();
			
			for (int i = 0; i < 10; i++) {
				List<TestCampaign> camps = space.getCampaigns();
				for (TestCampaign c : camps) {
					c.getPerformedTests();
					// Saves the Resource for the object
					loader.saveTestingSpace();
					EList<Test> tests = c.getPerformedTests();
					Test t = tFactory.createTest();
					String date = new SimpleDateFormat("dd-MM-yyyy-HH-mm-ss").format(new Date());
					t.setName("test-" + date);
					tests.add(t);
				}
				
				codeGeneration();
			}

		} catch (EolModelElementTypeNotFoundException e) {
			e.printStackTrace();
		} catch (EolModelLoadingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EolRuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void codeGeneration() throws EolRuntimeException {
		String codeOutputPath = "/tmp/test-generation/";
		
		EmfModel theModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_METAMODEL_URI, metamodelURI);
		properties.put(EmfModel.PROPERTY_MODEL_FILE, modelFile);
		properties.put(EmfModel.PROPERTY_NAME, "Testing");
		properties.put(EmfModel.PROPERTY_READONLOAD, "true");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, "true");
		//
		properties.put(EmfModel.PROPERTY_CACHED, "false");
		//
		theModel.load(properties, (IRelativePathResolver) null);

		EglFileGeneratingTemplateFactory factory = new EglFileGeneratingTemplateFactory();
		EgxModule egxModule = new EgxModule(factory);

		egxModule.getContext().getFrameStack().put(new Variable("path", codeOutputPath, new EolAnyType()));
		java.net.URI EgxFile = new File("/files/orchestrator.egx").toURI();
		
		System.out.println(EgxFile);
		try {
			egxModule.parse(EgxFile);
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		factory.setOutputRoot(new File(codeOutputPath).toURI().toString());
		//egxModule.getContext().getModelRepository().addModel(mrsModel);
		List<IModel> m = egxModule.getContext().getModelRepository().getModels();
		System.out.println("Count of models in repo = " + m.size());
		
		egxModule.getContext().getModelRepository().addModel(theModel);
		
		egxModule.execute();
		
		
	}
}
