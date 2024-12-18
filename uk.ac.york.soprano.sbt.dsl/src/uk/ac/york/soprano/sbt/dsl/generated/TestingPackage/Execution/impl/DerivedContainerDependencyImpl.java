/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ContainerDependency;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.DerivedContainerDependency;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Derived Container Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.DerivedContainerDependencyImpl#getBase <em>Base</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DerivedContainerDependencyImpl extends DependencyImpl implements DerivedContainerDependency {
	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected ContainerDependency base;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DerivedContainerDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.DERIVED_CONTAINER_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerDependency getBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBase(ContainerDependency newBase, NotificationChain msgs) {
		ContainerDependency oldBase = base;
		base = newBase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutionPackage.DERIVED_CONTAINER_DEPENDENCY__BASE, oldBase, newBase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase(ContainerDependency newBase) {
		if (newBase != base) {
			NotificationChain msgs = null;
			if (base != null)
				msgs = ((InternalEObject)base).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutionPackage.DERIVED_CONTAINER_DEPENDENCY__BASE, null, msgs);
			if (newBase != null)
				msgs = ((InternalEObject)newBase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutionPackage.DERIVED_CONTAINER_DEPENDENCY__BASE, null, msgs);
			msgs = basicSetBase(newBase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.DERIVED_CONTAINER_DEPENDENCY__BASE, newBase, newBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExecutionPackage.DERIVED_CONTAINER_DEPENDENCY__BASE:
				return basicSetBase(null, msgs);
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
			case ExecutionPackage.DERIVED_CONTAINER_DEPENDENCY__BASE:
				return getBase();
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
			case ExecutionPackage.DERIVED_CONTAINER_DEPENDENCY__BASE:
				setBase((ContainerDependency)newValue);
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
			case ExecutionPackage.DERIVED_CONTAINER_DEPENDENCY__BASE:
				setBase((ContainerDependency)null);
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
			case ExecutionPackage.DERIVED_CONTAINER_DEPENDENCY__BASE:
				return base != null;
		}
		return super.eIsSet(featureID);
	}

} //DerivedContainerDependencyImpl
