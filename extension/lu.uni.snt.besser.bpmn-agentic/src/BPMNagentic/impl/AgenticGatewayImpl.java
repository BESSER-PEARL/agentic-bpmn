/**
 */
package BPMNagentic.impl;

import BPMNagentic.AgenticGateway;
import BPMNagentic.BPMNagenticPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agentic Gateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link BPMNagentic.impl.AgenticGatewayImpl#getUncertainty <em>Uncertainty</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgenticGatewayImpl extends GatewayImpl implements AgenticGateway {
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
	protected AgenticGatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMNagenticPackage.Literals.AGENTIC_GATEWAY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNagenticPackage.AGENTIC_GATEWAY__UNCERTAINTY, oldUncertainty, uncertainty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BPMNagenticPackage.AGENTIC_GATEWAY__UNCERTAINTY:
				return getUncertainty();
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
			case BPMNagenticPackage.AGENTIC_GATEWAY__UNCERTAINTY:
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
			case BPMNagenticPackage.AGENTIC_GATEWAY__UNCERTAINTY:
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
			case BPMNagenticPackage.AGENTIC_GATEWAY__UNCERTAINTY:
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

} //AgenticGatewayImpl
