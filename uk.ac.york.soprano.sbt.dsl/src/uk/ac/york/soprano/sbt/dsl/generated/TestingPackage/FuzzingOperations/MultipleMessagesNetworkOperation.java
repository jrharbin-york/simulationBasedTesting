/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiple Messages Network Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.MultipleMessagesNetworkOperation#getHowManyClones <em>How Many Clones</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getMultipleMessagesNetworkOperation()
 * @model
 * @generated
 */
public interface MultipleMessagesNetworkOperation extends NetworkFuzzingOperation {
	/**
	 * Returns the value of the '<em><b>How Many Clones</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>How Many Clones</em>' containment reference.
	 * @see #setHowManyClones(IntRange)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getMultipleMessagesNetworkOperation_HowManyClones()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IntRange getHowManyClones();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.MultipleMessagesNetworkOperation#getHowManyClones <em>How Many Clones</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>How Many Clones</em>' containment reference.
	 * @see #getHowManyClones()
	 * @generated
	 */
	void setHowManyClones(IntRange value);

} // MultipleMessagesNetworkOperation
