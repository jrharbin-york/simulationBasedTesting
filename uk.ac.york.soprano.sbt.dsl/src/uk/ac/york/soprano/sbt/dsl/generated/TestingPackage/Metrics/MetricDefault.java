/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metric Default</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.MetricDefault#getDefaultVal <em>Default Val</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.MetricsPackage#getMetricDefault()
 * @model
 * @generated
 */
public interface MetricDefault extends EObject {
	/**
	 * Returns the value of the '<em><b>Default Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Val</em>' attribute.
	 * @see #setDefaultVal(double)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.MetricsPackage#getMetricDefault_DefaultVal()
	 * @model
	 * @generated
	 */
	double getDefaultVal();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.MetricDefault#getDefaultVal <em>Default Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Val</em>' attribute.
	 * @see #getDefaultVal()
	 * @generated
	 */
	void setDefaultVal(double value);

} // MetricDefault
