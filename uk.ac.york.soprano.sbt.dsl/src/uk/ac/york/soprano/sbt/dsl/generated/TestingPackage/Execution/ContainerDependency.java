/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ContainerDependency#getImageName <em>Image Name</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ContainerDependency#getTech <em>Tech</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionPackage#getContainerDependency()
 * @model
 * @generated
 */
public interface ContainerDependency extends Dependency {
	/**
	 * Returns the value of the '<em><b>Image Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Name</em>' attribute.
	 * @see #setImageName(String)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionPackage#getContainerDependency_ImageName()
	 * @model
	 * @generated
	 */
	String getImageName();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ContainerDependency#getImageName <em>Image Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Name</em>' attribute.
	 * @see #getImageName()
	 * @generated
	 */
	void setImageName(String value);

	/**
	 * Returns the value of the '<em><b>Tech</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ContainerTechnology}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tech</em>' attribute.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ContainerTechnology
	 * @see #setTech(ContainerTechnology)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionPackage#getContainerDependency_Tech()
	 * @model required="true"
	 * @generated
	 */
	ContainerTechnology getTech();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ContainerDependency#getTech <em>Tech</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tech</em>' attribute.
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ContainerTechnology
	 * @see #getTech()
	 * @generated
	 */
	void setTech(ContainerTechnology value);

} // ContainerDependency
