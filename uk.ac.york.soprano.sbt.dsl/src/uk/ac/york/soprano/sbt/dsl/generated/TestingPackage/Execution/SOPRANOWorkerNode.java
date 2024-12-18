/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SOPRANO Worker Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.SOPRANOWorkerNode#getIpAddress <em>Ip Address</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.SOPRANOWorkerNode#getWorkerOS <em>Worker OS</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionPackage#getSOPRANOWorkerNode()
 * @model
 * @generated
 */
public interface SOPRANOWorkerNode extends ExecutionTarget {
	/**
	 * Returns the value of the '<em><b>Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip Address</em>' attribute.
	 * @see #setIpAddress(String)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionPackage#getSOPRANOWorkerNode_IpAddress()
	 * @model
	 * @generated
	 */
	String getIpAddress();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.SOPRANOWorkerNode#getIpAddress <em>Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip Address</em>' attribute.
	 * @see #getIpAddress()
	 * @generated
	 */
	void setIpAddress(String value);

	/**
	 * Returns the value of the '<em><b>Worker OS</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.WorkerOS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worker OS</em>' attribute.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.WorkerOS
	 * @see #setWorkerOS(WorkerOS)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionPackage#getSOPRANOWorkerNode_WorkerOS()
	 * @model required="true"
	 * @generated
	 */
	WorkerOS getWorkerOS();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.SOPRANOWorkerNode#getWorkerOS <em>Worker OS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worker OS</em>' attribute.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.WorkerOS
	 * @see #getWorkerOS()
	 * @generated
	 */
	void setWorkerOS(WorkerOS value);

} // SOPRANOWorkerNode
