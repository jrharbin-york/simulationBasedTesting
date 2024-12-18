package uk.ac.york.soprano.sbt.evolutionary.grammar.test;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;

import it.units.malelab.jgea.representation.tree.Tree;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.StandardGrammar.*;
import uk.ac.york.soprano.sbt.evolutionary.grammar.*;
import uk.ac.york.soprano.sbt.evolutionary.utilities.temp.SESAMEModelLoader;

public class GrammarTestMain {
	public static void main(String [] args) {
		// Test generation of initial population with the grammar for the experiment
		String GRAMMAR_FILE = "/home/jharbin/academic/sesame/WP6/uk.ac.york.sesame.testing.generator/files/grammar/sesame-standardgrammar-firstExperiment.bnf";
		String spaceModelFileName = "/home/jharbin/eclipse-workspace/localAutoGen/models/testingHealthcareSpace.model";
		Grammar<String> grammar;
		
		SESAMEModelLoader loader = new SESAMEModelLoader(spaceModelFileName);
		Resource testSpaceModel;
		try {
			testSpaceModel = loader.loadTestingSpace();
			Optional<TestCampaign> tc_o = loader.getTestCampaign(testSpaceModel, "firstExperiment");
			if (tc_o.isPresent()) {
				TestCampaign selectedCampaign = tc_o.get();
				GrammarConverter gc = new GrammarConverter(selectedCampaign);
				GrammarConverterReverse gcr = new GrammarConverterReverse(selectedCampaign);
				try {
					Random rng = new Random();
					grammar = Grammar.fromFile(GRAMMAR_FILE);
					int MAX_GRAMMAR_HEIGHT = 4;
					int COUNT_TO_BUILD = 1000;
					
					GrowGrammarTreeFactory<String> gen = new GrowGrammarTreeFactory<String>(MAX_GRAMMAR_HEIGHT, grammar);
			        List<Tree<String>> generated = gen.build(COUNT_TO_BUILD, rng);
			        			        
			        for (Tree<String> t : generated) {
			        	Condition c = gc.convertTree(t);
			        	System.out.println("Converted condition: " + c.toString());		        	
			        	Tree<String> tConvertedBack = gcr.convertConditionToTree(c);
			        	
			        	System.out.println("Generated grammar tree string: " + t);
			        	System.out.println("Tree string converted back: " + tConvertedBack);
			        	t.prettyPrint(System.out);
			        	System.out.println("---------------------------");
			        	tConvertedBack.prettyPrint(System.out);
			        	System.out.println("===========================================================================================================");
			        	
			        	//Condition c2 = gc.convertTree(tConvertedBack);
			        	
			        	boolean isSame = tConvertedBack.equals(t);
			        	System.out.println("isSame = " + String.valueOf(isSame));
			        }
			        
				} catch (IOException e) {
					e.printStackTrace();
				} catch (ConversionFailed e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("Couldn't look up test campaign in model");
			}
		} catch (EolModelLoadingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
