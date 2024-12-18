/**
 */
package airport;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link airport.Terminal#getDropoff <em>Dropoff</em>}</li>
 *   <li>{@link airport.Terminal#getFloors <em>Floors</em>}</li>
 *   <li>{@link airport.Terminal#getAirside <em>Airside</em>}</li>
 *   <li>{@link airport.Terminal#getLandside <em>Landside</em>}</li>
 *   <li>{@link airport.Terminal#getFlights <em>Flights</em>}</li>
 *   <li>{@link airport.Terminal#getParkingAreas <em>Parking Areas</em>}</li>
 *   <li>{@link airport.Terminal#getTransportationServices <em>Transportation Services</em>}</li>
 * </ul>
 *
 * @see airport.AirportPackage#getTerminal()
 * @model
 * @generated
 */
public interface Terminal extends EObject {
	/**
	 * Returns the value of the '<em><b>Dropoff</b></em>' containment reference list.
	 * The list contents are of type {@link airport.DropOff}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dropoff</em>' containment reference list.
	 * @see airport.AirportPackage#getTerminal_Dropoff()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DropOff> getDropoff();

	/**
	 * Returns the value of the '<em><b>Floors</b></em>' containment reference list.
	 * The list contents are of type {@link airport.Floor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floors</em>' containment reference list.
	 * @see airport.AirportPackage#getTerminal_Floors()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Floor> getFloors();

	/**
	 * Returns the value of the '<em><b>Airside</b></em>' containment reference list.
	 * The list contents are of type {@link airport.Airside}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Airside</em>' containment reference list.
	 * @see airport.AirportPackage#getTerminal_Airside()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Airside> getAirside();

	/**
	 * Returns the value of the '<em><b>Landside</b></em>' containment reference list.
	 * The list contents are of type {@link airport.Landside}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Landside</em>' containment reference list.
	 * @see airport.AirportPackage#getTerminal_Landside()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Landside> getLandside();

	/**
	 * Returns the value of the '<em><b>Flights</b></em>' containment reference list.
	 * The list contents are of type {@link airport.Flight}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flights</em>' containment reference list.
	 * @see airport.AirportPackage#getTerminal_Flights()
	 * @model containment="true"
	 * @generated
	 */
	EList<Flight> getFlights();

	/**
	 * Returns the value of the '<em><b>Parking Areas</b></em>' containment reference list.
	 * The list contents are of type {@link airport.ParkingArea}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parking Areas</em>' containment reference list.
	 * @see airport.AirportPackage#getTerminal_ParkingAreas()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParkingArea> getParkingAreas();

	/**
	 * Returns the value of the '<em><b>Transportation Services</b></em>' containment reference list.
	 * The list contents are of type {@link airport.TransportationServices}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transportation Services</em>' containment reference list.
	 * @see airport.AirportPackage#getTerminal_TransportationServices()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransportationServices> getTransportationServices();

} // Terminal
