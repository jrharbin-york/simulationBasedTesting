/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.EventBasedVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.Metric#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.Metric#getDir <em>Dir</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.Metric#getRelatedVariables <em>Related Variables</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.Metric#getValueIfNotReceived <em>Value If Not Received</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.Metric#getInitValue <em>Init Value</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.Metric#isUseInOptimisation <em>Use In Optimisation</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.MetricsPackage#getMetric()
 * @model abstract="true"
 * @generated
 */
public interface Metric extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.MetricsPackage#getMetric_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.Metric#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Dir</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.MetricOptimisationDirection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dir</em>' attribute.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.MetricOptimisationDirection
	 * @see #setDir(MetricOptimisationDirection)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.MetricsPackage#getMetric_Dir()
	 * @model
	 * @generated
	 */
	MetricOptimisationDirection getDir();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.Metric#getDir <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir</em>' attribute.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.MetricOptimisationDirection
	 * @see #getDir()
	 * @generated
	 */
	void setDir(MetricOptimisationDirection value);

	/**
	 * Returns the value of the '<em><b>Related Variables</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.EventBasedVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Variables</em>' reference list.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.MetricsPackage#getMetric_RelatedVariables()
	 * @model
	 * @generated
	 */
	EList<EventBasedVariable> getRelatedVariables();

	/**
	 * Returns the value of the '<em><b>Value If Not Received</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value If Not Received</em>' containment reference.
	 * @see #setValueIfNotReceived(MetricDefault)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.MetricsPackage#getMetric_ValueIfNotReceived()
	 * @model containment="true"
	 * @generated
	 */
	MetricDefault getValueIfNotReceived();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.Metric#getValueIfNotReceived <em>Value If Not Received</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value If Not Received</em>' containment reference.
	 * @see #getValueIfNotReceived()
	 * @generated
	 */
	void setValueIfNotReceived(MetricDefault value);

	/**
	 * Returns the value of the '<em><b>Init Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Value</em>' containment reference.
	 * @see #setInitValue(MetricDefault)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.MetricsPackage#getMetric_InitValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MetricDefault getInitValue();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.Metric#getInitValue <em>Init Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Value</em>' containment reference.
	 * @see #getInitValue()
	 * @generated
	 */
	void setInitValue(MetricDefault value);

	/**
	 * Returns the value of the '<em><b>Use In Optimisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use In Optimisation</em>' attribute.
	 * @see #setUseInOptimisation(boolean)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.MetricsPackage#getMetric_UseInOptimisation()
	 * @model
	 * @generated
	 */
	boolean isUseInOptimisation();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.Metric#isUseInOptimisation <em>Use In Optimisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use In Optimisation</em>' attribute.
	 * @see #isUseInOptimisation()
	 * @generated
	 */
	void setUseInOptimisation(boolean value);

} // Metric
