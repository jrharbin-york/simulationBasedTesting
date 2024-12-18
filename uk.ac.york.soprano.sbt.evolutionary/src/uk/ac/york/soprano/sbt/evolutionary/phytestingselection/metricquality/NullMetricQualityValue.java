package uk.ac.york.soprano.sbt.evolutionary.phytestingselection.metricquality;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign;

public class NullMetricQualityValue extends MetricQualityValue {

	public double generateMetricQualityValue(Test t) {
		return 0.0;
	}

	public void setCampaign(TestCampaign selectedCampaign2) {
		
	}
}
