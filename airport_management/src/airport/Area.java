/**
 */
package airport;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link airport.Area#getAreaCorners <em>Area Corners</em>}</li>
 * </ul>
 *
 * @see airport.AirportPackage#getArea()
 * @model abstract="true"
 * @generated
 */
public interface Area extends EObject {
	/**
	 * Returns the value of the '<em><b>Area Corners</b></em>' containment reference list.
	 * The list contents are of type {@link airport.Point}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area Corners</em>' containment reference list.
	 * @see airport.AirportPackage#getArea_AreaCorners()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Point> getAreaCorners();

} // Area
