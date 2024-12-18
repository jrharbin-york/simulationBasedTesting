/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage
 * @generated
 */
public class MRSPackageSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MRSPackagePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MRSPackageSwitch() {
		if (modelPackage == null) {
			modelPackage = MRSPackagePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MRSPackagePackage.MRS: {
				MRS mrs = (MRS)theEObject;
				T result = caseMRS(mrs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MRSPackagePackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MRSPackagePackage.GENERIC_VARIABLE: {
				GenericVariable genericVariable = (GenericVariable)theEObject;
				T result = caseGenericVariable(genericVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MRSPackagePackage.STATIC_VARIABLE: {
				StaticVariable staticVariable = (StaticVariable)theEObject;
				T result = caseStaticVariable(staticVariable);
				if (result == null) result = caseGenericVariable(staticVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MRSPackagePackage.DYNAMIC_VARIABLE: {
				DynamicVariable dynamicVariable = (DynamicVariable)theEObject;
				T result = caseDynamicVariable(dynamicVariable);
				if (result == null) result = caseGenericVariable(dynamicVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MRSPackagePackage.EVENT_BASED_VARIABLE: {
				EventBasedVariable eventBasedVariable = (EventBasedVariable)theEObject;
				T result = caseEventBasedVariable(eventBasedVariable);
				if (result == null) result = caseDynamicVariable(eventBasedVariable);
				if (result == null) result = caseGenericVariable(eventBasedVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MRSPackagePackage.PARAMETER_VARIABLE: {
				ParameterVariable parameterVariable = (ParameterVariable)theEObject;
				T result = caseParameterVariable(parameterVariable);
				if (result == null) result = caseDynamicVariable(parameterVariable);
				if (result == null) result = caseGenericVariable(parameterVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MRSPackagePackage.CONFIG_LOCATION: {
				ConfigLocation configLocation = (ConfigLocation)theEObject;
				T result = caseConfigLocation(configLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MRSPackagePackage.FILE_LOCATION: {
				FileLocation fileLocation = (FileLocation)theEObject;
				T result = caseFileLocation(fileLocation);
				if (result == null) result = caseConfigLocation(fileLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MRSPackagePackage.PROPERTIES_KEY_VALUES: {
				PropertiesKeyValues propertiesKeyValues = (PropertiesKeyValues)theEObject;
				T result = casePropertiesKeyValues(propertiesKeyValues);
				if (result == null) result = caseFileLocation(propertiesKeyValues);
				if (result == null) result = caseConfigLocation(propertiesKeyValues);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MRSPackagePackage.FIXED_POSITION: {
				FixedPosition fixedPosition = (FixedPosition)theEObject;
				T result = caseFixedPosition(fixedPosition);
				if (result == null) result = caseFileLocation(fixedPosition);
				if (result == null) result = caseConfigLocation(fixedPosition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MRSPackagePackage.REGEX_LOCATION: {
				RegexLocation regexLocation = (RegexLocation)theEObject;
				T result = caseRegexLocation(regexLocation);
				if (result == null) result = caseFileLocation(regexLocation);
				if (result == null) result = caseConfigLocation(regexLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MRSPackagePackage.XML_CONFIG_LOCATION: {
				XMLConfigLocation xmlConfigLocation = (XMLConfigLocation)theEObject;
				T result = caseXMLConfigLocation(xmlConfigLocation);
				if (result == null) result = caseFileLocation(xmlConfigLocation);
				if (result == null) result = caseConfigLocation(xmlConfigLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MRSPackagePackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MRSPackagePackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MRSPackagePackage.COMPONENT_PROPERTY: {
				ComponentProperty componentProperty = (ComponentProperty)theEObject;
				T result = caseComponentProperty(componentProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MRSPackagePackage.SIMULATOR: {
				Simulator simulator = (Simulator)theEObject;
				T result = caseSimulator(simulator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MRSPackagePackage.ROS_SIMULATOR: {
				ROSSimulator rosSimulator = (ROSSimulator)theEObject;
				T result = caseROSSimulator(rosSimulator);
				if (result == null) result = caseSimulator(rosSimulator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MRSPackagePackage.SIM_VARIABLE_CONFIGURATION: {
				SimVariableConfiguration simVariableConfiguration = (SimVariableConfiguration)theEObject;
				T result = caseSimVariableConfiguration(simVariableConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MRSPackagePackage.ROS_VARIABLE_CONFIGURATION: {
				ROSVariableConfiguration rosVariableConfiguration = (ROSVariableConfiguration)theEObject;
				T result = caseROSVariableConfiguration(rosVariableConfiguration);
				if (result == null) result = caseSimVariableConfiguration(rosVariableConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MRSPackagePackage.MOOS_SIMULATOR: {
				MOOSSimulator moosSimulator = (MOOSSimulator)theEObject;
				T result = caseMOOSSimulator(moosSimulator);
				if (result == null) result = caseSimulator(moosSimulator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MRSPackagePackage.TTS_SIMULATOR: {
				TTSSimulator ttsSimulator = (TTSSimulator)theEObject;
				T result = caseTTSSimulator(ttsSimulator);
				if (result == null) result = caseSimulator(ttsSimulator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MRS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MRS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMRS(MRS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericVariable(GenericVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticVariable(StaticVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicVariable(DynamicVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Based Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Based Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventBasedVariable(EventBasedVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterVariable(ParameterVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Config Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Config Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigLocation(ConfigLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileLocation(FileLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Properties Key Values</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Properties Key Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertiesKeyValues(PropertiesKeyValues object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixedPosition(FixedPosition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regex Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regex Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegexLocation(RegexLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XML Config Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XML Config Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXMLConfigLocation(XMLConfigLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentProperty(ComponentProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simulator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simulator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimulator(Simulator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROS Simulator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROS Simulator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROSSimulator(ROSSimulator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sim Variable Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sim Variable Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimVariableConfiguration(SimVariableConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROS Variable Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROS Variable Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROSVariableConfiguration(ROSVariableConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MOOS Simulator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MOOS Simulator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMOOSSimulator(MOOSSimulator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TTS Simulator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TTS Simulator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTTSSimulator(TTSSimulator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MRSPackageSwitch
