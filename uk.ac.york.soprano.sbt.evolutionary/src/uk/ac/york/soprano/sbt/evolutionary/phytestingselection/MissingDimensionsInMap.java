package uk.ac.york.soprano.sbt.evolutionary.phytestingselection;

import java.util.EnumMap;
import java.util.Set;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.DimensionID;

public class MissingDimensionsInMap extends Exception {

	private Set<DimensionID> missingDimensions;

	public MissingDimensionsInMap(Set<DimensionID> missingDimensions, EnumMap<DimensionID, Double> m) {
		this.missingDimensions = missingDimensions;
	}

	private static final long serialVersionUID = 1L;

	public void printMissingDimensions() {
		System.out.println("missingDimension: ");
		for (DimensionID d : missingDimensions) {
			System.out.println(d);
		}
	}
}