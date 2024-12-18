package uk.ac.york.soprano.sbt.evolutionary.phytestingselection.metricquality;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign;

/** Processes the Test to generate a set of coordinates **/
public abstract class MetricQualityValue {
	protected TestCampaign selectedCampaign;
	protected int testCount = 0;
	
	public abstract double generateMetricQualityValue(Test t);
	
	public void registerTestToInclude(Test t) {
		testCount += 1;
	}

	public void setCampaign(TestCampaign selectedCampaign) {
		this.selectedCampaign = selectedCampaign;
		this.testCount = 0;
	}
}