/**
 */
package airport;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Baggage Drop Off</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link airport.BaggageDropOff#getCounters <em>Counters</em>}</li>
 * </ul>
 *
 * @see airport.AirportPackage#getBaggageDropOff()
 * @model
 * @generated
 */
public interface BaggageDropOff extends Area {
	/**
	 * Returns the value of the '<em><b>Counters</b></em>' containment reference list.
	 * The list contents are of type {@link airport.Counter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counters</em>' containment reference list.
	 * @see airport.AirportPackage#getBaggageDropOff_Counters()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Counter> getCounters();

} // BaggageDropOff
