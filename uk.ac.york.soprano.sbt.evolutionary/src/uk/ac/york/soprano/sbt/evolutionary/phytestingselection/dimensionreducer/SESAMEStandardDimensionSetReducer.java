package uk.ac.york.soprano.sbt.evolutionary.phytestingselection.dimensionreducer;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import uk.ac.york.soprano.sbt.architecture.data.IntervalWithCount;
import uk.ac.york.soprano.sbt.architecture.data.TimeInterval;
import uk.ac.york.soprano.sbt.architecture.data.TimeInterval.InvalidTimingPair;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.DimensionID;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.Activation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.BlackholeNetworkOperation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ConditionBasedTimeLimited;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ConditionBasedActivation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.CustomFuzzingOperation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.DoubleRange;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FixedTimeActivation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.LatencyNetworkOperation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.PacketLossNetworkOperation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.RandomValueFromSetOperation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ValueSet;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.ConditionBasedActivationImpl;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.ConditionBasedTimeLimitedImpl;
import uk.ac.york.soprano.sbt.evolutionary.SESAMETestSolution;
import uk.ac.york.soprano.sbt.evolutionary.dslwrapper.ActivationWrapper;
import uk.ac.york.soprano.sbt.evolutionary.dslwrapper.FuzzingOperationWrapper;
import uk.ac.york.soprano.sbt.evolutionary.dslwrapper.InvalidFuzzingOperation;
import uk.ac.york.soprano.sbt.evolutionary.dslwrapper.InvalidOperation;
import uk.ac.york.soprano.sbt.evolutionary.phytestingselection.FuzzOpLambdaFunction;
import uk.ac.york.soprano.sbt.evolutionary.phytestingselection.MissingDimensionsInMap;
import uk.ac.york.soprano.sbt.evolutionary.phytestingselection.MissingTimingPair;

/** SESAME Standard Dimensional Reducer **/
public class SESAMEStandardDimensionSetReducer extends ParameterSpaceDimensionalityReduction {

	EnumMap<DimensionID, IntervalWithCount> intervalData;

	public class UnimplementedOperation extends Exception {
		private static final long serialVersionUID = 1L;
	}

	public SESAMEStandardDimensionSetReducer(EnumMap<DimensionID, IntervalWithCount> intervals) {
		this.intervalData = intervals;
	}

	public SESAMEStandardDimensionSetReducer() {
		this.intervalData = new EnumMap<DimensionID, IntervalWithCount>(DimensionID.class);
	}

	public TimeInterval fuzzingOperationTimeRange(FuzzingOperation op, boolean asTemplate) throws InvalidTimingPair {
		Activation a = op.getActivation();

		// With template, always use the time from the model - even for condition-based
		if ((a instanceof FixedTimeActivation) || asTemplate) {
			double s = ((FixedTimeActivation) a).getStartTime();
			double e = ((FixedTimeActivation) a).getEndTime();
			return new TimeInterval(s, e);
		}

		if ((a instanceof ConditionBasedActivation) || (a instanceof ConditionBasedTimeLimited) || !asTemplate) {
			// TODO: implement the timeRange extraction in the DSL
			FixedTimeActivation fta = op.getRecordedTimings();
			if (fta == null) {
				throw new MissingTimingPair(op);
			}
			double s = op.getRecordedTimings().getStartTime();
			double e = op.getRecordedTimings().getEndTime();
			return new TimeInterval(s, e);
		}

		throw new MissingTimingPair(op);
	}

	public TimeInterval normalisedFuzzOpTimeRange(FuzzingOperation op) throws InvalidTimingPair, InvalidOperation {
		TimeInterval tOrig = fuzzingOperationTimeRange(op, false);
		FuzzingOperation templateOp = op.getFromTemplate();
		if (templateOp instanceof FuzzingOperation) {
			TimeInterval tTemplate = fuzzingOperationTimeRange(op.getFromTemplate(), true);
			return tOrig.normaliseToRange(tTemplate);
		} else {
			throw new InvalidOperation();
		}
		
	}

	private OptionalDouble calculateMeanViaLambda(List<FuzzingOperation> ops, FuzzOpLambdaFunction lam) {
		OptionalDouble od = ops.stream().mapToDouble(op -> lam.operation(op)).average();
		return od;
	}

