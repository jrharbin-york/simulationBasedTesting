/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.EventBasedVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Fuzzing Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.NetworkFuzzingOperation#getVariableToAffect <em>Variable To Affect</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getNetworkFuzzingOperation()
 * @model abstract="true"
 * @generated
 */
public interface NetworkFuzzingOperation extends FuzzingOperation {
	/**
	 * Returns the value of the '<em><b>Variable To Affect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable To Affect</em>' reference.
	 * @see #setVariableToAffect(EventBasedVariable)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getNetworkFuzzingOperation_VariableToAffect()
	 * @model
	 * @generated
	 */
	EventBasedVariable getVariableToAffect();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.NetworkFuzzingOperation#getVariableToAffect <em>Variable To Affect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable To Affect</em>' reference.
	 * @see #getVariableToAffect()
	 * @generated
	 */
	void setVariableToAffect(EventBasedVariable value);

} // NetworkFuzzingOperation
