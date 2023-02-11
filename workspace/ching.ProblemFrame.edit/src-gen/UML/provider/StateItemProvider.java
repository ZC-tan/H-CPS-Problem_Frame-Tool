/**
 */
package UML.provider;

import UML.State;
import UML.UMLFactory;
import UML.UMLPackage;

import ching.ProblemFrame.ProblemFrameFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link UML.State} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StateItemProvider extends NamespaceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIncomingPropertyDescriptor(object);
			addOutgoingPropertyDescriptor(object);
			addSubmachinePropertyDescriptor(object);
			addIsCompositePropertyDescriptor(object);
			addIsOrthogonalPropertyDescriptor(object);
			addIsSimplePropertyDescriptor(object);
			addIsSubmachineStatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Incoming feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncomingPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Vertex_incoming_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Vertex_incoming_feature",
								"_UI_Vertex_type"),
						UMLPackage.Literals.VERTEX__INCOMING, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Outgoing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutgoingPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Vertex_outgoing_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Vertex_outgoing_feature",
								"_UI_Vertex_type"),
						UMLPackage.Literals.VERTEX__OUTGOING, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Submachine feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubmachinePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_State_submachine_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_State_submachine_feature",
								"_UI_State_type"),
						UMLPackage.Literals.STATE__SUBMACHINE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Is Composite feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsCompositePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_State_isComposite_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_State_isComposite_feature",
								"_UI_State_type"),
						UMLPackage.Literals.STATE__IS_COMPOSITE, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Is Orthogonal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsOrthogonalPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_State_isOrthogonal_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_State_isOrthogonal_feature",
								"_UI_State_type"),
						UMLPackage.Literals.STATE__IS_ORTHOGONAL, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Is Simple feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsSimplePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_State_isSimple_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_State_isSimple_feature", "_UI_State_type"),
						UMLPackage.Literals.STATE__IS_SIMPLE, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Is Submachine State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsSubmachineStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_State_isSubmachineState_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_State_isSubmachineState_feature",
								"_UI_State_type"),
						UMLPackage.Literals.STATE__IS_SUBMACHINE_STATE, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(UMLPackage.Literals.STATE__REGION);
			childrenFeatures.add(UMLPackage.Literals.STATE__CONNECTION);
			childrenFeatures.add(UMLPackage.Literals.STATE__CONNECTION_POINT);
			childrenFeatures.add(UMLPackage.Literals.STATE__DEFERRABLE_TRIGGER);
			childrenFeatures.add(UMLPackage.Literals.STATE__STATE_INVARIANT);
			childrenFeatures.add(UMLPackage.Literals.STATE__ENTRY);
			childrenFeatures.add(UMLPackage.Literals.STATE__EXIT);
			childrenFeatures.add(UMLPackage.Literals.STATE__DO_ACTIVITY);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns State.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/State"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((State) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_State_type")
				: getString("_UI_State_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(State.class)) {
		case UMLPackage.STATE__IS_COMPOSITE:
		case UMLPackage.STATE__IS_ORTHOGONAL:
		case UMLPackage.STATE__IS_SIMPLE:
		case UMLPackage.STATE__IS_SUBMACHINE_STATE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case UMLPackage.STATE__REGION:
		case UMLPackage.STATE__CONNECTION:
		case UMLPackage.STATE__CONNECTION_POINT:
		case UMLPackage.STATE__DEFERRABLE_TRIGGER:
		case UMLPackage.STATE__STATE_INVARIANT:
		case UMLPackage.STATE__ENTRY:
		case UMLPackage.STATE__EXIT:
		case UMLPackage.STATE__DO_ACTIVITY:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors
				.add(createChildParameter(UMLPackage.Literals.STATE__REGION, UMLFactory.eINSTANCE.createRegion()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.STATE__CONNECTION,
				UMLFactory.eINSTANCE.createConnectionPointReference()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.STATE__CONNECTION_POINT,
				UMLFactory.eINSTANCE.createPseudostate()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.STATE__DEFERRABLE_TRIGGER,
				UMLFactory.eINSTANCE.createTrigger()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.STATE__STATE_INVARIANT,
				UMLFactory.eINSTANCE.createConstraint()));

		newChildDescriptors
				.add(createChildParameter(UMLPackage.Literals.STATE__ENTRY, UMLFactory.eINSTANCE.createStateMachine()));

		newChildDescriptors
				.add(createChildParameter(UMLPackage.Literals.STATE__ENTRY, UMLFactory.eINSTANCE.createSetValue()));

		newChildDescriptors
				.add(createChildParameter(UMLPackage.Literals.STATE__ENTRY, UMLFactory.eINSTANCE.createSendEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.STATE__ENTRY,
				ProblemFrameFactory.eINSTANCE.createMyStateMachine()));

		newChildDescriptors
				.add(createChildParameter(UMLPackage.Literals.STATE__EXIT, UMLFactory.eINSTANCE.createStateMachine()));

		newChildDescriptors
				.add(createChildParameter(UMLPackage.Literals.STATE__EXIT, UMLFactory.eINSTANCE.createSetValue()));

		newChildDescriptors
				.add(createChildParameter(UMLPackage.Literals.STATE__EXIT, UMLFactory.eINSTANCE.createSendEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.STATE__EXIT,
				ProblemFrameFactory.eINSTANCE.createMyStateMachine()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.STATE__DO_ACTIVITY,
				UMLFactory.eINSTANCE.createStateMachine()));

		newChildDescriptors.add(
				createChildParameter(UMLPackage.Literals.STATE__DO_ACTIVITY, UMLFactory.eINSTANCE.createSetValue()));

		newChildDescriptors.add(
				createChildParameter(UMLPackage.Literals.STATE__DO_ACTIVITY, UMLFactory.eINSTANCE.createSendEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.STATE__DO_ACTIVITY,
				ProblemFrameFactory.eINSTANCE.createMyStateMachine()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == UMLPackage.Literals.STATE__ENTRY
				|| childFeature == UMLPackage.Literals.STATE__EXIT
				|| childFeature == UMLPackage.Literals.STATE__DO_ACTIVITY;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
