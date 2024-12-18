/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distributed Execution Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.DistributedExecutionStrategy#isAutomaticWorkerDetection <em>Automatic Worker Detection</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.DistributedExecutionStrategy#getExptRunnerIP <em>Expt Runner IP</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.DistributedExecutionStrategy#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.DistributedExecutionStrategy#getExtraExecutionTargets <em>Extra Execution Targets</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.DistributedExecutionStrategy#getAllocationStrategy <em>Allocation Strategy</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionPackage#getDistributedExecutionStrategy()
 * @model
 * @generated
 */
public interface DistributedExecutionStrategy extends ExecutionStrategy {
	/**
	 * Returns the value of the '<em><b>Automatic Worker Detection</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Automatic Worker Detection</em>' attribute.
	 * @see #setAutomaticWorkerDetection(boolean)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionPackage#getDistributedExecutionStrategy_AutomaticWorkerDetection()
	 * @model default="true"
	 * @generated
	 */
	boolean isAutomaticWorkerDetection();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.DistributedExecutionStrategy#isAutomaticWorkerDetection <em>Automatic Worker Detection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automatic Worker Detection</em>' attribute.
	 * @see #isAutomaticWorkerDetection()
	 * @generated
	 */
	void setAutomaticWorkerDetection(boolean value);

	/**
	 * Returns the value of the '<em><b>Expt Runner IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expt Runner IP</em>' attribute.
	 * @see #setExptRunnerIP(String)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionPackage#getDistributedExecutionStrategy_ExptRunnerIP()
	 * @model
	 * @generated
	 */
	String getExptRunnerIP();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.DistributedExecutionStrategy#getExptRunnerIP <em>Expt Runner IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expt Runner IP</em>' attribute.
	 * @see #getExptRunnerIP()
	 * @generated
	 */
	void setExptRunnerIP(String value);

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.Dependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference list.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionPackage#getDistributedExecutionStrategy_Dependencies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dependency> getDependencies();

	/**
	 * Returns the value of the '<em><b>Extra Execution Targets</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionTarget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra Execution Targets</em>' containment reference list.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionPackage#getDistributedExecutionStrategy_ExtraExecutionTargets()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExecutionTarget> getExtraExecutionTargets();

	/**
	 * Returns the value of the '<em><b>Allocation Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation Strategy</em>' containment reference.
	 * @see #setAllocationStrategy(AllocationStrategy)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionPackage#getDistributedExecutionStrategy_AllocationStrategy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AllocationStrategy getAllocationStrategy();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.DistributedExecutionStrategy#getAllocationStrategy <em>Allocation Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocation Strategy</em>' containment reference.
	 * @see #getAllocationStrategy()
	 * @generated
	 */
	void setAllocationStrategy(AllocationStrategy value);

} // DistributedExecutionStrategy
