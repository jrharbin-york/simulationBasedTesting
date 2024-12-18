/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.StandardGrammar.Condition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Based Time Limited</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ConditionBasedTimeLimited#getStarting <em>Starting</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ConditionBasedTimeLimited#getLength <em>Length</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ConditionBasedTimeLimited#getMaximumActivations <em>Maximum Activations</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getConditionBasedTimeLimited()
 * @model
 * @generated
 */
public interface ConditionBasedTimeLimited extends DynamicActivation {
	/**
	 * Returns the value of the '<em><b>Starting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starting</em>' containment reference.
	 * @see #setStarting(Condition)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getConditionBasedTimeLimited_Starting()
	 * @model containment="true"
	 * @generated
	 */
	Condition getStarting();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ConditionBasedTimeLimited#getStarting <em>Starting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starting</em>' containment reference.
	 * @see #getStarting()
	 * @generated
	 */
	void setStarting(Condition value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(double)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getConditionBasedTimeLimited_Length()
	 * @model
	 * @generated
	 */
	double getLength();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ConditionBasedTimeLimited#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(double value);

	/**
	 * Returns the value of the '<em><b>Maximum Activations</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Activations</em>' attribute.
	 * @see #setMaximumActivations(int)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getConditionBasedTimeLimited_MaximumActivations()
	 * @model default="1"
	 * @generated
	 */
	int getMaximumActivations();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ConditionBasedTimeLimited#getMaximumActivations <em>Maximum Activations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Activations</em>' attribute.
	 * @see #getMaximumActivations()
	 * @generated
	 */
	void setMaximumActivations(int value);

} // ConditionBasedTimeLimited
