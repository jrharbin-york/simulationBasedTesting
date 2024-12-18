package uk.ac.york.soprano.sbt.evolutionary.phytestingselection;

import org.eclipse.emf.common.util.EList;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.*;
import uk.ac.york.soprano.sbt.evolutionary.phytestingselection.dimensionreducer.ParameterSpaceDimensionalityReduction;
import uk.ac.york.soprano.sbt.evolutionary.phytestingselection.metricquality.MetricQualityValue;

public class PhyTestingSubsetSelectionFinal extends PhyTestingSubsetSelection {
	public PhyTestingSubsetSelectionFinal(ParameterSpaceDimensionalityReduction dsc, MetricQualityValue mqv) {
		super(dsc, mqv);
	}

	protected boolean isInFinalFront(TestCampaign selectedCampaign, Test t) {
		EList<CampaignResultSet> rs = selectedCampaign.getResultSets();
		for (CampaignResultSet r : rs) {
			if (r.getStatus() == ResultSetStatus.FINAL) {
				if (r.getName().contains("NONDOM")) {
					if (r.getResults().contains(t)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	protected boolean isTagged(TestCampaign selectedCampaign, Test t) {
		return isInFinalFront(selectedCampaign, t);
	}
}
