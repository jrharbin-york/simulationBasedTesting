/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sim Variable Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.SimVariableConfiguration#getVar <em>Var</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage#getSimVariableConfiguration()
 * @model abstract="true"
 * @generated
 */
public interface SimVariableConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var</em>' reference.
	 * @see #setVar(DynamicVariable)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage#getSimVariableConfiguration_Var()
	 * @model required="true"
	 * @generated
	 */
	DynamicVariable getVar();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.SimVariableConfiguration#getVar <em>Var</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var</em>' reference.
	 * @see #getVar()
	 * @generated
	 */
	void setVar(DynamicVariable value);

} // SimVariableConfiguration
