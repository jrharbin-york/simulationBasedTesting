package uk.ac.york.soprano.sbt.evolutionary.phytestingselection;

import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Optional;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;

import uk.ac.york.soprano.sbt.architecture.data.IntervalWithCount;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.*;
import uk.ac.york.soprano.sbt.evolutionary.InvalidTestCampaign;
import uk.ac.york.soprano.sbt.evolutionary.phytestingselection.coveragechecker.CoverageCheckingAlg;
import uk.ac.york.soprano.sbt.evolutionary.phytestingselection.coveragechecker.GridCoverageChecker;
import uk.ac.york.soprano.sbt.evolutionary.phytestingselection.dimensionreducer.ParameterSpaceDimensionalityReduction;
import uk.ac.york.soprano.sbt.evolutionary.phytestingselection.metricquality.MetricQualityValue;
import uk.ac.york.soprano.sbt.evolutionary.utilities.temp.SESAMEModelLoader;

public abstract class PhyTestingSubsetSelection {

	private static final boolean DEBUG_REGISTER_CELLS = false;

	// This returns whether the given test should be included in the output results
	// Can filter based upon whether it is in the Pareto front, generation number
	public static boolean shouldIncludeTest(TestCampaign selectedCampaign, Test t) {
		return true;
	}
	
	ParameterSpaceDimensionalityReduction dsc;
	MetricQualityValue mqv;
	
	private enum TestResultTags {
		IN_FINAL_PARETO_FRONT,
	}
	
	private HashMap<Test, EnumMap<DimensionID, Double>> parameterSpaceMappings = new HashMap<Test, EnumMap<DimensionID, Double>>();
	private HashMap<Test, Double> qualityMappings = new HashMap<Test, Double>();
	private List<Test> testsToInclude = new ArrayList<Test>();
	private HashMap<Test, TestResultTags> testTags = new HashMap<Test,TestResultTags>();
	
	// This is used for debugging the coverage checker grid assignment
	//private CoverageCheckingAlg _covChecker;
	
	public PhyTestingSubsetSelection(ParameterSpaceDimensionalityReduction dsc, MetricQualityValue mqv) {
		
		////////////////////////////// DEBUG - these are used for debugging the coverage checking 
//		EnumMap<DimensionID, IntervalWithCount> intervals = new EnumMap<DimensionID, IntervalWithCount>(
//				DimensionID.class);
//		intervals.put(DimensionID.T1_TIME_MIDPOINT_MEAN, new IntervalWithCount(0.0, 1.0, 4, 0));
//		intervals.put(DimensionID.T2_TIME_LENGTH_MEAN, new IntervalWithCount(0.0, 0.5, 3, 0));
//		intervals.put(DimensionID.P1_PARAMETER_MEAN, new IntervalWithCount(0.0, 1.0, 3, 0));
		
		final int MIN_COVERAGE_PER_CELL = 1;
		final double NEEDED_COVERAGE_PROPORTION = 1.0;
		
		//this._covChecker = new GridCoverageChecker(intervals, MIN_COVERAGE_PER_CELL, NEEDED_COVERAGE_PROPORTION);
		
		this.dsc = dsc;
		this.mqv = mqv;
	}
	
	protected abstract boolean isTagged(TestCampaign selectedCampaign, Test t);

