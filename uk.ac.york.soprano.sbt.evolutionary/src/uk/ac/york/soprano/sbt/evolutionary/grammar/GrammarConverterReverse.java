package uk.ac.york.soprano.sbt.evolutionary.grammar;

import it.units.malelab.jgea.representation.tree.Tree;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.StandardGrammar.*;

public class GrammarConverterReverse {
	
	public GrammarConverterReverse(TestCampaign tc) { 
	}
	
	public Tree<String> convertConditionToTree(Condition c) throws ConversionFailed {
		ConditionElement ce = c.getC();
		return convertCondition(null, ce);
	}	
	
	private Tree<String> convertCondition(Tree<String> parent, ConditionElement ce) {
		if (ce instanceof BasicCondition) {
			return convertBasicCond(parent, (BasicCondition)ce);
		} else {
			// CompositeCondition
			return convertCompositeCond(parent, (CompositeCondition)ce); 
		}
	}
	
	private Tree<String> convertCompositeCond(Tree<String> parent, CompositeCondition bc) {
		Tree<String> t = new Tree<String>("<compcond>",parent);
		t.addChild(convertCondition(t, bc.getLeft()));
		t.addChild(convertBinLogicOp(t, bc.getBinop()));
		t.addChild(convertCondition(t, bc.getRight()));
		return t;
	}
	
	private Tree<String> convertBasicCond(Tree<String> parent, BasicCondition bc) {
		Tree<String> t = new Tree<String>("<basic_cond>",parent);
		t.addChild(convertVariable(t, bc.getLeft()));
		t.addChild(convertBinComp(t, bc.getBincomp()));
		t.addChild(convertExpr(t, bc.getRight()));
		return t;
	}
	
	private Tree<String> convertVariable(Tree<String> parent, ConditionVariable bc) {
		Tree<String> t = new Tree<String>("<var>",parent);
		String varName = bc.getMetric().getName();
		t.addChild(new Tree<String>(varName, t));
		return t;
	}
	
	private Tree<String> convertBinComp(Tree<String> parent, BinaryComparisonOperation bincomp) {
		Tree<String> t = new Tree<String>("<bincomp>", parent);
		
		if (bincomp == BinaryComparisonOperation.EQUALS) {
			t.addChild(new Tree<String>(".EQUALS",t));
		}
		
		if (bincomp == BinaryComparisonOperation.LESS_THAN) {
			t.addChild(new Tree<String>(".LESS_THAN",t));
		}
		
		if (bincomp == BinaryComparisonOperation.GREATER_THAN) {
			t.addChild(new Tree<String>(".GREATER_THAN",t));
		}
		return t;
	}
	
	private Tree<String> convertBinLogicOp(Tree<String> parent, BinaryLogicalOperation binlogic) {
		Tree<String> t = new Tree<String>("<logicop>", parent);
		
		if (binlogic == BinaryLogicalOperation.AND) {
			t.addChild(new Tree<String>(".AND",t));
		}
		
		if (binlogic == BinaryLogicalOperation.OR) {
			t.addChild(new Tree<String>(".OR",t));
		}

		return t;
	}
	
	private Tree<String> convertExpr(Tree<String> parent, ConditionExpr ce) {
		Tree<String> t = new Tree<String>("<expr>", parent);
		if (ce instanceof ConditionVariable) {
			t.addChild(convertVariable(t, (ConditionVariable)ce));
		}
		if (ce instanceof ConditionInteger) {
			t.addChild(convertInteger(t, (ConditionInteger)ce));
		}
		return t;
	}

	private Tree<String> convertInteger(Tree<String> parent, ConditionInteger ce) {		
		Tree<String> t = new Tree<String>("<int>", parent);
		int value = ce.getValue();
		t.addChild(new Tree<String>(String.valueOf(value), t));
		return t;
	}
}
