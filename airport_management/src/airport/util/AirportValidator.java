/**
 */
package airport.util;

import airport.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see airport.AirportPackage
 * @generated
 */
public class AirportValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AirportValidator INSTANCE = new AirportValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "airport";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AirportValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return AirportPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case AirportPackage.TERMINAL:
				return validateTerminal((Terminal)value, diagnostics, context);
			case AirportPackage.AIRSIDE:
				return validateAirside((Airside)value, diagnostics, context);
			case AirportPackage.BELT:
				return validateBelt((Belt)value, diagnostics, context);
			case AirportPackage.CHECK_IN:
				return validateCheckIn((CheckIn)value, diagnostics, context);
			case AirportPackage.COMMON_AREA:
				return validateCommonArea((CommonArea)value, diagnostics, context);
			case AirportPackage.COUNTER:
				return validateCounter((Counter)value, diagnostics, context);
			case AirportPackage.CUSTOMS:
				return validateCustoms((Customs)value, diagnostics, context);
			case AirportPackage.DIVISION:
				return validateDivision((Division)value, diagnostics, context);
			case AirportPackage.ELEVATOR:
				return validateElevator((Elevator)value, diagnostics, context);
			case AirportPackage.FLIGHT:
				return validateFlight((Flight)value, diagnostics, context);
			case AirportPackage.FLOOR:
				return validateFloor((Floor)value, diagnostics, context);
			case AirportPackage.GATE:
				return validateGate((Gate)value, diagnostics, context);
			case AirportPackage.LANDSIDE:
				return validateLandside((Landside)value, diagnostics, context);
			case AirportPackage.POINT:
				return validatePoint((Point)value, diagnostics, context);
			case AirportPackage.SECURITY_CHECK:
				return validateSecurityCheck((SecurityCheck)value, diagnostics, context);
			case AirportPackage.AREA:
				return validateArea((Area)value, diagnostics, context);
			case AirportPackage.ARRIVAL:
				return validateArrival((Arrival)value, diagnostics, context);
			case AirportPackage.BAGGAGE_CLAIM:
				return validateBaggageClaim((BaggageClaim)value, diagnostics, context);
			case AirportPackage.BAGGAGE_DROP_OFF:
				return validateBaggageDropOff((BaggageDropOff)value, diagnostics, context);
			case AirportPackage.DEPARTURE:
				return validateDeparture((Departure)value, diagnostics, context);
			case AirportPackage.DROP_OFF:
				return validateDropOff((DropOff)value, diagnostics, context);
			case AirportPackage.GATE_AREA:
				return validateGateArea((GateArea)value, diagnostics, context);
			case AirportPackage.PARKING_AREA:
				return validateParkingArea((ParkingArea)value, diagnostics, context);
			case AirportPackage.TRANSPORTATION_SERVICES:
				return validateTransportationServices((TransportationServices)value, diagnostics, context);
			case AirportPackage.NAMED_ELEMENT:
				return validatenamedElement((namedElement)value, diagnostics, context);
			case AirportPackage.COMMON_AREA_TYPES:
				return validateCommonAreaTypes((CommonAreaTypes)value, diagnostics, context);
			case AirportPackage.FLIGHT_TYPE:
				return validateFlightType((FlightType)value, diagnostics, context);
			case AirportPackage.TRANSPORTATION_TYPES:
				return validateTransportationTypes((TransportationTypes)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerminal(Terminal terminal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(terminal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAirside(Airside airside, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(airside, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBelt(Belt belt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(belt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCheckIn(CheckIn checkIn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(checkIn, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommonArea(CommonArea commonArea, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(commonArea, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCounter(Counter counter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(counter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(counter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(counter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(counter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(counter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(counter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(counter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(counter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(counter, diagnostics, context);
		if (result || diagnostics != null) result &= validateCounter_ValidCounter(counter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ValidCounter constraint of '<em>Counter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCounter_ValidCounter(Counter counter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ValidCounter", getObjectLabel(counter, context) },
						 new Object[] { counter },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustoms(Customs customs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customs, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDivision(Division division, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(division, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElevator(Elevator elevator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elevator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlight(Flight flight, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(flight, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(flight, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(flight, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(flight, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(flight, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(flight, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(flight, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(flight, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(flight, diagnostics, context);
		if (result || diagnostics != null) result &= validateFlight_ValidTime(flight, diagnostics, context);
		if (result || diagnostics != null) result &= validateFlight_ValidName(flight, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ValidTime constraint of '<em>Flight</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlight_ValidTime(Flight flight, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ValidTime", getObjectLabel(flight, context) },
						 new Object[] { flight },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ValidName constraint of '<em>Flight</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlight_ValidName(Flight flight, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ValidName", getObjectLabel(flight, context) },
						 new Object[] { flight },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloor(Floor floor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(floor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGate(Gate gate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLandside(Landside landside, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(landside, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePoint(Point point, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(point, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityCheck(SecurityCheck securityCheck, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(securityCheck, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArea(Area area, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(area, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(area, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(area, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(area, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(area, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(area, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(area, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(area, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(area, diagnostics, context);
		if (result || diagnostics != null) result &= validateArea_ValidArea(area, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ValidArea constraint of '<em>Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArea_ValidArea(Area area, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ValidArea", getObjectLabel(area, context) },
						 new Object[] { area },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrival(Arrival arrival, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(arrival, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(arrival, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(arrival, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(arrival, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(arrival, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(arrival, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(arrival, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(arrival, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(arrival, diagnostics, context);
		if (result || diagnostics != null) result &= validateArea_ValidArea(arrival, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBaggageClaim(BaggageClaim baggageClaim, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(baggageClaim, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(baggageClaim, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(baggageClaim, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(baggageClaim, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(baggageClaim, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(baggageClaim, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(baggageClaim, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(baggageClaim, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(baggageClaim, diagnostics, context);
		if (result || diagnostics != null) result &= validateArea_ValidArea(baggageClaim, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBaggageDropOff(BaggageDropOff baggageDropOff, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(baggageDropOff, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(baggageDropOff, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(baggageDropOff, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(baggageDropOff, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(baggageDropOff, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(baggageDropOff, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(baggageDropOff, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(baggageDropOff, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(baggageDropOff, diagnostics, context);
		if (result || diagnostics != null) result &= validateArea_ValidArea(baggageDropOff, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeparture(Departure departure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(departure, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(departure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(departure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(departure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(departure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(departure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(departure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(departure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(departure, diagnostics, context);
		if (result || diagnostics != null) result &= validateArea_ValidArea(departure, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDropOff(DropOff dropOff, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dropOff, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dropOff, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dropOff, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dropOff, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dropOff, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dropOff, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dropOff, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dropOff, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dropOff, diagnostics, context);
		if (result || diagnostics != null) result &= validateArea_ValidArea(dropOff, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGateArea(GateArea gateArea, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(gateArea, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(gateArea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(gateArea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(gateArea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(gateArea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(gateArea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(gateArea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(gateArea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(gateArea, diagnostics, context);
		if (result || diagnostics != null) result &= validateArea_ValidArea(gateArea, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParkingArea(ParkingArea parkingArea, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(parkingArea, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(parkingArea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(parkingArea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(parkingArea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(parkingArea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(parkingArea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(parkingArea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(parkingArea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(parkingArea, diagnostics, context);
		if (result || diagnostics != null) result &= validateArea_ValidArea(parkingArea, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransportationServices(TransportationServices transportationServices, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(transportationServices, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(transportationServices, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(transportationServices, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(transportationServices, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(transportationServices, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(transportationServices, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(transportationServices, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(transportationServices, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(transportationServices, diagnostics, context);
		if (result || diagnostics != null) result &= validateArea_ValidArea(transportationServices, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatenamedElement(namedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommonAreaTypes(CommonAreaTypes commonAreaTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlightType(FlightType flightType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransportationTypes(TransportationTypes transportationTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //AirportValidator
