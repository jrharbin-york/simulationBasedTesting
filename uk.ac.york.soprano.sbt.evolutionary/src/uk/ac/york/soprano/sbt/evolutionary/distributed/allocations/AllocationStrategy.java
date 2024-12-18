package uk.ac.york.soprano.sbt.evolutionary.distributed.allocations;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import uk.ac.york.soprano.sbt.evolutionary.distributed.AllocationFailed;
import uk.ac.york.soprano.sbt.evolutionary.distributed.RemoteTest;
import uk.ac.york.soprano.sbt.evolutionary.distributed.WorkerNode;

public interface AllocationStrategy {
	public Optional<WorkerNode> allocateTest(RemoteTest rt, Set<WorkerNode> availableNodes, Map<WorkerNode, List<RemoteTest>> currentAllocs) throws AllocationFailed;
}
