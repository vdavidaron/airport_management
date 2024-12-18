/**
 */
package airport;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Departure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link airport.Departure#getSecurity <em>Security</em>}</li>
 *   <li>{@link airport.Departure#getCheckIn <em>Check In</em>}</li>
 *   <li>{@link airport.Departure#getBaggageDropOff <em>Baggage Drop Off</em>}</li>
 * </ul>
 *
 * @see airport.AirportPackage#getDeparture()
 * @model
 * @generated
 */
public interface Departure extends Area {
	/**
	 * Returns the value of the '<em><b>Security</b></em>' containment reference list.
	 * The list contents are of type {@link airport.SecurityCheck}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security</em>' containment reference list.
	 * @see airport.AirportPackage#getDeparture_Security()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SecurityCheck> getSecurity();

	/**
	 * Returns the value of the '<em><b>Check In</b></em>' containment reference list.
	 * The list contents are of type {@link airport.CheckIn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check In</em>' containment reference list.
	 * @see airport.AirportPackage#getDeparture_CheckIn()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CheckIn> getCheckIn();

	/**
	 * Returns the value of the '<em><b>Baggage Drop Off</b></em>' containment reference list.
	 * The list contents are of type {@link airport.BaggageDropOff}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Baggage Drop Off</em>' containment reference list.
	 * @see airport.AirportPackage#getDeparture_BaggageDropOff()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BaggageDropOff> getBaggageDropOff();

} // Departure
