/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage;

import org.eclipse.emf.ecore.EObject;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.Dependency;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ConfigLocation#getRoot <em>Root</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage#getConfigLocation()
 * @model abstract="true"
 * @generated
 */
public interface ConfigLocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' reference.
	 * @see #setRoot(Dependency)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage#getConfigLocation_Root()
	 * @model required="true"
	 * @generated
	 */
	Dependency getRoot();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ConfigLocation#getRoot <em>Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(Dependency value);

} // ConfigLocation
