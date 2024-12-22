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
 *   <li>{@link airport.GateArea#getTotalGates <em>Total Gates</em>}</li>
 * </ul>
 *
 * @see airport.AirportPackage#getGateArea()
 * @model
 * @generated
 */
public interface GateArea extends Area, namedElement {
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

	/**
	 * Returns the value of the '<em><b>Total Gates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Gates</em>' attribute.
	 * @see #setTotalGates(int)
	 * @see airport.AirportPackage#getGateArea_TotalGates()
	 * @model derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.gates-&gt;size()'"
	 * @generated
	 */
	int getTotalGates();

	/**
	 * Sets the value of the '{@link airport.GateArea#getTotalGates <em>Total Gates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Gates</em>' attribute.
	 * @see #getTotalGates()
	 * @generated
	 */
	void setTotalGates(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int calculateTotalGates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Gate findGateByName(String name);

} // GateArea
