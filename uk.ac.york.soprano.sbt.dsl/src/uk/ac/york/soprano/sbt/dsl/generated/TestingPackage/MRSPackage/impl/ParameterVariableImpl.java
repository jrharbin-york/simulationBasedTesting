/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ParameterVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.ParameterVariableImpl#getComponentName <em>Component Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterVariableImpl extends DynamicVariableImpl implements ParameterVariable {
	/**
	 * The default value of the '{@link #getComponentName() <em>Component Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentName()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponentName() <em>Component Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentName()
	 * @generated
	 * @ordered
	 */
	protected String componentName = COMPONENT_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MRSPackagePackage.Literals.PARAMETER_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComponentName() {
		return componentName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentName(String newComponentName) {
		String oldComponentName = componentName;
		componentName = newComponentName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRSPackagePackage.PARAMETER_VARIABLE__COMPONENT_NAME, oldComponentName, componentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MRSPackagePackage.PARAMETER_VARIABLE__COMPONENT_NAME:
				return getComponentName();
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
			case MRSPackagePackage.PARAMETER_VARIABLE__COMPONENT_NAME:
				setComponentName((String)newValue);
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
			case MRSPackagePackage.PARAMETER_VARIABLE__COMPONENT_NAME:
				setComponentName(COMPONENT_NAME_EDEFAULT);
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
			case MRSPackagePackage.PARAMETER_VARIABLE__COMPONENT_NAME:
				return COMPONENT_NAME_EDEFAULT == null ? componentName != null : !COMPONENT_NAME_EDEFAULT.equals(componentName);
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
		result.append(" (componentName: ");
		result.append(componentName);
		result.append(')');
		return result.toString();
	}

} //ParameterVariableImpl
