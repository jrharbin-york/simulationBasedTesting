/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ROSVariableConfiguration;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.XMLConfigLocation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ROS Variable Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.ROSVariableConfigurationImpl#getLaunchFileloc <em>Launch Fileloc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ROSVariableConfigurationImpl extends SimVariableConfigurationImpl implements ROSVariableConfiguration {
	/**
	 * The cached value of the '{@link #getLaunchFileloc() <em>Launch Fileloc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaunchFileloc()
	 * @generated
	 * @ordered
	 */
	protected XMLConfigLocation launchFileloc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROSVariableConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MRSPackagePackage.Literals.ROS_VARIABLE_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLConfigLocation getLaunchFileloc() {
		return launchFileloc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLaunchFileloc(XMLConfigLocation newLaunchFileloc, NotificationChain msgs) {
		XMLConfigLocation oldLaunchFileloc = launchFileloc;
		launchFileloc = newLaunchFileloc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MRSPackagePackage.ROS_VARIABLE_CONFIGURATION__LAUNCH_FILELOC, oldLaunchFileloc, newLaunchFileloc);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLaunchFileloc(XMLConfigLocation newLaunchFileloc) {
		if (newLaunchFileloc != launchFileloc) {
			NotificationChain msgs = null;
			if (launchFileloc != null)
				msgs = ((InternalEObject)launchFileloc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MRSPackagePackage.ROS_VARIABLE_CONFIGURATION__LAUNCH_FILELOC, null, msgs);
			if (newLaunchFileloc != null)
				msgs = ((InternalEObject)newLaunchFileloc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MRSPackagePackage.ROS_VARIABLE_CONFIGURATION__LAUNCH_FILELOC, null, msgs);
			msgs = basicSetLaunchFileloc(newLaunchFileloc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRSPackagePackage.ROS_VARIABLE_CONFIGURATION__LAUNCH_FILELOC, newLaunchFileloc, newLaunchFileloc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MRSPackagePackage.ROS_VARIABLE_CONFIGURATION__LAUNCH_FILELOC:
				return basicSetLaunchFileloc(null, msgs);
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
			case MRSPackagePackage.ROS_VARIABLE_CONFIGURATION__LAUNCH_FILELOC:
				return getLaunchFileloc();
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
			case MRSPackagePackage.ROS_VARIABLE_CONFIGURATION__LAUNCH_FILELOC:
				setLaunchFileloc((XMLConfigLocation)newValue);
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
			case MRSPackagePackage.ROS_VARIABLE_CONFIGURATION__LAUNCH_FILELOC:
				setLaunchFileloc((XMLConfigLocation)null);
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
			case MRSPackagePackage.ROS_VARIABLE_CONFIGURATION__LAUNCH_FILELOC:
				return launchFileloc != null;
		}
		return super.eIsSet(featureID);
	}

} //ROSVariableConfigurationImpl
