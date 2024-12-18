/**
 */
package airport.impl;

import airport.AirportPackage;
import airport.Airside;
import airport.DropOff;
import airport.Flight;
import airport.Floor;
import airport.Landside;
import airport.ParkingArea;
import airport.Terminal;
import airport.TransportationServices;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link airport.impl.TerminalImpl#getDropoff <em>Dropoff</em>}</li>
 *   <li>{@link airport.impl.TerminalImpl#getFloors <em>Floors</em>}</li>
 *   <li>{@link airport.impl.TerminalImpl#getAirside <em>Airside</em>}</li>
 *   <li>{@link airport.impl.TerminalImpl#getLandside <em>Landside</em>}</li>
 *   <li>{@link airport.impl.TerminalImpl#getFlights <em>Flights</em>}</li>
 *   <li>{@link airport.impl.TerminalImpl#getParkingAreas <em>Parking Areas</em>}</li>
 *   <li>{@link airport.impl.TerminalImpl#getTransportationServices <em>Transportation Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TerminalImpl extends MinimalEObjectImpl.Container implements Terminal {
	/**
	 * The cached value of the '{@link #getDropoff() <em>Dropoff</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDropoff()
	 * @generated
	 * @ordered
	 */
	protected EList<DropOff> dropoff;

	/**
	 * The cached value of the '{@link #getFloors() <em>Floors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloors()
	 * @generated
	 * @ordered
	 */
	protected EList<Floor> floors;

	/**
	 * The cached value of the '{@link #getAirside() <em>Airside</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirside()
	 * @generated
	 * @ordered
	 */
	protected EList<Airside> airside;

	/**
	 * The cached value of the '{@link #getLandside() <em>Landside</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandside()
	 * @generated
	 * @ordered
	 */
	protected EList<Landside> landside;

	/**
	 * The cached value of the '{@link #getFlights() <em>Flights</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlights()
	 * @generated
	 * @ordered
	 */
	protected EList<Flight> flights;

	/**
	 * The cached value of the '{@link #getParkingAreas() <em>Parking Areas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParkingAreas()
	 * @generated
	 * @ordered
	 */
	protected EList<ParkingArea> parkingAreas;

	/**
	 * The cached value of the '{@link #getTransportationServices() <em>Transportation Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportationServices()
	 * @generated
	 * @ordered
	 */
	protected EList<TransportationServices> transportationServices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AirportPackage.Literals.TERMINAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DropOff> getDropoff() {
		if (dropoff == null) {
			dropoff = new EObjectContainmentEList<DropOff>(DropOff.class, this, AirportPackage.TERMINAL__DROPOFF);
		}
		return dropoff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Floor> getFloors() {
		if (floors == null) {
			floors = new EObjectContainmentEList<Floor>(Floor.class, this, AirportPackage.TERMINAL__FLOORS);
		}
		return floors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Airside> getAirside() {
		if (airside == null) {
			airside = new EObjectContainmentEList<Airside>(Airside.class, this, AirportPackage.TERMINAL__AIRSIDE);
		}
		return airside;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Landside> getLandside() {
		if (landside == null) {
			landside = new EObjectContainmentEList<Landside>(Landside.class, this, AirportPackage.TERMINAL__LANDSIDE);
		}
		return landside;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Flight> getFlights() {
		if (flights == null) {
			flights = new EObjectContainmentEList<Flight>(Flight.class, this, AirportPackage.TERMINAL__FLIGHTS);
		}
		return flights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParkingArea> getParkingAreas() {
		if (parkingAreas == null) {
			parkingAreas = new EObjectContainmentEList<ParkingArea>(ParkingArea.class, this, AirportPackage.TERMINAL__PARKING_AREAS);
		}
		return parkingAreas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TransportationServices> getTransportationServices() {
		if (transportationServices == null) {
			transportationServices = new EObjectContainmentEList<TransportationServices>(TransportationServices.class, this, AirportPackage.TERMINAL__TRANSPORTATION_SERVICES);
		}
		return transportationServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AirportPackage.TERMINAL__DROPOFF:
				return ((InternalEList<?>)getDropoff()).basicRemove(otherEnd, msgs);
			case AirportPackage.TERMINAL__FLOORS:
				return ((InternalEList<?>)getFloors()).basicRemove(otherEnd, msgs);
			case AirportPackage.TERMINAL__AIRSIDE:
				return ((InternalEList<?>)getAirside()).basicRemove(otherEnd, msgs);
			case AirportPackage.TERMINAL__LANDSIDE:
				return ((InternalEList<?>)getLandside()).basicRemove(otherEnd, msgs);
			case AirportPackage.TERMINAL__FLIGHTS:
				return ((InternalEList<?>)getFlights()).basicRemove(otherEnd, msgs);
			case AirportPackage.TERMINAL__PARKING_AREAS:
				return ((InternalEList<?>)getParkingAreas()).basicRemove(otherEnd, msgs);
			case AirportPackage.TERMINAL__TRANSPORTATION_SERVICES:
				return ((InternalEList<?>)getTransportationServices()).basicRemove(otherEnd, msgs);
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
			case AirportPackage.TERMINAL__DROPOFF:
				return getDropoff();
			case AirportPackage.TERMINAL__FLOORS:
				return getFloors();
			case AirportPackage.TERMINAL__AIRSIDE:
				return getAirside();
			case AirportPackage.TERMINAL__LANDSIDE:
				return getLandside();
			case AirportPackage.TERMINAL__FLIGHTS:
				return getFlights();
			case AirportPackage.TERMINAL__PARKING_AREAS:
				return getParkingAreas();
			case AirportPackage.TERMINAL__TRANSPORTATION_SERVICES:
				return getTransportationServices();
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
			case AirportPackage.TERMINAL__DROPOFF:
				getDropoff().clear();
				getDropoff().addAll((Collection<? extends DropOff>)newValue);
				return;
			case AirportPackage.TERMINAL__FLOORS:
				getFloors().clear();
				getFloors().addAll((Collection<? extends Floor>)newValue);
				return;
			case AirportPackage.TERMINAL__AIRSIDE:
				getAirside().clear();
				getAirside().addAll((Collection<? extends Airside>)newValue);
				return;
			case AirportPackage.TERMINAL__LANDSIDE:
				getLandside().clear();
				getLandside().addAll((Collection<? extends Landside>)newValue);
				return;
			case AirportPackage.TERMINAL__FLIGHTS:
				getFlights().clear();
				getFlights().addAll((Collection<? extends Flight>)newValue);
				return;
			case AirportPackage.TERMINAL__PARKING_AREAS:
				getParkingAreas().clear();
				getParkingAreas().addAll((Collection<? extends ParkingArea>)newValue);
				return;
			case AirportPackage.TERMINAL__TRANSPORTATION_SERVICES:
				getTransportationServices().clear();
				getTransportationServices().addAll((Collection<? extends TransportationServices>)newValue);
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
			case AirportPackage.TERMINAL__DROPOFF:
				getDropoff().clear();
				return;
			case AirportPackage.TERMINAL__FLOORS:
				getFloors().clear();
				return;
			case AirportPackage.TERMINAL__AIRSIDE:
				getAirside().clear();
				return;
			case AirportPackage.TERMINAL__LANDSIDE:
				getLandside().clear();
				return;
			case AirportPackage.TERMINAL__FLIGHTS:
				getFlights().clear();
				return;
			case AirportPackage.TERMINAL__PARKING_AREAS:
				getParkingAreas().clear();
				return;
			case AirportPackage.TERMINAL__TRANSPORTATION_SERVICES:
				getTransportationServices().clear();
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
			case AirportPackage.TERMINAL__DROPOFF:
				return dropoff != null && !dropoff.isEmpty();
			case AirportPackage.TERMINAL__FLOORS:
				return floors != null && !floors.isEmpty();
			case AirportPackage.TERMINAL__AIRSIDE:
				return airside != null && !airside.isEmpty();
			case AirportPackage.TERMINAL__LANDSIDE:
				return landside != null && !landside.isEmpty();
			case AirportPackage.TERMINAL__FLIGHTS:
				return flights != null && !flights.isEmpty();
			case AirportPackage.TERMINAL__PARKING_AREAS:
				return parkingAreas != null && !parkingAreas.isEmpty();
			case AirportPackage.TERMINAL__TRANSPORTATION_SERVICES:
				return transportationServices != null && !transportationServices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TerminalImpl
