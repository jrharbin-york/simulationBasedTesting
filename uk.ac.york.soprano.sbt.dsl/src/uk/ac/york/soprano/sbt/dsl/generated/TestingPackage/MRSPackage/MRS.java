/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionStrategy;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MRS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS#getVariables <em>Variables</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS#getLaunchDelaySeconds <em>Launch Delay Seconds</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS#getLaunchFileLocation <em>Launch File Location</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS#getCustomTerminateFileLocation <em>Custom Terminate File Location</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS#getRecordFileLocation <em>Record File Location</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS#getNodes <em>Nodes</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS#getSimulator <em>Simulator</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS#getPropertyType <em>Property Type</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS#getExecStrategy <em>Exec Strategy</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage#getMRS()
 * @model
 * @generated
 */
public interface MRS extends EObject {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.GenericVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage#getMRS_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<GenericVariable> getVariables();

	/**
	 * Returns the value of the '<em><b>Launch Delay Seconds</b></em>' attribute.
	 * The default value is <code>"40"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Launch Delay Seconds</em>' attribute.
	 * @see #setLaunchDelaySeconds(int)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage#getMRS_LaunchDelaySeconds()
	 * @model default="40"
	 * @generated
	 */
	int getLaunchDelaySeconds();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS#getLaunchDelaySeconds <em>Launch Delay Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Launch Delay Seconds</em>' attribute.
	 * @see #getLaunchDelaySeconds()
	 * @generated
	 */
	void setLaunchDelaySeconds(int value);

	/**
	 * Returns the value of the '<em><b>Launch File Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Launch File Location</em>' attribute.
	 * @see #setLaunchFileLocation(String)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage#getMRS_LaunchFileLocation()
	 * @model
	 * @generated
	 */
	String getLaunchFileLocation();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS#getLaunchFileLocation <em>Launch File Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Launch File Location</em>' attribute.
	 * @see #getLaunchFileLocation()
	 * @generated
	 */
	void setLaunchFileLocation(String value);

	/**
	 * Returns the value of the '<em><b>Custom Terminate File Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Terminate File Location</em>' attribute.
	 * @see #setCustomTerminateFileLocation(String)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage#getMRS_CustomTerminateFileLocation()
	 * @model
	 * @generated
	 */
	String getCustomTerminateFileLocation();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS#getCustomTerminateFileLocation <em>Custom Terminate File Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Terminate File Location</em>' attribute.
	 * @see #getCustomTerminateFileLocation()
	 * @generated
	 */
	void setCustomTerminateFileLocation(String value);

	/**
	 * Returns the value of the '<em><b>Record File Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record File Location</em>' attribute.
	 * @see #setRecordFileLocation(String)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage#getMRS_RecordFileLocation()
	 * @model
	 * @generated
	 */
	String getRecordFileLocation();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS#getRecordFileLocation <em>Record File Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record File Location</em>' attribute.
	 * @see #getRecordFileLocation()
	 * @generated
	 */
	void setRecordFileLocation(String value);

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage#getMRS_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Simulator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulator</em>' containment reference.
	 * @see #setSimulator(Simulator)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage#getMRS_Simulator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Simulator getSimulator();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS#getSimulator <em>Simulator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simulator</em>' containment reference.
	 * @see #getSimulator()
	 * @generated
	 */
	void setSimulator(Simulator value);

	/**
	 * Returns the value of the '<em><b>Property Type</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Type</em>' containment reference list.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage#getMRS_PropertyType()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getPropertyType();

	/**
	 * Returns the value of the '<em><b>Exec Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exec Strategy</em>' containment reference.
	 * @see #setExecStrategy(ExecutionStrategy)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage#getMRS_ExecStrategy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExecutionStrategy getExecStrategy();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS#getExecStrategy <em>Exec Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exec Strategy</em>' containment reference.
	 * @see #getExecStrategy()
	 * @generated
	 */
	void setExecStrategy(ExecutionStrategy value);

} // MRS
