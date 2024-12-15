/**
 */
package airport.areas.impl;

import airport.Counter;

import airport.areas.AreasPackage;
import airport.areas.BaggageDropOff;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Baggage Drop Off</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link airport.areas.impl.BaggageDropOffImpl#getCounters <em>Counters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BaggageDropOffImpl extends AreaImpl implements BaggageDropOff {
	/**
	 * The cached value of the '{@link #getCounters() <em>Counters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounters()
	 * @generated
	 * @ordered
	 */
	protected EList<Counter> counters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaggageDropOffImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AreasPackage.Literals.BAGGAGE_DROP_OFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Counter> getCounters() {
		if (counters == null) {
			counters = new EObjectContainmentEList<Counter>(Counter.class, this, AreasPackage.BAGGAGE_DROP_OFF__COUNTERS);
		}
		return counters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AreasPackage.BAGGAGE_DROP_OFF__COUNTERS:
				return ((InternalEList<?>)getCounters()).basicRemove(otherEnd, msgs);
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
			case AreasPackage.BAGGAGE_DROP_OFF__COUNTERS:
				return getCounters();
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
			case AreasPackage.BAGGAGE_DROP_OFF__COUNTERS:
				getCounters().clear();
				getCounters().addAll((Collection<? extends Counter>)newValue);
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
			case AreasPackage.BAGGAGE_DROP_OFF__COUNTERS:
				getCounters().clear();
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
			case AreasPackage.BAGGAGE_DROP_OFF__COUNTERS:
				return counters != null && !counters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BaggageDropOffImpl
