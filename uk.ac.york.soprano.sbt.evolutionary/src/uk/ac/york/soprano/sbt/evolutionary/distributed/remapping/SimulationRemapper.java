package uk.ac.york.soprano.sbt.evolutionary.distributed.remapping;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.SimVariableConfiguration;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Simulator;
import uk.ac.york.soprano.sbt.evolutionary.distributed.RemoteTest;
import uk.ac.york.soprano.sbt.evolutionary.distributed.remapping.transformers.XPathLookupFailure;
import uk.ac.york.soprano.sbt.evolutionary.distributed.staticvariables.InvalidTransformerForVariable;
import uk.ac.york.soprano.sbt.evolutionary.distributed.staticvariables.TransformFailed;

public abstract class SimulationRemapper {
	protected Simulator sim;
	
	public SimulationRemapper(Simulator sim) {
		this.sim = sim;
	}

	public abstract void performRemappingForVariable(RemoteTest rt, SimVariableConfiguration sv) throws InvalidSimulatorVariableType, InvalidTransformerForVariable, TransformFailed, XPathLookupFailure;
}
