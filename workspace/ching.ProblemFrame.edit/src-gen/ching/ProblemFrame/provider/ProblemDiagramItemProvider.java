/**
 */
package ching.ProblemFrame.provider;

import ching.ProblemFrame.ProblemDiagram;
import ching.ProblemFrame.ProblemFrameFactory;
import ching.ProblemFrame.ProblemFramePackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ching.ProblemFrame.ProblemDiagram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProblemDiagramItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemDiagramItemProvider(AdapterFactory adapterFactory) {
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

			addProblemNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Problem Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProblemNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ProblemDiagram_problemName_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ProblemDiagram_problemName_feature",
								"_UI_ProblemDiagram_type"),
						ProblemFramePackage.Literals.PROBLEM_DIAGRAM__PROBLEM_NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(ProblemFramePackage.Literals.PROBLEM_DIAGRAM__DOMAIN);
			childrenFeatures.add(ProblemFramePackage.Literals.PROBLEM_DIAGRAM__REQUIREMENT);
			childrenFeatures.add(ProblemFramePackage.Literals.PROBLEM_DIAGRAM__INTERFACES);
			childrenFeatures.add(ProblemFramePackage.Literals.PROBLEM_DIAGRAM__REFERENCE);
			childrenFeatures.add(ProblemFramePackage.Literals.PROBLEM_DIAGRAM__STATEMACHINE);
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
	 * This returns ProblemDiagram.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ProblemDiagram"));
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
		String label = ((ProblemDiagram) object).getProblemName();
		return label == null || label.length() == 0 ? getString("_UI_ProblemDiagram_type")
				: getString("_UI_ProblemDiagram_type") + " " + label;
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

		switch (notification.getFeatureID(ProblemDiagram.class)) {
		case ProblemFramePackage.PROBLEM_DIAGRAM__PROBLEM_NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case ProblemFramePackage.PROBLEM_DIAGRAM__DOMAIN:
		case ProblemFramePackage.PROBLEM_DIAGRAM__REQUIREMENT:
		case ProblemFramePackage.PROBLEM_DIAGRAM__INTERFACES:
		case ProblemFramePackage.PROBLEM_DIAGRAM__REFERENCE:
		case ProblemFramePackage.PROBLEM_DIAGRAM__STATEMACHINE:
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

		newChildDescriptors.add(createChildParameter(ProblemFramePackage.Literals.PROBLEM_DIAGRAM__DOMAIN,
				ProblemFrameFactory.eINSTANCE.createMachine()));

		newChildDescriptors.add(createChildParameter(ProblemFramePackage.Literals.PROBLEM_DIAGRAM__DOMAIN,
				ProblemFrameFactory.eINSTANCE.createInternalCausalDomain()));

		newChildDescriptors.add(createChildParameter(ProblemFramePackage.Literals.PROBLEM_DIAGRAM__DOMAIN,
				ProblemFrameFactory.eINSTANCE.createLexicalDomain()));

		newChildDescriptors.add(createChildParameter(ProblemFramePackage.Literals.PROBLEM_DIAGRAM__DOMAIN,
				ProblemFrameFactory.eINSTANCE.createHuman()));

		newChildDescriptors.add(createChildParameter(ProblemFramePackage.Literals.PROBLEM_DIAGRAM__DOMAIN,
				ProblemFrameFactory.eINSTANCE.createExternalCausalDomain()));

		newChildDescriptors.add(createChildParameter(ProblemFramePackage.Literals.PROBLEM_DIAGRAM__DOMAIN,
				ProblemFrameFactory.eINSTANCE.createExternalBiddableDomain()));

		newChildDescriptors.add(createChildParameter(ProblemFramePackage.Literals.PROBLEM_DIAGRAM__REQUIREMENT,
				ProblemFrameFactory.eINSTANCE.createRequirement()));

		newChildDescriptors.add(createChildParameter(ProblemFramePackage.Literals.PROBLEM_DIAGRAM__INTERFACES,
				ProblemFrameFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add(createChildParameter(ProblemFramePackage.Literals.PROBLEM_DIAGRAM__REFERENCE,
				ProblemFrameFactory.eINSTANCE.createRequirementReference()));

		newChildDescriptors.add(createChildParameter(ProblemFramePackage.Literals.PROBLEM_DIAGRAM__REFERENCE,
				ProblemFrameFactory.eINSTANCE.createConstrainingRequirementReference()));

		newChildDescriptors.add(createChildParameter(ProblemFramePackage.Literals.PROBLEM_DIAGRAM__STATEMACHINE,
				ProblemFrameFactory.eINSTANCE.createMyStateMachine()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ProblemFrameEditPlugin.INSTANCE;
	}

}
