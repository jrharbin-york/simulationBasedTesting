/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linear NSGA Coverage Boosting Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.LinearNSGACoverageBoostingStrategy#getUseBoostingOnceEveryGenerations <em>Use Boosting Once Every Generations</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.LinearNSGACoverageBoostingStrategy#getStartingBoostingCount <em>Starting Boosting Count</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.LinearNSGACoverageBoostingStrategy#getEndingBoostingCount <em>Ending Boosting Count</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.LinearNSGACoverageBoostingStrategy#getCountDropEveryGeneration <em>Count Drop Every Generation</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage#getLinearNSGACoverageBoostingStrategy()
 * @model
 * @generated
 */
public interface LinearNSGACoverageBoostingStrategy extends CoverageBoostingStrategy {
	/**
	 * Returns the value of the '<em><b>Use Boosting Once Every Generations</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Boosting Once Every Generations</em>' attribute.
	 * @see #setUseBoostingOnceEveryGenerations(int)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage#getLinearNSGACoverageBoostingStrategy_UseBoostingOnceEveryGenerations()
	 * @model default="2"
	 * @generated
	 */
	int getUseBoostingOnceEveryGenerations();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.LinearNSGACoverageBoostingStrategy#getUseBoostingOnceEveryGenerations <em>Use Boosting Once Every Generations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Boosting Once Every Generations</em>' attribute.
	 * @see #getUseBoostingOnceEveryGenerations()
	 * @generated
	 */
	void setUseBoostingOnceEveryGenerations(int value);

	/**
	 * Returns the value of the '<em><b>Starting Boosting Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starting Boosting Count</em>' attribute.
	 * @see #setStartingBoostingCount(int)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage#getLinearNSGACoverageBoostingStrategy_StartingBoostingCount()
	 * @model
	 * @generated
	 */
	int getStartingBoostingCount();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.LinearNSGACoverageBoostingStrategy#getStartingBoostingCount <em>Starting Boosting Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starting Boosting Count</em>' attribute.
	 * @see #getStartingBoostingCount()
	 * @generated
	 */
	void setStartingBoostingCount(int value);

	/**
	 * Returns the value of the '<em><b>Ending Boosting Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ending Boosting Count</em>' attribute.
	 * @see #setEndingBoostingCount(int)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage#getLinearNSGACoverageBoostingStrategy_EndingBoostingCount()
	 * @model
	 * @generated
	 */
	int getEndingBoostingCount();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.LinearNSGACoverageBoostingStrategy#getEndingBoostingCount <em>Ending Boosting Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ending Boosting Count</em>' attribute.
	 * @see #getEndingBoostingCount()
	 * @generated
	 */
	void setEndingBoostingCount(int value);

	/**
	 * Returns the value of the '<em><b>Count Drop Every Generation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count Drop Every Generation</em>' attribute.
	 * @see #setCountDropEveryGeneration(int)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage#getLinearNSGACoverageBoostingStrategy_CountDropEveryGeneration()
	 * @model
	 * @generated
	 */
	int getCountDropEveryGeneration();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.LinearNSGACoverageBoostingStrategy#getCountDropEveryGeneration <em>Count Drop Every Generation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count Drop Every Generation</em>' attribute.
	 * @see #getCountDropEveryGeneration()
	 * @generated
	 */
	void setCountDropEveryGeneration(int value);

} // LinearNSGACoverageBoostingStrategy
