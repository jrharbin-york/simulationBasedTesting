/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.StandardGrammar;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.Metric;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contains Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.StandardGrammar.ContainsVariable#getMetric <em>Metric</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.StandardGrammar.StandardGrammarPackage#getContainsVariable()
 * @model
 * @generated
 */
public interface ContainsVariable extends ConditionConstraint {
	/**
	 * Returns the value of the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' reference.
	 * @see #setMetric(Metric)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.StandardGrammar.StandardGrammarPackage#getContainsVariable_Metric()
	 * @model required="true"
	 * @generated
	 */
	Metric getMetric();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.StandardGrammar.ContainsVariable#getMetric <em>Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' reference.
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(Metric value);

} // ContainsVariable
