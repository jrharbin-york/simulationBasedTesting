package uk.ac.york.soprano.sbt.evolutionary.distributed.allocations;

import java.util.*;

import uk.ac.york.soprano.sbt.evolutionary.distributed.AllocationFailed;
import uk.ac.york.soprano.sbt.evolutionary.distributed.RemoteTest;
import uk.ac.york.soprano.sbt.evolutionary.distributed.WorkerNode;

public class DynamicAllocation implements AllocationStrategy {
	
	@Override
	public Optional<WorkerNode> allocateTest(RemoteTest rt, Set<WorkerNode> availableNodes, Map<WorkerNode, List<RemoteTest>> currentAllocs) throws AllocationFailed {
		// Allocate to the first empty node
		for (WorkerNode n : availableNodes) {
			
			int allocForNodeCount = currentAllocs.get(n).size();
			if (allocForNodeCount == 0) {
				return Optional.of(n);
			}
		}
		
		// If no nodes are empty, do not allocate; wait until later to allocate test
		return Optional.empty();
	}
}