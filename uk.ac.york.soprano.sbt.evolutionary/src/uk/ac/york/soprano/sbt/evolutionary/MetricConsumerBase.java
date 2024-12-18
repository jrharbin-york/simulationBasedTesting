package uk.ac.york.soprano.sbt.evolutionary;

import org.eclipse.emf.common.util.EList;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.Date;
import java.util.Map;

import uk.ac.york.soprano.sbt.architecture.data.MetricMessage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FixedTimeActivation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperationsFactory;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.Metric;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.MetricDefault;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.MetricInstance;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.MetricOptimisationDirection;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.MetricsFactory;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Results.Result;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Results.ResultsFactory;

public class MetricConsumerBase implements Runnable {

	private TestCampaign selectedCampaign;

	private HashMap<String, Metric> metricLookup = new LinkedHashMap<String, Metric>();

	// This stores the ID for the metrics for JMetal
	private HashMap<String, Integer> metricIDLookupByPlace = new LinkedHashMap<String, Integer>();

	// This stores the value for the metric when found
	private HashMap<String, MetricMessage> metricMessages = new LinkedHashMap<String, MetricMessage>();

	// This holds the current test solution being evaluated
	protected Optional<SESAMETestSolution> currentSolution = Optional.empty();
	
	private double lastValidTimestamp = Double.MAX_VALUE;
	
	private double lastTimestampSeen;

	protected void setupMetricLookup() {
		EList<Metric> metrics = selectedCampaign.getMetrics();

		int id = 0;
		for (Metric m : metrics) {
			String name = m.getName();
			metricLookup.put(name, m);
			if (m.isUseInOptimisation()) {
				metricIDLookupByPlace.put(name, id);
				id++;
				System.out.println("metricIDLookup - metric " + name + " ID = " + id);
			}
		}
	}

	public MetricConsumerBase(TestCampaign selectedCampaign) throws InvalidTestCampaign {
		if (selectedCampaign == null) {
			throw new InvalidTestCampaign();
		}
		this.selectedCampaign = selectedCampaign;
		setupMetricLookup();
	}
	
	public void run() {
		
	}
	
	public void setLastValidTimestamp(double lastValidTimestamp) {
		this.lastValidTimestamp = lastValidTimestamp;
	}

	protected void updateTimestamp(double timestamp) {
		if (timestamp > this.lastTimestampSeen) {
			this.lastTimestampSeen = timestamp;
		}
	}

	public void storeArrivingMessage(MetricMessage msg) {
		String targetMetricID = msg.getMetricName();
		// This assumes that the last message is the only one we obtain the metric value from
		if (metricTimestampValid(msg.getTimestamp()) || targetMetricID.contains("fuzzingOperationTimes")) {
			metricMessages.put(targetMetricID, msg);
		}
	}
	
	private boolean metricTimestampValid(double thisTimestamp) {
		return (thisTimestamp < this.lastValidTimestamp);
	}

	public void close() {

	}

	public void setSolution(SESAMETestSolution solution) {
		this.currentSolution = Optional.of(solution);
	}

	private void updateFuzzOperationTimeByID(String fuzzOpId, Double d, String tag)
			throws MissingFuzzingOperation, UnrecognisedSpecialMessageTag {
		if (currentSolution.isPresent()) {
			Test t = currentSolution.get().getInternalType();
			EList<FuzzingOperation> ops = t.getOperations();
			Optional<FuzzingOperation> target = Optional.empty();

			// Scan for an operation with matching ID
			for (FuzzingOperation op : ops) {
				String name = op.getName();
				int seqNum = op.getSequenceNumInTest();
				String combinedID = name + "-" + String.valueOf(seqNum) + "-";

				if (fuzzOpId.contains(combinedID)) {
					target = Optional.of(op);
				}
			}

			if (target.isPresent()) {
				FuzzingOperation op = target.get();
				updateRecordedTiming(op, d, tag);
			} else {
				throw new MissingFuzzingOperation(fuzzOpId);
			}
		}
	}

	private void updateRecordedTiming(FuzzingOperation op, Double d, String tag) throws UnrecognisedSpecialMessageTag {
		FuzzingOperationsFactory f = FuzzingOperationsFactory.eINSTANCE;
		FixedTimeActivation ft = op.getRecordedTimings();
		if (ft == null) {
			ft = f.createFixedTimeActivation();
			op.setRecordedTimings(ft);
		}

		if (tag.equals("START")) {
			ft.setStartTime(d);
		} else {
			if (tag.equals("END")) {
				ft.setEndTime(d);
			} else {
				throw new UnrecognisedSpecialMessageTag(tag);
			}
		}
	}

	private void updateMetricsInModelSpecial(MetricMessage msg)
			throws MissingFuzzingOperation, UnrecognisedSpecialMessageTag {
		// Find the fuzzing operation for this message
		// Update the value from it
		String fuzzOpId = msg.getMetricName();
		String tag = msg.getSpecialInfo();
		System.out.println("special tag = " + tag);
		System.out.println("fuzzOpId = " + fuzzOpId);
		if (tag.equals("START") || tag.equals("END")) {
			Double d = (Double) msg.getValue();
			updateFuzzOperationTimeByID(fuzzOpId, d, tag);
		}
	}

