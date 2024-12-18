/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.DynamicVariable;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.SimVariableConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sim Variable Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.SimVariableConfigurationImpl#getVar <em>Var</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SimVariableConfigurationImpl extends MinimalEObjectImpl.Container implements SimVariableConfiguration {
	/**
	 * The cached value of the '{@link #getVar() <em>Var</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVar()
	 * @generated
	 * @ordered
	 */
	protected DynamicVariable var;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimVariableConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MRSPackagePackage.Literals.SIM_VARIABLE_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicVariable getVar() {
		if (var != null && var.eIsProxy()) {
			InternalEObject oldVar = (InternalEObject)var;
			var = (DynamicVariable)eResolveProxy(oldVar);
			if (var != oldVar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MRSPackagePackage.SIM_VARIABLE_CONFIGURATION__VAR, oldVar, var));
			}
		}
		return var;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicVariable basicGetVar() {
		return var;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVar(DynamicVariable newVar) {
		DynamicVariable oldVar = var;
		var = newVar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRSPackagePackage.SIM_VARIABLE_CONFIGURATION__VAR, oldVar, var));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MRSPackagePackage.SIM_VARIABLE_CONFIGURATION__VAR:
				if (resolve) return getVar();
				return basicGetVar();
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
			case MRSPackagePackage.SIM_VARIABLE_CONFIGURATION__VAR:
				setVar((DynamicVariable)newValue);
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
			case MRSPackagePackage.SIM_VARIABLE_CONFIGURATION__VAR:
				setVar((DynamicVariable)null);
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
			case MRSPackagePackage.SIM_VARIABLE_CONFIGURATION__VAR:
				return var != null;
		}
		return super.eIsSet(featureID);
	}

} //SimVariableConfigurationImpl
