/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage
 * @generated
 */
public class MRSPackageAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MRSPackagePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MRSPackageAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MRSPackagePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MRSPackageSwitch<Adapter> modelSwitch =
		new MRSPackageSwitch<Adapter>() {
			@Override
			public Adapter caseMRS(MRS object) {
				return createMRSAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseGenericVariable(GenericVariable object) {
				return createGenericVariableAdapter();
			}
			@Override
			public Adapter caseStaticVariable(StaticVariable object) {
				return createStaticVariableAdapter();
			}
			@Override
			public Adapter caseDynamicVariable(DynamicVariable object) {
				return createDynamicVariableAdapter();
			}
			@Override
			public Adapter caseEventBasedVariable(EventBasedVariable object) {
				return createEventBasedVariableAdapter();
			}
			@Override
			public Adapter caseParameterVariable(ParameterVariable object) {
				return createParameterVariableAdapter();
			}
			@Override
			public Adapter caseConfigLocation(ConfigLocation object) {
				return createConfigLocationAdapter();
			}
			@Override
			public Adapter caseFileLocation(FileLocation object) {
				return createFileLocationAdapter();
			}
			@Override
			public Adapter casePropertiesKeyValues(PropertiesKeyValues object) {
				return createPropertiesKeyValuesAdapter();
			}
			@Override
			public Adapter caseFixedPosition(FixedPosition object) {
				return createFixedPositionAdapter();
			}
			@Override
			public Adapter caseRegexLocation(RegexLocation object) {
				return createRegexLocationAdapter();
			}
			@Override
			public Adapter caseXMLConfigLocation(XMLConfigLocation object) {
				return createXMLConfigLocationAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseComponentProperty(ComponentProperty object) {
				return createComponentPropertyAdapter();
			}
			@Override
			public Adapter caseSimulator(Simulator object) {
				return createSimulatorAdapter();
			}
			@Override
			public Adapter caseROSSimulator(ROSSimulator object) {
				return createROSSimulatorAdapter();
			}
			@Override
			public Adapter caseSimVariableConfiguration(SimVariableConfiguration object) {
				return createSimVariableConfigurationAdapter();
			}
			@Override
			public Adapter caseROSVariableConfiguration(ROSVariableConfiguration object) {
				return createROSVariableConfigurationAdapter();
			}
			@Override
			public Adapter caseMOOSSimulator(MOOSSimulator object) {
				return createMOOSSimulatorAdapter();
			}
			@Override
			public Adapter caseTTSSimulator(TTSSimulator object) {
				return createTTSSimulatorAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS <em>MRS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS
	 * @generated
	 */
	public Adapter createMRSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.GenericVariable <em>Generic Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.GenericVariable
	 * @generated
	 */
	public Adapter createGenericVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.StaticVariable <em>Static Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.StaticVariable
	 * @generated
	 */
	public Adapter createStaticVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.DynamicVariable <em>Dynamic Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.DynamicVariable
	 * @generated
	 */
	public Adapter createDynamicVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.EventBasedVariable <em>Event Based Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.EventBasedVariable
	 * @generated
	 */
	public Adapter createEventBasedVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ParameterVariable <em>Parameter Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ParameterVariable
	 * @generated
	 */
	public Adapter createParameterVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ConfigLocation <em>Config Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ConfigLocation
	 * @generated
	 */
	public Adapter createConfigLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.FileLocation <em>File Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.FileLocation
	 * @generated
	 */
	public Adapter createFileLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.PropertiesKeyValues <em>Properties Key Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.PropertiesKeyValues
	 * @generated
	 */
	public Adapter createPropertiesKeyValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.FixedPosition <em>Fixed Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.FixedPosition
	 * @generated
	 */
	public Adapter createFixedPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.RegexLocation <em>Regex Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.RegexLocation
	 * @generated
	 */
	public Adapter createRegexLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.XMLConfigLocation <em>XML Config Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.XMLConfigLocation
	 * @generated
	 */
	public Adapter createXMLConfigLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ComponentProperty <em>Component Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ComponentProperty
	 * @generated
	 */
	public Adapter createComponentPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Simulator <em>Simulator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Simulator
	 * @generated
	 */
	public Adapter createSimulatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ROSSimulator <em>ROS Simulator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ROSSimulator
	 * @generated
	 */
	public Adapter createROSSimulatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.SimVariableConfiguration <em>Sim Variable Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.SimVariableConfiguration
	 * @generated
	 */
	public Adapter createSimVariableConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ROSVariableConfiguration <em>ROS Variable Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ROSVariableConfiguration
	 * @generated
	 */
	public Adapter createROSVariableConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MOOSSimulator <em>MOOS Simulator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MOOSSimulator
	 * @generated
	 */
	public Adapter createMOOSSimulatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.TTSSimulator <em>TTS Simulator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.TTSSimulator
	 * @generated
	 */
	public Adapter createTTSSimulatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MRSPackageAdapterFactory
