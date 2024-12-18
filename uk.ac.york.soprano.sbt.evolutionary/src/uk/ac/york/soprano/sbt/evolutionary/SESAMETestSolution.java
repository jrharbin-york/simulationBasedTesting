package uk.ac.york.soprano.sbt.evolutionary;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.uma.jmetal.solution.*;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackageFactory;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.*;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.Metric;
import uk.ac.york.soprano.sbt.evolutionary.dslwrapper.FuzzingOperationWrapper;

public class SESAMETestSolution implements Solution<FuzzingOperationWrapper> {
	private static final long serialVersionUID = 1L;

	private Test t;
	
	private boolean actuallyRun;
	private double exptRunTime;
	private TestingPackageFactory tFactory;
	private TestCampaign selectedCampaign;
	
	private static Integer numTest = 0;
	
	private Map<Object, Object> attributes = new HashMap<Object, Object>();
	private Map<Integer, Double> objectives = new HashMap<Integer, Double>();
	private Map<Integer, Metric> objectiveMetrics = new HashMap<Integer, Metric>();
	private Map<Integer, Double> constraints = new HashMap<Integer, Double>();
	private List<FuzzingOperationWrapper> contents = new ArrayList<FuzzingOperationWrapper>();

	private void checkSetupTestingFactory() {
		if (tFactory == null) {
			tFactory = TestingPackageFactory.eINSTANCE;
		}
	}
	
	private void setupInternalType(SESAMETestSolution sesameTestSolution) {
		checkSetupTestingFactory();
		t = tFactory.createTest();
		t.setName(createTestName());
	}
	
	public String getName() {
		return t.getName();
	}
	
	public String toString() {
		String output = t.getName() + "-[" + contents.size() + " operations]:\n";
		for (FuzzingOperationWrapper sfow : contents) {
			output = output + sfow.toString() + "\n";
		}
		return output;
	}
	
	public SESAMETestSolution(TestCampaign selectedCampaign) {
		this.selectedCampaign = selectedCampaign;
		setupInternalType(this);
	}
	
	public SESAMETestSolution(TestCampaign selectedCampaign, String overrideName) {
		this.selectedCampaign = selectedCampaign;
		setupInternalType(this);
		t.setName(overrideName);
	}
	
	public SESAMETestSolution(TestCampaign selectedCampaign, Test fixed, String overrideName) {
		t = EcoreUtil.copy(fixed);
		t.setName(overrideName);
	}
	
	private String createTestName() {
		String date = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss").format(new Date());
		return "Test_" + String.format("%03d", ++numTest) + "_" + date;
	}

	public Test getInternalType() {
		return t;
	}

	SESAMETestSolution(SESAMETestSolution other) {
		this.actuallyRun = other.actuallyRun;
		this.exptRunTime = other.exptRunTime;
		this.selectedCampaign = other.selectedCampaign;
		this.contents = new ArrayList<FuzzingOperationWrapper>(other.contents.size());

		for (FuzzingOperationWrapper fi : other.contents) {
			this.contents.add(fi.dup());
		}
		
		setupInternalType(this);
	}

	public void setObjective(int index, double value) {
		objectives.put(index, value);
	}

	public double getObjective(int index) {
		return objectives.get(index);
	}

	public double[] getObjectives() {
		int size = objectives.size();
		double[] res = new double[size];
		for (int i = 0; i < size; i++) {
			res[i] = objectives.get(i);
		}
		return res;
	}

	public FuzzingOperationWrapper getVariable(int index) {
		if (index < contents.size() && index >= 0) {
			return contents.get(index);
		} else {
			return null;
		}
	}

	public List<FuzzingOperationWrapper> getVariables() {
		return contents;
	}

	public void setVariable(int index, FuzzingOperationWrapper variable) {
		contents.set(index, variable);
	}

	public double[] getConstraints() {
		int size = constraints.size();
		double[] res = new double[size];
		for (int i = 0; i < size; i++) {
			res[i] = getConstraint(i);
		}
		return res;
	}

	public double getConstraint(int index) {
		return 0.0;
	}

	public void setConstraint(int index, double value) {
		constraints.put(index, value);
	}

	public int getNumberOfVariables() {
		return contents.size();
	}

