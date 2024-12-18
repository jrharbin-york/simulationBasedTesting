/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExecutionFactoryImpl extends EFactoryImpl implements ExecutionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExecutionFactory init() {
		try {
			ExecutionFactory theExecutionFactory = (ExecutionFactory)EPackage.Registry.INSTANCE.getEFactory(ExecutionPackage.eNS_URI);
			if (theExecutionFactory != null) {
				return theExecutionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExecutionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ExecutionPackage.LOCAL_EXECUTION_STRATEGY: return createLocalExecutionStrategy();
			case ExecutionPackage.DISTRIBUTED_EXECUTION_STRATEGY: return createDistributedExecutionStrategy();
			case ExecutionPackage.DYNAMIC_TASK_ALLOCATION: return createDynamicTaskAllocation();
			case ExecutionPackage.ROUND_ROBIN_PRE_ALLOCATION: return createRoundRobinPreAllocation();
			case ExecutionPackage.SOPRANO_WORKER_NODE: return createSOPRANOWorkerNode();
			case ExecutionPackage.FILE_TREE_DEPENDENCY: return createFileTreeDependency();
			case ExecutionPackage.CONTAINER_DEPENDENCY: return createContainerDependency();
			case ExecutionPackage.DERIVED_CONTAINER_DEPENDENCY: return createDerivedContainerDependency();
			case ExecutionPackage.ARCHIVE_DEPENDENCY: return createArchiveDependency();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ExecutionPackage.WORKER_OS:
				return createWorkerOSFromString(eDataType, initialValue);
			case ExecutionPackage.CONTAINER_TECHNOLOGY:
				return createContainerTechnologyFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ExecutionPackage.WORKER_OS:
				return convertWorkerOSToString(eDataType, instanceValue);
			case ExecutionPackage.CONTAINER_TECHNOLOGY:
				return convertContainerTechnologyToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalExecutionStrategy createLocalExecutionStrategy() {
		LocalExecutionStrategyImpl localExecutionStrategy = new LocalExecutionStrategyImpl();
		return localExecutionStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributedExecutionStrategy createDistributedExecutionStrategy() {
		DistributedExecutionStrategyImpl distributedExecutionStrategy = new DistributedExecutionStrategyImpl();
		return distributedExecutionStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicTaskAllocation createDynamicTaskAllocation() {
		DynamicTaskAllocationImpl dynamicTaskAllocation = new DynamicTaskAllocationImpl();
		return dynamicTaskAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoundRobinPreAllocation createRoundRobinPreAllocation() {
		RoundRobinPreAllocationImpl roundRobinPreAllocation = new RoundRobinPreAllocationImpl();
		return roundRobinPreAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SOPRANOWorkerNode createSOPRANOWorkerNode() {
		SOPRANOWorkerNodeImpl sopranoWorkerNode = new SOPRANOWorkerNodeImpl();
		return sopranoWorkerNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileTreeDependency createFileTreeDependency() {
		FileTreeDependencyImpl fileTreeDependency = new FileTreeDependencyImpl();
		return fileTreeDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerDependency createContainerDependency() {
		ContainerDependencyImpl containerDependency = new ContainerDependencyImpl();
		return containerDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedContainerDependency createDerivedContainerDependency() {
		DerivedContainerDependencyImpl derivedContainerDependency = new DerivedContainerDependencyImpl();
		return derivedContainerDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchiveDependency createArchiveDependency() {
		ArchiveDependencyImpl archiveDependency = new ArchiveDependencyImpl();
		return archiveDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkerOS createWorkerOSFromString(EDataType eDataType, String initialValue) {
		WorkerOS result = WorkerOS.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWorkerOSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerTechnology createContainerTechnologyFromString(EDataType eDataType, String initialValue) {
		ContainerTechnology result = ContainerTechnology.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContainerTechnologyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionPackage getExecutionPackage() {
		return (ExecutionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExecutionPackage getPackage() {
		return ExecutionPackage.eINSTANCE;
	}

} //ExecutionFactoryImpl
