/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestingPackageFactoryImpl extends EFactoryImpl implements TestingPackageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TestingPackageFactory init() {
		try {
			TestingPackageFactory theTestingPackageFactory = (TestingPackageFactory)EPackage.Registry.INSTANCE.getEFactory(TestingPackagePackage.eNS_URI);
			if (theTestingPackageFactory != null) {
				return theTestingPackageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TestingPackageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestingPackageFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TestingPackagePackage.TESTING_SPACE: return createTestingSpace();
			case TestingPackagePackage.TEST_CAMPAIGN: return createTestCampaign();
			case TestingPackagePackage.TEST: return createTest();
			case TestingPackagePackage.PASSIVE_MONITOR_ONLY: return createPassiveMonitorOnly();
			case TestingPackagePackage.TIME_BASED_ACTIVATION_GENERATION_METHOD: return createTimeBasedActivationGenerationMethod();
			case TestingPackagePackage.CONDITION_BASED_ACTIVATION_GENERATION_METHOD: return createConditionBasedActivationGenerationMethod();
			case TestingPackagePackage.CAMPAIGN_RESULT_SET: return createCampaignResultSet();
			case TestingPackagePackage.TIME_BASED_END: return createTimeBasedEnd();
			case TestingPackagePackage.RANDOM_TEST_GENERATION: return createRandomTestGeneration();
			case TestingPackagePackage.NSGA_EVOLUTIONARY_ALGORITHM: return createNSGAEvolutionaryAlgorithm();
			case TestingPackagePackage.NSGA_WITH_COVERAGE_CELLS: return createNSGAWithCoverageCells();
			case TestingPackagePackage.FIXED_NSGA_COVERAGE_BOOSTING_STRATEGY: return createFixedNSGACoverageBoostingStrategy();
			case TestingPackagePackage.LINEAR_NSGA_COVERAGE_BOOSTING_STRATEGY: return createLinearNSGACoverageBoostingStrategy();
			case TestingPackagePackage.DIMENSION_INTERVAL: return createDimensionInterval();
			case TestingPackagePackage.REPEATED_EXECUTION: return createRepeatedExecution();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TestingPackagePackage.RESULT_SET_STATUS:
				return createResultSetStatusFromString(eDataType, initialValue);
			case TestingPackagePackage.DIMENSION_ID:
				return createDimensionIDFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TestingPackagePackage.RESULT_SET_STATUS:
				return convertResultSetStatusToString(eDataType, instanceValue);
			case TestingPackagePackage.DIMENSION_ID:
				return convertDimensionIDToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestingSpace createTestingSpace() {
		TestingSpaceImpl testingSpace = new TestingSpaceImpl();
		return testingSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestCampaign createTestCampaign() {
		TestCampaignImpl testCampaign = new TestCampaignImpl();
		return testCampaign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Test createTest() {
		TestImpl test = new TestImpl();
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassiveMonitorOnly createPassiveMonitorOnly() {
		PassiveMonitorOnlyImpl passiveMonitorOnly = new PassiveMonitorOnlyImpl();
		return passiveMonitorOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeBasedActivationGenerationMethod createTimeBasedActivationGenerationMethod() {
		TimeBasedActivationGenerationMethodImpl timeBasedActivationGenerationMethod = new TimeBasedActivationGenerationMethodImpl();
		return timeBasedActivationGenerationMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionBasedActivationGenerationMethod createConditionBasedActivationGenerationMethod() {
		ConditionBasedActivationGenerationMethodImpl conditionBasedActivationGenerationMethod = new ConditionBasedActivationGenerationMethodImpl();
		return conditionBasedActivationGenerationMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CampaignResultSet createCampaignResultSet() {
		CampaignResultSetImpl campaignResultSet = new CampaignResultSetImpl();
		return campaignResultSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeBasedEnd createTimeBasedEnd() {
		TimeBasedEndImpl timeBasedEnd = new TimeBasedEndImpl();
		return timeBasedEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RandomTestGeneration createRandomTestGeneration() {
		RandomTestGenerationImpl randomTestGeneration = new RandomTestGenerationImpl();
		return randomTestGeneration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NSGAEvolutionaryAlgorithm createNSGAEvolutionaryAlgorithm() {
		NSGAEvolutionaryAlgorithmImpl nsgaEvolutionaryAlgorithm = new NSGAEvolutionaryAlgorithmImpl();
		return nsgaEvolutionaryAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NSGAWithCoverageCells createNSGAWithCoverageCells() {
		NSGAWithCoverageCellsImpl nsgaWithCoverageCells = new NSGAWithCoverageCellsImpl();
		return nsgaWithCoverageCells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedNSGACoverageBoostingStrategy createFixedNSGACoverageBoostingStrategy() {
		FixedNSGACoverageBoostingStrategyImpl fixedNSGACoverageBoostingStrategy = new FixedNSGACoverageBoostingStrategyImpl();
		return fixedNSGACoverageBoostingStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinearNSGACoverageBoostingStrategy createLinearNSGACoverageBoostingStrategy() {
		LinearNSGACoverageBoostingStrategyImpl linearNSGACoverageBoostingStrategy = new LinearNSGACoverageBoostingStrategyImpl();
		return linearNSGACoverageBoostingStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionInterval createDimensionInterval() {
		DimensionIntervalImpl dimensionInterval = new DimensionIntervalImpl();
		return dimensionInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatedExecution createRepeatedExecution() {
		RepeatedExecutionImpl repeatedExecution = new RepeatedExecutionImpl();
		return repeatedExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultSetStatus createResultSetStatusFromString(EDataType eDataType, String initialValue) {
		ResultSetStatus result = ResultSetStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResultSetStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionID createDimensionIDFromString(EDataType eDataType, String initialValue) {
		DimensionID result = DimensionID.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDimensionIDToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestingPackagePackage getTestingPackagePackage() {
		return (TestingPackagePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TestingPackagePackage getPackage() {
		return TestingPackagePackage.eINSTANCE;
	}

} //TestingPackageFactoryImpl
