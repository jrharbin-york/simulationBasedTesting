/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XML Config Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.XMLConfigLocation#getXpathExpression <em>Xpath Expression</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.XMLConfigLocation#getSeperationCharacterAsString <em>Seperation Character As String</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.XMLConfigLocation#getElementNum <em>Element Num</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage#getXMLConfigLocation()
 * @model
 * @generated
 */
public interface XMLConfigLocation extends FileLocation {
	/**
	 * Returns the value of the '<em><b>Xpath Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xpath Expression</em>' attribute.
	 * @see #setXpathExpression(String)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage#getXMLConfigLocation_XpathExpression()
	 * @model
	 * @generated
	 */
	String getXpathExpression();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.XMLConfigLocation#getXpathExpression <em>Xpath Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xpath Expression</em>' attribute.
	 * @see #getXpathExpression()
	 * @generated
	 */
	void setXpathExpression(String value);

	/**
	 * Returns the value of the '<em><b>Seperation Character As String</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seperation Character As String</em>' attribute.
	 * @see #setSeperationCharacterAsString(String)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage#getXMLConfigLocation_SeperationCharacterAsString()
	 * @model default=" "
	 * @generated
	 */
	String getSeperationCharacterAsString();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.XMLConfigLocation#getSeperationCharacterAsString <em>Seperation Character As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seperation Character As String</em>' attribute.
	 * @see #getSeperationCharacterAsString()
	 * @generated
	 */
	void setSeperationCharacterAsString(String value);

	/**
	 * Returns the value of the '<em><b>Element Num</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Num</em>' attribute.
	 * @see #setElementNum(int)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage#getXMLConfigLocation_ElementNum()
	 * @model default="-1"
	 * @generated
	 */
	int getElementNum();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.XMLConfigLocation#getElementNum <em>Element Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Num</em>' attribute.
	 * @see #getElementNum()
	 * @generated
	 */
	void setElementNum(int value);

} // XMLConfigLocation
