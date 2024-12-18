package uk.ac.york.soprano.sbt.evolutionary.phytestingselection.dimensionreducer;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.DimensionID;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation;
import uk.ac.york.soprano.sbt.evolutionary.SESAMETestSolution;
import uk.ac.york.soprano.sbt.evolutionary.phytestingselection.MissingDimensionsInMap;

/** Processes the Test to generate a set of coordinates for the parameter space **/
public abstract class ParameterSpaceDimensionalityReduction {
	protected TestCampaign selectedCampaign;

	public abstract EnumMap<DimensionID, Double> generateDimensionSetsForParams(Test t) throws MissingDimensionsInMap;
	public abstract EnumMap<DimensionID, Double> generateDimensionSetsSpeculative(SESAMETestSolution sts) throws MissingDimensionsInMap;
	
	protected void checkAllDimensionsSet(EnumMap<DimensionID, Double> m, List<FuzzingOperation> ops, boolean hasParams) throws MissingDimensionsInMap {
		// check the dimensional values are all set properly for the test
		EnumSet<DimensionID> allDimensions = EnumSet.allOf(DimensionID.class);
		
		
		if (!hasParams) {
			allDimensions.remove(DimensionID.P1_PARAMETER_MEAN);
			allDimensions.remove(DimensionID.P2_PARAMETER_VARIANCE);
		}
		
		Set<DimensionID> missingDimensions = new HashSet<DimensionID>();
		for (DimensionID d : allDimensions) {
			if (!(m.containsKey(d))) {
				missingDimensions.add(d);
			}
		}
		
		if (missingDimensions.size() > 0) {
			throw new MissingDimensionsInMap(missingDimensions,m);
		} 
	}

	public void setCampaign(TestCampaign selectedCampaign) {
		this.selectedCampaign = selectedCampaign;
	}
}