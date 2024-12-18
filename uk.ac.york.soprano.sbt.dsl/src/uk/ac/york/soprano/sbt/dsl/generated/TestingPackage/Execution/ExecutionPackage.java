/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionFactory
 * @model kind="package"
 * @generated
 */
public interface ExecutionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Execution";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "Execution";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExecutionPackage eINSTANCE = uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ExecutionPackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ExecutionStrategyImpl <em>Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ExecutionStrategyImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ExecutionPackageImpl#getExecutionStrategy()
	 * @generated
	 */
	int EXECUTION_STRATEGY = 0;

	/**
	 * The number of structural features of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STRATEGY_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Is Distributed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STRATEGY___IS_DISTRIBUTED = 0;

	/**
	 * The number of operations of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STRATEGY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.LocalExecutionStrategyImpl <em>Local Execution Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.LocalExecutionStrategyImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ExecutionPackageImpl#getLocalExecutionStrategy()
	 * @generated
	 */
	int LOCAL_EXECUTION_STRATEGY = 1;

	/**
	 * The feature id for the '<em><b>Launch File Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_EXECUTION_STRATEGY__LAUNCH_FILE_LOCATION = EXECUTION_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Local Execution Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_EXECUTION_STRATEGY_FEATURE_COUNT = EXECUTION_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Distributed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_EXECUTION_STRATEGY___IS_DISTRIBUTED = EXECUTION_STRATEGY___IS_DISTRIBUTED;

	/**
	 * The number of operations of the '<em>Local Execution Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_EXECUTION_STRATEGY_OPERATION_COUNT = EXECUTION_STRATEGY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.DistributedExecutionStrategyImpl <em>Distributed Execution Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.DistributedExecutionStrategyImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ExecutionPackageImpl#getDistributedExecutionStrategy()
	 * @generated
	 */
	int DISTRIBUTED_EXECUTION_STRATEGY = 2;

	/**
	 * The feature id for the '<em><b>Automatic Worker Detection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTED_EXECUTION_STRATEGY__AUTOMATIC_WORKER_DETECTION = EXECUTION_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expt Runner IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTED_EXECUTION_STRATEGY__EXPT_RUNNER_IP = EXECUTION_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTED_EXECUTION_STRATEGY__DEPENDENCIES = EXECUTION_STRATEGY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Extra Execution Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTED_EXECUTION_STRATEGY__EXTRA_EXECUTION_TARGETS = EXECUTION_STRATEGY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Allocation Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTED_EXECUTION_STRATEGY__ALLOCATION_STRATEGY = EXECUTION_STRATEGY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Distributed Execution Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTED_EXECUTION_STRATEGY_FEATURE_COUNT = EXECUTION_STRATEGY_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Distributed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTED_EXECUTION_STRATEGY___IS_DISTRIBUTED = EXECUTION_STRATEGY___IS_DISTRIBUTED;

	/**
	 * The number of operations of the '<em>Distributed Execution Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTED_EXECUTION_STRATEGY_OPERATION_COUNT = EXECUTION_STRATEGY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.AllocationStrategyImpl <em>Allocation Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.AllocationStrategyImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ExecutionPackageImpl#getAllocationStrategy()
	 * @generated
	 */
	int ALLOCATION_STRATEGY = 3;

	/**
	 * The number of structural features of the '<em>Allocation Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_STRATEGY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Allocation Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_STRATEGY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.DynamicTaskAllocationImpl <em>Dynamic Task Allocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.DynamicTaskAllocationImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ExecutionPackageImpl#getDynamicTaskAllocation()
	 * @generated
	 */
	int DYNAMIC_TASK_ALLOCATION = 4;

	/**
	 * The number of structural features of the '<em>Dynamic Task Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_TASK_ALLOCATION_FEATURE_COUNT = ALLOCATION_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dynamic Task Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_TASK_ALLOCATION_OPERATION_COUNT = ALLOCATION_STRATEGY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.RoundRobinPreAllocationImpl <em>Round Robin Pre Allocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.RoundRobinPreAllocationImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ExecutionPackageImpl#getRoundRobinPreAllocation()
	 * @generated
	 */
	int ROUND_ROBIN_PRE_ALLOCATION = 5;

	/**
	 * The number of structural features of the '<em>Round Robin Pre Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_ROBIN_PRE_ALLOCATION_FEATURE_COUNT = ALLOCATION_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Round Robin Pre Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_ROBIN_PRE_ALLOCATION_OPERATION_COUNT = ALLOCATION_STRATEGY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ExecutionTargetImpl <em>Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ExecutionTargetImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ExecutionPackageImpl#getExecutionTarget()
	 * @generated
	 */
	int EXECUTION_TARGET = 6;

	/**
	 * The number of structural features of the '<em>Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TARGET_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TARGET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.SOPRANOWorkerNodeImpl <em>SOPRANO Worker Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.SOPRANOWorkerNodeImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ExecutionPackageImpl#getSOPRANOWorkerNode()
	 * @generated
	 */
	int SOPRANO_WORKER_NODE = 7;

	/**
	 * The feature id for the '<em><b>Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOPRANO_WORKER_NODE__IP_ADDRESS = EXECUTION_TARGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Worker OS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOPRANO_WORKER_NODE__WORKER_OS = EXECUTION_TARGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SOPRANO Worker Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOPRANO_WORKER_NODE_FEATURE_COUNT = EXECUTION_TARGET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>SOPRANO Worker Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOPRANO_WORKER_NODE_OPERATION_COUNT = EXECUTION_TARGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.DependencyImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ExecutionPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 8;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.FileTreeDependencyImpl <em>File Tree Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.FileTreeDependencyImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ExecutionPackageImpl#getFileTreeDependency()
	 * @generated
	 */
	int FILE_TREE_DEPENDENCY = 9;

	/**
	 * The number of structural features of the '<em>File Tree Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TREE_DEPENDENCY_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>File Tree Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TREE_DEPENDENCY_OPERATION_COUNT = DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ContainerDependencyImpl <em>Container Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ContainerDependencyImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ExecutionPackageImpl#getContainerDependency()
	 * @generated
	 */
	int CONTAINER_DEPENDENCY = 10;

	/**
	 * The feature id for the '<em><b>Image Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_DEPENDENCY__IMAGE_NAME = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tech</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_DEPENDENCY__TECH = DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Container Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_DEPENDENCY_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Container Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_DEPENDENCY_OPERATION_COUNT = DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.DerivedContainerDependencyImpl <em>Derived Container Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.DerivedContainerDependencyImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ExecutionPackageImpl#getDerivedContainerDependency()
	 * @generated
	 */
	int DERIVED_CONTAINER_DEPENDENCY = 11;

	/**
	 * The feature id for the '<em><b>Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_CONTAINER_DEPENDENCY__BASE = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Derived Container Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_CONTAINER_DEPENDENCY_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Derived Container Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_CONTAINER_DEPENDENCY_OPERATION_COUNT = DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ArchiveDependencyImpl <em>Archive Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ArchiveDependencyImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ExecutionPackageImpl#getArchiveDependency()
	 * @generated
	 */
	int ARCHIVE_DEPENDENCY = 12;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_DEPENDENCY__LOCATION = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Archive Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_DEPENDENCY_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Archive Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_DEPENDENCY_OPERATION_COUNT = DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.WorkerOS <em>Worker OS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.WorkerOS
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ExecutionPackageImpl#getWorkerOS()
	 * @generated
	 */
	int WORKER_OS = 13;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ContainerTechnology <em>Container Technology</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ContainerTechnology
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ExecutionPackageImpl#getContainerTechnology()
	 * @generated
	 */
	int CONTAINER_TECHNOLOGY = 14;


	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strategy</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionStrategy
	 * @generated
	 */
	EClass getExecutionStrategy();

	/**
	 * Returns the meta object for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionStrategy#isDistributed() <em>Is Distributed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Distributed</em>' operation.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionStrategy#isDistributed()
	 * @generated
	 */
	EOperation getExecutionStrategy__IsDistributed();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.LocalExecutionStrategy <em>Local Execution Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Execution Strategy</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.LocalExecutionStrategy
	 * @generated
	 */
	EClass getLocalExecutionStrategy();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.LocalExecutionStrategy#getLaunchFileLocation <em>Launch File Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Launch File Location</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.LocalExecutionStrategy#getLaunchFileLocation()
	 * @see #getLocalExecutionStrategy()
	 * @generated
	 */
	EAttribute getLocalExecutionStrategy_LaunchFileLocation();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.DistributedExecutionStrategy <em>Distributed Execution Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distributed Execution Strategy</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.DistributedExecutionStrategy
	 * @generated
	 */
	EClass getDistributedExecutionStrategy();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.DistributedExecutionStrategy#isAutomaticWorkerDetection <em>Automatic Worker Detection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Automatic Worker Detection</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.DistributedExecutionStrategy#isAutomaticWorkerDetection()
	 * @see #getDistributedExecutionStrategy()
	 * @generated
	 */
	EAttribute getDistributedExecutionStrategy_AutomaticWorkerDetection();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.DistributedExecutionStrategy#getExptRunnerIP <em>Expt Runner IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expt Runner IP</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.DistributedExecutionStrategy#getExptRunnerIP()
	 * @see #getDistributedExecutionStrategy()
	 * @generated
	 */
	EAttribute getDistributedExecutionStrategy_ExptRunnerIP();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.DistributedExecutionStrategy#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependencies</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.DistributedExecutionStrategy#getDependencies()
	 * @see #getDistributedExecutionStrategy()
	 * @generated
	 */
	EReference getDistributedExecutionStrategy_Dependencies();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.DistributedExecutionStrategy#getExtraExecutionTargets <em>Extra Execution Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extra Execution Targets</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.DistributedExecutionStrategy#getExtraExecutionTargets()
	 * @see #getDistributedExecutionStrategy()
	 * @generated
	 */
	EReference getDistributedExecutionStrategy_ExtraExecutionTargets();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.DistributedExecutionStrategy#getAllocationStrategy <em>Allocation Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Allocation Strategy</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.DistributedExecutionStrategy#getAllocationStrategy()
	 * @see #getDistributedExecutionStrategy()
	 * @generated
	 */
	EReference getDistributedExecutionStrategy_AllocationStrategy();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.AllocationStrategy <em>Allocation Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocation Strategy</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.AllocationStrategy
	 * @generated
	 */
	EClass getAllocationStrategy();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.DynamicTaskAllocation <em>Dynamic Task Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Task Allocation</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.DynamicTaskAllocation
	 * @generated
	 */
	EClass getDynamicTaskAllocation();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.RoundRobinPreAllocation <em>Round Robin Pre Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Round Robin Pre Allocation</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.RoundRobinPreAllocation
	 * @generated
	 */
	EClass getRoundRobinPreAllocation();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionTarget
	 * @generated
	 */
	EClass getExecutionTarget();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.SOPRANOWorkerNode <em>SOPRANO Worker Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SOPRANO Worker Node</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.SOPRANOWorkerNode
	 * @generated
	 */
	EClass getSOPRANOWorkerNode();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.SOPRANOWorkerNode#getIpAddress <em>Ip Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip Address</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.SOPRANOWorkerNode#getIpAddress()
	 * @see #getSOPRANOWorkerNode()
	 * @generated
	 */
	EAttribute getSOPRANOWorkerNode_IpAddress();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.SOPRANOWorkerNode#getWorkerOS <em>Worker OS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Worker OS</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.SOPRANOWorkerNode#getWorkerOS()
	 * @see #getSOPRANOWorkerNode()
	 * @generated
	 */
	EAttribute getSOPRANOWorkerNode_WorkerOS();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.FileTreeDependency <em>File Tree Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Tree Dependency</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.FileTreeDependency
	 * @generated
	 */
	EClass getFileTreeDependency();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ContainerDependency <em>Container Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Dependency</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ContainerDependency
	 * @generated
	 */
	EClass getContainerDependency();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ContainerDependency#getImageName <em>Image Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Name</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ContainerDependency#getImageName()
	 * @see #getContainerDependency()
	 * @generated
	 */
	EAttribute getContainerDependency_ImageName();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ContainerDependency#getTech <em>Tech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tech</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ContainerDependency#getTech()
	 * @see #getContainerDependency()
	 * @generated
	 */
	EAttribute getContainerDependency_Tech();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.DerivedContainerDependency <em>Derived Container Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived Container Dependency</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.DerivedContainerDependency
	 * @generated
	 */
	EClass getDerivedContainerDependency();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.DerivedContainerDependency#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.DerivedContainerDependency#getBase()
	 * @see #getDerivedContainerDependency()
	 * @generated
	 */
	EReference getDerivedContainerDependency_Base();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ArchiveDependency <em>Archive Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Archive Dependency</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ArchiveDependency
	 * @generated
	 */
	EClass getArchiveDependency();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ArchiveDependency#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ArchiveDependency#getLocation()
	 * @see #getArchiveDependency()
	 * @generated
	 */
	EAttribute getArchiveDependency_Location();

	/**
	 * Returns the meta object for enum '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.WorkerOS <em>Worker OS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Worker OS</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.WorkerOS
	 * @generated
	 */
	EEnum getWorkerOS();

	/**
	 * Returns the meta object for enum '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ContainerTechnology <em>Container Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Container Technology</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ContainerTechnology
	 * @generated
	 */
	EEnum getContainerTechnology();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExecutionFactory getExecutionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ExecutionStrategyImpl <em>Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ExecutionStrategyImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ExecutionPackageImpl#getExecutionStrategy()
		 * @generated
		 */
		EClass EXECUTION_STRATEGY = eINSTANCE.getExecutionStrategy();

		/**
		 * The meta object literal for the '<em><b>Is Distributed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION_STRATEGY___IS_DISTRIBUTED = eINSTANCE.getExecutionStrategy__IsDistributed();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.LocalExecutionStrategyImpl <em>Local Execution Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.LocalExecutionStrategyImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ExecutionPackageImpl#getLocalExecutionStrategy()
		 * @generated
		 */
		EClass LOCAL_EXECUTION_STRATEGY = eINSTANCE.getLocalExecutionStrategy();

		/**
		 * The meta object literal for the '<em><b>Launch File Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_EXECUTION_STRATEGY__LAUNCH_FILE_LOCATION = eINSTANCE.getLocalExecutionStrategy_LaunchFileLocation();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.DistributedExecutionStrategyImpl <em>Distributed Execution Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.DistributedExecutionStrategyImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ExecutionPackageImpl#getDistributedExecutionStrategy()
		 * @generated
		 */
		EClass DISTRIBUTED_EXECUTION_STRATEGY = eINSTANCE.getDistributedExecutionStrategy();

		/**
		 * The meta object literal for the '<em><b>Automatic Worker Detection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTED_EXECUTION_STRATEGY__AUTOMATIC_WORKER_DETECTION = eINSTANCE.getDistributedExecutionStrategy_AutomaticWorkerDetection();

		/**
		 * The meta object literal for the '<em><b>Expt Runner IP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTED_EXECUTION_STRATEGY__EXPT_RUNNER_IP = eINSTANCE.getDistributedExecutionStrategy_ExptRunnerIP();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTED_EXECUTION_STRATEGY__DEPENDENCIES = eINSTANCE.getDistributedExecutionStrategy_Dependencies();

		/**
		 * The meta object literal for the '<em><b>Extra Execution Targets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTED_EXECUTION_STRATEGY__EXTRA_EXECUTION_TARGETS = eINSTANCE.getDistributedExecutionStrategy_ExtraExecutionTargets();

		/**
		 * The meta object literal for the '<em><b>Allocation Strategy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTED_EXECUTION_STRATEGY__ALLOCATION_STRATEGY = eINSTANCE.getDistributedExecutionStrategy_AllocationStrategy();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.AllocationStrategyImpl <em>Allocation Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.AllocationStrategyImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ExecutionPackageImpl#getAllocationStrategy()
		 * @generated
		 */
		EClass ALLOCATION_STRATEGY = eINSTANCE.getAllocationStrategy();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.DynamicTaskAllocationImpl <em>Dynamic Task Allocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.DynamicTaskAllocationImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ExecutionPackageImpl#getDynamicTaskAllocation()
		 * @generated
		 */
		EClass DYNAMIC_TASK_ALLOCATION = eINSTANCE.getDynamicTaskAllocation();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.RoundRobinPreAllocationImpl <em>Round Robin Pre Allocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.RoundRobinPreAllocationImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ExecutionPackageImpl#getRoundRobinPreAllocation()
		 * @generated
		 */
		EClass ROUND_ROBIN_PRE_ALLOCATION = eINSTANCE.getRoundRobinPreAllocation();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ExecutionTargetImpl <em>Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ExecutionTargetImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ExecutionPackageImpl#getExecutionTarget()
		 * @generated
		 */
		EClass EXECUTION_TARGET = eINSTANCE.getExecutionTarget();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.SOPRANOWorkerNodeImpl <em>SOPRANO Worker Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.SOPRANOWorkerNodeImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ExecutionPackageImpl#getSOPRANOWorkerNode()
		 * @generated
		 */
		EClass SOPRANO_WORKER_NODE = eINSTANCE.getSOPRANOWorkerNode();

		/**
		 * The meta object literal for the '<em><b>Ip Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOPRANO_WORKER_NODE__IP_ADDRESS = eINSTANCE.getSOPRANOWorkerNode_IpAddress();

		/**
		 * The meta object literal for the '<em><b>Worker OS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOPRANO_WORKER_NODE__WORKER_OS = eINSTANCE.getSOPRANOWorkerNode_WorkerOS();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.DependencyImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ExecutionPackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.FileTreeDependencyImpl <em>File Tree Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.FileTreeDependencyImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ExecutionPackageImpl#getFileTreeDependency()
		 * @generated
		 */
		EClass FILE_TREE_DEPENDENCY = eINSTANCE.getFileTreeDependency();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ContainerDependencyImpl <em>Container Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ContainerDependencyImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ExecutionPackageImpl#getContainerDependency()
		 * @generated
		 */
		EClass CONTAINER_DEPENDENCY = eINSTANCE.getContainerDependency();

		/**
		 * The meta object literal for the '<em><b>Image Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_DEPENDENCY__IMAGE_NAME = eINSTANCE.getContainerDependency_ImageName();

		/**
		 * The meta object literal for the '<em><b>Tech</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_DEPENDENCY__TECH = eINSTANCE.getContainerDependency_Tech();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.DerivedContainerDependencyImpl <em>Derived Container Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.DerivedContainerDependencyImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ExecutionPackageImpl#getDerivedContainerDependency()
		 * @generated
		 */
		EClass DERIVED_CONTAINER_DEPENDENCY = eINSTANCE.getDerivedContainerDependency();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVED_CONTAINER_DEPENDENCY__BASE = eINSTANCE.getDerivedContainerDependency_Base();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ArchiveDependencyImpl <em>Archive Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ArchiveDependencyImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ExecutionPackageImpl#getArchiveDependency()
		 * @generated
		 */
		EClass ARCHIVE_DEPENDENCY = eINSTANCE.getArchiveDependency();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHIVE_DEPENDENCY__LOCATION = eINSTANCE.getArchiveDependency_Location();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.WorkerOS <em>Worker OS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.WorkerOS
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ExecutionPackageImpl#getWorkerOS()
		 * @generated
		 */
		EEnum WORKER_OS = eINSTANCE.getWorkerOS();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ContainerTechnology <em>Container Technology</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ContainerTechnology
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ExecutionPackageImpl#getContainerTechnology()
		 * @generated
		 */
		EEnum CONTAINER_TECHNOLOGY = eINSTANCE.getContainerTechnology();

	}

} //ExecutionPackage
