/**
 */
package airport.areas.impl;

import airport.areas.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AreasFactoryImpl extends EFactoryImpl implements AreasFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AreasFactory init() {
		try {
			AreasFactory theAreasFactory = (AreasFactory)EPackage.Registry.INSTANCE.getEFactory(AreasPackage.eNS_URI);
			if (theAreasFactory != null) {
				return theAreasFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AreasFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AreasFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AreasPackage.ARRIVAL: return createArrival();
			case AreasPackage.BAGGAGE_CLAIM: return createBaggageClaim();
			case AreasPackage.BAGGAGE_DROP_OFF: return createBaggageDropOff();
			case AreasPackage.DEPARTURE: return createDeparture();
			case AreasPackage.DROP_OFF: return createDropOff();
			case AreasPackage.GATE_AREA: return createGateArea();
			case AreasPackage.PARKING_AREA: return createParkingArea();
			case AreasPackage.TRANSPORTATION_SERVICES: return createTransportationServices();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Arrival createArrival() {
		ArrivalImpl arrival = new ArrivalImpl();
		return arrival;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaggageClaim createBaggageClaim() {
		BaggageClaimImpl baggageClaim = new BaggageClaimImpl();
		return baggageClaim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaggageDropOff createBaggageDropOff() {
		BaggageDropOffImpl baggageDropOff = new BaggageDropOffImpl();
		return baggageDropOff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Departure createDeparture() {
		DepartureImpl departure = new DepartureImpl();
		return departure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DropOff createDropOff() {
		DropOffImpl dropOff = new DropOffImpl();
		return dropOff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GateArea createGateArea() {
		GateAreaImpl gateArea = new GateAreaImpl();
		return gateArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParkingArea createParkingArea() {
		ParkingAreaImpl parkingArea = new ParkingAreaImpl();
		return parkingArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransportationServices createTransportationServices() {
		TransportationServicesImpl transportationServices = new TransportationServicesImpl();
		return transportationServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AreasPackage getAreasPackage() {
		return (AreasPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AreasPackage getPackage() {
		return AreasPackage.eINSTANCE;
	}

} //AreasFactoryImpl
