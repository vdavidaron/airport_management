/**
 */
package airport.impl;

import airport.AirportPackage;
import airport.Elevator;
import airport.Floor;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elevator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link airport.impl.ElevatorImpl#getConnectedFloors <em>Connected Floors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElevatorImpl extends MinimalEObjectImpl.Container implements Elevator {
	/**
	 * The cached value of the '{@link #getConnectedFloors() <em>Connected Floors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedFloors()
	 * @generated
	 * @ordered
	 */
	protected EList<Floor> connectedFloors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElevatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AirportPackage.Literals.ELEVATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Floor> getConnectedFloors() {
		if (connectedFloors == null) {
			connectedFloors = new EObjectContainmentEList<Floor>(Floor.class, this, AirportPackage.ELEVATOR__CONNECTED_FLOORS);
		}
		return connectedFloors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AirportPackage.ELEVATOR__CONNECTED_FLOORS:
				return ((InternalEList<?>)getConnectedFloors()).basicRemove(otherEnd, msgs);
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
			case AirportPackage.ELEVATOR__CONNECTED_FLOORS:
				return getConnectedFloors();
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
			case AirportPackage.ELEVATOR__CONNECTED_FLOORS:
				getConnectedFloors().clear();
				getConnectedFloors().addAll((Collection<? extends Floor>)newValue);
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
			case AirportPackage.ELEVATOR__CONNECTED_FLOORS:
				getConnectedFloors().clear();
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
			case AirportPackage.ELEVATOR__CONNECTED_FLOORS:
				return connectedFloors != null && !connectedFloors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ElevatorImpl
