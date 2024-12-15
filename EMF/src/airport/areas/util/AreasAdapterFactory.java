/**
 */
package airport.areas.util;

import airport.areas.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see airport.areas.AreasPackage
 * @generated
 */
public class AreasAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AreasPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AreasAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AreasPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AreasSwitch<Adapter> modelSwitch =
		new AreasSwitch<Adapter>() {
			@Override
			public Adapter caseArea(Area object) {
				return createAreaAdapter();
			}
			@Override
			public Adapter caseArrival(Arrival object) {
				return createArrivalAdapter();
			}
			@Override
			public Adapter caseBaggageClaim(BaggageClaim object) {
				return createBaggageClaimAdapter();
			}
			@Override
			public Adapter caseBaggageDropOff(BaggageDropOff object) {
				return createBaggageDropOffAdapter();
			}
			@Override
			public Adapter caseDeparture(Departure object) {
				return createDepartureAdapter();
			}
			@Override
			public Adapter caseDropOff(DropOff object) {
				return createDropOffAdapter();
			}
			@Override
			public Adapter caseGateArea(GateArea object) {
				return createGateAreaAdapter();
			}
			@Override
			public Adapter caseParkingArea(ParkingArea object) {
				return createParkingAreaAdapter();
			}
			@Override
			public Adapter caseTransportationServices(TransportationServices object) {
				return createTransportationServicesAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link airport.areas.Area <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see airport.areas.Area
	 * @generated
	 */
	public Adapter createAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link airport.areas.Arrival <em>Arrival</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see airport.areas.Arrival
	 * @generated
	 */
	public Adapter createArrivalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link airport.areas.BaggageClaim <em>Baggage Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see airport.areas.BaggageClaim
	 * @generated
	 */
	public Adapter createBaggageClaimAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link airport.areas.BaggageDropOff <em>Baggage Drop Off</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see airport.areas.BaggageDropOff
	 * @generated
	 */
	public Adapter createBaggageDropOffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link airport.areas.Departure <em>Departure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see airport.areas.Departure
	 * @generated
	 */
	public Adapter createDepartureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link airport.areas.DropOff <em>Drop Off</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see airport.areas.DropOff
	 * @generated
	 */
	public Adapter createDropOffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link airport.areas.GateArea <em>Gate Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see airport.areas.GateArea
	 * @generated
	 */
	public Adapter createGateAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link airport.areas.ParkingArea <em>Parking Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see airport.areas.ParkingArea
	 * @generated
	 */
	public Adapter createParkingAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link airport.areas.TransportationServices <em>Transportation Services</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see airport.areas.TransportationServices
	 * @generated
	 */
	public Adapter createTransportationServicesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AreasAdapterFactory
