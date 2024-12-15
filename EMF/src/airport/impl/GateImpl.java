/**
 */
package airport.impl;

import airport.AirportPackage;
import airport.Flight;
import airport.Gate;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link airport.impl.GateImpl#isBoarding <em>Boarding</em>}</li>
 *   <li>{@link airport.impl.GateImpl#getFlight <em>Flight</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GateImpl extends MinimalEObjectImpl.Container implements Gate {
	/**
	 * The default value of the '{@link #isBoarding() <em>Boarding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBoarding()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOARDING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBoarding() <em>Boarding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBoarding()
	 * @generated
	 * @ordered
	 */
	protected boolean boarding = BOARDING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFlight() <em>Flight</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlight()
	 * @generated
	 * @ordered
	 */
	protected Flight flight;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AirportPackage.Literals.GATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBoarding() {
		return boarding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoarding(boolean newBoarding) {
		boolean oldBoarding = boarding;
		boarding = newBoarding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirportPackage.GATE__BOARDING, oldBoarding, boarding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Flight getFlight() {
		if (flight != null && flight.eIsProxy()) {
			InternalEObject oldFlight = (InternalEObject)flight;
			flight = (Flight)eResolveProxy(oldFlight);
			if (flight != oldFlight) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AirportPackage.GATE__FLIGHT, oldFlight, flight));
			}
		}
		return flight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flight basicGetFlight() {
		return flight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlight(Flight newFlight) {
		Flight oldFlight = flight;
		flight = newFlight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirportPackage.GATE__FLIGHT, oldFlight, flight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AirportPackage.GATE__BOARDING:
				return isBoarding();
			case AirportPackage.GATE__FLIGHT:
				if (resolve) return getFlight();
				return basicGetFlight();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AirportPackage.GATE__BOARDING:
				setBoarding((Boolean)newValue);
				return;
			case AirportPackage.GATE__FLIGHT:
				setFlight((Flight)newValue);
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
			case AirportPackage.GATE__BOARDING:
				setBoarding(BOARDING_EDEFAULT);
				return;
			case AirportPackage.GATE__FLIGHT:
				setFlight((Flight)null);
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
			case AirportPackage.GATE__BOARDING:
				return boarding != BOARDING_EDEFAULT;
			case AirportPackage.GATE__FLIGHT:
				return flight != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (boarding: ");
		result.append(boarding);
		result.append(')');
		return result.toString();
	}

} //GateImpl
