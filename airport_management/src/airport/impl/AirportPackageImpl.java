/**
 */
package airport.impl;

import airport.AirportFactory;
import airport.AirportPackage;
import airport.Airside;
import airport.Area;
import airport.Arrival;
import airport.BaggageClaim;
import airport.BaggageDropOff;
import airport.Belt;
import airport.CheckIn;
import airport.CommonArea;
import airport.CommonAreaTypes;
import airport.Counter;
import airport.Customs;
import airport.Departure;
import airport.Division;
import airport.DropOff;
import airport.Elevator;
import airport.Flight;
import airport.FlightType;
import airport.Floor;
import airport.Gate;
import airport.GateArea;
import airport.Landside;
import airport.ParkingArea;
import airport.Point;
import airport.SecurityCheck;
import airport.Terminal;
import airport.TransportationServices;
import airport.TransportationTypes;
import airport.namedElement;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AirportPackageImpl extends EPackageImpl implements AirportPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass airsideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beltEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkInEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commonAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass counterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elevatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass landsideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityCheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass areaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrivalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baggageClaimEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baggageDropOffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass departureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dropOffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gateAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parkingAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transportationServicesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum commonAreaTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum flightTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transportationTypesEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see airport.AirportPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AirportPackageImpl() {
		super(eNS_URI, AirportFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AirportPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AirportPackage init() {
		if (isInited) return (AirportPackage)EPackage.Registry.INSTANCE.getEPackage(AirportPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAirportPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AirportPackageImpl theAirportPackage = registeredAirportPackage instanceof AirportPackageImpl ? (AirportPackageImpl)registeredAirportPackage : new AirportPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theAirportPackage.createPackageContents();

		// Initialize created meta-data
		theAirportPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAirportPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AirportPackage.eNS_URI, theAirportPackage);
		return theAirportPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTerminal() {
		return terminalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTerminal_Dropoff() {
		return (EReference)terminalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTerminal_Floors() {
		return (EReference)terminalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTerminal_Airside() {
		return (EReference)terminalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTerminal_Landside() {
		return (EReference)terminalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTerminal_Flights() {
		return (EReference)terminalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTerminal_ParkingAreas() {
		return (EReference)terminalEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTerminal_TransportationServices() {
		return (EReference)terminalEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAirside() {
		return airsideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAirside_GateArea() {
		return (EReference)airsideEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBelt() {
		return beltEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBelt_Flight() {
		return (EReference)beltEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCheckIn() {
		return checkInEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCheckIn_Counters() {
		return (EReference)checkInEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommonArea() {
		return commonAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommonArea_Type() {
		return (EAttribute)commonAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCounter() {
		return counterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCounter_Flight() {
		return (EReference)counterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustoms() {
		return customsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDivision() {
		return divisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDivision_CommonAreas() {
		return (EReference)divisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDivision_Floor() {
		return (EReference)divisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElevator() {
		return elevatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElevator_ConnectedFloors() {
		return (EReference)elevatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlight() {
		return flightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlight_FlightNumber() {
		return (EAttribute)flightEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlight_Time() {
		return (EAttribute)flightEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlight_Type() {
		return (EAttribute)flightEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlight_City() {
		return (EAttribute)flightEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFloor() {
		return floorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGate() {
		return gateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGate_Boarding() {
		return (EAttribute)gateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGate_Flight() {
		return (EReference)gateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLandside() {
		return landsideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLandside_DepartureArea() {
		return (EReference)landsideEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLandside_ArrivalArea() {
		return (EReference)landsideEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPoint() {
		return pointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPoint_X() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPoint_Y() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecurityCheck() {
		return securityCheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArea() {
		return areaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArea_AreaCorners() {
		return (EReference)areaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrival() {
		return arrivalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrival_BaggageClaim() {
		return (EReference)arrivalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrival_Customs() {
		return (EReference)arrivalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBaggageClaim() {
		return baggageClaimEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBaggageClaim_Belts() {
		return (EReference)baggageClaimEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBaggageDropOff() {
		return baggageDropOffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBaggageDropOff_Counters() {
		return (EReference)baggageDropOffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeparture() {
		return departureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeparture_Security() {
		return (EReference)departureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeparture_CheckIn() {
		return (EReference)departureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeparture_BaggageDropOff() {
		return (EReference)departureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDropOff() {
		return dropOffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGateArea() {
		return gateAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGateArea_Gates() {
		return (EReference)gateAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParkingArea() {
		return parkingAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransportationServices() {
		return transportationServicesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransportationServices_Type() {
		return (EAttribute)transportationServicesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getnamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCommonAreaTypes() {
		return commonAreaTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFlightType() {
		return flightTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTransportationTypes() {
		return transportationTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AirportFactory getAirportFactory() {
		return (AirportFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		terminalEClass = createEClass(TERMINAL);
		createEReference(terminalEClass, TERMINAL__DROPOFF);
		createEReference(terminalEClass, TERMINAL__FLOORS);
		createEReference(terminalEClass, TERMINAL__AIRSIDE);
		createEReference(terminalEClass, TERMINAL__LANDSIDE);
		createEReference(terminalEClass, TERMINAL__FLIGHTS);
		createEReference(terminalEClass, TERMINAL__PARKING_AREAS);
		createEReference(terminalEClass, TERMINAL__TRANSPORTATION_SERVICES);

		airsideEClass = createEClass(AIRSIDE);
		createEReference(airsideEClass, AIRSIDE__GATE_AREA);

		beltEClass = createEClass(BELT);
		createEReference(beltEClass, BELT__FLIGHT);

		checkInEClass = createEClass(CHECK_IN);
		createEReference(checkInEClass, CHECK_IN__COUNTERS);

		commonAreaEClass = createEClass(COMMON_AREA);
		createEAttribute(commonAreaEClass, COMMON_AREA__TYPE);

		counterEClass = createEClass(COUNTER);
		createEReference(counterEClass, COUNTER__FLIGHT);

		customsEClass = createEClass(CUSTOMS);

		divisionEClass = createEClass(DIVISION);
		createEReference(divisionEClass, DIVISION__COMMON_AREAS);
		createEReference(divisionEClass, DIVISION__FLOOR);

		elevatorEClass = createEClass(ELEVATOR);
		createEReference(elevatorEClass, ELEVATOR__CONNECTED_FLOORS);

		flightEClass = createEClass(FLIGHT);
		createEAttribute(flightEClass, FLIGHT__FLIGHT_NUMBER);
		createEAttribute(flightEClass, FLIGHT__TIME);
		createEAttribute(flightEClass, FLIGHT__TYPE);
		createEAttribute(flightEClass, FLIGHT__CITY);

		floorEClass = createEClass(FLOOR);

		gateEClass = createEClass(GATE);
		createEAttribute(gateEClass, GATE__BOARDING);
		createEReference(gateEClass, GATE__FLIGHT);

		landsideEClass = createEClass(LANDSIDE);
		createEReference(landsideEClass, LANDSIDE__DEPARTURE_AREA);
		createEReference(landsideEClass, LANDSIDE__ARRIVAL_AREA);

		pointEClass = createEClass(POINT);
		createEAttribute(pointEClass, POINT__X);
		createEAttribute(pointEClass, POINT__Y);

		securityCheckEClass = createEClass(SECURITY_CHECK);

		areaEClass = createEClass(AREA);
		createEReference(areaEClass, AREA__AREA_CORNERS);

		arrivalEClass = createEClass(ARRIVAL);
		createEReference(arrivalEClass, ARRIVAL__BAGGAGE_CLAIM);
		createEReference(arrivalEClass, ARRIVAL__CUSTOMS);

		baggageClaimEClass = createEClass(BAGGAGE_CLAIM);
		createEReference(baggageClaimEClass, BAGGAGE_CLAIM__BELTS);

		baggageDropOffEClass = createEClass(BAGGAGE_DROP_OFF);
		createEReference(baggageDropOffEClass, BAGGAGE_DROP_OFF__COUNTERS);

		departureEClass = createEClass(DEPARTURE);
		createEReference(departureEClass, DEPARTURE__SECURITY);
		createEReference(departureEClass, DEPARTURE__CHECK_IN);
		createEReference(departureEClass, DEPARTURE__BAGGAGE_DROP_OFF);

		dropOffEClass = createEClass(DROP_OFF);

		gateAreaEClass = createEClass(GATE_AREA);
		createEReference(gateAreaEClass, GATE_AREA__GATES);

		parkingAreaEClass = createEClass(PARKING_AREA);

		transportationServicesEClass = createEClass(TRANSPORTATION_SERVICES);
		createEAttribute(transportationServicesEClass, TRANSPORTATION_SERVICES__TYPE);

		namedElementEClass = createEClass(NAMED_ELEMENT);

		// Create enums
		commonAreaTypesEEnum = createEEnum(COMMON_AREA_TYPES);
		flightTypeEEnum = createEEnum(FLIGHT_TYPE);
		transportationTypesEEnum = createEEnum(TRANSPORTATION_TYPES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		airsideEClass.getESuperTypes().add(this.getDivision());
		gateEClass.getESuperTypes().add(this.getnamedElement());
		landsideEClass.getESuperTypes().add(this.getDivision());
		arrivalEClass.getESuperTypes().add(this.getArea());
		baggageClaimEClass.getESuperTypes().add(this.getArea());
		baggageDropOffEClass.getESuperTypes().add(this.getArea());
		departureEClass.getESuperTypes().add(this.getArea());
		dropOffEClass.getESuperTypes().add(this.getArea());
		gateAreaEClass.getESuperTypes().add(this.getArea());
		parkingAreaEClass.getESuperTypes().add(this.getArea());
		transportationServicesEClass.getESuperTypes().add(this.getArea());
		transportationServicesEClass.getESuperTypes().add(this.getnamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(terminalEClass, Terminal.class, "Terminal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTerminal_Dropoff(), this.getDropOff(), null, "dropoff", null, 1, -1, Terminal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTerminal_Floors(), this.getFloor(), null, "floors", null, 1, -1, Terminal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTerminal_Airside(), this.getAirside(), null, "airside", null, 1, -1, Terminal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTerminal_Landside(), this.getLandside(), null, "landside", null, 1, -1, Terminal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTerminal_Flights(), this.getFlight(), null, "flights", null, 0, -1, Terminal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTerminal_ParkingAreas(), this.getParkingArea(), null, "ParkingAreas", null, 0, -1, Terminal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTerminal_TransportationServices(), this.getTransportationServices(), null, "TransportationServices", null, 0, -1, Terminal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(airsideEClass, Airside.class, "Airside", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAirside_GateArea(), this.getGateArea(), null, "gateArea", null, 1, -1, Airside.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(beltEClass, Belt.class, "Belt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBelt_Flight(), this.getFlight(), null, "flight", null, 0, 1, Belt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkInEClass, CheckIn.class, "CheckIn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCheckIn_Counters(), this.getCounter(), null, "counters", null, 1, -1, CheckIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commonAreaEClass, CommonArea.class, "CommonArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommonArea_Type(), this.getCommonAreaTypes(), "type", null, 0, 1, CommonArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(counterEClass, Counter.class, "Counter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCounter_Flight(), this.getFlight(), null, "flight", null, 0, 1, Counter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customsEClass, Customs.class, "Customs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(divisionEClass, Division.class, "Division", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDivision_CommonAreas(), this.getCommonArea(), null, "commonAreas", null, 0, -1, Division.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDivision_Floor(), this.getFloor(), null, "floor", null, 1, 1, Division.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elevatorEClass, Elevator.class, "Elevator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElevator_ConnectedFloors(), this.getFloor(), null, "connectedFloors", null, 1, -1, Elevator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flightEClass, Flight.class, "Flight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlight_FlightNumber(), ecorePackage.getEString(), "flightNumber", null, 0, 1, Flight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlight_Time(), ecorePackage.getEString(), "time", null, 0, 1, Flight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlight_Type(), this.getFlightType(), "type", null, 0, 1, Flight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlight_City(), ecorePackage.getEString(), "city", null, 0, 1, Flight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(floorEClass, Floor.class, "Floor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gateEClass, Gate.class, "Gate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGate_Boarding(), ecorePackage.getEBoolean(), "boarding", null, 0, 1, Gate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGate_Flight(), this.getFlight(), null, "flight", null, 0, 1, Gate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(landsideEClass, Landside.class, "Landside", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLandside_DepartureArea(), this.getDeparture(), null, "departureArea", null, 1, 1, Landside.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLandside_ArrivalArea(), this.getArrival(), null, "arrivalArea", null, 1, 1, Landside.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointEClass, Point.class, "Point", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPoint_X(), ecorePackage.getEInt(), "x", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoint_Y(), ecorePackage.getEInt(), "y", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityCheckEClass, SecurityCheck.class, "SecurityCheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(areaEClass, Area.class, "Area", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArea_AreaCorners(), this.getPoint(), null, "areaCorners", null, 1, -1, Area.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrivalEClass, Arrival.class, "Arrival", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrival_BaggageClaim(), this.getBaggageClaim(), null, "baggageClaim", null, 1, -1, Arrival.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArrival_Customs(), this.getCustoms(), null, "customs", null, 1, 1, Arrival.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baggageClaimEClass, BaggageClaim.class, "BaggageClaim", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBaggageClaim_Belts(), this.getBelt(), null, "belts", null, 1, -1, BaggageClaim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baggageDropOffEClass, BaggageDropOff.class, "BaggageDropOff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBaggageDropOff_Counters(), this.getCounter(), null, "counters", null, 1, -1, BaggageDropOff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(departureEClass, Departure.class, "Departure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeparture_Security(), this.getSecurityCheck(), null, "security", null, 1, -1, Departure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeparture_CheckIn(), this.getCheckIn(), null, "checkIn", null, 1, -1, Departure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeparture_BaggageDropOff(), this.getBaggageDropOff(), null, "baggageDropOff", null, 1, -1, Departure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dropOffEClass, DropOff.class, "DropOff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gateAreaEClass, GateArea.class, "GateArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGateArea_Gates(), this.getGate(), null, "gates", null, 1, -1, GateArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parkingAreaEClass, ParkingArea.class, "ParkingArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transportationServicesEClass, TransportationServices.class, "TransportationServices", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransportationServices_Type(), this.getTransportationTypes(), "type", null, 0, 1, TransportationServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, namedElement.class, "namedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(commonAreaTypesEEnum, CommonAreaTypes.class, "CommonAreaTypes");
		addEEnumLiteral(commonAreaTypesEEnum, CommonAreaTypes.SITTING);
		addEEnumLiteral(commonAreaTypesEEnum, CommonAreaTypes.DINING);
		addEEnumLiteral(commonAreaTypesEEnum, CommonAreaTypes.WORKING);
		addEEnumLiteral(commonAreaTypesEEnum, CommonAreaTypes.PLAYING);
		addEEnumLiteral(commonAreaTypesEEnum, CommonAreaTypes.RESTROOM);
		addEEnumLiteral(commonAreaTypesEEnum, CommonAreaTypes.RETAIL);
		addEEnumLiteral(commonAreaTypesEEnum, CommonAreaTypes.LOUNGE);

		initEEnum(flightTypeEEnum, FlightType.class, "FlightType");
		addEEnumLiteral(flightTypeEEnum, FlightType.ARRIVAL);
		addEEnumLiteral(flightTypeEEnum, FlightType.DEPARTURE);

		initEEnum(transportationTypesEEnum, TransportationTypes.class, "TransportationTypes");
		addEEnumLiteral(transportationTypesEEnum, TransportationTypes.TAXI);
		addEEnumLiteral(transportationTypesEEnum, TransportationTypes.BUS);
		addEEnumLiteral(transportationTypesEEnum, TransportationTypes.TRAIN);

		// Create resource
		createResource(eNS_URI);
	}

} //AirportPackageImpl
