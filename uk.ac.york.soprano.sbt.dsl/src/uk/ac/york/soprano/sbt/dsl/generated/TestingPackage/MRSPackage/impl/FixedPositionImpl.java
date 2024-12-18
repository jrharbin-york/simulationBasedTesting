/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.FixedPosition;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fixed Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.FixedPositionImpl#getLineNum <em>Line Num</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.FixedPositionImpl#getColumnNum <em>Column Num</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FixedPositionImpl extends FileLocationImpl implements FixedPosition {
	/**
	 * The default value of the '{@link #getLineNum() <em>Line Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineNum()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_NUM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLineNum() <em>Line Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineNum()
	 * @generated
	 * @ordered
	 */
	protected int lineNum = LINE_NUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnNum() <em>Column Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnNum()
	 * @generated
	 * @ordered
	 */
	protected static final int COLUMN_NUM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getColumnNum() <em>Column Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnNum()
	 * @generated
	 * @ordered
	 */
	protected int columnNum = COLUMN_NUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FixedPositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MRSPackagePackage.Literals.FIXED_POSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLineNum() {
		return lineNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineNum(int newLineNum) {
		int oldLineNum = lineNum;
		lineNum = newLineNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRSPackagePackage.FIXED_POSITION__LINE_NUM, oldLineNum, lineNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColumnNum() {
		return columnNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnNum(int newColumnNum) {
		int oldColumnNum = columnNum;
		columnNum = newColumnNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRSPackagePackage.FIXED_POSITION__COLUMN_NUM, oldColumnNum, columnNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MRSPackagePackage.FIXED_POSITION__LINE_NUM:
				return getLineNum();
			case MRSPackagePackage.FIXED_POSITION__COLUMN_NUM:
				return getColumnNum();
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
			case MRSPackagePackage.FIXED_POSITION__LINE_NUM:
				setLineNum((Integer)newValue);
				return;
			case MRSPackagePackage.FIXED_POSITION__COLUMN_NUM:
				setColumnNum((Integer)newValue);
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
			case MRSPackagePackage.FIXED_POSITION__LINE_NUM:
				setLineNum(LINE_NUM_EDEFAULT);
				return;
			case MRSPackagePackage.FIXED_POSITION__COLUMN_NUM:
				setColumnNum(COLUMN_NUM_EDEFAULT);
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
			case MRSPackagePackage.FIXED_POSITION__LINE_NUM:
				return lineNum != LINE_NUM_EDEFAULT;
			case MRSPackagePackage.FIXED_POSITION__COLUMN_NUM:
				return columnNum != COLUMN_NUM_EDEFAULT;
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
		result.append(" (lineNum: ");
		result.append(lineNum);
		result.append(", columnNum: ");
		result.append(columnNum);
		result.append(')');
		return result.toString();
	}

} //FixedPositionImpl
