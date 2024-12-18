/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.Dependency;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.SimVariableConfiguration;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Simulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simulator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.SimulatorImpl#getVarConfigs <em>Var Configs</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.SimulatorImpl#getSimulationDependency <em>Simulation Dependency</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SimulatorImpl extends MinimalEObjectImpl.Container implements Simulator {
	/**
	 * The cached value of the '{@link #getVarConfigs() <em>Var Configs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarConfigs()
	 * @generated
	 * @ordered
	 */
	protected EList<SimVariableConfiguration> varConfigs;

	/**
	 * The cached value of the '{@link #getSimulationDependency() <em>Simulation Dependency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationDependency()
	 * @generated
	 * @ordered
	 */
	protected Dependency simulationDependency;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimulatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MRSPackagePackage.Literals.SIMULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimVariableConfiguration> getVarConfigs() {
		if (varConfigs == null) {
			varConfigs = new EObjectContainmentEList<SimVariableConfiguration>(SimVariableConfiguration.class, this, MRSPackagePackage.SIMULATOR__VAR_CONFIGS);
		}
		return varConfigs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency getSimulationDependency() {
		if (simulationDependency != null && simulationDependency.eIsProxy()) {
			InternalEObject oldSimulationDependency = (InternalEObject)simulationDependency;
			simulationDependency = (Dependency)eResolveProxy(oldSimulationDependency);
			if (simulationDependency != oldSimulationDependency) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MRSPackagePackage.SIMULATOR__SIMULATION_DEPENDENCY, oldSimulationDependency, simulationDependency));
			}
		}
		return simulationDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency basicGetSimulationDependency() {
		return simulationDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimulationDependency(Dependency newSimulationDependency) {
		Dependency oldSimulationDependency = simulationDependency;
		simulationDependency = newSimulationDependency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRSPackagePackage.SIMULATOR__SIMULATION_DEPENDENCY, oldSimulationDependency, simulationDependency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MRSPackagePackage.SIMULATOR__VAR_CONFIGS:
				return ((InternalEList<?>)getVarConfigs()).basicRemove(otherEnd, msgs);
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
			case MRSPackagePackage.SIMULATOR__VAR_CONFIGS:
				return getVarConfigs();
			case MRSPackagePackage.SIMULATOR__SIMULATION_DEPENDENCY:
				if (resolve) return getSimulationDependency();
				return basicGetSimulationDependency();
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
			case MRSPackagePackage.SIMULATOR__VAR_CONFIGS:
				getVarConfigs().clear();
				getVarConfigs().addAll((Collection<? extends SimVariableConfiguration>)newValue);
				return;
			case MRSPackagePackage.SIMULATOR__SIMULATION_DEPENDENCY:
				setSimulationDependency((Dependency)newValue);
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
			case MRSPackagePackage.SIMULATOR__VAR_CONFIGS:
				getVarConfigs().clear();
				return;
			case MRSPackagePackage.SIMULATOR__SIMULATION_DEPENDENCY:
				setSimulationDependency((Dependency)null);
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
			case MRSPackagePackage.SIMULATOR__VAR_CONFIGS:
				return varConfigs != null && !varConfigs.isEmpty();
			case MRSPackagePackage.SIMULATOR__SIMULATION_DEPENDENCY:
				return simulationDependency != null;
		}
		return super.eIsSet(featureID);
	}

} //SimulatorImpl
