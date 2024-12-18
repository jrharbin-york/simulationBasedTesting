/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.StandardGrammar.impl;

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
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.MRSPackagePackageImpl;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.MetricsPackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.impl.MetricsPackageImpl;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Results.ResultsPackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Results.impl.ResultsPackageImpl;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.StandardGrammar.BasicCondition;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.StandardGrammar.BinaryComparisonOperation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.StandardGrammar.BinaryLogicalOperation;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.StandardGrammar.CompositeCondition;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.StandardGrammar.Condition;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.StandardGrammar.ConditionConstraint;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.StandardGrammar.ConditionElement;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.StandardGrammar.ConditionExpr;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.StandardGrammar.ConditionInteger;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.StandardGrammar.ConditionVariable;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.StandardGrammar.ContainsInteger;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.StandardGrammar.ContainsVariable;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.StandardGrammar.StandardGrammarFactory;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.StandardGrammar.StandardGrammarPackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.TestingPackagePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StandardGrammarPackageImpl extends EPackageImpl implements StandardGrammarPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containsVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containsIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum binaryComparisonOperationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum binaryLogicalOperationEEnum = null;

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
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.StandardGrammar.StandardGrammarPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StandardGrammarPackageImpl() {
		super(eNS_URI, StandardGrammarFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StandardGrammarPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StandardGrammarPackage init() {
		if (isInited) return (StandardGrammarPackage)EPackage.Registry.INSTANCE.getEPackage(StandardGrammarPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStandardGrammarPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StandardGrammarPackageImpl theStandardGrammarPackage = registeredStandardGrammarPackage instanceof StandardGrammarPackageImpl ? (StandardGrammarPackageImpl)registeredStandardGrammarPackage : new StandardGrammarPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MRSPackagePackage.eNS_URI);
		MRSPackagePackageImpl theMRSPackagePackage = (MRSPackagePackageImpl)(registeredPackage instanceof MRSPackagePackageImpl ? registeredPackage : MRSPackagePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ExecutionPackage.eNS_URI);
		ExecutionPackageImpl theExecutionPackage = (ExecutionPackageImpl)(registeredPackage instanceof ExecutionPackageImpl ? registeredPackage : ExecutionPackage.eINSTANCE);

		// Create package meta-data objects
		theStandardGrammarPackage.createPackageContents();
		theTestingPackagePackage.createPackageContents();
		theFuzzingOperationsPackage.createPackageContents();
		theMetricsPackage.createPackageContents();
		theResultsPackage.createPackageContents();
		theMRSPackagePackage.createPackageContents();
		theExecutionPackage.createPackageContents();

		// Initialize created meta-data
		theStandardGrammarPackage.initializePackageContents();
		theTestingPackagePackage.initializePackageContents();
		theFuzzingOperationsPackage.initializePackageContents();
		theMetricsPackage.initializePackageContents();
		theResultsPackage.initializePackageContents();
		theMRSPackagePackage.initializePackageContents();
		theExecutionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStandardGrammarPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StandardGrammarPackage.eNS_URI, theStandardGrammarPackage);
		return theStandardGrammarPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionElement() {
		return conditionElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeCondition() {
		return compositeConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeCondition_Left() {
		return (EReference)compositeConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeCondition_Right() {
		return (EReference)compositeConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeCondition_Binop() {
		return (EAttribute)compositeConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicCondition() {
		return basicConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicCondition_Left() {
		return (EReference)basicConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicCondition_Bincomp() {
		return (EAttribute)basicConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicCondition_Right() {
		return (EReference)basicConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionExpr() {
		return conditionExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionInteger() {
		return conditionIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionInteger_Value() {
		return (EAttribute)conditionIntegerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionVariable() {
		return conditionVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionVariable_Metric() {
		return (EReference)conditionVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_Name() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_C() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionConstraint() {
		return conditionConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainsVariable() {
		return containsVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainsVariable_Metric() {
		return (EReference)containsVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainsInteger() {
		return containsIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainsInteger_MinValue() {
		return (EAttribute)containsIntegerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainsInteger_MaxValue() {
		return (EAttribute)containsIntegerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBinaryComparisonOperation() {
		return binaryComparisonOperationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBinaryLogicalOperation() {
		return binaryLogicalOperationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardGrammarFactory getStandardGrammarFactory() {
		return (StandardGrammarFactory)getEFactoryInstance();
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
		conditionElementEClass = createEClass(CONDITION_ELEMENT);

		compositeConditionEClass = createEClass(COMPOSITE_CONDITION);
		createEReference(compositeConditionEClass, COMPOSITE_CONDITION__LEFT);
		createEReference(compositeConditionEClass, COMPOSITE_CONDITION__RIGHT);
		createEAttribute(compositeConditionEClass, COMPOSITE_CONDITION__BINOP);

		basicConditionEClass = createEClass(BASIC_CONDITION);
		createEReference(basicConditionEClass, BASIC_CONDITION__LEFT);
		createEAttribute(basicConditionEClass, BASIC_CONDITION__BINCOMP);
		createEReference(basicConditionEClass, BASIC_CONDITION__RIGHT);

		conditionExprEClass = createEClass(CONDITION_EXPR);

		conditionIntegerEClass = createEClass(CONDITION_INTEGER);
		createEAttribute(conditionIntegerEClass, CONDITION_INTEGER__VALUE);

		conditionVariableEClass = createEClass(CONDITION_VARIABLE);
		createEReference(conditionVariableEClass, CONDITION_VARIABLE__METRIC);

		conditionEClass = createEClass(CONDITION);
		createEAttribute(conditionEClass, CONDITION__NAME);
		createEReference(conditionEClass, CONDITION__C);

		conditionConstraintEClass = createEClass(CONDITION_CONSTRAINT);

		containsVariableEClass = createEClass(CONTAINS_VARIABLE);
		createEReference(containsVariableEClass, CONTAINS_VARIABLE__METRIC);

		containsIntegerEClass = createEClass(CONTAINS_INTEGER);
		createEAttribute(containsIntegerEClass, CONTAINS_INTEGER__MIN_VALUE);
		createEAttribute(containsIntegerEClass, CONTAINS_INTEGER__MAX_VALUE);

		// Create enums
		binaryComparisonOperationEEnum = createEEnum(BINARY_COMPARISON_OPERATION);
		binaryLogicalOperationEEnum = createEEnum(BINARY_LOGICAL_OPERATION);
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
		MetricsPackage theMetricsPackage = (MetricsPackage)EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		compositeConditionEClass.getESuperTypes().add(this.getConditionElement());
		basicConditionEClass.getESuperTypes().add(this.getConditionElement());
		conditionIntegerEClass.getESuperTypes().add(this.getConditionExpr());
		conditionVariableEClass.getESuperTypes().add(this.getConditionExpr());
		containsVariableEClass.getESuperTypes().add(this.getConditionConstraint());
		containsIntegerEClass.getESuperTypes().add(this.getConditionConstraint());

		// Initialize classes, features, and operations; add parameters
		initEClass(conditionElementEClass, ConditionElement.class, "ConditionElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositeConditionEClass, CompositeCondition.class, "CompositeCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeCondition_Left(), this.getConditionElement(), null, "left", null, 1, 1, CompositeCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeCondition_Right(), this.getConditionElement(), null, "right", null, 1, 1, CompositeCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompositeCondition_Binop(), this.getBinaryLogicalOperation(), "binop", null, 1, 1, CompositeCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicConditionEClass, BasicCondition.class, "BasicCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBasicCondition_Left(), this.getConditionVariable(), null, "left", null, 1, 1, BasicCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicCondition_Bincomp(), this.getBinaryComparisonOperation(), "bincomp", null, 1, 1, BasicCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasicCondition_Right(), this.getConditionExpr(), null, "right", null, 1, 1, BasicCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionExprEClass, ConditionExpr.class, "ConditionExpr", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionIntegerEClass, ConditionInteger.class, "ConditionInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConditionInteger_Value(), ecorePackage.getEInt(), "value", null, 0, 1, ConditionInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionVariableEClass, ConditionVariable.class, "ConditionVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionVariable_Metric(), theMetricsPackage.getMetric(), null, "metric", null, 1, 1, ConditionVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCondition_Name(), ecorePackage.getEString(), "name", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCondition_C(), this.getConditionElement(), null, "c", null, 1, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionConstraintEClass, ConditionConstraint.class, "ConditionConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(containsVariableEClass, ContainsVariable.class, "ContainsVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainsVariable_Metric(), theMetricsPackage.getMetric(), null, "metric", null, 1, 1, ContainsVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containsIntegerEClass, ContainsInteger.class, "ContainsInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContainsInteger_MinValue(), ecorePackage.getEInt(), "minValue", null, 0, 1, ContainsInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainsInteger_MaxValue(), ecorePackage.getEInt(), "maxValue", null, 0, 1, ContainsInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(binaryComparisonOperationEEnum, BinaryComparisonOperation.class, "BinaryComparisonOperation");
		addEEnumLiteral(binaryComparisonOperationEEnum, BinaryComparisonOperation.LESS_THAN);
		addEEnumLiteral(binaryComparisonOperationEEnum, BinaryComparisonOperation.GREATER_THAN);
		addEEnumLiteral(binaryComparisonOperationEEnum, BinaryComparisonOperation.EQUALS);

		initEEnum(binaryLogicalOperationEEnum, BinaryLogicalOperation.class, "BinaryLogicalOperation");
		addEEnumLiteral(binaryLogicalOperationEEnum, BinaryLogicalOperation.AND);
		addEEnumLiteral(binaryLogicalOperationEEnum, BinaryLogicalOperation.OR);
	}

} //StandardGrammarPackageImpl
