/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derived Container Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.DerivedContainerDependency#getBase <em>Base</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionPackage#getDerivedContainerDependency()
 * @model
 * @generated
 */
public interface DerivedContainerDependency extends Dependency {
	/**
	 * Returns the value of the '<em><b>Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' containment reference.
	 * @see #setBase(ContainerDependency)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionPackage#getDerivedContainerDependency_Base()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ContainerDependency getBase();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.DerivedContainerDependency#getBase <em>Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' containment reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(ContainerDependency value);

} // DerivedContainerDependency
