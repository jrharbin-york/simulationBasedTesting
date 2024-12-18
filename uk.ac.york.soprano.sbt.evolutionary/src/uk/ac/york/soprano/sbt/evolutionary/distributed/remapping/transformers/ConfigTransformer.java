package uk.ac.york.soprano.sbt.evolutionary.distributed.remapping.transformers;

import java.util.Optional;
import java.util.Random;

import uk.ac.york.soprano.sbt.evolutionary.distributed.accessors.FileAccessorFromDependency;
import uk.ac.york.soprano.sbt.evolutionary.distributed.staticvariables.TransformFailed;
import uk.ac.york.soprano.sbt.evolutionary.distributed.staticvariables.operationexecutors.OperationExecutor;

public abstract class ConfigTransformer {
	protected FileAccessorFromDependency accessor;
	
	public ConfigTransformer(FileAccessorFromDependency source) {
		this.accessor = source;
	}
	
	public abstract Optional<Object> transform(Random rng, OperationExecutor exec, Optional<Object> lastModified) throws TransformFailed, XPathLookupFailure;
}
