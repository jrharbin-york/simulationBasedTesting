package main;

import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import uk.ac.york.soprano.sbt.evolutionary.EvolutionaryExpt;
import uk.ac.york.soprano.sbt.evolutionary.distributed.PreInitFailed;

public class EvolutionaryRunnerTurtlebot_testCampaign1 {
	//	JMetal manages a population of Test models - containing a single test
	//	These models are referenced by TestModelSolution - which references a particular model
	//
	//	Some metrics can be computed from the Test model itself - not just from the computation
	//
	//	How to write back the metric values into the models at the end of the evaluation?
	
	public static void main(String [] args) {
				
		int maxIterations = 16;
		int populationSize = 4;
		int offspringSize = 4;
		
		// PATHS HERE
		final String spaceModelFileName = "/home/simtesting/workspace/turtleBot/models/turtleMRS.model";
		final String CODE_GENERATION_DIRECTORY = "/home/simtesting/workspace/turtleBot";
		final String orchestratorBasePath = "/home/simtesting/simtesting/simulationBasedTesting/uk.ac.york.sesame.testing.generator/";
		String grammarPath = "/home/simtesting/workspace/turtleBot/grammar/turtlesim-grammar.bnf";
		
		String campaignToRun = "testCampaign1";

		final boolean conditionBased = false;
		final int maxConditionDepth = 0;
		
		EvolutionaryExpt jmetalExpt;
		try {
			jmetalExpt = new EvolutionaryExpt(orchestratorBasePath, spaceModelFileName, campaignToRun, CODE_GENERATION_DIRECTORY, maxIterations, populationSize, offspringSize, conditionBased, maxConditionDepth, grammarPath);
			jmetalExpt.runExperiment();
		} catch (EolModelLoadingException e) {
			e.printStackTrace();
		} catch (PreInitFailed e) {
			e.printStackTrace();
		}
	}
}
