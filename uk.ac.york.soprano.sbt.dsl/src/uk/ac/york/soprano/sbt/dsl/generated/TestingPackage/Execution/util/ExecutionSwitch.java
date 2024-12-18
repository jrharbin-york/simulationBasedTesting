/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionPackage
 * @generated
 */
public class ExecutionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExecutionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionSwitch() {
		if (modelPackage == null) {
			modelPackage = ExecutionPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ExecutionPackage.EXECUTION_STRATEGY: {
				ExecutionStrategy executionStrategy = (ExecutionStrategy)theEObject;
				T result = caseExecutionStrategy(executionStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutionPackage.LOCAL_EXECUTION_STRATEGY: {
				LocalExecutionStrategy localExecutionStrategy = (LocalExecutionStrategy)theEObject;
				T result = caseLocalExecutionStrategy(localExecutionStrategy);
				if (result == null) result = caseExecutionStrategy(localExecutionStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutionPackage.DISTRIBUTED_EXECUTION_STRATEGY: {
				DistributedExecutionStrategy distributedExecutionStrategy = (DistributedExecutionStrategy)theEObject;
				T result = caseDistributedExecutionStrategy(distributedExecutionStrategy);
				if (result == null) result = caseExecutionStrategy(distributedExecutionStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutionPackage.ALLOCATION_STRATEGY: {
				AllocationStrategy allocationStrategy = (AllocationStrategy)theEObject;
				T result = caseAllocationStrategy(allocationStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutionPackage.DYNAMIC_TASK_ALLOCATION: {
				DynamicTaskAllocation dynamicTaskAllocation = (DynamicTaskAllocation)theEObject;
				T result = caseDynamicTaskAllocation(dynamicTaskAllocation);
				if (result == null) result = caseAllocationStrategy(dynamicTaskAllocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutionPackage.ROUND_ROBIN_PRE_ALLOCATION: {
				RoundRobinPreAllocation roundRobinPreAllocation = (RoundRobinPreAllocation)theEObject;
				T result = caseRoundRobinPreAllocation(roundRobinPreAllocation);
				if (result == null) result = caseAllocationStrategy(roundRobinPreAllocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutionPackage.EXECUTION_TARGET: {
				ExecutionTarget executionTarget = (ExecutionTarget)theEObject;
				T result = caseExecutionTarget(executionTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutionPackage.SOPRANO_WORKER_NODE: {
				SOPRANOWorkerNode sopranoWorkerNode = (SOPRANOWorkerNode)theEObject;
				T result = caseSOPRANOWorkerNode(sopranoWorkerNode);
				if (result == null) result = caseExecutionTarget(sopranoWorkerNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutionPackage.DEPENDENCY: {
				Dependency dependency = (Dependency)theEObject;
				T result = caseDependency(dependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutionPackage.FILE_TREE_DEPENDENCY: {
				FileTreeDependency fileTreeDependency = (FileTreeDependency)theEObject;
				T result = caseFileTreeDependency(fileTreeDependency);
				if (result == null) result = caseDependency(fileTreeDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutionPackage.CONTAINER_DEPENDENCY: {
				ContainerDependency containerDependency = (ContainerDependency)theEObject;
				T result = caseContainerDependency(containerDependency);
				if (result == null) result = caseDependency(containerDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutionPackage.DERIVED_CONTAINER_DEPENDENCY: {
				DerivedContainerDependency derivedContainerDependency = (DerivedContainerDependency)theEObject;
				T result = caseDerivedContainerDependency(derivedContainerDependency);
				if (result == null) result = caseDependency(derivedContainerDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutionPackage.ARCHIVE_DEPENDENCY: {
				ArchiveDependency archiveDependency = (ArchiveDependency)theEObject;
				T result = caseArchiveDependency(archiveDependency);
				if (result == null) result = caseDependency(archiveDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionStrategy(ExecutionStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Execution Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Execution Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalExecutionStrategy(LocalExecutionStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distributed Execution Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distributed Execution Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDistributedExecutionStrategy(DistributedExecutionStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allocation Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allocation Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllocationStrategy(AllocationStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Task Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Task Allocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicTaskAllocation(DynamicTaskAllocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Round Robin Pre Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Round Robin Pre Allocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoundRobinPreAllocation(RoundRobinPreAllocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionTarget(ExecutionTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SOPRANO Worker Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SOPRANO Worker Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSOPRANOWorkerNode(SOPRANOWorkerNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependency(Dependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Tree Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Tree Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileTreeDependency(FileTreeDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerDependency(ContainerDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derived Container Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived Container Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivedContainerDependency(DerivedContainerDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Archive Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Archive Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchiveDependency(ArchiveDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ExecutionSwitch
