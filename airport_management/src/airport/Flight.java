/**
 */
package airport;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flight</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link airport.Flight#getFlightNumber <em>Flight Number</em>}</li>
 *   <li>{@link airport.Flight#getTime <em>Time</em>}</li>
 *   <li>{@link airport.Flight#getType <em>Type</em>}</li>
 *   <li>{@link airport.Flight#getCity <em>City</em>}</li>
 *   <li>{@link airport.Flight#isIsInternational <em>Is International</em>}</li>
 * </ul>
 *
 * @see airport.AirportPackage#getFlight()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidTime ValidName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL ValidTime='self.time.matches(\'^\\\\d{2}:\\\\d{2}$\')' ValidName='self.name.matches(\'[a-zA-Z0-9]+\')'"
 * @generated
 */
public interface Flight extends namedElement {
	/**
	 * Returns the value of the '<em><b>Flight Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flight Number</em>' attribute.
	 * @see #setFlightNumber(String)
	 * @see airport.AirportPackage#getFlight_FlightNumber()
	 * @model
	 * @generated
	 */
	String getFlightNumber();

	/**
	 * Sets the value of the '{@link airport.Flight#getFlightNumber <em>Flight Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flight Number</em>' attribute.
	 * @see #getFlightNumber()
	 * @generated
	 */
	void setFlightNumber(String value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(String)
	 * @see airport.AirportPackage#getFlight_Time()
	 * @model
	 * @generated
	 */
	String getTime();

	/**
	 * Sets the value of the '{@link airport.Flight#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link airport.FlightType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see airport.FlightType
	 * @see #setType(FlightType)
	 * @see airport.AirportPackage#getFlight_Type()
	 * @model
	 * @generated
	 */
	FlightType getType();

	/**
	 * Sets the value of the '{@link airport.Flight#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see airport.FlightType
	 * @see #getType()
	 * @generated
	 */
	void setType(FlightType value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see airport.AirportPackage#getFlight_City()
	 * @model
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link airport.Flight#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>Is International</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is International</em>' attribute.
	 * @see #setIsInternational(boolean)
	 * @see airport.AirportPackage#getFlight_IsInternational()
	 * @model derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.city &lt;&gt; \'LocalCity\''"
	 * @generated
	 */
	boolean isIsInternational();

	/**
	 * Sets the value of the '{@link airport.Flight#isIsInternational <em>Is International</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is International</em>' attribute.
	 * @see #isIsInternational()
	 * @generated
	 */
	void setIsInternational(boolean value);

} // Flight
