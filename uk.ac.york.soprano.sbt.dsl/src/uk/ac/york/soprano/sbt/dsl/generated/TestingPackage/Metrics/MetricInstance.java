/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics;

import org.eclipse.emf.ecore.EObject;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Results.Result;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metric Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.MetricInstance#getMetric <em>Metric</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.MetricInstance#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.MetricsPackage#getMetricInstance()
 * @model
 * @generated
 */
public interface MetricInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' reference.
	 * @see #setMetric(Metric)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.MetricsPackage#getMetricInstance_Metric()
	 * @model required="true"
	 * @generated
	 */
	Metric getMetric();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.MetricInstance#getMetric <em>Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' reference.
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(Metric value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(Result)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.MetricsPackage#getMetricInstance_Result()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Result getResult();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.MetricInstance#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(Result value);

} // MetricInstance
