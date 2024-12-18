package uk.ac.york.soprano.sbt.evolutionary.distributed.remapping;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ROSSimulator;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Simulator;


public class SimulationRemapperFactory {

	public SimulationRemapper createRemapping(Simulator sim) throws SimulationTypeNotRecognisedForRemapping {
		// TODO: other simulators
		if (sim instanceof ROSSimulator) {
			return new ROSRemapper(sim);
		}
		
		throw new SimulationTypeNotRecognisedForRemapping();
	}
	
}
