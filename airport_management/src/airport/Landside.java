/**
 */
package airport;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Landside</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link airport.Landside#getDepartureArea <em>Departure Area</em>}</li>
 *   <li>{@link airport.Landside#getArrivalArea <em>Arrival Area</em>}</li>
 * </ul>
 *
 * @see airport.AirportPackage#getLandside()
 * @model
 * @generated
 */
public interface Landside extends Division {
	/**
	 * Returns the value of the '<em><b>Departure Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departure Area</em>' containment reference.
	 * @see #setDepartureArea(Departure)
	 * @see airport.AirportPackage#getLandside_DepartureArea()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Departure getDepartureArea();

	/**
	 * Sets the value of the '{@link airport.Landside#getDepartureArea <em>Departure Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Departure Area</em>' containment reference.
	 * @see #getDepartureArea()
	 * @generated
	 */
	void setDepartureArea(Departure value);

	/**
	 * Returns the value of the '<em><b>Arrival Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrival Area</em>' containment reference.
	 * @see #setArrivalArea(Arrival)
	 * @see airport.AirportPackage#getLandside_ArrivalArea()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Arrival getArrivalArea();

	/**
	 * Sets the value of the '{@link airport.Landside#getArrivalArea <em>Arrival Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrival Area</em>' containment reference.
	 * @see #getArrivalArea()
	 * @generated
	 */
	void setArrivalArea(Arrival value);

} // Landside
