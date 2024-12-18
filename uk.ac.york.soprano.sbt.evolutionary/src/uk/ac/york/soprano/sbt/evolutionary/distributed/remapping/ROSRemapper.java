package uk.ac.york.soprano.sbt.evolutionary.distributed.remapping;

import java.util.Optional;
import java.util.Random;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ContainerDependency;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.Dependency;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ROSVariableConfiguration;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.SimVariableConfiguration;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Simulator;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.StaticVariable;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.XMLConfigLocation;
import uk.ac.york.soprano.sbt.evolutionary.distributed.RemoteTest;
import uk.ac.york.soprano.sbt.evolutionary.distributed.accessors.FileAccessorFromDependency;
import uk.ac.york.soprano.sbt.evolutionary.distributed.accessors.FileAccessorFromDocker;
import uk.ac.york.soprano.sbt.evolutionary.distributed.remapping.operationexecutors.ROSMappingExecutor;
import uk.ac.york.soprano.sbt.evolutionary.distributed.remapping.transformers.ConfigTransformer;
import uk.ac.york.soprano.sbt.evolutionary.distributed.remapping.transformers.XMLConfigTransformer;
import uk.ac.york.soprano.sbt.evolutionary.distributed.remapping.transformers.XPathLookupFailure;
import uk.ac.york.soprano.sbt.evolutionary.distributed.staticvariables.InvalidTransformerForVariable;
import uk.ac.york.soprano.sbt.evolutionary.distributed.staticvariables.TransformFailed;
import uk.ac.york.soprano.sbt.evolutionary.distributed.staticvariables.operationexecutors.OperationExecutor;

public class ROSRemapper extends SimulationRemapper {

	public ROSRemapper(Simulator sim) {
		super(sim);
	}
	
	@Override
	public void performRemappingForVariable(RemoteTest rt, SimVariableConfiguration sv) throws InvalidSimulatorVariableType, InvalidTransformerForVariable, TransformFailed, XPathLookupFailure {
		if (sv instanceof ROSVariableConfiguration) {
			performRemappingROSVariable(rt, (ROSVariableConfiguration)sv);
		}
	}
	
	private void performRemappingROSVariable(RemoteTest rt, ROSVariableConfiguration rv) throws InvalidTransformerForVariable, TransformFailed, XPathLookupFailure {
		Random rng = new Random();
		
		// Launch files are XML so use the XML config transformer
		XMLConfigLocation xl = rv.getLaunchFileloc();
		
		Dependency simContainerRoot = xl.getRoot();
		FileAccessorFromDependency accessor = null;
		// TODO: support other containers here
		// TODO: maybe this code would be better in some sort of factory
		if (simContainerRoot instanceof ContainerDependency) {
			accessor = new FileAccessorFromDocker(rt, (ContainerDependency)simContainerRoot);	
		}
		
		if (accessor == null) {
			throw new InvalidTransformerForVariable((StaticVariable)rv);
		}
		
		ConfigTransformer tf = new XMLConfigTransformer(accessor, xl);		
		OperationExecutor exec = new ROSMappingExecutor();
		tf.transform(rng,exec, Optional.empty());
	}
	
}
