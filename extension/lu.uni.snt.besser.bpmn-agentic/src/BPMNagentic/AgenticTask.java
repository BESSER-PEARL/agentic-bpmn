/**
 */
package BPMNagentic;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agentic Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link BPMNagentic.AgenticTask#getAgentic <em>Agentic</em>}</li>
 *   <li>{@link BPMNagentic.AgenticTask#getReflectionMode <em>Reflection Mode</em>}</li>
 *   <li>{@link BPMNagentic.AgenticTask#getUncertainty <em>Uncertainty</em>}</li>
 * </ul>
 *
 * @see BPMNagentic.BPMNagenticPackage#getAgenticTask()
 * @model annotation="aconite.container name='AgenticTask' container='AgenticLane'"
 * @generated
 */
public interface AgenticTask extends FlowObject {
	/**
	 * Returns the value of the '<em><b>Agentic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agentic</em>' containment reference.
	 * @see #setAgentic(Agentic)
	 * @see BPMNagentic.BPMNagenticPackage#getAgenticTask_Agentic()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Agentic getAgentic();

	/**
	 * Sets the value of the '{@link BPMNagentic.AgenticTask#getAgentic <em>Agentic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agentic</em>' containment reference.
	 * @see #getAgentic()
	 * @generated
	 */
	void setAgentic(Agentic value);

	/**
	 * Returns the value of the '<em><b>Reflection Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reflection Mode</em>' containment reference.
	 * @see #setReflectionMode(ReflectionMode)
	 * @see BPMNagentic.BPMNagenticPackage#getAgenticTask_ReflectionMode()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ReflectionMode getReflectionMode();

	/**
	 * Sets the value of the '{@link BPMNagentic.AgenticTask#getReflectionMode <em>Reflection Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reflection Mode</em>' containment reference.
	 * @see #getReflectionMode()
	 * @generated
	 */
	void setReflectionMode(ReflectionMode value);

	/**
	 * Returns the value of the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uncertainty</em>' attribute.
	 * @see #setUncertainty(double)
	 * @see BPMNagentic.BPMNagenticPackage#getAgenticTask_Uncertainty()
	 * @model
	 * @generated
	 */
	double getUncertainty();

	/**
	 * Sets the value of the '{@link BPMNagentic.AgenticTask#getUncertainty <em>Uncertainty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uncertainty</em>' attribute.
	 * @see #getUncertainty()
	 * @generated
	 */
	void setUncertainty(double value);

} // AgenticTask
