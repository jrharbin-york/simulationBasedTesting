package uk.ac.york.soprano.sbt.evolutionary.distributed.allocations;

import java.util.*;

import uk.ac.york.soprano.sbt.evolutionary.distributed.AllocationFailed;
import uk.ac.york.soprano.sbt.evolutionary.distributed.RemoteTest;
import uk.ac.york.soprano.sbt.evolutionary.distributed.WorkerNode;

public class UpFrontAllocation implements AllocationStrategy {
	
	@Override
	public Optional<WorkerNode> allocateTest(RemoteTest rt, Set<WorkerNode> availableNodes, Map<WorkerNode, List<RemoteTest>> currentAllocs) throws AllocationFailed {
		// Always allocate the tests; to the node with the lowest count.
		int minAllocCount = Integer.MAX_VALUE;
		Optional<WorkerNode> choice = Optional.empty();
		for (WorkerNode n : availableNodes) {
			
			int allocForNodeCount = currentAllocs.get(n).size();
			if (allocForNodeCount < minAllocCount) {
				minAllocCount = allocForNodeCount;
				choice = Optional.of(n);
			}
		}
		return choice;
	}
}