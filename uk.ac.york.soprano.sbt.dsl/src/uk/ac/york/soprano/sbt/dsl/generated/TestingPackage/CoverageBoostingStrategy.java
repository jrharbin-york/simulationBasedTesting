/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coverage Boosting Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage#getCoverageBoostingStrategy()
 * @model abstract="true"
 * @generated
 */
public interface CoverageBoostingStrategy extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean elementShouldUseCoverageBoosting(int i, int genNum, int boostingCountThisGeneration);

} // CoverageBoostingStrategy
