/**
 */
package airport.impl;

import airport.AirportPackage;
import airport.Flight;
import airport.FlightType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flight</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link airport.impl.FlightImpl#getFlightNumber <em>Flight Number</em>}</li>
 *   <li>{@link airport.impl.FlightImpl#getTime <em>Time</em>}</li>
 *   <li>{@link airport.impl.FlightImpl#getType <em>Type</em>}</li>
 *   <li>{@link airport.impl.FlightImpl#getCity <em>City</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlightImpl extends MinimalEObjectImpl.Container implements Flight {
	/**
	 * The default value of the '{@link #getFlightNumber() <em>Flight Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlightNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String FLIGHT_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlightNumber() <em>Flight Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlightNumber()
	 * @generated
	 * @ordered
	 */
	protected String flightNumber = FLIGHT_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected String time = TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final FlightType TYPE_EDEFAULT = FlightType.ARRIVAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected FlightType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected String city = CITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AirportPackage.Literals.FLIGHT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFlightNumber() {
		return flightNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlightNumber(String newFlightNumber) {
		String oldFlightNumber = flightNumber;
		flightNumber = newFlightNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirportPackage.FLIGHT__FLIGHT_NUMBER, oldFlightNumber, flightNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTime(String newTime) {
		String oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirportPackage.FLIGHT__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(FlightType newType) {
		FlightType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirportPackage.FLIGHT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCity(String newCity) {
		String oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirportPackage.FLIGHT__CITY, oldCity, city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AirportPackage.FLIGHT__FLIGHT_NUMBER:
				return getFlightNumber();
			case AirportPackage.FLIGHT__TIME:
				return getTime();
			case AirportPackage.FLIGHT__TYPE:
				return getType();
			case AirportPackage.FLIGHT__CITY:
				return getCity();
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
			case AirportPackage.FLIGHT__FLIGHT_NUMBER:
				setFlightNumber((String)newValue);
				return;
			case AirportPackage.FLIGHT__TIME:
				setTime((String)newValue);
				return;
			case AirportPackage.FLIGHT__TYPE:
				setType((FlightType)newValue);
				return;
			case AirportPackage.FLIGHT__CITY:
				setCity((String)newValue);
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
			case AirportPackage.FLIGHT__FLIGHT_NUMBER:
				setFlightNumber(FLIGHT_NUMBER_EDEFAULT);
				return;
			case AirportPackage.FLIGHT__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case AirportPackage.FLIGHT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case AirportPackage.FLIGHT__CITY:
				setCity(CITY_EDEFAULT);
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
			case AirportPackage.FLIGHT__FLIGHT_NUMBER:
				return FLIGHT_NUMBER_EDEFAULT == null ? flightNumber != null : !FLIGHT_NUMBER_EDEFAULT.equals(flightNumber);
			case AirportPackage.FLIGHT__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case AirportPackage.FLIGHT__TYPE:
				return type != TYPE_EDEFAULT;
			case AirportPackage.FLIGHT__CITY:
				return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
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
		result.append(" (flightNumber: ");
		result.append(flightNumber);
		result.append(", time: ");
		result.append(time);
		result.append(", type: ");
		result.append(type);
		result.append(", city: ");
		result.append(city);
		result.append(')');
		return result.toString();
	}

} //FlightImpl
