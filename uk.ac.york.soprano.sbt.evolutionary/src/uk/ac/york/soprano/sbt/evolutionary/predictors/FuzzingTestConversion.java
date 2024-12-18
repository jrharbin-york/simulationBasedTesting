package uk.ac.york.soprano.sbt.evolutionary.predictors;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import tech.tablesaw.api.DoubleColumn;
import tech.tablesaw.api.Table;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.ExecutionEndTrigger;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TimeBasedEnd;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.Activation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FixedTimeActivation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation;

public class FuzzingTestConversion {
	private static final boolean CONSTANT_INTENSITY = false;
	private static final boolean GENERATE_RANDOM_VALUE = false;
	private static final boolean GENERATE_SINE_WAVE = false;
	double FIXED_RESOLUTION_SECS = 0.1;
	double PERIOD = 1.0;
	private Test t; 
	

	private HashMap<FuzzingOperation, DoubleColumn> colLookup;
	private int timeStepCount;
	private double resolution;
	private RelativeParameters relParams;
	private Random rng;
	
	private HashMap<String, String> operationInfo = new HashMap<String, String>();

	public FuzzingTestConversion() {
		this.relParams = new RelativeParameters();
	}

	public FuzzingTestConversion(Test t) throws InvalidEndType {
		this.t = t;
		this.resolution = FIXED_RESOLUTION_SECS;
		this.relParams = new RelativeParameters();
		this.rng = new Random();

		ExecutionEndTrigger trigger = t.getParentCampaign().getEndTrigger();

		if (trigger instanceof TimeBasedEnd) {
			TimeBasedEnd tbe = (TimeBasedEnd) trigger;
			double timeLength = tbe.getTimeLimitSeconds();
			this.timeStepCount = (int) (Math.floor(timeLength / resolution));
			System.out.println("timeStepCount = " + timeStepCount);
		} else {
			throw new InvalidEndType(trigger);
		}
	}
	
	public HashMap<String, String> getOperationInfo() {
		return operationInfo;
	}
	
	public Table convert(List<FuzzingOperation> ops) throws UnknownLength, MissingColumnFor, ConversionFailedColError {
		colLookup = new HashMap<FuzzingOperation, DoubleColumn>();
		Table timeSeries = Table.create(t.getName() + "-timeSeries");

		for (FuzzingOperation op : ops) {
			if (includeOp(t, op)) {
				// TODO: get column based upon the template name
				System.out.println(op.getName());
				DoubleColumn colParentOp = lookupColumnFor(timeSeries, op);
				// Go through in time-steps
				Activation a = op.getActivation();
				if (a instanceof FixedTimeActivation) {
					FixedTimeActivation ta = (FixedTimeActivation) a;
					double start = ta.getStartTime();
					double end = ta.getEndTime();
					double intensity = getOperationIntensity(t, op);
					
					String opString = start + "," + end + "," + intensity;
					operationInfo.put(op.getName(), opString);

					for (double time = start; time < end; time += resolution) {	
						
						int index = (int) Math.floor(time / resolution);
						// System.out.println("index=" + index);
						// Increment intensity by this value
						if (colParentOp != null) {
							//System.out.println("start=" + start + ",end=" + end + ",index = " + index);
							Double orig = colParentOp.get(index);
							if (orig == null) {
								System.err.println("ERROR: orig is null for index " + index + " column is of size " + colParentOp.size());
								throw new ConversionFailedColError(orig);
							} else {
								double tdiff = time - start;
								double sinewave = Math.sin((1 + intensity) * 2 * Math.PI * tdiff / PERIOD);
								if (GENERATE_SINE_WAVE) {
									colParentOp = colParentOp.set(index, orig + sinewave);
								} else if (GENERATE_RANDOM_VALUE) {
									colParentOp = colParentOp.set(index, orig + intensity * rng.nextDouble());
								} else {
									colParentOp = colParentOp.set(index, orig + intensity);
								}
							}
						}
					}
				}
			}
		}
		return timeSeries;
	}

	public Table convert() throws UnknownLength, MissingColumnFor, ConversionFailedColError {
		return convert(t.getOperations());
	}

	public void saveTableToCSV(Table tb, File file) throws IOException {
//		Destination d = new Destination(file);
//		CsvWriter w = new CsvWriter();
//		System.out.println("Saving CSV for test " + t.getName() + " to file " + file.getAbsolutePath());
//		w.write(tb, d);
		tb.write().csv(file);
	}

	private void initColumnZero(DoubleColumn col, int timeStepCount) {
		for (int i = 0; i < timeStepCount; i++) {
			col.set(i, 0.0);
		}
	}

	private DoubleColumn lookupColumnFor(Table tbl, FuzzingOperation op) throws MissingColumnFor {
		FuzzingOperation opBase = op.getFromTemplate();

		if (!colLookup.containsKey(opBase)) {
			DoubleColumn col = DoubleColumn.create(opBase.getName(), timeStepCount);
			initColumnZero(col, timeStepCount);
			tbl.addColumns(col);
			colLookup.put(opBase, col);
		}
		DoubleColumn col = colLookup.get(opBase);
		if (col == null) {
			throw new MissingColumnFor(op);
		}
		return col;
	}

	private double getOperationIntensity(Test t, FuzzingOperation op) {
		if (CONSTANT_INTENSITY) {
			return 1.0;
		} else {
			return relParams.scoreForOperation(op);
		}
	}

	private boolean includeOp(Test t, FuzzingOperation op) {
		return true;
	}
}
