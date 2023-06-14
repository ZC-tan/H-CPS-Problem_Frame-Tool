/**
 */
package UML.provider;

import UML.util.UMLAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
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
public class UMLItemProviderAdapterFactory extends UMLAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier {
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
	public UMLItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link UML.StateMachine} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachineItemProvider stateMachineItemProvider;

	/**
	 * This creates an adapter for a {@link UML.StateMachine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStateMachineAdapter() {
		if (stateMachineItemProvider == null) {
			stateMachineItemProvider = new StateMachineItemProvider(this);
		}

		return stateMachineItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link UML.Region} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionItemProvider regionItemProvider;

	/**
	 * This creates an adapter for a {@link UML.Region}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRegionAdapter() {
		if (regionItemProvider == null) {
			regionItemProvider = new RegionItemProvider(this);
		}

		return regionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link UML.Transition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionItemProvider transitionItemProvider;

	/**
	 * This creates an adapter for a {@link UML.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTransitionAdapter() {
		if (transitionItemProvider == null) {
			transitionItemProvider = new TransitionItemProvider(this);
		}

		return transitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link UML.ConnectionPointReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionPointReferenceItemProvider connectionPointReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link UML.ConnectionPointReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConnectionPointReferenceAdapter() {
		if (connectionPointReferenceItemProvider == null) {
			connectionPointReferenceItemProvider = new ConnectionPointReferenceItemProvider(this);
		}

		return connectionPointReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link UML.Pseudostate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PseudostateItemProvider pseudostateItemProvider;

	/**
	 * This creates an adapter for a {@link UML.Pseudostate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPseudostateAdapter() {
		if (pseudostateItemProvider == null) {
			pseudostateItemProvider = new PseudostateItemProvider(this);
		}

		return pseudostateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link UML.State} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateItemProvider stateItemProvider;

	/**
	 * This creates an adapter for a {@link UML.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStateAdapter() {
		if (stateItemProvider == null) {
			stateItemProvider = new StateItemProvider(this);
		}

		return stateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link UML.FinalState} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinalStateItemProvider finalStateItemProvider;

	/**
	 * This creates an adapter for a {@link UML.FinalState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFinalStateAdapter() {
		if (finalStateItemProvider == null) {
			finalStateItemProvider = new FinalStateItemProvider(this);
		}

		return finalStateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link UML.Trigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerItemProvider triggerItemProvider;

	/**
	 * This creates an adapter for a {@link UML.Trigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTriggerAdapter() {
		if (triggerItemProvider == null) {
			triggerItemProvider = new TriggerItemProvider(this);
		}

		return triggerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link UML.Constraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintItemProvider constraintItemProvider;

	/**
	 * This creates an adapter for a {@link UML.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConstraintAdapter() {
		if (constraintItemProvider == null) {
			constraintItemProvider = new ConstraintItemProvider(this);
		}

		return constraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link UML.ValueSpecification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSpecificationItemProvider valueSpecificationItemProvider;

	/**
	 * This creates an adapter for a {@link UML.ValueSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createValueSpecificationAdapter() {
		if (valueSpecificationItemProvider == null) {
			valueSpecificationItemProvider = new ValueSpecificationItemProvider(this);
		}

		return valueSpecificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link UML.SetValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetValueItemProvider setValueItemProvider;

	/**
	 * This creates an adapter for a {@link UML.SetValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSetValueAdapter() {
		if (setValueItemProvider == null) {
			setValueItemProvider = new SetValueItemProvider(this);
		}

		return setValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link UML.Property} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyItemProvider propertyItemProvider;

	/**
	 * This creates an adapter for a {@link UML.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertyAdapter() {
		if (propertyItemProvider == null) {
			propertyItemProvider = new PropertyItemProvider(this);
		}

		return propertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link UML.SendEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SendEventItemProvider sendEventItemProvider;

	/**
	 * This creates an adapter for a {@link UML.SendEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSendEventAdapter() {
		if (sendEventItemProvider == null) {
			sendEventItemProvider = new SendEventItemProvider(this);
		}

		return sendEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link UML.TeamDiagram} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeamDiagramItemProvider teamDiagramItemProvider;

	/**
	 * This creates an adapter for a {@link UML.TeamDiagram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTeamDiagramAdapter() {
		if (teamDiagramItemProvider == null) {
			teamDiagramItemProvider = new TeamDiagramItemProvider(this);
		}

		return teamDiagramItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link UML.Human} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HumanItemProvider humanItemProvider;

	/**
	 * This creates an adapter for a {@link UML.Human}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHumanAdapter() {
		if (humanItemProvider == null) {
			humanItemProvider = new HumanItemProvider(this);
		}

		return humanItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link UML.Machine} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachineItemProvider machineItemProvider;

	/**
	 * This creates an adapter for a {@link UML.Machine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMachineAdapter() {
		if (machineItemProvider == null) {
			machineItemProvider = new MachineItemProvider(this);
		}

		return machineItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link UML.HumanToMachineRelation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HumanToMachineRelationItemProvider humanToMachineRelationItemProvider;

	/**
	 * This creates an adapter for a {@link UML.HumanToMachineRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHumanToMachineRelationAdapter() {
		if (humanToMachineRelationItemProvider == null) {
			humanToMachineRelationItemProvider = new HumanToMachineRelationItemProvider(this);
		}

		return humanToMachineRelationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link UML.MachineToHumanRelation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachineToHumanRelationItemProvider machineToHumanRelationItemProvider;

	/**
	 * This creates an adapter for a {@link UML.MachineToHumanRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMachineToHumanRelationAdapter() {
		if (machineToHumanRelationItemProvider == null) {
			machineToHumanRelationItemProvider = new MachineToHumanRelationItemProvider(this);
		}

		return machineToHumanRelationItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
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
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

}