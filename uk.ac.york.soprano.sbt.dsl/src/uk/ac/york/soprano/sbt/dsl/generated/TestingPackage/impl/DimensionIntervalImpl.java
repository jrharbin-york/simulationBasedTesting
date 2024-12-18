/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.DimensionID;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.DimensionInterval;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dimension Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.DimensionIntervalImpl#getDimID <em>Dim ID</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.DimensionIntervalImpl#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.DimensionIntervalImpl#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.DimensionIntervalImpl#getCount <em>Count</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.DimensionIntervalImpl#getExtraData <em>Extra Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DimensionIntervalImpl extends MinimalEObjectImpl.Container implements DimensionInterval {
	/**
	 * The default value of the '{@link #getDimID() <em>Dim ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimID()
	 * @generated
	 * @ordered
	 */
	protected static final DimensionID DIM_ID_EDEFAULT = DimensionID.T1_TIME_MIDPOINT_MEAN;

	/**
	 * The cached value of the '{@link #getDimID() <em>Dim ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimID()
	 * @generated
	 * @ordered
	 */
	protected DimensionID dimID = DIM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected double minValue = MIN_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected double maxValue = MAX_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected int count = COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtraData() <em>Extra Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraData()
	 * @generated
	 * @ordered
	 */
	protected static final int EXTRA_DATA_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getExtraData() <em>Extra Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraData()
	 * @generated
	 * @ordered
	 */
	protected int extraData = EXTRA_DATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DimensionIntervalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestingPackagePackage.Literals.DIMENSION_INTERVAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionID getDimID() {
		return dimID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimID(DimensionID newDimID) {
		DimensionID oldDimID = dimID;
		dimID = newDimID == null ? DIM_ID_EDEFAULT : newDimID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestingPackagePackage.DIMENSION_INTERVAL__DIM_ID, oldDimID, dimID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinValue() {
		return minValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValue(double newMinValue) {
		double oldMinValue = minValue;
		minValue = newMinValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestingPackagePackage.DIMENSION_INTERVAL__MIN_VALUE, oldMinValue, minValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxValue() {
		return maxValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValue(double newMaxValue) {
		double oldMaxValue = maxValue;
		maxValue = newMaxValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestingPackagePackage.DIMENSION_INTERVAL__MAX_VALUE, oldMaxValue, maxValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(int newCount) {
		int oldCount = count;
		count = newCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestingPackagePackage.DIMENSION_INTERVAL__COUNT, oldCount, count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExtraData() {
		return extraData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtraData(int newExtraData) {
		int oldExtraData = extraData;
		extraData = newExtraData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestingPackagePackage.DIMENSION_INTERVAL__EXTRA_DATA, oldExtraData, extraData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestingPackagePackage.DIMENSION_INTERVAL__DIM_ID:
				return getDimID();
			case TestingPackagePackage.DIMENSION_INTERVAL__MIN_VALUE:
				return getMinValue();
			case TestingPackagePackage.DIMENSION_INTERVAL__MAX_VALUE:
				return getMaxValue();
			case TestingPackagePackage.DIMENSION_INTERVAL__COUNT:
				return getCount();
			case TestingPackagePackage.DIMENSION_INTERVAL__EXTRA_DATA:
				return getExtraData();
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
			case TestingPackagePackage.DIMENSION_INTERVAL__DIM_ID:
				setDimID((DimensionID)newValue);
				return;
			case TestingPackagePackage.DIMENSION_INTERVAL__MIN_VALUE:
				setMinValue((Double)newValue);
				return;
			case TestingPackagePackage.DIMENSION_INTERVAL__MAX_VALUE:
				setMaxValue((Double)newValue);
				return;
			case TestingPackagePackage.DIMENSION_INTERVAL__COUNT:
				setCount((Integer)newValue);
				return;
			case TestingPackagePackage.DIMENSION_INTERVAL__EXTRA_DATA:
				setExtraData((Integer)newValue);
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
			case TestingPackagePackage.DIMENSION_INTERVAL__DIM_ID:
				setDimID(DIM_ID_EDEFAULT);
				return;
			case TestingPackagePackage.DIMENSION_INTERVAL__MIN_VALUE:
				setMinValue(MIN_VALUE_EDEFAULT);
				return;
			case TestingPackagePackage.DIMENSION_INTERVAL__MAX_VALUE:
				setMaxValue(MAX_VALUE_EDEFAULT);
				return;
			case TestingPackagePackage.DIMENSION_INTERVAL__COUNT:
				setCount(COUNT_EDEFAULT);
				return;
			case TestingPackagePackage.DIMENSION_INTERVAL__EXTRA_DATA:
				setExtraData(EXTRA_DATA_EDEFAULT);
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
			case TestingPackagePackage.DIMENSION_INTERVAL__DIM_ID:
				return dimID != DIM_ID_EDEFAULT;
			case TestingPackagePackage.DIMENSION_INTERVAL__MIN_VALUE:
				return minValue != MIN_VALUE_EDEFAULT;
			case TestingPackagePackage.DIMENSION_INTERVAL__MAX_VALUE:
				return maxValue != MAX_VALUE_EDEFAULT;
			case TestingPackagePackage.DIMENSION_INTERVAL__COUNT:
				return count != COUNT_EDEFAULT;
			case TestingPackagePackage.DIMENSION_INTERVAL__EXTRA_DATA:
				return extraData != EXTRA_DATA_EDEFAULT;
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
		result.append(" (dimID: ");
		result.append(dimID);
		result.append(", minValue: ");
		result.append(minValue);
		result.append(", maxValue: ");
		result.append(maxValue);
		result.append(", count: ");
		result.append(count);
		result.append(", extraData: ");
		result.append(extraData);
		result.append(')');
		return result.toString();
	}

} //DimensionIntervalImpl
