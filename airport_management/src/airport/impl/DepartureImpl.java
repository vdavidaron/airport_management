/**
 */
package airport.impl;

import airport.AirportPackage;
import airport.BaggageDropOff;
import airport.CheckIn;
import airport.Departure;
import airport.SecurityCheck;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Departure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link airport.impl.DepartureImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link airport.impl.DepartureImpl#getCheckIn <em>Check In</em>}</li>
 *   <li>{@link airport.impl.DepartureImpl#getBaggageDropOff <em>Baggage Drop Off</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DepartureImpl extends AreaImpl implements Departure {
	/**
	 * The cached value of the '{@link #getSecurity() <em>Security</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityCheck> security;

	/**
	 * The cached value of the '{@link #getCheckIn() <em>Check In</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckIn()
	 * @generated
	 * @ordered
	 */
	protected EList<CheckIn> checkIn;

	/**
	 * The cached value of the '{@link #getBaggageDropOff() <em>Baggage Drop Off</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaggageDropOff()
	 * @generated
	 * @ordered
	 */
	protected EList<BaggageDropOff> baggageDropOff;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepartureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AirportPackage.Literals.DEPARTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SecurityCheck> getSecurity() {
		if (security == null) {
			security = new EObjectContainmentEList<SecurityCheck>(SecurityCheck.class, this, AirportPackage.DEPARTURE__SECURITY);
		}
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CheckIn> getCheckIn() {
		if (checkIn == null) {
			checkIn = new EObjectContainmentEList<CheckIn>(CheckIn.class, this, AirportPackage.DEPARTURE__CHECK_IN);
		}
		return checkIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BaggageDropOff> getBaggageDropOff() {
		if (baggageDropOff == null) {
			baggageDropOff = new EObjectContainmentEList<BaggageDropOff>(BaggageDropOff.class, this, AirportPackage.DEPARTURE__BAGGAGE_DROP_OFF);
		}
		return baggageDropOff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AirportPackage.DEPARTURE__SECURITY:
				return ((InternalEList<?>)getSecurity()).basicRemove(otherEnd, msgs);
			case AirportPackage.DEPARTURE__CHECK_IN:
				return ((InternalEList<?>)getCheckIn()).basicRemove(otherEnd, msgs);
			case AirportPackage.DEPARTURE__BAGGAGE_DROP_OFF:
				return ((InternalEList<?>)getBaggageDropOff()).basicRemove(otherEnd, msgs);
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
			case AirportPackage.DEPARTURE__SECURITY:
				return getSecurity();
			case AirportPackage.DEPARTURE__CHECK_IN:
				return getCheckIn();
			case AirportPackage.DEPARTURE__BAGGAGE_DROP_OFF:
				return getBaggageDropOff();
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
			case AirportPackage.DEPARTURE__SECURITY:
				getSecurity().clear();
				getSecurity().addAll((Collection<? extends SecurityCheck>)newValue);
				return;
			case AirportPackage.DEPARTURE__CHECK_IN:
				getCheckIn().clear();
				getCheckIn().addAll((Collection<? extends CheckIn>)newValue);
				return;
			case AirportPackage.DEPARTURE__BAGGAGE_DROP_OFF:
				getBaggageDropOff().clear();
				getBaggageDropOff().addAll((Collection<? extends BaggageDropOff>)newValue);
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
			case AirportPackage.DEPARTURE__SECURITY:
				getSecurity().clear();
				return;
			case AirportPackage.DEPARTURE__CHECK_IN:
				getCheckIn().clear();
				return;
			case AirportPackage.DEPARTURE__BAGGAGE_DROP_OFF:
				getBaggageDropOff().clear();
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
			case AirportPackage.DEPARTURE__SECURITY:
				return security != null && !security.isEmpty();
			case AirportPackage.DEPARTURE__CHECK_IN:
				return checkIn != null && !checkIn.isEmpty();
			case AirportPackage.DEPARTURE__BAGGAGE_DROP_OFF:
				return baggageDropOff != null && !baggageDropOff.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DepartureImpl
