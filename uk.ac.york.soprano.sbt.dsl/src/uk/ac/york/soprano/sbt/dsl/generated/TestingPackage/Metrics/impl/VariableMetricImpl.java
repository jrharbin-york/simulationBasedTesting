/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.EventBasedVariable;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.MetricsPackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.VariableMetric;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Metric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.impl.VariableMetricImpl#getChosenVariable <em>Chosen Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableMetricImpl extends MetricImpl implements VariableMetric {
	/**
	 * The cached value of the '{@link #getChosenVariable() <em>Chosen Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChosenVariable()
	 * @generated
	 * @ordered
	 */
	protected EventBasedVariable chosenVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableMetricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.VARIABLE_METRIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventBasedVariable getChosenVariable() {
		if (chosenVariable != null && chosenVariable.eIsProxy()) {
			InternalEObject oldChosenVariable = (InternalEObject)chosenVariable;
			chosenVariable = (EventBasedVariable)eResolveProxy(oldChosenVariable);
			if (chosenVariable != oldChosenVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetricsPackage.VARIABLE_METRIC__CHOSEN_VARIABLE, oldChosenVariable, chosenVariable));
			}
		}
		return chosenVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventBasedVariable basicGetChosenVariable() {
		return chosenVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChosenVariable(EventBasedVariable newChosenVariable) {
		EventBasedVariable oldChosenVariable = chosenVariable;
		chosenVariable = newChosenVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetricsPackage.VARIABLE_METRIC__CHOSEN_VARIABLE, oldChosenVariable, chosenVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetricsPackage.VARIABLE_METRIC__CHOSEN_VARIABLE:
				if (resolve) return getChosenVariable();
				return basicGetChosenVariable();
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
			case MetricsPackage.VARIABLE_METRIC__CHOSEN_VARIABLE:
				setChosenVariable((EventBasedVariable)newValue);
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
			case MetricsPackage.VARIABLE_METRIC__CHOSEN_VARIABLE:
				setChosenVariable((EventBasedVariable)null);
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
			case MetricsPackage.VARIABLE_METRIC__CHOSEN_VARIABLE:
				return chosenVariable != null;
		}
		return super.eIsSet(featureID);
	}

} //VariableMetricImpl
