/**
 */
package BPMNagentic;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link BPMNagentic.Pool#getLanes <em>Lanes</em>}</li>
 *   <li>{@link BPMNagentic.Pool#getAgenticLanes <em>Agentic Lanes</em>}</li>
 * </ul>
 *
 * @see BPMNagentic.BPMNagenticPackage#getPool()
 * @model annotation="aconite.container name='Pool' container='BPD, Group'"
 * @generated
 */
public interface Pool extends Swimlane {
	/**
	 * Returns the value of the '<em><b>Lanes</b></em>' containment reference list.
	 * The list contents are of type {@link BPMNagentic.Lane}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lanes</em>' containment reference list.
	 * @see BPMNagentic.BPMNagenticPackage#getPool_Lanes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Lane> getLanes();

	/**
	 * Returns the value of the '<em><b>Agentic Lanes</b></em>' containment reference list.
	 * The list contents are of type {@link BPMNagentic.AgenticLane}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agentic Lanes</em>' containment reference list.
	 * @see BPMNagentic.BPMNagenticPackage#getPool_AgenticLanes()
	 * @model containment="true"
	 * @generated
	 */
	EList<AgenticLane> getAgenticLanes();

} // Pool
