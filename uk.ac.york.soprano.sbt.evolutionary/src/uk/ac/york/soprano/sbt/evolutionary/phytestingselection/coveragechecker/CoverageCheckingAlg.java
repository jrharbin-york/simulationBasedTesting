package uk.ac.york.soprano.sbt.evolutionary.phytestingselection.coveragechecker;

import java.util.EnumMap;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.DimensionID;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test;

public abstract class CoverageCheckingAlg {
	public abstract void register(Test t, EnumMap<DimensionID, Double> map);
	public abstract boolean isCovered();
	public abstract boolean _debugIsCellOccupied(int [] dimensions);
	public abstract boolean isCellOccupied(Test t, EnumMap<DimensionID, Double> map);
	public abstract double coverageProportion();
}
