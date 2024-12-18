/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ROS Variable Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ROSVariableConfiguration#getLaunchFileloc <em>Launch Fileloc</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage#getROSVariableConfiguration()
 * @model
 * @generated
 */
public interface ROSVariableConfiguration extends SimVariableConfiguration {
	/**
	 * Returns the value of the '<em><b>Launch Fileloc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Launch Fileloc</em>' containment reference.
	 * @see #setLaunchFileloc(XMLConfigLocation)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage#getROSVariableConfiguration_LaunchFileloc()
	 * @model containment="true" required="true"
	 * @generated
	 */
	XMLConfigLocation getLaunchFileloc();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ROSVariableConfiguration#getLaunchFileloc <em>Launch Fileloc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Launch Fileloc</em>' containment reference.
	 * @see #getLaunchFileloc()
	 * @generated
	 */
	void setLaunchFileloc(XMLConfigLocation value);

} // ROSVariableConfiguration
