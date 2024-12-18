/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.ActivationGenerationMethod;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.CampaignResultSet;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.ConditionBasedActivationGenerationMethod;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.CoverageBoostingStrategy;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.DimensionID;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.DimensionInterval;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.EvolutionaryAlgorithm;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.ExecutionEndTrigger;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FixedNSGACoverageBoostingStrategy;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.LinearNSGACoverageBoostingStrategy;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.NSGAEvolutionaryAlgorithm;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.NSGAWithCoverageCells;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.PassiveMonitorOnly;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.RandomTestGeneration;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.RepeatedExecution;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.ResultSetStatus;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestDebuggingFlags;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestGenerationApproach;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackageFactory;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingSpace;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TimeBasedActivationGenerationMethod;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TimeBasedEnd;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionPackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ExecutionPackageImpl;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperationsPackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.MetricsPackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.impl.MetricsPackageImpl;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Results.ResultsPackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Results.impl.ResultsPackageImpl;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.StandardGrammar.StandardGrammarPackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.StandardGrammar.impl.StandardGrammarPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestingPackagePackageImpl extends EPackageImpl implements TestingPackagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testingSpaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testCampaignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testDebuggingFlagsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passiveMonitorOnlyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activationGenerationMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeBasedActivationGenerationMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionBasedActivationGenerationMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass campaignResultSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionEndTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeBasedEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testGenerationApproachEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass randomTestGenerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evolutionaryAlgorithmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nsgaEvolutionaryAlgorithmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nsgaWithCoverageCellsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coverageBoostingStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedNSGACoverageBoostingStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linearNSGACoverageBoostingStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repeatedExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resultSetStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dimensionIDEEnum = null;

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
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TestingPackagePackageImpl() {
		super(eNS_URI, TestingPackageFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TestingPackagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TestingPackagePackage init() {
		if (isInited) return (TestingPackagePackage)EPackage.Registry.INSTANCE.getEPackage(TestingPackagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTestingPackagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TestingPackagePackageImpl theTestingPackagePackage = registeredTestingPackagePackage instanceof TestingPackagePackageImpl ? (TestingPackagePackageImpl)registeredTestingPackagePackage : new TestingPackagePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FuzzingOperationsPackage.eNS_URI);
		FuzzingOperationsPackageImpl theFuzzingOperationsPackage = (FuzzingOperationsPackageImpl)(registeredPackage instanceof FuzzingOperationsPackageImpl ? registeredPackage : FuzzingOperationsPackage.eINSTANCE);
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
		theTestingPackagePackage.createPackageContents();
		theFuzzingOperationsPackage.createPackageContents();
		theMetricsPackage.createPackageContents();
		theResultsPackage.createPackageContents();
		theStandardGrammarPackage.createPackageContents();
		theMRSPackagePackage.createPackageContents();
		theExecutionPackage.createPackageContents();

		// Initialize created meta-data
		theTestingPackagePackage.initializePackageContents();
		theFuzzingOperationsPackage.initializePackageContents();
		theMetricsPackage.initializePackageContents();
		theResultsPackage.initializePackageContents();
		theStandardGrammarPackage.initializePackageContents();
		theMRSPackagePackage.initializePackageContents();
		theExecutionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTestingPackagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TestingPackagePackage.eNS_URI, theTestingPackagePackage);
		return theTestingPackagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestingSpace() {
		return testingSpaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestingSpace_Name() {
		return (EAttribute)testingSpaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestingSpace_Metrics() {
		return (EReference)testingSpaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestingSpace_PossibleFuzzingOperations() {
		return (EReference)testingSpaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestingSpace_Campaigns() {
		return (EReference)testingSpaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestingSpace_Mrs() {
		return (EReference)testingSpaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestCampaign() {
		return testCampaignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestCampaign_Name() {
		return (EAttribute)testCampaignEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestCampaign_Metrics() {
		return (EReference)testCampaignEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestCampaign_ConditionMetrics() {
		return (EReference)testCampaignEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestCampaign_ActivationGeneration() {
		return (EReference)testCampaignEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestCampaign_IncludedOperations() {
		return (EReference)testCampaignEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestCampaign_Approach() {
		return (EReference)testCampaignEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestCampaign_PerformedTests() {
		return (EReference)testCampaignEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestCampaign_ResultSets() {
		return (EReference)testCampaignEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestCampaign_EndTrigger() {
		return (EReference)testCampaignEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTest() {
		return testEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTest_Name() {
		return (EAttribute)testEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTest_Operations() {
		return (EReference)testEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTest_Metrics() {
		return (EReference)testEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTest_DevelopedFrom() {
		return (EReference)testEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTest_ParentCampaign() {
		return (EReference)testEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTest_DebugFlags() {
		return (EReference)testEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestDebuggingFlags() {
		return testDebuggingFlagsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPassiveMonitorOnly() {
		return passiveMonitorOnlyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivationGenerationMethod() {
		return activationGenerationMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeBasedActivationGenerationMethod() {
		return timeBasedActivationGenerationMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionBasedActivationGenerationMethod() {
		return conditionBasedActivationGenerationMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionBasedActivationGenerationMethod_ConditionDepth() {
		return (EAttribute)conditionBasedActivationGenerationMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCampaignResultSet() {
		return campaignResultSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCampaignResultSet_Name() {
		return (EAttribute)campaignResultSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCampaignResultSet_Status() {
		return (EAttribute)campaignResultSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCampaignResultSet_Results() {
		return (EReference)campaignResultSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionEndTrigger() {
		return executionEndTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeBasedEnd() {
		return timeBasedEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeBasedEnd_TimeLimitSeconds() {
		return (EAttribute)timeBasedEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestGenerationApproach() {
		return testGenerationApproachEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRandomTestGeneration() {
		return randomTestGenerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvolutionaryAlgorithm() {
		return evolutionaryAlgorithmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNSGAEvolutionaryAlgorithm() {
		return nsgaEvolutionaryAlgorithmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNSGAEvolutionaryAlgorithm_PopulationSize() {
		return (EAttribute)nsgaEvolutionaryAlgorithmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNSGAEvolutionaryAlgorithm_Iterations() {
		return (EAttribute)nsgaEvolutionaryAlgorithmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNSGAWithCoverageCells() {
		return nsgaWithCoverageCellsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNSGAWithCoverageCells_CoveragePerCell() {
		return (EAttribute)nsgaWithCoverageCellsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNSGAWithCoverageCells_TargetCoverageProportion() {
		return (EAttribute)nsgaWithCoverageCellsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNSGAWithCoverageCells_DimensionRecords() {
		return (EReference)nsgaWithCoverageCellsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNSGAWithCoverageCells_CoverageBoostingStrategy() {
		return (EReference)nsgaWithCoverageCellsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoverageBoostingStrategy() {
		return coverageBoostingStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCoverageBoostingStrategy__ElementShouldUseCoverageBoosting__int_int_int() {
		return coverageBoostingStrategyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFixedNSGACoverageBoostingStrategy() {
		return fixedNSGACoverageBoostingStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedNSGACoverageBoostingStrategy_UseBoostingOnceEveryGenerations() {
		return (EAttribute)fixedNSGACoverageBoostingStrategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedNSGACoverageBoostingStrategy_UseBoostingOnceEveryIterations() {
		return (EAttribute)fixedNSGACoverageBoostingStrategyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinearNSGACoverageBoostingStrategy() {
		return linearNSGACoverageBoostingStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearNSGACoverageBoostingStrategy_UseBoostingOnceEveryGenerations() {
		return (EAttribute)linearNSGACoverageBoostingStrategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearNSGACoverageBoostingStrategy_StartingBoostingCount() {
		return (EAttribute)linearNSGACoverageBoostingStrategyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearNSGACoverageBoostingStrategy_EndingBoostingCount() {
		return (EAttribute)linearNSGACoverageBoostingStrategyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearNSGACoverageBoostingStrategy_CountDropEveryGeneration() {
		return (EAttribute)linearNSGACoverageBoostingStrategyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimensionInterval() {
		return dimensionIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensionInterval_DimID() {
		return (EAttribute)dimensionIntervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensionInterval_MinValue() {
		return (EAttribute)dimensionIntervalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensionInterval_MaxValue() {
		return (EAttribute)dimensionIntervalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensionInterval_Count() {
		return (EAttribute)dimensionIntervalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensionInterval_ExtraData() {
		return (EAttribute)dimensionIntervalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepeatedExecution() {
		return repeatedExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepeatedExecution_TestToRepeat() {
		return (EReference)repeatedExecutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepeatedExecution_RepeatCount() {
		return (EAttribute)repeatedExecutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResultSetStatus() {
		return resultSetStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDimensionID() {
		return dimensionIDEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestingPackageFactory getTestingPackageFactory() {
		return (TestingPackageFactory)getEFactoryInstance();
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
		testingSpaceEClass = createEClass(TESTING_SPACE);
		createEAttribute(testingSpaceEClass, TESTING_SPACE__NAME);
		createEReference(testingSpaceEClass, TESTING_SPACE__METRICS);
		createEReference(testingSpaceEClass, TESTING_SPACE__POSSIBLE_FUZZING_OPERATIONS);
		createEReference(testingSpaceEClass, TESTING_SPACE__CAMPAIGNS);
		createEReference(testingSpaceEClass, TESTING_SPACE__MRS);

		testCampaignEClass = createEClass(TEST_CAMPAIGN);
		createEAttribute(testCampaignEClass, TEST_CAMPAIGN__NAME);
		createEReference(testCampaignEClass, TEST_CAMPAIGN__METRICS);
		createEReference(testCampaignEClass, TEST_CAMPAIGN__CONDITION_METRICS);
		createEReference(testCampaignEClass, TEST_CAMPAIGN__ACTIVATION_GENERATION);
		createEReference(testCampaignEClass, TEST_CAMPAIGN__INCLUDED_OPERATIONS);
		createEReference(testCampaignEClass, TEST_CAMPAIGN__APPROACH);
		createEReference(testCampaignEClass, TEST_CAMPAIGN__PERFORMED_TESTS);
		createEReference(testCampaignEClass, TEST_CAMPAIGN__RESULT_SETS);
		createEReference(testCampaignEClass, TEST_CAMPAIGN__END_TRIGGER);

		testEClass = createEClass(TEST);
		createEAttribute(testEClass, TEST__NAME);
		createEReference(testEClass, TEST__OPERATIONS);
		createEReference(testEClass, TEST__METRICS);
		createEReference(testEClass, TEST__DEVELOPED_FROM);
		createEReference(testEClass, TEST__PARENT_CAMPAIGN);
		createEReference(testEClass, TEST__DEBUG_FLAGS);

		testDebuggingFlagsEClass = createEClass(TEST_DEBUGGING_FLAGS);

		passiveMonitorOnlyEClass = createEClass(PASSIVE_MONITOR_ONLY);

		activationGenerationMethodEClass = createEClass(ACTIVATION_GENERATION_METHOD);

		timeBasedActivationGenerationMethodEClass = createEClass(TIME_BASED_ACTIVATION_GENERATION_METHOD);

		conditionBasedActivationGenerationMethodEClass = createEClass(CONDITION_BASED_ACTIVATION_GENERATION_METHOD);
		createEAttribute(conditionBasedActivationGenerationMethodEClass, CONDITION_BASED_ACTIVATION_GENERATION_METHOD__CONDITION_DEPTH);

		campaignResultSetEClass = createEClass(CAMPAIGN_RESULT_SET);
		createEAttribute(campaignResultSetEClass, CAMPAIGN_RESULT_SET__NAME);
		createEAttribute(campaignResultSetEClass, CAMPAIGN_RESULT_SET__STATUS);
		createEReference(campaignResultSetEClass, CAMPAIGN_RESULT_SET__RESULTS);

		executionEndTriggerEClass = createEClass(EXECUTION_END_TRIGGER);

		timeBasedEndEClass = createEClass(TIME_BASED_END);
		createEAttribute(timeBasedEndEClass, TIME_BASED_END__TIME_LIMIT_SECONDS);

		testGenerationApproachEClass = createEClass(TEST_GENERATION_APPROACH);

		randomTestGenerationEClass = createEClass(RANDOM_TEST_GENERATION);

		evolutionaryAlgorithmEClass = createEClass(EVOLUTIONARY_ALGORITHM);

		nsgaEvolutionaryAlgorithmEClass = createEClass(NSGA_EVOLUTIONARY_ALGORITHM);
		createEAttribute(nsgaEvolutionaryAlgorithmEClass, NSGA_EVOLUTIONARY_ALGORITHM__POPULATION_SIZE);
		createEAttribute(nsgaEvolutionaryAlgorithmEClass, NSGA_EVOLUTIONARY_ALGORITHM__ITERATIONS);

		nsgaWithCoverageCellsEClass = createEClass(NSGA_WITH_COVERAGE_CELLS);
		createEAttribute(nsgaWithCoverageCellsEClass, NSGA_WITH_COVERAGE_CELLS__COVERAGE_PER_CELL);
		createEAttribute(nsgaWithCoverageCellsEClass, NSGA_WITH_COVERAGE_CELLS__TARGET_COVERAGE_PROPORTION);
		createEReference(nsgaWithCoverageCellsEClass, NSGA_WITH_COVERAGE_CELLS__DIMENSION_RECORDS);
		createEReference(nsgaWithCoverageCellsEClass, NSGA_WITH_COVERAGE_CELLS__COVERAGE_BOOSTING_STRATEGY);

		coverageBoostingStrategyEClass = createEClass(COVERAGE_BOOSTING_STRATEGY);
		createEOperation(coverageBoostingStrategyEClass, COVERAGE_BOOSTING_STRATEGY___ELEMENT_SHOULD_USE_COVERAGE_BOOSTING__INT_INT_INT);

		fixedNSGACoverageBoostingStrategyEClass = createEClass(FIXED_NSGA_COVERAGE_BOOSTING_STRATEGY);
		createEAttribute(fixedNSGACoverageBoostingStrategyEClass, FIXED_NSGA_COVERAGE_BOOSTING_STRATEGY__USE_BOOSTING_ONCE_EVERY_GENERATIONS);
		createEAttribute(fixedNSGACoverageBoostingStrategyEClass, FIXED_NSGA_COVERAGE_BOOSTING_STRATEGY__USE_BOOSTING_ONCE_EVERY_ITERATIONS);

		linearNSGACoverageBoostingStrategyEClass = createEClass(LINEAR_NSGA_COVERAGE_BOOSTING_STRATEGY);
		createEAttribute(linearNSGACoverageBoostingStrategyEClass, LINEAR_NSGA_COVERAGE_BOOSTING_STRATEGY__USE_BOOSTING_ONCE_EVERY_GENERATIONS);
		createEAttribute(linearNSGACoverageBoostingStrategyEClass, LINEAR_NSGA_COVERAGE_BOOSTING_STRATEGY__STARTING_BOOSTING_COUNT);
		createEAttribute(linearNSGACoverageBoostingStrategyEClass, LINEAR_NSGA_COVERAGE_BOOSTING_STRATEGY__ENDING_BOOSTING_COUNT);
		createEAttribute(linearNSGACoverageBoostingStrategyEClass, LINEAR_NSGA_COVERAGE_BOOSTING_STRATEGY__COUNT_DROP_EVERY_GENERATION);

		dimensionIntervalEClass = createEClass(DIMENSION_INTERVAL);
		createEAttribute(dimensionIntervalEClass, DIMENSION_INTERVAL__DIM_ID);
		createEAttribute(dimensionIntervalEClass, DIMENSION_INTERVAL__MIN_VALUE);
		createEAttribute(dimensionIntervalEClass, DIMENSION_INTERVAL__MAX_VALUE);
		createEAttribute(dimensionIntervalEClass, DIMENSION_INTERVAL__COUNT);
		createEAttribute(dimensionIntervalEClass, DIMENSION_INTERVAL__EXTRA_DATA);

		repeatedExecutionEClass = createEClass(REPEATED_EXECUTION);
		createEReference(repeatedExecutionEClass, REPEATED_EXECUTION__TEST_TO_REPEAT);
		createEAttribute(repeatedExecutionEClass, REPEATED_EXECUTION__REPEAT_COUNT);

		// Create enums
		resultSetStatusEEnum = createEEnum(RESULT_SET_STATUS);
		dimensionIDEEnum = createEEnum(DIMENSION_ID);
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
		FuzzingOperationsPackage theFuzzingOperationsPackage = (FuzzingOperationsPackage)EPackage.Registry.INSTANCE.getEPackage(FuzzingOperationsPackage.eNS_URI);
		MetricsPackage theMetricsPackage = (MetricsPackage)EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI);
		ResultsPackage theResultsPackage = (ResultsPackage)EPackage.Registry.INSTANCE.getEPackage(ResultsPackage.eNS_URI);
		StandardGrammarPackage theStandardGrammarPackage = (StandardGrammarPackage)EPackage.Registry.INSTANCE.getEPackage(StandardGrammarPackage.eNS_URI);
		MRSPackagePackage theMRSPackagePackage = (MRSPackagePackage)EPackage.Registry.INSTANCE.getEPackage(MRSPackagePackage.eNS_URI);
		ExecutionPackage theExecutionPackage = (ExecutionPackage)EPackage.Registry.INSTANCE.getEPackage(ExecutionPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theFuzzingOperationsPackage);
		getESubpackages().add(theMetricsPackage);
		getESubpackages().add(theResultsPackage);
		getESubpackages().add(theStandardGrammarPackage);
		getESubpackages().add(theMRSPackagePackage);
		getESubpackages().add(theExecutionPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		passiveMonitorOnlyEClass.getESuperTypes().add(this.getTestDebuggingFlags());
		timeBasedActivationGenerationMethodEClass.getESuperTypes().add(this.getActivationGenerationMethod());
		conditionBasedActivationGenerationMethodEClass.getESuperTypes().add(this.getActivationGenerationMethod());
		timeBasedEndEClass.getESuperTypes().add(this.getExecutionEndTrigger());
		randomTestGenerationEClass.getESuperTypes().add(this.getTestGenerationApproach());
		evolutionaryAlgorithmEClass.getESuperTypes().add(this.getTestGenerationApproach());
		nsgaEvolutionaryAlgorithmEClass.getESuperTypes().add(this.getEvolutionaryAlgorithm());
		nsgaWithCoverageCellsEClass.getESuperTypes().add(this.getNSGAEvolutionaryAlgorithm());
		fixedNSGACoverageBoostingStrategyEClass.getESuperTypes().add(this.getCoverageBoostingStrategy());
		linearNSGACoverageBoostingStrategyEClass.getESuperTypes().add(this.getCoverageBoostingStrategy());
		repeatedExecutionEClass.getESuperTypes().add(this.getTestGenerationApproach());

		// Initialize classes, features, and operations; add parameters
		initEClass(testingSpaceEClass, TestingSpace.class, "TestingSpace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestingSpace_Name(), ecorePackage.getEString(), "name", null, 0, 1, TestingSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestingSpace_Metrics(), theMetricsPackage.getMetric(), null, "metrics", null, 0, -1, TestingSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestingSpace_PossibleFuzzingOperations(), theFuzzingOperationsPackage.getFuzzingOperation(), null, "possibleFuzzingOperations", null, 0, -1, TestingSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestingSpace_Campaigns(), this.getTestCampaign(), null, "campaigns", null, 0, -1, TestingSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestingSpace_Mrs(), theMRSPackagePackage.getMRS(), null, "mrs", null, 1, 1, TestingSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testCampaignEClass, TestCampaign.class, "TestCampaign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestCampaign_Name(), ecorePackage.getEString(), "name", null, 0, 1, TestCampaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestCampaign_Metrics(), theMetricsPackage.getMetric(), null, "metrics", null, 0, -1, TestCampaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestCampaign_ConditionMetrics(), theMetricsPackage.getMetric(), null, "conditionMetrics", null, 0, -1, TestCampaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestCampaign_ActivationGeneration(), this.getActivationGenerationMethod(), null, "activationGeneration", null, 0, 1, TestCampaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestCampaign_IncludedOperations(), theFuzzingOperationsPackage.getFuzzingOperation(), null, "includedOperations", null, 0, -1, TestCampaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestCampaign_Approach(), this.getTestGenerationApproach(), null, "approach", null, 1, 1, TestCampaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestCampaign_PerformedTests(), this.getTest(), this.getTest_ParentCampaign(), "performedTests", null, 0, -1, TestCampaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestCampaign_ResultSets(), this.getCampaignResultSet(), null, "resultSets", null, 0, -1, TestCampaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestCampaign_EndTrigger(), this.getExecutionEndTrigger(), null, "endTrigger", null, 1, 1, TestCampaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testEClass, Test.class, "Test", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTest_Name(), ecorePackage.getEString(), "name", null, 0, 1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTest_Operations(), theFuzzingOperationsPackage.getFuzzingOperation(), theFuzzingOperationsPackage.getFuzzingOperation_ContainingTest(), "operations", null, 0, -1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTest_Metrics(), theMetricsPackage.getMetricInstance(), null, "metrics", null, 0, -1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTest_DevelopedFrom(), this.getTest(), null, "developedFrom", null, 0, -1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTest_ParentCampaign(), this.getTestCampaign(), this.getTestCampaign_PerformedTests(), "parentCampaign", null, 1, 1, Test.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTest_DebugFlags(), this.getTestDebuggingFlags(), null, "debugFlags", null, 0, -1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testDebuggingFlagsEClass, TestDebuggingFlags.class, "TestDebuggingFlags", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(passiveMonitorOnlyEClass, PassiveMonitorOnly.class, "PassiveMonitorOnly", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activationGenerationMethodEClass, ActivationGenerationMethod.class, "ActivationGenerationMethod", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeBasedActivationGenerationMethodEClass, TimeBasedActivationGenerationMethod.class, "TimeBasedActivationGenerationMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionBasedActivationGenerationMethodEClass, ConditionBasedActivationGenerationMethod.class, "ConditionBasedActivationGenerationMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConditionBasedActivationGenerationMethod_ConditionDepth(), ecorePackage.getEInt(), "conditionDepth", null, 0, 1, ConditionBasedActivationGenerationMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(campaignResultSetEClass, CampaignResultSet.class, "CampaignResultSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCampaignResultSet_Name(), ecorePackage.getEString(), "name", null, 0, 1, CampaignResultSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCampaignResultSet_Status(), this.getResultSetStatus(), "status", null, 0, 1, CampaignResultSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCampaignResultSet_Results(), this.getTest(), null, "results", null, 0, -1, CampaignResultSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executionEndTriggerEClass, ExecutionEndTrigger.class, "ExecutionEndTrigger", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeBasedEndEClass, TimeBasedEnd.class, "TimeBasedEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeBasedEnd_TimeLimitSeconds(), ecorePackage.getELong(), "timeLimitSeconds", null, 0, 1, TimeBasedEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testGenerationApproachEClass, TestGenerationApproach.class, "TestGenerationApproach", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(randomTestGenerationEClass, RandomTestGeneration.class, "RandomTestGeneration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evolutionaryAlgorithmEClass, EvolutionaryAlgorithm.class, "EvolutionaryAlgorithm", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nsgaEvolutionaryAlgorithmEClass, NSGAEvolutionaryAlgorithm.class, "NSGAEvolutionaryAlgorithm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNSGAEvolutionaryAlgorithm_PopulationSize(), ecorePackage.getEInt(), "populationSize", null, 0, 1, NSGAEvolutionaryAlgorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNSGAEvolutionaryAlgorithm_Iterations(), ecorePackage.getEInt(), "iterations", null, 0, 1, NSGAEvolutionaryAlgorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nsgaWithCoverageCellsEClass, NSGAWithCoverageCells.class, "NSGAWithCoverageCells", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNSGAWithCoverageCells_CoveragePerCell(), ecorePackage.getEInt(), "coveragePerCell", null, 0, 1, NSGAWithCoverageCells.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNSGAWithCoverageCells_TargetCoverageProportion(), ecorePackage.getEDouble(), "targetCoverageProportion", null, 0, 1, NSGAWithCoverageCells.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNSGAWithCoverageCells_DimensionRecords(), this.getDimensionInterval(), null, "dimensionRecords", null, 1, -1, NSGAWithCoverageCells.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNSGAWithCoverageCells_CoverageBoostingStrategy(), this.getCoverageBoostingStrategy(), null, "coverageBoostingStrategy", null, 0, 1, NSGAWithCoverageCells.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coverageBoostingStrategyEClass, CoverageBoostingStrategy.class, "CoverageBoostingStrategy", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getCoverageBoostingStrategy__ElementShouldUseCoverageBoosting__int_int_int(), ecorePackage.getEBoolean(), "elementShouldUseCoverageBoosting", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "i", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "genNum", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "boostingCountThisGeneration", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(fixedNSGACoverageBoostingStrategyEClass, FixedNSGACoverageBoostingStrategy.class, "FixedNSGACoverageBoostingStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFixedNSGACoverageBoostingStrategy_UseBoostingOnceEveryGenerations(), ecorePackage.getEInt(), "useBoostingOnceEveryGenerations", "2", 0, 1, FixedNSGACoverageBoostingStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedNSGACoverageBoostingStrategy_UseBoostingOnceEveryIterations(), ecorePackage.getEInt(), "useBoostingOnceEveryIterations", "2", 0, 1, FixedNSGACoverageBoostingStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linearNSGACoverageBoostingStrategyEClass, LinearNSGACoverageBoostingStrategy.class, "LinearNSGACoverageBoostingStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinearNSGACoverageBoostingStrategy_UseBoostingOnceEveryGenerations(), ecorePackage.getEInt(), "useBoostingOnceEveryGenerations", "2", 0, 1, LinearNSGACoverageBoostingStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearNSGACoverageBoostingStrategy_StartingBoostingCount(), ecorePackage.getEInt(), "startingBoostingCount", null, 0, 1, LinearNSGACoverageBoostingStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearNSGACoverageBoostingStrategy_EndingBoostingCount(), ecorePackage.getEInt(), "endingBoostingCount", null, 0, 1, LinearNSGACoverageBoostingStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearNSGACoverageBoostingStrategy_CountDropEveryGeneration(), ecorePackage.getEInt(), "countDropEveryGeneration", null, 0, 1, LinearNSGACoverageBoostingStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dimensionIntervalEClass, DimensionInterval.class, "DimensionInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDimensionInterval_DimID(), this.getDimensionID(), "dimID", null, 0, 1, DimensionInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDimensionInterval_MinValue(), ecorePackage.getEDouble(), "minValue", null, 0, 1, DimensionInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDimensionInterval_MaxValue(), ecorePackage.getEDouble(), "maxValue", null, 0, 1, DimensionInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDimensionInterval_Count(), ecorePackage.getEInt(), "count", null, 0, 1, DimensionInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDimensionInterval_ExtraData(), ecorePackage.getEInt(), "extraData", "-1", 0, 1, DimensionInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repeatedExecutionEClass, RepeatedExecution.class, "RepeatedExecution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepeatedExecution_TestToRepeat(), this.getTest(), null, "testToRepeat", null, 1, 1, RepeatedExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepeatedExecution_RepeatCount(), ecorePackage.getEInt(), "repeatCount", null, 0, 1, RepeatedExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(resultSetStatusEEnum, ResultSetStatus.class, "ResultSetStatus");
		addEEnumLiteral(resultSetStatusEEnum, ResultSetStatus.FINAL);
		addEEnumLiteral(resultSetStatusEEnum, ResultSetStatus.INTERMEDIATE);

		initEEnum(dimensionIDEEnum, DimensionID.class, "DimensionID");
		addEEnumLiteral(dimensionIDEEnum, DimensionID.T1_TIME_MIDPOINT_MEAN);
		addEEnumLiteral(dimensionIDEEnum, DimensionID.T2_TIME_LENGTH_MEAN);
		addEEnumLiteral(dimensionIDEEnum, DimensionID.T3_TIME_MIDPOINT_VAR);
		addEEnumLiteral(dimensionIDEEnum, DimensionID.P1_PARAMETER_MEAN);
		addEEnumLiteral(dimensionIDEEnum, DimensionID.P2_PARAMETER_VARIANCE);
		addEEnumLiteral(dimensionIDEEnum, DimensionID.O1_FUZZRANGE_COUNT);
		addEEnumLiteral(dimensionIDEEnum, DimensionID.O2_DELAY_COUNT);
		addEEnumLiteral(dimensionIDEEnum, DimensionID.O3_DELETION_COUNT);
		addEEnumLiteral(dimensionIDEEnum, DimensionID.O0_TOTAL_COUNT);

		// Create resource
		createResource(eNS_URI);
	}

} //TestingPackagePackageImpl
