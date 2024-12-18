package uk.ac.york.soprano.sbt.evolutionary.phytestingselection;

import org.eclipse.emf.common.util.EList;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.CampaignResultSet;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.ResultSetStatus;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign;
import uk.ac.york.soprano.sbt.evolutionary.phytestingselection.dimensionreducer.ParameterSpaceDimensionalityReduction;
import uk.ac.york.soprano.sbt.evolutionary.phytestingselection.metricquality.MetricQualityValue;

public class PhyTestingSubsetSelectionPartial extends PhyTestingSubsetSelection {

	private boolean isFinal;
	private String searchString1;
	private String searchString2;
	
	public PhyTestingSubsetSelectionPartial(ParameterSpaceDimensionalityReduction dsc, MetricQualityValue mqv, boolean isFinal, String searchString1, String searchString2) {
		super(dsc, mqv);
		this.isFinal = isFinal;
		this.searchString1 = searchString1;
		this.searchString2 = searchString2;
	}

	protected boolean isInFinalFront(TestCampaign selectedCampaign, Test t) {
		ResultSetStatus targetStatus = ResultSetStatus.INTERMEDIATE;
		if (isFinal) {
			targetStatus = ResultSetStatus.FINAL;
		}
		
		EList<CampaignResultSet> rs = selectedCampaign.getResultSets();
		for (CampaignResultSet r : rs) {
			if (r.getStatus() == targetStatus) {
				if (r.getName().contains(searchString1) && r.getName().contains(searchString2)) {
					if (r.getResults().contains(t)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	protected boolean isTagged(TestCampaign selectedCampaign, Test t) {
		return isInFinalFront(selectedCampaign,t);
	}
	
}
