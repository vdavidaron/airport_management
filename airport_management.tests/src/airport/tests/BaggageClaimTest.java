/**
 */
package airport.tests;

import airport.AirportFactory;
import airport.BaggageClaim;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Baggage Claim</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BaggageClaimTest extends AreaTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BaggageClaimTest.class);
	}

	/**
	 * Constructs a new Baggage Claim test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaggageClaimTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Baggage Claim test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BaggageClaim getFixture() {
		return (BaggageClaim)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AirportFactory.eINSTANCE.createBaggageClaim());
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

} //BaggageClaimTest
