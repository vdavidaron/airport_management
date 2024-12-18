/**
 */
package airport;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gate Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link airport.GateArea#getGates <em>Gates</em>}</li>
 * </ul>
 *
 * @see airport.AirportPackage#getGateArea()
 * @model
 * @generated
 */
public interface GateArea extends Area {
	/**
	 * Returns the value of the '<em><b>Gates</b></em>' containment reference list.
	 * The list contents are of type {@link airport.Gate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gates</em>' containment reference list.
	 * @see airport.AirportPackage#getGateArea_Gates()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Gate> getGates();

} // GateArea
