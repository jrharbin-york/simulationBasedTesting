/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.Dependency;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simulator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Simulator#getVarConfigs <em>Var Configs</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Simulator#getSimulationDependency <em>Simulation Dependency</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage#getSimulator()
 * @model abstract="true"
 * @generated
 */
public interface Simulator extends EObject {
	/**
	 * Returns the value of the '<em><b>Var Configs</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.SimVariableConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Configs</em>' containment reference list.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage#getSimulator_VarConfigs()
	 * @model containment="true"
	 * @generated
	 */
	EList<SimVariableConfiguration> getVarConfigs();

	/**
	 * Returns the value of the '<em><b>Simulation Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulation Dependency</em>' reference.
	 * @see #setSimulationDependency(Dependency)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage#getSimulator_SimulationDependency()
	 * @model
	 * @generated
	 */
	Dependency getSimulationDependency();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Simulator#getSimulationDependency <em>Simulation Dependency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simulation Dependency</em>' reference.
	 * @see #getSimulationDependency()
	 * @generated
	 */
	void setSimulationDependency(Dependency value);

} // Simulator
