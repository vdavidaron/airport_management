/**
 */
package airport.provider;

import airport.util.AirportAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AirportItemProviderAdapterFactory extends AirportAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AirportItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link airport.Terminal} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminalItemProvider terminalItemProvider;

	/**
	 * This creates an adapter for a {@link airport.Terminal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTerminalAdapter() {
		if (terminalItemProvider == null) {
			terminalItemProvider = new TerminalItemProvider(this);
		}

		return terminalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link airport.Airside} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AirsideItemProvider airsideItemProvider;

	/**
	 * This creates an adapter for a {@link airport.Airside}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAirsideAdapter() {
		if (airsideItemProvider == null) {
			airsideItemProvider = new AirsideItemProvider(this);
		}

		return airsideItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link airport.Belt} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BeltItemProvider beltItemProvider;

	/**
	 * This creates an adapter for a {@link airport.Belt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBeltAdapter() {
		if (beltItemProvider == null) {
			beltItemProvider = new BeltItemProvider(this);
		}

		return beltItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link airport.CheckIn} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckInItemProvider checkInItemProvider;

	/**
	 * This creates an adapter for a {@link airport.CheckIn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCheckInAdapter() {
		if (checkInItemProvider == null) {
			checkInItemProvider = new CheckInItemProvider(this);
		}

		return checkInItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link airport.CommonArea} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommonAreaItemProvider commonAreaItemProvider;

	/**
	 * This creates an adapter for a {@link airport.CommonArea}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommonAreaAdapter() {
		if (commonAreaItemProvider == null) {
			commonAreaItemProvider = new CommonAreaItemProvider(this);
		}

		return commonAreaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link airport.Counter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CounterItemProvider counterItemProvider;

	/**
	 * This creates an adapter for a {@link airport.Counter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCounterAdapter() {
		if (counterItemProvider == null) {
			counterItemProvider = new CounterItemProvider(this);
		}

		return counterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link airport.Customs} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomsItemProvider customsItemProvider;

	/**
	 * This creates an adapter for a {@link airport.Customs}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCustomsAdapter() {
		if (customsItemProvider == null) {
			customsItemProvider = new CustomsItemProvider(this);
		}

		return customsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link airport.Elevator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElevatorItemProvider elevatorItemProvider;

	/**
	 * This creates an adapter for a {@link airport.Elevator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createElevatorAdapter() {
		if (elevatorItemProvider == null) {
			elevatorItemProvider = new ElevatorItemProvider(this);
		}

		return elevatorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link airport.Flight} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightItemProvider flightItemProvider;

	/**
	 * This creates an adapter for a {@link airport.Flight}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFlightAdapter() {
		if (flightItemProvider == null) {
			flightItemProvider = new FlightItemProvider(this);
		}

		return flightItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link airport.Floor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FloorItemProvider floorItemProvider;

	/**
	 * This creates an adapter for a {@link airport.Floor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFloorAdapter() {
		if (floorItemProvider == null) {
			floorItemProvider = new FloorItemProvider(this);
		}

		return floorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link airport.Gate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GateItemProvider gateItemProvider;

	/**
	 * This creates an adapter for a {@link airport.Gate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGateAdapter() {
		if (gateItemProvider == null) {
			gateItemProvider = new GateItemProvider(this);
		}

		return gateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link airport.Landside} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LandsideItemProvider landsideItemProvider;

	/**
	 * This creates an adapter for a {@link airport.Landside}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLandsideAdapter() {
		if (landsideItemProvider == null) {
			landsideItemProvider = new LandsideItemProvider(this);
		}

		return landsideItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link airport.Point} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointItemProvider pointItemProvider;

	/**
	 * This creates an adapter for a {@link airport.Point}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPointAdapter() {
		if (pointItemProvider == null) {
			pointItemProvider = new PointItemProvider(this);
		}

		return pointItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link airport.SecurityCheck} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityCheckItemProvider securityCheckItemProvider;

	/**
	 * This creates an adapter for a {@link airport.SecurityCheck}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSecurityCheckAdapter() {
		if (securityCheckItemProvider == null) {
			securityCheckItemProvider = new SecurityCheckItemProvider(this);
		}

		return securityCheckItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (terminalItemProvider != null) terminalItemProvider.dispose();
		if (airsideItemProvider != null) airsideItemProvider.dispose();
		if (beltItemProvider != null) beltItemProvider.dispose();
		if (checkInItemProvider != null) checkInItemProvider.dispose();
		if (commonAreaItemProvider != null) commonAreaItemProvider.dispose();
		if (counterItemProvider != null) counterItemProvider.dispose();
		if (customsItemProvider != null) customsItemProvider.dispose();
		if (elevatorItemProvider != null) elevatorItemProvider.dispose();
		if (flightItemProvider != null) flightItemProvider.dispose();
		if (floorItemProvider != null) floorItemProvider.dispose();
		if (gateItemProvider != null) gateItemProvider.dispose();
		if (landsideItemProvider != null) landsideItemProvider.dispose();
		if (pointItemProvider != null) pointItemProvider.dispose();
		if (securityCheckItemProvider != null) securityCheckItemProvider.dispose();
	}

}