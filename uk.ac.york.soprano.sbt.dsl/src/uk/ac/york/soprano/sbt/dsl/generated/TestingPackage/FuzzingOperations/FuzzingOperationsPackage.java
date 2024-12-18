/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations;

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
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperationsFactory
 * @model kind="package"
 * @generated
 */
public interface FuzzingOperationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "FuzzingOperations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "FuzzingOperations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FuzzingOperationsPackage eINSTANCE = uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationImpl <em>Fuzzing Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getFuzzingOperation()
	 * @generated
	 */
	int FUZZING_OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION__PRIORITY = 1;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION__ACTIVATION = 2;

	/**
	 * The feature id for the '<em><b>Messages From All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS = 3;

	/**
	 * The feature id for the '<em><b>From Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION__FROM_NODES = 4;

	/**
	 * The feature id for the '<em><b>Messages To All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION__MESSAGES_TO_ALL_COMPONENENTS = 5;

	/**
	 * The feature id for the '<em><b>To Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION__TO_NODES = 6;

	/**
	 * The feature id for the '<em><b>Node To Fuzz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION__NODE_TO_FUZZ = 7;

	/**
	 * The feature id for the '<em><b>All Publishing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION__ALL_PUBLISHING_VARS = 8;

	/**
	 * The feature id for the '<em><b>All Subscribing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION__ALL_SUBSCRIBING_VARS = 9;

	/**
	 * The feature id for the '<em><b>From Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION__FROM_TEMPLATE = 10;

	/**
	 * The feature id for the '<em><b>Containing Test</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION__CONTAINING_TEST = 11;

	/**
	 * The feature id for the '<em><b>Recorded Timings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION__RECORDED_TIMINGS = 12;

	/**
	 * The feature id for the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION__SEED = 13;

	/**
	 * The feature id for the '<em><b>Sequence Num In Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION__SEQUENCE_NUM_IN_TEST = 14;

	/**
	 * The feature id for the '<em><b>Inclusion Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION__INCLUSION_PROBABILITY = 15;

	/**
	 * The feature id for the '<em><b>Include In Timing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION__INCLUDE_IN_TIMING = 16;

	/**
	 * The feature id for the '<em><b>Condition Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION__CONDITION_CONSTRAINTS = 17;

	/**
	 * The number of structural features of the '<em>Fuzzing Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION_FEATURE_COUNT = 18;

	/**
	 * The operation id for the '<em>Dup</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION___DUP = 0;

	/**
	 * The operation id for the '<em>Find Reduction</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION___FIND_REDUCTION = 1;

	/**
	 * The number of operations of the '<em>Fuzzing Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.ActivationImpl <em>Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.ActivationImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getActivation()
	 * @generated
	 */
	int ACTIVATION = 1;

	/**
	 * The number of structural features of the '<em>Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.ConstantActivationImpl <em>Constant Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.ConstantActivationImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getConstantActivation()
	 * @generated
	 */
	int CONSTANT_ACTIVATION = 2;

	/**
	 * The number of structural features of the '<em>Constant Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_ACTIVATION_FEATURE_COUNT = ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Constant Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_ACTIVATION_OPERATION_COUNT = ACTIVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.DynamicActivationImpl <em>Dynamic Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.DynamicActivationImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getDynamicActivation()
	 * @generated
	 */
	int DYNAMIC_ACTIVATION = 3;

	/**
	 * The number of structural features of the '<em>Dynamic Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_ACTIVATION_FEATURE_COUNT = ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dynamic Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_ACTIVATION_OPERATION_COUNT = ACTIVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FixedTimeActivationImpl <em>Fixed Time Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FixedTimeActivationImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getFixedTimeActivation()
	 * @generated
	 */
	int FIXED_TIME_ACTIVATION = 4;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_TIME_ACTIVATION__START_TIME = DYNAMIC_ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_TIME_ACTIVATION__END_TIME = DYNAMIC_ACTIVATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fixed Time Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_TIME_ACTIVATION_FEATURE_COUNT = DYNAMIC_ACTIVATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Fixed Time Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_TIME_ACTIVATION_OPERATION_COUNT = DYNAMIC_ACTIVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.ConditionBasedActivationImpl <em>Condition Based Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.ConditionBasedActivationImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getConditionBasedActivation()
	 * @generated
	 */
	int CONDITION_BASED_ACTIVATION = 5;

	/**
	 * The feature id for the '<em><b>Starting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_BASED_ACTIVATION__STARTING = DYNAMIC_ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ending</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_BASED_ACTIVATION__ENDING = DYNAMIC_ACTIVATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Maximum Activations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_BASED_ACTIVATION__MAXIMUM_ACTIVATIONS = DYNAMIC_ACTIVATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Condition Based Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_BASED_ACTIVATION_FEATURE_COUNT = DYNAMIC_ACTIVATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Condition Based Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_BASED_ACTIVATION_OPERATION_COUNT = DYNAMIC_ACTIVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.ConditionBasedTimeLimitedImpl <em>Condition Based Time Limited</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.ConditionBasedTimeLimitedImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getConditionBasedTimeLimited()
	 * @generated
	 */
	int CONDITION_BASED_TIME_LIMITED = 6;

	/**
	 * The feature id for the '<em><b>Starting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_BASED_TIME_LIMITED__STARTING = DYNAMIC_ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_BASED_TIME_LIMITED__LENGTH = DYNAMIC_ACTIVATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Maximum Activations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_BASED_TIME_LIMITED__MAXIMUM_ACTIVATIONS = DYNAMIC_ACTIVATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Condition Based Time Limited</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_BASED_TIME_LIMITED_FEATURE_COUNT = DYNAMIC_ACTIVATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Condition Based Time Limited</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_BASED_TIME_LIMITED_OPERATION_COUNT = DYNAMIC_ACTIVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.VariableOperationImpl <em>Variable Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.VariableOperationImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getVariableOperation()
	 * @generated
	 */
	int VARIABLE_OPERATION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION__NAME = FUZZING_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION__PRIORITY = FUZZING_OPERATION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION__ACTIVATION = FUZZING_OPERATION__ACTIVATION;

	/**
	 * The feature id for the '<em><b>Messages From All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS = FUZZING_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>From Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION__FROM_NODES = FUZZING_OPERATION__FROM_NODES;

	/**
	 * The feature id for the '<em><b>Messages To All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION__MESSAGES_TO_ALL_COMPONENENTS = FUZZING_OPERATION__MESSAGES_TO_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>To Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION__TO_NODES = FUZZING_OPERATION__TO_NODES;

	/**
	 * The feature id for the '<em><b>Node To Fuzz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION__NODE_TO_FUZZ = FUZZING_OPERATION__NODE_TO_FUZZ;

	/**
	 * The feature id for the '<em><b>All Publishing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION__ALL_PUBLISHING_VARS = FUZZING_OPERATION__ALL_PUBLISHING_VARS;

	/**
	 * The feature id for the '<em><b>All Subscribing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION__ALL_SUBSCRIBING_VARS = FUZZING_OPERATION__ALL_SUBSCRIBING_VARS;

	/**
	 * The feature id for the '<em><b>From Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION__FROM_TEMPLATE = FUZZING_OPERATION__FROM_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Containing Test</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION__CONTAINING_TEST = FUZZING_OPERATION__CONTAINING_TEST;

	/**
	 * The feature id for the '<em><b>Recorded Timings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION__RECORDED_TIMINGS = FUZZING_OPERATION__RECORDED_TIMINGS;

	/**
	 * The feature id for the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION__SEED = FUZZING_OPERATION__SEED;

	/**
	 * The feature id for the '<em><b>Sequence Num In Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION__SEQUENCE_NUM_IN_TEST = FUZZING_OPERATION__SEQUENCE_NUM_IN_TEST;

	/**
	 * The feature id for the '<em><b>Inclusion Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION__INCLUSION_PROBABILITY = FUZZING_OPERATION__INCLUSION_PROBABILITY;

	/**
	 * The feature id for the '<em><b>Include In Timing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION__INCLUDE_IN_TIMING = FUZZING_OPERATION__INCLUDE_IN_TIMING;

	/**
	 * The feature id for the '<em><b>Condition Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION__CONDITION_CONSTRAINTS = FUZZING_OPERATION__CONDITION_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Variable To Affect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION__VARIABLE_TO_AFFECT = FUZZING_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_FEATURE_COUNT = FUZZING_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Dup</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION___DUP = FUZZING_OPERATION___DUP;

	/**
	 * The operation id for the '<em>Find Reduction</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION___FIND_REDUCTION = FUZZING_OPERATION___FIND_REDUCTION;

	/**
	 * The number of operations of the '<em>Variable Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_OPERATION_COUNT = FUZZING_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.CustomFuzzingOperationImpl <em>Custom Fuzzing Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.CustomFuzzingOperationImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getCustomFuzzingOperation()
	 * @generated
	 */
	int CUSTOM_FUZZING_OPERATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION__NAME = VARIABLE_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION__PRIORITY = VARIABLE_OPERATION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION__ACTIVATION = VARIABLE_OPERATION__ACTIVATION;

	/**
	 * The feature id for the '<em><b>Messages From All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS = VARIABLE_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>From Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION__FROM_NODES = VARIABLE_OPERATION__FROM_NODES;

	/**
	 * The feature id for the '<em><b>Messages To All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION__MESSAGES_TO_ALL_COMPONENENTS = VARIABLE_OPERATION__MESSAGES_TO_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>To Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION__TO_NODES = VARIABLE_OPERATION__TO_NODES;

	/**
	 * The feature id for the '<em><b>Node To Fuzz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION__NODE_TO_FUZZ = VARIABLE_OPERATION__NODE_TO_FUZZ;

	/**
	 * The feature id for the '<em><b>All Publishing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION__ALL_PUBLISHING_VARS = VARIABLE_OPERATION__ALL_PUBLISHING_VARS;

	/**
	 * The feature id for the '<em><b>All Subscribing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION__ALL_SUBSCRIBING_VARS = VARIABLE_OPERATION__ALL_SUBSCRIBING_VARS;

	/**
	 * The feature id for the '<em><b>From Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION__FROM_TEMPLATE = VARIABLE_OPERATION__FROM_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Containing Test</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION__CONTAINING_TEST = VARIABLE_OPERATION__CONTAINING_TEST;

	/**
	 * The feature id for the '<em><b>Recorded Timings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION__RECORDED_TIMINGS = VARIABLE_OPERATION__RECORDED_TIMINGS;

	/**
	 * The feature id for the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION__SEED = VARIABLE_OPERATION__SEED;

	/**
	 * The feature id for the '<em><b>Sequence Num In Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION__SEQUENCE_NUM_IN_TEST = VARIABLE_OPERATION__SEQUENCE_NUM_IN_TEST;

	/**
	 * The feature id for the '<em><b>Inclusion Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION__INCLUSION_PROBABILITY = VARIABLE_OPERATION__INCLUSION_PROBABILITY;

	/**
	 * The feature id for the '<em><b>Include In Timing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION__INCLUDE_IN_TIMING = VARIABLE_OPERATION__INCLUDE_IN_TIMING;

	/**
	 * The feature id for the '<em><b>Condition Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION__CONDITION_CONSTRAINTS = VARIABLE_OPERATION__CONDITION_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Variable To Affect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION__VARIABLE_TO_AFFECT = VARIABLE_OPERATION__VARIABLE_TO_AFFECT;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION__PARAMS = VARIABLE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Custom Process Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION__CUSTOM_PROCESS_CLASS = VARIABLE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Custom Fuzzing Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION_FEATURE_COUNT = VARIABLE_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Dup</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION___DUP = VARIABLE_OPERATION___DUP;

	/**
	 * The operation id for the '<em>Find Reduction</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION___FIND_REDUCTION = VARIABLE_OPERATION___FIND_REDUCTION;

	/**
	 * The number of operations of the '<em>Custom Fuzzing Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION_OPERATION_COUNT = VARIABLE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.RandomValueFuzzingOperationImpl <em>Random Value Fuzzing Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.RandomValueFuzzingOperationImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getRandomValueFuzzingOperation()
	 * @generated
	 */
	int RANDOM_VALUE_FUZZING_OPERATION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FUZZING_OPERATION__NAME = VARIABLE_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FUZZING_OPERATION__PRIORITY = VARIABLE_OPERATION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FUZZING_OPERATION__ACTIVATION = VARIABLE_OPERATION__ACTIVATION;

	/**
	 * The feature id for the '<em><b>Messages From All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FUZZING_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS = VARIABLE_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>From Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FUZZING_OPERATION__FROM_NODES = VARIABLE_OPERATION__FROM_NODES;

	/**
	 * The feature id for the '<em><b>Messages To All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FUZZING_OPERATION__MESSAGES_TO_ALL_COMPONENENTS = VARIABLE_OPERATION__MESSAGES_TO_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>To Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FUZZING_OPERATION__TO_NODES = VARIABLE_OPERATION__TO_NODES;

	/**
	 * The feature id for the '<em><b>Node To Fuzz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FUZZING_OPERATION__NODE_TO_FUZZ = VARIABLE_OPERATION__NODE_TO_FUZZ;

	/**
	 * The feature id for the '<em><b>All Publishing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FUZZING_OPERATION__ALL_PUBLISHING_VARS = VARIABLE_OPERATION__ALL_PUBLISHING_VARS;

	/**
	 * The feature id for the '<em><b>All Subscribing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FUZZING_OPERATION__ALL_SUBSCRIBING_VARS = VARIABLE_OPERATION__ALL_SUBSCRIBING_VARS;

	/**
	 * The feature id for the '<em><b>From Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FUZZING_OPERATION__FROM_TEMPLATE = VARIABLE_OPERATION__FROM_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Containing Test</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FUZZING_OPERATION__CONTAINING_TEST = VARIABLE_OPERATION__CONTAINING_TEST;

	/**
	 * The feature id for the '<em><b>Recorded Timings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FUZZING_OPERATION__RECORDED_TIMINGS = VARIABLE_OPERATION__RECORDED_TIMINGS;

	/**
	 * The feature id for the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FUZZING_OPERATION__SEED = VARIABLE_OPERATION__SEED;

	/**
	 * The feature id for the '<em><b>Sequence Num In Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FUZZING_OPERATION__SEQUENCE_NUM_IN_TEST = VARIABLE_OPERATION__SEQUENCE_NUM_IN_TEST;

	/**
	 * The feature id for the '<em><b>Inclusion Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FUZZING_OPERATION__INCLUSION_PROBABILITY = VARIABLE_OPERATION__INCLUSION_PROBABILITY;

	/**
	 * The feature id for the '<em><b>Include In Timing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FUZZING_OPERATION__INCLUDE_IN_TIMING = VARIABLE_OPERATION__INCLUDE_IN_TIMING;

	/**
	 * The feature id for the '<em><b>Condition Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FUZZING_OPERATION__CONDITION_CONSTRAINTS = VARIABLE_OPERATION__CONDITION_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Variable To Affect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FUZZING_OPERATION__VARIABLE_TO_AFFECT = VARIABLE_OPERATION__VARIABLE_TO_AFFECT;

	/**
	 * The number of structural features of the '<em>Random Value Fuzzing Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FUZZING_OPERATION_FEATURE_COUNT = VARIABLE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Dup</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FUZZING_OPERATION___DUP = VARIABLE_OPERATION___DUP;

	/**
	 * The operation id for the '<em>Find Reduction</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FUZZING_OPERATION___FIND_REDUCTION = VARIABLE_OPERATION___FIND_REDUCTION;

	/**
	 * The number of operations of the '<em>Random Value Fuzzing Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FUZZING_OPERATION_OPERATION_COUNT = VARIABLE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.RandomValueFromSetOperationImpl <em>Random Value From Set Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.RandomValueFromSetOperationImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getRandomValueFromSetOperation()
	 * @generated
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION__NAME = RANDOM_VALUE_FUZZING_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION__PRIORITY = RANDOM_VALUE_FUZZING_OPERATION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION__ACTIVATION = RANDOM_VALUE_FUZZING_OPERATION__ACTIVATION;

	/**
	 * The feature id for the '<em><b>Messages From All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS = RANDOM_VALUE_FUZZING_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>From Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION__FROM_NODES = RANDOM_VALUE_FUZZING_OPERATION__FROM_NODES;

	/**
	 * The feature id for the '<em><b>Messages To All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION__MESSAGES_TO_ALL_COMPONENENTS = RANDOM_VALUE_FUZZING_OPERATION__MESSAGES_TO_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>To Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION__TO_NODES = RANDOM_VALUE_FUZZING_OPERATION__TO_NODES;

	/**
	 * The feature id for the '<em><b>Node To Fuzz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION__NODE_TO_FUZZ = RANDOM_VALUE_FUZZING_OPERATION__NODE_TO_FUZZ;

	/**
	 * The feature id for the '<em><b>All Publishing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION__ALL_PUBLISHING_VARS = RANDOM_VALUE_FUZZING_OPERATION__ALL_PUBLISHING_VARS;

	/**
	 * The feature id for the '<em><b>All Subscribing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION__ALL_SUBSCRIBING_VARS = RANDOM_VALUE_FUZZING_OPERATION__ALL_SUBSCRIBING_VARS;

	/**
	 * The feature id for the '<em><b>From Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION__FROM_TEMPLATE = RANDOM_VALUE_FUZZING_OPERATION__FROM_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Containing Test</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION__CONTAINING_TEST = RANDOM_VALUE_FUZZING_OPERATION__CONTAINING_TEST;

	/**
	 * The feature id for the '<em><b>Recorded Timings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION__RECORDED_TIMINGS = RANDOM_VALUE_FUZZING_OPERATION__RECORDED_TIMINGS;

	/**
	 * The feature id for the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION__SEED = RANDOM_VALUE_FUZZING_OPERATION__SEED;

	/**
	 * The feature id for the '<em><b>Sequence Num In Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION__SEQUENCE_NUM_IN_TEST = RANDOM_VALUE_FUZZING_OPERATION__SEQUENCE_NUM_IN_TEST;

	/**
	 * The feature id for the '<em><b>Inclusion Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION__INCLUSION_PROBABILITY = RANDOM_VALUE_FUZZING_OPERATION__INCLUSION_PROBABILITY;

	/**
	 * The feature id for the '<em><b>Include In Timing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION__INCLUDE_IN_TIMING = RANDOM_VALUE_FUZZING_OPERATION__INCLUDE_IN_TIMING;

	/**
	 * The feature id for the '<em><b>Condition Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION__CONDITION_CONSTRAINTS = RANDOM_VALUE_FUZZING_OPERATION__CONDITION_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Variable To Affect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION__VARIABLE_TO_AFFECT = RANDOM_VALUE_FUZZING_OPERATION__VARIABLE_TO_AFFECT;

	/**
	 * The feature id for the '<em><b>Value Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION__VALUE_SET = RANDOM_VALUE_FUZZING_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Relative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION__IS_RELATIVE = RANDOM_VALUE_FUZZING_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Random Value From Set Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION_FEATURE_COUNT = RANDOM_VALUE_FUZZING_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Dup</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION___DUP = RANDOM_VALUE_FUZZING_OPERATION___DUP;

	/**
	 * The operation id for the '<em>Find Reduction</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION___FIND_REDUCTION = RANDOM_VALUE_FUZZING_OPERATION___FIND_REDUCTION;

	/**
	 * The number of operations of the '<em>Random Value From Set Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION_OPERATION_COUNT = RANDOM_VALUE_FUZZING_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.ValueSetImpl <em>Value Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.ValueSetImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getValueSet()
	 * @generated
	 */
	int VALUE_SET = 11;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET__PROPERTY_NAME = 0;

	/**
	 * The number of structural features of the '<em>Value Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Value Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.ValueRangeImpl <em>Value Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.ValueRangeImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getValueRange()
	 * @generated
	 */
	int VALUE_RANGE = 12;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RANGE__PROPERTY_NAME = VALUE_SET__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Rand Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RANGE__RAND_CHOICE = VALUE_SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RANGE_FEATURE_COUNT = VALUE_SET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Value Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RANGE_OPERATION_COUNT = VALUE_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.IntRangeImpl <em>Int Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.IntRangeImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getIntRange()
	 * @generated
	 */
	int INT_RANGE = 13;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_RANGE__PROPERTY_NAME = VALUE_RANGE__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Rand Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_RANGE__RAND_CHOICE = VALUE_RANGE__RAND_CHOICE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_RANGE__LOWER_BOUND = VALUE_RANGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_RANGE__UPPER_BOUND = VALUE_RANGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Int Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_RANGE_FEATURE_COUNT = VALUE_RANGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Int Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_RANGE_OPERATION_COUNT = VALUE_RANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.DoubleRangeImpl <em>Double Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.DoubleRangeImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getDoubleRange()
	 * @generated
	 */
	int DOUBLE_RANGE = 14;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_RANGE__PROPERTY_NAME = VALUE_RANGE__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Rand Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_RANGE__RAND_CHOICE = VALUE_RANGE__RAND_CHOICE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_RANGE__LOWER_BOUND = VALUE_RANGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_RANGE__UPPER_BOUND = VALUE_RANGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Double Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_RANGE_FEATURE_COUNT = VALUE_RANGE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Find Reduction</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_RANGE___FIND_REDUCTION = VALUE_RANGE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Double Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_RANGE_OPERATION_COUNT = VALUE_RANGE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.PointImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 15;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__Y = 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__Z = 2;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.PointRangeImpl <em>Point Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.PointRangeImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getPointRange()
	 * @generated
	 */
	int POINT_RANGE = 16;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_RANGE__PROPERTY_NAME = VALUE_RANGE__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Rand Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_RANGE__RAND_CHOICE = VALUE_RANGE__RAND_CHOICE;

	/**
	 * The feature id for the '<em><b>Min Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_RANGE__MIN_POINT = VALUE_RANGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_RANGE__MAX_POINT = VALUE_RANGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Point Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_RANGE_FEATURE_COUNT = VALUE_RANGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Point Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_RANGE_OPERATION_COUNT = VALUE_RANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.StringSetImpl <em>String Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.StringSetImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getStringSet()
	 * @generated
	 */
	int STRING_SET = 17;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SET__PROPERTY_NAME = VALUE_SET__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Choices</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SET__CHOICES = VALUE_SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SET_FEATURE_COUNT = VALUE_SET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SET_OPERATION_COUNT = VALUE_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.ExternalResourceSetImpl <em>External Resource Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.ExternalResourceSetImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getExternalResourceSet()
	 * @generated
	 */
	int EXTERNAL_RESOURCE_SET = 18;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_RESOURCE_SET__PROPERTY_NAME = VALUE_SET__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_RESOURCE_SET__LOCATION = VALUE_SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>External Resource Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_RESOURCE_SET_FEATURE_COUNT = VALUE_SET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>External Resource Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_RESOURCE_SET_OPERATION_COUNT = VALUE_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.NetworkFuzzingOperationImpl <em>Network Fuzzing Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.NetworkFuzzingOperationImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getNetworkFuzzingOperation()
	 * @generated
	 */
	int NETWORK_FUZZING_OPERATION = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FUZZING_OPERATION__NAME = FUZZING_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FUZZING_OPERATION__PRIORITY = FUZZING_OPERATION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FUZZING_OPERATION__ACTIVATION = FUZZING_OPERATION__ACTIVATION;

	/**
	 * The feature id for the '<em><b>Messages From All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FUZZING_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS = FUZZING_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>From Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FUZZING_OPERATION__FROM_NODES = FUZZING_OPERATION__FROM_NODES;

	/**
	 * The feature id for the '<em><b>Messages To All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FUZZING_OPERATION__MESSAGES_TO_ALL_COMPONENENTS = FUZZING_OPERATION__MESSAGES_TO_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>To Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FUZZING_OPERATION__TO_NODES = FUZZING_OPERATION__TO_NODES;

	/**
	 * The feature id for the '<em><b>Node To Fuzz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FUZZING_OPERATION__NODE_TO_FUZZ = FUZZING_OPERATION__NODE_TO_FUZZ;

	/**
	 * The feature id for the '<em><b>All Publishing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FUZZING_OPERATION__ALL_PUBLISHING_VARS = FUZZING_OPERATION__ALL_PUBLISHING_VARS;

	/**
	 * The feature id for the '<em><b>All Subscribing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FUZZING_OPERATION__ALL_SUBSCRIBING_VARS = FUZZING_OPERATION__ALL_SUBSCRIBING_VARS;

	/**
	 * The feature id for the '<em><b>From Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FUZZING_OPERATION__FROM_TEMPLATE = FUZZING_OPERATION__FROM_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Containing Test</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FUZZING_OPERATION__CONTAINING_TEST = FUZZING_OPERATION__CONTAINING_TEST;

	/**
	 * The feature id for the '<em><b>Recorded Timings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FUZZING_OPERATION__RECORDED_TIMINGS = FUZZING_OPERATION__RECORDED_TIMINGS;

	/**
	 * The feature id for the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FUZZING_OPERATION__SEED = FUZZING_OPERATION__SEED;

	/**
	 * The feature id for the '<em><b>Sequence Num In Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FUZZING_OPERATION__SEQUENCE_NUM_IN_TEST = FUZZING_OPERATION__SEQUENCE_NUM_IN_TEST;

	/**
	 * The feature id for the '<em><b>Inclusion Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FUZZING_OPERATION__INCLUSION_PROBABILITY = FUZZING_OPERATION__INCLUSION_PROBABILITY;

	/**
	 * The feature id for the '<em><b>Include In Timing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FUZZING_OPERATION__INCLUDE_IN_TIMING = FUZZING_OPERATION__INCLUDE_IN_TIMING;

	/**
	 * The feature id for the '<em><b>Condition Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FUZZING_OPERATION__CONDITION_CONSTRAINTS = FUZZING_OPERATION__CONDITION_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Variable To Affect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FUZZING_OPERATION__VARIABLE_TO_AFFECT = FUZZING_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Network Fuzzing Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FUZZING_OPERATION_FEATURE_COUNT = FUZZING_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Dup</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FUZZING_OPERATION___DUP = FUZZING_OPERATION___DUP;

	/**
	 * The operation id for the '<em>Find Reduction</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FUZZING_OPERATION___FIND_REDUCTION = FUZZING_OPERATION___FIND_REDUCTION;

	/**
	 * The number of operations of the '<em>Network Fuzzing Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FUZZING_OPERATION_OPERATION_COUNT = FUZZING_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.BlackholeNetworkOperationImpl <em>Blackhole Network Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.BlackholeNetworkOperationImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getBlackholeNetworkOperation()
	 * @generated
	 */
	int BLACKHOLE_NETWORK_OPERATION = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKHOLE_NETWORK_OPERATION__NAME = NETWORK_FUZZING_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKHOLE_NETWORK_OPERATION__PRIORITY = NETWORK_FUZZING_OPERATION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKHOLE_NETWORK_OPERATION__ACTIVATION = NETWORK_FUZZING_OPERATION__ACTIVATION;

	/**
	 * The feature id for the '<em><b>Messages From All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKHOLE_NETWORK_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS = NETWORK_FUZZING_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>From Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKHOLE_NETWORK_OPERATION__FROM_NODES = NETWORK_FUZZING_OPERATION__FROM_NODES;

	/**
	 * The feature id for the '<em><b>Messages To All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKHOLE_NETWORK_OPERATION__MESSAGES_TO_ALL_COMPONENENTS = NETWORK_FUZZING_OPERATION__MESSAGES_TO_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>To Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKHOLE_NETWORK_OPERATION__TO_NODES = NETWORK_FUZZING_OPERATION__TO_NODES;

	/**
	 * The feature id for the '<em><b>Node To Fuzz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKHOLE_NETWORK_OPERATION__NODE_TO_FUZZ = NETWORK_FUZZING_OPERATION__NODE_TO_FUZZ;

	/**
	 * The feature id for the '<em><b>All Publishing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKHOLE_NETWORK_OPERATION__ALL_PUBLISHING_VARS = NETWORK_FUZZING_OPERATION__ALL_PUBLISHING_VARS;

	/**
	 * The feature id for the '<em><b>All Subscribing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKHOLE_NETWORK_OPERATION__ALL_SUBSCRIBING_VARS = NETWORK_FUZZING_OPERATION__ALL_SUBSCRIBING_VARS;

	/**
	 * The feature id for the '<em><b>From Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKHOLE_NETWORK_OPERATION__FROM_TEMPLATE = NETWORK_FUZZING_OPERATION__FROM_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Containing Test</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKHOLE_NETWORK_OPERATION__CONTAINING_TEST = NETWORK_FUZZING_OPERATION__CONTAINING_TEST;

	/**
	 * The feature id for the '<em><b>Recorded Timings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKHOLE_NETWORK_OPERATION__RECORDED_TIMINGS = NETWORK_FUZZING_OPERATION__RECORDED_TIMINGS;

	/**
	 * The feature id for the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKHOLE_NETWORK_OPERATION__SEED = NETWORK_FUZZING_OPERATION__SEED;

	/**
	 * The feature id for the '<em><b>Sequence Num In Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKHOLE_NETWORK_OPERATION__SEQUENCE_NUM_IN_TEST = NETWORK_FUZZING_OPERATION__SEQUENCE_NUM_IN_TEST;

	/**
	 * The feature id for the '<em><b>Inclusion Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKHOLE_NETWORK_OPERATION__INCLUSION_PROBABILITY = NETWORK_FUZZING_OPERATION__INCLUSION_PROBABILITY;

	/**
	 * The feature id for the '<em><b>Include In Timing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKHOLE_NETWORK_OPERATION__INCLUDE_IN_TIMING = NETWORK_FUZZING_OPERATION__INCLUDE_IN_TIMING;

	/**
	 * The feature id for the '<em><b>Condition Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKHOLE_NETWORK_OPERATION__CONDITION_CONSTRAINTS = NETWORK_FUZZING_OPERATION__CONDITION_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Variable To Affect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKHOLE_NETWORK_OPERATION__VARIABLE_TO_AFFECT = NETWORK_FUZZING_OPERATION__VARIABLE_TO_AFFECT;

	/**
	 * The number of structural features of the '<em>Blackhole Network Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKHOLE_NETWORK_OPERATION_FEATURE_COUNT = NETWORK_FUZZING_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Dup</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKHOLE_NETWORK_OPERATION___DUP = NETWORK_FUZZING_OPERATION___DUP;

	/**
	 * The operation id for the '<em>Find Reduction</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKHOLE_NETWORK_OPERATION___FIND_REDUCTION = NETWORK_FUZZING_OPERATION___FIND_REDUCTION;

	/**
	 * The number of operations of the '<em>Blackhole Network Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKHOLE_NETWORK_OPERATION_OPERATION_COUNT = NETWORK_FUZZING_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.LatencyNetworkOperationImpl <em>Latency Network Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.LatencyNetworkOperationImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getLatencyNetworkOperation()
	 * @generated
	 */
	int LATENCY_NETWORK_OPERATION = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION__NAME = NETWORK_FUZZING_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION__PRIORITY = NETWORK_FUZZING_OPERATION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION__ACTIVATION = NETWORK_FUZZING_OPERATION__ACTIVATION;

	/**
	 * The feature id for the '<em><b>Messages From All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS = NETWORK_FUZZING_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>From Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION__FROM_NODES = NETWORK_FUZZING_OPERATION__FROM_NODES;

	/**
	 * The feature id for the '<em><b>Messages To All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION__MESSAGES_TO_ALL_COMPONENENTS = NETWORK_FUZZING_OPERATION__MESSAGES_TO_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>To Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION__TO_NODES = NETWORK_FUZZING_OPERATION__TO_NODES;

	/**
	 * The feature id for the '<em><b>Node To Fuzz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION__NODE_TO_FUZZ = NETWORK_FUZZING_OPERATION__NODE_TO_FUZZ;

	/**
	 * The feature id for the '<em><b>All Publishing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION__ALL_PUBLISHING_VARS = NETWORK_FUZZING_OPERATION__ALL_PUBLISHING_VARS;

	/**
	 * The feature id for the '<em><b>All Subscribing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION__ALL_SUBSCRIBING_VARS = NETWORK_FUZZING_OPERATION__ALL_SUBSCRIBING_VARS;

	/**
	 * The feature id for the '<em><b>From Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION__FROM_TEMPLATE = NETWORK_FUZZING_OPERATION__FROM_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Containing Test</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION__CONTAINING_TEST = NETWORK_FUZZING_OPERATION__CONTAINING_TEST;

	/**
	 * The feature id for the '<em><b>Recorded Timings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION__RECORDED_TIMINGS = NETWORK_FUZZING_OPERATION__RECORDED_TIMINGS;

	/**
	 * The feature id for the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION__SEED = NETWORK_FUZZING_OPERATION__SEED;

	/**
	 * The feature id for the '<em><b>Sequence Num In Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION__SEQUENCE_NUM_IN_TEST = NETWORK_FUZZING_OPERATION__SEQUENCE_NUM_IN_TEST;

	/**
	 * The feature id for the '<em><b>Inclusion Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION__INCLUSION_PROBABILITY = NETWORK_FUZZING_OPERATION__INCLUSION_PROBABILITY;

	/**
	 * The feature id for the '<em><b>Include In Timing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION__INCLUDE_IN_TIMING = NETWORK_FUZZING_OPERATION__INCLUDE_IN_TIMING;

	/**
	 * The feature id for the '<em><b>Condition Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION__CONDITION_CONSTRAINTS = NETWORK_FUZZING_OPERATION__CONDITION_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Variable To Affect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION__VARIABLE_TO_AFFECT = NETWORK_FUZZING_OPERATION__VARIABLE_TO_AFFECT;

	/**
	 * The feature id for the '<em><b>Latency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION__LATENCY = NETWORK_FUZZING_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Randomised</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION__RANDOMISED = NETWORK_FUZZING_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Latency Network Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION_FEATURE_COUNT = NETWORK_FUZZING_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Dup</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION___DUP = NETWORK_FUZZING_OPERATION___DUP;

	/**
	 * The operation id for the '<em>Find Reduction</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION___FIND_REDUCTION = NETWORK_FUZZING_OPERATION___FIND_REDUCTION;

	/**
	 * The number of operations of the '<em>Latency Network Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION_OPERATION_COUNT = NETWORK_FUZZING_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.PacketLossNetworkOperationImpl <em>Packet Loss Network Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.PacketLossNetworkOperationImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getPacketLossNetworkOperation()
	 * @generated
	 */
	int PACKET_LOSS_NETWORK_OPERATION = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_LOSS_NETWORK_OPERATION__NAME = NETWORK_FUZZING_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_LOSS_NETWORK_OPERATION__PRIORITY = NETWORK_FUZZING_OPERATION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_LOSS_NETWORK_OPERATION__ACTIVATION = NETWORK_FUZZING_OPERATION__ACTIVATION;

	/**
	 * The feature id for the '<em><b>Messages From All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_LOSS_NETWORK_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS = NETWORK_FUZZING_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>From Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_LOSS_NETWORK_OPERATION__FROM_NODES = NETWORK_FUZZING_OPERATION__FROM_NODES;

	/**
	 * The feature id for the '<em><b>Messages To All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_LOSS_NETWORK_OPERATION__MESSAGES_TO_ALL_COMPONENENTS = NETWORK_FUZZING_OPERATION__MESSAGES_TO_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>To Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_LOSS_NETWORK_OPERATION__TO_NODES = NETWORK_FUZZING_OPERATION__TO_NODES;

	/**
	 * The feature id for the '<em><b>Node To Fuzz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_LOSS_NETWORK_OPERATION__NODE_TO_FUZZ = NETWORK_FUZZING_OPERATION__NODE_TO_FUZZ;

	/**
	 * The feature id for the '<em><b>All Publishing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_LOSS_NETWORK_OPERATION__ALL_PUBLISHING_VARS = NETWORK_FUZZING_OPERATION__ALL_PUBLISHING_VARS;

	/**
	 * The feature id for the '<em><b>All Subscribing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_LOSS_NETWORK_OPERATION__ALL_SUBSCRIBING_VARS = NETWORK_FUZZING_OPERATION__ALL_SUBSCRIBING_VARS;

	/**
	 * The feature id for the '<em><b>From Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_LOSS_NETWORK_OPERATION__FROM_TEMPLATE = NETWORK_FUZZING_OPERATION__FROM_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Containing Test</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_LOSS_NETWORK_OPERATION__CONTAINING_TEST = NETWORK_FUZZING_OPERATION__CONTAINING_TEST;

	/**
	 * The feature id for the '<em><b>Recorded Timings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_LOSS_NETWORK_OPERATION__RECORDED_TIMINGS = NETWORK_FUZZING_OPERATION__RECORDED_TIMINGS;

	/**
	 * The feature id for the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_LOSS_NETWORK_OPERATION__SEED = NETWORK_FUZZING_OPERATION__SEED;

	/**
	 * The feature id for the '<em><b>Sequence Num In Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_LOSS_NETWORK_OPERATION__SEQUENCE_NUM_IN_TEST = NETWORK_FUZZING_OPERATION__SEQUENCE_NUM_IN_TEST;

	/**
	 * The feature id for the '<em><b>Inclusion Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_LOSS_NETWORK_OPERATION__INCLUSION_PROBABILITY = NETWORK_FUZZING_OPERATION__INCLUSION_PROBABILITY;

	/**
	 * The feature id for the '<em><b>Include In Timing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_LOSS_NETWORK_OPERATION__INCLUDE_IN_TIMING = NETWORK_FUZZING_OPERATION__INCLUDE_IN_TIMING;

	/**
	 * The feature id for the '<em><b>Condition Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_LOSS_NETWORK_OPERATION__CONDITION_CONSTRAINTS = NETWORK_FUZZING_OPERATION__CONDITION_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Variable To Affect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_LOSS_NETWORK_OPERATION__VARIABLE_TO_AFFECT = NETWORK_FUZZING_OPERATION__VARIABLE_TO_AFFECT;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_LOSS_NETWORK_OPERATION__FREQUENCY = NETWORK_FUZZING_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Packet Loss Network Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_LOSS_NETWORK_OPERATION_FEATURE_COUNT = NETWORK_FUZZING_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Dup</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_LOSS_NETWORK_OPERATION___DUP = NETWORK_FUZZING_OPERATION___DUP;

	/**
	 * The operation id for the '<em>Find Reduction</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_LOSS_NETWORK_OPERATION___FIND_REDUCTION = NETWORK_FUZZING_OPERATION___FIND_REDUCTION;

	/**
	 * The number of operations of the '<em>Packet Loss Network Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_LOSS_NETWORK_OPERATION_OPERATION_COUNT = NETWORK_FUZZING_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.MultipleMessagesNetworkOperationImpl <em>Multiple Messages Network Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.MultipleMessagesNetworkOperationImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getMultipleMessagesNetworkOperation()
	 * @generated
	 */
	int MULTIPLE_MESSAGES_NETWORK_OPERATION = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_MESSAGES_NETWORK_OPERATION__NAME = NETWORK_FUZZING_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_MESSAGES_NETWORK_OPERATION__PRIORITY = NETWORK_FUZZING_OPERATION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_MESSAGES_NETWORK_OPERATION__ACTIVATION = NETWORK_FUZZING_OPERATION__ACTIVATION;

	/**
	 * The feature id for the '<em><b>Messages From All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_MESSAGES_NETWORK_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS = NETWORK_FUZZING_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>From Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_MESSAGES_NETWORK_OPERATION__FROM_NODES = NETWORK_FUZZING_OPERATION__FROM_NODES;

	/**
	 * The feature id for the '<em><b>Messages To All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_MESSAGES_NETWORK_OPERATION__MESSAGES_TO_ALL_COMPONENENTS = NETWORK_FUZZING_OPERATION__MESSAGES_TO_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>To Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_MESSAGES_NETWORK_OPERATION__TO_NODES = NETWORK_FUZZING_OPERATION__TO_NODES;

	/**
	 * The feature id for the '<em><b>Node To Fuzz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_MESSAGES_NETWORK_OPERATION__NODE_TO_FUZZ = NETWORK_FUZZING_OPERATION__NODE_TO_FUZZ;

	/**
	 * The feature id for the '<em><b>All Publishing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_MESSAGES_NETWORK_OPERATION__ALL_PUBLISHING_VARS = NETWORK_FUZZING_OPERATION__ALL_PUBLISHING_VARS;

	/**
	 * The feature id for the '<em><b>All Subscribing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_MESSAGES_NETWORK_OPERATION__ALL_SUBSCRIBING_VARS = NETWORK_FUZZING_OPERATION__ALL_SUBSCRIBING_VARS;

	/**
	 * The feature id for the '<em><b>From Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_MESSAGES_NETWORK_OPERATION__FROM_TEMPLATE = NETWORK_FUZZING_OPERATION__FROM_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Containing Test</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_MESSAGES_NETWORK_OPERATION__CONTAINING_TEST = NETWORK_FUZZING_OPERATION__CONTAINING_TEST;

	/**
	 * The feature id for the '<em><b>Recorded Timings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_MESSAGES_NETWORK_OPERATION__RECORDED_TIMINGS = NETWORK_FUZZING_OPERATION__RECORDED_TIMINGS;

	/**
	 * The feature id for the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_MESSAGES_NETWORK_OPERATION__SEED = NETWORK_FUZZING_OPERATION__SEED;

	/**
	 * The feature id for the '<em><b>Sequence Num In Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_MESSAGES_NETWORK_OPERATION__SEQUENCE_NUM_IN_TEST = NETWORK_FUZZING_OPERATION__SEQUENCE_NUM_IN_TEST;

	/**
	 * The feature id for the '<em><b>Inclusion Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_MESSAGES_NETWORK_OPERATION__INCLUSION_PROBABILITY = NETWORK_FUZZING_OPERATION__INCLUSION_PROBABILITY;

	/**
	 * The feature id for the '<em><b>Include In Timing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_MESSAGES_NETWORK_OPERATION__INCLUDE_IN_TIMING = NETWORK_FUZZING_OPERATION__INCLUDE_IN_TIMING;

	/**
	 * The feature id for the '<em><b>Condition Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_MESSAGES_NETWORK_OPERATION__CONDITION_CONSTRAINTS = NETWORK_FUZZING_OPERATION__CONDITION_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Variable To Affect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_MESSAGES_NETWORK_OPERATION__VARIABLE_TO_AFFECT = NETWORK_FUZZING_OPERATION__VARIABLE_TO_AFFECT;

	/**
	 * The feature id for the '<em><b>How Many Clones</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_MESSAGES_NETWORK_OPERATION__HOW_MANY_CLONES = NETWORK_FUZZING_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multiple Messages Network Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_MESSAGES_NETWORK_OPERATION_FEATURE_COUNT = NETWORK_FUZZING_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Dup</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_MESSAGES_NETWORK_OPERATION___DUP = NETWORK_FUZZING_OPERATION___DUP;

	/**
	 * The operation id for the '<em>Find Reduction</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_MESSAGES_NETWORK_OPERATION___FIND_REDUCTION = NETWORK_FUZZING_OPERATION___FIND_REDUCTION;

	/**
	 * The number of operations of the '<em>Multiple Messages Network Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_MESSAGES_NETWORK_OPERATION_OPERATION_COUNT = NETWORK_FUZZING_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.RandomValueFromSetChoice <em>Random Value From Set Choice</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.RandomValueFromSetChoice
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getRandomValueFromSetChoice()
	 * @generated
	 */
	int RANDOM_VALUE_FROM_SET_CHOICE = 24;


	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation <em>Fuzzing Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuzzing Operation</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation
	 * @generated
	 */
	EClass getFuzzingOperation();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation#getName()
	 * @see #getFuzzingOperation()
	 * @generated
	 */
	EAttribute getFuzzingOperation_Name();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation#getPriority()
	 * @see #getFuzzingOperation()
	 * @generated
	 */
	EAttribute getFuzzingOperation_Priority();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation#getActivation <em>Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activation</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation#getActivation()
	 * @see #getFuzzingOperation()
	 * @generated
	 */
	EReference getFuzzingOperation_Activation();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation#isMessagesFromAllComponenents <em>Messages From All Componenents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Messages From All Componenents</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation#isMessagesFromAllComponenents()
	 * @see #getFuzzingOperation()
	 * @generated
	 */
	EAttribute getFuzzingOperation_MessagesFromAllComponenents();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation#getFromNodes <em>From Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From Nodes</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation#getFromNodes()
	 * @see #getFuzzingOperation()
	 * @generated
	 */
	EReference getFuzzingOperation_FromNodes();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation#isMessagesToAllComponenents <em>Messages To All Componenents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Messages To All Componenents</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation#isMessagesToAllComponenents()
	 * @see #getFuzzingOperation()
	 * @generated
	 */
	EAttribute getFuzzingOperation_MessagesToAllComponenents();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation#getToNodes <em>To Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To Nodes</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation#getToNodes()
	 * @see #getFuzzingOperation()
	 * @generated
	 */
	EReference getFuzzingOperation_ToNodes();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation#getNodeToFuzz <em>Node To Fuzz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node To Fuzz</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation#getNodeToFuzz()
	 * @see #getFuzzingOperation()
	 * @generated
	 */
	EReference getFuzzingOperation_NodeToFuzz();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation#isAllPublishingVars <em>All Publishing Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All Publishing Vars</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation#isAllPublishingVars()
	 * @see #getFuzzingOperation()
	 * @generated
	 */
	EAttribute getFuzzingOperation_AllPublishingVars();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation#isAllSubscribingVars <em>All Subscribing Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All Subscribing Vars</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation#isAllSubscribingVars()
	 * @see #getFuzzingOperation()
	 * @generated
	 */
	EAttribute getFuzzingOperation_AllSubscribingVars();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation#getFromTemplate <em>From Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Template</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation#getFromTemplate()
	 * @see #getFuzzingOperation()
	 * @generated
	 */
	EReference getFuzzingOperation_FromTemplate();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation#getContainingTest <em>Containing Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Containing Test</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation#getContainingTest()
	 * @see #getFuzzingOperation()
	 * @generated
	 */
	EReference getFuzzingOperation_ContainingTest();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation#getRecordedTimings <em>Recorded Timings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Recorded Timings</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation#getRecordedTimings()
	 * @see #getFuzzingOperation()
	 * @generated
	 */
	EReference getFuzzingOperation_RecordedTimings();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation#getSeed <em>Seed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seed</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation#getSeed()
	 * @see #getFuzzingOperation()
	 * @generated
	 */
	EAttribute getFuzzingOperation_Seed();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation#getSequenceNumInTest <em>Sequence Num In Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num In Test</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation#getSequenceNumInTest()
	 * @see #getFuzzingOperation()
	 * @generated
	 */
	EAttribute getFuzzingOperation_SequenceNumInTest();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation#getInclusionProbability <em>Inclusion Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inclusion Probability</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation#getInclusionProbability()
	 * @see #getFuzzingOperation()
	 * @generated
	 */
	EAttribute getFuzzingOperation_InclusionProbability();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation#isIncludeInTiming <em>Include In Timing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include In Timing</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation#isIncludeInTiming()
	 * @see #getFuzzingOperation()
	 * @generated
	 */
	EAttribute getFuzzingOperation_IncludeInTiming();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation#getConditionConstraints <em>Condition Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Condition Constraints</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation#getConditionConstraints()
	 * @see #getFuzzingOperation()
	 * @generated
	 */
	EReference getFuzzingOperation_ConditionConstraints();

	/**
	 * Returns the meta object for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation#dup() <em>Dup</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dup</em>' operation.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation#dup()
	 * @generated
	 */
	EOperation getFuzzingOperation__Dup();

	/**
	 * Returns the meta object for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation#findReduction() <em>Find Reduction</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Reduction</em>' operation.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation#findReduction()
	 * @generated
	 */
	EOperation getFuzzingOperation__FindReduction();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.Activation <em>Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activation</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.Activation
	 * @generated
	 */
	EClass getActivation();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ConstantActivation <em>Constant Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Activation</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ConstantActivation
	 * @generated
	 */
	EClass getConstantActivation();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.DynamicActivation <em>Dynamic Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Activation</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.DynamicActivation
	 * @generated
	 */
	EClass getDynamicActivation();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FixedTimeActivation <em>Fixed Time Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Time Activation</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FixedTimeActivation
	 * @generated
	 */
	EClass getFixedTimeActivation();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FixedTimeActivation#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FixedTimeActivation#getStartTime()
	 * @see #getFixedTimeActivation()
	 * @generated
	 */
	EAttribute getFixedTimeActivation_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FixedTimeActivation#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FixedTimeActivation#getEndTime()
	 * @see #getFixedTimeActivation()
	 * @generated
	 */
	EAttribute getFixedTimeActivation_EndTime();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ConditionBasedActivation <em>Condition Based Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Based Activation</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ConditionBasedActivation
	 * @generated
	 */
	EClass getConditionBasedActivation();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ConditionBasedActivation#getStarting <em>Starting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Starting</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ConditionBasedActivation#getStarting()
	 * @see #getConditionBasedActivation()
	 * @generated
	 */
	EReference getConditionBasedActivation_Starting();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ConditionBasedActivation#getEnding <em>Ending</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ending</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ConditionBasedActivation#getEnding()
	 * @see #getConditionBasedActivation()
	 * @generated
	 */
	EReference getConditionBasedActivation_Ending();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ConditionBasedActivation#getMaximumActivations <em>Maximum Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Activations</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ConditionBasedActivation#getMaximumActivations()
	 * @see #getConditionBasedActivation()
	 * @generated
	 */
	EAttribute getConditionBasedActivation_MaximumActivations();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ConditionBasedTimeLimited <em>Condition Based Time Limited</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Based Time Limited</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ConditionBasedTimeLimited
	 * @generated
	 */
	EClass getConditionBasedTimeLimited();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ConditionBasedTimeLimited#getStarting <em>Starting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Starting</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ConditionBasedTimeLimited#getStarting()
	 * @see #getConditionBasedTimeLimited()
	 * @generated
	 */
	EReference getConditionBasedTimeLimited_Starting();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ConditionBasedTimeLimited#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ConditionBasedTimeLimited#getLength()
	 * @see #getConditionBasedTimeLimited()
	 * @generated
	 */
	EAttribute getConditionBasedTimeLimited_Length();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ConditionBasedTimeLimited#getMaximumActivations <em>Maximum Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Activations</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ConditionBasedTimeLimited#getMaximumActivations()
	 * @see #getConditionBasedTimeLimited()
	 * @generated
	 */
	EAttribute getConditionBasedTimeLimited_MaximumActivations();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.VariableOperation <em>Variable Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Operation</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.VariableOperation
	 * @generated
	 */
	EClass getVariableOperation();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.VariableOperation#getVariableToAffect <em>Variable To Affect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable To Affect</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.VariableOperation#getVariableToAffect()
	 * @see #getVariableOperation()
	 * @generated
	 */
	EReference getVariableOperation_VariableToAffect();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.CustomFuzzingOperation <em>Custom Fuzzing Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Fuzzing Operation</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.CustomFuzzingOperation
	 * @generated
	 */
	EClass getCustomFuzzingOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.CustomFuzzingOperation#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.CustomFuzzingOperation#getParams()
	 * @see #getCustomFuzzingOperation()
	 * @generated
	 */
	EReference getCustomFuzzingOperation_Params();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.CustomFuzzingOperation#getCustomProcessClass <em>Custom Process Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Process Class</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.CustomFuzzingOperation#getCustomProcessClass()
	 * @see #getCustomFuzzingOperation()
	 * @generated
	 */
	EAttribute getCustomFuzzingOperation_CustomProcessClass();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.RandomValueFuzzingOperation <em>Random Value Fuzzing Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Random Value Fuzzing Operation</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.RandomValueFuzzingOperation
	 * @generated
	 */
	EClass getRandomValueFuzzingOperation();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.RandomValueFromSetOperation <em>Random Value From Set Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Random Value From Set Operation</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.RandomValueFromSetOperation
	 * @generated
	 */
	EClass getRandomValueFromSetOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.RandomValueFromSetOperation#getValueSet <em>Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Set</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.RandomValueFromSetOperation#getValueSet()
	 * @see #getRandomValueFromSetOperation()
	 * @generated
	 */
	EReference getRandomValueFromSetOperation_ValueSet();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.RandomValueFromSetOperation#isIsRelative <em>Is Relative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Relative</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.RandomValueFromSetOperation#isIsRelative()
	 * @see #getRandomValueFromSetOperation()
	 * @generated
	 */
	EAttribute getRandomValueFromSetOperation_IsRelative();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ValueSet <em>Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Set</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ValueSet
	 * @generated
	 */
	EClass getValueSet();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ValueSet#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ValueSet#getPropertyName()
	 * @see #getValueSet()
	 * @generated
	 */
	EAttribute getValueSet_PropertyName();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ValueRange <em>Value Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Range</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ValueRange
	 * @generated
	 */
	EClass getValueRange();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ValueRange#getRandChoice <em>Rand Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rand Choice</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ValueRange#getRandChoice()
	 * @see #getValueRange()
	 * @generated
	 */
	EAttribute getValueRange_RandChoice();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.IntRange <em>Int Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Range</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.IntRange
	 * @generated
	 */
	EClass getIntRange();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.IntRange#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.IntRange#getLowerBound()
	 * @see #getIntRange()
	 * @generated
	 */
	EAttribute getIntRange_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.IntRange#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.IntRange#getUpperBound()
	 * @see #getIntRange()
	 * @generated
	 */
	EAttribute getIntRange_UpperBound();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.DoubleRange <em>Double Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Range</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.DoubleRange
	 * @generated
	 */
	EClass getDoubleRange();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.DoubleRange#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.DoubleRange#getLowerBound()
	 * @see #getDoubleRange()
	 * @generated
	 */
	EAttribute getDoubleRange_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.DoubleRange#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.DoubleRange#getUpperBound()
	 * @see #getDoubleRange()
	 * @generated
	 */
	EAttribute getDoubleRange_UpperBound();

	/**
	 * Returns the meta object for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.DoubleRange#findReduction() <em>Find Reduction</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Reduction</em>' operation.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.DoubleRange#findReduction()
	 * @generated
	 */
	EOperation getDoubleRange__FindReduction();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.Point#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.Point#getX()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_X();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.Point#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.Point#getY()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Y();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.Point#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.Point#getZ()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Z();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.PointRange <em>Point Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point Range</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.PointRange
	 * @generated
	 */
	EClass getPointRange();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.PointRange#getMinPoint <em>Min Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min Point</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.PointRange#getMinPoint()
	 * @see #getPointRange()
	 * @generated
	 */
	EReference getPointRange_MinPoint();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.PointRange#getMaxPoint <em>Max Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Point</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.PointRange#getMaxPoint()
	 * @see #getPointRange()
	 * @generated
	 */
	EReference getPointRange_MaxPoint();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.StringSet <em>String Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Set</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.StringSet
	 * @generated
	 */
	EClass getStringSet();

	/**
	 * Returns the meta object for the attribute list '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.StringSet#getChoices <em>Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Choices</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.StringSet#getChoices()
	 * @see #getStringSet()
	 * @generated
	 */
	EAttribute getStringSet_Choices();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ExternalResourceSet <em>External Resource Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Resource Set</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ExternalResourceSet
	 * @generated
	 */
	EClass getExternalResourceSet();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ExternalResourceSet#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ExternalResourceSet#getLocation()
	 * @see #getExternalResourceSet()
	 * @generated
	 */
	EAttribute getExternalResourceSet_Location();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.NetworkFuzzingOperation <em>Network Fuzzing Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Fuzzing Operation</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.NetworkFuzzingOperation
	 * @generated
	 */
	EClass getNetworkFuzzingOperation();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.NetworkFuzzingOperation#getVariableToAffect <em>Variable To Affect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable To Affect</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.NetworkFuzzingOperation#getVariableToAffect()
	 * @see #getNetworkFuzzingOperation()
	 * @generated
	 */
	EReference getNetworkFuzzingOperation_VariableToAffect();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.BlackholeNetworkOperation <em>Blackhole Network Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blackhole Network Operation</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.BlackholeNetworkOperation
	 * @generated
	 */
	EClass getBlackholeNetworkOperation();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.LatencyNetworkOperation <em>Latency Network Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Latency Network Operation</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.LatencyNetworkOperation
	 * @generated
	 */
	EClass getLatencyNetworkOperation();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.LatencyNetworkOperation#getLatency <em>Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Latency</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.LatencyNetworkOperation#getLatency()
	 * @see #getLatencyNetworkOperation()
	 * @generated
	 */
	EReference getLatencyNetworkOperation_Latency();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.LatencyNetworkOperation#isRandomised <em>Randomised</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Randomised</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.LatencyNetworkOperation#isRandomised()
	 * @see #getLatencyNetworkOperation()
	 * @generated
	 */
	EAttribute getLatencyNetworkOperation_Randomised();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.PacketLossNetworkOperation <em>Packet Loss Network Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Packet Loss Network Operation</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.PacketLossNetworkOperation
	 * @generated
	 */
	EClass getPacketLossNetworkOperation();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.PacketLossNetworkOperation#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Frequency</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.PacketLossNetworkOperation#getFrequency()
	 * @see #getPacketLossNetworkOperation()
	 * @generated
	 */
	EReference getPacketLossNetworkOperation_Frequency();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.MultipleMessagesNetworkOperation <em>Multiple Messages Network Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Messages Network Operation</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.MultipleMessagesNetworkOperation
	 * @generated
	 */
	EClass getMultipleMessagesNetworkOperation();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.MultipleMessagesNetworkOperation#getHowManyClones <em>How Many Clones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>How Many Clones</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.MultipleMessagesNetworkOperation#getHowManyClones()
	 * @see #getMultipleMessagesNetworkOperation()
	 * @generated
	 */
	EReference getMultipleMessagesNetworkOperation_HowManyClones();

	/**
	 * Returns the meta object for enum '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.RandomValueFromSetChoice <em>Random Value From Set Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Random Value From Set Choice</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.RandomValueFromSetChoice
	 * @generated
	 */
	EEnum getRandomValueFromSetChoice();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FuzzingOperationsFactory getFuzzingOperationsFactory();

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
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationImpl <em>Fuzzing Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getFuzzingOperation()
		 * @generated
		 */
		EClass FUZZING_OPERATION = eINSTANCE.getFuzzingOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUZZING_OPERATION__NAME = eINSTANCE.getFuzzingOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUZZING_OPERATION__PRIORITY = eINSTANCE.getFuzzingOperation_Priority();

		/**
		 * The meta object literal for the '<em><b>Activation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUZZING_OPERATION__ACTIVATION = eINSTANCE.getFuzzingOperation_Activation();

		/**
		 * The meta object literal for the '<em><b>Messages From All Componenents</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUZZING_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS = eINSTANCE.getFuzzingOperation_MessagesFromAllComponenents();

		/**
		 * The meta object literal for the '<em><b>From Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUZZING_OPERATION__FROM_NODES = eINSTANCE.getFuzzingOperation_FromNodes();

		/**
		 * The meta object literal for the '<em><b>Messages To All Componenents</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUZZING_OPERATION__MESSAGES_TO_ALL_COMPONENENTS = eINSTANCE.getFuzzingOperation_MessagesToAllComponenents();

		/**
		 * The meta object literal for the '<em><b>To Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUZZING_OPERATION__TO_NODES = eINSTANCE.getFuzzingOperation_ToNodes();

		/**
		 * The meta object literal for the '<em><b>Node To Fuzz</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUZZING_OPERATION__NODE_TO_FUZZ = eINSTANCE.getFuzzingOperation_NodeToFuzz();

		/**
		 * The meta object literal for the '<em><b>All Publishing Vars</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUZZING_OPERATION__ALL_PUBLISHING_VARS = eINSTANCE.getFuzzingOperation_AllPublishingVars();

		/**
		 * The meta object literal for the '<em><b>All Subscribing Vars</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUZZING_OPERATION__ALL_SUBSCRIBING_VARS = eINSTANCE.getFuzzingOperation_AllSubscribingVars();

		/**
		 * The meta object literal for the '<em><b>From Template</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUZZING_OPERATION__FROM_TEMPLATE = eINSTANCE.getFuzzingOperation_FromTemplate();

		/**
		 * The meta object literal for the '<em><b>Containing Test</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUZZING_OPERATION__CONTAINING_TEST = eINSTANCE.getFuzzingOperation_ContainingTest();

		/**
		 * The meta object literal for the '<em><b>Recorded Timings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUZZING_OPERATION__RECORDED_TIMINGS = eINSTANCE.getFuzzingOperation_RecordedTimings();

		/**
		 * The meta object literal for the '<em><b>Seed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUZZING_OPERATION__SEED = eINSTANCE.getFuzzingOperation_Seed();

		/**
		 * The meta object literal for the '<em><b>Sequence Num In Test</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUZZING_OPERATION__SEQUENCE_NUM_IN_TEST = eINSTANCE.getFuzzingOperation_SequenceNumInTest();

		/**
		 * The meta object literal for the '<em><b>Inclusion Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUZZING_OPERATION__INCLUSION_PROBABILITY = eINSTANCE.getFuzzingOperation_InclusionProbability();

		/**
		 * The meta object literal for the '<em><b>Include In Timing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUZZING_OPERATION__INCLUDE_IN_TIMING = eINSTANCE.getFuzzingOperation_IncludeInTiming();

		/**
		 * The meta object literal for the '<em><b>Condition Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUZZING_OPERATION__CONDITION_CONSTRAINTS = eINSTANCE.getFuzzingOperation_ConditionConstraints();

		/**
		 * The meta object literal for the '<em><b>Dup</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FUZZING_OPERATION___DUP = eINSTANCE.getFuzzingOperation__Dup();

		/**
		 * The meta object literal for the '<em><b>Find Reduction</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FUZZING_OPERATION___FIND_REDUCTION = eINSTANCE.getFuzzingOperation__FindReduction();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.ActivationImpl <em>Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.ActivationImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getActivation()
		 * @generated
		 */
		EClass ACTIVATION = eINSTANCE.getActivation();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.ConstantActivationImpl <em>Constant Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.ConstantActivationImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getConstantActivation()
		 * @generated
		 */
		EClass CONSTANT_ACTIVATION = eINSTANCE.getConstantActivation();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.DynamicActivationImpl <em>Dynamic Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.DynamicActivationImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getDynamicActivation()
		 * @generated
		 */
		EClass DYNAMIC_ACTIVATION = eINSTANCE.getDynamicActivation();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FixedTimeActivationImpl <em>Fixed Time Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FixedTimeActivationImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getFixedTimeActivation()
		 * @generated
		 */
		EClass FIXED_TIME_ACTIVATION = eINSTANCE.getFixedTimeActivation();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_TIME_ACTIVATION__START_TIME = eINSTANCE.getFixedTimeActivation_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_TIME_ACTIVATION__END_TIME = eINSTANCE.getFixedTimeActivation_EndTime();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.ConditionBasedActivationImpl <em>Condition Based Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.ConditionBasedActivationImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getConditionBasedActivation()
		 * @generated
		 */
		EClass CONDITION_BASED_ACTIVATION = eINSTANCE.getConditionBasedActivation();

		/**
		 * The meta object literal for the '<em><b>Starting</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_BASED_ACTIVATION__STARTING = eINSTANCE.getConditionBasedActivation_Starting();

		/**
		 * The meta object literal for the '<em><b>Ending</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_BASED_ACTIVATION__ENDING = eINSTANCE.getConditionBasedActivation_Ending();

		/**
		 * The meta object literal for the '<em><b>Maximum Activations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_BASED_ACTIVATION__MAXIMUM_ACTIVATIONS = eINSTANCE.getConditionBasedActivation_MaximumActivations();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.ConditionBasedTimeLimitedImpl <em>Condition Based Time Limited</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.ConditionBasedTimeLimitedImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getConditionBasedTimeLimited()
		 * @generated
		 */
		EClass CONDITION_BASED_TIME_LIMITED = eINSTANCE.getConditionBasedTimeLimited();

		/**
		 * The meta object literal for the '<em><b>Starting</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_BASED_TIME_LIMITED__STARTING = eINSTANCE.getConditionBasedTimeLimited_Starting();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_BASED_TIME_LIMITED__LENGTH = eINSTANCE.getConditionBasedTimeLimited_Length();

		/**
		 * The meta object literal for the '<em><b>Maximum Activations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_BASED_TIME_LIMITED__MAXIMUM_ACTIVATIONS = eINSTANCE.getConditionBasedTimeLimited_MaximumActivations();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.VariableOperationImpl <em>Variable Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.VariableOperationImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getVariableOperation()
		 * @generated
		 */
		EClass VARIABLE_OPERATION = eINSTANCE.getVariableOperation();

		/**
		 * The meta object literal for the '<em><b>Variable To Affect</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_OPERATION__VARIABLE_TO_AFFECT = eINSTANCE.getVariableOperation_VariableToAffect();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.CustomFuzzingOperationImpl <em>Custom Fuzzing Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.CustomFuzzingOperationImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getCustomFuzzingOperation()
		 * @generated
		 */
		EClass CUSTOM_FUZZING_OPERATION = eINSTANCE.getCustomFuzzingOperation();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_FUZZING_OPERATION__PARAMS = eINSTANCE.getCustomFuzzingOperation_Params();

		/**
		 * The meta object literal for the '<em><b>Custom Process Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_FUZZING_OPERATION__CUSTOM_PROCESS_CLASS = eINSTANCE.getCustomFuzzingOperation_CustomProcessClass();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.RandomValueFuzzingOperationImpl <em>Random Value Fuzzing Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.RandomValueFuzzingOperationImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getRandomValueFuzzingOperation()
		 * @generated
		 */
		EClass RANDOM_VALUE_FUZZING_OPERATION = eINSTANCE.getRandomValueFuzzingOperation();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.RandomValueFromSetOperationImpl <em>Random Value From Set Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.RandomValueFromSetOperationImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getRandomValueFromSetOperation()
		 * @generated
		 */
		EClass RANDOM_VALUE_FROM_SET_OPERATION = eINSTANCE.getRandomValueFromSetOperation();

		/**
		 * The meta object literal for the '<em><b>Value Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANDOM_VALUE_FROM_SET_OPERATION__VALUE_SET = eINSTANCE.getRandomValueFromSetOperation_ValueSet();

		/**
		 * The meta object literal for the '<em><b>Is Relative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANDOM_VALUE_FROM_SET_OPERATION__IS_RELATIVE = eINSTANCE.getRandomValueFromSetOperation_IsRelative();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.ValueSetImpl <em>Value Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.ValueSetImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getValueSet()
		 * @generated
		 */
		EClass VALUE_SET = eINSTANCE.getValueSet();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SET__PROPERTY_NAME = eINSTANCE.getValueSet_PropertyName();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.ValueRangeImpl <em>Value Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.ValueRangeImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getValueRange()
		 * @generated
		 */
		EClass VALUE_RANGE = eINSTANCE.getValueRange();

		/**
		 * The meta object literal for the '<em><b>Rand Choice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_RANGE__RAND_CHOICE = eINSTANCE.getValueRange_RandChoice();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.IntRangeImpl <em>Int Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.IntRangeImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getIntRange()
		 * @generated
		 */
		EClass INT_RANGE = eINSTANCE.getIntRange();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_RANGE__LOWER_BOUND = eINSTANCE.getIntRange_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_RANGE__UPPER_BOUND = eINSTANCE.getIntRange_UpperBound();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.DoubleRangeImpl <em>Double Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.DoubleRangeImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getDoubleRange()
		 * @generated
		 */
		EClass DOUBLE_RANGE = eINSTANCE.getDoubleRange();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_RANGE__LOWER_BOUND = eINSTANCE.getDoubleRange_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_RANGE__UPPER_BOUND = eINSTANCE.getDoubleRange_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Find Reduction</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOUBLE_RANGE___FIND_REDUCTION = eINSTANCE.getDoubleRange__FindReduction();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.PointImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getPoint()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__X = eINSTANCE.getPoint_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__Y = eINSTANCE.getPoint_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__Z = eINSTANCE.getPoint_Z();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.PointRangeImpl <em>Point Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.PointRangeImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getPointRange()
		 * @generated
		 */
		EClass POINT_RANGE = eINSTANCE.getPointRange();

		/**
		 * The meta object literal for the '<em><b>Min Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT_RANGE__MIN_POINT = eINSTANCE.getPointRange_MinPoint();

		/**
		 * The meta object literal for the '<em><b>Max Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT_RANGE__MAX_POINT = eINSTANCE.getPointRange_MaxPoint();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.StringSetImpl <em>String Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.StringSetImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getStringSet()
		 * @generated
		 */
		EClass STRING_SET = eINSTANCE.getStringSet();

		/**
		 * The meta object literal for the '<em><b>Choices</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_SET__CHOICES = eINSTANCE.getStringSet_Choices();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.ExternalResourceSetImpl <em>External Resource Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.ExternalResourceSetImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getExternalResourceSet()
		 * @generated
		 */
		EClass EXTERNAL_RESOURCE_SET = eINSTANCE.getExternalResourceSet();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_RESOURCE_SET__LOCATION = eINSTANCE.getExternalResourceSet_Location();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.NetworkFuzzingOperationImpl <em>Network Fuzzing Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.NetworkFuzzingOperationImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getNetworkFuzzingOperation()
		 * @generated
		 */
		EClass NETWORK_FUZZING_OPERATION = eINSTANCE.getNetworkFuzzingOperation();

		/**
		 * The meta object literal for the '<em><b>Variable To Affect</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_FUZZING_OPERATION__VARIABLE_TO_AFFECT = eINSTANCE.getNetworkFuzzingOperation_VariableToAffect();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.BlackholeNetworkOperationImpl <em>Blackhole Network Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.BlackholeNetworkOperationImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getBlackholeNetworkOperation()
		 * @generated
		 */
		EClass BLACKHOLE_NETWORK_OPERATION = eINSTANCE.getBlackholeNetworkOperation();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.LatencyNetworkOperationImpl <em>Latency Network Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.LatencyNetworkOperationImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getLatencyNetworkOperation()
		 * @generated
		 */
		EClass LATENCY_NETWORK_OPERATION = eINSTANCE.getLatencyNetworkOperation();

		/**
		 * The meta object literal for the '<em><b>Latency</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LATENCY_NETWORK_OPERATION__LATENCY = eINSTANCE.getLatencyNetworkOperation_Latency();

		/**
		 * The meta object literal for the '<em><b>Randomised</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LATENCY_NETWORK_OPERATION__RANDOMISED = eINSTANCE.getLatencyNetworkOperation_Randomised();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.PacketLossNetworkOperationImpl <em>Packet Loss Network Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.PacketLossNetworkOperationImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getPacketLossNetworkOperation()
		 * @generated
		 */
		EClass PACKET_LOSS_NETWORK_OPERATION = eINSTANCE.getPacketLossNetworkOperation();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKET_LOSS_NETWORK_OPERATION__FREQUENCY = eINSTANCE.getPacketLossNetworkOperation_Frequency();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.MultipleMessagesNetworkOperationImpl <em>Multiple Messages Network Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.MultipleMessagesNetworkOperationImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getMultipleMessagesNetworkOperation()
		 * @generated
		 */
		EClass MULTIPLE_MESSAGES_NETWORK_OPERATION = eINSTANCE.getMultipleMessagesNetworkOperation();

		/**
		 * The meta object literal for the '<em><b>How Many Clones</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_MESSAGES_NETWORK_OPERATION__HOW_MANY_CLONES = eINSTANCE.getMultipleMessagesNetworkOperation_HowManyClones();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.RandomValueFromSetChoice <em>Random Value From Set Choice</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.RandomValueFromSetChoice
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getRandomValueFromSetChoice()
		 * @generated
		 */
		EEnum RANDOM_VALUE_FROM_SET_CHOICE = eINSTANCE.getRandomValueFromSetChoice();

	}

} //FuzzingOperationsPackage