	public void updateMetricsInModelStandard(String metricName, Object val) throws InvalidName {

		if (currentSolution.isEmpty()) {
			System.out.println("currentSolution not set - cannot update metric is empty");
		} else {
			try {
				Test t = currentSolution.get().getInternalType();
				if (t != null) {
					EList<MetricInstance> mList = t.getMetrics();

					boolean found = false;
					// If there is already a metric instance for this, use it,
					// rather than adding it to the model
					for (MetricInstance m : mList) {
						if (m.getMetric().getName().equals(metricName)) {
							found = true;
							// Sets the name
							m.getResult().setName(metricName);
							Double d = Double.parseDouble(val.toString());
							m.getResult().setValue(d);
							System.out.println("Updating metric result value in DSL :" + m + "," + metricName + " = " + val);
						}
					}

					if (!found) {
						// Add a new metric instance containing the value
						MetricsFactory factory = MetricsFactory.eINSTANCE;
						ResultsFactory rfactory = ResultsFactory.eINSTANCE;
						MetricInstance mNewInst = factory.createMetricInstance();
						setMetricFromCampaign(mNewInst, metricName);

						Result mr = rfactory.createResult();
						mr.setName(metricName);
						Double d = Double.parseDouble(val.toString());
						mr.setValue(d);
						mNewInst.setResult(mr);
						mList.add(mNewInst);
						System.out.println("Adding new metric result value to DSL :" + mr + "," + metricName + " = " + val);
					}
				}
			} catch (MissingMetric e) {
				System.out.println("Missing metric");
			}
		}
	}

	private void setMetricFromCampaign(MetricInstance mNewInst, String targetID) throws MissingMetric {
		Metric m = metricLookup.get(targetID);
		if (m != null) {
			mNewInst.setMetric(m);
		} else {
			throw new MissingMetric(targetID);
		}
	}

	public void updateObjectivesJMetal(String metricName, Object val) throws JMetalMetricSettingFailed {
		try {
			if (currentSolution.isPresent()) {
				String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
				SESAMETestSolution sol = currentSolution.get();
				int num = getMetricIDForCampaign(metricName);
				Metric m = getMetricForCampaign(metricName);
				Double d = Double.parseDouble(val.toString());

				System.out.println("updateObjectivesJMetal - at timestamp " + timeStamp + " - setting metric "	+ metricName + " (num " + num + ") to value " + val);

				sol.setObjectiveMetric(num, m);

				if (m.getDir() == MetricOptimisationDirection.HIGHEST) {
					sol.setObjective(num, -d);
				}

				if (m.getDir() == MetricOptimisationDirection.LOWEST) {
					sol.setObjective(num, d);
				}
			}
		} catch (MissingMetric e) {
			throw new JMetalMetricSettingFailed(e);
		}
	}

	private int getMetricIDForCampaign(String metricID) throws MissingMetric {
		if (metricIDLookupByPlace.containsKey(metricID)) {
			return metricIDLookupByPlace.get(metricID);
		} else {
			throw new MissingMetric(metricID);
		}
	}

	private Metric getMetricForCampaign(String metricID) throws MissingMetric {
		if (metricLookup.containsKey(metricID)) {
			return metricLookup.get(metricID);
		} else {
			throw new MissingMetric(metricID);
		}
	}

	public void clearTopic() {

	}

	public void finaliseUpdatesStandardMetrics() {
		for (Map.Entry<String, Metric> me : metricLookup.entrySet()) {
			String metricName = me.getKey();
			Metric m = me.getValue();

			if (metricMessages.containsKey(metricName)) {
				MetricMessage msg = metricMessages.get(metricName);
				Object val = msg.getValue();
				try {
					if (!msg.checkIfSpecial()) {
						updateMetricsInModelStandard(metricName, val);
						if (m.isUseInOptimisation()) {
							updateObjectivesJMetal(metricName, val);
						}
					}
				} catch (InvalidName e1) {
					e1.printStackTrace();
				} catch (JMetalMetricSettingFailed e) {
					e.printStackTrace();
				}
			} else {
				// Metric is not defined.. use a default if it exists
				if (m.getValueIfNotReceived() != null) {
					MetricDefault mDef = m.getValueIfNotReceived();
					Double val = mDef.getDefaultVal();
					try {
						updateMetricsInModelStandard(metricName, val);
						if (m.isUseInOptimisation()) {
							updateObjectivesJMetal(metricName, val);
						}
					} catch (InvalidName e1) {
						e1.printStackTrace();
					} catch (JMetalMetricSettingFailed e) {
						e.printStackTrace();
					}
				} else {
					System.out.println("No metric valueIfNotReceived set for " + m.getName());
				}
			}
		}
	}

	private void finaliseUpdatesSpecialMetrics() {
		for (Map.Entry<String, MetricMessage> e : metricMessages.entrySet()) {
			String k = e.getKey();
			MetricMessage msg = e.getValue();
			if (msg.checkIfSpecial()) {
				try {
					updateMetricsInModelSpecial(msg);
				} catch (MissingFuzzingOperation | UnrecognisedSpecialMessageTag e1) {
					e1.printStackTrace();
					// DEBUGGING: ensure exit when this fails
					System.exit(-1);
				}
			}
		}
	}

	public void finaliseUpdates() {
		finaliseUpdatesSpecialMetrics();
		finaliseUpdatesStandardMetrics();
	}

	public void notifyFinalise() {
		// This is handled in finaliseUpdates
	}
	
	public double getTimestamp() {
		return lastTimestampSeen;
	}

	public void updateDSLDynamically() {
		finaliseUpdatesSpecialMetrics();
		finaliseUpdatesStandardMetrics();
	}
}