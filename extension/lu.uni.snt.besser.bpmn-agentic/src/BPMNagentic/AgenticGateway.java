/**
 */
package BPMNagentic;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agentic Gateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link BPMNagentic.AgenticGateway#getUncertainty <em>Uncertainty</em>}</li>
 * </ul>
 *
 * @see BPMNagentic.BPMNagenticPackage#getAgenticGateway()
 * @model annotation="aconite.node extend='Flow' name='AgenticGateway' abstract='true' container='AgenticLane'"
 * @generated
 */
public interface AgenticGateway extends Gateway {
	/**
	 * Returns the value of the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uncertainty</em>' attribute.
	 * @see #setUncertainty(double)
	 * @see BPMNagentic.BPMNagenticPackage#getAgenticGateway_Uncertainty()
	 * @model
	 * @generated
	 */
	double getUncertainty();

	/**
	 * Sets the value of the '{@link BPMNagentic.AgenticGateway#getUncertainty <em>Uncertainty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uncertainty</em>' attribute.
	 * @see #getUncertainty()
	 * @generated
	 */
	void setUncertainty(double value);

} // AgenticGateway