	public void loadModelToResults(String modelFileName, String campaignName)
			throws InvalidTestCampaign, EolModelLoadingException {
		// Load the test campaign from the model file
		SESAMEModelLoader loader = new SESAMEModelLoader(modelFileName);
		Resource testSpaceModel = loader.loadTestingSpace();
		Optional<TestCampaign> testCampaign_o = loader.getTestCampaign(testSpaceModel, campaignName);

		if (!testCampaign_o.isPresent()) {
			throw new InvalidTestCampaign(campaignName);
		} else {
			TestCampaign selectedCampaign = testCampaign_o.get();
			dsc.setCampaign(selectedCampaign);
			mqv.setCampaign(selectedCampaign);
			EList<Test> tests = selectedCampaign.getPerformedTests();

			for (Test t : tests) {
				// shouldIncludeTest gets a subset - either the final Pareto front or other
				// constraints
				if (shouldIncludeTest(selectedCampaign, t)) {
					testsToInclude.add(t);
					mqv.registerTestToInclude(t);
				}
				
				// Check in the campaign if it is in the final Pareto front, or
				// not - if so, set the tags appropriately
				if (isTagged(selectedCampaign, t)) {
					 testTags.put(t, TestResultTags.IN_FINAL_PARETO_FRONT);
				}
			}

			try {
				for (Test t : testsToInclude) {
					// Process all the tests selected for inclusion in the campaign
					// Convert each test into its parameter space values
					EnumMap<DimensionID, Double> paramValuesForConfig;

					paramValuesForConfig = dsc.generateDimensionSetsForParams(t);
					double qualityValue = mqv.generateMetricQualityValue(t);
					parameterSpaceMappings.put(t, paramValuesForConfig);
					qualityMappings.put(t, qualityValue);
					
//					if (DEBUG_REGISTER_CELLS) {
//						_covChecker.register(t, paramValuesForConfig);
//					}
					

				}
			} catch (MissingDimensionsInMap e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void writeOutResultsTabSep(List<Test> specificTests, EnumSet<DimensionID> chosenDimensions) {
		DecimalFormat df = new DecimalFormat("#.##");		
		EnumSet<DimensionID> allDimensions = EnumSet.allOf(DimensionID.class);
		System.out.print("NAME\tTESTTAG\t");
		for (DimensionID d : allDimensions) {
			if (chosenDimensions.contains(d)) {
			String dname = d.toString().substring(0,7);
			System.out.print(dname + "\t");
			}
		}
		System.out.println("METRIC_Q");
		
		for (Test t : specificTests) {
			EnumMap<DimensionID, Double> paramValuesForConfig = parameterSpaceMappings.get(t);
			Double qv = qualityMappings.get(t);
			System.out.print(t.getName() + "\t" + getTestResultTag(t).toString() + "\t");
			for (DimensionID d : paramValuesForConfig.keySet()) {
				if (chosenDimensions.contains(d)) {
				Double v = paramValuesForConfig.get(d);
				System.out.print(df.format(v) + "\t");
				}
			}
			System.out.println(df.format(qv));
		}
	}
	
	private Integer getTestResultTag(Test t) {
		TestResultTags tt = testTags.get(t);
		if (tt == null) {
			return 0;
		}
		
		if (tt.equals(TestResultTags.IN_FINAL_PARETO_FRONT)) {
			return 1;
		}
		
		return 0;
	}

	public void writeOutResultsCSV(String filePathOut, List<Test> specificTests, EnumSet<DimensionID> chosenDimensions) throws IOException {
		FileWriter fout = new FileWriter(filePathOut);
		EnumSet<DimensionID> allDimensions = EnumSet.allOf(DimensionID.class);
		fout.write("NAME,TESTTAG,");
		for (DimensionID d : allDimensions) {
			if (chosenDimensions.contains(d)) {
				String dname = d.toString();
				fout.write(dname + ",");
			}
		}
		fout.write("METRIC_Q\n");
		
		for (Test t : specificTests) {
			EnumMap<DimensionID, Double> paramValuesForConfig = parameterSpaceMappings.get(t);
			Double qv = qualityMappings.get(t);
			fout.write(t.getName() + "," + getTestResultTag(t).toString() + ",");
			for (DimensionID d : paramValuesForConfig.keySet()) {
				if (chosenDimensions.contains(d)) {
					Double v = paramValuesForConfig.get(d);
					fout.write(v + ",");
				}
			}
			fout.write(qv + "\n");
		}
		fout.close();
	}
	
	public void writeOutResultsTabSep(EnumSet<DimensionID> chosenDimensions) {
		writeOutResultsTabSep(testsToInclude, chosenDimensions);
	}
	
	// Assume all dimensions if not set
	public void writeOutResultsTabSep() {
		writeOutResultsTabSep(testsToInclude, EnumSet.allOf(DimensionID.class));
	}
	
	public void writeOutResultsCSV(String filePathOut, EnumSet<DimensionID> chosenDimensions) throws IOException {
		writeOutResultsCSV(filePathOut, testsToInclude, chosenDimensions);
	}
	
	public void writeOutResultsCSV(String filePathOut) throws IOException {
		writeOutResultsCSV(filePathOut, testsToInclude, EnumSet.allOf(DimensionID.class));
	}
}
