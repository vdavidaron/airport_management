/**
 */
package airport.areas.impl;

import airport.AirportPackage;

import airport.areas.Area;
import airport.areas.AreasFactory;
import airport.areas.AreasPackage;
import airport.areas.Arrival;
import airport.areas.BaggageClaim;
import airport.areas.BaggageDropOff;
import airport.areas.Departure;
import airport.areas.DropOff;
import airport.areas.GateArea;
import airport.areas.ParkingArea;
import airport.areas.TransportationServices;

import airport.impl.AirportPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AreasPackageImpl extends EPackageImpl implements AreasPackage {
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
	 * @see airport.areas.AreasPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AreasPackageImpl() {
		super(eNS_URI, AreasFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AreasPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AreasPackage init() {
		if (isInited) return (AreasPackage)EPackage.Registry.INSTANCE.getEPackage(AreasPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAreasPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AreasPackageImpl theAreasPackage = registeredAreasPackage instanceof AreasPackageImpl ? (AreasPackageImpl)registeredAreasPackage : new AreasPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AirportPackage.eNS_URI);
		AirportPackageImpl theAirportPackage = (AirportPackageImpl)(registeredPackage instanceof AirportPackageImpl ? registeredPackage : AirportPackage.eINSTANCE);

		// Create package meta-data objects
		theAreasPackage.createPackageContents();
		theAirportPackage.createPackageContents();

		// Initialize created meta-data
		theAreasPackage.initializePackageContents();
		theAirportPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAreasPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AreasPackage.eNS_URI, theAreasPackage);
		return theAreasPackage;
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
	public AreasFactory getAreasFactory() {
		return (AreasFactory)getEFactoryInstance();
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

		// Obtain other dependent packages
		AirportPackage theAirportPackage = (AirportPackage)EPackage.Registry.INSTANCE.getEPackage(AirportPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		arrivalEClass.getESuperTypes().add(this.getArea());
		baggageClaimEClass.getESuperTypes().add(this.getArea());
		baggageDropOffEClass.getESuperTypes().add(this.getArea());
		departureEClass.getESuperTypes().add(this.getArea());
		dropOffEClass.getESuperTypes().add(this.getArea());
		gateAreaEClass.getESuperTypes().add(this.getArea());
		parkingAreaEClass.getESuperTypes().add(this.getArea());
		transportationServicesEClass.getESuperTypes().add(this.getArea());

		// Initialize classes, features, and operations; add parameters
		initEClass(areaEClass, Area.class, "Area", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArea_AreaCorners(), theAirportPackage.getPoint(), null, "areaCorners", null, 1, -1, Area.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrivalEClass, Arrival.class, "Arrival", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrival_BaggageClaim(), this.getBaggageClaim(), null, "baggageClaim", null, 1, -1, Arrival.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArrival_Customs(), theAirportPackage.getCustoms(), null, "customs", null, 1, 1, Arrival.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baggageClaimEClass, BaggageClaim.class, "BaggageClaim", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBaggageClaim_Belts(), theAirportPackage.getBelt(), null, "belts", null, 1, -1, BaggageClaim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baggageDropOffEClass, BaggageDropOff.class, "BaggageDropOff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBaggageDropOff_Counters(), theAirportPackage.getCounter(), null, "counters", null, 1, -1, BaggageDropOff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(departureEClass, Departure.class, "Departure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeparture_Security(), theAirportPackage.getSecurityCheck(), null, "security", null, 1, -1, Departure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeparture_CheckIn(), theAirportPackage.getCheckIn(), null, "checkIn", null, 1, -1, Departure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeparture_BaggageDropOff(), this.getBaggageDropOff(), null, "baggageDropOff", null, 1, -1, Departure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dropOffEClass, DropOff.class, "DropOff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gateAreaEClass, GateArea.class, "GateArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGateArea_Gates(), theAirportPackage.getGate(), null, "gates", null, 1, -1, GateArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parkingAreaEClass, ParkingArea.class, "ParkingArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transportationServicesEClass, TransportationServices.class, "TransportationServices", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransportationServices_Type(), theAirportPackage.getTransportationTypes(), "type", null, 0, 1, TransportationServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //AreasPackageImpl
