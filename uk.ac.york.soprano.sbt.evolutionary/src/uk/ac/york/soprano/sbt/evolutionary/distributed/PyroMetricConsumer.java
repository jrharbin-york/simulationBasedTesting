package uk.ac.york.soprano.sbt.evolutionary.distributed;

import java.util.Optional;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign;
import uk.ac.york.soprano.sbt.evolutionary.InvalidTestCampaign;
import uk.ac.york.soprano.sbt.evolutionary.MetricConsumerBase;
import uk.ac.york.soprano.sbt.evolutionary.SESAMETestSolution;

public class PyroMetricConsumer extends MetricConsumerBase {

	public PyroMetricConsumer(TestCampaign selectedCampaign, SESAMETestSolution solution) throws InvalidTestCampaign {
		super(selectedCampaign);
		this.currentSolution = Optional.of(solution);
		setupMetricLookup();
	}
}
