/**
 */
package airport;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Belt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link airport.Belt#getFlight <em>Flight</em>}</li>
 * </ul>
 *
 * @see airport.AirportPackage#getBelt()
 * @model
 * @generated
 */
public interface Belt extends namedElement {
	/**
	 * Returns the value of the '<em><b>Flight</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flight</em>' reference.
	 * @see #setFlight(Flight)
	 * @see airport.AirportPackage#getBelt_Flight()
	 * @model
	 * @generated
	 */
	Flight getFlight();

	/**
	 * Sets the value of the '{@link airport.Belt#getFlight <em>Flight</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flight</em>' reference.
	 * @see #getFlight()
	 * @generated
	 */
	void setFlight(Flight value);

} // Belt
