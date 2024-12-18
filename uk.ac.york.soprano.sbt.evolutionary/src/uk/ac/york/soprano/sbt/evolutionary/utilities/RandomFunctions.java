package uk.ac.york.soprano.sbt.evolutionary.utilities;

import java.util.Optional;
import java.util.Random;

import org.eclipse.emf.common.util.EList;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperationsFactory;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.Point;

public class RandomFunctions {
	public static double randomDoubleInRange(Random rng, double s, double e) {
		return s + rng.nextDouble() * (e-s);
	}
	
	public static int randomIntInRange(Random rng, int s, int e) {
		int max = Math.max(s, e);
		int min = Math.min(s, e);
		return rng.nextInt((max - min) + 1) + min;		
	}

	public static Point randomPointInRange(Random rng, Point origLB, Point origUB) {
		FuzzingOperationsFactory af = FuzzingOperationsFactory.eINSTANCE;
		Point newPoint = af.createPoint();
		double x = randomDoubleInRange(rng, origLB.getX(), origUB.getX());
		double y = randomDoubleInRange(rng, origLB.getY(), origUB.getY());
		double z = randomDoubleInRange(rng, origLB.getZ(), origUB.getZ());
		newPoint.setX(x);
		newPoint.setY(y);
		newPoint.setZ(z);
		return newPoint;
	}

	public static Optional<String> randomElementInList(Random rng, EList<String> origSet) {
		String randomElement;
		if (origSet.size() == 0) {
			return Optional.empty();
		}
				
		if (origSet.size() > 1) {
			randomElement = origSet.get(rng.nextInt(origSet.size()));
			return Optional.of(randomElement);
		} else {
			randomElement = origSet.get(0);
			return Optional.of(randomElement); 
		}
		
	}
}
