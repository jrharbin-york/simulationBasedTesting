/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.Dependency;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ConfigLocation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.ConfigLocationImpl#getRoot <em>Root</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConfigLocationImpl extends MinimalEObjectImpl.Container implements ConfigLocation {
	/**
	 * The cached value of the '{@link #getRoot() <em>Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected Dependency root;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MRSPackagePackage.Literals.CONFIG_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency getRoot() {
		if (root != null && root.eIsProxy()) {
			InternalEObject oldRoot = (InternalEObject)root;
			root = (Dependency)eResolveProxy(oldRoot);
			if (root != oldRoot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MRSPackagePackage.CONFIG_LOCATION__ROOT, oldRoot, root));
			}
		}
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency basicGetRoot() {
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot(Dependency newRoot) {
		Dependency oldRoot = root;
		root = newRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRSPackagePackage.CONFIG_LOCATION__ROOT, oldRoot, root));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MRSPackagePackage.CONFIG_LOCATION__ROOT:
				if (resolve) return getRoot();
				return basicGetRoot();
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
			case MRSPackagePackage.CONFIG_LOCATION__ROOT:
				setRoot((Dependency)newValue);
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
			case MRSPackagePackage.CONFIG_LOCATION__ROOT:
				setRoot((Dependency)null);
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
			case MRSPackagePackage.CONFIG_LOCATION__ROOT:
				return root != null;
		}
		return super.eIsSet(featureID);
	}

} //ConfigLocationImpl
