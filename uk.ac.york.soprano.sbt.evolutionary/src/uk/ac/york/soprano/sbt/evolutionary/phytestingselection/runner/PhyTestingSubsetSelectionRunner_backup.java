package uk.ac.york.soprano.sbt.evolutionary.phytestingselection.runner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;

import uk.ac.york.soprano.sbt.evolutionary.InvalidTestCampaign;
import uk.ac.york.soprano.sbt.evolutionary.phytestingselection.PhyTestingSubsetSelection;
import uk.ac.york.soprano.sbt.evolutionary.phytestingselection.PhyTestingSubsetSelectionPartial;
import uk.ac.york.soprano.sbt.evolutionary.phytestingselection.dimensionreducer.*;
import uk.ac.york.soprano.sbt.evolutionary.phytestingselection.metricquality.*;

public class PhyTestingSubsetSelectionRunner_backup {
	public static void main(String[] args) {
		///////////////////////////////////// SET PARAMETERS HERE ////////////////////////////////////////////////////////
		String fileName = "/home/jharbin/academic/sesame/WP6/runtime-EclipseApplication/TTSTestProject/models/phytesting/results/testingTTS_Kuka_phytesting_coverageGA_condbased_jul03.model";
		String campaignName = "coverageExperiment-condbased";
		boolean isFinal = false;
		String searchString1 = "NONDOM";
		String searchString2 = "intermediate-210";
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		String csvOut = fileName + campaignName + "reduced-" + searchString1 + "-" + searchString2 + ".csv";
		
		try {
			List<String> metricNameList = new ArrayList<String>();
			metricNameList.add("collisionOccurance");
			PhyTestingSubsetSelection testPhysub = new PhyTestingSubsetSelectionPartial(new SESAMEStandardDimensionSetReducer(), new SESAMEMetricQualityValues(metricNameList), isFinal, searchString1, searchString2);
			
			testPhysub.loadModelToResults(fileName, campaignName);
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