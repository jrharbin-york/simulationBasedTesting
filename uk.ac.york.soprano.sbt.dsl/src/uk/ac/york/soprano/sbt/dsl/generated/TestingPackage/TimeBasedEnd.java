/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Based End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TimeBasedEnd#getTimeLimitSeconds <em>Time Limit Seconds</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage#getTimeBasedEnd()
 * @model
 * @generated
 */
public interface TimeBasedEnd extends ExecutionEndTrigger {
	/**
	 * Returns the value of the '<em><b>Time Limit Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Limit Seconds</em>' attribute.
	 * @see #setTimeLimitSeconds(long)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage#getTimeBasedEnd_TimeLimitSeconds()
	 * @model
	 * @generated
	 */
	long getTimeLimitSeconds();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TimeBasedEnd#getTimeLimitSeconds <em>Time Limit Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Limit Seconds</em>' attribute.
	 * @see #getTimeLimitSeconds()
	 * @generated
	 */
	void setTimeLimitSeconds(long value);

} // TimeBasedEnd
