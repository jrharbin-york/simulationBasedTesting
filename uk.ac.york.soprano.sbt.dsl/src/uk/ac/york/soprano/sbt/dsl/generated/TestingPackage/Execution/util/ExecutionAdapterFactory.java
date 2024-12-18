/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionPackage
 * @generated
 */
public class ExecutionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExecutionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ExecutionPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionSwitch<Adapter> modelSwitch =
		new ExecutionSwitch<Adapter>() {
			@Override
			public Adapter caseExecutionStrategy(ExecutionStrategy object) {
				return createExecutionStrategyAdapter();
			}
			@Override
			public Adapter caseLocalExecutionStrategy(LocalExecutionStrategy object) {
				return createLocalExecutionStrategyAdapter();
			}
			@Override
			public Adapter caseDistributedExecutionStrategy(DistributedExecutionStrategy object) {
				return createDistributedExecutionStrategyAdapter();
			}
			@Override
			public Adapter caseAllocationStrategy(AllocationStrategy object) {
				return createAllocationStrategyAdapter();
			}
			@Override
			public Adapter caseDynamicTaskAllocation(DynamicTaskAllocation object) {
				return createDynamicTaskAllocationAdapter();
			}
			@Override
			public Adapter caseRoundRobinPreAllocation(RoundRobinPreAllocation object) {
				return createRoundRobinPreAllocationAdapter();
			}
			@Override
			public Adapter caseExecutionTarget(ExecutionTarget object) {
				return createExecutionTargetAdapter();
			}
			@Override
			public Adapter caseSOPRANOWorkerNode(SOPRANOWorkerNode object) {
				return createSOPRANOWorkerNodeAdapter();
			}
			@Override
			public Adapter caseDependency(Dependency object) {
				return createDependencyAdapter();
			}
			@Override
			public Adapter caseFileTreeDependency(FileTreeDependency object) {
				return createFileTreeDependencyAdapter();
			}
			@Override
			public Adapter caseContainerDependency(ContainerDependency object) {
				return createContainerDependencyAdapter();
			}
			@Override
			public Adapter caseDerivedContainerDependency(DerivedContainerDependency object) {
				return createDerivedContainerDependencyAdapter();
			}
			@Override
			public Adapter caseArchiveDependency(ArchiveDependency object) {
				return createArchiveDependencyAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionStrategy
	 * @generated
	 */
	public Adapter createExecutionStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.LocalExecutionStrategy <em>Local Execution Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.LocalExecutionStrategy
	 * @generated
	 */
	public Adapter createLocalExecutionStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.DistributedExecutionStrategy <em>Distributed Execution Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.DistributedExecutionStrategy
	 * @generated
	 */
	public Adapter createDistributedExecutionStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.AllocationStrategy <em>Allocation Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.AllocationStrategy
	 * @generated
	 */
	public Adapter createAllocationStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.DynamicTaskAllocation <em>Dynamic Task Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.DynamicTaskAllocation
	 * @generated
	 */
	public Adapter createDynamicTaskAllocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.RoundRobinPreAllocation <em>Round Robin Pre Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.RoundRobinPreAllocation
	 * @generated
	 */
	public Adapter createRoundRobinPreAllocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionTarget
	 * @generated
	 */
	public Adapter createExecutionTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.SOPRANOWorkerNode <em>SOPRANO Worker Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.SOPRANOWorkerNode
	 * @generated
	 */
	public Adapter createSOPRANOWorkerNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.Dependency
	 * @generated
	 */
	public Adapter createDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.FileTreeDependency <em>File Tree Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.FileTreeDependency
	 * @generated
	 */
	public Adapter createFileTreeDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ContainerDependency <em>Container Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ContainerDependency
	 * @generated
	 */
	public Adapter createContainerDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.DerivedContainerDependency <em>Derived Container Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.DerivedContainerDependency
	 * @generated
	 */
	public Adapter createDerivedContainerDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ArchiveDependency <em>Archive Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ArchiveDependency
	 * @generated
	 */
	public Adapter createArchiveDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ExecutionAdapterFactory
