/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.Metric;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Campaign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign#getMetrics <em>Metrics</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign#getConditionMetrics <em>Condition Metrics</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign#getActivationGeneration <em>Activation Generation</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign#getIncludedOperations <em>Included Operations</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign#getApproach <em>Approach</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign#getPerformedTests <em>Performed Tests</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign#getResultSets <em>Result Sets</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign#getEndTrigger <em>End Trigger</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage#getTestCampaign()
 * @model
 * @generated
 */
public interface TestCampaign extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage#getTestCampaign_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Metrics</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.Metric}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metrics</em>' reference list.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage#getTestCampaign_Metrics()
	 * @model
	 * @generated
	 */
	EList<Metric> getMetrics();

	/**
	 * Returns the value of the '<em><b>Condition Metrics</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.Metric}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Metrics</em>' reference list.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage#getTestCampaign_ConditionMetrics()
	 * @model
	 * @generated
	 */
	EList<Metric> getConditionMetrics();

	/**
	 * Returns the value of the '<em><b>Activation Generation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Generation</em>' containment reference.
	 * @see #setActivationGeneration(ActivationGenerationMethod)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage#getTestCampaign_ActivationGeneration()
	 * @model containment="true"
	 * @generated
	 */
	ActivationGenerationMethod getActivationGeneration();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign#getActivationGeneration <em>Activation Generation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation Generation</em>' containment reference.
	 * @see #getActivationGeneration()
	 * @generated
	 */
	void setActivationGeneration(ActivationGenerationMethod value);

	/**
	 * Returns the value of the '<em><b>Included Operations</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Included Operations</em>' reference list.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage#getTestCampaign_IncludedOperations()
	 * @model
	 * @generated
	 */
	EList<FuzzingOperation> getIncludedOperations();

	/**
	 * Returns the value of the '<em><b>Approach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approach</em>' containment reference.
	 * @see #setApproach(TestGenerationApproach)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage#getTestCampaign_Approach()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TestGenerationApproach getApproach();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign#getApproach <em>Approach</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approach</em>' containment reference.
	 * @see #getApproach()
	 * @generated
	 */
	void setApproach(TestGenerationApproach value);

	/**
	 * Returns the value of the '<em><b>Performed Tests</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test}.
	 * It is bidirectional and its opposite is '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test#getParentCampaign <em>Parent Campaign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performed Tests</em>' containment reference list.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage#getTestCampaign_PerformedTests()
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test#getParentCampaign
	 * @model opposite="parentCampaign" containment="true"
	 * @generated
	 */
	EList<Test> getPerformedTests();

	/**
	 * Returns the value of the '<em><b>Result Sets</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.CampaignResultSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Sets</em>' containment reference list.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage#getTestCampaign_ResultSets()
	 * @model containment="true"
	 * @generated
	 */
	EList<CampaignResultSet> getResultSets();

	/**
	 * Returns the value of the '<em><b>End Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Trigger</em>' containment reference.
	 * @see #setEndTrigger(ExecutionEndTrigger)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage#getTestCampaign_EndTrigger()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExecutionEndTrigger getEndTrigger();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign#getEndTrigger <em>End Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Trigger</em>' containment reference.
	 * @see #getEndTrigger()
	 * @generated
	 */
	void setEndTrigger(ExecutionEndTrigger value);

} // TestCampaign
