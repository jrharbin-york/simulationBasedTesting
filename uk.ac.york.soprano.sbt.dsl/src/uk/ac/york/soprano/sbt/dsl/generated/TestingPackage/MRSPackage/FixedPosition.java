/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixed Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.FixedPosition#getLineNum <em>Line Num</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.FixedPosition#getColumnNum <em>Column Num</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage#getFixedPosition()
 * @model
 * @generated
 */
public interface FixedPosition extends FileLocation {
	/**
	 * Returns the value of the '<em><b>Line Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Num</em>' attribute.
	 * @see #setLineNum(int)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage#getFixedPosition_LineNum()
	 * @model
	 * @generated
	 */
	int getLineNum();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.FixedPosition#getLineNum <em>Line Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Num</em>' attribute.
	 * @see #getLineNum()
	 * @generated
	 */
	void setLineNum(int value);

	/**
	 * Returns the value of the '<em><b>Column Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Num</em>' attribute.
	 * @see #setColumnNum(int)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage#getFixedPosition_ColumnNum()
	 * @model
	 * @generated
	 */
	int getColumnNum();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.FixedPosition#getColumnNum <em>Column Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Num</em>' attribute.
	 * @see #getColumnNum()
	 * @generated
	 */
	void setColumnNum(int value);

} // FixedPosition
