package uk.ac.york.soprano.sbt.evolutionary.grammar;

import it.units.malelab.jgea.representation.tree.Tree;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.StandardGrammar.*;

public class GrammarTreeScanner {
	
	protected final boolean DEBUG_GRAMMER_SCAN = true;
	private ConditionConstraint cc; 
	
	public GrammarTreeScanner(ConditionConstraint cc) {
		// TODO Auto-generated constructor stub
		this.cc = cc;
	}

	public boolean scan(Tree<String> t) throws UnrecognisedTreeNode {
		return scanNode(t);
	}	

	public boolean scanNode(Tree<String> stringTree) {
		
		String s = stringTree.content();
		if (DEBUG_GRAMMER_SCAN) {
			System.out.print("convert - Tree...\n");
			stringTree.prettyPrint(System.out);
			System.out.println();
		}
		
		// Binary combined condition
		if (s.equals("<compcond>") && stringTree.nChildren() == 3) {
			if (DEBUG_GRAMMER_SCAN) {
				System.out.println("COMPCOND - BINARY");
				System.out.println("Child 0 = " + stringTree.child(0));
				System.out.println("Child 1 = " + stringTree.child(1));
				System.out.println("Child 2 = " + stringTree.child(2));
			}
			Tree<String> lhs = stringTree.child(0);
			String bincomp = stringTree.child(1).child(0).content();
			Tree<String> rhs = stringTree.child(2);
			
			boolean res_lhs = scanNode(lhs);
			boolean res_rhs = scanNode(rhs);
			// TODO: this is only scanning the conditions on the sub-nodes
			return res_lhs || res_rhs;
		}
		
		if (s.equals("<basic_cond>")) {
			if (DEBUG_GRAMMER_SCAN) {
				System.out.println("BASIC_COND");
				System.out.println("Child 0 = " + stringTree.child(0));
				System.out.println("Child 1 = " + stringTree.child(1));
				System.out.println("Child 2 = " + stringTree.child(2));
			}
			Tree<String> lhs = stringTree.child(0);
			String bincomp = stringTree.child(1).child(0).content();
			Tree<String> rhs = stringTree.child(2);
			
			boolean res_lhs = scanVariable(lhs);
			boolean res_rhs = scanExpr(rhs);
			// TODO: this is only scanning the conditions on the sub-nodes
			return res_lhs || res_rhs;
		}
		
		if (s.equals("<compcond>") && stringTree.nChildren() == 1) {
			if (DEBUG_GRAMMER_SCAN) {
				System.out.println("COMPCOND - SINGLE");
				System.out.println("Child 0 = " + stringTree.child(0));
			}
			Tree<String> inner = stringTree.child(0);
			return scanNode(inner);
		}
		
		return false;
	}
	
	private boolean checkVarName(String name) {
		if (cc instanceof ContainsVariable) {
			ContainsVariable cv = (ContainsVariable)cc;
			String targetName = cv.getMetric().getName();
			return name.equals(targetName);
		} else {
			return false;
		}
	}
	
	private boolean checkInteger(int i) {
		if (cc instanceof ContainsInteger) {
			ContainsInteger ci = (ContainsInteger)cc;
			int lower = ci.getMinValue();
			int upper = ci.getMaxValue();
			return (lower <= i) && (i <= upper);
		} else {
			return false;
		}
	}
	
	private boolean scanVariable(Tree<String> t) {
		if (t.content().equals("<var>")) {
			return checkVarName(t.child(0).content());
		} else {
			// extract from <expr> and check
			return checkVarName(t.child(0).child(0).content());
		}
	}
	
	private boolean scanExpr(Tree<String> t) {
		if (t.child(0).content().equals("<var>")) {
			return scanVariable(t);
		}
		
		if (t.child(0).content().equals("<int>")) {
			int i = Integer.valueOf(t.child(0).child(0).content());
			return checkInteger(i);
		}
		
		return false;
	}

//	private BinaryLogicalOperation convertBinLogicOp(String compStr) throws UnrecognisedBinOp {
//		if (compStr.equals(".AND")) {
//			return BinaryLogicalOperation.AND;
//		}
//		
//		if (compStr.equals(".OR")) {
//			return BinaryLogicalOperation.OR;
//		}
//		
//		throw new UnrecognisedBinOp(compStr);
//	}
//
//	private BinaryComparisonOperation convertCompare(String compStr) throws UnrecognisedComparison {
//		if (compStr.equals(".EQUALS")) {
//			return BinaryComparisonOperation.EQUALS;
//		}
//		
//		if (compStr.equals(".LESS_THAN")) {
//			return BinaryComparisonOperation.LESS_THAN;
//		}
//		
//		if (compStr.equals(".GREATER_THAN")) {
//			return BinaryComparisonOperation.GREATER_THAN;
//		}
//		
//		throw new UnrecognisedComparison(compStr);
//	}
}
