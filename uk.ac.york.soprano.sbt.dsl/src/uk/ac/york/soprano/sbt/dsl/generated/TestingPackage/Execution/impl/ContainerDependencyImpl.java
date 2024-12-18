/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ContainerDependency;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ContainerTechnology;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.ExecutionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ContainerDependencyImpl#getImageName <em>Image Name</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Execution.impl.ContainerDependencyImpl#getTech <em>Tech</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerDependencyImpl extends DependencyImpl implements ContainerDependency {
	/**
	 * The default value of the '{@link #getImageName() <em>Image Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageName()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageName() <em>Image Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageName()
	 * @generated
	 * @ordered
	 */
	protected String imageName = IMAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTech() <em>Tech</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTech()
	 * @generated
	 * @ordered
	 */
	protected static final ContainerTechnology TECH_EDEFAULT = ContainerTechnology.DOCKER;

	/**
	 * The cached value of the '{@link #getTech() <em>Tech</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTech()
	 * @generated
	 * @ordered
	 */
	protected ContainerTechnology tech = TECH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.CONTAINER_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImageName() {
		return imageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageName(String newImageName) {
		String oldImageName = imageName;
		imageName = newImageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.CONTAINER_DEPENDENCY__IMAGE_NAME, oldImageName, imageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerTechnology getTech() {
		return tech;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTech(ContainerTechnology newTech) {
		ContainerTechnology oldTech = tech;
		tech = newTech == null ? TECH_EDEFAULT : newTech;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.CONTAINER_DEPENDENCY__TECH, oldTech, tech));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExecutionPackage.CONTAINER_DEPENDENCY__IMAGE_NAME:
				return getImageName();
			case ExecutionPackage.CONTAINER_DEPENDENCY__TECH:
				return getTech();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExecutionPackage.CONTAINER_DEPENDENCY__IMAGE_NAME:
				setImageName((String)newValue);
				return;
			case ExecutionPackage.CONTAINER_DEPENDENCY__TECH:
				setTech((ContainerTechnology)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExecutionPackage.CONTAINER_DEPENDENCY__IMAGE_NAME:
				setImageName(IMAGE_NAME_EDEFAULT);
				return;
			case ExecutionPackage.CONTAINER_DEPENDENCY__TECH:
				setTech(TECH_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExecutionPackage.CONTAINER_DEPENDENCY__IMAGE_NAME:
				return IMAGE_NAME_EDEFAULT == null ? imageName != null : !IMAGE_NAME_EDEFAULT.equals(imageName);
			case ExecutionPackage.CONTAINER_DEPENDENCY__TECH:
				return tech != TECH_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (imageName: ");
		result.append(imageName);
		result.append(", tech: ");
		result.append(tech);
		result.append(')');
		return result.toString();
	}

} //ContainerDependencyImpl
