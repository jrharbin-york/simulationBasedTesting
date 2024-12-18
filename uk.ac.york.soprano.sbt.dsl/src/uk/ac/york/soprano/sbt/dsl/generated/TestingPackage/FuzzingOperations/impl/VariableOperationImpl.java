/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperationsPackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.VariableOperation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.GenericVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.VariableOperationImpl#getVariableToAffect <em>Variable To Affect</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class VariableOperationImpl extends FuzzingOperationImpl implements VariableOperation {
	/**
	 * The cached value of the '{@link #getVariableToAffect() <em>Variable To Affect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableToAffect()
	 * @generated
	 * @ordered
	 */
	protected GenericVariable variableToAffect;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FuzzingOperationsPackage.Literals.VARIABLE_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericVariable getVariableToAffect() {
		if (variableToAffect != null && variableToAffect.eIsProxy()) {
			InternalEObject oldVariableToAffect = (InternalEObject)variableToAffect;
			variableToAffect = (GenericVariable)eResolveProxy(oldVariableToAffect);
			if (variableToAffect != oldVariableToAffect) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FuzzingOperationsPackage.VARIABLE_OPERATION__VARIABLE_TO_AFFECT, oldVariableToAffect, variableToAffect));
			}
		}
		return variableToAffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericVariable basicGetVariableToAffect() {
		return variableToAffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableToAffect(GenericVariable newVariableToAffect) {
		GenericVariable oldVariableToAffect = variableToAffect;
		variableToAffect = newVariableToAffect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzingOperationsPackage.VARIABLE_OPERATION__VARIABLE_TO_AFFECT, oldVariableToAffect, variableToAffect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FuzzingOperationsPackage.VARIABLE_OPERATION__VARIABLE_TO_AFFECT:
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
			case FuzzingOperationsPackage.VARIABLE_OPERATION__VARIABLE_TO_AFFECT:
				setVariableToAffect((GenericVariable)newValue);
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
			case FuzzingOperationsPackage.VARIABLE_OPERATION__VARIABLE_TO_AFFECT:
				setVariableToAffect((GenericVariable)null);
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
			case FuzzingOperationsPackage.VARIABLE_OPERATION__VARIABLE_TO_AFFECT:
				return variableToAffect != null;
		}
		return super.eIsSet(featureID);
	}

} //VariableOperationImpl
