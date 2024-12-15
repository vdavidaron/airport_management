/**
 */
package airport.areas;

import airport.Customs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arrival</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link airport.areas.Arrival#getBaggageClaim <em>Baggage Claim</em>}</li>
 *   <li>{@link airport.areas.Arrival#getCustoms <em>Customs</em>}</li>
 * </ul>
 *
 * @see airport.areas.AreasPackage#getArrival()
 * @model
 * @generated
 */
public interface Arrival extends Area {
	/**
	 * Returns the value of the '<em><b>Baggage Claim</b></em>' containment reference list.
	 * The list contents are of type {@link airport.areas.BaggageClaim}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Baggage Claim</em>' containment reference list.
	 * @see airport.areas.AreasPackage#getArrival_BaggageClaim()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BaggageClaim> getBaggageClaim();

	/**
	 * Returns the value of the '<em><b>Customs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customs</em>' containment reference.
	 * @see #setCustoms(Customs)
	 * @see airport.areas.AreasPackage#getArrival_Customs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Customs getCustoms();

	/**
	 * Sets the value of the '{@link airport.areas.Arrival#getCustoms <em>Customs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customs</em>' containment reference.
	 * @see #getCustoms()
	 * @generated
	 */
	void setCustoms(Customs value);

} // Arrival
