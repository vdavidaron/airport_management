/**
 */
package airport;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elevator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link airport.Elevator#getConnectedFloors <em>Connected Floors</em>}</li>
 * </ul>
 *
 * @see airport.AirportPackage#getElevator()
 * @model
 * @generated
 */
public interface Elevator extends namedElement {
	/**
	 * Returns the value of the '<em><b>Connected Floors</b></em>' containment reference list.
	 * The list contents are of type {@link airport.Floor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected Floors</em>' containment reference list.
	 * @see airport.AirportPackage#getElevator_ConnectedFloors()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Floor> getConnectedFloors();

} // Elevator
