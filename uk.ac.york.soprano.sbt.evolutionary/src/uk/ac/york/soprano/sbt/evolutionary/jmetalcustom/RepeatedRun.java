package uk.ac.york.soprano.sbt.evolutionary.jmetalcustom;

import java.util.ArrayList;
import java.util.List;

import org.uma.jmetal.algorithm.Algorithm;
import org.uma.jmetal.problem.Problem;
import org.uma.jmetal.util.evaluator.SolutionListEvaluator;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign;
import uk.ac.york.soprano.sbt.evolutionary.SESAMETestSolution;

public class RepeatedRun implements Algorithm<List<SESAMETestSolution>> {

	private static final long serialVersionUID = 1L;
	private Test fixedTest;
	private int maxIterations;
	private TestCampaign selectedCampaign;
	private SolutionListEvaluator<SESAMETestSolution> evaluator;
	
	private Problem prob;
	
	protected List<SESAMETestSolution> population;

	public RepeatedRun(Test fixedTest, int maxIterations, SolutionListEvaluator<SESAMETestSolution> evaluator, Problem prob) {
		this.fixedTest = fixedTest;
		this.maxIterations = maxIterations;
		this.evaluator = evaluator;
		this.prob = prob;
	}
	
	public String getName() {
		return "RepeatedRun";
	}

	public String getDescription() {
		return "Repeated run of fixed test value";
	}

	public void run() {
		population = new ArrayList<SESAMETestSolution>();
		String origName = fixedTest.getName();
					
		for (int iteration = 0; iteration < maxIterations; iteration++) {
			String extendedName = origName + "_repeat" + iteration;
			SESAMETestSolution singleTest = new SESAMETestSolution(selectedCampaign, fixedTest, extendedName);
			List<SESAMETestSolution> singleTestPop = new ArrayList<SESAMETestSolution>();
			singleTestPop.add(singleTest);
			population.add(singleTest);
			evaluator.evaluate(singleTestPop, prob);
		}
	}

	public List<SESAMETestSolution> getResult() {
		return new ArrayList<SESAMETestSolution>();
	}
}
