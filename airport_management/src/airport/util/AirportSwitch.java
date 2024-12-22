/**
 */
package airport.util;

import airport.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see airport.AirportPackage
 * @generated
 */
public class AirportSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AirportPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AirportSwitch() {
		if (modelPackage == null) {
			modelPackage = AirportPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AirportPackage.TERMINAL: {
				Terminal terminal = (Terminal)theEObject;
				T result = caseTerminal(terminal);
				if (result == null) result = casenamedElement(terminal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AirportPackage.AIRSIDE: {
				Airside airside = (Airside)theEObject;
				T result = caseAirside(airside);
				if (result == null) result = caseDivision(airside);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AirportPackage.BELT: {
				Belt belt = (Belt)theEObject;
				T result = caseBelt(belt);
				if (result == null) result = casenamedElement(belt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AirportPackage.CHECK_IN: {
				CheckIn checkIn = (CheckIn)theEObject;
				T result = caseCheckIn(checkIn);
				if (result == null) result = casenamedElement(checkIn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AirportPackage.COMMON_AREA: {
				CommonArea commonArea = (CommonArea)theEObject;
				T result = caseCommonArea(commonArea);
				if (result == null) result = casenamedElement(commonArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AirportPackage.COUNTER: {
				Counter counter = (Counter)theEObject;
				T result = caseCounter(counter);
				if (result == null) result = casenamedElement(counter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AirportPackage.CUSTOMS: {
				Customs customs = (Customs)theEObject;
				T result = caseCustoms(customs);
				if (result == null) result = casenamedElement(customs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AirportPackage.DIVISION: {
				Division division = (Division)theEObject;
				T result = caseDivision(division);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AirportPackage.ELEVATOR: {
				Elevator elevator = (Elevator)theEObject;
				T result = caseElevator(elevator);
				if (result == null) result = casenamedElement(elevator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AirportPackage.FLIGHT: {
				Flight flight = (Flight)theEObject;
				T result = caseFlight(flight);
				if (result == null) result = casenamedElement(flight);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AirportPackage.FLOOR: {
				Floor floor = (Floor)theEObject;
				T result = caseFloor(floor);
				if (result == null) result = casenamedElement(floor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AirportPackage.GATE: {
				Gate gate = (Gate)theEObject;
				T result = caseGate(gate);
				if (result == null) result = casenamedElement(gate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AirportPackage.LANDSIDE: {
				Landside landside = (Landside)theEObject;
				T result = caseLandside(landside);
				if (result == null) result = caseDivision(landside);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AirportPackage.POINT: {
				Point point = (Point)theEObject;
				T result = casePoint(point);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AirportPackage.SECURITY_CHECK: {
				SecurityCheck securityCheck = (SecurityCheck)theEObject;
				T result = caseSecurityCheck(securityCheck);
				if (result == null) result = casenamedElement(securityCheck);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AirportPackage.AREA: {
				Area area = (Area)theEObject;
				T result = caseArea(area);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AirportPackage.ARRIVAL: {
				Arrival arrival = (Arrival)theEObject;
				T result = caseArrival(arrival);
				if (result == null) result = caseArea(arrival);
				if (result == null) result = casenamedElement(arrival);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AirportPackage.BAGGAGE_CLAIM: {
				BaggageClaim baggageClaim = (BaggageClaim)theEObject;
				T result = caseBaggageClaim(baggageClaim);
				if (result == null) result = caseArea(baggageClaim);
				if (result == null) result = casenamedElement(baggageClaim);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AirportPackage.BAGGAGE_DROP_OFF: {
				BaggageDropOff baggageDropOff = (BaggageDropOff)theEObject;
				T result = caseBaggageDropOff(baggageDropOff);
				if (result == null) result = caseArea(baggageDropOff);
				if (result == null) result = casenamedElement(baggageDropOff);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AirportPackage.DEPARTURE: {
				Departure departure = (Departure)theEObject;
				T result = caseDeparture(departure);
				if (result == null) result = caseArea(departure);
				if (result == null) result = casenamedElement(departure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AirportPackage.DROP_OFF: {
				DropOff dropOff = (DropOff)theEObject;
				T result = caseDropOff(dropOff);
				if (result == null) result = caseArea(dropOff);
				if (result == null) result = casenamedElement(dropOff);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AirportPackage.GATE_AREA: {
				GateArea gateArea = (GateArea)theEObject;
				T result = caseGateArea(gateArea);
				if (result == null) result = caseArea(gateArea);
				if (result == null) result = casenamedElement(gateArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AirportPackage.PARKING_AREA: {
				ParkingArea parkingArea = (ParkingArea)theEObject;
				T result = caseParkingArea(parkingArea);
				if (result == null) result = caseArea(parkingArea);
				if (result == null) result = casenamedElement(parkingArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AirportPackage.TRANSPORTATION_SERVICES: {
				TransportationServices transportationServices = (TransportationServices)theEObject;
				T result = caseTransportationServices(transportationServices);
				if (result == null) result = caseArea(transportationServices);
				if (result == null) result = casenamedElement(transportationServices);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AirportPackage.NAMED_ELEMENT: {
				namedElement namedElement = (namedElement)theEObject;
				T result = casenamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminal(Terminal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Airside</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Airside</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAirside(Airside object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Belt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Belt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBelt(Belt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Check In</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Check In</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckIn(CheckIn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Common Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Common Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommonArea(CommonArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Counter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Counter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCounter(Counter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustoms(Customs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Division</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Division</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivision(Division object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elevator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elevator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElevator(Elevator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flight</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flight</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlight(Flight object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Floor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Floor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloor(Floor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGate(Gate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Landside</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Landside</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLandside(Landside object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoint(Point object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Check</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Check</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityCheck(SecurityCheck object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArea(Area object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arrival</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arrival</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrival(Arrival object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Baggage Claim</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Baggage Claim</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaggageClaim(BaggageClaim object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Baggage Drop Off</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Baggage Drop Off</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaggageDropOff(BaggageDropOff object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Departure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Departure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeparture(Departure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drop Off</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drop Off</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDropOff(DropOff object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gate Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gate Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGateArea(GateArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parking Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parking Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParkingArea(ParkingArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transportation Services</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transportation Services</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransportationServices(TransportationServices object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casenamedElement(namedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AirportSwitch
