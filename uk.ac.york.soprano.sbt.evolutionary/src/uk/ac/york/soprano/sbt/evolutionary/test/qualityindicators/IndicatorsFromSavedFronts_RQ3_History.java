package uk.ac.york.soprano.sbt.evolutionary.test.qualityindicators;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.uma.jmetal.qualityindicator.QualityIndicator;
import org.uma.jmetal.qualityindicator.impl.Epsilon;
import org.uma.jmetal.qualityindicator.impl.InvertedGenerationalDistance;
import org.uma.jmetal.qualityindicator.impl.hypervolume.impl.PISAHypervolume;
import org.uma.jmetal.util.front.Front;
import org.uma.jmetal.util.front.impl.ArrayFront;
import org.uma.jmetal.util.front.util.FrontUtils;
import org.uma.jmetal.util.point.PointSolution;

public class IndicatorsFromSavedFronts_RQ3_History {

	public static void calculateIndicatorsForGen(FileWriter fw, int iterCount, String partialFrontFile,
			String refFrontFile) throws IOException {

		Front partialFront = new ArrayFront(partialFrontFile);
		Front refFront = new ArrayFront(refFrontFile);

		fw.write(iterCount + ",");

		System.out.println("Iteration count " + iterCount + ": Fronts NOT NORMALIZED before computing the indicators");

		List<QualityIndicator<List<PointSolution>, Double>> bFindicatorList = new ArrayList<QualityIndicator<List<PointSolution>, Double>>();
		List<QualityIndicator<List<PointSolution>, Double>> tFindicatorList = new ArrayList<QualityIndicator<List<PointSolution>, Double>>();

		QualityIndicator<List<PointSolution>, Double> hypervol = new PISAHypervolume<PointSolution>(refFront);
		QualityIndicator<List<PointSolution>, Double> eps = new Epsilon<PointSolution>(refFront);
		QualityIndicator<List<PointSolution>, Double> igd = new InvertedGenerationalDistance<PointSolution>(refFront);

		bFindicatorList.add(hypervol);
		bFindicatorList.add(eps);
		bFindicatorList.add(igd);

		tFindicatorList.add(hypervol);
		tFindicatorList.add(eps);
		tFindicatorList.add(igd);

		for (QualityIndicator<List<PointSolution>, Double> indicator : bFindicatorList) {
			double v = indicator.evaluate(FrontUtils.convertFrontToSolutionList(partialFront));
			System.out.println("coverageBoosting " + indicator.getName() + ": " + v);
			fw.write(v + ",");
		}

		for (QualityIndicator<List<PointSolution>, Double> indicator : tFindicatorList) {
			System.out.println("coverageTracking " + indicator.getName() + ": "
					+ indicator.evaluate(FrontUtils.convertFrontToSolutionList(refFront)));
		}
		fw.write("\n");
	}

	/*
	 * all nondominated points regarding the first 'noObjectives' dimensions are
	 * collected; the points referenced by 'front[0..noPoints-1]' are considered;
	 * 'front' is resorted, such that 'front[0..n-1]' contains the nondominated
	 * points; n is returned
	 */
	private static int filterNondominatedSet(Front f, int noPoints, int noObjectives) {
		int i, j;
		int n;

		double[][] front = f.getMatrix();
		
		n = noPoints;
		i = 0;
		while (i < n) {
			j = i + 1;
			while (j < n) {
				if (dominates(front[i], front[j], noObjectives)) {
					/* remove point 'j' */
					n--;
					swap(front, j, n);
				} else if (dominates(front[j], front[i], noObjectives)) {
					/*
					 * remove point 'i'; ensure that the point copied to index 'i' is considered in
					 * the next outer loop (thus, decrement i)
					 */
					n--;
					swap(front, i, n);
					i--;
					break;
				} else {
					j++;
				}
			}
			i++;
		}
		return n;
	}

	/*
	 * returns true if 'point1' dominates 'points2' with respect to the to the first
	 * 'noObjectives' objectives
	 */
	private static boolean dominates(double point1[], double point2[], int noObjectives) {
		int i;
		int betterInAnyObjective;

		betterInAnyObjective = 0;
		for (i = 0; i < noObjectives && point1[i] >= point2[i]; i++) {
			if (point1[i] > point2[i]) {
				betterInAnyObjective = 1;
			}
		}

		return ((i >= noObjectives) && (betterInAnyObjective > 0));
	}

	private static void swap(double[][] front, int i, int j) {
		double[] temp;
		temp = front[i];
		front[i] = front[j];
		front[j] = temp;
	}
	
	private static void testNonDominatedPoints(String dir, String fileName) throws FileNotFoundException {
		Front front = new ArrayFront(dir + "/" + fileName);
		int noPoints = front.getNumberOfPoints();
		int noObjectives = front.getPointDimensions();
		System.out.println("Front " + fileName + " number of points = " + noPoints);
		System.out.println("Front " + fileName + " number of dimensions = " + noObjectives);
		int pointCountNonDom = filterNondominatedSet(front, noPoints, noObjectives);
		
		int diff = noPoints - pointCountNonDom;
		if (diff == 0) { 
			System.out.println(fileName + ": No non-dominated points: original points " + noPoints + " - non-dominated points " + pointCountNonDom);
		} else {
			System.out.println(fileName + ": SOME DOMINATED POINTS: original points " + noPoints + " - non-dominated points " + pointCountNonDom);			
		}
	}

	public static void main(String[] args) {
		String baseDir = "/home/jharbin/academic/sesame/WP6/notebooks/locomotec/python/";
		String outputCSVFile = baseDir + "locomotec-RQ3HistoryQI.csv";

		try {
			testNonDominatedPoints("/home/jharbin/academic/sesame/WP6/notebooks/locomotec/python/", "condbased_res1000_neg.pf");
			testNonDominatedPoints("/home/jharbin/academic/sesame/WP6/notebooks/locomotec/python/", "condbased_history750.pf");
			testNonDominatedPoints("/home/jharbin/academic/sesame/WP6/notebooks/locomotec/python/", "condbased_res1000.pf");
			
			FileWriter fw = new FileWriter(outputCSVFile);
			System.out.println("========================= ALL VALUES POSITIVE ======================================");
			calculateIndicatorsForGen(fw, 250, baseDir + "condbased_history250.pf", baseDir + "condbased_res1000.pf");
			calculateIndicatorsForGen(fw, 500, baseDir + "condbased_history500.pf", baseDir + "condbased_res1000.pf");
			calculateIndicatorsForGen(fw, 750, baseDir + "condbased_history750.pf", baseDir + "condbased_res1000.pf");
			calculateIndicatorsForGen(fw, 1000, baseDir + "condbased_res1000.pf", baseDir + "condbased_res1000.pf");
			
			System.out.println("========================= MAXIMISATION VALUES NEGATIVE =========================");
			calculateIndicatorsForGen(fw, 250, baseDir + "condbased_history250_neg.pf", baseDir + "condbased_res1000_neg.pf");
			calculateIndicatorsForGen(fw, 500, baseDir + "condbased_history500_neg.pf", baseDir + "condbased_res1000_neg.pf");
			calculateIndicatorsForGen(fw, 750, baseDir + "condbased_history750_neg.pf", baseDir + "condbased_res1000_neg.pf");
			calculateIndicatorsForGen(fw, 1000, baseDir + "condbased_res1000_neg.pf", baseDir + "condbased_res1000_neg.pf");
			
			//calculateIndicatorsForGen(fw, 9999, baseDir + "condbased_res1000_removedpoints.pf", baseDir + "condbased_res1000_removedpoints.pf");

			fw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
