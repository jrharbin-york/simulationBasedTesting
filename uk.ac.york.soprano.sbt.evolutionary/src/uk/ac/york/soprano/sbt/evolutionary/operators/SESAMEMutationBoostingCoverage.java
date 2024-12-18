package uk.ac.york.soprano.sbt.evolutionary.operators;

import java.io.IOException;
import java.util.EnumMap;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.DimensionID;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test;
import uk.ac.york.soprano.sbt.evolutionary.SESAMETestSolution;
import uk.ac.york.soprano.sbt.evolutionary.dslwrapper.FuzzingOperationWrapper;
import uk.ac.york.soprano.sbt.evolutionary.phytestingselection.MissingDimensionsInMap;
import uk.ac.york.soprano.sbt.evolutionary.phytestingselection.NoOperations;
import uk.ac.york.soprano.sbt.evolutionary.phytestingselection.coveragechecker.CoverageCheckingAlg;
import uk.ac.york.soprano.sbt.evolutionary.phytestingselection.dimensionreducer.ParameterSpaceDimensionalityReduction;

public class SESAMEMutationBoostingCoverage extends SESAMESimpleMutation {

	private static final long serialVersionUID = 1L;

	private static final int TRY_LIMIT = 10;

	private CoverageCheckingAlg coverageCheckingAlg;
	private ParameterSpaceDimensionalityReduction dimensionReducer; 
	
	public SESAMEMutationBoostingCoverage(SESAMESimpleMutation other) throws IOException {
		super(other.rng, other.mutationLog, other.probTemporalMutation, other.probParamMutation, other.condGenerator);
	}
	
	public void setCoverageChecker(CoverageCheckingAlg coverageCheckingAlg) {
		this.coverageCheckingAlg = coverageCheckingAlg;
	}
	
	public void setDimensionReducer(ParameterSpaceDimensionalityReduction dimensionReducer) {
		this.dimensionReducer = dimensionReducer;
	}

	private boolean checkOccupationForSolution(SESAMETestSolution solTest) throws NoOperations {
		System.out.println("Incoming test: " + solTest.getInternalType().getName());
		Test t = solTest.getInternalType();
		EnumMap<DimensionID, Double> dimPoint;
		try {
			dimPoint = dimensionReducer.generateDimensionSetsSpeculative(solTest);
			boolean isOccupied = coverageCheckingAlg.isCellOccupied(t, dimPoint);
			try {
				mutationLog.write("checkOccupation for test " + solTest + " - dimension points " + dimPoint.toString() + " occupication " + isOccupied + "\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
			return isOccupied;
		} catch (MissingDimensionsInMap e) {
			e.printMissingDimensions();
			e.printStackTrace();
			return false;
		}
	}
	
	public SESAMETestSolution execute(SESAMETestSolution sol) {
		try {
			// Pre-mutation debugging
			mutationLog.write(sol.toString() + "\n");
			for (int i = 0; i < sol.getNumberOfVariables(); i++) {
				FuzzingOperationWrapper sta = sol.getVariable(i);
				System.out.println("Before modification with mutation boosting coverage SESAMETestAttack=" + sta);
				
				int tries = 0;
				SESAMETestSolution newTry = sol;
				try {
					mutationLog.write("First try at finding an uncovered solution: Trying first mutation " + newTry);
					boolean foundFreeCell = !(checkOccupationForSolution(newTry));
					while (!foundFreeCell && (tries < TRY_LIMIT)) {
						mutationLog.write("Try " + tries + " at finding an uncovered solution: Trying new solution " + newTry);
						// Try attempts to mutate based on previous attempt
						newTry = super.execute(newTry); 
						// Issue is that we cannot check occupation for the solution before 
						// actually executing it, since only then do we know the occupation of
						// the temporal dimensions!
						foundFreeCell = (!checkOccupationForSolution(newTry));
						tries++;
					}
				} catch (NoOperations e) {
					System.out.println("No fuzzing operations - returning same operation");
					//newTry = super.execute(sol);
				}
				// TODO: need to modify the original values here 
				sol = newTry;
			}
			
			// Post-mutation debugging
			mutationLog.write(sol.toString() + "\n");
			mutationLog.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sol;
	}

	public void closeLog() throws IOException {
		mutationLog.close();
	}
}
