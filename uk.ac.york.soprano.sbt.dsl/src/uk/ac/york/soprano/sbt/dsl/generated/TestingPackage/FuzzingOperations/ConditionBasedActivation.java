/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.StandardGrammar.Condition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Based Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ConditionBasedActivation#getStarting <em>Starting</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ConditionBasedActivation#getEnding <em>Ending</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ConditionBasedActivation#getMaximumActivations <em>Maximum Activations</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getConditionBasedActivation()
 * @model
 * @generated
 */
public interface ConditionBasedActivation extends DynamicActivation {
	/**
	 * Returns the value of the '<em><b>Starting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starting</em>' containment reference.
	 * @see #setStarting(Condition)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getConditionBasedActivation_Starting()
	 * @model containment="true"
	 * @generated
	 */
	Condition getStarting();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ConditionBasedActivation#getStarting <em>Starting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starting</em>' containment reference.
	 * @see #getStarting()
	 * @generated
	 */
	void setStarting(Condition value);

	/**
	 * Returns the value of the '<em><b>Ending</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ending</em>' containment reference.
	 * @see #setEnding(Condition)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getConditionBasedActivation_Ending()
	 * @model containment="true"
	 * @generated
	 */
	Condition getEnding();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ConditionBasedActivation#getEnding <em>Ending</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ending</em>' containment reference.
	 * @see #getEnding()
	 * @generated
	 */
	void setEnding(Condition value);

	/**
	 * Returns the value of the '<em><b>Maximum Activations</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Activations</em>' attribute.
	 * @see #setMaximumActivations(int)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getConditionBasedActivation_MaximumActivations()
	 * @model default="1"
	 * @generated
	 */
	int getMaximumActivations();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ConditionBasedActivation#getMaximumActivations <em>Maximum Activations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Activations</em>' attribute.
	 * @see #getMaximumActivations()
	 * @generated
	 */
	void setMaximumActivations(int value);

} // ConditionBasedActivation
