/**
 */
package BPMNagentic.impl;

import BPMNagentic.AgenticLane;
import BPMNagentic.BPMNagenticPackage;
import BPMNagentic.Lane;
import BPMNagentic.Pool;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link BPMNagentic.impl.PoolImpl#getLanes <em>Lanes</em>}</li>
 *   <li>{@link BPMNagentic.impl.PoolImpl#getAgenticLanes <em>Agentic Lanes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PoolImpl extends SwimlaneImpl implements Pool {
	/**
	 * The cached value of the '{@link #getLanes() <em>Lanes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanes()
	 * @generated
	 * @ordered
	 */
	protected EList<Lane> lanes;

	/**
	 * The cached value of the '{@link #getAgenticLanes() <em>Agentic Lanes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgenticLanes()
	 * @generated
	 * @ordered
	 */
	protected EList<AgenticLane> agenticLanes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PoolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMNagenticPackage.Literals.POOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Lane> getLanes() {
		if (lanes == null) {
			lanes = new EObjectContainmentEList<Lane>(Lane.class, this, BPMNagenticPackage.POOL__LANES);
		}
		return lanes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AgenticLane> getAgenticLanes() {
		if (agenticLanes == null) {
			agenticLanes = new EObjectContainmentEList<AgenticLane>(AgenticLane.class, this, BPMNagenticPackage.POOL__AGENTIC_LANES);
		}
		return agenticLanes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMNagenticPackage.POOL__LANES:
				return ((InternalEList<?>)getLanes()).basicRemove(otherEnd, msgs);
			case BPMNagenticPackage.POOL__AGENTIC_LANES:
				return ((InternalEList<?>)getAgenticLanes()).basicRemove(otherEnd, msgs);
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
			case BPMNagenticPackage.POOL__LANES:
				return getLanes();
			case BPMNagenticPackage.POOL__AGENTIC_LANES:
				return getAgenticLanes();
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
			case BPMNagenticPackage.POOL__LANES:
				getLanes().clear();
				getLanes().addAll((Collection<? extends Lane>)newValue);
				return;
			case BPMNagenticPackage.POOL__AGENTIC_LANES:
				getAgenticLanes().clear();
				getAgenticLanes().addAll((Collection<? extends AgenticLane>)newValue);
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
			case BPMNagenticPackage.POOL__LANES:
				getLanes().clear();
				return;
			case BPMNagenticPackage.POOL__AGENTIC_LANES:
				getAgenticLanes().clear();
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
			case BPMNagenticPackage.POOL__LANES:
				return lanes != null && !lanes.isEmpty();
			case BPMNagenticPackage.POOL__AGENTIC_LANES:
				return agenticLanes != null && !agenticLanes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PoolImpl
