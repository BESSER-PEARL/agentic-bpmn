/**
 */
package BPMNagentic;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Process Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link BPMNagentic.BusinessProcessDiagram#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see BPMNagentic.BPMNagenticPackage#getBusinessProcessDiagram()
 * @model annotation="aconite.diagram name='BPD'"
 * @generated
 */
public interface BusinessProcessDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link BPMNagentic.BPMNElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see BPMNagentic.BPMNagenticPackage#getBusinessProcessDiagram_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<BPMNElement> getElements();

} // BusinessProcessDiagram
