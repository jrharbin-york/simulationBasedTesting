/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.AllocationStrategy;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ArchiveDependency;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ContainerDependency;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ContainerTechnology;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.Dependency;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.DerivedContainerDependency;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.DistributedExecutionStrategy;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.DynamicTaskAllocation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionFactory;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionPackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionStrategy;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionTarget;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.FileTreeDependency;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.LocalExecutionStrategy;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.RoundRobinPreAllocation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.SOPRANOWorkerNode;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.WorkerOS;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperationsPackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.MetricsPackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.impl.MetricsPackageImpl;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Results.ResultsPackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Results.impl.ResultsPackageImpl;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.StandardGrammar.StandardGrammarPackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.StandardGrammar.impl.StandardGrammarPackageImpl;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExecutionPackageImpl extends EPackageImpl implements ExecutionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localExecutionStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distributedExecutionStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocationStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicTaskAllocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roundRobinPreAllocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sopranoWorkerNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileTreeDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedContainerDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass archiveDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum workerOSEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum containerTechnologyEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExecutionPackageImpl() {
		super(eNS_URI, ExecutionFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ExecutionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExecutionPackage init() {
		if (isInited) return (ExecutionPackage)EPackage.Registry.INSTANCE.getEPackage(ExecutionPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredExecutionPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ExecutionPackageImpl theExecutionPackage = registeredExecutionPackage instanceof ExecutionPackageImpl ? (ExecutionPackageImpl)registeredExecutionPackage : new ExecutionPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestingPackagePackage.eNS_URI);
		TestingPackagePackageImpl theTestingPackagePackage = (TestingPackagePackageImpl)(registeredPackage instanceof TestingPackagePackageImpl ? registeredPackage : TestingPackagePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FuzzingOperationsPackage.eNS_URI);
		FuzzingOperationsPackageImpl theFuzzingOperationsPackage = (FuzzingOperationsPackageImpl)(registeredPackage instanceof FuzzingOperationsPackageImpl ? registeredPackage : FuzzingOperationsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI);
		MetricsPackageImpl theMetricsPackage = (MetricsPackageImpl)(registeredPackage instanceof MetricsPackageImpl ? registeredPackage : MetricsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ResultsPackage.eNS_URI);
		ResultsPackageImpl theResultsPackage = (ResultsPackageImpl)(registeredPackage instanceof ResultsPackageImpl ? registeredPackage : ResultsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StandardGrammarPackage.eNS_URI);
		StandardGrammarPackageImpl theStandardGrammarPackage = (StandardGrammarPackageImpl)(registeredPackage instanceof StandardGrammarPackageImpl ? registeredPackage : StandardGrammarPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MRSPackagePackage.eNS_URI);
		MRSPackagePackageImpl theMRSPackagePackage = (MRSPackagePackageImpl)(registeredPackage instanceof MRSPackagePackageImpl ? registeredPackage : MRSPackagePackage.eINSTANCE);

		// Create package meta-data objects
		theExecutionPackage.createPackageContents();
		theTestingPackagePackage.createPackageContents();
		theFuzzingOperationsPackage.createPackageContents();
		theMetricsPackage.createPackageContents();
		theResultsPackage.createPackageContents();
		theStandardGrammarPackage.createPackageContents();
		theMRSPackagePackage.createPackageContents();

		// Initialize created meta-data
		theExecutionPackage.initializePackageContents();
		theTestingPackagePackage.initializePackageContents();
		theFuzzingOperationsPackage.initializePackageContents();
		theMetricsPackage.initializePackageContents();
		theResultsPackage.initializePackageContents();
		theStandardGrammarPackage.initializePackageContents();
		theMRSPackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExecutionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExecutionPackage.eNS_URI, theExecutionPackage);
		return theExecutionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionStrategy() {
		return executionStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExecutionStrategy__IsDistributed() {
		return executionStrategyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalExecutionStrategy() {
		return localExecutionStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalExecutionStrategy_LaunchFileLocation() {
		return (EAttribute)localExecutionStrategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDistributedExecutionStrategy() {
		return distributedExecutionStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistributedExecutionStrategy_AutomaticWorkerDetection() {
		return (EAttribute)distributedExecutionStrategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistributedExecutionStrategy_ExptRunnerIP() {
		return (EAttribute)distributedExecutionStrategyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistributedExecutionStrategy_Dependencies() {
		return (EReference)distributedExecutionStrategyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistributedExecutionStrategy_ExtraExecutionTargets() {
		return (EReference)distributedExecutionStrategyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistributedExecutionStrategy_AllocationStrategy() {
		return (EReference)distributedExecutionStrategyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocationStrategy() {
		return allocationStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicTaskAllocation() {
		return dynamicTaskAllocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoundRobinPreAllocation() {
		return roundRobinPreAllocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionTarget() {
		return executionTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSOPRANOWorkerNode() {
		return sopranoWorkerNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSOPRANOWorkerNode_IpAddress() {
		return (EAttribute)sopranoWorkerNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSOPRANOWorkerNode_WorkerOS() {
		return (EAttribute)sopranoWorkerNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependency() {
		return dependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileTreeDependency() {
		return fileTreeDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerDependency() {
		return containerDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerDependency_ImageName() {
		return (EAttribute)containerDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerDependency_Tech() {
		return (EAttribute)containerDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivedContainerDependency() {
		return derivedContainerDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivedContainerDependency_Base() {
		return (EReference)derivedContainerDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchiveDependency() {
		return archiveDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchiveDependency_Location() {
		return (EAttribute)archiveDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWorkerOS() {
		return workerOSEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContainerTechnology() {
		return containerTechnologyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionFactory getExecutionFactory() {
		return (ExecutionFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		executionStrategyEClass = createEClass(EXECUTION_STRATEGY);
		createEOperation(executionStrategyEClass, EXECUTION_STRATEGY___IS_DISTRIBUTED);

		localExecutionStrategyEClass = createEClass(LOCAL_EXECUTION_STRATEGY);
		createEAttribute(localExecutionStrategyEClass, LOCAL_EXECUTION_STRATEGY__LAUNCH_FILE_LOCATION);

		distributedExecutionStrategyEClass = createEClass(DISTRIBUTED_EXECUTION_STRATEGY);
		createEAttribute(distributedExecutionStrategyEClass, DISTRIBUTED_EXECUTION_STRATEGY__AUTOMATIC_WORKER_DETECTION);
		createEAttribute(distributedExecutionStrategyEClass, DISTRIBUTED_EXECUTION_STRATEGY__EXPT_RUNNER_IP);
		createEReference(distributedExecutionStrategyEClass, DISTRIBUTED_EXECUTION_STRATEGY__DEPENDENCIES);
		createEReference(distributedExecutionStrategyEClass, DISTRIBUTED_EXECUTION_STRATEGY__EXTRA_EXECUTION_TARGETS);
		createEReference(distributedExecutionStrategyEClass, DISTRIBUTED_EXECUTION_STRATEGY__ALLOCATION_STRATEGY);

		allocationStrategyEClass = createEClass(ALLOCATION_STRATEGY);

		dynamicTaskAllocationEClass = createEClass(DYNAMIC_TASK_ALLOCATION);

		roundRobinPreAllocationEClass = createEClass(ROUND_ROBIN_PRE_ALLOCATION);

		executionTargetEClass = createEClass(EXECUTION_TARGET);

		sopranoWorkerNodeEClass = createEClass(SOPRANO_WORKER_NODE);
		createEAttribute(sopranoWorkerNodeEClass, SOPRANO_WORKER_NODE__IP_ADDRESS);
		createEAttribute(sopranoWorkerNodeEClass, SOPRANO_WORKER_NODE__WORKER_OS);

		dependencyEClass = createEClass(DEPENDENCY);

		fileTreeDependencyEClass = createEClass(FILE_TREE_DEPENDENCY);

		containerDependencyEClass = createEClass(CONTAINER_DEPENDENCY);
		createEAttribute(containerDependencyEClass, CONTAINER_DEPENDENCY__IMAGE_NAME);
		createEAttribute(containerDependencyEClass, CONTAINER_DEPENDENCY__TECH);

		derivedContainerDependencyEClass = createEClass(DERIVED_CONTAINER_DEPENDENCY);
		createEReference(derivedContainerDependencyEClass, DERIVED_CONTAINER_DEPENDENCY__BASE);

		archiveDependencyEClass = createEClass(ARCHIVE_DEPENDENCY);
		createEAttribute(archiveDependencyEClass, ARCHIVE_DEPENDENCY__LOCATION);

		// Create enums
		workerOSEEnum = createEEnum(WORKER_OS);
		containerTechnologyEEnum = createEEnum(CONTAINER_TECHNOLOGY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		localExecutionStrategyEClass.getESuperTypes().add(this.getExecutionStrategy());
		distributedExecutionStrategyEClass.getESuperTypes().add(this.getExecutionStrategy());
		dynamicTaskAllocationEClass.getESuperTypes().add(this.getAllocationStrategy());
		roundRobinPreAllocationEClass.getESuperTypes().add(this.getAllocationStrategy());
		sopranoWorkerNodeEClass.getESuperTypes().add(this.getExecutionTarget());
		fileTreeDependencyEClass.getESuperTypes().add(this.getDependency());
		containerDependencyEClass.getESuperTypes().add(this.getDependency());
		derivedContainerDependencyEClass.getESuperTypes().add(this.getDependency());
		archiveDependencyEClass.getESuperTypes().add(this.getDependency());

		// Initialize classes, features, and operations; add parameters
		initEClass(executionStrategyEClass, ExecutionStrategy.class, "ExecutionStrategy", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getExecutionStrategy__IsDistributed(), ecorePackage.getEBoolean(), "isDistributed", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(localExecutionStrategyEClass, LocalExecutionStrategy.class, "LocalExecutionStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocalExecutionStrategy_LaunchFileLocation(), ecorePackage.getEString(), "launchFileLocation", null, 0, 1, LocalExecutionStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(distributedExecutionStrategyEClass, DistributedExecutionStrategy.class, "DistributedExecutionStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDistributedExecutionStrategy_AutomaticWorkerDetection(), ecorePackage.getEBoolean(), "automaticWorkerDetection", "true", 0, 1, DistributedExecutionStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistributedExecutionStrategy_ExptRunnerIP(), ecorePackage.getEString(), "exptRunnerIP", null, 0, 1, DistributedExecutionStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistributedExecutionStrategy_Dependencies(), this.getDependency(), null, "dependencies", null, 0, -1, DistributedExecutionStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistributedExecutionStrategy_ExtraExecutionTargets(), this.getExecutionTarget(), null, "extraExecutionTargets", null, 0, -1, DistributedExecutionStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistributedExecutionStrategy_AllocationStrategy(), this.getAllocationStrategy(), null, "allocationStrategy", null, 1, 1, DistributedExecutionStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allocationStrategyEClass, AllocationStrategy.class, "AllocationStrategy", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dynamicTaskAllocationEClass, DynamicTaskAllocation.class, "DynamicTaskAllocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roundRobinPreAllocationEClass, RoundRobinPreAllocation.class, "RoundRobinPreAllocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(executionTargetEClass, ExecutionTarget.class, "ExecutionTarget", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sopranoWorkerNodeEClass, SOPRANOWorkerNode.class, "SOPRANOWorkerNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSOPRANOWorkerNode_IpAddress(), ecorePackage.getEString(), "ipAddress", null, 0, 1, SOPRANOWorkerNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSOPRANOWorkerNode_WorkerOS(), this.getWorkerOS(), "workerOS", null, 1, 1, SOPRANOWorkerNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependencyEClass, Dependency.class, "Dependency", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fileTreeDependencyEClass, FileTreeDependency.class, "FileTreeDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(containerDependencyEClass, ContainerDependency.class, "ContainerDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContainerDependency_ImageName(), ecorePackage.getEString(), "imageName", null, 0, 1, ContainerDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerDependency_Tech(), this.getContainerTechnology(), "tech", null, 1, 1, ContainerDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(derivedContainerDependencyEClass, DerivedContainerDependency.class, "DerivedContainerDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDerivedContainerDependency_Base(), this.getContainerDependency(), null, "base", null, 1, 1, DerivedContainerDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(archiveDependencyEClass, ArchiveDependency.class, "ArchiveDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArchiveDependency_Location(), ecorePackage.getEString(), "location", null, 0, 1, ArchiveDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(workerOSEEnum, WorkerOS.class, "WorkerOS");
		addEEnumLiteral(workerOSEEnum, WorkerOS.LINUX);
		addEEnumLiteral(workerOSEEnum, WorkerOS.WINDOWS);

		initEEnum(containerTechnologyEEnum, ContainerTechnology.class, "ContainerTechnology");
		addEEnumLiteral(containerTechnologyEEnum, ContainerTechnology.DOCKER);
		addEEnumLiteral(containerTechnologyEEnum, ContainerTechnology.PODMAN);
	}

} //ExecutionPackageImpl
