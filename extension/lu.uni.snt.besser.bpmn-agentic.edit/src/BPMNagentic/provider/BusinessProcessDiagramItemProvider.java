/**
 */
package BPMNagentic.provider;


import BPMNagentic.BPMNagenticFactory;
import BPMNagentic.BPMNagenticPackage;
import BPMNagentic.BusinessProcessDiagram;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link BPMNagentic.BusinessProcessDiagram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BusinessProcessDiagramItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessProcessDiagramItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS);
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
	 * This returns BusinessProcessDiagram.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BusinessProcessDiagram"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_BusinessProcessDiagram_type");
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

		switch (notification.getFeatureID(BusinessProcessDiagram.class)) {
			case BPMNagenticPackage.BUSINESS_PROCESS_DIAGRAM__ELEMENTS:
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

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				 BPMNagenticFactory.eINSTANCE.createBPMNElement()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				 BPMNagenticFactory.eINSTANCE.createLane()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				 BPMNagenticFactory.eINSTANCE.createAgenticLane()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				 BPMNagenticFactory.eINSTANCE.createPool()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				 BPMNagenticFactory.eINSTANCE.createMessageFlow()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				 BPMNagenticFactory.eINSTANCE.createSequenceFlow()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				 BPMNagenticFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				 BPMNagenticFactory.eINSTANCE.createXOR()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				 BPMNagenticFactory.eINSTANCE.createOR()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				 BPMNagenticFactory.eINSTANCE.createAND()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				 BPMNagenticFactory.eINSTANCE.createAgenticGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				 BPMNagenticFactory.eINSTANCE.createDivergingAgenticANDRole()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				 BPMNagenticFactory.eINSTANCE.createDivergingAgenticANDVoting()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				 BPMNagenticFactory.eINSTANCE.createDivergingAgenticANDDebate()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				 BPMNagenticFactory.eINSTANCE.createDivergingAgenticANDCompetition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				 BPMNagenticFactory.eINSTANCE.createMergingAgenticANDRoleLeader()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				 BPMNagenticFactory.eINSTANCE.createMergingAgenticANDRoleComposed()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				 BPMNagenticFactory.eINSTANCE.createMergingAgenticANDCompetitionFastest()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				 BPMNagenticFactory.eINSTANCE.createMergingAgenticANDCompetitionMostComplete()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				 BPMNagenticFactory.eINSTANCE.createMergingAgenticANDVotingAbsoluteMajority()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				 BPMNagenticFactory.eINSTANCE.createMergingAgenticANDVotingMajority()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				 BPMNagenticFactory.eINSTANCE.createMergingAgenticANDVotingMinority()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				 BPMNagenticFactory.eINSTANCE.createDivergingAgenticORVoting()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				 BPMNagenticFactory.eINSTANCE.createDivergingAgenticORDebate()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				 BPMNagenticFactory.eINSTANCE.createDivergingAgenticORCompetition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				 BPMNagenticFactory.eINSTANCE.createMergingAgenticORRoleLeader()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				 BPMNagenticFactory.eINSTANCE.createMergingAgenticORRoleComposed()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				 BPMNagenticFactory.eINSTANCE.createMergingAgenticORCompetitionFastest()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				 BPMNagenticFactory.eINSTANCE.createMergingAgenticORCompetitionMostComplete()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				 BPMNagenticFactory.eINSTANCE.createMergingAgenticORVotingAbsoluteMajority()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				 BPMNagenticFactory.eINSTANCE.createMergingAgenticORVotingMajority()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				 BPMNagenticFactory.eINSTANCE.createMergingAgenticORVotingMinority()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				 BPMNagenticFactory.eINSTANCE.createStartEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				 BPMNagenticFactory.eINSTANCE.createIntermediateEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				 BPMNagenticFactory.eINSTANCE.createEndEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				 BPMNagenticFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				 BPMNagenticFactory.eINSTANCE.createAgenticTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				 BPMNagenticFactory.eINSTANCE.createDataObject()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				 BPMNagenticFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				 BPMNagenticFactory.eINSTANCE.createAgentic()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				 BPMNagenticFactory.eINSTANCE.createAgentWorker()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				 BPMNagenticFactory.eINSTANCE.createAgentManager()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				 BPMNagenticFactory.eINSTANCE.createSelfReflection()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				 BPMNagenticFactory.eINSTANCE.createCrossReflection()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.BUSINESS_PROCESS_DIAGRAM__ELEMENTS,
				 BPMNagenticFactory.eINSTANCE.createHumanReflection()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return BPMNagenticEditPlugin.INSTANCE;
	}

}
