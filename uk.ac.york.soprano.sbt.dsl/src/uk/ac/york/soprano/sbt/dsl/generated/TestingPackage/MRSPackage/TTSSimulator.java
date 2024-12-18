/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TTS Simulator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.TTSSimulator#getHostname <em>Hostname</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.TTSSimulator#getPort <em>Port</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.TTSSimulator#getStepSizeMillis <em>Step Size Millis</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.TTSSimulator#isUseStepping <em>Use Stepping</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.TTSSimulator#isUseGUI <em>Use GUI</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage#getTTSSimulator()
 * @model
 * @generated
 */
public interface TTSSimulator extends Simulator {
	/**
	 * Returns the value of the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hostname</em>' attribute.
	 * @see #setHostname(String)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage#getTTSSimulator_Hostname()
	 * @model
	 * @generated
	 */
	String getHostname();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.TTSSimulator#getHostname <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hostname</em>' attribute.
	 * @see #getHostname()
	 * @generated
	 */
	void setHostname(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(String)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage#getTTSSimulator_Port()
	 * @model
	 * @generated
	 */
	String getPort();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.TTSSimulator#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(String value);

	/**
	 * Returns the value of the '<em><b>Step Size Millis</b></em>' attribute.
	 * The default value is <code>"20"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Size Millis</em>' attribute.
	 * @see #setStepSizeMillis(double)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage#getTTSSimulator_StepSizeMillis()
	 * @model default="20"
	 * @generated
	 */
	double getStepSizeMillis();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.TTSSimulator#getStepSizeMillis <em>Step Size Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Size Millis</em>' attribute.
	 * @see #getStepSizeMillis()
	 * @generated
	 */
	void setStepSizeMillis(double value);

	/**
	 * Returns the value of the '<em><b>Use Stepping</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Stepping</em>' attribute.
	 * @see #setUseStepping(boolean)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage#getTTSSimulator_UseStepping()
	 * @model default="false"
	 * @generated
	 */
	boolean isUseStepping();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.TTSSimulator#isUseStepping <em>Use Stepping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Stepping</em>' attribute.
	 * @see #isUseStepping()
	 * @generated
	 */
	void setUseStepping(boolean value);

	/**
	 * Returns the value of the '<em><b>Use GUI</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use GUI</em>' attribute.
	 * @see #setUseGUI(boolean)
	 * @see uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage#getTTSSimulator_UseGUI()
	 * @model default="false"
	 * @generated
	 */
	boolean isUseGUI();

	/**
	 * Sets the value of the '{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.TTSSimulator#isUseGUI <em>Use GUI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use GUI</em>' attribute.
	 * @see #isUseGUI()
	 * @generated
	 */
	void setUseGUI(boolean value);

} // TTSSimulator
