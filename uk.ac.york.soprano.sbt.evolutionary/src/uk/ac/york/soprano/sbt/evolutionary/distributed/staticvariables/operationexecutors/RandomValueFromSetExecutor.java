package uk.ac.york.soprano.sbt.evolutionary.distributed.staticvariables.operationexecutors;

import java.util.List;
import java.util.Random;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.*;
import uk.ac.york.soprano.sbt.evolutionary.dslwrapper.InvalidOperation;

public class RandomValueFromSetExecutor extends OperationExecutor {
	private RandomValueFromSetOperation rop;

	public RandomValueFromSetExecutor(RandomValueFromSetOperation rop) {
		this.rop = rop;
	}

	@Override
	public Object exec(Random rng, Object input) throws InvalidOperation {
		List<ValueSet> vs = rop.getValueSet();

		for (ValueSet v : vs) {
			if (v instanceof DoubleRange) {
				DoubleRange dr = (DoubleRange) v;
				double lower = dr.getLowerBound();
				double upper = dr.getUpperBound();
				double genVal = lower + (upper - lower) * rng.nextDouble();

				if (rop.isIsRelative()) {
					double inputD = Double.parseDouble(input.toString());
					return inputD + genVal;
				} else {
					return genVal;
				}
			}
		}
		throw new InvalidOperation();
	}
}