	private OptionalDouble calculateVarianceViaLambda(List<FuzzingOperation> ops, FuzzOpLambdaFunction lam) {
		// https://gist.github.com/asela38/ed553c6908976ffc1398dd9cd83a15e6
		OptionalDouble mean_o = calculateMeanViaLambda(ops, lam);
		if (mean_o.isPresent()) {
			Double mean = mean_o.getAsDouble();
			OptionalDouble variance = ops.stream().map(op -> lam.operation(op) - mean).map(i -> i * i)
					.mapToDouble(i -> i).average();
			return variance;
		} else {
			return OptionalDouble.empty();
		}
	}

	private OptionalDouble calculateStddevViaLambda(List<FuzzingOperation> ops, FuzzOpLambdaFunction lam) {
		// https://gist.github.com/asela38/ed553c6908976ffc1398dd9cd83a15e6
		OptionalDouble mean_o = calculateMeanViaLambda(ops, lam);
		if (mean_o.isPresent()) {
			Double mean = mean_o.getAsDouble();
			OptionalDouble variance_o = ops.stream().map(op -> lam.operation(op) - mean).map(i -> i * i)
					.mapToDouble(i -> i).average();
			if (variance_o.isPresent()) {
				Double var = variance_o.getAsDouble();
				return OptionalDouble.of(Math.sqrt(var));
			} else {
				return OptionalDouble.empty();
			}
		} else {
			return OptionalDouble.empty();
		}
	}

	private OptionalDouble calculateMeanOfArray(List<Double> vs) {
		return vs.stream().mapToDouble(d -> d).average();
	}

	private OptionalDouble calculateVarianceOfArray(List<Double> vs) {
		OptionalDouble mean_o = calculateMeanOfArray(vs);
		if (mean_o.isPresent()) {
			Double mean = mean_o.getAsDouble();
			OptionalDouble var_o = vs.stream().map(d -> (d - mean)).map(d -> d * d).mapToDouble(d -> d).average();
			return var_o;
		} else {
			return OptionalDouble.empty();
		}
	}

	private OptionalDouble calculateStddevOfArray(List<Double> vs) {
		OptionalDouble mean_o = calculateMeanOfArray(vs);
		if (mean_o.isPresent()) {
			Double mean = mean_o.getAsDouble();
			OptionalDouble var_o = vs.stream().map(d -> (d - mean)).map(d -> d * d).mapToDouble(d -> d).average();
			if (var_o.isPresent()) {
				return OptionalDouble.of(Math.sqrt(var_o.getAsDouble()));
			} else {
				return OptionalDouble.empty();
			}
		} else {
			return OptionalDouble.empty();
		}
	}

	private double getValueSetSize(ValueSet vr) throws UnknownSize {
		if (vr instanceof DoubleRange) {
			DoubleRange dr = (DoubleRange) vr;
			double dist = dr.getUpperBound() - dr.getLowerBound();
			return dist;
		}

		throw new UnknownSize();
	}

	private double getLowerBound(ValueSet vr) throws UnknownSize {
		if (vr instanceof DoubleRange) {
			DoubleRange dr = (DoubleRange) vr;
			return dr.getLowerBound();
		}

		throw new UnknownSize();
	}

	private double getLowerBound(DoubleRange vr) {
		DoubleRange dr = (DoubleRange) vr;
		return dr.getLowerBound();
	}

	private double getRelativeInRange(DoubleRange dr, double v) {
		double rel = (v - dr.getLowerBound()) / (dr.getUpperBound() - dr.getLowerBound());
		return rel;
	}

