/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NSGA With Coverage Cells</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.NSGAWithCoverageCells#getCoveragePerCell <em>Coverage Per Cell</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.NSGAWithCoverageCells#getTargetCoverageProportion <em>Target Coverage Proportion</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.NSGAWithCoverageCells#getDimensionRecords <em>Dimension Records</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.NSGAWithCoverageCells#getCoverageBoostingStrategy <em>Coverage Boosting Strategy</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage#getNSGAWithCoverageCells()
 * @model
 * @generated
 */
public interface NSGAWithCoverageCells extends NSGAEvolutionaryAlgorithm {
	/**
	 * Returns the value of the '<em><b>Coverage Per Cell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coverage Per Cell</em>' attribute.
	 * @see #setCoveragePerCell(int)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage#getNSGAWithCoverageCells_CoveragePerCell()
	 * @model
	 * @generated
	 */
	int getCoveragePerCell();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.NSGAWithCoverageCells#getCoveragePerCell <em>Coverage Per Cell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage Per Cell</em>' attribute.
	 * @see #getCoveragePerCell()
	 * @generated
	 */
	void setCoveragePerCell(int value);

	/**
	 * Returns the value of the '<em><b>Target Coverage Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Coverage Proportion</em>' attribute.
	 * @see #setTargetCoverageProportion(double)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage#getNSGAWithCoverageCells_TargetCoverageProportion()
	 * @model
	 * @generated
	 */
	double getTargetCoverageProportion();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.NSGAWithCoverageCells#getTargetCoverageProportion <em>Target Coverage Proportion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Coverage Proportion</em>' attribute.
	 * @see #getTargetCoverageProportion()
	 * @generated
	 */
	void setTargetCoverageProportion(double value);

	/**
	 * Returns the value of the '<em><b>Dimension Records</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.DimensionInterval}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension Records</em>' containment reference list.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage#getNSGAWithCoverageCells_DimensionRecords()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DimensionInterval> getDimensionRecords();

	/**
	 * Returns the value of the '<em><b>Coverage Boosting Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coverage Boosting Strategy</em>' containment reference.
	 * @see #setCoverageBoostingStrategy(CoverageBoostingStrategy)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage#getNSGAWithCoverageCells_CoverageBoostingStrategy()
	 * @model containment="true"
	 * @generated
	 */
	CoverageBoostingStrategy getCoverageBoostingStrategy();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.NSGAWithCoverageCells#getCoverageBoostingStrategy <em>Coverage Boosting Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage Boosting Strategy</em>' containment reference.
	 * @see #getCoverageBoostingStrategy()
	 * @generated
	 */
	void setCoverageBoostingStrategy(CoverageBoostingStrategy value);

} // NSGAWithCoverageCells
