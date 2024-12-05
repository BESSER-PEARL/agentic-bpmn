/**
 */
package BPMNagentic.impl;

import BPMNagentic.Agentic;
import BPMNagentic.AgenticTask;
import BPMNagentic.BPMNagenticPackage;
import BPMNagentic.ReflectionMode;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agentic Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link BPMNagentic.impl.AgenticTaskImpl#getAgentic <em>Agentic</em>}</li>
 *   <li>{@link BPMNagentic.impl.AgenticTaskImpl#getReflectionMode <em>Reflection Mode</em>}</li>
 *   <li>{@link BPMNagentic.impl.AgenticTaskImpl#getUncertainty <em>Uncertainty</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgenticTaskImpl extends FlowObjectImpl implements AgenticTask {
	/**
	 * The cached value of the '{@link #getAgentic() <em>Agentic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgentic()
	 * @generated
	 * @ordered
	 */
	protected Agentic agentic;

	/**
	 * The cached value of the '{@link #getReflectionMode() <em>Reflection Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReflectionMode()
	 * @generated
	 * @ordered
	 */
	protected ReflectionMode reflectionMode;

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
	protected AgenticTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMNagenticPackage.Literals.AGENTIC_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Agentic getAgentic() {
		return agentic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAgentic(Agentic newAgentic, NotificationChain msgs) {
		Agentic oldAgentic = agentic;
		agentic = newAgentic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMNagenticPackage.AGENTIC_TASK__AGENTIC, oldAgentic, newAgentic);
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
	public void setAgentic(Agentic newAgentic) {
		if (newAgentic != agentic) {
			NotificationChain msgs = null;
			if (agentic != null)
				msgs = ((InternalEObject)agentic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMNagenticPackage.AGENTIC_TASK__AGENTIC, null, msgs);
			if (newAgentic != null)
				msgs = ((InternalEObject)newAgentic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMNagenticPackage.AGENTIC_TASK__AGENTIC, null, msgs);
			msgs = basicSetAgentic(newAgentic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNagenticPackage.AGENTIC_TASK__AGENTIC, newAgentic, newAgentic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReflectionMode getReflectionMode() {
		return reflectionMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReflectionMode(ReflectionMode newReflectionMode, NotificationChain msgs) {
		ReflectionMode oldReflectionMode = reflectionMode;
		reflectionMode = newReflectionMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMNagenticPackage.AGENTIC_TASK__REFLECTION_MODE, oldReflectionMode, newReflectionMode);
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
	public void setReflectionMode(ReflectionMode newReflectionMode) {
		if (newReflectionMode != reflectionMode) {
			NotificationChain msgs = null;
			if (reflectionMode != null)
				msgs = ((InternalEObject)reflectionMode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMNagenticPackage.AGENTIC_TASK__REFLECTION_MODE, null, msgs);
			if (newReflectionMode != null)
				msgs = ((InternalEObject)newReflectionMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMNagenticPackage.AGENTIC_TASK__REFLECTION_MODE, null, msgs);
			msgs = basicSetReflectionMode(newReflectionMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNagenticPackage.AGENTIC_TASK__REFLECTION_MODE, newReflectionMode, newReflectionMode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNagenticPackage.AGENTIC_TASK__UNCERTAINTY, oldUncertainty, uncertainty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMNagenticPackage.AGENTIC_TASK__AGENTIC:
				return basicSetAgentic(null, msgs);
			case BPMNagenticPackage.AGENTIC_TASK__REFLECTION_MODE:
				return basicSetReflectionMode(null, msgs);
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
			case BPMNagenticPackage.AGENTIC_TASK__AGENTIC:
				return getAgentic();
			case BPMNagenticPackage.AGENTIC_TASK__REFLECTION_MODE:
				return getReflectionMode();
			case BPMNagenticPackage.AGENTIC_TASK__UNCERTAINTY:
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
			case BPMNagenticPackage.AGENTIC_TASK__AGENTIC:
				setAgentic((Agentic)newValue);
				return;
			case BPMNagenticPackage.AGENTIC_TASK__REFLECTION_MODE:
				setReflectionMode((ReflectionMode)newValue);
				return;
			case BPMNagenticPackage.AGENTIC_TASK__UNCERTAINTY:
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
			case BPMNagenticPackage.AGENTIC_TASK__AGENTIC:
				setAgentic((Agentic)null);
				return;
			case BPMNagenticPackage.AGENTIC_TASK__REFLECTION_MODE:
				setReflectionMode((ReflectionMode)null);
				return;
			case BPMNagenticPackage.AGENTIC_TASK__UNCERTAINTY:
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
			case BPMNagenticPackage.AGENTIC_TASK__AGENTIC:
				return agentic != null;
			case BPMNagenticPackage.AGENTIC_TASK__REFLECTION_MODE:
				return reflectionMode != null;
			case BPMNagenticPackage.AGENTIC_TASK__UNCERTAINTY:
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

} //AgenticTaskImpl
