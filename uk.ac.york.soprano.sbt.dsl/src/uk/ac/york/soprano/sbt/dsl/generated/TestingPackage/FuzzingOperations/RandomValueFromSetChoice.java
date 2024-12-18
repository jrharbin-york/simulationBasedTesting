/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Random Value From Set Choice</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getRandomValueFromSetChoice()
 * @model
 * @generated
 */
public enum RandomValueFromSetChoice implements Enumerator {
	/**
	 * The '<em><b>RANDOM FROM SEED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RANDOM_FROM_SEED_VALUE
	 * @generated
	 * @ordered
	 */
	RANDOM_FROM_SEED(0, "RANDOM_FROM_SEED", "RANDOM_FROM_SEED"),

	/**
	 * The '<em><b>ALWAYS LOW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALWAYS_LOW_VALUE
	 * @generated
	 * @ordered
	 */
	ALWAYS_LOW(1, "ALWAYS_LOW", "ALWAYS_LOW"),

	/**
	 * The '<em><b>ALWAYS HIGH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALWAYS_HIGH_VALUE
	 * @generated
	 * @ordered
	 */
	ALWAYS_HIGH(2, "ALWAYS_HIGH", "ALWAYS_HIGH"), /**
	 * The '<em><b>KEEP SAME RANGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEEP_SAME_RANGE_VALUE
	 * @generated
	 * @ordered
	 */
	KEEP_SAME_RANGE(3, "KEEP_SAME_RANGE", "KEEP_SAME_RANGE");

	/**
	 * The '<em><b>RANDOM FROM SEED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RANDOM_FROM_SEED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RANDOM_FROM_SEED_VALUE = 0;

	/**
	 * The '<em><b>ALWAYS LOW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALWAYS_LOW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALWAYS_LOW_VALUE = 1;

	/**
	 * The '<em><b>ALWAYS HIGH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALWAYS_HIGH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALWAYS_HIGH_VALUE = 2;

	/**
	 * The '<em><b>KEEP SAME RANGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEEP_SAME_RANGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KEEP_SAME_RANGE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Random Value From Set Choice</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RandomValueFromSetChoice[] VALUES_ARRAY =
		new RandomValueFromSetChoice[] {
			RANDOM_FROM_SEED,
			ALWAYS_LOW,
			ALWAYS_HIGH,
			KEEP_SAME_RANGE,
		};

	/**
	 * A public read-only list of all the '<em><b>Random Value From Set Choice</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RandomValueFromSetChoice> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Random Value From Set Choice</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RandomValueFromSetChoice get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RandomValueFromSetChoice result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Random Value From Set Choice</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RandomValueFromSetChoice getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RandomValueFromSetChoice result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Random Value From Set Choice</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RandomValueFromSetChoice get(int value) {
		switch (value) {
			case RANDOM_FROM_SEED_VALUE: return RANDOM_FROM_SEED;
			case ALWAYS_LOW_VALUE: return ALWAYS_LOW;
			case ALWAYS_HIGH_VALUE: return ALWAYS_HIGH;
			case KEEP_SAME_RANGE_VALUE: return KEEP_SAME_RANGE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RandomValueFromSetChoice(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //RandomValueFromSetChoice
