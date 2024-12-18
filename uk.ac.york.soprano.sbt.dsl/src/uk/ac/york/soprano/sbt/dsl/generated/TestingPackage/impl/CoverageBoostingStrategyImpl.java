/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.CoverageBoostingStrategy;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coverage Boosting Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class CoverageBoostingStrategyImpl extends MinimalEObjectImpl.Container implements CoverageBoostingStrategy {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoverageBoostingStrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestingPackagePackage.Literals.COVERAGE_BOOSTING_STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean elementShouldUseCoverageBoosting(int i, int genNum, int boostingCountThisGeneration) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TestingPackagePackage.COVERAGE_BOOSTING_STRATEGY___ELEMENT_SHOULD_USE_COVERAGE_BOOSTING__INT_INT_INT:
				return elementShouldUseCoverageBoosting((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CoverageBoostingStrategyImpl
