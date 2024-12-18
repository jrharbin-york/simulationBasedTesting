/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.RegexLocation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regex Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.RegexLocationImpl#getRegexFinder <em>Regex Finder</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegexLocationImpl extends FileLocationImpl implements RegexLocation {
	/**
	 * The default value of the '{@link #getRegexFinder() <em>Regex Finder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegexFinder()
	 * @generated
	 * @ordered
	 */
	protected static final String REGEX_FINDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegexFinder() <em>Regex Finder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegexFinder()
	 * @generated
	 * @ordered
	 */
	protected String regexFinder = REGEX_FINDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegexLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MRSPackagePackage.Literals.REGEX_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegexFinder() {
		return regexFinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegexFinder(String newRegexFinder) {
		String oldRegexFinder = regexFinder;
		regexFinder = newRegexFinder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRSPackagePackage.REGEX_LOCATION__REGEX_FINDER, oldRegexFinder, regexFinder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MRSPackagePackage.REGEX_LOCATION__REGEX_FINDER:
				return getRegexFinder();
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
			case MRSPackagePackage.REGEX_LOCATION__REGEX_FINDER:
				setRegexFinder((String)newValue);
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
			case MRSPackagePackage.REGEX_LOCATION__REGEX_FINDER:
				setRegexFinder(REGEX_FINDER_EDEFAULT);
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
			case MRSPackagePackage.REGEX_LOCATION__REGEX_FINDER:
				return REGEX_FINDER_EDEFAULT == null ? regexFinder != null : !REGEX_FINDER_EDEFAULT.equals(regexFinder);
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
		result.append(" (regexFinder: ");
		result.append(regexFinder);
		result.append(')');
		return result.toString();
	}

} //RegexLocationImpl
