/**
 */
package airport.impl;

import airport.AirportPackage;
import airport.Gate;
import airport.GateArea;

import airport.namedElement;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gate Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link airport.impl.GateAreaImpl#getName <em>Name</em>}</li>
 *   <li>{@link airport.impl.GateAreaImpl#getGates <em>Gates</em>}</li>
 *   <li>{@link airport.impl.GateAreaImpl#getTotalGates <em>Total Gates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GateAreaImpl extends AreaImpl implements GateArea {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
	/**
	 * The cached value of the '{@link #getGates() <em>Gates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGates()
	 * @generated
	 * @ordered
	 */
	protected EList<Gate> gates;

	/**
	 * The default value of the '{@link #getTotalGates() <em>Total Gates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalGates()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_GATES_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getTotalGates() <em>Total Gates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalGates()
	 * @generated
	 * @ordered
	 */
	protected int totalGates = TOTAL_GATES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GateAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AirportPackage.Literals.GATE_AREA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirportPackage.GATE_AREA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Gate> getGates() {
		if (gates == null) {
			gates = new EObjectContainmentEList<Gate>(Gate.class, this, AirportPackage.GATE_AREA__GATES);
		}
		return gates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTotalGates() {
		return totalGates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalGates(int newTotalGates) {
		int oldTotalGates = totalGates;
		totalGates = newTotalGates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirportPackage.GATE_AREA__TOTAL_GATES, oldTotalGates, totalGates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public int calculateTotalGates() {
		 return this.getGates().size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Gate findGateByName(String name) {
	    // Iterate through the Gates to find a match by name
	    for (Gate gate : getGates()) {
	        if (gate.getName() != null && gate.getName().equals(name)) {
	            return gate; // Return the matching Gate
	        }
	    }
	    return null; // Return null if no match is found
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AirportPackage.GATE_AREA__GATES:
				return ((InternalEList<?>)getGates()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AirportPackage.GATE_AREA__NAME:
				return getName();
			case AirportPackage.GATE_AREA__GATES:
				return getGates();
			case AirportPackage.GATE_AREA__TOTAL_GATES:
				return getTotalGates();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AirportPackage.GATE_AREA__NAME:
				setName((String)newValue);
				return;
			case AirportPackage.GATE_AREA__GATES:
				getGates().clear();
				getGates().addAll((Collection<? extends Gate>)newValue);
				return;
			case AirportPackage.GATE_AREA__TOTAL_GATES:
				setTotalGates((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AirportPackage.GATE_AREA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AirportPackage.GATE_AREA__GATES:
				getGates().clear();
				return;
			case AirportPackage.GATE_AREA__TOTAL_GATES:
				setTotalGates(TOTAL_GATES_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AirportPackage.GATE_AREA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AirportPackage.GATE_AREA__GATES:
				return gates != null && !gates.isEmpty();
			case AirportPackage.GATE_AREA__TOTAL_GATES:
				return totalGates != TOTAL_GATES_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == namedElement.class) {
			switch (derivedFeatureID) {
				case AirportPackage.GATE_AREA__NAME: return AirportPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == namedElement.class) {
			switch (baseFeatureID) {
				case AirportPackage.NAMED_ELEMENT__NAME: return AirportPackage.GATE_AREA__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AirportPackage.GATE_AREA___CALCULATE_TOTAL_GATES:
				return calculateTotalGates();
			case AirportPackage.GATE_AREA___FIND_GATE_BY_NAME__STRING:
				return findGateByName((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", totalGates: ");
		result.append(totalGates);
		result.append(')');
		return result.toString();
	}

} //GateAreaImpl
