/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FixedNSGACoverageBoostingStrategy;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fixed NSGA Coverage Boosting Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.FixedNSGACoverageBoostingStrategyImpl#getUseBoostingOnceEveryGenerations <em>Use Boosting Once Every Generations</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.FixedNSGACoverageBoostingStrategyImpl#getUseBoostingOnceEveryIterations <em>Use Boosting Once Every Iterations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FixedNSGACoverageBoostingStrategyImpl extends CoverageBoostingStrategyImpl implements FixedNSGACoverageBoostingStrategy {
	/**
	 * The default value of the '{@link #getUseBoostingOnceEveryGenerations() <em>Use Boosting Once Every Generations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseBoostingOnceEveryGenerations()
	 * @generated
	 * @ordered
	 */
	protected static final int USE_BOOSTING_ONCE_EVERY_GENERATIONS_EDEFAULT = 2;

	/**
	 * The cached value of the '{@link #getUseBoostingOnceEveryGenerations() <em>Use Boosting Once Every Generations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseBoostingOnceEveryGenerations()
	 * @generated
	 * @ordered
	 */
	protected int useBoostingOnceEveryGenerations = USE_BOOSTING_ONCE_EVERY_GENERATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseBoostingOnceEveryIterations() <em>Use Boosting Once Every Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseBoostingOnceEveryIterations()
	 * @generated
	 * @ordered
	 */
	protected static final int USE_BOOSTING_ONCE_EVERY_ITERATIONS_EDEFAULT = 2;

	/**
	 * The cached value of the '{@link #getUseBoostingOnceEveryIterations() <em>Use Boosting Once Every Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseBoostingOnceEveryIterations()
	 * @generated
	 * @ordered
	 */
	protected int useBoostingOnceEveryIterations = USE_BOOSTING_ONCE_EVERY_ITERATIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FixedNSGACoverageBoostingStrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestingPackagePackage.Literals.FIXED_NSGA_COVERAGE_BOOSTING_STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUseBoostingOnceEveryGenerations() {
		return useBoostingOnceEveryGenerations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseBoostingOnceEveryGenerations(int newUseBoostingOnceEveryGenerations) {
		int oldUseBoostingOnceEveryGenerations = useBoostingOnceEveryGenerations;
		useBoostingOnceEveryGenerations = newUseBoostingOnceEveryGenerations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestingPackagePackage.FIXED_NSGA_COVERAGE_BOOSTING_STRATEGY__USE_BOOSTING_ONCE_EVERY_GENERATIONS, oldUseBoostingOnceEveryGenerations, useBoostingOnceEveryGenerations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUseBoostingOnceEveryIterations() {
		return useBoostingOnceEveryIterations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseBoostingOnceEveryIterations(int newUseBoostingOnceEveryIterations) {
		int oldUseBoostingOnceEveryIterations = useBoostingOnceEveryIterations;
		useBoostingOnceEveryIterations = newUseBoostingOnceEveryIterations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestingPackagePackage.FIXED_NSGA_COVERAGE_BOOSTING_STRATEGY__USE_BOOSTING_ONCE_EVERY_ITERATIONS, oldUseBoostingOnceEveryIterations, useBoostingOnceEveryIterations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestingPackagePackage.FIXED_NSGA_COVERAGE_BOOSTING_STRATEGY__USE_BOOSTING_ONCE_EVERY_GENERATIONS:
				return getUseBoostingOnceEveryGenerations();
			case TestingPackagePackage.FIXED_NSGA_COVERAGE_BOOSTING_STRATEGY__USE_BOOSTING_ONCE_EVERY_ITERATIONS:
				return getUseBoostingOnceEveryIterations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TestingPackagePackage.FIXED_NSGA_COVERAGE_BOOSTING_STRATEGY__USE_BOOSTING_ONCE_EVERY_GENERATIONS:
				setUseBoostingOnceEveryGenerations((Integer)newValue);
				return;
			case TestingPackagePackage.FIXED_NSGA_COVERAGE_BOOSTING_STRATEGY__USE_BOOSTING_ONCE_EVERY_ITERATIONS:
				setUseBoostingOnceEveryIterations((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TestingPackagePackage.FIXED_NSGA_COVERAGE_BOOSTING_STRATEGY__USE_BOOSTING_ONCE_EVERY_GENERATIONS:
				setUseBoostingOnceEveryGenerations(USE_BOOSTING_ONCE_EVERY_GENERATIONS_EDEFAULT);
				return;
			case TestingPackagePackage.FIXED_NSGA_COVERAGE_BOOSTING_STRATEGY__USE_BOOSTING_ONCE_EVERY_ITERATIONS:
				setUseBoostingOnceEveryIterations(USE_BOOSTING_ONCE_EVERY_ITERATIONS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TestingPackagePackage.FIXED_NSGA_COVERAGE_BOOSTING_STRATEGY__USE_BOOSTING_ONCE_EVERY_GENERATIONS:
				return useBoostingOnceEveryGenerations != USE_BOOSTING_ONCE_EVERY_GENERATIONS_EDEFAULT;
			case TestingPackagePackage.FIXED_NSGA_COVERAGE_BOOSTING_STRATEGY__USE_BOOSTING_ONCE_EVERY_ITERATIONS:
				return useBoostingOnceEveryIterations != USE_BOOSTING_ONCE_EVERY_ITERATIONS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (useBoostingOnceEveryGenerations: ");
		result.append(useBoostingOnceEveryGenerations);
		result.append(", useBoostingOnceEveryIterations: ");
		result.append(useBoostingOnceEveryIterations);
		result.append(')');
		return result.toString();
	}
	
	/**
	 * JRH implemented code
	 */
	public boolean elementShouldUseCoverageBoosting(int i, int genNum, int boostingCountThisGeneration) {
		if ((genNum % useBoostingOnceEveryGenerations) == 0) {
			return ((i % useBoostingOnceEveryIterations)) == 0;
		} else {
			return false;
		}
	}

} //FixedNSGACoverageBoostingStrategyImpl
