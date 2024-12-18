/**
 */
package airport;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transportation Services</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link airport.TransportationServices#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see airport.AirportPackage#getTransportationServices()
 * @model
 * @generated
 */
public interface TransportationServices extends Area, namedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link airport.TransportationTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see airport.TransportationTypes
	 * @see #setType(TransportationTypes)
	 * @see airport.AirportPackage#getTransportationServices_Type()
	 * @model
	 * @generated
	 */
	TransportationTypes getType();

	/**
	 * Sets the value of the '{@link airport.TransportationServices#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see airport.TransportationTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(TransportationTypes value);

} // TransportationServices
