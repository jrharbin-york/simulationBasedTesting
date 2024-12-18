package uk.ac.york.soprano.sbt.evolutionary.utilities.temp;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Optional;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackageFactory;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingSpace;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.*;

public class SESAMEModelLoader {
	private String testingModelFilename;
	Resource resource;

	public SESAMEModelLoader(String testingModelFilename) {
		this.testingModelFilename = testingModelFilename;
	}

	public Resource loadTestingSpace() throws EolModelLoadingException {
		// Initialize the model
		FuzzingOperationsPackage.eINSTANCE.eClass();
		TestingPackagePackage.eINSTANCE.eClass();

		// Register the XMI resource factory for the .website extension

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("model", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Get the resource
		resource = resSet.getResource(URI.createURI(testingModelFilename), true);
		return resource;
		
	}

	public void saveTestingSpace() {
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void saveTestingSpaceToNewFile(String filename) {
		try {
			FileOutputStream outfile = new FileOutputStream(filename);
			resource.save(outfile, Collections.EMPTY_MAP);
			outfile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		SESAMEModelLoader emf = new SESAMEModelLoader(
				"/home/jharbin/academic/sesame/WP6/uk.ac.york.sesame.testing.dsl/models/testingHealthcareSpace.model");
		Resource testingSpaceModel;
		try {
			testingSpaceModel = emf.loadTestingSpace();

			// Get the first model element and cast it to the right type, in my
			// example everything is hierarchical included in this first node
			TestingSpace space = (TestingSpace) testingSpaceModel.getContents().get(0);

			System.out.println("EMF loaded");

			TestingPackageFactory tFactory = TestingPackageFactory.eINSTANCE;

			EList<TestCampaign> tsList = space.getCampaigns();
			for (TestCampaign tc : tsList) {
				System.out.println("Found test campaign named " + tc.getName());
				EList<Test> tests = tc.getPerformedTests();
				Test t = tFactory.createTest();
				String date = new SimpleDateFormat("dd-MM-yyyy-HH-mm-ss").format(new Date());
				t.setName("test-" + date);
				tests.add(t);
				System.out.println("Added a test to the model named " + t.getName());
			}

			testingSpaceModel.save(Collections.EMPTY_MAP);
			System.out.println("EMF saved");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (EolModelLoadingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public Optional<TestCampaign> getTestCampaign(Resource testingSpaceModel, String testCampaignName) {
		Optional<TestCampaign> tc_o = Optional.empty();
		TestingSpace ts = (TestingSpace) testingSpaceModel.getContents().get(0);
		for (TestCampaign tc : ts.getCampaigns()) {
			if (tc.getName().equals(testCampaignName)) {
				tc_o = Optional.of(tc);
			}
		}
		return tc_o;
	}
	
	public TestingSpace getTestingSpace(Resource testingSpaceModel) {
		TestingSpace ts = (TestingSpace) testingSpaceModel.getContents().get(0);
		return ts;
	}
}