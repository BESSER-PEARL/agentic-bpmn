/**
 */
package BPMNagentic;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link BPMNagentic.Lane#getFlowObjects <em>Flow Objects</em>}</li>
 * </ul>
 *
 * @see BPMNagentic.BPMNagenticPackage#getLane()
 * @model annotation="aconite.container name='Lane' container='BPD, Group, Pool'"
 * @generated
 */
public interface Lane extends Swimlane {
	/**
	 * Returns the value of the '<em><b>Flow Objects</b></em>' containment reference list.
	 * The list contents are of type {@link BPMNagentic.FlowObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Objects</em>' containment reference list.
	 * @see BPMNagentic.BPMNagenticPackage#getLane_FlowObjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<FlowObject> getFlowObjects();

} // Lane
