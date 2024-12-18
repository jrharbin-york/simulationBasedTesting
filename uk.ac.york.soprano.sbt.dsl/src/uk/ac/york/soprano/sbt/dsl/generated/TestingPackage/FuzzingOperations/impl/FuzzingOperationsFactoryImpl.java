/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FuzzingOperationsFactoryImpl extends EFactoryImpl implements FuzzingOperationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FuzzingOperationsFactory init() {
		try {
			FuzzingOperationsFactory theFuzzingOperationsFactory = (FuzzingOperationsFactory)EPackage.Registry.INSTANCE.getEFactory(FuzzingOperationsPackage.eNS_URI);
			if (theFuzzingOperationsFactory != null) {
				return theFuzzingOperationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FuzzingOperationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuzzingOperationsFactoryImpl() {
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
			case FuzzingOperationsPackage.CONSTANT_ACTIVATION: return createConstantActivation();
			case FuzzingOperationsPackage.FIXED_TIME_ACTIVATION: return createFixedTimeActivation();
			case FuzzingOperationsPackage.CONDITION_BASED_ACTIVATION: return createConditionBasedActivation();
			case FuzzingOperationsPackage.CONDITION_BASED_TIME_LIMITED: return createConditionBasedTimeLimited();
			case FuzzingOperationsPackage.CUSTOM_FUZZING_OPERATION: return createCustomFuzzingOperation();
			case FuzzingOperationsPackage.RANDOM_VALUE_FROM_SET_OPERATION: return createRandomValueFromSetOperation();
			case FuzzingOperationsPackage.VALUE_SET: return createValueSet();
			case FuzzingOperationsPackage.INT_RANGE: return createIntRange();
			case FuzzingOperationsPackage.DOUBLE_RANGE: return createDoubleRange();
			case FuzzingOperationsPackage.POINT: return createPoint();
			case FuzzingOperationsPackage.POINT_RANGE: return createPointRange();
			case FuzzingOperationsPackage.STRING_SET: return createStringSet();
			case FuzzingOperationsPackage.EXTERNAL_RESOURCE_SET: return createExternalResourceSet();
			case FuzzingOperationsPackage.LATENCY_NETWORK_OPERATION: return createLatencyNetworkOperation();
			case FuzzingOperationsPackage.PACKET_LOSS_NETWORK_OPERATION: return createPacketLossNetworkOperation();
			case FuzzingOperationsPackage.MULTIPLE_MESSAGES_NETWORK_OPERATION: return createMultipleMessagesNetworkOperation();
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
			case FuzzingOperationsPackage.RANDOM_VALUE_FROM_SET_CHOICE:
				return createRandomValueFromSetChoiceFromString(eDataType, initialValue);
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
			case FuzzingOperationsPackage.RANDOM_VALUE_FROM_SET_CHOICE:
				return convertRandomValueFromSetChoiceToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantActivation createConstantActivation() {
		ConstantActivationImpl constantActivation = new ConstantActivationImpl();
		return constantActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedTimeActivation createFixedTimeActivation() {
		FixedTimeActivationImpl fixedTimeActivation = new FixedTimeActivationImpl();
		return fixedTimeActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionBasedActivation createConditionBasedActivation() {
		ConditionBasedActivationImpl conditionBasedActivation = new ConditionBasedActivationImpl();
		return conditionBasedActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionBasedTimeLimited createConditionBasedTimeLimited() {
		ConditionBasedTimeLimitedImpl conditionBasedTimeLimited = new ConditionBasedTimeLimitedImpl();
		return conditionBasedTimeLimited;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomFuzzingOperation createCustomFuzzingOperation() {
		CustomFuzzingOperationImpl customFuzzingOperation = new CustomFuzzingOperationImpl();
		return customFuzzingOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RandomValueFromSetOperation createRandomValueFromSetOperation() {
		RandomValueFromSetOperationImpl randomValueFromSetOperation = new RandomValueFromSetOperationImpl();
		return randomValueFromSetOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSet createValueSet() {
		ValueSetImpl valueSet = new ValueSetImpl();
		return valueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntRange createIntRange() {
		IntRangeImpl intRange = new IntRangeImpl();
		return intRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleRange createDoubleRange() {
		DoubleRangeImpl doubleRange = new DoubleRangeImpl();
		return doubleRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point createPoint() {
		PointImpl point = new PointImpl();
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointRange createPointRange() {
		PointRangeImpl pointRange = new PointRangeImpl();
		return pointRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringSet createStringSet() {
		StringSetImpl stringSet = new StringSetImpl();
		return stringSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalResourceSet createExternalResourceSet() {
		ExternalResourceSetImpl externalResourceSet = new ExternalResourceSetImpl();
		return externalResourceSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LatencyNetworkOperation createLatencyNetworkOperation() {
		LatencyNetworkOperationImpl latencyNetworkOperation = new LatencyNetworkOperationImpl();
		return latencyNetworkOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacketLossNetworkOperation createPacketLossNetworkOperation() {
		PacketLossNetworkOperationImpl packetLossNetworkOperation = new PacketLossNetworkOperationImpl();
		return packetLossNetworkOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleMessagesNetworkOperation createMultipleMessagesNetworkOperation() {
		MultipleMessagesNetworkOperationImpl multipleMessagesNetworkOperation = new MultipleMessagesNetworkOperationImpl();
		return multipleMessagesNetworkOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RandomValueFromSetChoice createRandomValueFromSetChoiceFromString(EDataType eDataType, String initialValue) {
		RandomValueFromSetChoice result = RandomValueFromSetChoice.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRandomValueFromSetChoiceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuzzingOperationsPackage getFuzzingOperationsPackage() {
		return (FuzzingOperationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FuzzingOperationsPackage getPackage() {
		return FuzzingOperationsPackage.eINSTANCE;
	}

} //FuzzingOperationsFactoryImpl
