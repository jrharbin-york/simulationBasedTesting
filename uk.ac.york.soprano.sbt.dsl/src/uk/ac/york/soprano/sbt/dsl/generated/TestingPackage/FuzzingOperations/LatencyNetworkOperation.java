/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Latency Network Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.LatencyNetworkOperation#getLatency <em>Latency</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.LatencyNetworkOperation#isRandomised <em>Randomised</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getLatencyNetworkOperation()
 * @model
 * @generated
 */
public interface LatencyNetworkOperation extends NetworkFuzzingOperation {
	/**
	 * Returns the value of the '<em><b>Latency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latency</em>' containment reference.
	 * @see #setLatency(DoubleRange)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getLatencyNetworkOperation_Latency()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DoubleRange getLatency();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.LatencyNetworkOperation#getLatency <em>Latency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latency</em>' containment reference.
	 * @see #getLatency()
	 * @generated
	 */
	void setLatency(DoubleRange value);

	/**
	 * Returns the value of the '<em><b>Randomised</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Randomised</em>' attribute.
	 * @see #setRandomised(boolean)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getLatencyNetworkOperation_Randomised()
	 * @model default="false"
	 * @generated
	 */
	boolean isRandomised();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.LatencyNetworkOperation#isRandomised <em>Randomised</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Randomised</em>' attribute.
	 * @see #isRandomised()
	 * @generated
	 */
	void setRandomised(boolean value);

} // LatencyNetworkOperation
