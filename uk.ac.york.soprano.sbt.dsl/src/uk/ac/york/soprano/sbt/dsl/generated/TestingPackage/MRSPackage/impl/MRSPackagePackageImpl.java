/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionPackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ExecutionPackageImpl;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperationsPackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ComponentProperty;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ConfigLocation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.DynamicVariable;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.EventBasedVariable;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.FileLocation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.FixedPosition;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.GenericVariable;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MOOSSimulator;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackageFactory;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Node;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Parameter;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ParameterVariable;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ParsingMethod;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.PropertiesKeyValues;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ROSSimulator;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.ROSVariableConfiguration;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.RegexLocation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.SimVariableConfiguration;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Simulator;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.StaticVariable;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.TTSSimulator;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.Type;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.XMLConfigLocation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.MetricsPackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.impl.MetricsPackageImpl;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Results.ResultsPackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Results.impl.ResultsPackageImpl;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.StandardGrammar.StandardGrammarPackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.StandardGrammar.impl.StandardGrammarPackageImpl;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MRSPackagePackageImpl extends EPackageImpl implements MRSPackagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mrsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventBasedVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertiesKeyValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedPositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regexLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlConfigLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simulatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosSimulatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simVariableConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosVariableConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moosSimulatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ttsSimulatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parsingMethodEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MRSPackagePackageImpl() {
		super(eNS_URI, MRSPackageFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MRSPackagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MRSPackagePackage init() {
		if (isInited) return (MRSPackagePackage)EPackage.Registry.INSTANCE.getEPackage(MRSPackagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMRSPackagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MRSPackagePackageImpl theMRSPackagePackage = registeredMRSPackagePackage instanceof MRSPackagePackageImpl ? (MRSPackagePackageImpl)registeredMRSPackagePackage : new MRSPackagePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestingPackagePackage.eNS_URI);
		TestingPackagePackageImpl theTestingPackagePackage = (TestingPackagePackageImpl)(registeredPackage instanceof TestingPackagePackageImpl ? registeredPackage : TestingPackagePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FuzzingOperationsPackage.eNS_URI);
		FuzzingOperationsPackageImpl theFuzzingOperationsPackage = (FuzzingOperationsPackageImpl)(registeredPackage instanceof FuzzingOperationsPackageImpl ? registeredPackage : FuzzingOperationsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI);
		MetricsPackageImpl theMetricsPackage = (MetricsPackageImpl)(registeredPackage instanceof MetricsPackageImpl ? registeredPackage : MetricsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ResultsPackage.eNS_URI);
		ResultsPackageImpl theResultsPackage = (ResultsPackageImpl)(registeredPackage instanceof ResultsPackageImpl ? registeredPackage : ResultsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StandardGrammarPackage.eNS_URI);
		StandardGrammarPackageImpl theStandardGrammarPackage = (StandardGrammarPackageImpl)(registeredPackage instanceof StandardGrammarPackageImpl ? registeredPackage : StandardGrammarPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ExecutionPackage.eNS_URI);
		ExecutionPackageImpl theExecutionPackage = (ExecutionPackageImpl)(registeredPackage instanceof ExecutionPackageImpl ? registeredPackage : ExecutionPackage.eINSTANCE);

		// Create package meta-data objects
		theMRSPackagePackage.createPackageContents();
		theTestingPackagePackage.createPackageContents();
		theFuzzingOperationsPackage.createPackageContents();
		theMetricsPackage.createPackageContents();
		theResultsPackage.createPackageContents();
		theStandardGrammarPackage.createPackageContents();
		theExecutionPackage.createPackageContents();

		// Initialize created meta-data
		theMRSPackagePackage.initializePackageContents();
		theTestingPackagePackage.initializePackageContents();
		theFuzzingOperationsPackage.initializePackageContents();
		theMetricsPackage.initializePackageContents();
		theResultsPackage.initializePackageContents();
		theStandardGrammarPackage.initializePackageContents();
		theExecutionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMRSPackagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MRSPackagePackage.eNS_URI, theMRSPackagePackage);
		return theMRSPackagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMRS() {
		return mrsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMRS_Variables() {
		return (EReference)mrsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMRS_LaunchDelaySeconds() {
		return (EAttribute)mrsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMRS_LaunchFileLocation() {
		return (EAttribute)mrsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMRS_CustomTerminateFileLocation() {
		return (EAttribute)mrsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMRS_RecordFileLocation() {
		return (EAttribute)mrsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMRS_Nodes() {
		return (EReference)mrsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMRS_Simulator() {
		return (EReference)mrsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMRS_PropertyType() {
		return (EReference)mrsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMRS_ExecStrategy() {
		return (EReference)mrsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Name() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Subscriber() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Publisher() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Properties() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericVariable() {
		return genericVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericVariable_Name() {
		return (EAttribute)genericVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericVariable_Type() {
		return (EReference)genericVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticVariable() {
		return staticVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticVariable_Locations() {
		return (EReference)staticVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicVariable() {
		return dynamicVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventBasedVariable() {
		return eventBasedVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterVariable() {
		return parameterVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterVariable_ComponentName() {
		return (EAttribute)parameterVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigLocation() {
		return configLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigLocation_Root() {
		return (EReference)configLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileLocation() {
		return fileLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileLocation_FileName() {
		return (EAttribute)fileLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertiesKeyValues() {
		return propertiesKeyValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertiesKeyValues_Key() {
		return (EAttribute)propertiesKeyValuesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFixedPosition() {
		return fixedPositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedPosition_LineNum() {
		return (EAttribute)fixedPositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedPosition_ColumnNum() {
		return (EAttribute)fixedPositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegexLocation() {
		return regexLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegexLocation_RegexFinder() {
		return (EAttribute)regexLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXMLConfigLocation() {
		return xmlConfigLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXMLConfigLocation_XpathExpression() {
		return (EAttribute)xmlConfigLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXMLConfigLocation_SeperationCharacterAsString() {
		return (EAttribute)xmlConfigLocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXMLConfigLocation_ElementNum() {
		return (EAttribute)xmlConfigLocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_Name() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_ParsingMethod() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_Parameters() {
		return (EReference)typeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Name() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Subparameters() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Type() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentProperty() {
		return componentPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentProperty_Name() {
		return (EAttribute)componentPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentProperty_Type() {
		return (EReference)componentPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimulator() {
		return simulatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimulator_VarConfigs() {
		return (EReference)simulatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimulator_SimulationDependency() {
		return (EReference)simulatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROSSimulator() {
		return rosSimulatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROSSimulator_Hostname() {
		return (EAttribute)rosSimulatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROSSimulator_Port() {
		return (EAttribute)rosSimulatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimVariableConfiguration() {
		return simVariableConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimVariableConfiguration_Var() {
		return (EReference)simVariableConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROSVariableConfiguration() {
		return rosVariableConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSVariableConfiguration_LaunchFileloc() {
		return (EReference)rosVariableConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMOOSSimulator() {
		return moosSimulatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMOOSSimulator_Hostname() {
		return (EAttribute)moosSimulatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMOOSSimulator_Port() {
		return (EAttribute)moosSimulatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTTSSimulator() {
		return ttsSimulatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTTSSimulator_Hostname() {
		return (EAttribute)ttsSimulatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTTSSimulator_Port() {
		return (EAttribute)ttsSimulatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTTSSimulator_StepSizeMillis() {
		return (EAttribute)ttsSimulatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTTSSimulator_UseStepping() {
		return (EAttribute)ttsSimulatorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTTSSimulator_UseGUI() {
		return (EAttribute)ttsSimulatorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParsingMethod() {
		return parsingMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MRSPackageFactory getMRSPackageFactory() {
		return (MRSPackageFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		mrsEClass = createEClass(MRS);
		createEReference(mrsEClass, MRS__VARIABLES);
		createEAttribute(mrsEClass, MRS__LAUNCH_DELAY_SECONDS);
		createEAttribute(mrsEClass, MRS__LAUNCH_FILE_LOCATION);
		createEAttribute(mrsEClass, MRS__CUSTOM_TERMINATE_FILE_LOCATION);
		createEAttribute(mrsEClass, MRS__RECORD_FILE_LOCATION);
		createEReference(mrsEClass, MRS__NODES);
		createEReference(mrsEClass, MRS__SIMULATOR);
		createEReference(mrsEClass, MRS__PROPERTY_TYPE);
		createEReference(mrsEClass, MRS__EXEC_STRATEGY);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__NAME);
		createEReference(nodeEClass, NODE__SUBSCRIBER);
		createEReference(nodeEClass, NODE__PUBLISHER);
		createEReference(nodeEClass, NODE__PROPERTIES);

		genericVariableEClass = createEClass(GENERIC_VARIABLE);
		createEAttribute(genericVariableEClass, GENERIC_VARIABLE__NAME);
		createEReference(genericVariableEClass, GENERIC_VARIABLE__TYPE);

		staticVariableEClass = createEClass(STATIC_VARIABLE);
		createEReference(staticVariableEClass, STATIC_VARIABLE__LOCATIONS);

		dynamicVariableEClass = createEClass(DYNAMIC_VARIABLE);

		eventBasedVariableEClass = createEClass(EVENT_BASED_VARIABLE);

		parameterVariableEClass = createEClass(PARAMETER_VARIABLE);
		createEAttribute(parameterVariableEClass, PARAMETER_VARIABLE__COMPONENT_NAME);

		configLocationEClass = createEClass(CONFIG_LOCATION);
		createEReference(configLocationEClass, CONFIG_LOCATION__ROOT);

		fileLocationEClass = createEClass(FILE_LOCATION);
		createEAttribute(fileLocationEClass, FILE_LOCATION__FILE_NAME);

		propertiesKeyValuesEClass = createEClass(PROPERTIES_KEY_VALUES);
		createEAttribute(propertiesKeyValuesEClass, PROPERTIES_KEY_VALUES__KEY);

		fixedPositionEClass = createEClass(FIXED_POSITION);
		createEAttribute(fixedPositionEClass, FIXED_POSITION__LINE_NUM);
		createEAttribute(fixedPositionEClass, FIXED_POSITION__COLUMN_NUM);

		regexLocationEClass = createEClass(REGEX_LOCATION);
		createEAttribute(regexLocationEClass, REGEX_LOCATION__REGEX_FINDER);

		xmlConfigLocationEClass = createEClass(XML_CONFIG_LOCATION);
		createEAttribute(xmlConfigLocationEClass, XML_CONFIG_LOCATION__XPATH_EXPRESSION);
		createEAttribute(xmlConfigLocationEClass, XML_CONFIG_LOCATION__SEPERATION_CHARACTER_AS_STRING);
		createEAttribute(xmlConfigLocationEClass, XML_CONFIG_LOCATION__ELEMENT_NUM);

		typeEClass = createEClass(TYPE);
		createEAttribute(typeEClass, TYPE__NAME);
		createEAttribute(typeEClass, TYPE__PARSING_METHOD);
		createEReference(typeEClass, TYPE__PARAMETERS);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__NAME);
		createEReference(parameterEClass, PARAMETER__SUBPARAMETERS);
		createEReference(parameterEClass, PARAMETER__TYPE);

		componentPropertyEClass = createEClass(COMPONENT_PROPERTY);
		createEAttribute(componentPropertyEClass, COMPONENT_PROPERTY__NAME);
		createEReference(componentPropertyEClass, COMPONENT_PROPERTY__TYPE);

		simulatorEClass = createEClass(SIMULATOR);
		createEReference(simulatorEClass, SIMULATOR__VAR_CONFIGS);
		createEReference(simulatorEClass, SIMULATOR__SIMULATION_DEPENDENCY);

		rosSimulatorEClass = createEClass(ROS_SIMULATOR);
		createEAttribute(rosSimulatorEClass, ROS_SIMULATOR__HOSTNAME);
		createEAttribute(rosSimulatorEClass, ROS_SIMULATOR__PORT);

		simVariableConfigurationEClass = createEClass(SIM_VARIABLE_CONFIGURATION);
		createEReference(simVariableConfigurationEClass, SIM_VARIABLE_CONFIGURATION__VAR);

		rosVariableConfigurationEClass = createEClass(ROS_VARIABLE_CONFIGURATION);
		createEReference(rosVariableConfigurationEClass, ROS_VARIABLE_CONFIGURATION__LAUNCH_FILELOC);

		moosSimulatorEClass = createEClass(MOOS_SIMULATOR);
		createEAttribute(moosSimulatorEClass, MOOS_SIMULATOR__HOSTNAME);
		createEAttribute(moosSimulatorEClass, MOOS_SIMULATOR__PORT);

		ttsSimulatorEClass = createEClass(TTS_SIMULATOR);
		createEAttribute(ttsSimulatorEClass, TTS_SIMULATOR__HOSTNAME);
		createEAttribute(ttsSimulatorEClass, TTS_SIMULATOR__PORT);
		createEAttribute(ttsSimulatorEClass, TTS_SIMULATOR__STEP_SIZE_MILLIS);
		createEAttribute(ttsSimulatorEClass, TTS_SIMULATOR__USE_STEPPING);
		createEAttribute(ttsSimulatorEClass, TTS_SIMULATOR__USE_GUI);

		// Create enums
		parsingMethodEEnum = createEEnum(PARSING_METHOD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ExecutionPackage theExecutionPackage = (ExecutionPackage)EPackage.Registry.INSTANCE.getEPackage(ExecutionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		staticVariableEClass.getESuperTypes().add(this.getGenericVariable());
		dynamicVariableEClass.getESuperTypes().add(this.getGenericVariable());
		eventBasedVariableEClass.getESuperTypes().add(this.getDynamicVariable());
		parameterVariableEClass.getESuperTypes().add(this.getDynamicVariable());
		fileLocationEClass.getESuperTypes().add(this.getConfigLocation());
		propertiesKeyValuesEClass.getESuperTypes().add(this.getFileLocation());
		fixedPositionEClass.getESuperTypes().add(this.getFileLocation());
		regexLocationEClass.getESuperTypes().add(this.getFileLocation());
		xmlConfigLocationEClass.getESuperTypes().add(this.getFileLocation());
		rosSimulatorEClass.getESuperTypes().add(this.getSimulator());
		rosVariableConfigurationEClass.getESuperTypes().add(this.getSimVariableConfiguration());
		moosSimulatorEClass.getESuperTypes().add(this.getSimulator());
		ttsSimulatorEClass.getESuperTypes().add(this.getSimulator());

		// Initialize classes, features, and operations; add parameters
		initEClass(mrsEClass, uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS.class, "MRS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMRS_Variables(), this.getGenericVariable(), null, "variables", null, 0, -1, uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMRS_LaunchDelaySeconds(), ecorePackage.getEInt(), "launchDelaySeconds", "40", 0, 1, uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMRS_LaunchFileLocation(), ecorePackage.getEString(), "launchFileLocation", null, 0, 1, uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMRS_CustomTerminateFileLocation(), ecorePackage.getEString(), "customTerminateFileLocation", null, 0, 1, uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMRS_RecordFileLocation(), ecorePackage.getEString(), "recordFileLocation", null, 0, 1, uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMRS_Nodes(), this.getNode(), null, "nodes", null, 0, -1, uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMRS_Simulator(), this.getSimulator(), null, "simulator", null, 1, 1, uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMRS_PropertyType(), this.getType(), null, "propertyType", null, 0, -1, uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMRS_ExecStrategy(), theExecutionPackage.getExecutionStrategy(), null, "execStrategy", null, 1, 1, uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Subscriber(), this.getGenericVariable(), null, "subscriber", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Publisher(), this.getGenericVariable(), null, "publisher", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Properties(), this.getComponentProperty(), null, "properties", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genericVariableEClass, GenericVariable.class, "GenericVariable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenericVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, GenericVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenericVariable_Type(), this.getType(), null, "type", null, 1, 1, GenericVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staticVariableEClass, StaticVariable.class, "StaticVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStaticVariable_Locations(), this.getConfigLocation(), null, "locations", null, 1, -1, StaticVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dynamicVariableEClass, DynamicVariable.class, "DynamicVariable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventBasedVariableEClass, EventBasedVariable.class, "EventBasedVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterVariableEClass, ParameterVariable.class, "ParameterVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterVariable_ComponentName(), ecorePackage.getEString(), "componentName", null, 0, 1, ParameterVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configLocationEClass, ConfigLocation.class, "ConfigLocation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigLocation_Root(), theExecutionPackage.getDependency(), null, "root", null, 1, 1, ConfigLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileLocationEClass, FileLocation.class, "FileLocation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileLocation_FileName(), ecorePackage.getEString(), "fileName", null, 0, 1, FileLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertiesKeyValuesEClass, PropertiesKeyValues.class, "PropertiesKeyValues", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertiesKeyValues_Key(), ecorePackage.getEString(), "key", null, 0, 1, PropertiesKeyValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixedPositionEClass, FixedPosition.class, "FixedPosition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFixedPosition_LineNum(), ecorePackage.getEInt(), "lineNum", null, 0, 1, FixedPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedPosition_ColumnNum(), ecorePackage.getEInt(), "columnNum", null, 0, 1, FixedPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regexLocationEClass, RegexLocation.class, "RegexLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegexLocation_RegexFinder(), ecorePackage.getEString(), "regexFinder", null, 0, 1, RegexLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlConfigLocationEClass, XMLConfigLocation.class, "XMLConfigLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXMLConfigLocation_XpathExpression(), ecorePackage.getEString(), "xpathExpression", null, 0, 1, XMLConfigLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXMLConfigLocation_SeperationCharacterAsString(), ecorePackage.getEString(), "seperationCharacterAsString", " ", 0, 1, XMLConfigLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXMLConfigLocation_ElementNum(), ecorePackage.getEInt(), "elementNum", "-1", 0, 1, XMLConfigLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getType_Name(), ecorePackage.getEString(), "name", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getType_ParsingMethod(), this.getParsingMethod(), "parsingMethod", null, 1, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getType_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Subparameters(), this.getParameter(), null, "subparameters", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Type(), this.getType(), null, "type", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentPropertyEClass, ComponentProperty.class, "ComponentProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, ComponentProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentProperty_Type(), this.getType(), null, "type", null, 1, 1, ComponentProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simulatorEClass, Simulator.class, "Simulator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimulator_VarConfigs(), this.getSimVariableConfiguration(), null, "varConfigs", null, 0, -1, Simulator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimulator_SimulationDependency(), theExecutionPackage.getDependency(), null, "simulationDependency", null, 0, 1, Simulator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosSimulatorEClass, ROSSimulator.class, "ROSSimulator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getROSSimulator_Hostname(), ecorePackage.getEString(), "hostname", null, 0, 1, ROSSimulator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROSSimulator_Port(), ecorePackage.getEString(), "port", null, 0, 1, ROSSimulator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simVariableConfigurationEClass, SimVariableConfiguration.class, "SimVariableConfiguration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimVariableConfiguration_Var(), this.getDynamicVariable(), null, "var", null, 1, 1, SimVariableConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosVariableConfigurationEClass, ROSVariableConfiguration.class, "ROSVariableConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getROSVariableConfiguration_LaunchFileloc(), this.getXMLConfigLocation(), null, "launchFileloc", null, 1, 1, ROSVariableConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moosSimulatorEClass, MOOSSimulator.class, "MOOSSimulator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMOOSSimulator_Hostname(), ecorePackage.getEString(), "hostname", null, 0, 1, MOOSSimulator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMOOSSimulator_Port(), ecorePackage.getEString(), "port", null, 0, 1, MOOSSimulator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ttsSimulatorEClass, TTSSimulator.class, "TTSSimulator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTTSSimulator_Hostname(), ecorePackage.getEString(), "hostname", null, 0, 1, TTSSimulator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTTSSimulator_Port(), ecorePackage.getEString(), "port", null, 0, 1, TTSSimulator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTTSSimulator_StepSizeMillis(), ecorePackage.getEDouble(), "stepSizeMillis", "20", 0, 1, TTSSimulator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTTSSimulator_UseStepping(), ecorePackage.getEBoolean(), "useStepping", "false", 0, 1, TTSSimulator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTTSSimulator_UseGUI(), ecorePackage.getEBoolean(), "useGUI", "false", 0, 1, TTSSimulator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(parsingMethodEEnum, ParsingMethod.class, "ParsingMethod");
		addEEnumLiteral(parsingMethodEEnum, ParsingMethod.JSON);
		addEEnumLiteral(parsingMethodEEnum, ParsingMethod.CSV);
		addEEnumLiteral(parsingMethodEEnum, ParsingMethod.CUSTOM);
		addEEnumLiteral(parsingMethodEEnum, ParsingMethod.STRING);
	}

} //MRSPackagePackageImpl
