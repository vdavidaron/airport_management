/**
 */
package airport;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link airport.Gate#isBoarding <em>Boarding</em>}</li>
 *   <li>{@link airport.Gate#getFlight <em>Flight</em>}</li>
 * </ul>
 *
 * @see airport.AirportPackage#getGate()
 * @model
 * @generated
 */
public interface Gate extends namedElement {
	/**
	 * Returns the value of the '<em><b>Boarding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boarding</em>' attribute.
	 * @see #setBoarding(boolean)
	 * @see airport.AirportPackage#getGate_Boarding()
	 * @model
	 * @generated
	 */
	boolean isBoarding();

	/**
	 * Sets the value of the '{@link airport.Gate#isBoarding <em>Boarding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boarding</em>' attribute.
	 * @see #isBoarding()
	 * @generated
	 */
	void setBoarding(boolean value);

	/**
	 * Returns the value of the '<em><b>Flight</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flight</em>' reference.
	 * @see #setFlight(Flight)
	 * @see airport.AirportPackage#getGate_Flight()
	 * @model
	 * @generated
	 */
	Flight getFlight();

	/**
	 * Sets the value of the '{@link airport.Gate#getFlight <em>Flight</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flight</em>' reference.
	 * @see #getFlight()
	 * @generated
	 */
	void setFlight(Flight value);

} // Gate
