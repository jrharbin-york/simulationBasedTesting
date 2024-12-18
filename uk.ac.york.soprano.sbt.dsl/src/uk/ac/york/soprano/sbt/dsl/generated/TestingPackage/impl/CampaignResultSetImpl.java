/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.CampaignResultSet;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.ResultSetStatus;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.Test;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Campaign Result Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.CampaignResultSetImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.CampaignResultSetImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.CampaignResultSetImpl#getResults <em>Results</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CampaignResultSetImpl extends MinimalEObjectImpl.Container implements CampaignResultSet {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ResultSetStatus STATUS_EDEFAULT = ResultSetStatus.FINAL;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected ResultSetStatus status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResults() <em>Results</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
	protected EList<Test> results;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CampaignResultSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestingPackagePackage.Literals.CAMPAIGN_RESULT_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestingPackagePackage.CAMPAIGN_RESULT_SET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultSetStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(ResultSetStatus newStatus) {
		ResultSetStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestingPackagePackage.CAMPAIGN_RESULT_SET__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Test> getResults() {
		if (results == null) {
			results = new EObjectResolvingEList<Test>(Test.class, this, TestingPackagePackage.CAMPAIGN_RESULT_SET__RESULTS);
		}
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestingPackagePackage.CAMPAIGN_RESULT_SET__NAME:
				return getName();
			case TestingPackagePackage.CAMPAIGN_RESULT_SET__STATUS:
				return getStatus();
			case TestingPackagePackage.CAMPAIGN_RESULT_SET__RESULTS:
				return getResults();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TestingPackagePackage.CAMPAIGN_RESULT_SET__NAME:
				setName((String)newValue);
				return;
			case TestingPackagePackage.CAMPAIGN_RESULT_SET__STATUS:
				setStatus((ResultSetStatus)newValue);
				return;
			case TestingPackagePackage.CAMPAIGN_RESULT_SET__RESULTS:
				getResults().clear();
				getResults().addAll((Collection<? extends Test>)newValue);
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
			case TestingPackagePackage.CAMPAIGN_RESULT_SET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TestingPackagePackage.CAMPAIGN_RESULT_SET__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case TestingPackagePackage.CAMPAIGN_RESULT_SET__RESULTS:
				getResults().clear();
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
			case TestingPackagePackage.CAMPAIGN_RESULT_SET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TestingPackagePackage.CAMPAIGN_RESULT_SET__STATUS:
				return status != STATUS_EDEFAULT;
			case TestingPackagePackage.CAMPAIGN_RESULT_SET__RESULTS:
				return results != null && !results.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //CampaignResultSetImpl
