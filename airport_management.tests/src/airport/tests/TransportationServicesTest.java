/**
 */
package airport.tests;

import airport.AirportFactory;
import airport.TransportationServices;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Transportation Services</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransportationServicesTest extends AreaTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TransportationServicesTest.class);
	}

	/**
	 * Constructs a new Transportation Services test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportationServicesTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Transportation Services test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TransportationServices getFixture() {
		return (TransportationServices)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AirportFactory.eINSTANCE.createTransportationServices());
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

} //TransportationServicesTest
