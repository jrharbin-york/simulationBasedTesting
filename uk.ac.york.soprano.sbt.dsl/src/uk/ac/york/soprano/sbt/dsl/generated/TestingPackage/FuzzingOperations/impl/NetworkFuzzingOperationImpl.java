/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperationsPackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.NetworkFuzzingOperation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.EventBasedVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Fuzzing Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.NetworkFuzzingOperationImpl#getVariableToAffect <em>Variable To Affect</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NetworkFuzzingOperationImpl extends FuzzingOperationImpl implements NetworkFuzzingOperation {
	/**
	 * The cached value of the '{@link #getVariableToAffect() <em>Variable To Affect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableToAffect()
	 * @generated
	 * @ordered
	 */
	protected EventBasedVariable variableToAffect;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkFuzzingOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FuzzingOperationsPackage.Literals.NETWORK_FUZZING_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventBasedVariable getVariableToAffect() {
		if (variableToAffect != null && variableToAffect.eIsProxy()) {
			InternalEObject oldVariableToAffect = (InternalEObject)variableToAffect;
			variableToAffect = (EventBasedVariable)eResolveProxy(oldVariableToAffect);
			if (variableToAffect != oldVariableToAffect) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FuzzingOperationsPackage.NETWORK_FUZZING_OPERATION__VARIABLE_TO_AFFECT, oldVariableToAffect, variableToAffect));
			}
		}
		return variableToAffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventBasedVariable basicGetVariableToAffect() {
		return variableToAffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableToAffect(EventBasedVariable newVariableToAffect) {
		EventBasedVariable oldVariableToAffect = variableToAffect;
		variableToAffect = newVariableToAffect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzingOperationsPackage.NETWORK_FUZZING_OPERATION__VARIABLE_TO_AFFECT, oldVariableToAffect, variableToAffect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FuzzingOperationsPackage.NETWORK_FUZZING_OPERATION__VARIABLE_TO_AFFECT:
				if (resolve) return getVariableToAffect();
				return basicGetVariableToAffect();
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
			case FuzzingOperationsPackage.NETWORK_FUZZING_OPERATION__VARIABLE_TO_AFFECT:
				setVariableToAffect((EventBasedVariable)newValue);
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
			case FuzzingOperationsPackage.NETWORK_FUZZING_OPERATION__VARIABLE_TO_AFFECT:
				setVariableToAffect((EventBasedVariable)null);
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
			case FuzzingOperationsPackage.NETWORK_FUZZING_OPERATION__VARIABLE_TO_AFFECT:
				return variableToAffect != null;
		}
		return super.eIsSet(featureID);
	}

} //NetworkFuzzingOperationImpl
