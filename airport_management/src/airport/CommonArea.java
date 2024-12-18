/**
 */
package airport;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Common Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link airport.CommonArea#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see airport.AirportPackage#getCommonArea()
 * @model
 * @generated
 */
public interface CommonArea extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link airport.CommonAreaTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see airport.CommonAreaTypes
	 * @see #setType(CommonAreaTypes)
	 * @see airport.AirportPackage#getCommonArea_Type()
	 * @model
	 * @generated
	 */
	CommonAreaTypes getType();

	/**
	 * Sets the value of the '{@link airport.CommonArea#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see airport.CommonAreaTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(CommonAreaTypes value);

} // CommonArea
