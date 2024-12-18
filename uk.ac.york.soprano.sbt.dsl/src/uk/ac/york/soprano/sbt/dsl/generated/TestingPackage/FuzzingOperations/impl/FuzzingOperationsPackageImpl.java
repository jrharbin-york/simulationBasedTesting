/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionPackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ExecutionPackageImpl;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.Activation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.BlackholeNetworkOperation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ConditionBasedActivation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ConditionBasedTimeLimited;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ConstantActivation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.CustomFuzzingOperation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.DoubleRange;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.DynamicActivation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ExternalResourceSet;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FixedTimeActivation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperationsFactory;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperationsPackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.IntRange;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.LatencyNetworkOperation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.MultipleMessagesNetworkOperation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.NetworkFuzzingOperation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.PacketLossNetworkOperation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.Point;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.PointRange;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.RandomValueFromSetChoice;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.RandomValueFromSetOperation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.RandomValueFuzzingOperation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.StringSet;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ValueRange;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ValueSet;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.VariableOperation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl;
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
public class FuzzingOperationsPackageImpl extends EPackageImpl implements FuzzingOperationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fuzzingOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedTimeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionBasedActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionBasedTimeLimitedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customFuzzingOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass randomValueFuzzingOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass randomValueFromSetOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalResourceSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkFuzzingOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blackholeNetworkOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass latencyNetworkOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packetLossNetworkOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleMessagesNetworkOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum randomValueFromSetChoiceEEnum = null;

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
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FuzzingOperationsPackageImpl() {
		super(eNS_URI, FuzzingOperationsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FuzzingOperationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FuzzingOperationsPackage init() {
		if (isInited) return (FuzzingOperationsPackage)EPackage.Registry.INSTANCE.getEPackage(FuzzingOperationsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFuzzingOperationsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FuzzingOperationsPackageImpl theFuzzingOperationsPackage = registeredFuzzingOperationsPackage instanceof FuzzingOperationsPackageImpl ? (FuzzingOperationsPackageImpl)registeredFuzzingOperationsPackage : new FuzzingOperationsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestingPackagePackage.eNS_URI);
		TestingPackagePackageImpl theTestingPackagePackage = (TestingPackagePackageImpl)(registeredPackage instanceof TestingPackagePackageImpl ? registeredPackage : TestingPackagePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI);
		MetricsPackageImpl theMetricsPackage = (MetricsPackageImpl)(registeredPackage instanceof MetricsPackageImpl ? registeredPackage : MetricsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ResultsPackage.eNS_URI);
		ResultsPackageImpl theResultsPackage = (ResultsPackageImpl)(registeredPackage instanceof ResultsPackageImpl ? registeredPackage : ResultsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StandardGrammarPackage.eNS_URI);
		StandardGrammarPackageImpl theStandardGrammarPackage = (StandardGrammarPackageImpl)(registeredPackage instanceof StandardGrammarPackageImpl ? registeredPackage : StandardGrammarPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MRSPackagePackage.eNS_URI);
		MRSPackagePackageImpl theMRSPackagePackage = (MRSPackagePackageImpl)(registeredPackage instanceof MRSPackagePackageImpl ? registeredPackage : MRSPackagePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ExecutionPackage.eNS_URI);
		ExecutionPackageImpl theExecutionPackage = (ExecutionPackageImpl)(registeredPackage instanceof ExecutionPackageImpl ? registeredPackage : ExecutionPackage.eINSTANCE);

		// Create package meta-data objects
		theFuzzingOperationsPackage.createPackageContents();
		theTestingPackagePackage.createPackageContents();
		theMetricsPackage.createPackageContents();
		theResultsPackage.createPackageContents();
		theStandardGrammarPackage.createPackageContents();
		theMRSPackagePackage.createPackageContents();
		theExecutionPackage.createPackageContents();

		// Initialize created meta-data
		theFuzzingOperationsPackage.initializePackageContents();
		theTestingPackagePackage.initializePackageContents();
		theMetricsPackage.initializePackageContents();
		theResultsPackage.initializePackageContents();
		theStandardGrammarPackage.initializePackageContents();
		theMRSPackagePackage.initializePackageContents();
		theExecutionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFuzzingOperationsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FuzzingOperationsPackage.eNS_URI, theFuzzingOperationsPackage);
		return theFuzzingOperationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFuzzingOperation() {
		return fuzzingOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuzzingOperation_Name() {
		return (EAttribute)fuzzingOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuzzingOperation_Priority() {
		return (EAttribute)fuzzingOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFuzzingOperation_Activation() {
		return (EReference)fuzzingOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuzzingOperation_MessagesFromAllComponenents() {
		return (EAttribute)fuzzingOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFuzzingOperation_FromNodes() {
		return (EReference)fuzzingOperationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuzzingOperation_MessagesToAllComponenents() {
		return (EAttribute)fuzzingOperationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFuzzingOperation_ToNodes() {
		return (EReference)fuzzingOperationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFuzzingOperation_NodeToFuzz() {
		return (EReference)fuzzingOperationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuzzingOperation_AllPublishingVars() {
		return (EAttribute)fuzzingOperationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuzzingOperation_AllSubscribingVars() {
		return (EAttribute)fuzzingOperationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFuzzingOperation_FromTemplate() {
		return (EReference)fuzzingOperationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFuzzingOperation_ContainingTest() {
		return (EReference)fuzzingOperationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFuzzingOperation_RecordedTimings() {
		return (EReference)fuzzingOperationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuzzingOperation_Seed() {
		return (EAttribute)fuzzingOperationEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuzzingOperation_SequenceNumInTest() {
		return (EAttribute)fuzzingOperationEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuzzingOperation_InclusionProbability() {
		return (EAttribute)fuzzingOperationEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuzzingOperation_IncludeInTiming() {
		return (EAttribute)fuzzingOperationEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFuzzingOperation_ConditionConstraints() {
		return (EReference)fuzzingOperationEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFuzzingOperation__Dup() {
		return fuzzingOperationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFuzzingOperation__FindReduction() {
		return fuzzingOperationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivation() {
		return activationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantActivation() {
		return constantActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicActivation() {
		return dynamicActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFixedTimeActivation() {
		return fixedTimeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedTimeActivation_StartTime() {
		return (EAttribute)fixedTimeActivationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedTimeActivation_EndTime() {
		return (EAttribute)fixedTimeActivationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionBasedActivation() {
		return conditionBasedActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionBasedActivation_Starting() {
		return (EReference)conditionBasedActivationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionBasedActivation_Ending() {
		return (EReference)conditionBasedActivationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionBasedActivation_MaximumActivations() {
		return (EAttribute)conditionBasedActivationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionBasedTimeLimited() {
		return conditionBasedTimeLimitedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionBasedTimeLimited_Starting() {
		return (EReference)conditionBasedTimeLimitedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionBasedTimeLimited_Length() {
		return (EAttribute)conditionBasedTimeLimitedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionBasedTimeLimited_MaximumActivations() {
		return (EAttribute)conditionBasedTimeLimitedEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableOperation() {
		return variableOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableOperation_VariableToAffect() {
		return (EReference)variableOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomFuzzingOperation() {
		return customFuzzingOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomFuzzingOperation_Params() {
		return (EReference)customFuzzingOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomFuzzingOperation_CustomProcessClass() {
		return (EAttribute)customFuzzingOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRandomValueFuzzingOperation() {
		return randomValueFuzzingOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRandomValueFromSetOperation() {
		return randomValueFromSetOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRandomValueFromSetOperation_ValueSet() {
		return (EReference)randomValueFromSetOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRandomValueFromSetOperation_IsRelative() {
		return (EAttribute)randomValueFromSetOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSet() {
		return valueSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSet_PropertyName() {
		return (EAttribute)valueSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueRange() {
		return valueRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueRange_RandChoice() {
		return (EAttribute)valueRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntRange() {
		return intRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntRange_LowerBound() {
		return (EAttribute)intRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntRange_UpperBound() {
		return (EAttribute)intRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoubleRange() {
		return doubleRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubleRange_LowerBound() {
		return (EAttribute)doubleRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubleRange_UpperBound() {
		return (EAttribute)doubleRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDoubleRange__FindReduction() {
		return doubleRangeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPoint() {
		return pointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoint_X() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoint_Y() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoint_Z() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointRange() {
		return pointRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointRange_MinPoint() {
		return (EReference)pointRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointRange_MaxPoint() {
		return (EReference)pointRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringSet() {
		return stringSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringSet_Choices() {
		return (EAttribute)stringSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalResourceSet() {
		return externalResourceSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalResourceSet_Location() {
		return (EAttribute)externalResourceSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkFuzzingOperation() {
		return networkFuzzingOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkFuzzingOperation_VariableToAffect() {
		return (EReference)networkFuzzingOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlackholeNetworkOperation() {
		return blackholeNetworkOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLatencyNetworkOperation() {
		return latencyNetworkOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLatencyNetworkOperation_Latency() {
		return (EReference)latencyNetworkOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatencyNetworkOperation_Randomised() {
		return (EAttribute)latencyNetworkOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPacketLossNetworkOperation() {
		return packetLossNetworkOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPacketLossNetworkOperation_Frequency() {
		return (EReference)packetLossNetworkOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultipleMessagesNetworkOperation() {
		return multipleMessagesNetworkOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultipleMessagesNetworkOperation_HowManyClones() {
		return (EReference)multipleMessagesNetworkOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRandomValueFromSetChoice() {
		return randomValueFromSetChoiceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuzzingOperationsFactory getFuzzingOperationsFactory() {
		return (FuzzingOperationsFactory)getEFactoryInstance();
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
		fuzzingOperationEClass = createEClass(FUZZING_OPERATION);
		createEAttribute(fuzzingOperationEClass, FUZZING_OPERATION__NAME);
		createEAttribute(fuzzingOperationEClass, FUZZING_OPERATION__PRIORITY);
		createEReference(fuzzingOperationEClass, FUZZING_OPERATION__ACTIVATION);
		createEAttribute(fuzzingOperationEClass, FUZZING_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS);
		createEReference(fuzzingOperationEClass, FUZZING_OPERATION__FROM_NODES);
		createEAttribute(fuzzingOperationEClass, FUZZING_OPERATION__MESSAGES_TO_ALL_COMPONENENTS);
		createEReference(fuzzingOperationEClass, FUZZING_OPERATION__TO_NODES);
		createEReference(fuzzingOperationEClass, FUZZING_OPERATION__NODE_TO_FUZZ);
		createEAttribute(fuzzingOperationEClass, FUZZING_OPERATION__ALL_PUBLISHING_VARS);
		createEAttribute(fuzzingOperationEClass, FUZZING_OPERATION__ALL_SUBSCRIBING_VARS);
		createEReference(fuzzingOperationEClass, FUZZING_OPERATION__FROM_TEMPLATE);
		createEReference(fuzzingOperationEClass, FUZZING_OPERATION__CONTAINING_TEST);
		createEReference(fuzzingOperationEClass, FUZZING_OPERATION__RECORDED_TIMINGS);
		createEAttribute(fuzzingOperationEClass, FUZZING_OPERATION__SEED);
		createEAttribute(fuzzingOperationEClass, FUZZING_OPERATION__SEQUENCE_NUM_IN_TEST);
		createEAttribute(fuzzingOperationEClass, FUZZING_OPERATION__INCLUSION_PROBABILITY);
		createEAttribute(fuzzingOperationEClass, FUZZING_OPERATION__INCLUDE_IN_TIMING);
		createEReference(fuzzingOperationEClass, FUZZING_OPERATION__CONDITION_CONSTRAINTS);
		createEOperation(fuzzingOperationEClass, FUZZING_OPERATION___DUP);
		createEOperation(fuzzingOperationEClass, FUZZING_OPERATION___FIND_REDUCTION);

		activationEClass = createEClass(ACTIVATION);

		constantActivationEClass = createEClass(CONSTANT_ACTIVATION);

		dynamicActivationEClass = createEClass(DYNAMIC_ACTIVATION);

		fixedTimeActivationEClass = createEClass(FIXED_TIME_ACTIVATION);
		createEAttribute(fixedTimeActivationEClass, FIXED_TIME_ACTIVATION__START_TIME);
		createEAttribute(fixedTimeActivationEClass, FIXED_TIME_ACTIVATION__END_TIME);

		conditionBasedActivationEClass = createEClass(CONDITION_BASED_ACTIVATION);
		createEReference(conditionBasedActivationEClass, CONDITION_BASED_ACTIVATION__STARTING);
		createEReference(conditionBasedActivationEClass, CONDITION_BASED_ACTIVATION__ENDING);
		createEAttribute(conditionBasedActivationEClass, CONDITION_BASED_ACTIVATION__MAXIMUM_ACTIVATIONS);

		conditionBasedTimeLimitedEClass = createEClass(CONDITION_BASED_TIME_LIMITED);
		createEReference(conditionBasedTimeLimitedEClass, CONDITION_BASED_TIME_LIMITED__STARTING);
		createEAttribute(conditionBasedTimeLimitedEClass, CONDITION_BASED_TIME_LIMITED__LENGTH);
		createEAttribute(conditionBasedTimeLimitedEClass, CONDITION_BASED_TIME_LIMITED__MAXIMUM_ACTIVATIONS);

		variableOperationEClass = createEClass(VARIABLE_OPERATION);
		createEReference(variableOperationEClass, VARIABLE_OPERATION__VARIABLE_TO_AFFECT);

		customFuzzingOperationEClass = createEClass(CUSTOM_FUZZING_OPERATION);
		createEReference(customFuzzingOperationEClass, CUSTOM_FUZZING_OPERATION__PARAMS);
		createEAttribute(customFuzzingOperationEClass, CUSTOM_FUZZING_OPERATION__CUSTOM_PROCESS_CLASS);

		randomValueFuzzingOperationEClass = createEClass(RANDOM_VALUE_FUZZING_OPERATION);

		randomValueFromSetOperationEClass = createEClass(RANDOM_VALUE_FROM_SET_OPERATION);
		createEReference(randomValueFromSetOperationEClass, RANDOM_VALUE_FROM_SET_OPERATION__VALUE_SET);
		createEAttribute(randomValueFromSetOperationEClass, RANDOM_VALUE_FROM_SET_OPERATION__IS_RELATIVE);

		valueSetEClass = createEClass(VALUE_SET);
		createEAttribute(valueSetEClass, VALUE_SET__PROPERTY_NAME);

		valueRangeEClass = createEClass(VALUE_RANGE);
		createEAttribute(valueRangeEClass, VALUE_RANGE__RAND_CHOICE);

		intRangeEClass = createEClass(INT_RANGE);
		createEAttribute(intRangeEClass, INT_RANGE__LOWER_BOUND);
		createEAttribute(intRangeEClass, INT_RANGE__UPPER_BOUND);

		doubleRangeEClass = createEClass(DOUBLE_RANGE);
		createEAttribute(doubleRangeEClass, DOUBLE_RANGE__LOWER_BOUND);
		createEAttribute(doubleRangeEClass, DOUBLE_RANGE__UPPER_BOUND);
		createEOperation(doubleRangeEClass, DOUBLE_RANGE___FIND_REDUCTION);

		pointEClass = createEClass(POINT);
		createEAttribute(pointEClass, POINT__X);
		createEAttribute(pointEClass, POINT__Y);
		createEAttribute(pointEClass, POINT__Z);

		pointRangeEClass = createEClass(POINT_RANGE);
		createEReference(pointRangeEClass, POINT_RANGE__MIN_POINT);
		createEReference(pointRangeEClass, POINT_RANGE__MAX_POINT);

		stringSetEClass = createEClass(STRING_SET);
		createEAttribute(stringSetEClass, STRING_SET__CHOICES);

		externalResourceSetEClass = createEClass(EXTERNAL_RESOURCE_SET);
		createEAttribute(externalResourceSetEClass, EXTERNAL_RESOURCE_SET__LOCATION);

		networkFuzzingOperationEClass = createEClass(NETWORK_FUZZING_OPERATION);
		createEReference(networkFuzzingOperationEClass, NETWORK_FUZZING_OPERATION__VARIABLE_TO_AFFECT);

		blackholeNetworkOperationEClass = createEClass(BLACKHOLE_NETWORK_OPERATION);

		latencyNetworkOperationEClass = createEClass(LATENCY_NETWORK_OPERATION);
		createEReference(latencyNetworkOperationEClass, LATENCY_NETWORK_OPERATION__LATENCY);
		createEAttribute(latencyNetworkOperationEClass, LATENCY_NETWORK_OPERATION__RANDOMISED);

		packetLossNetworkOperationEClass = createEClass(PACKET_LOSS_NETWORK_OPERATION);
		createEReference(packetLossNetworkOperationEClass, PACKET_LOSS_NETWORK_OPERATION__FREQUENCY);

		multipleMessagesNetworkOperationEClass = createEClass(MULTIPLE_MESSAGES_NETWORK_OPERATION);
		createEReference(multipleMessagesNetworkOperationEClass, MULTIPLE_MESSAGES_NETWORK_OPERATION__HOW_MANY_CLONES);

		// Create enums
		randomValueFromSetChoiceEEnum = createEEnum(RANDOM_VALUE_FROM_SET_CHOICE);
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
		MRSPackagePackage theMRSPackagePackage = (MRSPackagePackage)EPackage.Registry.INSTANCE.getEPackage(MRSPackagePackage.eNS_URI);
		TestingPackagePackage theTestingPackagePackage = (TestingPackagePackage)EPackage.Registry.INSTANCE.getEPackage(TestingPackagePackage.eNS_URI);
		StandardGrammarPackage theStandardGrammarPackage = (StandardGrammarPackage)EPackage.Registry.INSTANCE.getEPackage(StandardGrammarPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		constantActivationEClass.getESuperTypes().add(this.getActivation());
		dynamicActivationEClass.getESuperTypes().add(this.getActivation());
		fixedTimeActivationEClass.getESuperTypes().add(this.getDynamicActivation());
		conditionBasedActivationEClass.getESuperTypes().add(this.getDynamicActivation());
		conditionBasedTimeLimitedEClass.getESuperTypes().add(this.getDynamicActivation());
		variableOperationEClass.getESuperTypes().add(this.getFuzzingOperation());
		customFuzzingOperationEClass.getESuperTypes().add(this.getVariableOperation());
		randomValueFuzzingOperationEClass.getESuperTypes().add(this.getVariableOperation());
		randomValueFromSetOperationEClass.getESuperTypes().add(this.getRandomValueFuzzingOperation());
		valueRangeEClass.getESuperTypes().add(this.getValueSet());
		intRangeEClass.getESuperTypes().add(this.getValueRange());
		doubleRangeEClass.getESuperTypes().add(this.getValueRange());
		pointRangeEClass.getESuperTypes().add(this.getValueRange());
		stringSetEClass.getESuperTypes().add(this.getValueSet());
		externalResourceSetEClass.getESuperTypes().add(this.getValueSet());
		networkFuzzingOperationEClass.getESuperTypes().add(this.getFuzzingOperation());
		blackholeNetworkOperationEClass.getESuperTypes().add(this.getNetworkFuzzingOperation());
		latencyNetworkOperationEClass.getESuperTypes().add(this.getNetworkFuzzingOperation());
		packetLossNetworkOperationEClass.getESuperTypes().add(this.getNetworkFuzzingOperation());
		multipleMessagesNetworkOperationEClass.getESuperTypes().add(this.getNetworkFuzzingOperation());

		// Initialize classes, features, and operations; add parameters
		initEClass(fuzzingOperationEClass, FuzzingOperation.class, "FuzzingOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFuzzingOperation_Name(), ecorePackage.getEString(), "name", null, 0, 1, FuzzingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFuzzingOperation_Priority(), ecorePackage.getEInt(), "priority", null, 0, 1, FuzzingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFuzzingOperation_Activation(), this.getActivation(), null, "activation", null, 1, 1, FuzzingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFuzzingOperation_MessagesFromAllComponenents(), ecorePackage.getEBoolean(), "messagesFromAllComponenents", "true", 0, 1, FuzzingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFuzzingOperation_FromNodes(), theMRSPackagePackage.getNode(), null, "fromNodes", null, 0, -1, FuzzingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFuzzingOperation_MessagesToAllComponenents(), ecorePackage.getEBoolean(), "messagesToAllComponenents", "true", 0, 1, FuzzingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFuzzingOperation_ToNodes(), theMRSPackagePackage.getNode(), null, "toNodes", null, 0, -1, FuzzingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFuzzingOperation_NodeToFuzz(), theMRSPackagePackage.getNode(), null, "nodeToFuzz", null, 0, 1, FuzzingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFuzzingOperation_AllPublishingVars(), ecorePackage.getEBoolean(), "allPublishingVars", "false", 0, 1, FuzzingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFuzzingOperation_AllSubscribingVars(), ecorePackage.getEBoolean(), "allSubscribingVars", "false", 0, 1, FuzzingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFuzzingOperation_FromTemplate(), this.getFuzzingOperation(), null, "fromTemplate", null, 0, 1, FuzzingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFuzzingOperation_ContainingTest(), theTestingPackagePackage.getTest(), theTestingPackagePackage.getTest_Operations(), "containingTest", null, 0, 1, FuzzingOperation.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFuzzingOperation_RecordedTimings(), this.getFixedTimeActivation(), null, "recordedTimings", null, 0, 1, FuzzingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFuzzingOperation_Seed(), ecorePackage.getELong(), "seed", null, 0, 1, FuzzingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFuzzingOperation_SequenceNumInTest(), ecorePackage.getEInt(), "sequenceNumInTest", null, 0, 1, FuzzingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFuzzingOperation_InclusionProbability(), ecorePackage.getEDouble(), "inclusionProbability", "1", 0, 1, FuzzingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFuzzingOperation_IncludeInTiming(), ecorePackage.getEBoolean(), "includeInTiming", "true", 0, 1, FuzzingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFuzzingOperation_ConditionConstraints(), theStandardGrammarPackage.getConditionConstraint(), null, "conditionConstraints", null, 0, -1, FuzzingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getFuzzingOperation__Dup(), this.getFuzzingOperation(), "dup", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getFuzzingOperation__FindReduction(), this.getFuzzingOperation(), "findReduction", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activationEClass, Activation.class, "Activation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constantActivationEClass, ConstantActivation.class, "ConstantActivation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dynamicActivationEClass, DynamicActivation.class, "DynamicActivation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fixedTimeActivationEClass, FixedTimeActivation.class, "FixedTimeActivation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFixedTimeActivation_StartTime(), ecorePackage.getEDouble(), "startTime", null, 0, 1, FixedTimeActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedTimeActivation_EndTime(), ecorePackage.getEDouble(), "endTime", null, 0, 1, FixedTimeActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionBasedActivationEClass, ConditionBasedActivation.class, "ConditionBasedActivation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionBasedActivation_Starting(), theStandardGrammarPackage.getCondition(), null, "starting", null, 0, 1, ConditionBasedActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionBasedActivation_Ending(), theStandardGrammarPackage.getCondition(), null, "ending", null, 0, 1, ConditionBasedActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConditionBasedActivation_MaximumActivations(), ecorePackage.getEInt(), "maximumActivations", "1", 0, 1, ConditionBasedActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionBasedTimeLimitedEClass, ConditionBasedTimeLimited.class, "ConditionBasedTimeLimited", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionBasedTimeLimited_Starting(), theStandardGrammarPackage.getCondition(), null, "starting", null, 0, 1, ConditionBasedTimeLimited.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConditionBasedTimeLimited_Length(), ecorePackage.getEDouble(), "length", null, 0, 1, ConditionBasedTimeLimited.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConditionBasedTimeLimited_MaximumActivations(), ecorePackage.getEInt(), "maximumActivations", "1", 0, 1, ConditionBasedTimeLimited.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableOperationEClass, VariableOperation.class, "VariableOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableOperation_VariableToAffect(), theMRSPackagePackage.getGenericVariable(), null, "variableToAffect", null, 0, 1, VariableOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customFuzzingOperationEClass, CustomFuzzingOperation.class, "CustomFuzzingOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomFuzzingOperation_Params(), this.getValueSet(), null, "params", null, 0, -1, CustomFuzzingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomFuzzingOperation_CustomProcessClass(), ecorePackage.getEString(), "customProcessClass", null, 0, 1, CustomFuzzingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(randomValueFuzzingOperationEClass, RandomValueFuzzingOperation.class, "RandomValueFuzzingOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(randomValueFromSetOperationEClass, RandomValueFromSetOperation.class, "RandomValueFromSetOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRandomValueFromSetOperation_ValueSet(), this.getValueSet(), null, "valueSet", null, 0, -1, RandomValueFromSetOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRandomValueFromSetOperation_IsRelative(), ecorePackage.getEBoolean(), "isRelative", "false", 0, 1, RandomValueFromSetOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueSetEClass, ValueSet.class, "ValueSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueSet_PropertyName(), ecorePackage.getEString(), "propertyName", null, 0, 1, ValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueRangeEClass, ValueRange.class, "ValueRange", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueRange_RandChoice(), this.getRandomValueFromSetChoice(), "randChoice", null, 0, 1, ValueRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intRangeEClass, IntRange.class, "IntRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntRange_LowerBound(), ecorePackage.getEInt(), "lowerBound", null, 0, 1, IntRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntRange_UpperBound(), ecorePackage.getEInt(), "upperBound", null, 0, 1, IntRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doubleRangeEClass, DoubleRange.class, "DoubleRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoubleRange_LowerBound(), ecorePackage.getEDouble(), "lowerBound", null, 0, 1, DoubleRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoubleRange_UpperBound(), ecorePackage.getEDouble(), "upperBound", null, 0, 1, DoubleRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDoubleRange__FindReduction(), this.getDoubleRange(), "findReduction", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pointEClass, Point.class, "Point", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPoint_X(), ecorePackage.getEDouble(), "x", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoint_Y(), ecorePackage.getEDouble(), "y", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoint_Z(), ecorePackage.getEDouble(), "z", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointRangeEClass, PointRange.class, "PointRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPointRange_MinPoint(), this.getPoint(), null, "minPoint", null, 1, 1, PointRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPointRange_MaxPoint(), this.getPoint(), null, "maxPoint", null, 1, 1, PointRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringSetEClass, StringSet.class, "StringSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringSet_Choices(), ecorePackage.getEString(), "choices", null, 0, -1, StringSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalResourceSetEClass, ExternalResourceSet.class, "ExternalResourceSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalResourceSet_Location(), ecorePackage.getEString(), "location", null, 0, 1, ExternalResourceSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkFuzzingOperationEClass, NetworkFuzzingOperation.class, "NetworkFuzzingOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNetworkFuzzingOperation_VariableToAffect(), theMRSPackagePackage.getEventBasedVariable(), null, "variableToAffect", null, 0, 1, NetworkFuzzingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blackholeNetworkOperationEClass, BlackholeNetworkOperation.class, "BlackholeNetworkOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(latencyNetworkOperationEClass, LatencyNetworkOperation.class, "LatencyNetworkOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLatencyNetworkOperation_Latency(), this.getDoubleRange(), null, "latency", null, 1, 1, LatencyNetworkOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLatencyNetworkOperation_Randomised(), ecorePackage.getEBoolean(), "randomised", "false", 0, 1, LatencyNetworkOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packetLossNetworkOperationEClass, PacketLossNetworkOperation.class, "PacketLossNetworkOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPacketLossNetworkOperation_Frequency(), this.getDoubleRange(), null, "frequency", null, 1, 1, PacketLossNetworkOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multipleMessagesNetworkOperationEClass, MultipleMessagesNetworkOperation.class, "MultipleMessagesNetworkOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultipleMessagesNetworkOperation_HowManyClones(), this.getIntRange(), null, "howManyClones", null, 1, 1, MultipleMessagesNetworkOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(randomValueFromSetChoiceEEnum, RandomValueFromSetChoice.class, "RandomValueFromSetChoice");
		addEEnumLiteral(randomValueFromSetChoiceEEnum, RandomValueFromSetChoice.RANDOM_FROM_SEED);
		addEEnumLiteral(randomValueFromSetChoiceEEnum, RandomValueFromSetChoice.ALWAYS_LOW);
		addEEnumLiteral(randomValueFromSetChoiceEEnum, RandomValueFromSetChoice.ALWAYS_HIGH);
		addEEnumLiteral(randomValueFromSetChoiceEEnum, RandomValueFromSetChoice.KEEP_SAME_RANGE);
	}

} //FuzzingOperationsPackageImpl
