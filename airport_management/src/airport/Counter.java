/**
 */
package airport;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Counter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link airport.Counter#getFlight <em>Flight</em>}</li>
 * </ul>
 *
 * @see airport.AirportPackage#getCounter()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidCounter'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL ValidCounter='self.flight = null or self.flight.type = FlightType::departure'"
 * @generated
 */
public interface Counter extends namedElement {
	/**
	 * Returns the value of the '<em><b>Flight</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flight</em>' reference.
	 * @see #setFlight(Flight)
	 * @see airport.AirportPackage#getCounter_Flight()
	 * @model
	 * @generated
	 */
	Flight getFlight();

	/**
	 * Sets the value of the '{@link airport.Counter#getFlight <em>Flight</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flight</em>' reference.
	 * @see #getFlight()
	 * @generated
	 */
	void setFlight(Flight value);

} // Counter
