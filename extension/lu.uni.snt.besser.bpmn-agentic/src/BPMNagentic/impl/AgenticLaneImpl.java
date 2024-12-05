/**
 */
package BPMNagentic.impl;

import BPMNagentic.AgentRole;
import BPMNagentic.AgenticLane;
import BPMNagentic.BPMNagenticPackage;
import BPMNagentic.FlowObject;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agentic Lane</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link BPMNagentic.impl.AgenticLaneImpl#getFlowObjects <em>Flow Objects</em>}</li>
 *   <li>{@link BPMNagentic.impl.AgenticLaneImpl#getAgentRole <em>Agent Role</em>}</li>
 *   <li>{@link BPMNagentic.impl.AgenticLaneImpl#getUncertainty <em>Uncertainty</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgenticLaneImpl extends SwimlaneImpl implements AgenticLane {
	/**
	 * The cached value of the '{@link #getFlowObjects() <em>Flow Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<FlowObject> flowObjects;

	/**
	 * The cached value of the '{@link #getAgentRole() <em>Agent Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgentRole()
	 * @generated
	 * @ordered
	 */
	protected AgentRole agentRole;

	/**
	 * The default value of the '{@link #getUncertainty() <em>Uncertainty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUncertainty()
	 * @generated
	 * @ordered
	 */
	protected static final double UNCERTAINTY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getUncertainty() <em>Uncertainty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUncertainty()
	 * @generated
	 * @ordered
	 */
	protected double uncertainty = UNCERTAINTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgenticLaneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMNagenticPackage.Literals.AGENTIC_LANE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FlowObject> getFlowObjects() {
		if (flowObjects == null) {
			flowObjects = new EObjectContainmentEList<FlowObject>(FlowObject.class, this, BPMNagenticPackage.AGENTIC_LANE__FLOW_OBJECTS);
		}
		return flowObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgentRole getAgentRole() {
		return agentRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAgentRole(AgentRole newAgentRole, NotificationChain msgs) {
		AgentRole oldAgentRole = agentRole;
		agentRole = newAgentRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMNagenticPackage.AGENTIC_LANE__AGENT_ROLE, oldAgentRole, newAgentRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAgentRole(AgentRole newAgentRole) {
		if (newAgentRole != agentRole) {
			NotificationChain msgs = null;
			if (agentRole != null)
				msgs = ((InternalEObject)agentRole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMNagenticPackage.AGENTIC_LANE__AGENT_ROLE, null, msgs);
			if (newAgentRole != null)
				msgs = ((InternalEObject)newAgentRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMNagenticPackage.AGENTIC_LANE__AGENT_ROLE, null, msgs);
			msgs = basicSetAgentRole(newAgentRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNagenticPackage.AGENTIC_LANE__AGENT_ROLE, newAgentRole, newAgentRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getUncertainty() {
		return uncertainty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUncertainty(double newUncertainty) {
		double oldUncertainty = uncertainty;
		uncertainty = newUncertainty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNagenticPackage.AGENTIC_LANE__UNCERTAINTY, oldUncertainty, uncertainty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMNagenticPackage.AGENTIC_LANE__FLOW_OBJECTS:
				return ((InternalEList<?>)getFlowObjects()).basicRemove(otherEnd, msgs);
			case BPMNagenticPackage.AGENTIC_LANE__AGENT_ROLE:
				return basicSetAgentRole(null, msgs);
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
			case BPMNagenticPackage.AGENTIC_LANE__FLOW_OBJECTS:
				return getFlowObjects();
			case BPMNagenticPackage.AGENTIC_LANE__AGENT_ROLE:
				return getAgentRole();
			case BPMNagenticPackage.AGENTIC_LANE__UNCERTAINTY:
				return getUncertainty();
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
			case BPMNagenticPackage.AGENTIC_LANE__FLOW_OBJECTS:
				getFlowObjects().clear();
				getFlowObjects().addAll((Collection<? extends FlowObject>)newValue);
				return;
			case BPMNagenticPackage.AGENTIC_LANE__AGENT_ROLE:
				setAgentRole((AgentRole)newValue);
				return;
			case BPMNagenticPackage.AGENTIC_LANE__UNCERTAINTY:
				setUncertainty((Double)newValue);
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
			case BPMNagenticPackage.AGENTIC_LANE__FLOW_OBJECTS:
				getFlowObjects().clear();
				return;
			case BPMNagenticPackage.AGENTIC_LANE__AGENT_ROLE:
				setAgentRole((AgentRole)null);
				return;
			case BPMNagenticPackage.AGENTIC_LANE__UNCERTAINTY:
				setUncertainty(UNCERTAINTY_EDEFAULT);
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
			case BPMNagenticPackage.AGENTIC_LANE__FLOW_OBJECTS:
				return flowObjects != null && !flowObjects.isEmpty();
			case BPMNagenticPackage.AGENTIC_LANE__AGENT_ROLE:
				return agentRole != null;
			case BPMNagenticPackage.AGENTIC_LANE__UNCERTAINTY:
				return uncertainty != UNCERTAINTY_EDEFAULT;
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
		result.append(" (uncertainty: ");
		result.append(uncertainty);
		result.append(')');
		return result.toString();
	}

} //AgenticLaneImpl
