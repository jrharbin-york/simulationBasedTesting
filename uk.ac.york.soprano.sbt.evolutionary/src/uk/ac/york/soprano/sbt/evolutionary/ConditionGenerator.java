package uk.ac.york.soprano.sbt.evolutionary;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import it.units.malelab.jgea.representation.tree.SameRootSubtreeCrossover;
import it.units.malelab.jgea.representation.tree.Tree;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.StandardGrammar.*;
import uk.ac.york.soprano.sbt.evolutionary.grammar.*;

public class ConditionGenerator {
	
	private static final int MAX_GEN_TRIES_CONSTRAINTS = 500;
	private Random rng;
	private int maxGrammarHeight;
	private Grammar<String> grammar;
	private GrammarConverter gc;
	
	private boolean DEBUG_MUTATION = true;
	private boolean DEBUG_CROSSOVER = true;
	
	private final int MAX_MUTATION_TRY_COUNT = 5;
	private final int MAX_CROSSOVER_TRY_COUNT = 5;
	
	// TODO: how do these parameters work? MUTATION_MAX_DEPTH is ignored by operator?
	private int MUTATION_MAX_DEPTH = 1;
	
	private int CROSSOVER_MAX_HEIGHT = 6;
	
	protected GrammarBasedSubtreeMutation<String> mutator;
	protected SameRootSubtreeCrossover<String> crossover;
	
