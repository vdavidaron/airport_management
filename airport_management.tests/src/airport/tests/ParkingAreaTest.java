/**
 */
package airport.tests;

import airport.AirportFactory;
import airport.ParkingArea;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Parking Area</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParkingAreaTest extends AreaTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ParkingAreaTest.class);
	}

	/**
	 * Constructs a new Parking Area test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParkingAreaTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Parking Area test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ParkingArea getFixture() {
		return (ParkingArea)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AirportFactory.eINSTANCE.createParkingArea());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ParkingAreaTest