	public int getNumberOfObjectives() {
		return objectives.size();
	}

	public int getNumberOfConstraints() {
		return constraints.size();
	}

	public SESAMETestSolution copy() {
		SESAMETestSolution copy = new SESAMETestSolution(this);
		return copy;
	}

	public SESAMETestSolution dup() {
		return this.copy();
	}

	public List<FuzzingOperationWrapper> getFuzzingSelections() {
		return contents;
	}

	public void setContents(int index, FuzzingOperationWrapper fi) {
		contents.set(index, fi);
	}

	public void addContents(int index, FuzzingOperationWrapper fi) {
		contents.add(index, fi);
	}
	
	public void addToContents(FuzzingOperationWrapper fi) {
		contents.add(fi);
	}

	public int numberOfFuzzingSelections() {
		return contents.size();
	}

	public void setAttribute(Object id, Object value) {
		attributes.put(id, value);
	}

	public Object getAttribute(Object id) {
		return attributes.get(id);
	}

	public boolean hasAttribute(Object id) {
		return attributes.containsKey(id);
	}

	public Map<Object, Object> getAttributes() {
		return attributes;
	}

	public void setAllContents(List<FuzzingOperationWrapper> fis) {
		int i = 0;
		for (FuzzingOperationWrapper fi : fis) {
			addContents(i, fi);
			i++;
		}
	}

	public List<FuzzingOperationWrapper> variables() {
		return getVariables();
	}

	public double[] objectives() {
		return getObjectives();
	}

	public double[] constraints() {
		return getConstraints();
	}

	public Map<Object, Object> attributes() {
		return getAttributes();
	}

	public void setObjectiveMetric(int i, Metric m) {
		objectiveMetrics.put(i, m);
	}
	
	public Metric getObjectiveMetric(int i) {
		return objectiveMetrics.get(i);
	}
	
	public String getObjectiveMetricName(int i) {
		Metric m = objectiveMetrics.get(i);
		if (m != null) {
			return m.getName();
		} else {
			return "UNNAMED-METRIC-" + i;
		}
	}

	public String getMainClassName() {
		// This has to match with the name used in test2Class in orchestrator.egx and in rosmain.egl
		// (or other simulator internal implementation)
		// FIXED: .class is not required to execute it
		return t.getName() + "_TestRunner";
	}
	
	private boolean modelContainsTest(EList<Test> tests, String targetName) {
		return tests.stream().anyMatch(test -> test.getName().equals(targetName));
	}

	public void ensureModelUpdated(TestCampaign campaign) {
		List<FuzzingOperation> testAttacks = t.getOperations();
		// First, ensure the model attack objects are all updated in the model object
		// from its contents
		for (FuzzingOperationWrapper sta : contents) {
			FuzzingOperation a = sta.getFuzzingOperation();
			testAttacks.add(a);
		}
		
		// Add the test to the enclosing TestCampaign
		EList<Test> tests = campaign.getPerformedTests();
		if (!modelContainsTest(tests, t.getName())) {
			tests.add(t);
			System.out.println("Added a test to the model named " + t.getName());
		} else {
			System.out.println(t.getName() + " is already in the model");
		}
	}

	public static SESAMETestSolution empty(SESAMETestSolution cy) {
		SESAMETestSolution newEmpty = new SESAMETestSolution(cy);
		newEmpty.contents.clear();
		return newEmpty;
	}
	
	public void addDevelopedFrom(SESAMETestSolution parent) {
		Test parentT = parent.getInternalType();
		EList<Test> developedFrom = t.getDevelopedFrom();
		developedFrom.add(parentT);
	}

	public void setOperationSequenceNums() {
		Test t = this.getInternalType();
		int i = 0;
		EList<FuzzingOperation> ops = t.getOperations();
		for (FuzzingOperation o : ops) {
			o.setSequenceNumInTest(i);
			i++;
		}
	}

	public List<FuzzingOperation> getAllStaticOperations() {
		List<FuzzingOperation> l = new ArrayList<FuzzingOperation>();
		for (FuzzingOperation op : t.getOperations()) {
			if (FuzzingOperationWrapper.opIsStatic(op)) {
				l.add(op);
			}
		}
		return l;
	}
}