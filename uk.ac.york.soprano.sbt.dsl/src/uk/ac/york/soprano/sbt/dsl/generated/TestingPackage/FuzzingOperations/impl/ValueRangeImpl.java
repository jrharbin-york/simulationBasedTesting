/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperationsPackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.RandomValueFromSetChoice;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ValueRange;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.ValueRangeImpl#getRandChoice <em>Rand Choice</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ValueRangeImpl extends ValueSetImpl implements ValueRange {
	/**
	 * The default value of the '{@link #getRandChoice() <em>Rand Choice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRandChoice()
	 * @generated
	 * @ordered
	 */
	protected static final RandomValueFromSetChoice RAND_CHOICE_EDEFAULT = RandomValueFromSetChoice.RANDOM_FROM_SEED;

	/**
	 * The cached value of the '{@link #getRandChoice() <em>Rand Choice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRandChoice()
	 * @generated
	 * @ordered
	 */
	protected RandomValueFromSetChoice randChoice = RAND_CHOICE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueRangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FuzzingOperationsPackage.Literals.VALUE_RANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RandomValueFromSetChoice getRandChoice() {
		return randChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRandChoice(RandomValueFromSetChoice newRandChoice) {
		RandomValueFromSetChoice oldRandChoice = randChoice;
		randChoice = newRandChoice == null ? RAND_CHOICE_EDEFAULT : newRandChoice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzingOperationsPackage.VALUE_RANGE__RAND_CHOICE, oldRandChoice, randChoice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FuzzingOperationsPackage.VALUE_RANGE__RAND_CHOICE:
				return getRandChoice();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FuzzingOperationsPackage.VALUE_RANGE__RAND_CHOICE:
				setRandChoice((RandomValueFromSetChoice)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FuzzingOperationsPackage.VALUE_RANGE__RAND_CHOICE:
				setRandChoice(RAND_CHOICE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FuzzingOperationsPackage.VALUE_RANGE__RAND_CHOICE:
				return randChoice != RAND_CHOICE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (randChoice: ");
		result.append(randChoice);
		result.append(')');
		return result.toString();
	}

} //ValueRangeImpl
