/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.StandardGrammar.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Metrics.Metric;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.StandardGrammar.ContainsVariable;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.StandardGrammar.StandardGrammarPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contains Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.StandardGrammar.impl.ContainsVariableImpl#getMetric <em>Metric</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainsVariableImpl extends ConditionConstraintImpl implements ContainsVariable {
	/**
	 * The cached value of the '{@link #getMetric() <em>Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected Metric metric;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainsVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardGrammarPackage.Literals.CONTAINS_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metric getMetric() {
		if (metric != null && metric.eIsProxy()) {
			InternalEObject oldMetric = (InternalEObject)metric;
			metric = (Metric)eResolveProxy(oldMetric);
			if (metric != oldMetric) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StandardGrammarPackage.CONTAINS_VARIABLE__METRIC, oldMetric, metric));
			}
		}
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metric basicGetMetric() {
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetric(Metric newMetric) {
		Metric oldMetric = metric;
		metric = newMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StandardGrammarPackage.CONTAINS_VARIABLE__METRIC, oldMetric, metric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StandardGrammarPackage.CONTAINS_VARIABLE__METRIC:
				if (resolve) return getMetric();
				return basicGetMetric();
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
			case StandardGrammarPackage.CONTAINS_VARIABLE__METRIC:
				setMetric((Metric)newValue);
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
			case StandardGrammarPackage.CONTAINS_VARIABLE__METRIC:
				setMetric((Metric)null);
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
			case StandardGrammarPackage.CONTAINS_VARIABLE__METRIC:
				return metric != null;
		}
		return super.eIsSet(featureID);
	}

} //ContainsVariableImpl
