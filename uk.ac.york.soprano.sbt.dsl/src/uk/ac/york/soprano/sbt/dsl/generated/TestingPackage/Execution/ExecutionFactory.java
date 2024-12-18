/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionPackage
 * @generated
 */
public interface ExecutionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExecutionFactory eINSTANCE = uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ExecutionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Local Execution Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Execution Strategy</em>'.
	 * @generated
	 */
	LocalExecutionStrategy createLocalExecutionStrategy();

	/**
	 * Returns a new object of class '<em>Distributed Execution Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Distributed Execution Strategy</em>'.
	 * @generated
	 */
	DistributedExecutionStrategy createDistributedExecutionStrategy();

	/**
	 * Returns a new object of class '<em>Dynamic Task Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamic Task Allocation</em>'.
	 * @generated
	 */
	DynamicTaskAllocation createDynamicTaskAllocation();

	/**
	 * Returns a new object of class '<em>Round Robin Pre Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Round Robin Pre Allocation</em>'.
	 * @generated
	 */
	RoundRobinPreAllocation createRoundRobinPreAllocation();

	/**
	 * Returns a new object of class '<em>SOPRANO Worker Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SOPRANO Worker Node</em>'.
	 * @generated
	 */
	SOPRANOWorkerNode createSOPRANOWorkerNode();

	/**
	 * Returns a new object of class '<em>File Tree Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Tree Dependency</em>'.
	 * @generated
	 */
	FileTreeDependency createFileTreeDependency();

	/**
	 * Returns a new object of class '<em>Container Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Dependency</em>'.
	 * @generated
	 */
	ContainerDependency createContainerDependency();

	/**
	 * Returns a new object of class '<em>Derived Container Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Derived Container Dependency</em>'.
	 * @generated
	 */
	DerivedContainerDependency createDerivedContainerDependency();

	/**
	 * Returns a new object of class '<em>Archive Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Archive Dependency</em>'.
	 * @generated
	 */
	ArchiveDependency createArchiveDependency();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExecutionPackage getExecutionPackage();

} //ExecutionFactory
