/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage
 * @generated
 */
public class TestingPackageAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TestingPackagePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestingPackageAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TestingPackagePackage.eINSTANCE;
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
	protected TestingPackageSwitch<Adapter> modelSwitch =
		new TestingPackageSwitch<Adapter>() {
			@Override
			public Adapter caseTestingSpace(TestingSpace object) {
				return createTestingSpaceAdapter();
			}
			@Override
			public Adapter caseTestCampaign(TestCampaign object) {
				return createTestCampaignAdapter();
			}
			@Override
			public Adapter caseTest(Test object) {
				return createTestAdapter();
			}
			@Override
			public Adapter caseTestDebuggingFlags(TestDebuggingFlags object) {
				return createTestDebuggingFlagsAdapter();
			}
			@Override
			public Adapter casePassiveMonitorOnly(PassiveMonitorOnly object) {
				return createPassiveMonitorOnlyAdapter();
			}
			@Override
			public Adapter caseActivationGenerationMethod(ActivationGenerationMethod object) {
				return createActivationGenerationMethodAdapter();
			}
			@Override
			public Adapter caseTimeBasedActivationGenerationMethod(TimeBasedActivationGenerationMethod object) {
				return createTimeBasedActivationGenerationMethodAdapter();
			}
			@Override
			public Adapter caseConditionBasedActivationGenerationMethod(ConditionBasedActivationGenerationMethod object) {
				return createConditionBasedActivationGenerationMethodAdapter();
			}
			@Override
			public Adapter caseCampaignResultSet(CampaignResultSet object) {
				return createCampaignResultSetAdapter();
			}
			@Override
			public Adapter caseExecutionEndTrigger(ExecutionEndTrigger object) {
				return createExecutionEndTriggerAdapter();
			}
			@Override
			public Adapter caseTimeBasedEnd(TimeBasedEnd object) {
				return createTimeBasedEndAdapter();
			}
			@Override
			public Adapter caseTestGenerationApproach(TestGenerationApproach object) {
				return createTestGenerationApproachAdapter();
			}
			@Override
			public Adapter caseRandomTestGeneration(RandomTestGeneration object) {
				return createRandomTestGenerationAdapter();
			}
			@Override
			public Adapter caseEvolutionaryAlgorithm(EvolutionaryAlgorithm object) {
				return createEvolutionaryAlgorithmAdapter();
			}
			@Override
			public Adapter caseNSGAEvolutionaryAlgorithm(NSGAEvolutionaryAlgorithm object) {
				return createNSGAEvolutionaryAlgorithmAdapter();
			}
			@Override
			public Adapter caseNSGAWithCoverageCells(NSGAWithCoverageCells object) {
				return createNSGAWithCoverageCellsAdapter();
			}
			@Override
			public Adapter caseCoverageBoostingStrategy(CoverageBoostingStrategy object) {
				return createCoverageBoostingStrategyAdapter();
			}
			@Override
			public Adapter caseFixedNSGACoverageBoostingStrategy(FixedNSGACoverageBoostingStrategy object) {
				return createFixedNSGACoverageBoostingStrategyAdapter();
			}
			@Override
			public Adapter caseLinearNSGACoverageBoostingStrategy(LinearNSGACoverageBoostingStrategy object) {
				return createLinearNSGACoverageBoostingStrategyAdapter();
			}
			@Override
			public Adapter caseDimensionInterval(DimensionInterval object) {
				return createDimensionIntervalAdapter();
			}
			@Override
			public Adapter caseRepeatedExecution(RepeatedExecution object) {
				return createRepeatedExecutionAdapter();
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
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingSpace <em>Testing Space</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingSpace
	 * @generated
	 */
	public Adapter createTestingSpaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign <em>Test Campaign</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign
	 * @generated
	 */
	public Adapter createTestCampaignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test
	 * @generated
	 */
	public Adapter createTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestDebuggingFlags <em>Test Debugging Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestDebuggingFlags
	 * @generated
	 */
	public Adapter createTestDebuggingFlagsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.PassiveMonitorOnly <em>Passive Monitor Only</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.PassiveMonitorOnly
	 * @generated
	 */
	public Adapter createPassiveMonitorOnlyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.ActivationGenerationMethod <em>Activation Generation Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.ActivationGenerationMethod
	 * @generated
	 */
	public Adapter createActivationGenerationMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TimeBasedActivationGenerationMethod <em>Time Based Activation Generation Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TimeBasedActivationGenerationMethod
	 * @generated
	 */
	public Adapter createTimeBasedActivationGenerationMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.ConditionBasedActivationGenerationMethod <em>Condition Based Activation Generation Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.ConditionBasedActivationGenerationMethod
	 * @generated
	 */
	public Adapter createConditionBasedActivationGenerationMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.CampaignResultSet <em>Campaign Result Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.CampaignResultSet
	 * @generated
	 */
	public Adapter createCampaignResultSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.ExecutionEndTrigger <em>Execution End Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.ExecutionEndTrigger
	 * @generated
	 */
	public Adapter createExecutionEndTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TimeBasedEnd <em>Time Based End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TimeBasedEnd
	 * @generated
	 */
	public Adapter createTimeBasedEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestGenerationApproach <em>Test Generation Approach</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestGenerationApproach
	 * @generated
	 */
	public Adapter createTestGenerationApproachAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.RandomTestGeneration <em>Random Test Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.RandomTestGeneration
	 * @generated
	 */
	public Adapter createRandomTestGenerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.EvolutionaryAlgorithm <em>Evolutionary Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.EvolutionaryAlgorithm
	 * @generated
	 */
	public Adapter createEvolutionaryAlgorithmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.NSGAEvolutionaryAlgorithm <em>NSGA Evolutionary Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.NSGAEvolutionaryAlgorithm
	 * @generated
	 */
	public Adapter createNSGAEvolutionaryAlgorithmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.NSGAWithCoverageCells <em>NSGA With Coverage Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.NSGAWithCoverageCells
	 * @generated
	 */
	public Adapter createNSGAWithCoverageCellsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.CoverageBoostingStrategy <em>Coverage Boosting Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.CoverageBoostingStrategy
	 * @generated
	 */
	public Adapter createCoverageBoostingStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FixedNSGACoverageBoostingStrategy <em>Fixed NSGA Coverage Boosting Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FixedNSGACoverageBoostingStrategy
	 * @generated
	 */
	public Adapter createFixedNSGACoverageBoostingStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.LinearNSGACoverageBoostingStrategy <em>Linear NSGA Coverage Boosting Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.LinearNSGACoverageBoostingStrategy
	 * @generated
	 */
	public Adapter createLinearNSGACoverageBoostingStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.DimensionInterval <em>Dimension Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.DimensionInterval
	 * @generated
	 */
	public Adapter createDimensionIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.RepeatedExecution <em>Repeated Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.RepeatedExecution
	 * @generated
	 */
	public Adapter createRepeatedExecutionAdapter() {
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

} //TestingPackageAdapterFactory
