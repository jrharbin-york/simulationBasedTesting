/**
 */
package uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.CoverageBoostingStrategy;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.DimensionInterval;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.NSGAWithCoverageCells;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestingPackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NSGA With Coverage Cells</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.NSGAWithCoverageCellsImpl#getCoveragePerCell <em>Coverage Per Cell</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.NSGAWithCoverageCellsImpl#getTargetCoverageProportion <em>Target Coverage Proportion</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.NSGAWithCoverageCellsImpl#getDimensionRecords <em>Dimension Records</em>}</li>
 *   <li>{@link uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.impl.NSGAWithCoverageCellsImpl#getCoverageBoostingStrategy <em>Coverage Boosting Strategy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NSGAWithCoverageCellsImpl extends NSGAEvolutionaryAlgorithmImpl implements NSGAWithCoverageCells {
	/**
	 * The default value of the '{@link #getCoveragePerCell() <em>Coverage Per Cell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoveragePerCell()
	 * @generated
	 * @ordered
	 */
	protected static final int COVERAGE_PER_CELL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCoveragePerCell() <em>Coverage Per Cell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoveragePerCell()
	 * @generated
	 * @ordered
	 */
	protected int coveragePerCell = COVERAGE_PER_CELL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetCoverageProportion() <em>Target Coverage Proportion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCoverageProportion()
	 * @generated
	 * @ordered
	 */
	protected static final double TARGET_COVERAGE_PROPORTION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTargetCoverageProportion() <em>Target Coverage Proportion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCoverageProportion()
	 * @generated
	 * @ordered
	 */
	protected double targetCoverageProportion = TARGET_COVERAGE_PROPORTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDimensionRecords() <em>Dimension Records</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionRecords()
	 * @generated
	 * @ordered
	 */
	protected EList<DimensionInterval> dimensionRecords;

	/**
	 * The cached value of the '{@link #getCoverageBoostingStrategy() <em>Coverage Boosting Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverageBoostingStrategy()
	 * @generated
	 * @ordered
	 */
	protected CoverageBoostingStrategy coverageBoostingStrategy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NSGAWithCoverageCellsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestingPackagePackage.Literals.NSGA_WITH_COVERAGE_CELLS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCoveragePerCell() {
		return coveragePerCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoveragePerCell(int newCoveragePerCell) {
		int oldCoveragePerCell = coveragePerCell;
		coveragePerCell = newCoveragePerCell;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestingPackagePackage.NSGA_WITH_COVERAGE_CELLS__COVERAGE_PER_CELL, oldCoveragePerCell, coveragePerCell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTargetCoverageProportion() {
		return targetCoverageProportion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetCoverageProportion(double newTargetCoverageProportion) {
		double oldTargetCoverageProportion = targetCoverageProportion;
		targetCoverageProportion = newTargetCoverageProportion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestingPackagePackage.NSGA_WITH_COVERAGE_CELLS__TARGET_COVERAGE_PROPORTION, oldTargetCoverageProportion, targetCoverageProportion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DimensionInterval> getDimensionRecords() {
		if (dimensionRecords == null) {
			dimensionRecords = new EObjectContainmentEList<DimensionInterval>(DimensionInterval.class, this, TestingPackagePackage.NSGA_WITH_COVERAGE_CELLS__DIMENSION_RECORDS);
		}
		return dimensionRecords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageBoostingStrategy getCoverageBoostingStrategy() {
		return coverageBoostingStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoverageBoostingStrategy(CoverageBoostingStrategy newCoverageBoostingStrategy, NotificationChain msgs) {
		CoverageBoostingStrategy oldCoverageBoostingStrategy = coverageBoostingStrategy;
		coverageBoostingStrategy = newCoverageBoostingStrategy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TestingPackagePackage.NSGA_WITH_COVERAGE_CELLS__COVERAGE_BOOSTING_STRATEGY, oldCoverageBoostingStrategy, newCoverageBoostingStrategy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoverageBoostingStrategy(CoverageBoostingStrategy newCoverageBoostingStrategy) {
		if (newCoverageBoostingStrategy != coverageBoostingStrategy) {
			NotificationChain msgs = null;
			if (coverageBoostingStrategy != null)
				msgs = ((InternalEObject)coverageBoostingStrategy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TestingPackagePackage.NSGA_WITH_COVERAGE_CELLS__COVERAGE_BOOSTING_STRATEGY, null, msgs);
			if (newCoverageBoostingStrategy != null)
				msgs = ((InternalEObject)newCoverageBoostingStrategy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TestingPackagePackage.NSGA_WITH_COVERAGE_CELLS__COVERAGE_BOOSTING_STRATEGY, null, msgs);
			msgs = basicSetCoverageBoostingStrategy(newCoverageBoostingStrategy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestingPackagePackage.NSGA_WITH_COVERAGE_CELLS__COVERAGE_BOOSTING_STRATEGY, newCoverageBoostingStrategy, newCoverageBoostingStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestingPackagePackage.NSGA_WITH_COVERAGE_CELLS__DIMENSION_RECORDS:
				return ((InternalEList<?>)getDimensionRecords()).basicRemove(otherEnd, msgs);
			case TestingPackagePackage.NSGA_WITH_COVERAGE_CELLS__COVERAGE_BOOSTING_STRATEGY:
				return basicSetCoverageBoostingStrategy(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestingPackagePackage.NSGA_WITH_COVERAGE_CELLS__COVERAGE_PER_CELL:
				return getCoveragePerCell();
			case TestingPackagePackage.NSGA_WITH_COVERAGE_CELLS__TARGET_COVERAGE_PROPORTION:
				return getTargetCoverageProportion();
			case TestingPackagePackage.NSGA_WITH_COVERAGE_CELLS__DIMENSION_RECORDS:
				return getDimensionRecords();
			case TestingPackagePackage.NSGA_WITH_COVERAGE_CELLS__COVERAGE_BOOSTING_STRATEGY:
				return getCoverageBoostingStrategy();
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
			case TestingPackagePackage.NSGA_WITH_COVERAGE_CELLS__COVERAGE_PER_CELL:
				setCoveragePerCell((Integer)newValue);
				return;
			case TestingPackagePackage.NSGA_WITH_COVERAGE_CELLS__TARGET_COVERAGE_PROPORTION:
				setTargetCoverageProportion((Double)newValue);
				return;
			case TestingPackagePackage.NSGA_WITH_COVERAGE_CELLS__DIMENSION_RECORDS:
				getDimensionRecords().clear();
				getDimensionRecords().addAll((Collection<? extends DimensionInterval>)newValue);
				return;
			case TestingPackagePackage.NSGA_WITH_COVERAGE_CELLS__COVERAGE_BOOSTING_STRATEGY:
				setCoverageBoostingStrategy((CoverageBoostingStrategy)newValue);
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
			case TestingPackagePackage.NSGA_WITH_COVERAGE_CELLS__COVERAGE_PER_CELL:
				setCoveragePerCell(COVERAGE_PER_CELL_EDEFAULT);
				return;
			case TestingPackagePackage.NSGA_WITH_COVERAGE_CELLS__TARGET_COVERAGE_PROPORTION:
				setTargetCoverageProportion(TARGET_COVERAGE_PROPORTION_EDEFAULT);
				return;
			case TestingPackagePackage.NSGA_WITH_COVERAGE_CELLS__DIMENSION_RECORDS:
				getDimensionRecords().clear();
				return;
			case TestingPackagePackage.NSGA_WITH_COVERAGE_CELLS__COVERAGE_BOOSTING_STRATEGY:
				setCoverageBoostingStrategy((CoverageBoostingStrategy)null);
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
			case TestingPackagePackage.NSGA_WITH_COVERAGE_CELLS__COVERAGE_PER_CELL:
				return coveragePerCell != COVERAGE_PER_CELL_EDEFAULT;
			case TestingPackagePackage.NSGA_WITH_COVERAGE_CELLS__TARGET_COVERAGE_PROPORTION:
				return targetCoverageProportion != TARGET_COVERAGE_PROPORTION_EDEFAULT;
			case TestingPackagePackage.NSGA_WITH_COVERAGE_CELLS__DIMENSION_RECORDS:
				return dimensionRecords != null && !dimensionRecords.isEmpty();
			case TestingPackagePackage.NSGA_WITH_COVERAGE_CELLS__COVERAGE_BOOSTING_STRATEGY:
				return coverageBoostingStrategy != null;
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
		result.append(" (coveragePerCell: ");
		result.append(coveragePerCell);
		result.append(", targetCoverageProportion: ");
		result.append(targetCoverageProportion);
		result.append(')');
		return result.toString();
	}

} //NSGAWithCoverageCellsImpl
