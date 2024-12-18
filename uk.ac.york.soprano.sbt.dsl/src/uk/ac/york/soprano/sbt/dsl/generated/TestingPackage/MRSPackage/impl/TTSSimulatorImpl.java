/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.MRSPackagePackage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.TTSSimulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TTS Simulator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.TTSSimulatorImpl#getHostname <em>Hostname</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.TTSSimulatorImpl#getPort <em>Port</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.TTSSimulatorImpl#getStepSizeMillis <em>Step Size Millis</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.TTSSimulatorImpl#isUseStepping <em>Use Stepping</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.impl.TTSSimulatorImpl#isUseGUI <em>Use GUI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TTSSimulatorImpl extends SimulatorImpl implements TTSSimulator {
	/**
	 * The default value of the '{@link #getHostname() <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostname()
	 * @generated
	 * @ordered
	 */
	protected static final String HOSTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostname() <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostname()
	 * @generated
	 * @ordered
	 */
	protected String hostname = HOSTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final String PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected String port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStepSizeMillis() <em>Step Size Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepSizeMillis()
	 * @generated
	 * @ordered
	 */
	protected static final double STEP_SIZE_MILLIS_EDEFAULT = 20.0;

	/**
	 * The cached value of the '{@link #getStepSizeMillis() <em>Step Size Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepSizeMillis()
	 * @generated
	 * @ordered
	 */
	protected double stepSizeMillis = STEP_SIZE_MILLIS_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseStepping() <em>Use Stepping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseStepping()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_STEPPING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseStepping() <em>Use Stepping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseStepping()
	 * @generated
	 * @ordered
	 */
	protected boolean useStepping = USE_STEPPING_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseGUI() <em>Use GUI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseGUI()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_GUI_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseGUI() <em>Use GUI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseGUI()
	 * @generated
	 * @ordered
	 */
	protected boolean useGUI = USE_GUI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TTSSimulatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MRSPackagePackage.Literals.TTS_SIMULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHostname() {
		return hostname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostname(String newHostname) {
		String oldHostname = hostname;
		hostname = newHostname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRSPackagePackage.TTS_SIMULATOR__HOSTNAME, oldHostname, hostname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(String newPort) {
		String oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRSPackagePackage.TTS_SIMULATOR__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getStepSizeMillis() {
		return stepSizeMillis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepSizeMillis(double newStepSizeMillis) {
		double oldStepSizeMillis = stepSizeMillis;
		stepSizeMillis = newStepSizeMillis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRSPackagePackage.TTS_SIMULATOR__STEP_SIZE_MILLIS, oldStepSizeMillis, stepSizeMillis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseStepping() {
		return useStepping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseStepping(boolean newUseStepping) {
		boolean oldUseStepping = useStepping;
		useStepping = newUseStepping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRSPackagePackage.TTS_SIMULATOR__USE_STEPPING, oldUseStepping, useStepping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseGUI() {
		return useGUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseGUI(boolean newUseGUI) {
		boolean oldUseGUI = useGUI;
		useGUI = newUseGUI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRSPackagePackage.TTS_SIMULATOR__USE_GUI, oldUseGUI, useGUI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MRSPackagePackage.TTS_SIMULATOR__HOSTNAME:
				return getHostname();
			case MRSPackagePackage.TTS_SIMULATOR__PORT:
				return getPort();
			case MRSPackagePackage.TTS_SIMULATOR__STEP_SIZE_MILLIS:
				return getStepSizeMillis();
			case MRSPackagePackage.TTS_SIMULATOR__USE_STEPPING:
				return isUseStepping();
			case MRSPackagePackage.TTS_SIMULATOR__USE_GUI:
				return isUseGUI();
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
			case MRSPackagePackage.TTS_SIMULATOR__HOSTNAME:
				setHostname((String)newValue);
				return;
			case MRSPackagePackage.TTS_SIMULATOR__PORT:
				setPort((String)newValue);
				return;
			case MRSPackagePackage.TTS_SIMULATOR__STEP_SIZE_MILLIS:
				setStepSizeMillis((Double)newValue);
				return;
			case MRSPackagePackage.TTS_SIMULATOR__USE_STEPPING:
				setUseStepping((Boolean)newValue);
				return;
			case MRSPackagePackage.TTS_SIMULATOR__USE_GUI:
				setUseGUI((Boolean)newValue);
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
			case MRSPackagePackage.TTS_SIMULATOR__HOSTNAME:
				setHostname(HOSTNAME_EDEFAULT);
				return;
			case MRSPackagePackage.TTS_SIMULATOR__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case MRSPackagePackage.TTS_SIMULATOR__STEP_SIZE_MILLIS:
				setStepSizeMillis(STEP_SIZE_MILLIS_EDEFAULT);
				return;
			case MRSPackagePackage.TTS_SIMULATOR__USE_STEPPING:
				setUseStepping(USE_STEPPING_EDEFAULT);
				return;
			case MRSPackagePackage.TTS_SIMULATOR__USE_GUI:
				setUseGUI(USE_GUI_EDEFAULT);
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
			case MRSPackagePackage.TTS_SIMULATOR__HOSTNAME:
				return HOSTNAME_EDEFAULT == null ? hostname != null : !HOSTNAME_EDEFAULT.equals(hostname);
			case MRSPackagePackage.TTS_SIMULATOR__PORT:
				return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
			case MRSPackagePackage.TTS_SIMULATOR__STEP_SIZE_MILLIS:
				return stepSizeMillis != STEP_SIZE_MILLIS_EDEFAULT;
			case MRSPackagePackage.TTS_SIMULATOR__USE_STEPPING:
				return useStepping != USE_STEPPING_EDEFAULT;
			case MRSPackagePackage.TTS_SIMULATOR__USE_GUI:
				return useGUI != USE_GUI_EDEFAULT;
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
		result.append(" (hostname: ");
		result.append(hostname);
		result.append(", port: ");
		result.append(port);
		result.append(", stepSizeMillis: ");
		result.append(stepSizeMillis);
		result.append(", useStepping: ");
		result.append(useStepping);
		result.append(", useGUI: ");
		result.append(useGUI);
		result.append(')');
		return result.toString();
	}

} //TTSSimulatorImpl
