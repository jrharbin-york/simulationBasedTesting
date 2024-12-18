/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.IntRange#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.IntRange#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getIntRange()
 * @model
 * @generated
 */
public interface IntRange extends ValueRange {
	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(int)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getIntRange_LowerBound()
	 * @model
	 * @generated
	 */
	int getLowerBound();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.IntRange#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(int value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(int)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getIntRange_UpperBound()
	 * @model
	 * @generated
	 */
	int getUpperBound();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.IntRange#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(int value);

} // IntRange
