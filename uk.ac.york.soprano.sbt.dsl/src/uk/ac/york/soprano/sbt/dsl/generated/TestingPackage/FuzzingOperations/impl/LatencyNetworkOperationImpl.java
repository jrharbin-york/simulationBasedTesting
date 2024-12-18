/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.DoubleRange;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperationsPackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.LatencyNetworkOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Latency Network Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.LatencyNetworkOperationImpl#getLatency <em>Latency</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.LatencyNetworkOperationImpl#isRandomised <em>Randomised</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LatencyNetworkOperationImpl extends NetworkFuzzingOperationImpl implements LatencyNetworkOperation {
	/**
	 * The cached value of the '{@link #getLatency() <em>Latency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatency()
	 * @generated
	 * @ordered
	 */
	protected DoubleRange latency;

	/**
	 * The default value of the '{@link #isRandomised() <em>Randomised</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRandomised()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RANDOMISED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRandomised() <em>Randomised</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRandomised()
	 * @generated
	 * @ordered
	 */
	protected boolean randomised = RANDOMISED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LatencyNetworkOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FuzzingOperationsPackage.Literals.LATENCY_NETWORK_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleRange getLatency() {
		return latency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLatency(DoubleRange newLatency, NotificationChain msgs) {
		DoubleRange oldLatency = latency;
		latency = newLatency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FuzzingOperationsPackage.LATENCY_NETWORK_OPERATION__LATENCY, oldLatency, newLatency);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatency(DoubleRange newLatency) {
		if (newLatency != latency) {
			NotificationChain msgs = null;
			if (latency != null)
				msgs = ((InternalEObject)latency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FuzzingOperationsPackage.LATENCY_NETWORK_OPERATION__LATENCY, null, msgs);
			if (newLatency != null)
				msgs = ((InternalEObject)newLatency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FuzzingOperationsPackage.LATENCY_NETWORK_OPERATION__LATENCY, null, msgs);
			msgs = basicSetLatency(newLatency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzingOperationsPackage.LATENCY_NETWORK_OPERATION__LATENCY, newLatency, newLatency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRandomised() {
		return randomised;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRandomised(boolean newRandomised) {
		boolean oldRandomised = randomised;
		randomised = newRandomised;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzingOperationsPackage.LATENCY_NETWORK_OPERATION__RANDOMISED, oldRandomised, randomised));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FuzzingOperationsPackage.LATENCY_NETWORK_OPERATION__LATENCY:
				return basicSetLatency(null, msgs);
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
			case FuzzingOperationsPackage.LATENCY_NETWORK_OPERATION__LATENCY:
				return getLatency();
			case FuzzingOperationsPackage.LATENCY_NETWORK_OPERATION__RANDOMISED:
				return isRandomised();
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
			case FuzzingOperationsPackage.LATENCY_NETWORK_OPERATION__LATENCY:
				setLatency((DoubleRange)newValue);
				return;
			case FuzzingOperationsPackage.LATENCY_NETWORK_OPERATION__RANDOMISED:
				setRandomised((Boolean)newValue);
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
			case FuzzingOperationsPackage.LATENCY_NETWORK_OPERATION__LATENCY:
				setLatency((DoubleRange)null);
				return;
			case FuzzingOperationsPackage.LATENCY_NETWORK_OPERATION__RANDOMISED:
				setRandomised(RANDOMISED_EDEFAULT);
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
			case FuzzingOperationsPackage.LATENCY_NETWORK_OPERATION__LATENCY:
				return latency != null;
			case FuzzingOperationsPackage.LATENCY_NETWORK_OPERATION__RANDOMISED:
				return randomised != RANDOMISED_EDEFAULT;
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
		result.append(" (randomised: ");
		result.append(randomised);
		result.append(')');
		return result.toString();
	}

} //LatencyNetworkOperationImpl
