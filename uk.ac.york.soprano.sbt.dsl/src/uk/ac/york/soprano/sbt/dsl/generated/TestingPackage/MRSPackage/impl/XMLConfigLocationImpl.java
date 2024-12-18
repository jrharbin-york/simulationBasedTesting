/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.XMLConfigLocation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XML Config Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.XMLConfigLocationImpl#getXpathExpression <em>Xpath Expression</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.XMLConfigLocationImpl#getSeperationCharacterAsString <em>Seperation Character As String</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.XMLConfigLocationImpl#getElementNum <em>Element Num</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XMLConfigLocationImpl extends FileLocationImpl implements XMLConfigLocation {
	/**
	 * The default value of the '{@link #getXpathExpression() <em>Xpath Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXpathExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String XPATH_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXpathExpression() <em>Xpath Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXpathExpression()
	 * @generated
	 * @ordered
	 */
	protected String xpathExpression = XPATH_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeperationCharacterAsString() <em>Seperation Character As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeperationCharacterAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String SEPERATION_CHARACTER_AS_STRING_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getSeperationCharacterAsString() <em>Seperation Character As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeperationCharacterAsString()
	 * @generated
	 * @ordered
	 */
	protected String seperationCharacterAsString = SEPERATION_CHARACTER_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getElementNum() <em>Element Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementNum()
	 * @generated
	 * @ordered
	 */
	protected static final int ELEMENT_NUM_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getElementNum() <em>Element Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementNum()
	 * @generated
	 * @ordered
	 */
	protected int elementNum = ELEMENT_NUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLConfigLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MRSPackagePackage.Literals.XML_CONFIG_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXpathExpression() {
		return xpathExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXpathExpression(String newXpathExpression) {
		String oldXpathExpression = xpathExpression;
		xpathExpression = newXpathExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRSPackagePackage.XML_CONFIG_LOCATION__XPATH_EXPRESSION, oldXpathExpression, xpathExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSeperationCharacterAsString() {
		return seperationCharacterAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeperationCharacterAsString(String newSeperationCharacterAsString) {
		String oldSeperationCharacterAsString = seperationCharacterAsString;
		seperationCharacterAsString = newSeperationCharacterAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRSPackagePackage.XML_CONFIG_LOCATION__SEPERATION_CHARACTER_AS_STRING, oldSeperationCharacterAsString, seperationCharacterAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getElementNum() {
		return elementNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementNum(int newElementNum) {
		int oldElementNum = elementNum;
		elementNum = newElementNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRSPackagePackage.XML_CONFIG_LOCATION__ELEMENT_NUM, oldElementNum, elementNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MRSPackagePackage.XML_CONFIG_LOCATION__XPATH_EXPRESSION:
				return getXpathExpression();
			case MRSPackagePackage.XML_CONFIG_LOCATION__SEPERATION_CHARACTER_AS_STRING:
				return getSeperationCharacterAsString();
			case MRSPackagePackage.XML_CONFIG_LOCATION__ELEMENT_NUM:
				return getElementNum();
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
			case MRSPackagePackage.XML_CONFIG_LOCATION__XPATH_EXPRESSION:
				setXpathExpression((String)newValue);
				return;
			case MRSPackagePackage.XML_CONFIG_LOCATION__SEPERATION_CHARACTER_AS_STRING:
				setSeperationCharacterAsString((String)newValue);
				return;
			case MRSPackagePackage.XML_CONFIG_LOCATION__ELEMENT_NUM:
				setElementNum((Integer)newValue);
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
			case MRSPackagePackage.XML_CONFIG_LOCATION__XPATH_EXPRESSION:
				setXpathExpression(XPATH_EXPRESSION_EDEFAULT);
				return;
			case MRSPackagePackage.XML_CONFIG_LOCATION__SEPERATION_CHARACTER_AS_STRING:
				setSeperationCharacterAsString(SEPERATION_CHARACTER_AS_STRING_EDEFAULT);
				return;
			case MRSPackagePackage.XML_CONFIG_LOCATION__ELEMENT_NUM:
				setElementNum(ELEMENT_NUM_EDEFAULT);
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
			case MRSPackagePackage.XML_CONFIG_LOCATION__XPATH_EXPRESSION:
				return XPATH_EXPRESSION_EDEFAULT == null ? xpathExpression != null : !XPATH_EXPRESSION_EDEFAULT.equals(xpathExpression);
			case MRSPackagePackage.XML_CONFIG_LOCATION__SEPERATION_CHARACTER_AS_STRING:
				return SEPERATION_CHARACTER_AS_STRING_EDEFAULT == null ? seperationCharacterAsString != null : !SEPERATION_CHARACTER_AS_STRING_EDEFAULT.equals(seperationCharacterAsString);
			case MRSPackagePackage.XML_CONFIG_LOCATION__ELEMENT_NUM:
				return elementNum != ELEMENT_NUM_EDEFAULT;
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
		result.append(" (xpathExpression: ");
		result.append(xpathExpression);
		result.append(", seperationCharacterAsString: ");
		result.append(seperationCharacterAsString);
		result.append(", elementNum: ");
		result.append(elementNum);
		result.append(')');
		return result.toString();
	}

} //XMLConfigLocationImpl
