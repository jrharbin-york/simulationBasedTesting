package uk.ac.york.soprano.sbt.evolutionary.operators;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import it.units.malelab.jgea.representation.tree.Tree;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ConditionBasedActivation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperationsFactory;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.StandardGrammar.Condition;
import uk.ac.york.soprano.sbt.evolutionary.ConditionGenerator;
import uk.ac.york.soprano.sbt.evolutionary.SESAMETestSolution;
import uk.ac.york.soprano.sbt.evolutionary.dslwrapper.FuzzingOperationWrapper;
import uk.ac.york.soprano.sbt.evolutionary.grammar.ConversionFailed;

public abstract class SESAMEConditionCrossoverOperation extends SESAMECrossoverOperation {

	private static final long serialVersionUID = 1L;
	
	protected FuzzingOperationsFactory factory = FuzzingOperationsFactory.eINSTANCE;

	SESAMEConditionCrossoverOperation(Random rng, String crossoverLogFileName) throws IOException {
		super(rng, crossoverLogFileName);
	}
	
	protected FuzzingOperationWrapper variableAsCond(SESAMETestSolution sol, int i) throws InvalidFuzzingOperationsForOperator {
		FuzzingOperationWrapper w = sol.getVariable(i);
		if (!(w instanceof FuzzingOperationWrapper)) {
			throw new InvalidFuzzingOperationsForOperator();
		} else {
			return (FuzzingOperationWrapper)w;
		}
	}

	// TODO: copyElt is duplicated between both condition files - factor out into common base class
	protected void copyElt(SESAMETestSolution chosen, int i, SESAMETestSolution outputSol) throws ConversionFailed, InvalidFuzzingOperationsForOperator {
		FuzzingOperationWrapper l = variableAsCond(chosen,i);
		ConditionGenerator condGenerator = l.getConditionGenerator();
				
		// TODO: check if it is a condition-based operation here or not
		Tree<String> s1 = l.getStoredStartTree();
		Tree<String> e1 = l.getStoredEndTree();
		Condition start = condGenerator.convert(s1);
		Condition end = condGenerator.convert(e1);

		FuzzingOperationWrapper newOp = l.dup();
		newOp.setStoredStartTree(s1);
		newOp.setStoredEndTree(e1);

		ConditionBasedActivation ca = factory.createConditionBasedActivation();
		ca.setStarting(start);
		ca.setEnding(end);
		newOp.setActivation(ca);
		outputSol.addToContents(newOp);
	}
	
	public abstract List<SESAMETestSolution> execute(List<SESAMETestSolution> solutions);
	public abstract int getNumberOfRequiredParents();
	public abstract int getNumberOfGeneratedChildren();
	
}
