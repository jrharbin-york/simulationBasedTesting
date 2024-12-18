package uk.ac.york.soprano.sbt.evolutionary.phytestingselection.runner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;

import uk.ac.york.soprano.sbt.evolutionary.InvalidTestCampaign;
import uk.ac.york.soprano.sbt.evolutionary.phytestingselection.PhyTestingSubsetSelection;
import uk.ac.york.soprano.sbt.evolutionary.phytestingselection.PhyTestingSubsetSelectionFinal;
import uk.ac.york.soprano.sbt.evolutionary.phytestingselection.dimensionreducer.*;
import uk.ac.york.soprano.sbt.evolutionary.phytestingselection.metricquality.*;

public class PhyTestingSubsetSelectionRunnerSpecificTests {
	public static void main(String[] args) {
		String fileName = "home/simtesting/simtesting/simulationBasedTesting/uk.ac.york.sesame.testing.evolutionary/src/uk/ac/york/sesame/testing/evolutionary/predictors/testmodel/TestingPAL-coverage_2024_07_08.model";
		String csvOut = "/tmp/phytestout.csv";
		
		try {
			List<String> metricNameList = new ArrayList<String>();
			metricNameList.add("collisionOccurance");
			PhyTestingSubsetSelection testPhysub = new PhyTestingSubsetSelectionFinal(new SESAMEStandardDimensionSetReducer(), new SESAMEMetricQualityValues(metricNameList));
			testPhysub.loadModelToResults(fileName, "specificTests");
			testPhysub.writeOutResultsTabSep();
			testPhysub.writeOutResultsCSV(csvOut);
			
			System.out.println("Writing out to CSV done...");
			
		} catch (EolModelLoadingException | InvalidTestCampaign e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}