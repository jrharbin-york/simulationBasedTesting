/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackageFactory
 * @model kind="package"
 * @generated
 */
public interface TestingPackagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TestingPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "TestingMM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "TestingMM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestingPackagePackage eINSTANCE = uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingSpaceImpl <em>Testing Space</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingSpaceImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getTestingSpace()
	 * @generated
	 */
	int TESTING_SPACE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_SPACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Metrics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_SPACE__METRICS = 1;

	/**
	 * The feature id for the '<em><b>Possible Fuzzing Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_SPACE__POSSIBLE_FUZZING_OPERATIONS = 2;

	/**
	 * The feature id for the '<em><b>Campaigns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_SPACE__CAMPAIGNS = 3;

	/**
	 * The feature id for the '<em><b>Mrs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_SPACE__MRS = 4;

	/**
	 * The number of structural features of the '<em>Testing Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_SPACE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Testing Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_SPACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestCampaignImpl <em>Test Campaign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestCampaignImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getTestCampaign()
	 * @generated
	 */
	int TEST_CAMPAIGN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CAMPAIGN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Metrics</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CAMPAIGN__METRICS = 1;

	/**
	 * The feature id for the '<em><b>Condition Metrics</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CAMPAIGN__CONDITION_METRICS = 2;

	/**
	 * The feature id for the '<em><b>Activation Generation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CAMPAIGN__ACTIVATION_GENERATION = 3;

	/**
	 * The feature id for the '<em><b>Included Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CAMPAIGN__INCLUDED_OPERATIONS = 4;

	/**
	 * The feature id for the '<em><b>Approach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CAMPAIGN__APPROACH = 5;

	/**
	 * The feature id for the '<em><b>Performed Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CAMPAIGN__PERFORMED_TESTS = 6;

	/**
	 * The feature id for the '<em><b>Result Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CAMPAIGN__RESULT_SETS = 7;

	/**
	 * The feature id for the '<em><b>End Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CAMPAIGN__END_TRIGGER = 8;

	/**
	 * The number of structural features of the '<em>Test Campaign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CAMPAIGN_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Test Campaign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CAMPAIGN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestImpl <em>Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getTest()
	 * @generated
	 */
	int TEST = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__NAME = 0;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__OPERATIONS = 1;

	/**
	 * The feature id for the '<em><b>Metrics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__METRICS = 2;

	/**
	 * The feature id for the '<em><b>Developed From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__DEVELOPED_FROM = 3;

	/**
	 * The feature id for the '<em><b>Parent Campaign</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__PARENT_CAMPAIGN = 4;

	/**
	 * The feature id for the '<em><b>Debug Flags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__DEBUG_FLAGS = 5;

	/**
	 * The number of structural features of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestDebuggingFlagsImpl <em>Test Debugging Flags</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestDebuggingFlagsImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getTestDebuggingFlags()
	 * @generated
	 */
	int TEST_DEBUGGING_FLAGS = 3;

	/**
	 * The number of structural features of the '<em>Test Debugging Flags</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DEBUGGING_FLAGS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Test Debugging Flags</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DEBUGGING_FLAGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.PassiveMonitorOnlyImpl <em>Passive Monitor Only</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.PassiveMonitorOnlyImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getPassiveMonitorOnly()
	 * @generated
	 */
	int PASSIVE_MONITOR_ONLY = 4;

	/**
	 * The number of structural features of the '<em>Passive Monitor Only</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_MONITOR_ONLY_FEATURE_COUNT = TEST_DEBUGGING_FLAGS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Passive Monitor Only</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_MONITOR_ONLY_OPERATION_COUNT = TEST_DEBUGGING_FLAGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.ActivationGenerationMethodImpl <em>Activation Generation Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.ActivationGenerationMethodImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getActivationGenerationMethod()
	 * @generated
	 */
	int ACTIVATION_GENERATION_METHOD = 5;

	/**
	 * The number of structural features of the '<em>Activation Generation Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_GENERATION_METHOD_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Activation Generation Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_GENERATION_METHOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TimeBasedActivationGenerationMethodImpl <em>Time Based Activation Generation Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TimeBasedActivationGenerationMethodImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getTimeBasedActivationGenerationMethod()
	 * @generated
	 */
	int TIME_BASED_ACTIVATION_GENERATION_METHOD = 6;

	/**
	 * The number of structural features of the '<em>Time Based Activation Generation Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BASED_ACTIVATION_GENERATION_METHOD_FEATURE_COUNT = ACTIVATION_GENERATION_METHOD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Time Based Activation Generation Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BASED_ACTIVATION_GENERATION_METHOD_OPERATION_COUNT = ACTIVATION_GENERATION_METHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.ConditionBasedActivationGenerationMethodImpl <em>Condition Based Activation Generation Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.ConditionBasedActivationGenerationMethodImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getConditionBasedActivationGenerationMethod()
	 * @generated
	 */
	int CONDITION_BASED_ACTIVATION_GENERATION_METHOD = 7;

	/**
	 * The feature id for the '<em><b>Condition Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_BASED_ACTIVATION_GENERATION_METHOD__CONDITION_DEPTH = ACTIVATION_GENERATION_METHOD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Condition Based Activation Generation Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_BASED_ACTIVATION_GENERATION_METHOD_FEATURE_COUNT = ACTIVATION_GENERATION_METHOD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Condition Based Activation Generation Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_BASED_ACTIVATION_GENERATION_METHOD_OPERATION_COUNT = ACTIVATION_GENERATION_METHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.CampaignResultSetImpl <em>Campaign Result Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.CampaignResultSetImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getCampaignResultSet()
	 * @generated
	 */
	int CAMPAIGN_RESULT_SET = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN_RESULT_SET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN_RESULT_SET__STATUS = 1;

	/**
	 * The feature id for the '<em><b>Results</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN_RESULT_SET__RESULTS = 2;

	/**
	 * The number of structural features of the '<em>Campaign Result Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN_RESULT_SET_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Campaign Result Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN_RESULT_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.ExecutionEndTriggerImpl <em>Execution End Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.ExecutionEndTriggerImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getExecutionEndTrigger()
	 * @generated
	 */
	int EXECUTION_END_TRIGGER = 9;

	/**
	 * The number of structural features of the '<em>Execution End Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_END_TRIGGER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Execution End Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_END_TRIGGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TimeBasedEndImpl <em>Time Based End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TimeBasedEndImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getTimeBasedEnd()
	 * @generated
	 */
	int TIME_BASED_END = 10;

	/**
	 * The feature id for the '<em><b>Time Limit Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BASED_END__TIME_LIMIT_SECONDS = EXECUTION_END_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Time Based End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BASED_END_FEATURE_COUNT = EXECUTION_END_TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Time Based End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BASED_END_OPERATION_COUNT = EXECUTION_END_TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestGenerationApproachImpl <em>Test Generation Approach</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestGenerationApproachImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getTestGenerationApproach()
	 * @generated
	 */
	int TEST_GENERATION_APPROACH = 11;

	/**
	 * The number of structural features of the '<em>Test Generation Approach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_GENERATION_APPROACH_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Test Generation Approach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_GENERATION_APPROACH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.RandomTestGenerationImpl <em>Random Test Generation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.RandomTestGenerationImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getRandomTestGeneration()
	 * @generated
	 */
	int RANDOM_TEST_GENERATION = 12;

	/**
	 * The number of structural features of the '<em>Random Test Generation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_TEST_GENERATION_FEATURE_COUNT = TEST_GENERATION_APPROACH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Random Test Generation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_TEST_GENERATION_OPERATION_COUNT = TEST_GENERATION_APPROACH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.EvolutionaryAlgorithmImpl <em>Evolutionary Algorithm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.EvolutionaryAlgorithmImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getEvolutionaryAlgorithm()
	 * @generated
	 */
	int EVOLUTIONARY_ALGORITHM = 13;

	/**
	 * The number of structural features of the '<em>Evolutionary Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTIONARY_ALGORITHM_FEATURE_COUNT = TEST_GENERATION_APPROACH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Evolutionary Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTIONARY_ALGORITHM_OPERATION_COUNT = TEST_GENERATION_APPROACH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.NSGAEvolutionaryAlgorithmImpl <em>NSGA Evolutionary Algorithm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.NSGAEvolutionaryAlgorithmImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getNSGAEvolutionaryAlgorithm()
	 * @generated
	 */
	int NSGA_EVOLUTIONARY_ALGORITHM = 14;

	/**
	 * The feature id for the '<em><b>Population Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NSGA_EVOLUTIONARY_ALGORITHM__POPULATION_SIZE = EVOLUTIONARY_ALGORITHM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NSGA_EVOLUTIONARY_ALGORITHM__ITERATIONS = EVOLUTIONARY_ALGORITHM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>NSGA Evolutionary Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NSGA_EVOLUTIONARY_ALGORITHM_FEATURE_COUNT = EVOLUTIONARY_ALGORITHM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>NSGA Evolutionary Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NSGA_EVOLUTIONARY_ALGORITHM_OPERATION_COUNT = EVOLUTIONARY_ALGORITHM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.NSGAWithCoverageCellsImpl <em>NSGA With Coverage Cells</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.NSGAWithCoverageCellsImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getNSGAWithCoverageCells()
	 * @generated
	 */
	int NSGA_WITH_COVERAGE_CELLS = 15;

	/**
	 * The feature id for the '<em><b>Population Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NSGA_WITH_COVERAGE_CELLS__POPULATION_SIZE = NSGA_EVOLUTIONARY_ALGORITHM__POPULATION_SIZE;

	/**
	 * The feature id for the '<em><b>Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NSGA_WITH_COVERAGE_CELLS__ITERATIONS = NSGA_EVOLUTIONARY_ALGORITHM__ITERATIONS;

	/**
	 * The feature id for the '<em><b>Coverage Per Cell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NSGA_WITH_COVERAGE_CELLS__COVERAGE_PER_CELL = NSGA_EVOLUTIONARY_ALGORITHM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Coverage Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NSGA_WITH_COVERAGE_CELLS__TARGET_COVERAGE_PROPORTION = NSGA_EVOLUTIONARY_ALGORITHM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dimension Records</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NSGA_WITH_COVERAGE_CELLS__DIMENSION_RECORDS = NSGA_EVOLUTIONARY_ALGORITHM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Coverage Boosting Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NSGA_WITH_COVERAGE_CELLS__COVERAGE_BOOSTING_STRATEGY = NSGA_EVOLUTIONARY_ALGORITHM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>NSGA With Coverage Cells</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NSGA_WITH_COVERAGE_CELLS_FEATURE_COUNT = NSGA_EVOLUTIONARY_ALGORITHM_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>NSGA With Coverage Cells</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NSGA_WITH_COVERAGE_CELLS_OPERATION_COUNT = NSGA_EVOLUTIONARY_ALGORITHM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.CoverageBoostingStrategyImpl <em>Coverage Boosting Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.CoverageBoostingStrategyImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getCoverageBoostingStrategy()
	 * @generated
	 */
	int COVERAGE_BOOSTING_STRATEGY = 16;

	/**
	 * The number of structural features of the '<em>Coverage Boosting Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_BOOSTING_STRATEGY_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Element Should Use Coverage Boosting</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_BOOSTING_STRATEGY___ELEMENT_SHOULD_USE_COVERAGE_BOOSTING__INT_INT_INT = 0;

	/**
	 * The number of operations of the '<em>Coverage Boosting Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_BOOSTING_STRATEGY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.FixedNSGACoverageBoostingStrategyImpl <em>Fixed NSGA Coverage Boosting Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.FixedNSGACoverageBoostingStrategyImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getFixedNSGACoverageBoostingStrategy()
	 * @generated
	 */
	int FIXED_NSGA_COVERAGE_BOOSTING_STRATEGY = 17;

	/**
	 * The feature id for the '<em><b>Use Boosting Once Every Generations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_NSGA_COVERAGE_BOOSTING_STRATEGY__USE_BOOSTING_ONCE_EVERY_GENERATIONS = COVERAGE_BOOSTING_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Use Boosting Once Every Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_NSGA_COVERAGE_BOOSTING_STRATEGY__USE_BOOSTING_ONCE_EVERY_ITERATIONS = COVERAGE_BOOSTING_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fixed NSGA Coverage Boosting Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_NSGA_COVERAGE_BOOSTING_STRATEGY_FEATURE_COUNT = COVERAGE_BOOSTING_STRATEGY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Element Should Use Coverage Boosting</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_NSGA_COVERAGE_BOOSTING_STRATEGY___ELEMENT_SHOULD_USE_COVERAGE_BOOSTING__INT_INT_INT = COVERAGE_BOOSTING_STRATEGY___ELEMENT_SHOULD_USE_COVERAGE_BOOSTING__INT_INT_INT;

	/**
	 * The number of operations of the '<em>Fixed NSGA Coverage Boosting Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_NSGA_COVERAGE_BOOSTING_STRATEGY_OPERATION_COUNT = COVERAGE_BOOSTING_STRATEGY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.LinearNSGACoverageBoostingStrategyImpl <em>Linear NSGA Coverage Boosting Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.LinearNSGACoverageBoostingStrategyImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getLinearNSGACoverageBoostingStrategy()
	 * @generated
	 */
	int LINEAR_NSGA_COVERAGE_BOOSTING_STRATEGY = 18;

	/**
	 * The feature id for the '<em><b>Use Boosting Once Every Generations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_NSGA_COVERAGE_BOOSTING_STRATEGY__USE_BOOSTING_ONCE_EVERY_GENERATIONS = COVERAGE_BOOSTING_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Starting Boosting Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_NSGA_COVERAGE_BOOSTING_STRATEGY__STARTING_BOOSTING_COUNT = COVERAGE_BOOSTING_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ending Boosting Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_NSGA_COVERAGE_BOOSTING_STRATEGY__ENDING_BOOSTING_COUNT = COVERAGE_BOOSTING_STRATEGY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Count Drop Every Generation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_NSGA_COVERAGE_BOOSTING_STRATEGY__COUNT_DROP_EVERY_GENERATION = COVERAGE_BOOSTING_STRATEGY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Linear NSGA Coverage Boosting Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_NSGA_COVERAGE_BOOSTING_STRATEGY_FEATURE_COUNT = COVERAGE_BOOSTING_STRATEGY_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Element Should Use Coverage Boosting</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_NSGA_COVERAGE_BOOSTING_STRATEGY___ELEMENT_SHOULD_USE_COVERAGE_BOOSTING__INT_INT_INT = COVERAGE_BOOSTING_STRATEGY___ELEMENT_SHOULD_USE_COVERAGE_BOOSTING__INT_INT_INT;

	/**
	 * The number of operations of the '<em>Linear NSGA Coverage Boosting Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_NSGA_COVERAGE_BOOSTING_STRATEGY_OPERATION_COUNT = COVERAGE_BOOSTING_STRATEGY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.DimensionIntervalImpl <em>Dimension Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.DimensionIntervalImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getDimensionInterval()
	 * @generated
	 */
	int DIMENSION_INTERVAL = 19;

	/**
	 * The feature id for the '<em><b>Dim ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_INTERVAL__DIM_ID = 0;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_INTERVAL__MIN_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_INTERVAL__MAX_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_INTERVAL__COUNT = 3;

	/**
	 * The feature id for the '<em><b>Extra Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_INTERVAL__EXTRA_DATA = 4;

	/**
	 * The number of structural features of the '<em>Dimension Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_INTERVAL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Dimension Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_INTERVAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.RepeatedExecutionImpl <em>Repeated Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.RepeatedExecutionImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getRepeatedExecution()
	 * @generated
	 */
	int REPEATED_EXECUTION = 20;

	/**
	 * The feature id for the '<em><b>Test To Repeat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEATED_EXECUTION__TEST_TO_REPEAT = TEST_GENERATION_APPROACH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Repeat Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEATED_EXECUTION__REPEAT_COUNT = TEST_GENERATION_APPROACH_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Repeated Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEATED_EXECUTION_FEATURE_COUNT = TEST_GENERATION_APPROACH_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Repeated Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEATED_EXECUTION_OPERATION_COUNT = TEST_GENERATION_APPROACH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.ResultSetStatus <em>Result Set Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.ResultSetStatus
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getResultSetStatus()
	 * @generated
	 */
	int RESULT_SET_STATUS = 21;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.DimensionID <em>Dimension ID</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.DimensionID
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getDimensionID()
	 * @generated
	 */
	int DIMENSION_ID = 22;


	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingSpace <em>Testing Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Testing Space</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingSpace
	 * @generated
	 */
	EClass getTestingSpace();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingSpace#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingSpace#getName()
	 * @see #getTestingSpace()
	 * @generated
	 */
	EAttribute getTestingSpace_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingSpace#getMetrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metrics</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingSpace#getMetrics()
	 * @see #getTestingSpace()
	 * @generated
	 */
	EReference getTestingSpace_Metrics();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingSpace#getPossibleFuzzingOperations <em>Possible Fuzzing Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Possible Fuzzing Operations</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingSpace#getPossibleFuzzingOperations()
	 * @see #getTestingSpace()
	 * @generated
	 */
	EReference getTestingSpace_PossibleFuzzingOperations();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingSpace#getCampaigns <em>Campaigns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Campaigns</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingSpace#getCampaigns()
	 * @see #getTestingSpace()
	 * @generated
	 */
	EReference getTestingSpace_Campaigns();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingSpace#getMrs <em>Mrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mrs</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingSpace#getMrs()
	 * @see #getTestingSpace()
	 * @generated
	 */
	EReference getTestingSpace_Mrs();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign <em>Test Campaign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Campaign</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign
	 * @generated
	 */
	EClass getTestCampaign();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign#getName()
	 * @see #getTestCampaign()
	 * @generated
	 */
	EAttribute getTestCampaign_Name();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign#getMetrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Metrics</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign#getMetrics()
	 * @see #getTestCampaign()
	 * @generated
	 */
	EReference getTestCampaign_Metrics();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign#getConditionMetrics <em>Condition Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Condition Metrics</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign#getConditionMetrics()
	 * @see #getTestCampaign()
	 * @generated
	 */
	EReference getTestCampaign_ConditionMetrics();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign#getActivationGeneration <em>Activation Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activation Generation</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign#getActivationGeneration()
	 * @see #getTestCampaign()
	 * @generated
	 */
	EReference getTestCampaign_ActivationGeneration();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign#getIncludedOperations <em>Included Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Included Operations</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign#getIncludedOperations()
	 * @see #getTestCampaign()
	 * @generated
	 */
	EReference getTestCampaign_IncludedOperations();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign#getApproach <em>Approach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Approach</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign#getApproach()
	 * @see #getTestCampaign()
	 * @generated
	 */
	EReference getTestCampaign_Approach();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign#getPerformedTests <em>Performed Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Performed Tests</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign#getPerformedTests()
	 * @see #getTestCampaign()
	 * @generated
	 */
	EReference getTestCampaign_PerformedTests();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign#getResultSets <em>Result Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result Sets</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign#getResultSets()
	 * @see #getTestCampaign()
	 * @generated
	 */
	EReference getTestCampaign_ResultSets();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign#getEndTrigger <em>End Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End Trigger</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign#getEndTrigger()
	 * @see #getTestCampaign()
	 * @generated
	 */
	EReference getTestCampaign_EndTrigger();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test
	 * @generated
	 */
	EClass getTest();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test#getName()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test#getOperations()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_Operations();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test#getMetrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metrics</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test#getMetrics()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_Metrics();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test#getDevelopedFrom <em>Developed From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Developed From</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test#getDevelopedFrom()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_DevelopedFrom();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test#getParentCampaign <em>Parent Campaign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Campaign</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test#getParentCampaign()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_ParentCampaign();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test#getDebugFlags <em>Debug Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Debug Flags</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test#getDebugFlags()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_DebugFlags();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestDebuggingFlags <em>Test Debugging Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Debugging Flags</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestDebuggingFlags
	 * @generated
	 */
	EClass getTestDebuggingFlags();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.PassiveMonitorOnly <em>Passive Monitor Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passive Monitor Only</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.PassiveMonitorOnly
	 * @generated
	 */
	EClass getPassiveMonitorOnly();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.ActivationGenerationMethod <em>Activation Generation Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activation Generation Method</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.ActivationGenerationMethod
	 * @generated
	 */
	EClass getActivationGenerationMethod();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TimeBasedActivationGenerationMethod <em>Time Based Activation Generation Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Based Activation Generation Method</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TimeBasedActivationGenerationMethod
	 * @generated
	 */
	EClass getTimeBasedActivationGenerationMethod();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.ConditionBasedActivationGenerationMethod <em>Condition Based Activation Generation Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Based Activation Generation Method</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.ConditionBasedActivationGenerationMethod
	 * @generated
	 */
	EClass getConditionBasedActivationGenerationMethod();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.ConditionBasedActivationGenerationMethod#getConditionDepth <em>Condition Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition Depth</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.ConditionBasedActivationGenerationMethod#getConditionDepth()
	 * @see #getConditionBasedActivationGenerationMethod()
	 * @generated
	 */
	EAttribute getConditionBasedActivationGenerationMethod_ConditionDepth();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.CampaignResultSet <em>Campaign Result Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Campaign Result Set</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.CampaignResultSet
	 * @generated
	 */
	EClass getCampaignResultSet();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.CampaignResultSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.CampaignResultSet#getName()
	 * @see #getCampaignResultSet()
	 * @generated
	 */
	EAttribute getCampaignResultSet_Name();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.CampaignResultSet#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.CampaignResultSet#getStatus()
	 * @see #getCampaignResultSet()
	 * @generated
	 */
	EAttribute getCampaignResultSet_Status();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.CampaignResultSet#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Results</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.CampaignResultSet#getResults()
	 * @see #getCampaignResultSet()
	 * @generated
	 */
	EReference getCampaignResultSet_Results();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.ExecutionEndTrigger <em>Execution End Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution End Trigger</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.ExecutionEndTrigger
	 * @generated
	 */
	EClass getExecutionEndTrigger();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TimeBasedEnd <em>Time Based End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Based End</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TimeBasedEnd
	 * @generated
	 */
	EClass getTimeBasedEnd();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TimeBasedEnd#getTimeLimitSeconds <em>Time Limit Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Limit Seconds</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TimeBasedEnd#getTimeLimitSeconds()
	 * @see #getTimeBasedEnd()
	 * @generated
	 */
	EAttribute getTimeBasedEnd_TimeLimitSeconds();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestGenerationApproach <em>Test Generation Approach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Generation Approach</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestGenerationApproach
	 * @generated
	 */
	EClass getTestGenerationApproach();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.RandomTestGeneration <em>Random Test Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Random Test Generation</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.RandomTestGeneration
	 * @generated
	 */
	EClass getRandomTestGeneration();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.EvolutionaryAlgorithm <em>Evolutionary Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evolutionary Algorithm</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.EvolutionaryAlgorithm
	 * @generated
	 */
	EClass getEvolutionaryAlgorithm();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.NSGAEvolutionaryAlgorithm <em>NSGA Evolutionary Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NSGA Evolutionary Algorithm</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.NSGAEvolutionaryAlgorithm
	 * @generated
	 */
	EClass getNSGAEvolutionaryAlgorithm();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.NSGAEvolutionaryAlgorithm#getPopulationSize <em>Population Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Population Size</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.NSGAEvolutionaryAlgorithm#getPopulationSize()
	 * @see #getNSGAEvolutionaryAlgorithm()
	 * @generated
	 */
	EAttribute getNSGAEvolutionaryAlgorithm_PopulationSize();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.NSGAEvolutionaryAlgorithm#getIterations <em>Iterations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iterations</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.NSGAEvolutionaryAlgorithm#getIterations()
	 * @see #getNSGAEvolutionaryAlgorithm()
	 * @generated
	 */
	EAttribute getNSGAEvolutionaryAlgorithm_Iterations();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.NSGAWithCoverageCells <em>NSGA With Coverage Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NSGA With Coverage Cells</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.NSGAWithCoverageCells
	 * @generated
	 */
	EClass getNSGAWithCoverageCells();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.NSGAWithCoverageCells#getCoveragePerCell <em>Coverage Per Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coverage Per Cell</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.NSGAWithCoverageCells#getCoveragePerCell()
	 * @see #getNSGAWithCoverageCells()
	 * @generated
	 */
	EAttribute getNSGAWithCoverageCells_CoveragePerCell();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.NSGAWithCoverageCells#getTargetCoverageProportion <em>Target Coverage Proportion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Coverage Proportion</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.NSGAWithCoverageCells#getTargetCoverageProportion()
	 * @see #getNSGAWithCoverageCells()
	 * @generated
	 */
	EAttribute getNSGAWithCoverageCells_TargetCoverageProportion();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.NSGAWithCoverageCells#getDimensionRecords <em>Dimension Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dimension Records</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.NSGAWithCoverageCells#getDimensionRecords()
	 * @see #getNSGAWithCoverageCells()
	 * @generated
	 */
	EReference getNSGAWithCoverageCells_DimensionRecords();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.NSGAWithCoverageCells#getCoverageBoostingStrategy <em>Coverage Boosting Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Coverage Boosting Strategy</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.NSGAWithCoverageCells#getCoverageBoostingStrategy()
	 * @see #getNSGAWithCoverageCells()
	 * @generated
	 */
	EReference getNSGAWithCoverageCells_CoverageBoostingStrategy();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.CoverageBoostingStrategy <em>Coverage Boosting Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coverage Boosting Strategy</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.CoverageBoostingStrategy
	 * @generated
	 */
	EClass getCoverageBoostingStrategy();

	/**
	 * Returns the meta object for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.CoverageBoostingStrategy#elementShouldUseCoverageBoosting(int, int, int) <em>Element Should Use Coverage Boosting</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Element Should Use Coverage Boosting</em>' operation.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.CoverageBoostingStrategy#elementShouldUseCoverageBoosting(int, int, int)
	 * @generated
	 */
	EOperation getCoverageBoostingStrategy__ElementShouldUseCoverageBoosting__int_int_int();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FixedNSGACoverageBoostingStrategy <em>Fixed NSGA Coverage Boosting Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed NSGA Coverage Boosting Strategy</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FixedNSGACoverageBoostingStrategy
	 * @generated
	 */
	EClass getFixedNSGACoverageBoostingStrategy();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FixedNSGACoverageBoostingStrategy#getUseBoostingOnceEveryGenerations <em>Use Boosting Once Every Generations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Boosting Once Every Generations</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FixedNSGACoverageBoostingStrategy#getUseBoostingOnceEveryGenerations()
	 * @see #getFixedNSGACoverageBoostingStrategy()
	 * @generated
	 */
	EAttribute getFixedNSGACoverageBoostingStrategy_UseBoostingOnceEveryGenerations();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FixedNSGACoverageBoostingStrategy#getUseBoostingOnceEveryIterations <em>Use Boosting Once Every Iterations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Boosting Once Every Iterations</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FixedNSGACoverageBoostingStrategy#getUseBoostingOnceEveryIterations()
	 * @see #getFixedNSGACoverageBoostingStrategy()
	 * @generated
	 */
	EAttribute getFixedNSGACoverageBoostingStrategy_UseBoostingOnceEveryIterations();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.LinearNSGACoverageBoostingStrategy <em>Linear NSGA Coverage Boosting Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linear NSGA Coverage Boosting Strategy</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.LinearNSGACoverageBoostingStrategy
	 * @generated
	 */
	EClass getLinearNSGACoverageBoostingStrategy();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.LinearNSGACoverageBoostingStrategy#getUseBoostingOnceEveryGenerations <em>Use Boosting Once Every Generations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Boosting Once Every Generations</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.LinearNSGACoverageBoostingStrategy#getUseBoostingOnceEveryGenerations()
	 * @see #getLinearNSGACoverageBoostingStrategy()
	 * @generated
	 */
	EAttribute getLinearNSGACoverageBoostingStrategy_UseBoostingOnceEveryGenerations();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.LinearNSGACoverageBoostingStrategy#getStartingBoostingCount <em>Starting Boosting Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Starting Boosting Count</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.LinearNSGACoverageBoostingStrategy#getStartingBoostingCount()
	 * @see #getLinearNSGACoverageBoostingStrategy()
	 * @generated
	 */
	EAttribute getLinearNSGACoverageBoostingStrategy_StartingBoostingCount();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.LinearNSGACoverageBoostingStrategy#getEndingBoostingCount <em>Ending Boosting Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ending Boosting Count</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.LinearNSGACoverageBoostingStrategy#getEndingBoostingCount()
	 * @see #getLinearNSGACoverageBoostingStrategy()
	 * @generated
	 */
	EAttribute getLinearNSGACoverageBoostingStrategy_EndingBoostingCount();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.LinearNSGACoverageBoostingStrategy#getCountDropEveryGeneration <em>Count Drop Every Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count Drop Every Generation</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.LinearNSGACoverageBoostingStrategy#getCountDropEveryGeneration()
	 * @see #getLinearNSGACoverageBoostingStrategy()
	 * @generated
	 */
	EAttribute getLinearNSGACoverageBoostingStrategy_CountDropEveryGeneration();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.DimensionInterval <em>Dimension Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension Interval</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.DimensionInterval
	 * @generated
	 */
	EClass getDimensionInterval();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.DimensionInterval#getDimID <em>Dim ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dim ID</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.DimensionInterval#getDimID()
	 * @see #getDimensionInterval()
	 * @generated
	 */
	EAttribute getDimensionInterval_DimID();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.DimensionInterval#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.DimensionInterval#getMinValue()
	 * @see #getDimensionInterval()
	 * @generated
	 */
	EAttribute getDimensionInterval_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.DimensionInterval#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.DimensionInterval#getMaxValue()
	 * @see #getDimensionInterval()
	 * @generated
	 */
	EAttribute getDimensionInterval_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.DimensionInterval#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.DimensionInterval#getCount()
	 * @see #getDimensionInterval()
	 * @generated
	 */
	EAttribute getDimensionInterval_Count();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.DimensionInterval#getExtraData <em>Extra Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extra Data</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.DimensionInterval#getExtraData()
	 * @see #getDimensionInterval()
	 * @generated
	 */
	EAttribute getDimensionInterval_ExtraData();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.RepeatedExecution <em>Repeated Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeated Execution</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.RepeatedExecution
	 * @generated
	 */
	EClass getRepeatedExecution();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.RepeatedExecution#getTestToRepeat <em>Test To Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Test To Repeat</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.RepeatedExecution#getTestToRepeat()
	 * @see #getRepeatedExecution()
	 * @generated
	 */
	EReference getRepeatedExecution_TestToRepeat();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.RepeatedExecution#getRepeatCount <em>Repeat Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat Count</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.RepeatedExecution#getRepeatCount()
	 * @see #getRepeatedExecution()
	 * @generated
	 */
	EAttribute getRepeatedExecution_RepeatCount();

	/**
	 * Returns the meta object for enum '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.ResultSetStatus <em>Result Set Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Result Set Status</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.ResultSetStatus
	 * @generated
	 */
	EEnum getResultSetStatus();

	/**
	 * Returns the meta object for enum '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.DimensionID <em>Dimension ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dimension ID</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.DimensionID
	 * @generated
	 */
	EEnum getDimensionID();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestingPackageFactory getTestingPackageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingSpaceImpl <em>Testing Space</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingSpaceImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getTestingSpace()
		 * @generated
		 */
		EClass TESTING_SPACE = eINSTANCE.getTestingSpace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_SPACE__NAME = eINSTANCE.getTestingSpace_Name();

		/**
		 * The meta object literal for the '<em><b>Metrics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTING_SPACE__METRICS = eINSTANCE.getTestingSpace_Metrics();

		/**
		 * The meta object literal for the '<em><b>Possible Fuzzing Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTING_SPACE__POSSIBLE_FUZZING_OPERATIONS = eINSTANCE.getTestingSpace_PossibleFuzzingOperations();

		/**
		 * The meta object literal for the '<em><b>Campaigns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTING_SPACE__CAMPAIGNS = eINSTANCE.getTestingSpace_Campaigns();

		/**
		 * The meta object literal for the '<em><b>Mrs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTING_SPACE__MRS = eINSTANCE.getTestingSpace_Mrs();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestCampaignImpl <em>Test Campaign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestCampaignImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getTestCampaign()
		 * @generated
		 */
		EClass TEST_CAMPAIGN = eINSTANCE.getTestCampaign();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CAMPAIGN__NAME = eINSTANCE.getTestCampaign_Name();

		/**
		 * The meta object literal for the '<em><b>Metrics</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CAMPAIGN__METRICS = eINSTANCE.getTestCampaign_Metrics();

		/**
		 * The meta object literal for the '<em><b>Condition Metrics</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CAMPAIGN__CONDITION_METRICS = eINSTANCE.getTestCampaign_ConditionMetrics();

		/**
		 * The meta object literal for the '<em><b>Activation Generation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CAMPAIGN__ACTIVATION_GENERATION = eINSTANCE.getTestCampaign_ActivationGeneration();

		/**
		 * The meta object literal for the '<em><b>Included Operations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CAMPAIGN__INCLUDED_OPERATIONS = eINSTANCE.getTestCampaign_IncludedOperations();

		/**
		 * The meta object literal for the '<em><b>Approach</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CAMPAIGN__APPROACH = eINSTANCE.getTestCampaign_Approach();

		/**
		 * The meta object literal for the '<em><b>Performed Tests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CAMPAIGN__PERFORMED_TESTS = eINSTANCE.getTestCampaign_PerformedTests();

		/**
		 * The meta object literal for the '<em><b>Result Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CAMPAIGN__RESULT_SETS = eINSTANCE.getTestCampaign_ResultSets();

		/**
		 * The meta object literal for the '<em><b>End Trigger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CAMPAIGN__END_TRIGGER = eINSTANCE.getTestCampaign_EndTrigger();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestImpl <em>Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getTest()
		 * @generated
		 */
		EClass TEST = eINSTANCE.getTest();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__NAME = eINSTANCE.getTest_Name();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__OPERATIONS = eINSTANCE.getTest_Operations();

		/**
		 * The meta object literal for the '<em><b>Metrics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__METRICS = eINSTANCE.getTest_Metrics();

		/**
		 * The meta object literal for the '<em><b>Developed From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__DEVELOPED_FROM = eINSTANCE.getTest_DevelopedFrom();

		/**
		 * The meta object literal for the '<em><b>Parent Campaign</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__PARENT_CAMPAIGN = eINSTANCE.getTest_ParentCampaign();

		/**
		 * The meta object literal for the '<em><b>Debug Flags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__DEBUG_FLAGS = eINSTANCE.getTest_DebugFlags();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestDebuggingFlagsImpl <em>Test Debugging Flags</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestDebuggingFlagsImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getTestDebuggingFlags()
		 * @generated
		 */
		EClass TEST_DEBUGGING_FLAGS = eINSTANCE.getTestDebuggingFlags();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.PassiveMonitorOnlyImpl <em>Passive Monitor Only</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.PassiveMonitorOnlyImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getPassiveMonitorOnly()
		 * @generated
		 */
		EClass PASSIVE_MONITOR_ONLY = eINSTANCE.getPassiveMonitorOnly();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.ActivationGenerationMethodImpl <em>Activation Generation Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.ActivationGenerationMethodImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getActivationGenerationMethod()
		 * @generated
		 */
		EClass ACTIVATION_GENERATION_METHOD = eINSTANCE.getActivationGenerationMethod();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TimeBasedActivationGenerationMethodImpl <em>Time Based Activation Generation Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TimeBasedActivationGenerationMethodImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getTimeBasedActivationGenerationMethod()
		 * @generated
		 */
		EClass TIME_BASED_ACTIVATION_GENERATION_METHOD = eINSTANCE.getTimeBasedActivationGenerationMethod();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.ConditionBasedActivationGenerationMethodImpl <em>Condition Based Activation Generation Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.ConditionBasedActivationGenerationMethodImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getConditionBasedActivationGenerationMethod()
		 * @generated
		 */
		EClass CONDITION_BASED_ACTIVATION_GENERATION_METHOD = eINSTANCE.getConditionBasedActivationGenerationMethod();

		/**
		 * The meta object literal for the '<em><b>Condition Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_BASED_ACTIVATION_GENERATION_METHOD__CONDITION_DEPTH = eINSTANCE.getConditionBasedActivationGenerationMethod_ConditionDepth();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.CampaignResultSetImpl <em>Campaign Result Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.CampaignResultSetImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getCampaignResultSet()
		 * @generated
		 */
		EClass CAMPAIGN_RESULT_SET = eINSTANCE.getCampaignResultSet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPAIGN_RESULT_SET__NAME = eINSTANCE.getCampaignResultSet_Name();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPAIGN_RESULT_SET__STATUS = eINSTANCE.getCampaignResultSet_Status();

		/**
		 * The meta object literal for the '<em><b>Results</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMPAIGN_RESULT_SET__RESULTS = eINSTANCE.getCampaignResultSet_Results();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.ExecutionEndTriggerImpl <em>Execution End Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.ExecutionEndTriggerImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getExecutionEndTrigger()
		 * @generated
		 */
		EClass EXECUTION_END_TRIGGER = eINSTANCE.getExecutionEndTrigger();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TimeBasedEndImpl <em>Time Based End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TimeBasedEndImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getTimeBasedEnd()
		 * @generated
		 */
		EClass TIME_BASED_END = eINSTANCE.getTimeBasedEnd();

		/**
		 * The meta object literal for the '<em><b>Time Limit Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_BASED_END__TIME_LIMIT_SECONDS = eINSTANCE.getTimeBasedEnd_TimeLimitSeconds();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestGenerationApproachImpl <em>Test Generation Approach</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestGenerationApproachImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getTestGenerationApproach()
		 * @generated
		 */
		EClass TEST_GENERATION_APPROACH = eINSTANCE.getTestGenerationApproach();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.RandomTestGenerationImpl <em>Random Test Generation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.RandomTestGenerationImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getRandomTestGeneration()
		 * @generated
		 */
		EClass RANDOM_TEST_GENERATION = eINSTANCE.getRandomTestGeneration();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.EvolutionaryAlgorithmImpl <em>Evolutionary Algorithm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.EvolutionaryAlgorithmImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getEvolutionaryAlgorithm()
		 * @generated
		 */
		EClass EVOLUTIONARY_ALGORITHM = eINSTANCE.getEvolutionaryAlgorithm();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.NSGAEvolutionaryAlgorithmImpl <em>NSGA Evolutionary Algorithm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.NSGAEvolutionaryAlgorithmImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getNSGAEvolutionaryAlgorithm()
		 * @generated
		 */
		EClass NSGA_EVOLUTIONARY_ALGORITHM = eINSTANCE.getNSGAEvolutionaryAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Population Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NSGA_EVOLUTIONARY_ALGORITHM__POPULATION_SIZE = eINSTANCE.getNSGAEvolutionaryAlgorithm_PopulationSize();

		/**
		 * The meta object literal for the '<em><b>Iterations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NSGA_EVOLUTIONARY_ALGORITHM__ITERATIONS = eINSTANCE.getNSGAEvolutionaryAlgorithm_Iterations();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.NSGAWithCoverageCellsImpl <em>NSGA With Coverage Cells</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.NSGAWithCoverageCellsImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getNSGAWithCoverageCells()
		 * @generated
		 */
		EClass NSGA_WITH_COVERAGE_CELLS = eINSTANCE.getNSGAWithCoverageCells();

		/**
		 * The meta object literal for the '<em><b>Coverage Per Cell</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NSGA_WITH_COVERAGE_CELLS__COVERAGE_PER_CELL = eINSTANCE.getNSGAWithCoverageCells_CoveragePerCell();

		/**
		 * The meta object literal for the '<em><b>Target Coverage Proportion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NSGA_WITH_COVERAGE_CELLS__TARGET_COVERAGE_PROPORTION = eINSTANCE.getNSGAWithCoverageCells_TargetCoverageProportion();

		/**
		 * The meta object literal for the '<em><b>Dimension Records</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NSGA_WITH_COVERAGE_CELLS__DIMENSION_RECORDS = eINSTANCE.getNSGAWithCoverageCells_DimensionRecords();

		/**
		 * The meta object literal for the '<em><b>Coverage Boosting Strategy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NSGA_WITH_COVERAGE_CELLS__COVERAGE_BOOSTING_STRATEGY = eINSTANCE.getNSGAWithCoverageCells_CoverageBoostingStrategy();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.CoverageBoostingStrategyImpl <em>Coverage Boosting Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.CoverageBoostingStrategyImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getCoverageBoostingStrategy()
		 * @generated
		 */
		EClass COVERAGE_BOOSTING_STRATEGY = eINSTANCE.getCoverageBoostingStrategy();

		/**
		 * The meta object literal for the '<em><b>Element Should Use Coverage Boosting</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COVERAGE_BOOSTING_STRATEGY___ELEMENT_SHOULD_USE_COVERAGE_BOOSTING__INT_INT_INT = eINSTANCE.getCoverageBoostingStrategy__ElementShouldUseCoverageBoosting__int_int_int();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.FixedNSGACoverageBoostingStrategyImpl <em>Fixed NSGA Coverage Boosting Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.FixedNSGACoverageBoostingStrategyImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getFixedNSGACoverageBoostingStrategy()
		 * @generated
		 */
		EClass FIXED_NSGA_COVERAGE_BOOSTING_STRATEGY = eINSTANCE.getFixedNSGACoverageBoostingStrategy();

		/**
		 * The meta object literal for the '<em><b>Use Boosting Once Every Generations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_NSGA_COVERAGE_BOOSTING_STRATEGY__USE_BOOSTING_ONCE_EVERY_GENERATIONS = eINSTANCE.getFixedNSGACoverageBoostingStrategy_UseBoostingOnceEveryGenerations();

		/**
		 * The meta object literal for the '<em><b>Use Boosting Once Every Iterations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_NSGA_COVERAGE_BOOSTING_STRATEGY__USE_BOOSTING_ONCE_EVERY_ITERATIONS = eINSTANCE.getFixedNSGACoverageBoostingStrategy_UseBoostingOnceEveryIterations();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.LinearNSGACoverageBoostingStrategyImpl <em>Linear NSGA Coverage Boosting Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.LinearNSGACoverageBoostingStrategyImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getLinearNSGACoverageBoostingStrategy()
		 * @generated
		 */
		EClass LINEAR_NSGA_COVERAGE_BOOSTING_STRATEGY = eINSTANCE.getLinearNSGACoverageBoostingStrategy();

		/**
		 * The meta object literal for the '<em><b>Use Boosting Once Every Generations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_NSGA_COVERAGE_BOOSTING_STRATEGY__USE_BOOSTING_ONCE_EVERY_GENERATIONS = eINSTANCE.getLinearNSGACoverageBoostingStrategy_UseBoostingOnceEveryGenerations();

		/**
		 * The meta object literal for the '<em><b>Starting Boosting Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_NSGA_COVERAGE_BOOSTING_STRATEGY__STARTING_BOOSTING_COUNT = eINSTANCE.getLinearNSGACoverageBoostingStrategy_StartingBoostingCount();

		/**
		 * The meta object literal for the '<em><b>Ending Boosting Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_NSGA_COVERAGE_BOOSTING_STRATEGY__ENDING_BOOSTING_COUNT = eINSTANCE.getLinearNSGACoverageBoostingStrategy_EndingBoostingCount();

		/**
		 * The meta object literal for the '<em><b>Count Drop Every Generation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_NSGA_COVERAGE_BOOSTING_STRATEGY__COUNT_DROP_EVERY_GENERATION = eINSTANCE.getLinearNSGACoverageBoostingStrategy_CountDropEveryGeneration();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.DimensionIntervalImpl <em>Dimension Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.DimensionIntervalImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getDimensionInterval()
		 * @generated
		 */
		EClass DIMENSION_INTERVAL = eINSTANCE.getDimensionInterval();

		/**
		 * The meta object literal for the '<em><b>Dim ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION_INTERVAL__DIM_ID = eINSTANCE.getDimensionInterval_DimID();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION_INTERVAL__MIN_VALUE = eINSTANCE.getDimensionInterval_MinValue();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION_INTERVAL__MAX_VALUE = eINSTANCE.getDimensionInterval_MaxValue();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION_INTERVAL__COUNT = eINSTANCE.getDimensionInterval_Count();

		/**
		 * The meta object literal for the '<em><b>Extra Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION_INTERVAL__EXTRA_DATA = eINSTANCE.getDimensionInterval_ExtraData();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.RepeatedExecutionImpl <em>Repeated Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.RepeatedExecutionImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getRepeatedExecution()
		 * @generated
		 */
		EClass REPEATED_EXECUTION = eINSTANCE.getRepeatedExecution();

		/**
		 * The meta object literal for the '<em><b>Test To Repeat</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEATED_EXECUTION__TEST_TO_REPEAT = eINSTANCE.getRepeatedExecution_TestToRepeat();

		/**
		 * The meta object literal for the '<em><b>Repeat Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPEATED_EXECUTION__REPEAT_COUNT = eINSTANCE.getRepeatedExecution_RepeatCount();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.ResultSetStatus <em>Result Set Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.ResultSetStatus
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getResultSetStatus()
		 * @generated
		 */
		EEnum RESULT_SET_STATUS = eINSTANCE.getResultSetStatus();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.DimensionID <em>Dimension ID</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.DimensionID
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl#getDimensionID()
		 * @generated
		 */
		EEnum DIMENSION_ID = eINSTANCE.getDimensionID();

	}

} //TestingPackagePackage
