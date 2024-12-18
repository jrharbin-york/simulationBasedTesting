/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ComponentProperty;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.PropertyMetric#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.MetricsPackage#getPropertyMetric()
 * @model abstract="true"
 * @generated
 */
public interface PropertyMetric extends Metric {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(ComponentProperty)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.MetricsPackage#getPropertyMetric_Property()
	 * @model required="true"
	 * @generated
	 */
	ComponentProperty getProperty();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.PropertyMetric#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(ComponentProperty value);

} // PropertyMetric
