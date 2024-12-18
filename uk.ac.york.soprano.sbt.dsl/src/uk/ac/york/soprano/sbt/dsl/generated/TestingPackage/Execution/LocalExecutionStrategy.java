/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Execution Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.LocalExecutionStrategy#getLaunchFileLocation <em>Launch File Location</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionPackage#getLocalExecutionStrategy()
 * @model
 * @generated
 */
public interface LocalExecutionStrategy extends ExecutionStrategy {
	/**
	 * Returns the value of the '<em><b>Launch File Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Launch File Location</em>' attribute.
	 * @see #setLaunchFileLocation(String)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionPackage#getLocalExecutionStrategy_LaunchFileLocation()
	 * @model
	 * @generated
	 */
	String getLaunchFileLocation();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.LocalExecutionStrategy#getLaunchFileLocation <em>Launch File Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Launch File Location</em>' attribute.
	 * @see #getLaunchFileLocation()
	 * @generated
	 */
	void setLaunchFileLocation(String value);

} // LocalExecutionStrategy
