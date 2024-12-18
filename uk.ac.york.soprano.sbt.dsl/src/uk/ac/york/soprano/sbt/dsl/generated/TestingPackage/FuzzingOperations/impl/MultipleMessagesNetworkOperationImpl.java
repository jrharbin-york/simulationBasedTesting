/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperationsPackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.IntRange;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.MultipleMessagesNetworkOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiple Messages Network Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.MultipleMessagesNetworkOperationImpl#getHowManyClones <em>How Many Clones</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultipleMessagesNetworkOperationImpl extends NetworkFuzzingOperationImpl implements MultipleMessagesNetworkOperation {
	/**
	 * The cached value of the '{@link #getHowManyClones() <em>How Many Clones</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHowManyClones()
	 * @generated
	 * @ordered
	 */
	protected IntRange howManyClones;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultipleMessagesNetworkOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FuzzingOperationsPackage.Literals.MULTIPLE_MESSAGES_NETWORK_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntRange getHowManyClones() {
		return howManyClones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHowManyClones(IntRange newHowManyClones, NotificationChain msgs) {
		IntRange oldHowManyClones = howManyClones;
		howManyClones = newHowManyClones;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FuzzingOperationsPackage.MULTIPLE_MESSAGES_NETWORK_OPERATION__HOW_MANY_CLONES, oldHowManyClones, newHowManyClones);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHowManyClones(IntRange newHowManyClones) {
		if (newHowManyClones != howManyClones) {
			NotificationChain msgs = null;
			if (howManyClones != null)
				msgs = ((InternalEObject)howManyClones).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FuzzingOperationsPackage.MULTIPLE_MESSAGES_NETWORK_OPERATION__HOW_MANY_CLONES, null, msgs);
			if (newHowManyClones != null)
				msgs = ((InternalEObject)newHowManyClones).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FuzzingOperationsPackage.MULTIPLE_MESSAGES_NETWORK_OPERATION__HOW_MANY_CLONES, null, msgs);
			msgs = basicSetHowManyClones(newHowManyClones, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzingOperationsPackage.MULTIPLE_MESSAGES_NETWORK_OPERATION__HOW_MANY_CLONES, newHowManyClones, newHowManyClones));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FuzzingOperationsPackage.MULTIPLE_MESSAGES_NETWORK_OPERATION__HOW_MANY_CLONES:
				return basicSetHowManyClones(null, msgs);
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
			case FuzzingOperationsPackage.MULTIPLE_MESSAGES_NETWORK_OPERATION__HOW_MANY_CLONES:
				return getHowManyClones();
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
			case FuzzingOperationsPackage.MULTIPLE_MESSAGES_NETWORK_OPERATION__HOW_MANY_CLONES:
				setHowManyClones((IntRange)newValue);
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
			case FuzzingOperationsPackage.MULTIPLE_MESSAGES_NETWORK_OPERATION__HOW_MANY_CLONES:
				setHowManyClones((IntRange)null);
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
			case FuzzingOperationsPackage.MULTIPLE_MESSAGES_NETWORK_OPERATION__HOW_MANY_CLONES:
				return howManyClones != null;
		}
		return super.eIsSet(featureID);
	}

} //MultipleMessagesNetworkOperationImpl
