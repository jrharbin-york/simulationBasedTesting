/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.FuzzingOperationsPackage
 * @generated
 */
public interface FuzzingOperationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FuzzingOperationsFactory eINSTANCE = uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.FuzzingOperations.impl.FuzzingOperationsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Constant Activation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant Activation</em>'.
	 * @generated
	 */
	ConstantActivation createConstantActivation();

	/**
	 * Returns a new object of class '<em>Fixed Time Activation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fixed Time Activation</em>'.
	 * @generated
	 */
	FixedTimeActivation createFixedTimeActivation();

	/**
	 * Returns a new object of class '<em>Condition Based Activation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition Based Activation</em>'.
	 * @generated
	 */
	ConditionBasedActivation createConditionBasedActivation();

	/**
	 * Returns a new object of class '<em>Condition Based Time Limited</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition Based Time Limited</em>'.
	 * @generated
	 */
	ConditionBasedTimeLimited createConditionBasedTimeLimited();

	/**
	 * Returns a new object of class '<em>Custom Fuzzing Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Fuzzing Operation</em>'.
	 * @generated
	 */
	CustomFuzzingOperation createCustomFuzzingOperation();

	/**
	 * Returns a new object of class '<em>Random Value From Set Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Random Value From Set Operation</em>'.
	 * @generated
	 */
	RandomValueFromSetOperation createRandomValueFromSetOperation();

	/**
	 * Returns a new object of class '<em>Value Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Set</em>'.
	 * @generated
	 */
	ValueSet createValueSet();

	/**
	 * Returns a new object of class '<em>Int Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Range</em>'.
	 * @generated
	 */
	IntRange createIntRange();

	/**
	 * Returns a new object of class '<em>Double Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double Range</em>'.
	 * @generated
	 */
	DoubleRange createDoubleRange();

	/**
	 * Returns a new object of class '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point</em>'.
	 * @generated
	 */
	Point createPoint();

	/**
	 * Returns a new object of class '<em>Point Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point Range</em>'.
	 * @generated
	 */
	PointRange createPointRange();

	/**
	 * Returns a new object of class '<em>String Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Set</em>'.
	 * @generated
	 */
	StringSet createStringSet();

	/**
	 * Returns a new object of class '<em>External Resource Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Resource Set</em>'.
	 * @generated
	 */
	ExternalResourceSet createExternalResourceSet();

	/**
	 * Returns a new object of class '<em>Latency Network Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Latency Network Operation</em>'.
	 * @generated
	 */
	LatencyNetworkOperation createLatencyNetworkOperation();

	/**
	 * Returns a new object of class '<em>Packet Loss Network Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Packet Loss Network Operation</em>'.
	 * @generated
	 */
	PacketLossNetworkOperation createPacketLossNetworkOperation();

	/**
	 * Returns a new object of class '<em>Multiple Messages Network Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiple Messages Network Operation</em>'.
	 * @generated
	 */
	MultipleMessagesNetworkOperation createMultipleMessagesNetworkOperation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FuzzingOperationsPackage getFuzzingOperationsPackage();

} //FuzzingOperationsFactory
