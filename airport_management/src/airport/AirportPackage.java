/**
 */
package airport;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see airport.AirportFactory
 * @model kind="package"
 * @generated
 */
public interface AirportPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "airport";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://example.org/airport";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "am";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AirportPackage eINSTANCE = airport.impl.AirportPackageImpl.init();

	/**
	 * The meta object id for the '{@link airport.impl.TerminalImpl <em>Terminal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see airport.impl.TerminalImpl
	 * @see airport.impl.AirportPackageImpl#getTerminal()
	 * @generated
	 */
	int TERMINAL = 0;

	/**
	 * The meta object id for the '{@link airport.impl.DivisionImpl <em>Division</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see airport.impl.DivisionImpl
	 * @see airport.impl.AirportPackageImpl#getDivision()
	 * @generated
	 */
	int DIVISION = 7;

	/**
	 * The meta object id for the '{@link airport.impl.AirsideImpl <em>Airside</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see airport.impl.AirsideImpl
	 * @see airport.impl.AirportPackageImpl#getAirside()
	 * @generated
	 */
	int AIRSIDE = 1;

	/**
	 * The meta object id for the '{@link airport.impl.BeltImpl <em>Belt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see airport.impl.BeltImpl
	 * @see airport.impl.AirportPackageImpl#getBelt()
	 * @generated
	 */
	int BELT = 2;

	/**
	 * The meta object id for the '{@link airport.impl.CheckInImpl <em>Check In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see airport.impl.CheckInImpl
	 * @see airport.impl.AirportPackageImpl#getCheckIn()
	 * @generated
	 */
	int CHECK_IN = 3;

	/**
	 * The meta object id for the '{@link airport.impl.CommonAreaImpl <em>Common Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see airport.impl.CommonAreaImpl
	 * @see airport.impl.AirportPackageImpl#getCommonArea()
	 * @generated
	 */
	int COMMON_AREA = 4;

	/**
	 * The meta object id for the '{@link airport.impl.CounterImpl <em>Counter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see airport.impl.CounterImpl
	 * @see airport.impl.AirportPackageImpl#getCounter()
	 * @generated
	 */
	int COUNTER = 5;

	/**
	 * The meta object id for the '{@link airport.impl.CustomsImpl <em>Customs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see airport.impl.CustomsImpl
	 * @see airport.impl.AirportPackageImpl#getCustoms()
	 * @generated
	 */
	int CUSTOMS = 6;

	/**
	 * The meta object id for the '{@link airport.impl.ElevatorImpl <em>Elevator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see airport.impl.ElevatorImpl
	 * @see airport.impl.AirportPackageImpl#getElevator()
	 * @generated
	 */
	int ELEVATOR = 8;

	/**
	 * The meta object id for the '{@link airport.impl.FlightImpl <em>Flight</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see airport.impl.FlightImpl
	 * @see airport.impl.AirportPackageImpl#getFlight()
	 * @generated
	 */
	int FLIGHT = 9;

	/**
	 * The meta object id for the '{@link airport.impl.FloorImpl <em>Floor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see airport.impl.FloorImpl
	 * @see airport.impl.AirportPackageImpl#getFloor()
	 * @generated
	 */
	int FLOOR = 10;

	/**
	 * The meta object id for the '{@link airport.impl.namedElementImpl <em>named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see airport.impl.namedElementImpl
	 * @see airport.impl.AirportPackageImpl#getnamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Dropoff</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__DROPOFF = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Floors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__FLOORS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Airside</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__AIRSIDE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Landside</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__LANDSIDE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Flights</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__FLIGHTS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parking Areas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__PARKING_AREAS = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Transportation Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__TRANSPORTATION_SERVICES = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Common Areas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__COMMON_AREAS = 0;

	/**
	 * The feature id for the '<em><b>Floor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__FLOOR = 1;

	/**
	 * The number of structural features of the '<em>Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Common Areas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRSIDE__COMMON_AREAS = DIVISION__COMMON_AREAS;

	/**
	 * The feature id for the '<em><b>Floor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRSIDE__FLOOR = DIVISION__FLOOR;

	/**
	 * The feature id for the '<em><b>Gate Area</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRSIDE__GATE_AREA = DIVISION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Airside</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRSIDE_FEATURE_COUNT = DIVISION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Airside</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRSIDE_OPERATION_COUNT = DIVISION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Flight</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELT__FLIGHT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Belt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Belt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_IN__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Counters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_IN__COUNTERS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Check In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_IN_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Check In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_IN_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_AREA__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_AREA__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Common Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_AREA_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Common Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_AREA_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Flight</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER__FLIGHT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Counter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Counter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMS__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Customs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMS_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Customs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMS_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Floors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR__CONNECTED_FLOORS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Elevator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Elevator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Flight Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT__FLIGHT_NUMBER = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT__TIME = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT__CITY = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is International</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT__IS_INTERNATIONAL = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Flight</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Flight</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Floor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Floor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link airport.impl.GateImpl <em>Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see airport.impl.GateImpl
	 * @see airport.impl.AirportPackageImpl#getGate()
	 * @generated
	 */
	int GATE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Boarding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__BOARDING = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Flight</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__FLIGHT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link airport.impl.LandsideImpl <em>Landside</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see airport.impl.LandsideImpl
	 * @see airport.impl.AirportPackageImpl#getLandside()
	 * @generated
	 */
	int LANDSIDE = 12;

	/**
	 * The feature id for the '<em><b>Common Areas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDSIDE__COMMON_AREAS = DIVISION__COMMON_AREAS;

	/**
	 * The feature id for the '<em><b>Floor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDSIDE__FLOOR = DIVISION__FLOOR;

	/**
	 * The feature id for the '<em><b>Departure Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDSIDE__DEPARTURE_AREA = DIVISION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arrival Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDSIDE__ARRIVAL_AREA = DIVISION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Landside</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDSIDE_FEATURE_COUNT = DIVISION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Landside</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDSIDE_OPERATION_COUNT = DIVISION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link airport.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see airport.impl.PointImpl
	 * @see airport.impl.AirportPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 13;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__Y = 1;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link airport.impl.SecurityCheckImpl <em>Security Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see airport.impl.SecurityCheckImpl
	 * @see airport.impl.AirportPackageImpl#getSecurityCheck()
	 * @generated
	 */
	int SECURITY_CHECK = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CHECK__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Security Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CHECK_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Security Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CHECK_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link airport.impl.AreaImpl <em>Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see airport.impl.AreaImpl
	 * @see airport.impl.AirportPackageImpl#getArea()
	 * @generated
	 */
	int AREA = 15;

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
	 * The meta object id for the '{@link airport.impl.ArrivalImpl <em>Arrival</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see airport.impl.ArrivalImpl
	 * @see airport.impl.AirportPackageImpl#getArrival()
	 * @generated
	 */
	int ARRIVAL = 16;

	/**
	 * The feature id for the '<em><b>Area Corners</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL__AREA_CORNERS = AREA__AREA_CORNERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL__NAME = AREA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Baggage Claim</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL__BAGGAGE_CLAIM = AREA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Customs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL__CUSTOMS = AREA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Arrival</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_FEATURE_COUNT = AREA_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Arrival</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_OPERATION_COUNT = AREA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link airport.impl.BaggageClaimImpl <em>Baggage Claim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see airport.impl.BaggageClaimImpl
	 * @see airport.impl.AirportPackageImpl#getBaggageClaim()
	 * @generated
	 */
	int BAGGAGE_CLAIM = 17;

	/**
	 * The feature id for the '<em><b>Area Corners</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAGGAGE_CLAIM__AREA_CORNERS = AREA__AREA_CORNERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAGGAGE_CLAIM__NAME = AREA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Belts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAGGAGE_CLAIM__BELTS = AREA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Baggage Claim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAGGAGE_CLAIM_FEATURE_COUNT = AREA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Baggage Claim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAGGAGE_CLAIM_OPERATION_COUNT = AREA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link airport.impl.BaggageDropOffImpl <em>Baggage Drop Off</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see airport.impl.BaggageDropOffImpl
	 * @see airport.impl.AirportPackageImpl#getBaggageDropOff()
	 * @generated
	 */
	int BAGGAGE_DROP_OFF = 18;

	/**
	 * The feature id for the '<em><b>Area Corners</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAGGAGE_DROP_OFF__AREA_CORNERS = AREA__AREA_CORNERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAGGAGE_DROP_OFF__NAME = AREA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Counters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAGGAGE_DROP_OFF__COUNTERS = AREA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Baggage Drop Off</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAGGAGE_DROP_OFF_FEATURE_COUNT = AREA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Baggage Drop Off</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAGGAGE_DROP_OFF_OPERATION_COUNT = AREA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link airport.impl.DepartureImpl <em>Departure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see airport.impl.DepartureImpl
	 * @see airport.impl.AirportPackageImpl#getDeparture()
	 * @generated
	 */
	int DEPARTURE = 19;

	/**
	 * The feature id for the '<em><b>Area Corners</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTURE__AREA_CORNERS = AREA__AREA_CORNERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTURE__NAME = AREA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Security</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTURE__SECURITY = AREA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Check In</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTURE__CHECK_IN = AREA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Baggage Drop Off</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTURE__BAGGAGE_DROP_OFF = AREA_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Departure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTURE_FEATURE_COUNT = AREA_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Departure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTURE_OPERATION_COUNT = AREA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link airport.impl.DropOffImpl <em>Drop Off</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see airport.impl.DropOffImpl
	 * @see airport.impl.AirportPackageImpl#getDropOff()
	 * @generated
	 */
	int DROP_OFF = 20;

	/**
	 * The feature id for the '<em><b>Area Corners</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_OFF__AREA_CORNERS = AREA__AREA_CORNERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_OFF__NAME = AREA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Drop Off</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_OFF_FEATURE_COUNT = AREA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Drop Off</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_OFF_OPERATION_COUNT = AREA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link airport.impl.GateAreaImpl <em>Gate Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see airport.impl.GateAreaImpl
	 * @see airport.impl.AirportPackageImpl#getGateArea()
	 * @generated
	 */
	int GATE_AREA = 21;

	/**
	 * The feature id for the '<em><b>Area Corners</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_AREA__AREA_CORNERS = AREA__AREA_CORNERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_AREA__NAME = AREA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_AREA__GATES = AREA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Total Gates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_AREA__TOTAL_GATES = AREA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gate Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_AREA_FEATURE_COUNT = AREA_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Calculate Total Gates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_AREA___CALCULATE_TOTAL_GATES = AREA_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Find Gate By Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_AREA___FIND_GATE_BY_NAME__STRING = AREA_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gate Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_AREA_OPERATION_COUNT = AREA_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link airport.impl.ParkingAreaImpl <em>Parking Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see airport.impl.ParkingAreaImpl
	 * @see airport.impl.AirportPackageImpl#getParkingArea()
	 * @generated
	 */
	int PARKING_AREA = 22;

	/**
	 * The feature id for the '<em><b>Area Corners</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARKING_AREA__AREA_CORNERS = AREA__AREA_CORNERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARKING_AREA__NAME = AREA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parking Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARKING_AREA_FEATURE_COUNT = AREA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parking Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARKING_AREA_OPERATION_COUNT = AREA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link airport.impl.TransportationServicesImpl <em>Transportation Services</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see airport.impl.TransportationServicesImpl
	 * @see airport.impl.AirportPackageImpl#getTransportationServices()
	 * @generated
	 */
	int TRANSPORTATION_SERVICES = 23;

	/**
	 * The feature id for the '<em><b>Area Corners</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_SERVICES__AREA_CORNERS = AREA__AREA_CORNERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_SERVICES__NAME = AREA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_SERVICES__TYPE = AREA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transportation Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_SERVICES_FEATURE_COUNT = AREA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Transportation Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_SERVICES_OPERATION_COUNT = AREA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link airport.CommonAreaTypes <em>Common Area Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see airport.CommonAreaTypes
	 * @see airport.impl.AirportPackageImpl#getCommonAreaTypes()
	 * @generated
	 */
	int COMMON_AREA_TYPES = 25;

	/**
	 * The meta object id for the '{@link airport.FlightType <em>Flight Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see airport.FlightType
	 * @see airport.impl.AirportPackageImpl#getFlightType()
	 * @generated
	 */
	int FLIGHT_TYPE = 26;

	/**
	 * The meta object id for the '{@link airport.TransportationTypes <em>Transportation Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see airport.TransportationTypes
	 * @see airport.impl.AirportPackageImpl#getTransportationTypes()
	 * @generated
	 */
	int TRANSPORTATION_TYPES = 27;


	/**
	 * Returns the meta object for class '{@link airport.Terminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal</em>'.
	 * @see airport.Terminal
	 * @generated
	 */
	EClass getTerminal();

	/**
	 * Returns the meta object for the containment reference list '{@link airport.Terminal#getDropoff <em>Dropoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dropoff</em>'.
	 * @see airport.Terminal#getDropoff()
	 * @see #getTerminal()
	 * @generated
	 */
	EReference getTerminal_Dropoff();

	/**
	 * Returns the meta object for the containment reference list '{@link airport.Terminal#getFloors <em>Floors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Floors</em>'.
	 * @see airport.Terminal#getFloors()
	 * @see #getTerminal()
	 * @generated
	 */
	EReference getTerminal_Floors();

	/**
	 * Returns the meta object for the containment reference list '{@link airport.Terminal#getAirside <em>Airside</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Airside</em>'.
	 * @see airport.Terminal#getAirside()
	 * @see #getTerminal()
	 * @generated
	 */
	EReference getTerminal_Airside();

	/**
	 * Returns the meta object for the containment reference list '{@link airport.Terminal#getLandside <em>Landside</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Landside</em>'.
	 * @see airport.Terminal#getLandside()
	 * @see #getTerminal()
	 * @generated
	 */
	EReference getTerminal_Landside();

	/**
	 * Returns the meta object for the containment reference list '{@link airport.Terminal#getFlights <em>Flights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flights</em>'.
	 * @see airport.Terminal#getFlights()
	 * @see #getTerminal()
	 * @generated
	 */
	EReference getTerminal_Flights();

	/**
	 * Returns the meta object for the containment reference list '{@link airport.Terminal#getParkingAreas <em>Parking Areas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parking Areas</em>'.
	 * @see airport.Terminal#getParkingAreas()
	 * @see #getTerminal()
	 * @generated
	 */
	EReference getTerminal_ParkingAreas();

	/**
	 * Returns the meta object for the containment reference list '{@link airport.Terminal#getTransportationServices <em>Transportation Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transportation Services</em>'.
	 * @see airport.Terminal#getTransportationServices()
	 * @see #getTerminal()
	 * @generated
	 */
	EReference getTerminal_TransportationServices();

	/**
	 * Returns the meta object for class '{@link airport.Airside <em>Airside</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Airside</em>'.
	 * @see airport.Airside
	 * @generated
	 */
	EClass getAirside();

	/**
	 * Returns the meta object for the containment reference list '{@link airport.Airside#getGateArea <em>Gate Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gate Area</em>'.
	 * @see airport.Airside#getGateArea()
	 * @see #getAirside()
	 * @generated
	 */
	EReference getAirside_GateArea();

	/**
	 * Returns the meta object for class '{@link airport.Belt <em>Belt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Belt</em>'.
	 * @see airport.Belt
	 * @generated
	 */
	EClass getBelt();

	/**
	 * Returns the meta object for the reference '{@link airport.Belt#getFlight <em>Flight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Flight</em>'.
	 * @see airport.Belt#getFlight()
	 * @see #getBelt()
	 * @generated
	 */
	EReference getBelt_Flight();

	/**
	 * Returns the meta object for class '{@link airport.CheckIn <em>Check In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check In</em>'.
	 * @see airport.CheckIn
	 * @generated
	 */
	EClass getCheckIn();

	/**
	 * Returns the meta object for the containment reference list '{@link airport.CheckIn#getCounters <em>Counters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Counters</em>'.
	 * @see airport.CheckIn#getCounters()
	 * @see #getCheckIn()
	 * @generated
	 */
	EReference getCheckIn_Counters();

	/**
	 * Returns the meta object for class '{@link airport.CommonArea <em>Common Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Common Area</em>'.
	 * @see airport.CommonArea
	 * @generated
	 */
	EClass getCommonArea();

	/**
	 * Returns the meta object for the attribute '{@link airport.CommonArea#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see airport.CommonArea#getType()
	 * @see #getCommonArea()
	 * @generated
	 */
	EAttribute getCommonArea_Type();

	/**
	 * Returns the meta object for class '{@link airport.Counter <em>Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Counter</em>'.
	 * @see airport.Counter
	 * @generated
	 */
	EClass getCounter();

	/**
	 * Returns the meta object for the reference '{@link airport.Counter#getFlight <em>Flight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Flight</em>'.
	 * @see airport.Counter#getFlight()
	 * @see #getCounter()
	 * @generated
	 */
	EReference getCounter_Flight();

	/**
	 * Returns the meta object for class '{@link airport.Customs <em>Customs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customs</em>'.
	 * @see airport.Customs
	 * @generated
	 */
	EClass getCustoms();

	/**
	 * Returns the meta object for class '{@link airport.Division <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Division</em>'.
	 * @see airport.Division
	 * @generated
	 */
	EClass getDivision();

	/**
	 * Returns the meta object for the containment reference list '{@link airport.Division#getCommonAreas <em>Common Areas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Common Areas</em>'.
	 * @see airport.Division#getCommonAreas()
	 * @see #getDivision()
	 * @generated
	 */
	EReference getDivision_CommonAreas();

	/**
	 * Returns the meta object for the containment reference '{@link airport.Division#getFloor <em>Floor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Floor</em>'.
	 * @see airport.Division#getFloor()
	 * @see #getDivision()
	 * @generated
	 */
	EReference getDivision_Floor();

	/**
	 * Returns the meta object for class '{@link airport.Elevator <em>Elevator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elevator</em>'.
	 * @see airport.Elevator
	 * @generated
	 */
	EClass getElevator();

	/**
	 * Returns the meta object for the containment reference list '{@link airport.Elevator#getConnectedFloors <em>Connected Floors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connected Floors</em>'.
	 * @see airport.Elevator#getConnectedFloors()
	 * @see #getElevator()
	 * @generated
	 */
	EReference getElevator_ConnectedFloors();

	/**
	 * Returns the meta object for class '{@link airport.Flight <em>Flight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flight</em>'.
	 * @see airport.Flight
	 * @generated
	 */
	EClass getFlight();

	/**
	 * Returns the meta object for the attribute '{@link airport.Flight#getFlightNumber <em>Flight Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flight Number</em>'.
	 * @see airport.Flight#getFlightNumber()
	 * @see #getFlight()
	 * @generated
	 */
	EAttribute getFlight_FlightNumber();

	/**
	 * Returns the meta object for the attribute '{@link airport.Flight#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see airport.Flight#getTime()
	 * @see #getFlight()
	 * @generated
	 */
	EAttribute getFlight_Time();

	/**
	 * Returns the meta object for the attribute '{@link airport.Flight#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see airport.Flight#getType()
	 * @see #getFlight()
	 * @generated
	 */
	EAttribute getFlight_Type();

	/**
	 * Returns the meta object for the attribute '{@link airport.Flight#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see airport.Flight#getCity()
	 * @see #getFlight()
	 * @generated
	 */
	EAttribute getFlight_City();

	/**
	 * Returns the meta object for the attribute '{@link airport.Flight#isIsInternational <em>Is International</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is International</em>'.
	 * @see airport.Flight#isIsInternational()
	 * @see #getFlight()
	 * @generated
	 */
	EAttribute getFlight_IsInternational();

	/**
	 * Returns the meta object for class '{@link airport.Floor <em>Floor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Floor</em>'.
	 * @see airport.Floor
	 * @generated
	 */
	EClass getFloor();

	/**
	 * Returns the meta object for class '{@link airport.Gate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gate</em>'.
	 * @see airport.Gate
	 * @generated
	 */
	EClass getGate();

	/**
	 * Returns the meta object for the attribute '{@link airport.Gate#isBoarding <em>Boarding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boarding</em>'.
	 * @see airport.Gate#isBoarding()
	 * @see #getGate()
	 * @generated
	 */
	EAttribute getGate_Boarding();

	/**
	 * Returns the meta object for the reference '{@link airport.Gate#getFlight <em>Flight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Flight</em>'.
	 * @see airport.Gate#getFlight()
	 * @see #getGate()
	 * @generated
	 */
	EReference getGate_Flight();

	/**
	 * Returns the meta object for class '{@link airport.Landside <em>Landside</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Landside</em>'.
	 * @see airport.Landside
	 * @generated
	 */
	EClass getLandside();

	/**
	 * Returns the meta object for the containment reference '{@link airport.Landside#getDepartureArea <em>Departure Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Departure Area</em>'.
	 * @see airport.Landside#getDepartureArea()
	 * @see #getLandside()
	 * @generated
	 */
	EReference getLandside_DepartureArea();

	/**
	 * Returns the meta object for the containment reference '{@link airport.Landside#getArrivalArea <em>Arrival Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arrival Area</em>'.
	 * @see airport.Landside#getArrivalArea()
	 * @see #getLandside()
	 * @generated
	 */
	EReference getLandside_ArrivalArea();

	/**
	 * Returns the meta object for class '{@link airport.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see airport.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the attribute '{@link airport.Point#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see airport.Point#getX()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_X();

	/**
	 * Returns the meta object for the attribute '{@link airport.Point#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see airport.Point#getY()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Y();

	/**
	 * Returns the meta object for class '{@link airport.SecurityCheck <em>Security Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Check</em>'.
	 * @see airport.SecurityCheck
	 * @generated
	 */
	EClass getSecurityCheck();

	/**
	 * Returns the meta object for class '{@link airport.Area <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area</em>'.
	 * @see airport.Area
	 * @generated
	 */
	EClass getArea();

	/**
	 * Returns the meta object for the containment reference list '{@link airport.Area#getAreaCorners <em>Area Corners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Area Corners</em>'.
	 * @see airport.Area#getAreaCorners()
	 * @see #getArea()
	 * @generated
	 */
	EReference getArea_AreaCorners();

	/**
	 * Returns the meta object for class '{@link airport.Arrival <em>Arrival</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arrival</em>'.
	 * @see airport.Arrival
	 * @generated
	 */
	EClass getArrival();

	/**
	 * Returns the meta object for the containment reference list '{@link airport.Arrival#getBaggageClaim <em>Baggage Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Baggage Claim</em>'.
	 * @see airport.Arrival#getBaggageClaim()
	 * @see #getArrival()
	 * @generated
	 */
	EReference getArrival_BaggageClaim();

	/**
	 * Returns the meta object for the containment reference '{@link airport.Arrival#getCustoms <em>Customs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Customs</em>'.
	 * @see airport.Arrival#getCustoms()
	 * @see #getArrival()
	 * @generated
	 */
	EReference getArrival_Customs();

	/**
	 * Returns the meta object for class '{@link airport.BaggageClaim <em>Baggage Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Baggage Claim</em>'.
	 * @see airport.BaggageClaim
	 * @generated
	 */
	EClass getBaggageClaim();

	/**
	 * Returns the meta object for the containment reference list '{@link airport.BaggageClaim#getBelts <em>Belts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Belts</em>'.
	 * @see airport.BaggageClaim#getBelts()
	 * @see #getBaggageClaim()
	 * @generated
	 */
	EReference getBaggageClaim_Belts();

	/**
	 * Returns the meta object for class '{@link airport.BaggageDropOff <em>Baggage Drop Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Baggage Drop Off</em>'.
	 * @see airport.BaggageDropOff
	 * @generated
	 */
	EClass getBaggageDropOff();

	/**
	 * Returns the meta object for the containment reference list '{@link airport.BaggageDropOff#getCounters <em>Counters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Counters</em>'.
	 * @see airport.BaggageDropOff#getCounters()
	 * @see #getBaggageDropOff()
	 * @generated
	 */
	EReference getBaggageDropOff_Counters();

	/**
	 * Returns the meta object for class '{@link airport.Departure <em>Departure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Departure</em>'.
	 * @see airport.Departure
	 * @generated
	 */
	EClass getDeparture();

	/**
	 * Returns the meta object for the containment reference list '{@link airport.Departure#getSecurity <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security</em>'.
	 * @see airport.Departure#getSecurity()
	 * @see #getDeparture()
	 * @generated
	 */
	EReference getDeparture_Security();

	/**
	 * Returns the meta object for the containment reference list '{@link airport.Departure#getCheckIn <em>Check In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Check In</em>'.
	 * @see airport.Departure#getCheckIn()
	 * @see #getDeparture()
	 * @generated
	 */
	EReference getDeparture_CheckIn();

	/**
	 * Returns the meta object for the containment reference list '{@link airport.Departure#getBaggageDropOff <em>Baggage Drop Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Baggage Drop Off</em>'.
	 * @see airport.Departure#getBaggageDropOff()
	 * @see #getDeparture()
	 * @generated
	 */
	EReference getDeparture_BaggageDropOff();

	/**
	 * Returns the meta object for class '{@link airport.DropOff <em>Drop Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop Off</em>'.
	 * @see airport.DropOff
	 * @generated
	 */
	EClass getDropOff();

	/**
	 * Returns the meta object for class '{@link airport.GateArea <em>Gate Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gate Area</em>'.
	 * @see airport.GateArea
	 * @generated
	 */
	EClass getGateArea();

	/**
	 * Returns the meta object for the containment reference list '{@link airport.GateArea#getGates <em>Gates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gates</em>'.
	 * @see airport.GateArea#getGates()
	 * @see #getGateArea()
	 * @generated
	 */
	EReference getGateArea_Gates();

	/**
	 * Returns the meta object for the attribute '{@link airport.GateArea#getTotalGates <em>Total Gates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Gates</em>'.
	 * @see airport.GateArea#getTotalGates()
	 * @see #getGateArea()
	 * @generated
	 */
	EAttribute getGateArea_TotalGates();

	/**
	 * Returns the meta object for the '{@link airport.GateArea#calculateTotalGates() <em>Calculate Total Gates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Total Gates</em>' operation.
	 * @see airport.GateArea#calculateTotalGates()
	 * @generated
	 */
	EOperation getGateArea__CalculateTotalGates();

	/**
	 * Returns the meta object for the '{@link airport.GateArea#findGateByName(java.lang.String) <em>Find Gate By Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Gate By Name</em>' operation.
	 * @see airport.GateArea#findGateByName(java.lang.String)
	 * @generated
	 */
	EOperation getGateArea__FindGateByName__String();

	/**
	 * Returns the meta object for class '{@link airport.ParkingArea <em>Parking Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parking Area</em>'.
	 * @see airport.ParkingArea
	 * @generated
	 */
	EClass getParkingArea();

	/**
	 * Returns the meta object for class '{@link airport.TransportationServices <em>Transportation Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transportation Services</em>'.
	 * @see airport.TransportationServices
	 * @generated
	 */
	EClass getTransportationServices();

	/**
	 * Returns the meta object for the attribute '{@link airport.TransportationServices#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see airport.TransportationServices#getType()
	 * @see #getTransportationServices()
	 * @generated
	 */
	EAttribute getTransportationServices_Type();

	/**
	 * Returns the meta object for class '{@link airport.namedElement <em>named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>named Element</em>'.
	 * @see airport.namedElement
	 * @generated
	 */
	EClass getnamedElement();

	/**
	 * Returns the meta object for the attribute '{@link airport.namedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see airport.namedElement#getName()
	 * @see #getnamedElement()
	 * @generated
	 */
	EAttribute getnamedElement_Name();

	/**
	 * Returns the meta object for enum '{@link airport.CommonAreaTypes <em>Common Area Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Common Area Types</em>'.
	 * @see airport.CommonAreaTypes
	 * @generated
	 */
	EEnum getCommonAreaTypes();

	/**
	 * Returns the meta object for enum '{@link airport.FlightType <em>Flight Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Flight Type</em>'.
	 * @see airport.FlightType
	 * @generated
	 */
	EEnum getFlightType();

	/**
	 * Returns the meta object for enum '{@link airport.TransportationTypes <em>Transportation Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transportation Types</em>'.
	 * @see airport.TransportationTypes
	 * @generated
	 */
	EEnum getTransportationTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AirportFactory getAirportFactory();

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
		 * The meta object literal for the '{@link airport.impl.TerminalImpl <em>Terminal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see airport.impl.TerminalImpl
		 * @see airport.impl.AirportPackageImpl#getTerminal()
		 * @generated
		 */
		EClass TERMINAL = eINSTANCE.getTerminal();

		/**
		 * The meta object literal for the '<em><b>Dropoff</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINAL__DROPOFF = eINSTANCE.getTerminal_Dropoff();

		/**
		 * The meta object literal for the '<em><b>Floors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINAL__FLOORS = eINSTANCE.getTerminal_Floors();

		/**
		 * The meta object literal for the '<em><b>Airside</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINAL__AIRSIDE = eINSTANCE.getTerminal_Airside();

		/**
		 * The meta object literal for the '<em><b>Landside</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINAL__LANDSIDE = eINSTANCE.getTerminal_Landside();

		/**
		 * The meta object literal for the '<em><b>Flights</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINAL__FLIGHTS = eINSTANCE.getTerminal_Flights();

		/**
		 * The meta object literal for the '<em><b>Parking Areas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINAL__PARKING_AREAS = eINSTANCE.getTerminal_ParkingAreas();

		/**
		 * The meta object literal for the '<em><b>Transportation Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINAL__TRANSPORTATION_SERVICES = eINSTANCE.getTerminal_TransportationServices();

		/**
		 * The meta object literal for the '{@link airport.impl.AirsideImpl <em>Airside</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see airport.impl.AirsideImpl
		 * @see airport.impl.AirportPackageImpl#getAirside()
		 * @generated
		 */
		EClass AIRSIDE = eINSTANCE.getAirside();

		/**
		 * The meta object literal for the '<em><b>Gate Area</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AIRSIDE__GATE_AREA = eINSTANCE.getAirside_GateArea();

		/**
		 * The meta object literal for the '{@link airport.impl.BeltImpl <em>Belt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see airport.impl.BeltImpl
		 * @see airport.impl.AirportPackageImpl#getBelt()
		 * @generated
		 */
		EClass BELT = eINSTANCE.getBelt();

		/**
		 * The meta object literal for the '<em><b>Flight</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BELT__FLIGHT = eINSTANCE.getBelt_Flight();

		/**
		 * The meta object literal for the '{@link airport.impl.CheckInImpl <em>Check In</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see airport.impl.CheckInImpl
		 * @see airport.impl.AirportPackageImpl#getCheckIn()
		 * @generated
		 */
		EClass CHECK_IN = eINSTANCE.getCheckIn();

		/**
		 * The meta object literal for the '<em><b>Counters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_IN__COUNTERS = eINSTANCE.getCheckIn_Counters();

		/**
		 * The meta object literal for the '{@link airport.impl.CommonAreaImpl <em>Common Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see airport.impl.CommonAreaImpl
		 * @see airport.impl.AirportPackageImpl#getCommonArea()
		 * @generated
		 */
		EClass COMMON_AREA = eINSTANCE.getCommonArea();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_AREA__TYPE = eINSTANCE.getCommonArea_Type();

		/**
		 * The meta object literal for the '{@link airport.impl.CounterImpl <em>Counter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see airport.impl.CounterImpl
		 * @see airport.impl.AirportPackageImpl#getCounter()
		 * @generated
		 */
		EClass COUNTER = eINSTANCE.getCounter();

		/**
		 * The meta object literal for the '<em><b>Flight</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTER__FLIGHT = eINSTANCE.getCounter_Flight();

		/**
		 * The meta object literal for the '{@link airport.impl.CustomsImpl <em>Customs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see airport.impl.CustomsImpl
		 * @see airport.impl.AirportPackageImpl#getCustoms()
		 * @generated
		 */
		EClass CUSTOMS = eINSTANCE.getCustoms();

		/**
		 * The meta object literal for the '{@link airport.impl.DivisionImpl <em>Division</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see airport.impl.DivisionImpl
		 * @see airport.impl.AirportPackageImpl#getDivision()
		 * @generated
		 */
		EClass DIVISION = eINSTANCE.getDivision();

		/**
		 * The meta object literal for the '<em><b>Common Areas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIVISION__COMMON_AREAS = eINSTANCE.getDivision_CommonAreas();

		/**
		 * The meta object literal for the '<em><b>Floor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIVISION__FLOOR = eINSTANCE.getDivision_Floor();

		/**
		 * The meta object literal for the '{@link airport.impl.ElevatorImpl <em>Elevator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see airport.impl.ElevatorImpl
		 * @see airport.impl.AirportPackageImpl#getElevator()
		 * @generated
		 */
		EClass ELEVATOR = eINSTANCE.getElevator();

		/**
		 * The meta object literal for the '<em><b>Connected Floors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEVATOR__CONNECTED_FLOORS = eINSTANCE.getElevator_ConnectedFloors();

		/**
		 * The meta object literal for the '{@link airport.impl.FlightImpl <em>Flight</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see airport.impl.FlightImpl
		 * @see airport.impl.AirportPackageImpl#getFlight()
		 * @generated
		 */
		EClass FLIGHT = eINSTANCE.getFlight();

		/**
		 * The meta object literal for the '<em><b>Flight Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT__FLIGHT_NUMBER = eINSTANCE.getFlight_FlightNumber();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT__TIME = eINSTANCE.getFlight_Time();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT__TYPE = eINSTANCE.getFlight_Type();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT__CITY = eINSTANCE.getFlight_City();

		/**
		 * The meta object literal for the '<em><b>Is International</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT__IS_INTERNATIONAL = eINSTANCE.getFlight_IsInternational();

		/**
		 * The meta object literal for the '{@link airport.impl.FloorImpl <em>Floor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see airport.impl.FloorImpl
		 * @see airport.impl.AirportPackageImpl#getFloor()
		 * @generated
		 */
		EClass FLOOR = eINSTANCE.getFloor();

		/**
		 * The meta object literal for the '{@link airport.impl.GateImpl <em>Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see airport.impl.GateImpl
		 * @see airport.impl.AirportPackageImpl#getGate()
		 * @generated
		 */
		EClass GATE = eINSTANCE.getGate();

		/**
		 * The meta object literal for the '<em><b>Boarding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATE__BOARDING = eINSTANCE.getGate_Boarding();

		/**
		 * The meta object literal for the '<em><b>Flight</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATE__FLIGHT = eINSTANCE.getGate_Flight();

		/**
		 * The meta object literal for the '{@link airport.impl.LandsideImpl <em>Landside</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see airport.impl.LandsideImpl
		 * @see airport.impl.AirportPackageImpl#getLandside()
		 * @generated
		 */
		EClass LANDSIDE = eINSTANCE.getLandside();

		/**
		 * The meta object literal for the '<em><b>Departure Area</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANDSIDE__DEPARTURE_AREA = eINSTANCE.getLandside_DepartureArea();

		/**
		 * The meta object literal for the '<em><b>Arrival Area</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANDSIDE__ARRIVAL_AREA = eINSTANCE.getLandside_ArrivalArea();

		/**
		 * The meta object literal for the '{@link airport.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see airport.impl.PointImpl
		 * @see airport.impl.AirportPackageImpl#getPoint()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__X = eINSTANCE.getPoint_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__Y = eINSTANCE.getPoint_Y();

		/**
		 * The meta object literal for the '{@link airport.impl.SecurityCheckImpl <em>Security Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see airport.impl.SecurityCheckImpl
		 * @see airport.impl.AirportPackageImpl#getSecurityCheck()
		 * @generated
		 */
		EClass SECURITY_CHECK = eINSTANCE.getSecurityCheck();

		/**
		 * The meta object literal for the '{@link airport.impl.AreaImpl <em>Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see airport.impl.AreaImpl
		 * @see airport.impl.AirportPackageImpl#getArea()
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
		 * The meta object literal for the '{@link airport.impl.ArrivalImpl <em>Arrival</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see airport.impl.ArrivalImpl
		 * @see airport.impl.AirportPackageImpl#getArrival()
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
		 * The meta object literal for the '{@link airport.impl.BaggageClaimImpl <em>Baggage Claim</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see airport.impl.BaggageClaimImpl
		 * @see airport.impl.AirportPackageImpl#getBaggageClaim()
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
		 * The meta object literal for the '{@link airport.impl.BaggageDropOffImpl <em>Baggage Drop Off</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see airport.impl.BaggageDropOffImpl
		 * @see airport.impl.AirportPackageImpl#getBaggageDropOff()
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
		 * The meta object literal for the '{@link airport.impl.DepartureImpl <em>Departure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see airport.impl.DepartureImpl
		 * @see airport.impl.AirportPackageImpl#getDeparture()
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
		 * The meta object literal for the '{@link airport.impl.DropOffImpl <em>Drop Off</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see airport.impl.DropOffImpl
		 * @see airport.impl.AirportPackageImpl#getDropOff()
		 * @generated
		 */
		EClass DROP_OFF = eINSTANCE.getDropOff();

		/**
		 * The meta object literal for the '{@link airport.impl.GateAreaImpl <em>Gate Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see airport.impl.GateAreaImpl
		 * @see airport.impl.AirportPackageImpl#getGateArea()
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
		 * The meta object literal for the '<em><b>Total Gates</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATE_AREA__TOTAL_GATES = eINSTANCE.getGateArea_TotalGates();

		/**
		 * The meta object literal for the '<em><b>Calculate Total Gates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GATE_AREA___CALCULATE_TOTAL_GATES = eINSTANCE.getGateArea__CalculateTotalGates();

		/**
		 * The meta object literal for the '<em><b>Find Gate By Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GATE_AREA___FIND_GATE_BY_NAME__STRING = eINSTANCE.getGateArea__FindGateByName__String();

		/**
		 * The meta object literal for the '{@link airport.impl.ParkingAreaImpl <em>Parking Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see airport.impl.ParkingAreaImpl
		 * @see airport.impl.AirportPackageImpl#getParkingArea()
		 * @generated
		 */
		EClass PARKING_AREA = eINSTANCE.getParkingArea();

		/**
		 * The meta object literal for the '{@link airport.impl.TransportationServicesImpl <em>Transportation Services</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see airport.impl.TransportationServicesImpl
		 * @see airport.impl.AirportPackageImpl#getTransportationServices()
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

		/**
		 * The meta object literal for the '{@link airport.impl.namedElementImpl <em>named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see airport.impl.namedElementImpl
		 * @see airport.impl.AirportPackageImpl#getnamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getnamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getnamedElement_Name();

		/**
		 * The meta object literal for the '{@link airport.CommonAreaTypes <em>Common Area Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see airport.CommonAreaTypes
		 * @see airport.impl.AirportPackageImpl#getCommonAreaTypes()
		 * @generated
		 */
		EEnum COMMON_AREA_TYPES = eINSTANCE.getCommonAreaTypes();

		/**
		 * The meta object literal for the '{@link airport.FlightType <em>Flight Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see airport.FlightType
		 * @see airport.impl.AirportPackageImpl#getFlightType()
		 * @generated
		 */
		EEnum FLIGHT_TYPE = eINSTANCE.getFlightType();

		/**
		 * The meta object literal for the '{@link airport.TransportationTypes <em>Transportation Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see airport.TransportationTypes
		 * @see airport.impl.AirportPackageImpl#getTransportationTypes()
		 * @generated
		 */
		EEnum TRANSPORTATION_TYPES = eINSTANCE.getTransportationTypes();

	}

} //AirportPackage
