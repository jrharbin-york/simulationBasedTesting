package uk.ac.york.soprano.sbt.evolutionary.operators;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import org.uma.jmetal.operator.crossover.CrossoverOperator;

import uk.ac.york.soprano.sbt.evolutionary.SESAMETestSolution;

abstract public class SESAMECrossoverOperation implements CrossoverOperator<SESAMETestSolution> {

	private static final long serialVersionUID = 1L;
	protected FileWriter crossoverLog;
	protected Random rng;

	SESAMECrossoverOperation(Random rng, String crossoverLogFileName) throws IOException {
		this.crossoverLog = new FileWriter(crossoverLogFileName);
		this.rng = rng;
	}
	
	protected void logWithoutException(String s) {
		try {
			crossoverLog.write(s + "\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
