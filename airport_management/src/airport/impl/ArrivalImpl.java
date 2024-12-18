/**
 */
package airport.impl;

import airport.AirportPackage;
import airport.Arrival;
import airport.BaggageClaim;
import airport.Customs;

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
 * An implementation of the model object '<em><b>Arrival</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link airport.impl.ArrivalImpl#getBaggageClaim <em>Baggage Claim</em>}</li>
 *   <li>{@link airport.impl.ArrivalImpl#getCustoms <em>Customs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrivalImpl extends AreaImpl implements Arrival {
	/**
	 * The cached value of the '{@link #getBaggageClaim() <em>Baggage Claim</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaggageClaim()
	 * @generated
	 * @ordered
	 */
	protected EList<BaggageClaim> baggageClaim;

	/**
	 * The cached value of the '{@link #getCustoms() <em>Customs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustoms()
	 * @generated
	 * @ordered
	 */
	protected Customs customs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrivalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AirportPackage.Literals.ARRIVAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BaggageClaim> getBaggageClaim() {
		if (baggageClaim == null) {
			baggageClaim = new EObjectContainmentEList<BaggageClaim>(BaggageClaim.class, this, AirportPackage.ARRIVAL__BAGGAGE_CLAIM);
		}
		return baggageClaim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Customs getCustoms() {
		return customs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustoms(Customs newCustoms, NotificationChain msgs) {
		Customs oldCustoms = customs;
		customs = newCustoms;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AirportPackage.ARRIVAL__CUSTOMS, oldCustoms, newCustoms);
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
	public void setCustoms(Customs newCustoms) {
		if (newCustoms != customs) {
			NotificationChain msgs = null;
			if (customs != null)
				msgs = ((InternalEObject)customs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AirportPackage.ARRIVAL__CUSTOMS, null, msgs);
			if (newCustoms != null)
				msgs = ((InternalEObject)newCustoms).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AirportPackage.ARRIVAL__CUSTOMS, null, msgs);
			msgs = basicSetCustoms(newCustoms, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirportPackage.ARRIVAL__CUSTOMS, newCustoms, newCustoms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AirportPackage.ARRIVAL__BAGGAGE_CLAIM:
				return ((InternalEList<?>)getBaggageClaim()).basicRemove(otherEnd, msgs);
			case AirportPackage.ARRIVAL__CUSTOMS:
				return basicSetCustoms(null, msgs);
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
			case AirportPackage.ARRIVAL__BAGGAGE_CLAIM:
				return getBaggageClaim();
			case AirportPackage.ARRIVAL__CUSTOMS:
				return getCustoms();
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
			case AirportPackage.ARRIVAL__BAGGAGE_CLAIM:
				getBaggageClaim().clear();
				getBaggageClaim().addAll((Collection<? extends BaggageClaim>)newValue);
				return;
			case AirportPackage.ARRIVAL__CUSTOMS:
				setCustoms((Customs)newValue);
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
			case AirportPackage.ARRIVAL__BAGGAGE_CLAIM:
				getBaggageClaim().clear();
				return;
			case AirportPackage.ARRIVAL__CUSTOMS:
				setCustoms((Customs)null);
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
			case AirportPackage.ARRIVAL__BAGGAGE_CLAIM:
				return baggageClaim != null && !baggageClaim.isEmpty();
			case AirportPackage.ARRIVAL__CUSTOMS:
				return customs != null;
		}
		return super.eIsSet(featureID);
	}

} //ArrivalImpl
