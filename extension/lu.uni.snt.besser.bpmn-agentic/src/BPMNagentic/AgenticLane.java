/**
 */
package BPMNagentic;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agentic Lane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link BPMNagentic.AgenticLane#getFlowObjects <em>Flow Objects</em>}</li>
 *   <li>{@link BPMNagentic.AgenticLane#getAgentRole <em>Agent Role</em>}</li>
 *   <li>{@link BPMNagentic.AgenticLane#getUncertainty <em>Uncertainty</em>}</li>
 * </ul>
 *
 * @see BPMNagentic.BPMNagenticPackage#getAgenticLane()
 * @model annotation="aconite.container name='AgenticLane' container='BPD, Group, Pool'"
 * @generated
 */
public interface AgenticLane extends Swimlane {
	/**
	 * Returns the value of the '<em><b>Flow Objects</b></em>' containment reference list.
	 * The list contents are of type {@link BPMNagentic.FlowObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Objects</em>' containment reference list.
	 * @see BPMNagentic.BPMNagenticPackage#getAgenticLane_FlowObjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<FlowObject> getFlowObjects();

	/**
	 * Returns the value of the '<em><b>Agent Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent Role</em>' containment reference.
	 * @see #setAgentRole(AgentRole)
	 * @see BPMNagentic.BPMNagenticPackage#getAgenticLane_AgentRole()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AgentRole getAgentRole();

	/**
	 * Sets the value of the '{@link BPMNagentic.AgenticLane#getAgentRole <em>Agent Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent Role</em>' containment reference.
	 * @see #getAgentRole()
	 * @generated
	 */
	void setAgentRole(AgentRole value);

	/**
	 * Returns the value of the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uncertainty</em>' attribute.
	 * @see #setUncertainty(double)
	 * @see BPMNagentic.BPMNagenticPackage#getAgenticLane_Uncertainty()
	 * @model
	 * @generated
	 */
	double getUncertainty();

	/**
	 * Sets the value of the '{@link BPMNagentic.AgenticLane#getUncertainty <em>Uncertainty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uncertainty</em>' attribute.
	 * @see #getUncertainty()
	 * @generated
	 */
	void setUncertainty(double value);

} // AgenticLane
