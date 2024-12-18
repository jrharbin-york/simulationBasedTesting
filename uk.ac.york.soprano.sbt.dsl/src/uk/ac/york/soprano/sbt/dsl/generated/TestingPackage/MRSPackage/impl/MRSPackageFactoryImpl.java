/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MRSPackageFactoryImpl extends EFactoryImpl implements MRSPackageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MRSPackageFactory init() {
		try {
			MRSPackageFactory theMRSPackageFactory = (MRSPackageFactory)EPackage.Registry.INSTANCE.getEFactory(MRSPackagePackage.eNS_URI);
			if (theMRSPackageFactory != null) {
				return theMRSPackageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MRSPackageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MRSPackageFactoryImpl() {
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
			case MRSPackagePackage.MRS: return createMRS();
			case MRSPackagePackage.NODE: return createNode();
			case MRSPackagePackage.STATIC_VARIABLE: return createStaticVariable();
			case MRSPackagePackage.EVENT_BASED_VARIABLE: return createEventBasedVariable();
			case MRSPackagePackage.PARAMETER_VARIABLE: return createParameterVariable();
			case MRSPackagePackage.PROPERTIES_KEY_VALUES: return createPropertiesKeyValues();
			case MRSPackagePackage.FIXED_POSITION: return createFixedPosition();
			case MRSPackagePackage.REGEX_LOCATION: return createRegexLocation();
			case MRSPackagePackage.XML_CONFIG_LOCATION: return createXMLConfigLocation();
			case MRSPackagePackage.TYPE: return createType();
			case MRSPackagePackage.PARAMETER: return createParameter();
			case MRSPackagePackage.COMPONENT_PROPERTY: return createComponentProperty();
			case MRSPackagePackage.ROS_SIMULATOR: return createROSSimulator();
			case MRSPackagePackage.ROS_VARIABLE_CONFIGURATION: return createROSVariableConfiguration();
			case MRSPackagePackage.MOOS_SIMULATOR: return createMOOSSimulator();
			case MRSPackagePackage.TTS_SIMULATOR: return createTTSSimulator();
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
			case MRSPackagePackage.PARSING_METHOD:
				return createParsingMethodFromString(eDataType, initialValue);
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
			case MRSPackagePackage.PARSING_METHOD:
				return convertParsingMethodToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MRS createMRS() {
		MRSImpl mrs = new MRSImpl();
		return mrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticVariable createStaticVariable() {
		StaticVariableImpl staticVariable = new StaticVariableImpl();
		return staticVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventBasedVariable createEventBasedVariable() {
		EventBasedVariableImpl eventBasedVariable = new EventBasedVariableImpl();
		return eventBasedVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterVariable createParameterVariable() {
		ParameterVariableImpl parameterVariable = new ParameterVariableImpl();
		return parameterVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesKeyValues createPropertiesKeyValues() {
		PropertiesKeyValuesImpl propertiesKeyValues = new PropertiesKeyValuesImpl();
		return propertiesKeyValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedPosition createFixedPosition() {
		FixedPositionImpl fixedPosition = new FixedPositionImpl();
		return fixedPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegexLocation createRegexLocation() {
		RegexLocationImpl regexLocation = new RegexLocationImpl();
		return regexLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLConfigLocation createXMLConfigLocation() {
		XMLConfigLocationImpl xmlConfigLocation = new XMLConfigLocationImpl();
		return xmlConfigLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentProperty createComponentProperty() {
		ComponentPropertyImpl componentProperty = new ComponentPropertyImpl();
		return componentProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSSimulator createROSSimulator() {
		ROSSimulatorImpl rosSimulator = new ROSSimulatorImpl();
		return rosSimulator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSVariableConfiguration createROSVariableConfiguration() {
		ROSVariableConfigurationImpl rosVariableConfiguration = new ROSVariableConfigurationImpl();
		return rosVariableConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MOOSSimulator createMOOSSimulator() {
		MOOSSimulatorImpl moosSimulator = new MOOSSimulatorImpl();
		return moosSimulator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTSSimulator createTTSSimulator() {
		TTSSimulatorImpl ttsSimulator = new TTSSimulatorImpl();
		return ttsSimulator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParsingMethod createParsingMethodFromString(EDataType eDataType, String initialValue) {
		ParsingMethod result = ParsingMethod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParsingMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MRSPackagePackage getMRSPackagePackage() {
		return (MRSPackagePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MRSPackagePackage getPackage() {
		return MRSPackagePackage.eINSTANCE;
	}

} //MRSPackageFactoryImpl
