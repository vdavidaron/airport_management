/**
 */
package airport.areas.tests;

import airport.areas.AreasFactory;
import airport.areas.BaggageDropOff;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Baggage Drop Off</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BaggageDropOffTest extends AreaTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BaggageDropOffTest.class);
	}

	/**
	 * Constructs a new Baggage Drop Off test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaggageDropOffTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Baggage Drop Off test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BaggageDropOff getFixture() {
		return (BaggageDropOff)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AreasFactory.eINSTANCE.createBaggageDropOff());
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

} //BaggageDropOffTest
