/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.EventBasedVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.VariableMetric#getChosenVariable <em>Chosen Variable</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.MetricsPackage#getVariableMetric()
 * @model
 * @generated
 */
public interface VariableMetric extends Metric {
	/**
	 * Returns the value of the '<em><b>Chosen Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chosen Variable</em>' reference.
	 * @see #setChosenVariable(EventBasedVariable)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.MetricsPackage#getVariableMetric_ChosenVariable()
	 * @model required="true"
	 * @generated
	 */
	EventBasedVariable getChosenVariable();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.VariableMetric#getChosenVariable <em>Chosen Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chosen Variable</em>' reference.
	 * @see #getChosenVariable()
	 * @generated
	 */
	void setChosenVariable(EventBasedVariable value);

} // VariableMetric
