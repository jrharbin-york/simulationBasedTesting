/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.AllocationStrategy;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.Dependency;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.DistributedExecutionStrategy;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionPackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionTarget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distributed Execution Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.DistributedExecutionStrategyImpl#isAutomaticWorkerDetection <em>Automatic Worker Detection</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.DistributedExecutionStrategyImpl#getExptRunnerIP <em>Expt Runner IP</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.DistributedExecutionStrategyImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.DistributedExecutionStrategyImpl#getExtraExecutionTargets <em>Extra Execution Targets</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.DistributedExecutionStrategyImpl#getAllocationStrategy <em>Allocation Strategy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DistributedExecutionStrategyImpl extends ExecutionStrategyImpl implements DistributedExecutionStrategy {
	/**
	 * The default value of the '{@link #isAutomaticWorkerDetection() <em>Automatic Worker Detection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutomaticWorkerDetection()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTOMATIC_WORKER_DETECTION_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAutomaticWorkerDetection() <em>Automatic Worker Detection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutomaticWorkerDetection()
	 * @generated
	 * @ordered
	 */
	protected boolean automaticWorkerDetection = AUTOMATIC_WORKER_DETECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getExptRunnerIP() <em>Expt Runner IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExptRunnerIP()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPT_RUNNER_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExptRunnerIP() <em>Expt Runner IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExptRunnerIP()
	 * @generated
	 * @ordered
	 */
	protected String exptRunnerIP = EXPT_RUNNER_IP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependency> dependencies;

	/**
	 * The cached value of the '{@link #getExtraExecutionTargets() <em>Extra Execution Targets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraExecutionTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutionTarget> extraExecutionTargets;

	/**
	 * The cached value of the '{@link #getAllocationStrategy() <em>Allocation Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationStrategy()
	 * @generated
	 * @ordered
	 */
	protected AllocationStrategy allocationStrategy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistributedExecutionStrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.DISTRIBUTED_EXECUTION_STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutomaticWorkerDetection() {
		return automaticWorkerDetection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutomaticWorkerDetection(boolean newAutomaticWorkerDetection) {
		boolean oldAutomaticWorkerDetection = automaticWorkerDetection;
		automaticWorkerDetection = newAutomaticWorkerDetection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.DISTRIBUTED_EXECUTION_STRATEGY__AUTOMATIC_WORKER_DETECTION, oldAutomaticWorkerDetection, automaticWorkerDetection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExptRunnerIP() {
		return exptRunnerIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExptRunnerIP(String newExptRunnerIP) {
		String oldExptRunnerIP = exptRunnerIP;
		exptRunnerIP = newExptRunnerIP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.DISTRIBUTED_EXECUTION_STRATEGY__EXPT_RUNNER_IP, oldExptRunnerIP, exptRunnerIP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependency> getDependencies() {
		if (dependencies == null) {
			dependencies = new EObjectContainmentEList<Dependency>(Dependency.class, this, ExecutionPackage.DISTRIBUTED_EXECUTION_STRATEGY__DEPENDENCIES);
		}
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutionTarget> getExtraExecutionTargets() {
		if (extraExecutionTargets == null) {
			extraExecutionTargets = new EObjectContainmentEList<ExecutionTarget>(ExecutionTarget.class, this, ExecutionPackage.DISTRIBUTED_EXECUTION_STRATEGY__EXTRA_EXECUTION_TARGETS);
		}
		return extraExecutionTargets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationStrategy getAllocationStrategy() {
		return allocationStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllocationStrategy(AllocationStrategy newAllocationStrategy, NotificationChain msgs) {
		AllocationStrategy oldAllocationStrategy = allocationStrategy;
		allocationStrategy = newAllocationStrategy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutionPackage.DISTRIBUTED_EXECUTION_STRATEGY__ALLOCATION_STRATEGY, oldAllocationStrategy, newAllocationStrategy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocationStrategy(AllocationStrategy newAllocationStrategy) {
		if (newAllocationStrategy != allocationStrategy) {
			NotificationChain msgs = null;
			if (allocationStrategy != null)
				msgs = ((InternalEObject)allocationStrategy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutionPackage.DISTRIBUTED_EXECUTION_STRATEGY__ALLOCATION_STRATEGY, null, msgs);
			if (newAllocationStrategy != null)
				msgs = ((InternalEObject)newAllocationStrategy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutionPackage.DISTRIBUTED_EXECUTION_STRATEGY__ALLOCATION_STRATEGY, null, msgs);
			msgs = basicSetAllocationStrategy(newAllocationStrategy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.DISTRIBUTED_EXECUTION_STRATEGY__ALLOCATION_STRATEGY, newAllocationStrategy, newAllocationStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExecutionPackage.DISTRIBUTED_EXECUTION_STRATEGY__DEPENDENCIES:
				return ((InternalEList<?>)getDependencies()).basicRemove(otherEnd, msgs);
			case ExecutionPackage.DISTRIBUTED_EXECUTION_STRATEGY__EXTRA_EXECUTION_TARGETS:
				return ((InternalEList<?>)getExtraExecutionTargets()).basicRemove(otherEnd, msgs);
			case ExecutionPackage.DISTRIBUTED_EXECUTION_STRATEGY__ALLOCATION_STRATEGY:
				return basicSetAllocationStrategy(null, msgs);
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
			case ExecutionPackage.DISTRIBUTED_EXECUTION_STRATEGY__AUTOMATIC_WORKER_DETECTION:
				return isAutomaticWorkerDetection();
			case ExecutionPackage.DISTRIBUTED_EXECUTION_STRATEGY__EXPT_RUNNER_IP:
				return getExptRunnerIP();
			case ExecutionPackage.DISTRIBUTED_EXECUTION_STRATEGY__DEPENDENCIES:
				return getDependencies();
			case ExecutionPackage.DISTRIBUTED_EXECUTION_STRATEGY__EXTRA_EXECUTION_TARGETS:
				return getExtraExecutionTargets();
			case ExecutionPackage.DISTRIBUTED_EXECUTION_STRATEGY__ALLOCATION_STRATEGY:
				return getAllocationStrategy();
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
			case ExecutionPackage.DISTRIBUTED_EXECUTION_STRATEGY__AUTOMATIC_WORKER_DETECTION:
				setAutomaticWorkerDetection((Boolean)newValue);
				return;
			case ExecutionPackage.DISTRIBUTED_EXECUTION_STRATEGY__EXPT_RUNNER_IP:
				setExptRunnerIP((String)newValue);
				return;
			case ExecutionPackage.DISTRIBUTED_EXECUTION_STRATEGY__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends Dependency>)newValue);
				return;
			case ExecutionPackage.DISTRIBUTED_EXECUTION_STRATEGY__EXTRA_EXECUTION_TARGETS:
				getExtraExecutionTargets().clear();
				getExtraExecutionTargets().addAll((Collection<? extends ExecutionTarget>)newValue);
				return;
			case ExecutionPackage.DISTRIBUTED_EXECUTION_STRATEGY__ALLOCATION_STRATEGY:
				setAllocationStrategy((AllocationStrategy)newValue);
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
			case ExecutionPackage.DISTRIBUTED_EXECUTION_STRATEGY__AUTOMATIC_WORKER_DETECTION:
				setAutomaticWorkerDetection(AUTOMATIC_WORKER_DETECTION_EDEFAULT);
				return;
			case ExecutionPackage.DISTRIBUTED_EXECUTION_STRATEGY__EXPT_RUNNER_IP:
				setExptRunnerIP(EXPT_RUNNER_IP_EDEFAULT);
				return;
			case ExecutionPackage.DISTRIBUTED_EXECUTION_STRATEGY__DEPENDENCIES:
				getDependencies().clear();
				return;
			case ExecutionPackage.DISTRIBUTED_EXECUTION_STRATEGY__EXTRA_EXECUTION_TARGETS:
				getExtraExecutionTargets().clear();
				return;
			case ExecutionPackage.DISTRIBUTED_EXECUTION_STRATEGY__ALLOCATION_STRATEGY:
				setAllocationStrategy((AllocationStrategy)null);
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
			case ExecutionPackage.DISTRIBUTED_EXECUTION_STRATEGY__AUTOMATIC_WORKER_DETECTION:
				return automaticWorkerDetection != AUTOMATIC_WORKER_DETECTION_EDEFAULT;
			case ExecutionPackage.DISTRIBUTED_EXECUTION_STRATEGY__EXPT_RUNNER_IP:
				return EXPT_RUNNER_IP_EDEFAULT == null ? exptRunnerIP != null : !EXPT_RUNNER_IP_EDEFAULT.equals(exptRunnerIP);
			case ExecutionPackage.DISTRIBUTED_EXECUTION_STRATEGY__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
			case ExecutionPackage.DISTRIBUTED_EXECUTION_STRATEGY__EXTRA_EXECUTION_TARGETS:
				return extraExecutionTargets != null && !extraExecutionTargets.isEmpty();
			case ExecutionPackage.DISTRIBUTED_EXECUTION_STRATEGY__ALLOCATION_STRATEGY:
				return allocationStrategy != null;
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
		result.append(" (automaticWorkerDetection: ");
		result.append(automaticWorkerDetection);
		result.append(", exptRunnerIP: ");
		result.append(exptRunnerIP);
		result.append(')');
		return result.toString();
	}

} //DistributedExecutionStrategyImpl
