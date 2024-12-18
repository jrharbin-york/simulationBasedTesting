/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperationsPackage
 * @generated
 */
public class FuzzingOperationsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FuzzingOperationsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuzzingOperationsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FuzzingOperationsPackage.eINSTANCE;
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
	protected FuzzingOperationsSwitch<Adapter> modelSwitch =
		new FuzzingOperationsSwitch<Adapter>() {
			@Override
			public Adapter caseFuzzingOperation(FuzzingOperation object) {
				return createFuzzingOperationAdapter();
			}
			@Override
			public Adapter caseActivation(Activation object) {
				return createActivationAdapter();
			}
			@Override
			public Adapter caseConstantActivation(ConstantActivation object) {
				return createConstantActivationAdapter();
			}
			@Override
			public Adapter caseDynamicActivation(DynamicActivation object) {
				return createDynamicActivationAdapter();
			}
			@Override
			public Adapter caseFixedTimeActivation(FixedTimeActivation object) {
				return createFixedTimeActivationAdapter();
			}
			@Override
			public Adapter caseConditionBasedActivation(ConditionBasedActivation object) {
				return createConditionBasedActivationAdapter();
			}
			@Override
			public Adapter caseConditionBasedTimeLimited(ConditionBasedTimeLimited object) {
				return createConditionBasedTimeLimitedAdapter();
			}
			@Override
			public Adapter caseVariableOperation(VariableOperation object) {
				return createVariableOperationAdapter();
			}
			@Override
			public Adapter caseCustomFuzzingOperation(CustomFuzzingOperation object) {
				return createCustomFuzzingOperationAdapter();
			}
			@Override
			public Adapter caseRandomValueFuzzingOperation(RandomValueFuzzingOperation object) {
				return createRandomValueFuzzingOperationAdapter();
			}
			@Override
			public Adapter caseRandomValueFromSetOperation(RandomValueFromSetOperation object) {
				return createRandomValueFromSetOperationAdapter();
			}
			@Override
			public Adapter caseValueSet(ValueSet object) {
				return createValueSetAdapter();
			}
			@Override
			public Adapter caseValueRange(ValueRange object) {
				return createValueRangeAdapter();
			}
			@Override
			public Adapter caseIntRange(IntRange object) {
				return createIntRangeAdapter();
			}
			@Override
			public Adapter caseDoubleRange(DoubleRange object) {
				return createDoubleRangeAdapter();
			}
			@Override
			public Adapter casePoint(Point object) {
				return createPointAdapter();
			}
			@Override
			public Adapter casePointRange(PointRange object) {
				return createPointRangeAdapter();
			}
			@Override
			public Adapter caseStringSet(StringSet object) {
				return createStringSetAdapter();
			}
			@Override
			public Adapter caseExternalResourceSet(ExternalResourceSet object) {
				return createExternalResourceSetAdapter();
			}
			@Override
			public Adapter caseNetworkFuzzingOperation(NetworkFuzzingOperation object) {
				return createNetworkFuzzingOperationAdapter();
			}
			@Override
			public Adapter caseBlackholeNetworkOperation(BlackholeNetworkOperation object) {
				return createBlackholeNetworkOperationAdapter();
			}
			@Override
			public Adapter caseLatencyNetworkOperation(LatencyNetworkOperation object) {
				return createLatencyNetworkOperationAdapter();
			}
			@Override
			public Adapter casePacketLossNetworkOperation(PacketLossNetworkOperation object) {
				return createPacketLossNetworkOperationAdapter();
			}
			@Override
			public Adapter caseMultipleMessagesNetworkOperation(MultipleMessagesNetworkOperation object) {
				return createMultipleMessagesNetworkOperationAdapter();
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
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation <em>Fuzzing Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperation
	 * @generated
	 */
	public Adapter createFuzzingOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.Activation <em>Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.Activation
	 * @generated
	 */
	public Adapter createActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ConstantActivation <em>Constant Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ConstantActivation
	 * @generated
	 */
	public Adapter createConstantActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.DynamicActivation <em>Dynamic Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.DynamicActivation
	 * @generated
	 */
	public Adapter createDynamicActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FixedTimeActivation <em>Fixed Time Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FixedTimeActivation
	 * @generated
	 */
	public Adapter createFixedTimeActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ConditionBasedActivation <em>Condition Based Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ConditionBasedActivation
	 * @generated
	 */
	public Adapter createConditionBasedActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ConditionBasedTimeLimited <em>Condition Based Time Limited</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ConditionBasedTimeLimited
	 * @generated
	 */
	public Adapter createConditionBasedTimeLimitedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.VariableOperation <em>Variable Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.VariableOperation
	 * @generated
	 */
	public Adapter createVariableOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.CustomFuzzingOperation <em>Custom Fuzzing Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.CustomFuzzingOperation
	 * @generated
	 */
	public Adapter createCustomFuzzingOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.RandomValueFuzzingOperation <em>Random Value Fuzzing Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.RandomValueFuzzingOperation
	 * @generated
	 */
	public Adapter createRandomValueFuzzingOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.RandomValueFromSetOperation <em>Random Value From Set Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.RandomValueFromSetOperation
	 * @generated
	 */
	public Adapter createRandomValueFromSetOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ValueSet <em>Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ValueSet
	 * @generated
	 */
	public Adapter createValueSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ValueRange <em>Value Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ValueRange
	 * @generated
	 */
	public Adapter createValueRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.IntRange <em>Int Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.IntRange
	 * @generated
	 */
	public Adapter createIntRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.DoubleRange <em>Double Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.DoubleRange
	 * @generated
	 */
	public Adapter createDoubleRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.Point
	 * @generated
	 */
	public Adapter createPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.PointRange <em>Point Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.PointRange
	 * @generated
	 */
	public Adapter createPointRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.StringSet <em>String Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.StringSet
	 * @generated
	 */
	public Adapter createStringSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ExternalResourceSet <em>External Resource Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.ExternalResourceSet
	 * @generated
	 */
	public Adapter createExternalResourceSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.NetworkFuzzingOperation <em>Network Fuzzing Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.NetworkFuzzingOperation
	 * @generated
	 */
	public Adapter createNetworkFuzzingOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.BlackholeNetworkOperation <em>Blackhole Network Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.BlackholeNetworkOperation
	 * @generated
	 */
	public Adapter createBlackholeNetworkOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.LatencyNetworkOperation <em>Latency Network Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.LatencyNetworkOperation
	 * @generated
	 */
	public Adapter createLatencyNetworkOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.PacketLossNetworkOperation <em>Packet Loss Network Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.PacketLossNetworkOperation
	 * @generated
	 */
	public Adapter createPacketLossNetworkOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.MultipleMessagesNetworkOperation <em>Multiple Messages Network Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.MultipleMessagesNetworkOperation
	 * @generated
	 */
	public Adapter createMultipleMessagesNetworkOperationAdapter() {
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

} //FuzzingOperationsAdapterFactory
