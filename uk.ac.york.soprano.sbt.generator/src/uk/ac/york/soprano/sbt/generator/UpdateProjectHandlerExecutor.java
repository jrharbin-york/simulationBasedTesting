package uk.ac.york.soprano.sbt.generator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.egl.EglFileGeneratingTemplate;
import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;
import org.eclipse.epsilon.egl.EgxModule;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;
import org.eclipse.epsilon.eol.types.EolAnyType;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

public class UpdateProjectHandlerExecutor {

	private ExecutionEvent event;
	private String theIProjectPath;
	private IProject theIProject;
	private String testingModelPath;
	private String codeGenerationDirectory;

	public UpdateProjectHandlerExecutor(IProject theIProject, String theIProjectPath, ExecutionEvent event) {
		this.event = event;
		this.theIProject = theIProject;
		this.theIProjectPath = theIProjectPath;
	}

	public void run() throws InvocationTargetException, InterruptedException {

		try {
			
			SesameWizard w = new SesameWizard(this);
			PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
				public void run() {
					Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
					WizardDialog dialog = new WizardDialog(shell, w);
					System.out.println("dialog open");
					dialog.open();
					System.out.println("dialog close");
				}
			});

			registerMMs();
			
			System.out.println("testingModelPath = " + this.testingModelPath);
			if (testingModelPath == null) {
				System.err.println("No testing model path supplied; skipping code generation phase");
			} else {

			// emf source (your mission model)
//			EmfModel sourceModelForEGL = createAndLoadAnEmfModel(
//					"http://www.github.com/jrharbin-york/atlas-middleware/dsl/mission,http://www.github.com/jrharbin-york/atlas-middleware/dsl/region,http://www.github.com/jrharbin-york/atlas-middleware/dsl/message,http://www.github.com/jrharbin-york/atlas-middleware/dsl/fuzzing,http://www.github.com/jrharbin-york/atlas-middleware/dsl/faults,http://www.github.com/jrharbin-york/atlas-middleware/dsl/components",
//					theFile.getRawLocation().toOSString(), "Source", "true", "true"); 
			// EmfModel mrsModel = createAndLoadAnEmfModel("http://ExSceMM",
			// this.mrsModelPath, "MRS", "true", "true");
			
			EmfModel testingModel = createAndLoadAnEmfModel("TestingMM", this.testingModelPath, "Testing", "true", "true");

			// EGX - Create the standalone EgxModule
			EglFileGeneratingTemplateFactory factory = new EglFileGeneratingTemplateFactory();
			EgxModule egxModule = new EgxModule(factory);
	
			if (codeGenerationDirectory == null) {
				System.out.println("Using IProjectPath as code generation directory = " + theIProjectPath);
				codeGenerationDirectory = theIProjectPath;
			}
			
			String orchestratorBasePath = ModelPathDefinitions.getProperty("GENERATOR_PROJECT_DIR");
			String orchestratorEGXPath = orchestratorBasePath + "/files/orchestratorFirstPhase.egx";
			System.out.println("Code generation directory = " + codeGenerationDirectory);
			System.out.println("Orchestrator EGX path = " + orchestratorEGXPath);

			egxModule.getContext().getFrameStack().put(new Variable("path", theIProjectPath, new EolAnyType()));
			egxModule.getContext().getFrameStack().put((Variable.createReadOnlyVariable("testingModelPath", this.testingModelPath)));
			egxModule.getContext().getFrameStack().put((Variable.createReadOnlyVariable("codeGenerationDirectory", codeGenerationDirectory)));
			egxModule.getContext().getFrameStack().put((Variable.createReadOnlyVariable("orchestratorBasePath", orchestratorBasePath)));
			//java.net.URI EgxFile = Activator.getDefault().getBundle().getResource(orchestratorEGXPath).toURI();
			java.net.URI EgxFile = new File(orchestratorEGXPath).toURI();

			System.out.println(EgxFile);
			try {
				egxModule.parse(EgxFile);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			factory.setOutputRoot(new File(theIProjectPath).toURI().toString());
			// egxModule.getContext().getModelRepository().addModel(mrsModel);
			egxModule.getContext().getModelRepository().addModel(testingModel);
			egxModule.execute();

			// EGX END
			System.out.println("Project pom updated, please run an update in maven if needed.");
			// JRH: POM file generation is now handled by the EGL in pom/pomXML.egl
			}

		} catch (EolModelLoadingException e) {
			e.printStackTrace();
		} catch (EolRuntimeException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (MissingProperty e) {
			e.printStackTrace();
		} finally {
			
		}
	}

	protected static ArrayList<String> registerMMs() throws IOException, MissingProperty {

		System.out.println("CURRENT USER.DIR = " + System.getProperty("user.dir"));
		ArrayList<String> mmURIs = new ArrayList<String>();
		Resource.Factory xmiFactory = new XMIResourceFactoryImpl();
		
		String ecoreMetamodelFile = ModelPathDefinitions.getProperty("TESTING_METAMODEL_FILE");
		Resource testingMM = xmiFactory.createResource(URI.createFileURI(ecoreMetamodelFile));
		testingMM.load(null);

		TreeIterator<EObject> allContents = testingMM.getAllContents();
		while (allContents.hasNext()) {
			EObject element = allContents.next();
			System.out.println("The Element: " + element);

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

	public String getTestingModelPath() {
		return testingModelPath;
	}

	public void setTestingModelPath(String testingModelPath) {
		this.testingModelPath = testingModelPath;
	}

//	public String getMrsModelPath() {
//		return mrsModelPath;
//	}
//
//	public void setMrsModelPath(String mrsModelPath) {
//		this.mrsModelPath = mrsModelPath;
//	}

//	public void setOrchestratorPath(String egxPath) {
//		this.orchestratorPath = egxPath;
//	}
//
	public void setCodeGenerationDirectory(String codeGenerationDirectory) {
		this.codeGenerationDirectory = codeGenerationDirectory;
	}
	
	public String getIProjectPath() {
		return this.theIProjectPath;
	}
//
//	public void setOrchestratorBasePath(String orchestratorBasePath) {
//		this.orchestratorBasePath = orchestratorBasePath;
//	}
}