	public ConditionGenerator(String grammarPath, TestCampaign selectedCampaign, int maxGrammarHeight) throws MissingGrammarFile {
		this.maxGrammarHeight = maxGrammarHeight;
		gc = new GrammarConverter(selectedCampaign);
		rng = new Random();
		
		try {
			grammar = Grammar.fromFile(grammarPath);
			if (grammar == null) {
				throw new MissingGrammarFile("Grammar not loaded successfully from path " + grammarPath);
			}
			
			mutator = new GrammarBasedSubtreeMutation<String>(MUTATION_MAX_DEPTH, grammar);
			crossover = new SameRootSubtreeCrossover<String>(CROSSOVER_MAX_HEIGHT);
			
		} catch (FileNotFoundException e) {
			throw new MissingGrammarFile("Grammar not loaded successfully from path " + grammarPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Tree<String> generateOne(int depth) throws ConversionFailed {
		int depthToUse = Math.min(maxGrammarHeight, depth);
		GrowGrammarTreeFactory<String> gen = new GrowGrammarTreeFactory<String>(depthToUse, grammar);
		List<Tree<String>> generated = gen.build(1, rng);
		Tree<String> genTree = generated.get(0);
		return genTree;
	}
	
	public Tree<String> generateOneWithConstraints(int depth, List<ConditionConstraint> ccs) throws ConversionFailed, ConstraintsNotMet {
		int tryCount = 0;
		while (tryCount++ < MAX_GEN_TRIES_CONSTRAINTS) {
			Tree<String> t = generateOne(depth);
			if (meetsAllConstraints(t, ccs)) {
				return t;
			} else {
				System.out.println("Try " + tryCount + " Failed constraints: " + t.toString());
			}
		}
		throw new ConstraintsNotMet();
	}
	
	public Tree<String> generateOneWithConstraints(List<ConditionConstraint> ccs) throws ConversionFailed, ConstraintsNotMet {
		return generateOneWithConstraints(maxGrammarHeight, ccs);
	}
	
	private boolean meetsAllConstraints(Tree<String> t, List<ConditionConstraint> ccs) {
		boolean ok = true;
		for (ConditionConstraint cc : ccs) {
			ok = ok && meetsConstraint(t, cc); 
		}
		return ok;
	}
	
	private boolean meetsConstraint(Tree<String> t, ConditionConstraint cc) {
		GrammarTreeScanner scanner = new GrammarTreeScanner(cc);
		try {
			boolean res = scanner.scan(t);
			if (res == false) {
				System.out.println("Tree failed constraint: " + cc.toString() + " - " + t.toString());
			}
			return res;
			
		} catch (UnrecognisedTreeNode e) {
			e.printStackTrace();
			return false;
		}
	}

	public Tree<String> generateOne() throws ConversionFailed {
		return generateOne(maxGrammarHeight);
	}
	
	public Condition convert(Tree<String> t) throws ConversionFailed {
		return gc.convertTree(t);
	}

	public Tree<String> mutate(Tree<String> t, Random rng) {
		int count = 0;
		boolean changed = false;
		Tree<String> tNew = t;
		while ((count++ < MAX_MUTATION_TRY_COUNT) && !changed) {
			if (DEBUG_MUTATION) {
				System.out.println("Try " + count + " tree before mutation = " + t);
			}
			tNew = mutator.mutate(t, rng);
			if (!tNew.equals(t)) {
				changed = true;
			}
		}
		return tNew;
	}
	
	public Tree<String> crossover(Tree<String> t1, Tree<String> t2, Random rng) {
		int count = 0;
		boolean changed = false;
		Tree<String> tNew = t1;
		while ((count++ < MAX_CROSSOVER_TRY_COUNT) && !changed) {
			if (DEBUG_CROSSOVER) {
				System.out.println("Try " + count + " tree left before crossover = " + t1);
				System.out.println("Try " + count + " tree right before crossover = " + t2);
			}
			tNew = crossover.recombine(t1,t2,rng);
			if (!(tNew.equals(t1) || tNew.equals(t2))) {
				changed = true;
			}
		}
		return tNew;
	}
	
	public Tree<String> mutate(Tree<String> t) {
		// Use the default rng
		return mutate(t, rng);
	}

	public void printCondition(Condition c) {
		System.out.println(c.toString());
	}

	public String conditionToString(Condition c) {
		try {
			return "CONDITION: [" + c.getName() + ":" + conditionElementToString(c.getC()) + "]";
		} catch (InvalidElementConversion e) {
			e.printStackTrace();
			return "CONDITION: [" + c.getName() + ": INVALID]";
		}
	}
	
	public String binOpToString(BinaryLogicalOperation binop) throws InvalidElementConversion {
		if (binop == BinaryLogicalOperation.AND) {
			return "AND";
		}
		if (binop == BinaryLogicalOperation.OR) {
			return "OR";
		}
		throw new InvalidElementConversion("binop", binop.toString());
	}
	
	public String binCompToString(BinaryComparisonOperation bincomp) throws InvalidElementConversion {
		if (bincomp == BinaryComparisonOperation.LESS_THAN) {
			return "<";
		}
		if (bincomp == BinaryComparisonOperation.GREATER_THAN) {
			return ">";
		}
		if (bincomp == BinaryComparisonOperation.EQUALS) {
			return "==";
		}
		throw new InvalidElementConversion("binop", bincomp.toString());
	}


	public String conditionElementToString(ConditionElement cElt) throws InvalidElementConversion {
		if (cElt instanceof CompositeCondition) {
			CompositeCondition cComp = (CompositeCondition)cElt;
			return conditionElementToString(cComp.getLeft()) + " " + binOpToString(cComp.getBinop()) + " " + conditionElementToString(cComp.getRight());
		} else {
			// cElt is BasicCondition
			BasicCondition cBasic = (BasicCondition)cElt;
			return conditionVariableToString(cBasic.getLeft()) + " " + binCompToString(cBasic.getBincomp()) + " " + conditionExprToString(cBasic.getRight());
		}
	}

	private String conditionVariableToString(ConditionVariable var) {
		return var.getMetric().getName();
	}
	
	private String conditionExprToString(ConditionExpr expr) {
		if (expr instanceof ConditionInteger) {
			ConditionInteger i = (ConditionInteger)expr;
			String s = String.valueOf(i.getValue());
			return s;
		} else {
			// Variable 
			ConditionVariable var = (ConditionVariable)expr;
			return conditionVariableToString(var);
		}
	}

}
