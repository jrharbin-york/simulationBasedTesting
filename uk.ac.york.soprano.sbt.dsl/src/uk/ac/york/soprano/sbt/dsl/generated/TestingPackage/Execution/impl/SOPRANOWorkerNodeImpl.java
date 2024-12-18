/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionPackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.SOPRANOWorkerNode;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.WorkerOS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SOPRANO Worker Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.SOPRANOWorkerNodeImpl#getIpAddress <em>Ip Address</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.SOPRANOWorkerNodeImpl#getWorkerOS <em>Worker OS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SOPRANOWorkerNodeImpl extends ExecutionTargetImpl implements SOPRANOWorkerNode {
	/**
	 * The default value of the '{@link #getIpAddress() <em>Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIpAddress() <em>Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpAddress()
	 * @generated
	 * @ordered
	 */
	protected String ipAddress = IP_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorkerOS() <em>Worker OS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkerOS()
	 * @generated
	 * @ordered
	 */
	protected static final WorkerOS WORKER_OS_EDEFAULT = WorkerOS.LINUX;

	/**
	 * The cached value of the '{@link #getWorkerOS() <em>Worker OS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkerOS()
	 * @generated
	 * @ordered
	 */
	protected WorkerOS workerOS = WORKER_OS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SOPRANOWorkerNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.SOPRANO_WORKER_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIpAddress() {
		return ipAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIpAddress(String newIpAddress) {
		String oldIpAddress = ipAddress;
		ipAddress = newIpAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.SOPRANO_WORKER_NODE__IP_ADDRESS, oldIpAddress, ipAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkerOS getWorkerOS() {
		return workerOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkerOS(WorkerOS newWorkerOS) {
		WorkerOS oldWorkerOS = workerOS;
		workerOS = newWorkerOS == null ? WORKER_OS_EDEFAULT : newWorkerOS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.SOPRANO_WORKER_NODE__WORKER_OS, oldWorkerOS, workerOS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExecutionPackage.SOPRANO_WORKER_NODE__IP_ADDRESS:
				return getIpAddress();
			case ExecutionPackage.SOPRANO_WORKER_NODE__WORKER_OS:
				return getWorkerOS();
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
			case ExecutionPackage.SOPRANO_WORKER_NODE__IP_ADDRESS:
				setIpAddress((String)newValue);
				return;
			case ExecutionPackage.SOPRANO_WORKER_NODE__WORKER_OS:
				setWorkerOS((WorkerOS)newValue);
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
			case ExecutionPackage.SOPRANO_WORKER_NODE__IP_ADDRESS:
				setIpAddress(IP_ADDRESS_EDEFAULT);
				return;
			case ExecutionPackage.SOPRANO_WORKER_NODE__WORKER_OS:
				setWorkerOS(WORKER_OS_EDEFAULT);
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
			case ExecutionPackage.SOPRANO_WORKER_NODE__IP_ADDRESS:
				return IP_ADDRESS_EDEFAULT == null ? ipAddress != null : !IP_ADDRESS_EDEFAULT.equals(ipAddress);
			case ExecutionPackage.SOPRANO_WORKER_NODE__WORKER_OS:
				return workerOS != WORKER_OS_EDEFAULT;
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
		result.append(" (ipAddress: ");
		result.append(ipAddress);
		result.append(", workerOS: ");
		result.append(workerOS);
		result.append(')');
		return result.toString();
	}

} //SOPRANOWorkerNodeImpl
