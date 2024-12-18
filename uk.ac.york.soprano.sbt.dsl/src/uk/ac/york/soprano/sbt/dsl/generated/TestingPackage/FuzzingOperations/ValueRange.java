/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ValueRange#getRandChoice <em>Rand Choice</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getValueRange()
 * @model abstract="true"
 * @generated
 */
public interface ValueRange extends ValueSet {
	/**
	 * Returns the value of the '<em><b>Rand Choice</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.RandomValueFromSetChoice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rand Choice</em>' attribute.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.RandomValueFromSetChoice
	 * @see #setRandChoice(RandomValueFromSetChoice)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getValueRange_RandChoice()
	 * @model
	 * @generated
	 */
	RandomValueFromSetChoice getRandChoice();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ValueRange#getRandChoice <em>Rand Choice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rand Choice</em>' attribute.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.RandomValueFromSetChoice
	 * @see #getRandChoice()
	 * @generated
	 */
	void setRandChoice(RandomValueFromSetChoice value);

} // ValueRange
