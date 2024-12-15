/**
 */
package airport.areas.util;

import airport.areas.*;

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
 * @see airport.areas.AreasPackage
 * @generated
 */
public class AreasSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AreasPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AreasSwitch() {
		if (modelPackage == null) {
			modelPackage = AreasPackage.eINSTANCE;
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
			case AreasPackage.AREA: {
				Area area = (Area)theEObject;
				T result = caseArea(area);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AreasPackage.ARRIVAL: {
				Arrival arrival = (Arrival)theEObject;
				T result = caseArrival(arrival);
				if (result == null) result = caseArea(arrival);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AreasPackage.BAGGAGE_CLAIM: {
				BaggageClaim baggageClaim = (BaggageClaim)theEObject;
				T result = caseBaggageClaim(baggageClaim);
				if (result == null) result = caseArea(baggageClaim);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AreasPackage.BAGGAGE_DROP_OFF: {
				BaggageDropOff baggageDropOff = (BaggageDropOff)theEObject;
				T result = caseBaggageDropOff(baggageDropOff);
				if (result == null) result = caseArea(baggageDropOff);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AreasPackage.DEPARTURE: {
				Departure departure = (Departure)theEObject;
				T result = caseDeparture(departure);
				if (result == null) result = caseArea(departure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AreasPackage.DROP_OFF: {
				DropOff dropOff = (DropOff)theEObject;
				T result = caseDropOff(dropOff);
				if (result == null) result = caseArea(dropOff);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AreasPackage.GATE_AREA: {
				GateArea gateArea = (GateArea)theEObject;
				T result = caseGateArea(gateArea);
				if (result == null) result = caseArea(gateArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AreasPackage.PARKING_AREA: {
				ParkingArea parkingArea = (ParkingArea)theEObject;
				T result = caseParkingArea(parkingArea);
				if (result == null) result = caseArea(parkingArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AreasPackage.TRANSPORTATION_SERVICES: {
				TransportationServices transportationServices = (TransportationServices)theEObject;
				T result = caseTransportationServices(transportationServices);
				if (result == null) result = caseArea(transportationServices);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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

} //AreasSwitch
