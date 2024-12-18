/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackageFactory
 * @model kind="package"
 * @generated
 */
public interface MRSPackagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MRSPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "MRSPackage";

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
	MRSPackagePackage eINSTANCE = uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSImpl <em>MRS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getMRS()
	 * @generated
	 */
	int MRS = 0;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRS__VARIABLES = 0;

	/**
	 * The feature id for the '<em><b>Launch Delay Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRS__LAUNCH_DELAY_SECONDS = 1;

	/**
	 * The feature id for the '<em><b>Launch File Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRS__LAUNCH_FILE_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Custom Terminate File Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRS__CUSTOM_TERMINATE_FILE_LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Record File Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRS__RECORD_FILE_LOCATION = 4;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRS__NODES = 5;

	/**
	 * The feature id for the '<em><b>Simulator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRS__SIMULATOR = 6;

	/**
	 * The feature id for the '<em><b>Property Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRS__PROPERTY_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Exec Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRS__EXEC_STRATEGY = 8;

	/**
	 * The number of structural features of the '<em>MRS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRS_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>MRS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.NodeImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Subscriber</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SUBSCRIBER = 1;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PUBLISHER = 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PROPERTIES = 3;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.GenericVariableImpl <em>Generic Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.GenericVariableImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getGenericVariable()
	 * @generated
	 */
	int GENERIC_VARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_VARIABLE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Generic Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Generic Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.StaticVariableImpl <em>Static Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.StaticVariableImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getStaticVariable()
	 * @generated
	 */
	int STATIC_VARIABLE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VARIABLE__NAME = GENERIC_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VARIABLE__TYPE = GENERIC_VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VARIABLE__LOCATIONS = GENERIC_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Static Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VARIABLE_FEATURE_COUNT = GENERIC_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Static Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VARIABLE_OPERATION_COUNT = GENERIC_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.DynamicVariableImpl <em>Dynamic Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.DynamicVariableImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getDynamicVariable()
	 * @generated
	 */
	int DYNAMIC_VARIABLE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_VARIABLE__NAME = GENERIC_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_VARIABLE__TYPE = GENERIC_VARIABLE__TYPE;

	/**
	 * The number of structural features of the '<em>Dynamic Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_VARIABLE_FEATURE_COUNT = GENERIC_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dynamic Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_VARIABLE_OPERATION_COUNT = GENERIC_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.EventBasedVariableImpl <em>Event Based Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.EventBasedVariableImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getEventBasedVariable()
	 * @generated
	 */
	int EVENT_BASED_VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_VARIABLE__NAME = DYNAMIC_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_VARIABLE__TYPE = DYNAMIC_VARIABLE__TYPE;

	/**
	 * The number of structural features of the '<em>Event Based Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_VARIABLE_FEATURE_COUNT = DYNAMIC_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Event Based Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_VARIABLE_OPERATION_COUNT = DYNAMIC_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.ParameterVariableImpl <em>Parameter Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.ParameterVariableImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getParameterVariable()
	 * @generated
	 */
	int PARAMETER_VARIABLE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VARIABLE__NAME = DYNAMIC_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VARIABLE__TYPE = DYNAMIC_VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Component Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VARIABLE__COMPONENT_NAME = DYNAMIC_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VARIABLE_FEATURE_COUNT = DYNAMIC_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VARIABLE_OPERATION_COUNT = DYNAMIC_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.ConfigLocationImpl <em>Config Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.ConfigLocationImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getConfigLocation()
	 * @generated
	 */
	int CONFIG_LOCATION = 7;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_LOCATION__ROOT = 0;

	/**
	 * The number of structural features of the '<em>Config Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_LOCATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Config Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.FileLocationImpl <em>File Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.FileLocationImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getFileLocation()
	 * @generated
	 */
	int FILE_LOCATION = 8;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_LOCATION__ROOT = CONFIG_LOCATION__ROOT;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_LOCATION__FILE_NAME = CONFIG_LOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_LOCATION_FEATURE_COUNT = CONFIG_LOCATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>File Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_LOCATION_OPERATION_COUNT = CONFIG_LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.PropertiesKeyValuesImpl <em>Properties Key Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.PropertiesKeyValuesImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getPropertiesKeyValues()
	 * @generated
	 */
	int PROPERTIES_KEY_VALUES = 9;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_KEY_VALUES__ROOT = FILE_LOCATION__ROOT;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_KEY_VALUES__FILE_NAME = FILE_LOCATION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_KEY_VALUES__KEY = FILE_LOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Properties Key Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_KEY_VALUES_FEATURE_COUNT = FILE_LOCATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Properties Key Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_KEY_VALUES_OPERATION_COUNT = FILE_LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.FixedPositionImpl <em>Fixed Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.FixedPositionImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getFixedPosition()
	 * @generated
	 */
	int FIXED_POSITION = 10;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_POSITION__ROOT = FILE_LOCATION__ROOT;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_POSITION__FILE_NAME = FILE_LOCATION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_POSITION__LINE_NUM = FILE_LOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_POSITION__COLUMN_NUM = FILE_LOCATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fixed Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_POSITION_FEATURE_COUNT = FILE_LOCATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Fixed Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_POSITION_OPERATION_COUNT = FILE_LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.RegexLocationImpl <em>Regex Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.RegexLocationImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getRegexLocation()
	 * @generated
	 */
	int REGEX_LOCATION = 11;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGEX_LOCATION__ROOT = FILE_LOCATION__ROOT;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGEX_LOCATION__FILE_NAME = FILE_LOCATION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Regex Finder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGEX_LOCATION__REGEX_FINDER = FILE_LOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Regex Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGEX_LOCATION_FEATURE_COUNT = FILE_LOCATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Regex Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGEX_LOCATION_OPERATION_COUNT = FILE_LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.XMLConfigLocationImpl <em>XML Config Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.XMLConfigLocationImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getXMLConfigLocation()
	 * @generated
	 */
	int XML_CONFIG_LOCATION = 12;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_CONFIG_LOCATION__ROOT = FILE_LOCATION__ROOT;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_CONFIG_LOCATION__FILE_NAME = FILE_LOCATION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Xpath Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_CONFIG_LOCATION__XPATH_EXPRESSION = FILE_LOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Seperation Character As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_CONFIG_LOCATION__SEPERATION_CHARACTER_AS_STRING = FILE_LOCATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Element Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_CONFIG_LOCATION__ELEMENT_NUM = FILE_LOCATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>XML Config Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_CONFIG_LOCATION_FEATURE_COUNT = FILE_LOCATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>XML Config Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_CONFIG_LOCATION_OPERATION_COUNT = FILE_LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.TypeImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getType()
	 * @generated
	 */
	int TYPE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parsing Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__PARSING_METHOD = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__PARAMETERS = 2;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.ParameterImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Subparameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__SUBPARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.ComponentPropertyImpl <em>Component Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.ComponentPropertyImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getComponentProperty()
	 * @generated
	 */
	int COMPONENT_PROPERTY = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROPERTY__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Component Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Component Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.SimulatorImpl <em>Simulator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.SimulatorImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getSimulator()
	 * @generated
	 */
	int SIMULATOR = 16;

	/**
	 * The feature id for the '<em><b>Var Configs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATOR__VAR_CONFIGS = 0;

	/**
	 * The feature id for the '<em><b>Simulation Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATOR__SIMULATION_DEPENDENCY = 1;

	/**
	 * The number of structural features of the '<em>Simulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Simulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.ROSSimulatorImpl <em>ROS Simulator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.ROSSimulatorImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getROSSimulator()
	 * @generated
	 */
	int ROS_SIMULATOR = 17;

	/**
	 * The feature id for the '<em><b>Var Configs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SIMULATOR__VAR_CONFIGS = SIMULATOR__VAR_CONFIGS;

	/**
	 * The feature id for the '<em><b>Simulation Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SIMULATOR__SIMULATION_DEPENDENCY = SIMULATOR__SIMULATION_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SIMULATOR__HOSTNAME = SIMULATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SIMULATOR__PORT = SIMULATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ROS Simulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SIMULATOR_FEATURE_COUNT = SIMULATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>ROS Simulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SIMULATOR_OPERATION_COUNT = SIMULATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.SimVariableConfigurationImpl <em>Sim Variable Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.SimVariableConfigurationImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getSimVariableConfiguration()
	 * @generated
	 */
	int SIM_VARIABLE_CONFIGURATION = 18;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_VARIABLE_CONFIGURATION__VAR = 0;

	/**
	 * The number of structural features of the '<em>Sim Variable Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_VARIABLE_CONFIGURATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sim Variable Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_VARIABLE_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.ROSVariableConfigurationImpl <em>ROS Variable Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.ROSVariableConfigurationImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getROSVariableConfiguration()
	 * @generated
	 */
	int ROS_VARIABLE_CONFIGURATION = 19;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_VARIABLE_CONFIGURATION__VAR = SIM_VARIABLE_CONFIGURATION__VAR;

	/**
	 * The feature id for the '<em><b>Launch Fileloc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_VARIABLE_CONFIGURATION__LAUNCH_FILELOC = SIM_VARIABLE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ROS Variable Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_VARIABLE_CONFIGURATION_FEATURE_COUNT = SIM_VARIABLE_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>ROS Variable Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_VARIABLE_CONFIGURATION_OPERATION_COUNT = SIM_VARIABLE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MOOSSimulatorImpl <em>MOOS Simulator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MOOSSimulatorImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getMOOSSimulator()
	 * @generated
	 */
	int MOOS_SIMULATOR = 20;

	/**
	 * The feature id for the '<em><b>Var Configs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOOS_SIMULATOR__VAR_CONFIGS = SIMULATOR__VAR_CONFIGS;

	/**
	 * The feature id for the '<em><b>Simulation Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOOS_SIMULATOR__SIMULATION_DEPENDENCY = SIMULATOR__SIMULATION_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOOS_SIMULATOR__HOSTNAME = SIMULATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOOS_SIMULATOR__PORT = SIMULATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MOOS Simulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOOS_SIMULATOR_FEATURE_COUNT = SIMULATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>MOOS Simulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOOS_SIMULATOR_OPERATION_COUNT = SIMULATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.TTSSimulatorImpl <em>TTS Simulator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.TTSSimulatorImpl
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getTTSSimulator()
	 * @generated
	 */
	int TTS_SIMULATOR = 21;

	/**
	 * The feature id for the '<em><b>Var Configs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTS_SIMULATOR__VAR_CONFIGS = SIMULATOR__VAR_CONFIGS;

	/**
	 * The feature id for the '<em><b>Simulation Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTS_SIMULATOR__SIMULATION_DEPENDENCY = SIMULATOR__SIMULATION_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTS_SIMULATOR__HOSTNAME = SIMULATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTS_SIMULATOR__PORT = SIMULATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Step Size Millis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTS_SIMULATOR__STEP_SIZE_MILLIS = SIMULATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Use Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTS_SIMULATOR__USE_STEPPING = SIMULATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Use GUI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTS_SIMULATOR__USE_GUI = SIMULATOR_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>TTS Simulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTS_SIMULATOR_FEATURE_COUNT = SIMULATOR_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>TTS Simulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTS_SIMULATOR_OPERATION_COUNT = SIMULATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ParsingMethod <em>Parsing Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ParsingMethod
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getParsingMethod()
	 * @generated
	 */
	int PARSING_METHOD = 22;


	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS <em>MRS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MRS</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS
	 * @generated
	 */
	EClass getMRS();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS#getVariables()
	 * @see #getMRS()
	 * @generated
	 */
	EReference getMRS_Variables();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS#getLaunchDelaySeconds <em>Launch Delay Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Launch Delay Seconds</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS#getLaunchDelaySeconds()
	 * @see #getMRS()
	 * @generated
	 */
	EAttribute getMRS_LaunchDelaySeconds();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS#getLaunchFileLocation <em>Launch File Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Launch File Location</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS#getLaunchFileLocation()
	 * @see #getMRS()
	 * @generated
	 */
	EAttribute getMRS_LaunchFileLocation();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS#getCustomTerminateFileLocation <em>Custom Terminate File Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Terminate File Location</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS#getCustomTerminateFileLocation()
	 * @see #getMRS()
	 * @generated
	 */
	EAttribute getMRS_CustomTerminateFileLocation();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS#getRecordFileLocation <em>Record File Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Record File Location</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS#getRecordFileLocation()
	 * @see #getMRS()
	 * @generated
	 */
	EAttribute getMRS_RecordFileLocation();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS#getNodes()
	 * @see #getMRS()
	 * @generated
	 */
	EReference getMRS_Nodes();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS#getSimulator <em>Simulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simulator</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS#getSimulator()
	 * @see #getMRS()
	 * @generated
	 */
	EReference getMRS_Simulator();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS#getPropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Type</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS#getPropertyType()
	 * @see #getMRS()
	 * @generated
	 */
	EReference getMRS_PropertyType();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS#getExecStrategy <em>Exec Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exec Strategy</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS#getExecStrategy()
	 * @see #getMRS()
	 * @generated
	 */
	EReference getMRS_ExecStrategy();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Node#getSubscriber <em>Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subscriber</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Node#getSubscriber()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Subscriber();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Node#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Publisher</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Node#getPublisher()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Publisher();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Node#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Properties</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Node#getProperties()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Properties();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.GenericVariable <em>Generic Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Variable</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.GenericVariable
	 * @generated
	 */
	EClass getGenericVariable();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.GenericVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.GenericVariable#getName()
	 * @see #getGenericVariable()
	 * @generated
	 */
	EAttribute getGenericVariable_Name();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.GenericVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.GenericVariable#getType()
	 * @see #getGenericVariable()
	 * @generated
	 */
	EReference getGenericVariable_Type();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.StaticVariable <em>Static Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Variable</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.StaticVariable
	 * @generated
	 */
	EClass getStaticVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.StaticVariable#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locations</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.StaticVariable#getLocations()
	 * @see #getStaticVariable()
	 * @generated
	 */
	EReference getStaticVariable_Locations();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.DynamicVariable <em>Dynamic Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Variable</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.DynamicVariable
	 * @generated
	 */
	EClass getDynamicVariable();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.EventBasedVariable <em>Event Based Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Based Variable</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.EventBasedVariable
	 * @generated
	 */
	EClass getEventBasedVariable();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ParameterVariable <em>Parameter Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Variable</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ParameterVariable
	 * @generated
	 */
	EClass getParameterVariable();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ParameterVariable#getComponentName <em>Component Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Name</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ParameterVariable#getComponentName()
	 * @see #getParameterVariable()
	 * @generated
	 */
	EAttribute getParameterVariable_ComponentName();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ConfigLocation <em>Config Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config Location</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ConfigLocation
	 * @generated
	 */
	EClass getConfigLocation();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ConfigLocation#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ConfigLocation#getRoot()
	 * @see #getConfigLocation()
	 * @generated
	 */
	EReference getConfigLocation_Root();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.FileLocation <em>File Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Location</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.FileLocation
	 * @generated
	 */
	EClass getFileLocation();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.FileLocation#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.FileLocation#getFileName()
	 * @see #getFileLocation()
	 * @generated
	 */
	EAttribute getFileLocation_FileName();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.PropertiesKeyValues <em>Properties Key Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties Key Values</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.PropertiesKeyValues
	 * @generated
	 */
	EClass getPropertiesKeyValues();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.PropertiesKeyValues#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.PropertiesKeyValues#getKey()
	 * @see #getPropertiesKeyValues()
	 * @generated
	 */
	EAttribute getPropertiesKeyValues_Key();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.FixedPosition <em>Fixed Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Position</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.FixedPosition
	 * @generated
	 */
	EClass getFixedPosition();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.FixedPosition#getLineNum <em>Line Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Num</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.FixedPosition#getLineNum()
	 * @see #getFixedPosition()
	 * @generated
	 */
	EAttribute getFixedPosition_LineNum();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.FixedPosition#getColumnNum <em>Column Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Num</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.FixedPosition#getColumnNum()
	 * @see #getFixedPosition()
	 * @generated
	 */
	EAttribute getFixedPosition_ColumnNum();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.RegexLocation <em>Regex Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regex Location</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.RegexLocation
	 * @generated
	 */
	EClass getRegexLocation();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.RegexLocation#getRegexFinder <em>Regex Finder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regex Finder</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.RegexLocation#getRegexFinder()
	 * @see #getRegexLocation()
	 * @generated
	 */
	EAttribute getRegexLocation_RegexFinder();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.XMLConfigLocation <em>XML Config Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML Config Location</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.XMLConfigLocation
	 * @generated
	 */
	EClass getXMLConfigLocation();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.XMLConfigLocation#getXpathExpression <em>Xpath Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xpath Expression</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.XMLConfigLocation#getXpathExpression()
	 * @see #getXMLConfigLocation()
	 * @generated
	 */
	EAttribute getXMLConfigLocation_XpathExpression();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.XMLConfigLocation#getSeperationCharacterAsString <em>Seperation Character As String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seperation Character As String</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.XMLConfigLocation#getSeperationCharacterAsString()
	 * @see #getXMLConfigLocation()
	 * @generated
	 */
	EAttribute getXMLConfigLocation_SeperationCharacterAsString();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.XMLConfigLocation#getElementNum <em>Element Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Num</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.XMLConfigLocation#getElementNum()
	 * @see #getXMLConfigLocation()
	 * @generated
	 */
	EAttribute getXMLConfigLocation_ElementNum();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Type#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Type#getName()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Name();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Type#getParsingMethod <em>Parsing Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parsing Method</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Type#getParsingMethod()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_ParsingMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Type#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Type#getParameters()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Parameters();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Parameter#getSubparameters <em>Subparameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subparameters</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Parameter#getSubparameters()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Subparameters();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Type();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ComponentProperty <em>Component Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Property</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ComponentProperty
	 * @generated
	 */
	EClass getComponentProperty();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ComponentProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ComponentProperty#getName()
	 * @see #getComponentProperty()
	 * @generated
	 */
	EAttribute getComponentProperty_Name();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ComponentProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ComponentProperty#getType()
	 * @see #getComponentProperty()
	 * @generated
	 */
	EReference getComponentProperty_Type();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Simulator <em>Simulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simulator</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Simulator
	 * @generated
	 */
	EClass getSimulator();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Simulator#getVarConfigs <em>Var Configs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var Configs</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Simulator#getVarConfigs()
	 * @see #getSimulator()
	 * @generated
	 */
	EReference getSimulator_VarConfigs();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Simulator#getSimulationDependency <em>Simulation Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Simulation Dependency</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Simulator#getSimulationDependency()
	 * @see #getSimulator()
	 * @generated
	 */
	EReference getSimulator_SimulationDependency();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ROSSimulator <em>ROS Simulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS Simulator</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ROSSimulator
	 * @generated
	 */
	EClass getROSSimulator();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ROSSimulator#getHostname <em>Hostname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hostname</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ROSSimulator#getHostname()
	 * @see #getROSSimulator()
	 * @generated
	 */
	EAttribute getROSSimulator_Hostname();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ROSSimulator#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ROSSimulator#getPort()
	 * @see #getROSSimulator()
	 * @generated
	 */
	EAttribute getROSSimulator_Port();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.SimVariableConfiguration <em>Sim Variable Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sim Variable Configuration</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.SimVariableConfiguration
	 * @generated
	 */
	EClass getSimVariableConfiguration();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.SimVariableConfiguration#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Var</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.SimVariableConfiguration#getVar()
	 * @see #getSimVariableConfiguration()
	 * @generated
	 */
	EReference getSimVariableConfiguration_Var();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ROSVariableConfiguration <em>ROS Variable Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS Variable Configuration</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ROSVariableConfiguration
	 * @generated
	 */
	EClass getROSVariableConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ROSVariableConfiguration#getLaunchFileloc <em>Launch Fileloc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Launch Fileloc</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ROSVariableConfiguration#getLaunchFileloc()
	 * @see #getROSVariableConfiguration()
	 * @generated
	 */
	EReference getROSVariableConfiguration_LaunchFileloc();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MOOSSimulator <em>MOOS Simulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MOOS Simulator</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MOOSSimulator
	 * @generated
	 */
	EClass getMOOSSimulator();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MOOSSimulator#getHostname <em>Hostname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hostname</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MOOSSimulator#getHostname()
	 * @see #getMOOSSimulator()
	 * @generated
	 */
	EAttribute getMOOSSimulator_Hostname();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MOOSSimulator#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MOOSSimulator#getPort()
	 * @see #getMOOSSimulator()
	 * @generated
	 */
	EAttribute getMOOSSimulator_Port();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.TTSSimulator <em>TTS Simulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TTS Simulator</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.TTSSimulator
	 * @generated
	 */
	EClass getTTSSimulator();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.TTSSimulator#getHostname <em>Hostname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hostname</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.TTSSimulator#getHostname()
	 * @see #getTTSSimulator()
	 * @generated
	 */
	EAttribute getTTSSimulator_Hostname();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.TTSSimulator#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.TTSSimulator#getPort()
	 * @see #getTTSSimulator()
	 * @generated
	 */
	EAttribute getTTSSimulator_Port();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.TTSSimulator#getStepSizeMillis <em>Step Size Millis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Size Millis</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.TTSSimulator#getStepSizeMillis()
	 * @see #getTTSSimulator()
	 * @generated
	 */
	EAttribute getTTSSimulator_StepSizeMillis();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.TTSSimulator#isUseStepping <em>Use Stepping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Stepping</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.TTSSimulator#isUseStepping()
	 * @see #getTTSSimulator()
	 * @generated
	 */
	EAttribute getTTSSimulator_UseStepping();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.TTSSimulator#isUseGUI <em>Use GUI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use GUI</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.TTSSimulator#isUseGUI()
	 * @see #getTTSSimulator()
	 * @generated
	 */
	EAttribute getTTSSimulator_UseGUI();

	/**
	 * Returns the meta object for enum '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ParsingMethod <em>Parsing Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parsing Method</em>'.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ParsingMethod
	 * @generated
	 */
	EEnum getParsingMethod();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MRSPackageFactory getMRSPackageFactory();

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
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSImpl <em>MRS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getMRS()
		 * @generated
		 */
		EClass MRS = eINSTANCE.getMRS();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MRS__VARIABLES = eINSTANCE.getMRS_Variables();

		/**
		 * The meta object literal for the '<em><b>Launch Delay Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MRS__LAUNCH_DELAY_SECONDS = eINSTANCE.getMRS_LaunchDelaySeconds();

		/**
		 * The meta object literal for the '<em><b>Launch File Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MRS__LAUNCH_FILE_LOCATION = eINSTANCE.getMRS_LaunchFileLocation();

		/**
		 * The meta object literal for the '<em><b>Custom Terminate File Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MRS__CUSTOM_TERMINATE_FILE_LOCATION = eINSTANCE.getMRS_CustomTerminateFileLocation();

		/**
		 * The meta object literal for the '<em><b>Record File Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MRS__RECORD_FILE_LOCATION = eINSTANCE.getMRS_RecordFileLocation();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MRS__NODES = eINSTANCE.getMRS_Nodes();

		/**
		 * The meta object literal for the '<em><b>Simulator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MRS__SIMULATOR = eINSTANCE.getMRS_Simulator();

		/**
		 * The meta object literal for the '<em><b>Property Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MRS__PROPERTY_TYPE = eINSTANCE.getMRS_PropertyType();

		/**
		 * The meta object literal for the '<em><b>Exec Strategy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MRS__EXEC_STRATEGY = eINSTANCE.getMRS_ExecStrategy();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.NodeImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Subscriber</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__SUBSCRIBER = eINSTANCE.getNode_Subscriber();

		/**
		 * The meta object literal for the '<em><b>Publisher</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__PUBLISHER = eINSTANCE.getNode_Publisher();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__PROPERTIES = eINSTANCE.getNode_Properties();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.GenericVariableImpl <em>Generic Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.GenericVariableImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getGenericVariable()
		 * @generated
		 */
		EClass GENERIC_VARIABLE = eINSTANCE.getGenericVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_VARIABLE__NAME = eINSTANCE.getGenericVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_VARIABLE__TYPE = eINSTANCE.getGenericVariable_Type();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.StaticVariableImpl <em>Static Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.StaticVariableImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getStaticVariable()
		 * @generated
		 */
		EClass STATIC_VARIABLE = eINSTANCE.getStaticVariable();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_VARIABLE__LOCATIONS = eINSTANCE.getStaticVariable_Locations();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.DynamicVariableImpl <em>Dynamic Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.DynamicVariableImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getDynamicVariable()
		 * @generated
		 */
		EClass DYNAMIC_VARIABLE = eINSTANCE.getDynamicVariable();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.EventBasedVariableImpl <em>Event Based Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.EventBasedVariableImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getEventBasedVariable()
		 * @generated
		 */
		EClass EVENT_BASED_VARIABLE = eINSTANCE.getEventBasedVariable();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.ParameterVariableImpl <em>Parameter Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.ParameterVariableImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getParameterVariable()
		 * @generated
		 */
		EClass PARAMETER_VARIABLE = eINSTANCE.getParameterVariable();

		/**
		 * The meta object literal for the '<em><b>Component Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_VARIABLE__COMPONENT_NAME = eINSTANCE.getParameterVariable_ComponentName();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.ConfigLocationImpl <em>Config Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.ConfigLocationImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getConfigLocation()
		 * @generated
		 */
		EClass CONFIG_LOCATION = eINSTANCE.getConfigLocation();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG_LOCATION__ROOT = eINSTANCE.getConfigLocation_Root();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.FileLocationImpl <em>File Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.FileLocationImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getFileLocation()
		 * @generated
		 */
		EClass FILE_LOCATION = eINSTANCE.getFileLocation();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_LOCATION__FILE_NAME = eINSTANCE.getFileLocation_FileName();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.PropertiesKeyValuesImpl <em>Properties Key Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.PropertiesKeyValuesImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getPropertiesKeyValues()
		 * @generated
		 */
		EClass PROPERTIES_KEY_VALUES = eINSTANCE.getPropertiesKeyValues();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES_KEY_VALUES__KEY = eINSTANCE.getPropertiesKeyValues_Key();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.FixedPositionImpl <em>Fixed Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.FixedPositionImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getFixedPosition()
		 * @generated
		 */
		EClass FIXED_POSITION = eINSTANCE.getFixedPosition();

		/**
		 * The meta object literal for the '<em><b>Line Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_POSITION__LINE_NUM = eINSTANCE.getFixedPosition_LineNum();

		/**
		 * The meta object literal for the '<em><b>Column Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_POSITION__COLUMN_NUM = eINSTANCE.getFixedPosition_ColumnNum();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.RegexLocationImpl <em>Regex Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.RegexLocationImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getRegexLocation()
		 * @generated
		 */
		EClass REGEX_LOCATION = eINSTANCE.getRegexLocation();

		/**
		 * The meta object literal for the '<em><b>Regex Finder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGEX_LOCATION__REGEX_FINDER = eINSTANCE.getRegexLocation_RegexFinder();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.XMLConfigLocationImpl <em>XML Config Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.XMLConfigLocationImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getXMLConfigLocation()
		 * @generated
		 */
		EClass XML_CONFIG_LOCATION = eINSTANCE.getXMLConfigLocation();

		/**
		 * The meta object literal for the '<em><b>Xpath Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_CONFIG_LOCATION__XPATH_EXPRESSION = eINSTANCE.getXMLConfigLocation_XpathExpression();

		/**
		 * The meta object literal for the '<em><b>Seperation Character As String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_CONFIG_LOCATION__SEPERATION_CHARACTER_AS_STRING = eINSTANCE.getXMLConfigLocation_SeperationCharacterAsString();

		/**
		 * The meta object literal for the '<em><b>Element Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_CONFIG_LOCATION__ELEMENT_NUM = eINSTANCE.getXMLConfigLocation_ElementNum();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.TypeImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__NAME = eINSTANCE.getType_Name();

		/**
		 * The meta object literal for the '<em><b>Parsing Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__PARSING_METHOD = eINSTANCE.getType_ParsingMethod();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__PARAMETERS = eINSTANCE.getType_Parameters();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.ParameterImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Subparameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__SUBPARAMETERS = eINSTANCE.getParameter_Subparameters();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.ComponentPropertyImpl <em>Component Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.ComponentPropertyImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getComponentProperty()
		 * @generated
		 */
		EClass COMPONENT_PROPERTY = eINSTANCE.getComponentProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_PROPERTY__NAME = eINSTANCE.getComponentProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PROPERTY__TYPE = eINSTANCE.getComponentProperty_Type();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.SimulatorImpl <em>Simulator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.SimulatorImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getSimulator()
		 * @generated
		 */
		EClass SIMULATOR = eINSTANCE.getSimulator();

		/**
		 * The meta object literal for the '<em><b>Var Configs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATOR__VAR_CONFIGS = eINSTANCE.getSimulator_VarConfigs();

		/**
		 * The meta object literal for the '<em><b>Simulation Dependency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATOR__SIMULATION_DEPENDENCY = eINSTANCE.getSimulator_SimulationDependency();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.ROSSimulatorImpl <em>ROS Simulator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.ROSSimulatorImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getROSSimulator()
		 * @generated
		 */
		EClass ROS_SIMULATOR = eINSTANCE.getROSSimulator();

		/**
		 * The meta object literal for the '<em><b>Hostname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_SIMULATOR__HOSTNAME = eINSTANCE.getROSSimulator_Hostname();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_SIMULATOR__PORT = eINSTANCE.getROSSimulator_Port();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.SimVariableConfigurationImpl <em>Sim Variable Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.SimVariableConfigurationImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getSimVariableConfiguration()
		 * @generated
		 */
		EClass SIM_VARIABLE_CONFIGURATION = eINSTANCE.getSimVariableConfiguration();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIM_VARIABLE_CONFIGURATION__VAR = eINSTANCE.getSimVariableConfiguration_Var();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.ROSVariableConfigurationImpl <em>ROS Variable Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.ROSVariableConfigurationImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getROSVariableConfiguration()
		 * @generated
		 */
		EClass ROS_VARIABLE_CONFIGURATION = eINSTANCE.getROSVariableConfiguration();

		/**
		 * The meta object literal for the '<em><b>Launch Fileloc</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_VARIABLE_CONFIGURATION__LAUNCH_FILELOC = eINSTANCE.getROSVariableConfiguration_LaunchFileloc();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MOOSSimulatorImpl <em>MOOS Simulator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MOOSSimulatorImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getMOOSSimulator()
		 * @generated
		 */
		EClass MOOS_SIMULATOR = eINSTANCE.getMOOSSimulator();

		/**
		 * The meta object literal for the '<em><b>Hostname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOOS_SIMULATOR__HOSTNAME = eINSTANCE.getMOOSSimulator_Hostname();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOOS_SIMULATOR__PORT = eINSTANCE.getMOOSSimulator_Port();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.TTSSimulatorImpl <em>TTS Simulator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.TTSSimulatorImpl
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getTTSSimulator()
		 * @generated
		 */
		EClass TTS_SIMULATOR = eINSTANCE.getTTSSimulator();

		/**
		 * The meta object literal for the '<em><b>Hostname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TTS_SIMULATOR__HOSTNAME = eINSTANCE.getTTSSimulator_Hostname();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TTS_SIMULATOR__PORT = eINSTANCE.getTTSSimulator_Port();

		/**
		 * The meta object literal for the '<em><b>Step Size Millis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TTS_SIMULATOR__STEP_SIZE_MILLIS = eINSTANCE.getTTSSimulator_StepSizeMillis();

		/**
		 * The meta object literal for the '<em><b>Use Stepping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TTS_SIMULATOR__USE_STEPPING = eINSTANCE.getTTSSimulator_UseStepping();

		/**
		 * The meta object literal for the '<em><b>Use GUI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TTS_SIMULATOR__USE_GUI = eINSTANCE.getTTSSimulator_UseGUI();

		/**
		 * The meta object literal for the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ParsingMethod <em>Parsing Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ParsingMethod
		 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getParsingMethod()
		 * @generated
		 */
		EEnum PARSING_METHOD = eINSTANCE.getParsingMethod();

	}

} //MRSPackagePackage
