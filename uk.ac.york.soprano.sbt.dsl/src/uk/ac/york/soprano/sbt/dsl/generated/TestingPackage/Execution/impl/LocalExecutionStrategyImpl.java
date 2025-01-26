/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionPackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.LocalExecutionStrategy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Execution Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.LocalExecutionStrategyImpl#getLaunchFileLocation <em>Launch File Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocalExecutionStrategyImpl extends ExecutionStrategyImpl implements LocalExecutionStrategy {
	/**
	 * The default value of the '{@link #getLaunchFileLocation() <em>Launch File Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaunchFileLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LAUNCH_FILE_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLaunchFileLocation() <em>Launch File Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaunchFileLocation()
	 * @generated
	 * @ordered
	 */
	protected String launchFileLocation = LAUNCH_FILE_LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalExecutionStrategyImpl() {
		super();
	}
	
    /**
    @generated NOT
    */
    @Override
    public boolean isDistributed() {
            return false;
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.LOCAL_EXECUTION_STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLaunchFileLocation() {
		return launchFileLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLaunchFileLocation(String newLaunchFileLocation) {
		String oldLaunchFileLocation = launchFileLocation;
		launchFileLocation = newLaunchFileLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.LOCAL_EXECUTION_STRATEGY__LAUNCH_FILE_LOCATION, oldLaunchFileLocation, launchFileLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExecutionPackage.LOCAL_EXECUTION_STRATEGY__LAUNCH_FILE_LOCATION:
				return getLaunchFileLocation();
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
			case ExecutionPackage.LOCAL_EXECUTION_STRATEGY__LAUNCH_FILE_LOCATION:
				setLaunchFileLocation((String)newValue);
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
			case ExecutionPackage.LOCAL_EXECUTION_STRATEGY__LAUNCH_FILE_LOCATION:
				setLaunchFileLocation(LAUNCH_FILE_LOCATION_EDEFAULT);
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
			case ExecutionPackage.LOCAL_EXECUTION_STRATEGY__LAUNCH_FILE_LOCATION:
				return LAUNCH_FILE_LOCATION_EDEFAULT == null ? launchFileLocation != null : !LAUNCH_FILE_LOCATION_EDEFAULT.equals(launchFileLocation);
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
		result.append(" (launchFileLocation: ");
		result.append(launchFileLocation);
		result.append(')');
		return result.toString();
	}

} //LocalExecutionStrategyImpl
