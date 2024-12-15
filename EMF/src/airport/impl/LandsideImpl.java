/**
 */
package airport.impl;

import airport.AirportPackage;
import airport.Landside;

import airport.areas.Arrival;
import airport.areas.Departure;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Landside</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link airport.impl.LandsideImpl#getDepartureArea <em>Departure Area</em>}</li>
 *   <li>{@link airport.impl.LandsideImpl#getArrivalArea <em>Arrival Area</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LandsideImpl extends DivisionImpl implements Landside {
	/**
	 * The cached value of the '{@link #getDepartureArea() <em>Departure Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartureArea()
	 * @generated
	 * @ordered
	 */
	protected Departure departureArea;

	/**
	 * The cached value of the '{@link #getArrivalArea() <em>Arrival Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalArea()
	 * @generated
	 * @ordered
	 */
	protected Arrival arrivalArea;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LandsideImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AirportPackage.Literals.LANDSIDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Departure getDepartureArea() {
		return departureArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDepartureArea(Departure newDepartureArea, NotificationChain msgs) {
		Departure oldDepartureArea = departureArea;
		departureArea = newDepartureArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AirportPackage.LANDSIDE__DEPARTURE_AREA, oldDepartureArea, newDepartureArea);
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
	public void setDepartureArea(Departure newDepartureArea) {
		if (newDepartureArea != departureArea) {
			NotificationChain msgs = null;
			if (departureArea != null)
				msgs = ((InternalEObject)departureArea).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AirportPackage.LANDSIDE__DEPARTURE_AREA, null, msgs);
			if (newDepartureArea != null)
				msgs = ((InternalEObject)newDepartureArea).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AirportPackage.LANDSIDE__DEPARTURE_AREA, null, msgs);
			msgs = basicSetDepartureArea(newDepartureArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirportPackage.LANDSIDE__DEPARTURE_AREA, newDepartureArea, newDepartureArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Arrival getArrivalArea() {
		return arrivalArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArrivalArea(Arrival newArrivalArea, NotificationChain msgs) {
		Arrival oldArrivalArea = arrivalArea;
		arrivalArea = newArrivalArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AirportPackage.LANDSIDE__ARRIVAL_AREA, oldArrivalArea, newArrivalArea);
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
	public void setArrivalArea(Arrival newArrivalArea) {
		if (newArrivalArea != arrivalArea) {
			NotificationChain msgs = null;
			if (arrivalArea != null)
				msgs = ((InternalEObject)arrivalArea).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AirportPackage.LANDSIDE__ARRIVAL_AREA, null, msgs);
			if (newArrivalArea != null)
				msgs = ((InternalEObject)newArrivalArea).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AirportPackage.LANDSIDE__ARRIVAL_AREA, null, msgs);
			msgs = basicSetArrivalArea(newArrivalArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirportPackage.LANDSIDE__ARRIVAL_AREA, newArrivalArea, newArrivalArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AirportPackage.LANDSIDE__DEPARTURE_AREA:
				return basicSetDepartureArea(null, msgs);
			case AirportPackage.LANDSIDE__ARRIVAL_AREA:
				return basicSetArrivalArea(null, msgs);
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
			case AirportPackage.LANDSIDE__DEPARTURE_AREA:
				return getDepartureArea();
			case AirportPackage.LANDSIDE__ARRIVAL_AREA:
				return getArrivalArea();
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
			case AirportPackage.LANDSIDE__DEPARTURE_AREA:
				setDepartureArea((Departure)newValue);
				return;
			case AirportPackage.LANDSIDE__ARRIVAL_AREA:
				setArrivalArea((Arrival)newValue);
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
			case AirportPackage.LANDSIDE__DEPARTURE_AREA:
				setDepartureArea((Departure)null);
				return;
			case AirportPackage.LANDSIDE__ARRIVAL_AREA:
				setArrivalArea((Arrival)null);
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
			case AirportPackage.LANDSIDE__DEPARTURE_AREA:
				return departureArea != null;
			case AirportPackage.LANDSIDE__ARRIVAL_AREA:
				return arrivalArea != null;
		}
		return super.eIsSet(featureID);
	}

} //LandsideImpl