	private void accumulateNormalisedParams(List<Double> normalisedParams, FuzzingOperation op) {
		// The parameters for all of these have to be accumulated differently? -
		// check the form of these for all parameters
		if (op instanceof RandomValueFromSetOperation) {
			RandomValueFromSetOperation rvfs = (RandomValueFromSetOperation) op;
			RandomValueFromSetOperation template = (RandomValueFromSetOperation) op.getFromTemplate();
			Iterator<ValueSet> itVS = rvfs.getValueSet().iterator();
			Iterator<ValueSet> itParent = template.getValueSet().iterator();

			int i = 0;
			int targetValue = -1;
			if (intervalData.containsKey(DimensionID.P1_PARAMETER_MEAN)) {
				targetValue = intervalData.get(DimensionID.P1_PARAMETER_MEAN).getExtraTag();
			}

			while (itVS.hasNext() && itParent.hasNext()) {
				if (i == targetValue) {
					try {
						double dist = getValueSetSize(itVS.next());
						double templateDist = getValueSetSize(itParent.next());
						normalisedParams.add(dist / templateDist);
					} catch (UnknownSize e) {
						System.out.println("UNKNOWN SIZE for param from " + op.toString());
					}
				}
			}
		}

		// The impact is the lower bound for latency, so normalise to the range
		if (op instanceof LatencyNetworkOperation) {
			LatencyNetworkOperation lno = (LatencyNetworkOperation) op;
			LatencyNetworkOperation lnoTemplate = (LatencyNetworkOperation) op.getFromTemplate();
			DoubleRange tpRange = lnoTemplate.getLatency();
			double v = getLowerBound(lno.getLatency());
			double res = getRelativeInRange(tpRange, v);
			normalisedParams.add(res);
		}

		// The impact is the lower bound for packet loss, so normalise to the range
		if (op instanceof PacketLossNetworkOperation) {
			PacketLossNetworkOperation lno = (PacketLossNetworkOperation) op;
			PacketLossNetworkOperation lnoTemplate = (PacketLossNetworkOperation) op.getFromTemplate();
			DoubleRange tpRange = lnoTemplate.getFrequency();
			double v = getLowerBound(lno.getFrequency());
			double res = getRelativeInRange(tpRange, v);
			normalisedParams.add(res);
		}
	}

	private void setTimingDimensions(List<FuzzingOperation> ops, Map<DimensionID, Double> m) {
		// Fuzzing time mean computed over all operation midpoint times in the test)
		// Fuzzing time mean length (mean length computed over all operation
		OptionalDouble midpointMean = calculateMeanViaLambda(ops, (FuzzingOperation op) -> {
				return normalisedFuzzOpTimeRange(op).getMidpoint();
		});
		
		OptionalDouble lengthMean = calculateMeanViaLambda(ops, (FuzzingOperation op) -> {
				return normalisedFuzzOpTimeRange(op).getLength();
		});

		// TODO: should we use standard deviation or variance?
		OptionalDouble midpointVariance = calculateStddevViaLambda(ops, (FuzzingOperation op) -> {
			return normalisedFuzzOpTimeRange(op).getMidpoint();
		});

		if (midpointMean.isPresent()) {
			m.put(DimensionID.T1_TIME_MIDPOINT_MEAN, midpointMean.getAsDouble());
		}

		if (lengthMean.isPresent()) {
			m.put(DimensionID.T2_TIME_LENGTH_MEAN, lengthMean.getAsDouble());
		}

		if (midpointVariance.isPresent()) {
			m.put(DimensionID.T3_TIME_MIDPOINT_VAR, midpointVariance.getAsDouble());
		}
	}

	private boolean setParameterDimensions(List<FuzzingOperation> ops, EnumMap<DimensionID, Double> m) {
		List<Double> normalisedParams = new ArrayList<Double>();
		boolean hasParams = false;

		for (FuzzingOperation op : ops) {
			accumulateNormalisedParams(normalisedParams, op);
		}

		OptionalDouble paramMean = calculateMeanOfArray(normalisedParams);
		OptionalDouble paramVar = calculateVarianceOfArray(normalisedParams);

		if (paramMean.isPresent()) {
			m.put(DimensionID.P1_PARAMETER_MEAN, paramMean.getAsDouble());
			hasParams = true;
		}

		if (paramVar.isPresent()) {
			m.put(DimensionID.P2_PARAMETER_VARIANCE, paramVar.getAsDouble());
			hasParams = true;
		}
		
		return hasParams;
	}

