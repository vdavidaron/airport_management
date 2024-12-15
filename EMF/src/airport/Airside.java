/**
 */
package airport;

import airport.areas.GateArea;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Airside</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link airport.Airside#getGateArea <em>Gate Area</em>}</li>
 * </ul>
 *
 * @see airport.AirportPackage#getAirside()
 * @model
 * @generated
 */
public interface Airside extends Division {
	/**
	 * Returns the value of the '<em><b>Gate Area</b></em>' containment reference list.
	 * The list contents are of type {@link airport.areas.GateArea}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gate Area</em>' containment reference list.
	 * @see airport.AirportPackage#getAirside_GateArea()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<GateArea> getGateArea();

} // Airside
