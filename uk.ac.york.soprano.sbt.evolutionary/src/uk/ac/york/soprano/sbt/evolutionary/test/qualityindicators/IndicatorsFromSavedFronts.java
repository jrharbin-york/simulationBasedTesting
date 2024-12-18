package uk.ac.york.soprano.sbt.evolutionary.test.qualityindicators;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.uma.jmetal.qualityindicator.QualityIndicator;
import org.uma.jmetal.qualityindicator.impl.Epsilon;
import org.uma.jmetal.qualityindicator.impl.InvertedGenerationalDistance;
import org.uma.jmetal.qualityindicator.impl.hypervolume.impl.PISAHypervolume;
import org.uma.jmetal.util.front.Front;
import org.uma.jmetal.util.front.impl.ArrayFront;
import org.uma.jmetal.util.front.util.FrontNormalizer;
import org.uma.jmetal.util.front.util.FrontUtils;
import org.uma.jmetal.util.point.PointSolution;

public class IndicatorsFromSavedFronts {

	private static boolean INVERT_FIRST_DIMENSIONS = false;
	private static int INVERT_DIM_COUNT = 2;
	
	public static void calculateIndicators(String boostingFrontFile, String trackingFrontFile, boolean normalise) throws FileNotFoundException {

		Front boostingFront = new ArrayFront(boostingFrontFile);
		Front trackingFront = new ArrayFront(trackingFrontFile);

		if (normalise) {
			FrontNormalizer frontNormalizer = new FrontNormalizer(trackingFront);
			trackingFront = frontNormalizer.normalize(trackingFront);
			boostingFront = frontNormalizer.normalize(boostingFront);
			System.out.println("Fronts are NORMALIZED before computing the indicators");
			if (INVERT_FIRST_DIMENSIONS) {
				System.out.println("Inverting first " + INVERT_DIM_COUNT + " dimensions");
				trackingFront = invertSomeDimensions(trackingFront, INVERT_DIM_COUNT);
				boostingFront = invertSomeDimensions(boostingFront, INVERT_DIM_COUNT);
			}
		
		} else {
			System.out.println("Fronts NOT NORMALIZED before computing the indicators");
		}
		
		List<QualityIndicator<List<PointSolution>, Double>> bFindicatorList = new ArrayList<QualityIndicator<List<PointSolution>, Double>>();
		List<QualityIndicator<List<PointSolution>, Double>> tFindicatorList = new ArrayList<QualityIndicator<List<PointSolution>, Double>>();
		
		QualityIndicator<List<PointSolution>, Double> hypervol = new PISAHypervolume<PointSolution>(trackingFront);
		QualityIndicator<List<PointSolution>, Double> eps = new Epsilon<PointSolution>(trackingFront);
		QualityIndicator<List<PointSolution>, Double> igd = new InvertedGenerationalDistance<PointSolution>(trackingFront);

		bFindicatorList.add(hypervol);
		bFindicatorList.add(eps);
		bFindicatorList.add(igd);
		
		tFindicatorList.add(hypervol);
		tFindicatorList.add(eps);
		tFindicatorList.add(igd);
				
		for (QualityIndicator<List<PointSolution>, Double> indicator : bFindicatorList) {
			System.out.println("coverageBoosting " + indicator.getName() + ": " + indicator.evaluate(FrontUtils.convertFrontToSolutionList(boostingFront)));
		}
		
		for (QualityIndicator<List<PointSolution>, Double> indicator : tFindicatorList) {
			System.out.println("coverageTracking " + indicator.getName() + ": " + indicator.evaluate(FrontUtils.convertFrontToSolutionList(trackingFront)));
		}
	}
	
	  public static Front invertSomeDimensions(Front front, int dimsToInvert) {
		    int numberOfDimensions = front.getPoint(0).getDimension();
		    Front invertedFront = new ArrayFront(front.getNumberOfPoints(), numberOfDimensions);

		    for (int i = 0; i < front.getNumberOfPoints(); i++) {
		      for (int j = 0; j < dimsToInvert; j++) {
		        if (front.getPoint(i).getValue(j) <= 1.0
		                && front.getPoint(i).getValue(j) >= 0.0) {
		          invertedFront.getPoint(i).setValue(j, 1.0 - front.getPoint(i).getValue(j));
		        } else if (front.getPoint(i).getValue(j) > 1.0) {
		          invertedFront.getPoint(i).setValue(j, 0.0);
		        } else if (front.getPoint(i).getValue(j) < 0.0) {
		          invertedFront.getPoint(i).setValue(j, 1.0);
		        }
		      }
		    }
		    return invertedFront;
		  }
	
	public static void main(String [] args) {
		if (args.length > 1) {
			String boostingFrontFile = args[0];
			String trackingFrontFile = args[1];
			//boolean normalise = (args[2].equals("true"));
			
			try {
				// Run normlised version
				//calculateIndicators(boostingFrontFile, trackingFrontFile, true);
				// Run not normlised version
				calculateIndicators(boostingFrontFile, trackingFrontFile, false);
				
//				System.out.println("Comparing same file for sanity check...");
//				calculateIndicators(trackingFrontFile, trackingFrontFile, false);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Args required: boostingFrontFile trackingFrontFile normalise:<true> or <false>");
		}
	}
}
