/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixed NSGA Coverage Boosting Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FixedNSGACoverageBoostingStrategy#getUseBoostingOnceEveryGenerations <em>Use Boosting Once Every Generations</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FixedNSGACoverageBoostingStrategy#getUseBoostingOnceEveryIterations <em>Use Boosting Once Every Iterations</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage#getFixedNSGACoverageBoostingStrategy()
 * @model
 * @generated
 */
public interface FixedNSGACoverageBoostingStrategy extends CoverageBoostingStrategy {
	/**
	 * Returns the value of the '<em><b>Use Boosting Once Every Generations</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Boosting Once Every Generations</em>' attribute.
	 * @see #setUseBoostingOnceEveryGenerations(int)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage#getFixedNSGACoverageBoostingStrategy_UseBoostingOnceEveryGenerations()
	 * @model default="2"
	 * @generated
	 */
	int getUseBoostingOnceEveryGenerations();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FixedNSGACoverageBoostingStrategy#getUseBoostingOnceEveryGenerations <em>Use Boosting Once Every Generations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Boosting Once Every Generations</em>' attribute.
	 * @see #getUseBoostingOnceEveryGenerations()
	 * @generated
	 */
	void setUseBoostingOnceEveryGenerations(int value);

	/**
	 * Returns the value of the '<em><b>Use Boosting Once Every Iterations</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Boosting Once Every Iterations</em>' attribute.
	 * @see #setUseBoostingOnceEveryIterations(int)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage#getFixedNSGACoverageBoostingStrategy_UseBoostingOnceEveryIterations()
	 * @model default="2"
	 * @generated
	 */
	int getUseBoostingOnceEveryIterations();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FixedNSGACoverageBoostingStrategy#getUseBoostingOnceEveryIterations <em>Use Boosting Once Every Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Boosting Once Every Iterations</em>' attribute.
	 * @see #getUseBoostingOnceEveryIterations()
	 * @generated
	 */
	void setUseBoostingOnceEveryIterations(int value);

} // FixedNSGACoverageBoostingStrategy
