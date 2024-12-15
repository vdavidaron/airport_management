/**
 */
package airport.areas;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see airport.areas.AreasFactory
 * @model kind="package"
 * @generated
 */
public interface AreasPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "areas";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://example.org/airport/areas";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ar";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AreasPackage eINSTANCE = airport.areas.impl.AreasPackageImpl.init();

	/**
	 * The meta object id for the '{@link airport.areas.impl.AreaImpl <em>Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see airport.areas.impl.AreaImpl
	 * @see airport.areas.impl.AreasPackageImpl#getArea()
	 * @generated
	 */
	int AREA = 0;

	/**
	 * The feature id for the '<em><b>Area Corners</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__AREA_CORNERS = 0;

	/**
	 * The number of structural features of the '<em>Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link airport.areas.impl.ArrivalImpl <em>Arrival</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see airport.areas.impl.ArrivalImpl
	 * @see airport.areas.impl.AreasPackageImpl#getArrival()
	 * @generated
	 */
	int ARRIVAL = 1;

	/**
	 * The feature id for the '<em><b>Area Corners</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL__AREA_CORNERS = AREA__AREA_CORNERS;

	/**
	 * The feature id for the '<em><b>Baggage Claim</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL__BAGGAGE_CLAIM = AREA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Customs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL__CUSTOMS = AREA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Arrival</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_FEATURE_COUNT = AREA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Arrival</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_OPERATION_COUNT = AREA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link airport.areas.impl.BaggageClaimImpl <em>Baggage Claim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see airport.areas.impl.BaggageClaimImpl
	 * @see airport.areas.impl.AreasPackageImpl#getBaggageClaim()
	 * @generated
	 */
	int BAGGAGE_CLAIM = 2;

	/**
	 * The feature id for the '<em><b>Area Corners</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAGGAGE_CLAIM__AREA_CORNERS = AREA__AREA_CORNERS;

	/**
	 * The feature id for the '<em><b>Belts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAGGAGE_CLAIM__BELTS = AREA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Baggage Claim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAGGAGE_CLAIM_FEATURE_COUNT = AREA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Baggage Claim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAGGAGE_CLAIM_OPERATION_COUNT = AREA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link airport.areas.impl.BaggageDropOffImpl <em>Baggage Drop Off</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see airport.areas.impl.BaggageDropOffImpl
	 * @see airport.areas.impl.AreasPackageImpl#getBaggageDropOff()
	 * @generated
	 */
	int BAGGAGE_DROP_OFF = 3;

	/**
	 * The feature id for the '<em><b>Area Corners</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAGGAGE_DROP_OFF__AREA_CORNERS = AREA__AREA_CORNERS;

	/**
	 * The feature id for the '<em><b>Counters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAGGAGE_DROP_OFF__COUNTERS = AREA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Baggage Drop Off</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAGGAGE_DROP_OFF_FEATURE_COUNT = AREA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Baggage Drop Off</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAGGAGE_DROP_OFF_OPERATION_COUNT = AREA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link airport.areas.impl.DepartureImpl <em>Departure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see airport.areas.impl.DepartureImpl
	 * @see airport.areas.impl.AreasPackageImpl#getDeparture()
	 * @generated
	 */
	int DEPARTURE = 4;

	/**
	 * The feature id for the '<em><b>Area Corners</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTURE__AREA_CORNERS = AREA__AREA_CORNERS;

	/**
	 * The feature id for the '<em><b>Security</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTURE__SECURITY = AREA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Check In</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTURE__CHECK_IN = AREA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Baggage Drop Off</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTURE__BAGGAGE_DROP_OFF = AREA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Departure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTURE_FEATURE_COUNT = AREA_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Departure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTURE_OPERATION_COUNT = AREA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link airport.areas.impl.DropOffImpl <em>Drop Off</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see airport.areas.impl.DropOffImpl
	 * @see airport.areas.impl.AreasPackageImpl#getDropOff()
	 * @generated
	 */
	int DROP_OFF = 5;

	/**
	 * The feature id for the '<em><b>Area Corners</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_OFF__AREA_CORNERS = AREA__AREA_CORNERS;

	/**
	 * The number of structural features of the '<em>Drop Off</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_OFF_FEATURE_COUNT = AREA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Drop Off</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_OFF_OPERATION_COUNT = AREA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link airport.areas.impl.GateAreaImpl <em>Gate Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see airport.areas.impl.GateAreaImpl
	 * @see airport.areas.impl.AreasPackageImpl#getGateArea()
	 * @generated
	 */
	int GATE_AREA = 6;

	/**
	 * The feature id for the '<em><b>Area Corners</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_AREA__AREA_CORNERS = AREA__AREA_CORNERS;

	/**
	 * The feature id for the '<em><b>Gates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_AREA__GATES = AREA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gate Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_AREA_FEATURE_COUNT = AREA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gate Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_AREA_OPERATION_COUNT = AREA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link airport.areas.impl.ParkingAreaImpl <em>Parking Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see airport.areas.impl.ParkingAreaImpl
	 * @see airport.areas.impl.AreasPackageImpl#getParkingArea()
	 * @generated
	 */
	int PARKING_AREA = 7;

	/**
	 * The feature id for the '<em><b>Area Corners</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARKING_AREA__AREA_CORNERS = AREA__AREA_CORNERS;

	/**
	 * The number of structural features of the '<em>Parking Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARKING_AREA_FEATURE_COUNT = AREA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parking Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARKING_AREA_OPERATION_COUNT = AREA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link airport.areas.impl.TransportationServicesImpl <em>Transportation Services</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see airport.areas.impl.TransportationServicesImpl
	 * @see airport.areas.impl.AreasPackageImpl#getTransportationServices()
	 * @generated
	 */
	int TRANSPORTATION_SERVICES = 8;

	/**
	 * The feature id for the '<em><b>Area Corners</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_SERVICES__AREA_CORNERS = AREA__AREA_CORNERS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_SERVICES__TYPE = AREA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transportation Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_SERVICES_FEATURE_COUNT = AREA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Transportation Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_SERVICES_OPERATION_COUNT = AREA_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link airport.areas.Area <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area</em>'.
	 * @see airport.areas.Area
	 * @generated
	 */
	EClass getArea();

	/**
	 * Returns the meta object for the containment reference list '{@link airport.areas.Area#getAreaCorners <em>Area Corners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Area Corners</em>'.
	 * @see airport.areas.Area#getAreaCorners()
	 * @see #getArea()
	 * @generated
	 */
	EReference getArea_AreaCorners();

	/**
	 * Returns the meta object for class '{@link airport.areas.Arrival <em>Arrival</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arrival</em>'.
	 * @see airport.areas.Arrival
	 * @generated
	 */
	EClass getArrival();

	/**
	 * Returns the meta object for the containment reference list '{@link airport.areas.Arrival#getBaggageClaim <em>Baggage Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Baggage Claim</em>'.
	 * @see airport.areas.Arrival#getBaggageClaim()
	 * @see #getArrival()
	 * @generated
	 */
	EReference getArrival_BaggageClaim();

	/**
	 * Returns the meta object for the containment reference '{@link airport.areas.Arrival#getCustoms <em>Customs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Customs</em>'.
	 * @see airport.areas.Arrival#getCustoms()
	 * @see #getArrival()
	 * @generated
	 */
	EReference getArrival_Customs();

	/**
	 * Returns the meta object for class '{@link airport.areas.BaggageClaim <em>Baggage Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Baggage Claim</em>'.
	 * @see airport.areas.BaggageClaim
	 * @generated
	 */
	EClass getBaggageClaim();

	/**
	 * Returns the meta object for the containment reference list '{@link airport.areas.BaggageClaim#getBelts <em>Belts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Belts</em>'.
	 * @see airport.areas.BaggageClaim#getBelts()
	 * @see #getBaggageClaim()
	 * @generated
	 */
	EReference getBaggageClaim_Belts();

	/**
	 * Returns the meta object for class '{@link airport.areas.BaggageDropOff <em>Baggage Drop Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Baggage Drop Off</em>'.
	 * @see airport.areas.BaggageDropOff
	 * @generated
	 */
	EClass getBaggageDropOff();

	/**
	 * Returns the meta object for the containment reference list '{@link airport.areas.BaggageDropOff#getCounters <em>Counters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Counters</em>'.
	 * @see airport.areas.BaggageDropOff#getCounters()
	 * @see #getBaggageDropOff()
	 * @generated
	 */
	EReference getBaggageDropOff_Counters();

	/**
	 * Returns the meta object for class '{@link airport.areas.Departure <em>Departure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Departure</em>'.
	 * @see airport.areas.Departure
	 * @generated
	 */
	EClass getDeparture();

	/**
	 * Returns the meta object for the containment reference list '{@link airport.areas.Departure#getSecurity <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security</em>'.
	 * @see airport.areas.Departure#getSecurity()
	 * @see #getDeparture()
	 * @generated
	 */
	EReference getDeparture_Security();

	/**
	 * Returns the meta object for the containment reference list '{@link airport.areas.Departure#getCheckIn <em>Check In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Check In</em>'.
	 * @see airport.areas.Departure#getCheckIn()
	 * @see #getDeparture()
	 * @generated
	 */
	EReference getDeparture_CheckIn();

	/**
	 * Returns the meta object for the containment reference list '{@link airport.areas.Departure#getBaggageDropOff <em>Baggage Drop Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Baggage Drop Off</em>'.
	 * @see airport.areas.Departure#getBaggageDropOff()
	 * @see #getDeparture()
	 * @generated
	 */
	EReference getDeparture_BaggageDropOff();

	/**
	 * Returns the meta object for class '{@link airport.areas.DropOff <em>Drop Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop Off</em>'.
	 * @see airport.areas.DropOff
	 * @generated
	 */
	EClass getDropOff();

	/**
	 * Returns the meta object for class '{@link airport.areas.GateArea <em>Gate Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gate Area</em>'.
	 * @see airport.areas.GateArea
	 * @generated
	 */
	EClass getGateArea();

	/**
	 * Returns the meta object for the containment reference list '{@link airport.areas.GateArea#getGates <em>Gates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gates</em>'.
	 * @see airport.areas.GateArea#getGates()
	 * @see #getGateArea()
	 * @generated
	 */
	EReference getGateArea_Gates();

	/**
	 * Returns the meta object for class '{@link airport.areas.ParkingArea <em>Parking Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parking Area</em>'.
	 * @see airport.areas.ParkingArea
	 * @generated
	 */
	EClass getParkingArea();

	/**
	 * Returns the meta object for class '{@link airport.areas.TransportationServices <em>Transportation Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transportation Services</em>'.
	 * @see airport.areas.TransportationServices
	 * @generated
	 */
	EClass getTransportationServices();

	/**
	 * Returns the meta object for the attribute '{@link airport.areas.TransportationServices#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see airport.areas.TransportationServices#getType()
	 * @see #getTransportationServices()
	 * @generated
	 */
	EAttribute getTransportationServices_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AreasFactory getAreasFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link airport.areas.impl.AreaImpl <em>Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see airport.areas.impl.AreaImpl
		 * @see airport.areas.impl.AreasPackageImpl#getArea()
		 * @generated
		 */
		EClass AREA = eINSTANCE.getArea();

		/**
		 * The meta object literal for the '<em><b>Area Corners</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREA__AREA_CORNERS = eINSTANCE.getArea_AreaCorners();

		/**
		 * The meta object literal for the '{@link airport.areas.impl.ArrivalImpl <em>Arrival</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see airport.areas.impl.ArrivalImpl
		 * @see airport.areas.impl.AreasPackageImpl#getArrival()
		 * @generated
		 */
		EClass ARRIVAL = eINSTANCE.getArrival();

		/**
		 * The meta object literal for the '<em><b>Baggage Claim</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRIVAL__BAGGAGE_CLAIM = eINSTANCE.getArrival_BaggageClaim();

		/**
		 * The meta object literal for the '<em><b>Customs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRIVAL__CUSTOMS = eINSTANCE.getArrival_Customs();

		/**
		 * The meta object literal for the '{@link airport.areas.impl.BaggageClaimImpl <em>Baggage Claim</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see airport.areas.impl.BaggageClaimImpl
		 * @see airport.areas.impl.AreasPackageImpl#getBaggageClaim()
		 * @generated
		 */
		EClass BAGGAGE_CLAIM = eINSTANCE.getBaggageClaim();

		/**
		 * The meta object literal for the '<em><b>Belts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAGGAGE_CLAIM__BELTS = eINSTANCE.getBaggageClaim_Belts();

		/**
		 * The meta object literal for the '{@link airport.areas.impl.BaggageDropOffImpl <em>Baggage Drop Off</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see airport.areas.impl.BaggageDropOffImpl
		 * @see airport.areas.impl.AreasPackageImpl#getBaggageDropOff()
		 * @generated
		 */
		EClass BAGGAGE_DROP_OFF = eINSTANCE.getBaggageDropOff();

		/**
		 * The meta object literal for the '<em><b>Counters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAGGAGE_DROP_OFF__COUNTERS = eINSTANCE.getBaggageDropOff_Counters();

		/**
		 * The meta object literal for the '{@link airport.areas.impl.DepartureImpl <em>Departure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see airport.areas.impl.DepartureImpl
		 * @see airport.areas.impl.AreasPackageImpl#getDeparture()
		 * @generated
		 */
		EClass DEPARTURE = eINSTANCE.getDeparture();

		/**
		 * The meta object literal for the '<em><b>Security</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTURE__SECURITY = eINSTANCE.getDeparture_Security();

		/**
		 * The meta object literal for the '<em><b>Check In</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTURE__CHECK_IN = eINSTANCE.getDeparture_CheckIn();

		/**
		 * The meta object literal for the '<em><b>Baggage Drop Off</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTURE__BAGGAGE_DROP_OFF = eINSTANCE.getDeparture_BaggageDropOff();

		/**
		 * The meta object literal for the '{@link airport.areas.impl.DropOffImpl <em>Drop Off</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see airport.areas.impl.DropOffImpl
		 * @see airport.areas.impl.AreasPackageImpl#getDropOff()
		 * @generated
		 */
		EClass DROP_OFF = eINSTANCE.getDropOff();

		/**
		 * The meta object literal for the '{@link airport.areas.impl.GateAreaImpl <em>Gate Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see airport.areas.impl.GateAreaImpl
		 * @see airport.areas.impl.AreasPackageImpl#getGateArea()
		 * @generated
		 */
		EClass GATE_AREA = eINSTANCE.getGateArea();

		/**
		 * The meta object literal for the '<em><b>Gates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATE_AREA__GATES = eINSTANCE.getGateArea_Gates();

		/**
		 * The meta object literal for the '{@link airport.areas.impl.ParkingAreaImpl <em>Parking Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see airport.areas.impl.ParkingAreaImpl
		 * @see airport.areas.impl.AreasPackageImpl#getParkingArea()
		 * @generated
		 */
		EClass PARKING_AREA = eINSTANCE.getParkingArea();

		/**
		 * The meta object literal for the '{@link airport.areas.impl.TransportationServicesImpl <em>Transportation Services</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see airport.areas.impl.TransportationServicesImpl
		 * @see airport.areas.impl.AreasPackageImpl#getTransportationServices()
		 * @generated
		 */
		EClass TRANSPORTATION_SERVICES = eINSTANCE.getTransportationServices();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORTATION_SERVICES__TYPE = eINSTANCE.getTransportationServices_Type();

	}

} //AreasPackage
