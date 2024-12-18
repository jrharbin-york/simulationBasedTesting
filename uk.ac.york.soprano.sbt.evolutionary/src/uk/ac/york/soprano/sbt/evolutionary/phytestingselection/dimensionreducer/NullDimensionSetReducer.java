package uk.ac.york.soprano.sbt.evolutionary.phytestingselection.dimensionreducer;

import java.util.EnumMap;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.DimensionID;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign;
import uk.ac.york.soprano.sbt.evolutionary.SESAMETestSolution;
import uk.ac.york.soprano.sbt.evolutionary.phytestingselection.MissingDimensionsInMap;

/** This one reduces the dimensions to just 0.5 in every dimension **/
public class NullDimensionSetReducer extends ParameterSpaceDimensionalityReduction {

	private EnumMap<DimensionID, Double> returnNullDimensions() {
		EnumMap<DimensionID, Double> m = new EnumMap<DimensionID, Double>(DimensionID.class);
		m.put(DimensionID.T1_TIME_MIDPOINT_MEAN, 0.5); 
		m.put(DimensionID.T3_TIME_MIDPOINT_VAR, 0.5);
		m.put(DimensionID.T2_TIME_LENGTH_MEAN, 0.5);
		m.put(DimensionID.P1_PARAMETER_MEAN, 0.5);
		m.put(DimensionID.P2_PARAMETER_VARIANCE, 0.5);
		return m;
	}
	
	public EnumMap<DimensionID, Double> generateDimensionSetsForParams(Test t) {
		return returnNullDimensions();
	}

	public void setCampaign(TestCampaign selectedCampaign) {
		
	}

	public EnumMap<DimensionID, Double> generateDimensionSetsSpeculative(SESAMETestSolution sts)
			throws MissingDimensionsInMap {
		return returnNullDimensions();
	}
}
