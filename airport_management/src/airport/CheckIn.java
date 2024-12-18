/**
 */
package airport;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check In</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link airport.CheckIn#getCounters <em>Counters</em>}</li>
 * </ul>
 *
 * @see airport.AirportPackage#getCheckIn()
 * @model
 * @generated
 */
public interface CheckIn extends EObject {
	/**
	 * Returns the value of the '<em><b>Counters</b></em>' containment reference list.
	 * The list contents are of type {@link airport.Counter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counters</em>' containment reference list.
	 * @see airport.AirportPackage#getCheckIn_Counters()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Counter> getCounters();

} // CheckIn