	private void setOpVarDimensions(List<FuzzingOperation> ops, EnumMap<DimensionID, Double> m) {
		int fuzzRangeCount = 0;
		int delayCount = 0;
		int deletionCount = 0;
		int customOpCount = 0;

		for (FuzzingOperation op : ops) {
			if (op instanceof RandomValueFromSetOperation) {
				fuzzRangeCount++;
			}

			if (op instanceof LatencyNetworkOperation) {
				delayCount++;
			}

			if (op instanceof PacketLossNetworkOperation) {
				deletionCount++;
			}

			if (op instanceof BlackholeNetworkOperation) {
				deletionCount++;
			}
			
			if (op instanceof CustomFuzzingOperation) {
				customOpCount++;
			}

			int totalCount = fuzzRangeCount + delayCount + deletionCount + customOpCount;
			m.put(DimensionID.O1_FUZZRANGE_COUNT, Double.valueOf(fuzzRangeCount));
			m.put(DimensionID.O2_DELAY_COUNT, Double.valueOf(delayCount));
			m.put(DimensionID.O3_DELETION_COUNT, Double.valueOf(deletionCount));
			m.put(DimensionID.O0_TOTAL_COUNT, Double.valueOf(totalCount));
		}
	}

	private EnumMap<DimensionID, Double> generateDimensionSets(List<FuzzingOperation> ops)
			throws MissingDimensionsInMap {
		EnumMap<DimensionID, Double> m = new EnumMap<DimensionID, Double>(DimensionID.class);
		setTimingDimensions(ops, m);
		boolean hasParams = setParameterDimensions(ops, m);
		setOpVarDimensions(ops, m);

		// If there are no operations, no values will be returned for this case!
		if (ops.size() > 0) {
			// If there are no params for the included operations, e.g. in a 
			// parameterless custom operation, naturally the param dimensions will
			// never be set. Need to check for this case
			checkAllDimensionsSet(m, ops, hasParams);
		}

		return m;
	}

	// Were the operations activated or not? Conditon-based operations may not have been activated
	// at runtime, so we can only include them if they were
	public boolean opWasActivated(Activation a, FuzzingOperation op) {
		if ((a instanceof ConditionBasedActivation) || (a instanceof ConditionBasedTimeLimited)
					|| (a instanceof ConditionBasedActivationImpl) || (a instanceof ConditionBasedTimeLimitedImpl)) {
					FixedTimeActivation fta = op.getRecordedTimings();
					if (fta == null) {
						// No timing info recorded for condition-based operation
						System.out.println("OPHASTIMING: rejecting for no timing info " + op.getName());
						return false;
					} else {
						return true;
					}
			} else {
				// If it is time-based, always include it
				return true;
			}
	}
	
	public boolean opHasTiming(FuzzingOperation op) throws InvalidFuzzingOperation {
		FuzzingOperationWrapper fw = new FuzzingOperationWrapper(op);
		ActivationWrapper aw = fw.getActivationWrapper();
		if (aw.isStatic()) {
			return false;
		}
		
		if (aw.isConditionBased()) {
			return opWasActivated(aw.getActivation(), op);
		}
		
		return true;
	}

	public List<FuzzingOperation> filterOpsRemoveUnactivated(List<FuzzingOperation> ops) {
		return ops.stream().filter(op ->
				opHasTiming(op)).collect(Collectors.toList());
	}

	public EnumMap<DimensionID, Double> generateDimensionSetsForParams(Test t) throws MissingDimensionsInMap {
		List<FuzzingOperation> opsUnfiltered = t.getOperations();
		System.out.println("OPHASTIMING: checking " + t.getName() + " - " + opsUnfiltered.size() + " operations");
		List<FuzzingOperation> ops = filterOpsRemoveUnactivated(opsUnfiltered);
		System.out.println("OPHASTIMING: after filtering - " + t.getName() + " - " + ops.size() + " operations");
		EnumMap<DimensionID, Double> m = generateDimensionSets(ops);
		return m;
	}

	public EnumMap<DimensionID, Double> generateDimensionSetsSpeculative(SESAMETestSolution sts)
			throws MissingDimensionsInMap {
		List<FuzzingOperationWrapper> sfowList = sts.getVariables();
		List<FuzzingOperation> ops = sfowList.stream().map(sfow -> sfow.getFuzzingOperation())
				.collect(Collectors.toList());
		EnumMap<DimensionID, Double> m = generateDimensionSets(ops);
		return m;
	}
}
