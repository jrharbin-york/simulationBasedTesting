package uk.ac.york.soprano.sbt.evolutionary.phytestingselection.coveragechecker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;

import org.nd4j.linalg.api.iter.NdIndexIterator;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

import uk.ac.york.soprano.sbt.architecture.data.IntervalWithCount;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.DimensionID;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test;

public class GridCoverageChecker extends CoverageCheckingAlg {

	INDArray grid;
	EnumMap<DimensionID, IntervalWithCount> chosenDimensionIntervals;
	EnumMap<DimensionID, Integer> indexForDimension;
	private int coveragePerCellTarget;
	private double proportionCoverageNeeded;
	
	/** This checks coverage across the entire grid **/
	public GridCoverageChecker(EnumMap<DimensionID, IntervalWithCount> chosenDimensionIntervals, int coveragePerCellTarget, double proportionCoverageNeeded) {
		// Create the nd value from the number of dim in each dimension's interval
		this.chosenDimensionIntervals = chosenDimensionIntervals;	
		int [] gridCellCounts = countVectorForDimensions(chosenDimensionIntervals);
		setIndexMappingForChosenDimensions();
		grid = Nd4j.create(gridCellCounts);
		System.out.println("COV: create grid with dimensions " + Arrays.toString(gridCellCounts));
		this.coveragePerCellTarget = coveragePerCellTarget;
		this.proportionCoverageNeeded = proportionCoverageNeeded;
	}
	
	private void setIndexMappingForChosenDimensions() {
		indexForDimension = new EnumMap<DimensionID, Integer>(DimensionID.class); 
		int i = 0;
		for (DimensionID d : chosenDimensionIntervals.keySet()) {
			indexForDimension.put(d,i);
			i++;
		}
	}
	
	public void register(Test test, EnumMap<DimensionID, Double> testInfo) {
		// Calculate the value for each dimension
		int [] indices = indexVectorForDimensions(testInfo);
		System.out.println("COV: register for test " + test.getName() + Arrays.toString(indices));
		// Increment the value at the specified incides
		double current = grid.getDouble(indices);
		grid.putScalar(indices, current+1);
	}

	private int[] indexVectorForDimensions(EnumMap<DimensionID, Double> testInfo) {
		List<Integer> dimIndices = new ArrayList<Integer>();
		for (DimensionID d : testInfo.keySet()) {
			if (chosenDimensionIntervals.containsKey(d)) {
				IntervalWithCount iwc = chosenDimensionIntervals.get(d); 
				Double v = testInfo.get(d);
				int index = iwc.getIndexOfCellForValue(v);
				dimIndices.add(index);
			} else {
				System.out.println("COV: skipping dimension ID " + d.toString() + " not in chosen dimensions");
			}
		}
		return dimIndices.stream().mapToInt(Integer::intValue).toArray();
	}
	
	private int[] countVectorForDimensions(EnumMap<DimensionID, IntervalWithCount> intervalInfo) {
		List<Integer> dimCounts = new ArrayList<Integer>();
		for (DimensionID d : intervalInfo.keySet()) {
			IntervalWithCount iwc = intervalInfo.get(d);
			dimCounts.add(iwc.getCount());
		}
		return dimCounts.stream().mapToInt(Integer::intValue).toArray();
	}

	public boolean isCovered() {
		double coverageProportion = coverageProportion();
		System.out.println("COV: coverage proportion " + coverageProportion + ", proportionCoverageNeeded = " + proportionCoverageNeeded);
		return (coverageProportion >= proportionCoverageNeeded);
	}
	
	public double coverageProportion() {
		int [] gridCellCounts = countVectorForDimensions(chosenDimensionIntervals);
		NdIndexIterator allCells = new NdIndexIterator(gridCellCounts);
		int totalCells = 0;
		int coveredCells = 0;
		
		while (allCells.hasNext()) {
			long[] currentIndices = allCells.next();
			totalCells+=1;
			double value = grid.getDouble(currentIndices);
			if (value >= coveragePerCellTarget) {
				coveredCells+=1;
				System.out.println("COV: found covered cell " + Arrays.toString(currentIndices));
			}
		}
		// Need to iterate over all cells and find the proportion meeting the coverage constraint
		return ((double)coveredCells) / totalCells;
	}

	@Override
	public boolean _debugIsCellOccupied(int[] indices) {
		return (grid.getDouble(indices) >= coveragePerCellTarget);
	}

	public boolean isCellOccupied(Test t, EnumMap<DimensionID, Double> map) {
		int [] indices = indexVectorForDimensions(map);
		return _debugIsCellOccupied(indices);
	}
}
