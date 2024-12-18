/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.MetricInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test#getOperations <em>Operations</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test#getMetrics <em>Metrics</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test#getDevelopedFrom <em>Developed From</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test#getParentCampaign <em>Parent Campaign</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test#getDebugFlags <em>Debug Flags</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage#getTest()
 * @model
 * @generated
 */
public interface Test extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage#getTest_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation}.
	 * It is bidirectional and its opposite is '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation#getContainingTest <em>Containing Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage#getTest_Operations()
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation#getContainingTest
	 * @model opposite="containingTest" containment="true"
	 * @generated
	 */
	EList<FuzzingOperation> getOperations();

	/**
	 * Returns the value of the '<em><b>Metrics</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.MetricInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metrics</em>' containment reference list.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage#getTest_Metrics()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetricInstance> getMetrics();

	/**
	 * Returns the value of the '<em><b>Developed From</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Developed From</em>' reference list.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage#getTest_DevelopedFrom()
	 * @model
	 * @generated
	 */
	EList<Test> getDevelopedFrom();

	/**
	 * Returns the value of the '<em><b>Parent Campaign</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign#getPerformedTests <em>Performed Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Campaign</em>' container reference.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage#getTest_ParentCampaign()
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign#getPerformedTests
	 * @model opposite="performedTests" required="true" changeable="false"
	 * @generated
	 */
	TestCampaign getParentCampaign();

	/**
	 * Returns the value of the '<em><b>Debug Flags</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestDebuggingFlags}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debug Flags</em>' containment reference list.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage#getTest_DebugFlags()
	 * @model containment="true"
	 * @generated
	 */
	EList<TestDebuggingFlags> getDebugFlags();

} // Test
