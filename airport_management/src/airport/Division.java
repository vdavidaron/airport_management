/**
 */
package airport;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Division</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link airport.Division#getCommonAreas <em>Common Areas</em>}</li>
 *   <li>{@link airport.Division#getFloor <em>Floor</em>}</li>
 * </ul>
 *
 * @see airport.AirportPackage#getDivision()
 * @model abstract="true"
 * @generated
 */
public interface Division extends EObject {
	/**
	 * Returns the value of the '<em><b>Common Areas</b></em>' containment reference list.
	 * The list contents are of type {@link airport.CommonArea}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Common Areas</em>' containment reference list.
	 * @see airport.AirportPackage#getDivision_CommonAreas()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommonArea> getCommonAreas();

	/**
	 * Returns the value of the '<em><b>Floor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floor</em>' containment reference.
	 * @see #setFloor(Floor)
	 * @see airport.AirportPackage#getDivision_Floor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Floor getFloor();

	/**
	 * Sets the value of the '{@link airport.Division#getFloor <em>Floor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floor</em>' containment reference.
	 * @see #getFloor()
	 * @generated
	 */
	void setFloor(Floor value);

} // Division
