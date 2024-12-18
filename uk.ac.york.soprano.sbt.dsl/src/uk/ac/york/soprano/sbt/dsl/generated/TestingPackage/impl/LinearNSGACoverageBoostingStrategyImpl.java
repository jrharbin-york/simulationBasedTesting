/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.LinearNSGACoverageBoostingStrategy;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linear NSGA Coverage Boosting Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.LinearNSGACoverageBoostingStrategyImpl#getUseBoostingOnceEveryGenerations <em>Use Boosting Once Every Generations</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.LinearNSGACoverageBoostingStrategyImpl#getStartingBoostingCount <em>Starting Boosting Count</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.LinearNSGACoverageBoostingStrategyImpl#getEndingBoostingCount <em>Ending Boosting Count</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.LinearNSGACoverageBoostingStrategyImpl#getCountDropEveryGeneration <em>Count Drop Every Generation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinearNSGACoverageBoostingStrategyImpl extends CoverageBoostingStrategyImpl implements LinearNSGACoverageBoostingStrategy {
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
	 * The default value of the '{@link #getStartingBoostingCount() <em>Starting Boosting Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingBoostingCount()
	 * @generated
	 * @ordered
	 */
	protected static final int STARTING_BOOSTING_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStartingBoostingCount() <em>Starting Boosting Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingBoostingCount()
	 * @generated
	 * @ordered
	 */
	protected int startingBoostingCount = STARTING_BOOSTING_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndingBoostingCount() <em>Ending Boosting Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndingBoostingCount()
	 * @generated
	 * @ordered
	 */
	protected static final int ENDING_BOOSTING_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEndingBoostingCount() <em>Ending Boosting Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndingBoostingCount()
	 * @generated
	 * @ordered
	 */
	protected int endingBoostingCount = ENDING_BOOSTING_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountDropEveryGeneration() <em>Count Drop Every Generation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountDropEveryGeneration()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNT_DROP_EVERY_GENERATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCountDropEveryGeneration() <em>Count Drop Every Generation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountDropEveryGeneration()
	 * @generated
	 * @ordered
	 */
	protected int countDropEveryGeneration = COUNT_DROP_EVERY_GENERATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinearNSGACoverageBoostingStrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestingPackagePackage.Literals.LINEAR_NSGA_COVERAGE_BOOSTING_STRATEGY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestingPackagePackage.LINEAR_NSGA_COVERAGE_BOOSTING_STRATEGY__USE_BOOSTING_ONCE_EVERY_GENERATIONS, oldUseBoostingOnceEveryGenerations, useBoostingOnceEveryGenerations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStartingBoostingCount() {
		return startingBoostingCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartingBoostingCount(int newStartingBoostingCount) {
		int oldStartingBoostingCount = startingBoostingCount;
		startingBoostingCount = newStartingBoostingCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestingPackagePackage.LINEAR_NSGA_COVERAGE_BOOSTING_STRATEGY__STARTING_BOOSTING_COUNT, oldStartingBoostingCount, startingBoostingCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEndingBoostingCount() {
		return endingBoostingCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndingBoostingCount(int newEndingBoostingCount) {
		int oldEndingBoostingCount = endingBoostingCount;
		endingBoostingCount = newEndingBoostingCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestingPackagePackage.LINEAR_NSGA_COVERAGE_BOOSTING_STRATEGY__ENDING_BOOSTING_COUNT, oldEndingBoostingCount, endingBoostingCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCountDropEveryGeneration() {
		return countDropEveryGeneration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountDropEveryGeneration(int newCountDropEveryGeneration) {
		int oldCountDropEveryGeneration = countDropEveryGeneration;
		countDropEveryGeneration = newCountDropEveryGeneration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestingPackagePackage.LINEAR_NSGA_COVERAGE_BOOSTING_STRATEGY__COUNT_DROP_EVERY_GENERATION, oldCountDropEveryGeneration, countDropEveryGeneration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestingPackagePackage.LINEAR_NSGA_COVERAGE_BOOSTING_STRATEGY__USE_BOOSTING_ONCE_EVERY_GENERATIONS:
				return getUseBoostingOnceEveryGenerations();
			case TestingPackagePackage.LINEAR_NSGA_COVERAGE_BOOSTING_STRATEGY__STARTING_BOOSTING_COUNT:
				return getStartingBoostingCount();
			case TestingPackagePackage.LINEAR_NSGA_COVERAGE_BOOSTING_STRATEGY__ENDING_BOOSTING_COUNT:
				return getEndingBoostingCount();
			case TestingPackagePackage.LINEAR_NSGA_COVERAGE_BOOSTING_STRATEGY__COUNT_DROP_EVERY_GENERATION:
				return getCountDropEveryGeneration();
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
			case TestingPackagePackage.LINEAR_NSGA_COVERAGE_BOOSTING_STRATEGY__USE_BOOSTING_ONCE_EVERY_GENERATIONS:
				setUseBoostingOnceEveryGenerations((Integer)newValue);
				return;
			case TestingPackagePackage.LINEAR_NSGA_COVERAGE_BOOSTING_STRATEGY__STARTING_BOOSTING_COUNT:
				setStartingBoostingCount((Integer)newValue);
				return;
			case TestingPackagePackage.LINEAR_NSGA_COVERAGE_BOOSTING_STRATEGY__ENDING_BOOSTING_COUNT:
				setEndingBoostingCount((Integer)newValue);
				return;
			case TestingPackagePackage.LINEAR_NSGA_COVERAGE_BOOSTING_STRATEGY__COUNT_DROP_EVERY_GENERATION:
				setCountDropEveryGeneration((Integer)newValue);
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
			case TestingPackagePackage.LINEAR_NSGA_COVERAGE_BOOSTING_STRATEGY__USE_BOOSTING_ONCE_EVERY_GENERATIONS:
				setUseBoostingOnceEveryGenerations(USE_BOOSTING_ONCE_EVERY_GENERATIONS_EDEFAULT);
				return;
			case TestingPackagePackage.LINEAR_NSGA_COVERAGE_BOOSTING_STRATEGY__STARTING_BOOSTING_COUNT:
				setStartingBoostingCount(STARTING_BOOSTING_COUNT_EDEFAULT);
				return;
			case TestingPackagePackage.LINEAR_NSGA_COVERAGE_BOOSTING_STRATEGY__ENDING_BOOSTING_COUNT:
				setEndingBoostingCount(ENDING_BOOSTING_COUNT_EDEFAULT);
				return;
			case TestingPackagePackage.LINEAR_NSGA_COVERAGE_BOOSTING_STRATEGY__COUNT_DROP_EVERY_GENERATION:
				setCountDropEveryGeneration(COUNT_DROP_EVERY_GENERATION_EDEFAULT);
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
			case TestingPackagePackage.LINEAR_NSGA_COVERAGE_BOOSTING_STRATEGY__USE_BOOSTING_ONCE_EVERY_GENERATIONS:
				return useBoostingOnceEveryGenerations != USE_BOOSTING_ONCE_EVERY_GENERATIONS_EDEFAULT;
			case TestingPackagePackage.LINEAR_NSGA_COVERAGE_BOOSTING_STRATEGY__STARTING_BOOSTING_COUNT:
				return startingBoostingCount != STARTING_BOOSTING_COUNT_EDEFAULT;
			case TestingPackagePackage.LINEAR_NSGA_COVERAGE_BOOSTING_STRATEGY__ENDING_BOOSTING_COUNT:
				return endingBoostingCount != ENDING_BOOSTING_COUNT_EDEFAULT;
			case TestingPackagePackage.LINEAR_NSGA_COVERAGE_BOOSTING_STRATEGY__COUNT_DROP_EVERY_GENERATION:
				return countDropEveryGeneration != COUNT_DROP_EVERY_GENERATION_EDEFAULT;
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
		result.append(", startingBoostingCount: ");
		result.append(startingBoostingCount);
		result.append(", endingBoostingCount: ");
		result.append(endingBoostingCount);
		result.append(", countDropEveryGeneration: ");
		result.append(countDropEveryGeneration);
		result.append(')');
		return result.toString();
	}
	
	@Override
	/*
	 * JRH: custom code for linear boosting decline
	 */
	public boolean elementShouldUseCoverageBoosting(int i, int genNum, int boostingCountThisGeneration) {
		int dynamicBoostingThisGen = startingBoostingCount;
		
		// We only want to decrement the boosting count for every generation when boosting is active
		dynamicBoostingThisGen = startingBoostingCount - (genNum / useBoostingOnceEveryGenerations) * countDropEveryGeneration;
				
		// Ensure it does not drop below endingBoostingCount
		dynamicBoostingThisGen = Math.max(endingBoostingCount, dynamicBoostingThisGen);

		if ((genNum % useBoostingOnceEveryGenerations) == 0) {
			// Only do boosting for the dynamic number of boosting elements
			System.out.println("coverageBoostingDebug: genNum = " + genNum + " - boostingCountThisGeneration = " + dynamicBoostingThisGen);
			return (boostingCountThisGeneration < dynamicBoostingThisGen);
		} else {
			return false;
		}
	}

} //LinearNSGACoverageBoostingStrategyImpl
