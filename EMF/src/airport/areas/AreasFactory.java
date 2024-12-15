/**
 */
package airport.areas;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see airport.areas.AreasPackage
 * @generated
 */
public interface AreasFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AreasFactory eINSTANCE = airport.areas.impl.AreasFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Arrival</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arrival</em>'.
	 * @generated
	 */
	Arrival createArrival();

	/**
	 * Returns a new object of class '<em>Baggage Claim</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Baggage Claim</em>'.
	 * @generated
	 */
	BaggageClaim createBaggageClaim();

	/**
	 * Returns a new object of class '<em>Baggage Drop Off</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Baggage Drop Off</em>'.
	 * @generated
	 */
	BaggageDropOff createBaggageDropOff();

	/**
	 * Returns a new object of class '<em>Departure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Departure</em>'.
	 * @generated
	 */
	Departure createDeparture();

	/**
	 * Returns a new object of class '<em>Drop Off</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drop Off</em>'.
	 * @generated
	 */
	DropOff createDropOff();

	/**
	 * Returns a new object of class '<em>Gate Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gate Area</em>'.
	 * @generated
	 */
	GateArea createGateArea();

	/**
	 * Returns a new object of class '<em>Parking Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parking Area</em>'.
	 * @generated
	 */
	ParkingArea createParkingArea();

	/**
	 * Returns a new object of class '<em>Transportation Services</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transportation Services</em>'.
	 * @generated
	 */
	TransportationServices createTransportationServices();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AreasPackage getAreasPackage();

} //AreasFactory
