package uk.ac.york.soprano.sbt.evolutionary.test;

import java.util.Arrays;

import org.nd4j.linalg.api.iter.NdIndexIterator;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

public class TestMultiDGrid {
	public static void main(String [] args) {
		int [] gridCellCounts = {3,3,3,3};
		INDArray grid = Nd4j.create(gridCellCounts);
		System.out.println("Created a grid of " + Arrays.toString(gridCellCounts));
		
		
		double newValue = 5;
		int [] indexToSet = {2,1,2,1};
		grid.putScalar(indexToSet, newValue);
		System.out.println("Set " + Arrays.toString(indexToSet) + " to " + newValue);
		
		double v = grid.getDouble(indexToSet);
		System.out.println("Read value as " + v);		
		
		double proportion = coverageProportion(gridCellCounts, grid, 5);
		System.out.println("covered proportion = " + proportion);
	}
	
	public static double coverageProportion(int [] allGridCellCounts, INDArray grid, int coveragePerCellTarget) {
		NdIndexIterator allCells = new NdIndexIterator(allGridCellCounts);
		int totalCells = 0;
		int coveredCells = 0;
		
		while (allCells.hasNext()) {
			long[] currentIndices = allCells.next();
			totalCells+=1;
			double value = grid.getDouble(currentIndices);
			if (value >= coveragePerCellTarget) {
				coveredCells+=1;
			}
		}
		// Need to iterate over all cells and find the proportion meeting the coverage constraint
		return ((double)coveredCells) / totalCells;
	}
	
	
}
