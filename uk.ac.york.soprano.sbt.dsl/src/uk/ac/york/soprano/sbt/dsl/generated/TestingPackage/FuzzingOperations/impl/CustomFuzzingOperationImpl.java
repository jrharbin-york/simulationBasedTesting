/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.CustomFuzzingOperation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperationsPackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ValueSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Fuzzing Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.CustomFuzzingOperationImpl#getParams <em>Params</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.CustomFuzzingOperationImpl#getCustomProcessClass <em>Custom Process Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomFuzzingOperationImpl extends VariableOperationImpl implements CustomFuzzingOperation {
	/**
	 * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParams()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSet> params;

	/**
	 * The default value of the '{@link #getCustomProcessClass() <em>Custom Process Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomProcessClass()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_PROCESS_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomProcessClass() <em>Custom Process Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomProcessClass()
	 * @generated
	 * @ordered
	 */
	protected String customProcessClass = CUSTOM_PROCESS_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomFuzzingOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FuzzingOperationsPackage.Literals.CUSTOM_FUZZING_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSet> getParams() {
		if (params == null) {
			params = new EObjectContainmentEList<ValueSet>(ValueSet.class, this, FuzzingOperationsPackage.CUSTOM_FUZZING_OPERATION__PARAMS);
		}
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomProcessClass() {
		return customProcessClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomProcessClass(String newCustomProcessClass) {
		String oldCustomProcessClass = customProcessClass;
		customProcessClass = newCustomProcessClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzingOperationsPackage.CUSTOM_FUZZING_OPERATION__CUSTOM_PROCESS_CLASS, oldCustomProcessClass, customProcessClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FuzzingOperationsPackage.CUSTOM_FUZZING_OPERATION__PARAMS:
				return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FuzzingOperationsPackage.CUSTOM_FUZZING_OPERATION__PARAMS:
				return getParams();
			case FuzzingOperationsPackage.CUSTOM_FUZZING_OPERATION__CUSTOM_PROCESS_CLASS:
				return getCustomProcessClass();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FuzzingOperationsPackage.CUSTOM_FUZZING_OPERATION__PARAMS:
				getParams().clear();
				getParams().addAll((Collection<? extends ValueSet>)newValue);
				return;
			case FuzzingOperationsPackage.CUSTOM_FUZZING_OPERATION__CUSTOM_PROCESS_CLASS:
				setCustomProcessClass((String)newValue);
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
			case FuzzingOperationsPackage.CUSTOM_FUZZING_OPERATION__PARAMS:
				getParams().clear();
				return;
			case FuzzingOperationsPackage.CUSTOM_FUZZING_OPERATION__CUSTOM_PROCESS_CLASS:
				setCustomProcessClass(CUSTOM_PROCESS_CLASS_EDEFAULT);
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
			case FuzzingOperationsPackage.CUSTOM_FUZZING_OPERATION__PARAMS:
				return params != null && !params.isEmpty();
			case FuzzingOperationsPackage.CUSTOM_FUZZING_OPERATION__CUSTOM_PROCESS_CLASS:
				return CUSTOM_PROCESS_CLASS_EDEFAULT == null ? customProcessClass != null : !CUSTOM_PROCESS_CLASS_EDEFAULT.equals(customProcessClass);
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
		result.append(" (customProcessClass: ");
		result.append(customProcessClass);
		result.append(')');
		return result.toString();
	}

} //CustomFuzzingOperationImpl
