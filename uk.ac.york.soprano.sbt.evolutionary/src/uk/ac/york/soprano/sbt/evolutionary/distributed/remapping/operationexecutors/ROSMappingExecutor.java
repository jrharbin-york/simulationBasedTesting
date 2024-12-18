// TODO: move to new package name
package uk.ac.york.soprano.sbt.evolutionary.distributed.remapping.operationexecutors;

import java.util.Random;

import uk.ac.york.soprano.sbt.evolutionary.distributed.staticvariables.operationexecutors.OperationExecutor;
import uk.ac.york.soprano.sbt.evolutionary.dslwrapper.InvalidOperation;

public class ROSMappingExecutor extends OperationExecutor {

	public Object exec(Random rng, Object input) throws InvalidOperation {
		String input_s = input.toString();
		String output_s;
		if (input_s.contains("OUT")) {
			int len = input_s.length();
			return input_s.subSequence(0, (len-3));
		} else {
			output_s = input_s + "OUT";
			return output_s;
		}
	}
}