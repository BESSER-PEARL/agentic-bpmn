/**
 */
package BPMNagentic.provider;


import BPMNagentic.AgenticLane;
import BPMNagentic.BPMNagenticFactory;
import BPMNagentic.BPMNagenticPackage;

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
 * This is the item provider adapter for a {@link BPMNagentic.AgenticLane} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AgenticLaneItemProvider extends SwimlaneItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgenticLaneItemProvider(AdapterFactory adapterFactory) {
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

			addUncertaintyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Uncertainty feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUncertaintyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AgenticLane_uncertainty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AgenticLane_uncertainty_feature", "_UI_AgenticLane_type"),
				 BPMNagenticPackage.Literals.AGENTIC_LANE__UNCERTAINTY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(BPMNagenticPackage.Literals.AGENTIC_LANE__FLOW_OBJECTS);
			childrenFeatures.add(BPMNagenticPackage.Literals.AGENTIC_LANE__AGENT_ROLE);
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
	 * This returns AgenticLane.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AgenticLane"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AgenticLane)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AgenticLane_type") :
			getString("_UI_AgenticLane_type") + " " + label;
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

		switch (notification.getFeatureID(AgenticLane.class)) {
			case BPMNagenticPackage.AGENTIC_LANE__UNCERTAINTY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BPMNagenticPackage.AGENTIC_LANE__FLOW_OBJECTS:
			case BPMNagenticPackage.AGENTIC_LANE__AGENT_ROLE:
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
				(BPMNagenticPackage.Literals.AGENTIC_LANE__FLOW_OBJECTS,
				 BPMNagenticFactory.eINSTANCE.createXOR()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.AGENTIC_LANE__FLOW_OBJECTS,
				 BPMNagenticFactory.eINSTANCE.createOR()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.AGENTIC_LANE__FLOW_OBJECTS,
				 BPMNagenticFactory.eINSTANCE.createAND()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.AGENTIC_LANE__FLOW_OBJECTS,
				 BPMNagenticFactory.eINSTANCE.createAgenticGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.AGENTIC_LANE__FLOW_OBJECTS,
				 BPMNagenticFactory.eINSTANCE.createDivergingAgenticANDRole()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.AGENTIC_LANE__FLOW_OBJECTS,
				 BPMNagenticFactory.eINSTANCE.createDivergingAgenticANDVoting()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.AGENTIC_LANE__FLOW_OBJECTS,
				 BPMNagenticFactory.eINSTANCE.createDivergingAgenticANDDebate()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.AGENTIC_LANE__FLOW_OBJECTS,
				 BPMNagenticFactory.eINSTANCE.createDivergingAgenticANDCompetition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.AGENTIC_LANE__FLOW_OBJECTS,
				 BPMNagenticFactory.eINSTANCE.createMergingAgenticANDRoleLeader()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.AGENTIC_LANE__FLOW_OBJECTS,
				 BPMNagenticFactory.eINSTANCE.createMergingAgenticANDRoleComposed()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.AGENTIC_LANE__FLOW_OBJECTS,
				 BPMNagenticFactory.eINSTANCE.createMergingAgenticANDCompetitionFastest()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.AGENTIC_LANE__FLOW_OBJECTS,
				 BPMNagenticFactory.eINSTANCE.createMergingAgenticANDCompetitionMostComplete()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.AGENTIC_LANE__FLOW_OBJECTS,
				 BPMNagenticFactory.eINSTANCE.createMergingAgenticANDVotingAbsoluteMajority()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.AGENTIC_LANE__FLOW_OBJECTS,
				 BPMNagenticFactory.eINSTANCE.createMergingAgenticANDVotingMajority()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.AGENTIC_LANE__FLOW_OBJECTS,
				 BPMNagenticFactory.eINSTANCE.createMergingAgenticANDVotingMinority()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.AGENTIC_LANE__FLOW_OBJECTS,
				 BPMNagenticFactory.eINSTANCE.createDivergingAgenticORVoting()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.AGENTIC_LANE__FLOW_OBJECTS,
				 BPMNagenticFactory.eINSTANCE.createDivergingAgenticORDebate()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.AGENTIC_LANE__FLOW_OBJECTS,
				 BPMNagenticFactory.eINSTANCE.createDivergingAgenticORCompetition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.AGENTIC_LANE__FLOW_OBJECTS,
				 BPMNagenticFactory.eINSTANCE.createMergingAgenticORRoleLeader()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.AGENTIC_LANE__FLOW_OBJECTS,
				 BPMNagenticFactory.eINSTANCE.createMergingAgenticORRoleComposed()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.AGENTIC_LANE__FLOW_OBJECTS,
				 BPMNagenticFactory.eINSTANCE.createMergingAgenticORCompetitionFastest()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.AGENTIC_LANE__FLOW_OBJECTS,
				 BPMNagenticFactory.eINSTANCE.createMergingAgenticORCompetitionMostComplete()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.AGENTIC_LANE__FLOW_OBJECTS,
				 BPMNagenticFactory.eINSTANCE.createMergingAgenticORVotingAbsoluteMajority()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.AGENTIC_LANE__FLOW_OBJECTS,
				 BPMNagenticFactory.eINSTANCE.createMergingAgenticORVotingMajority()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.AGENTIC_LANE__FLOW_OBJECTS,
				 BPMNagenticFactory.eINSTANCE.createMergingAgenticORVotingMinority()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.AGENTIC_LANE__FLOW_OBJECTS,
				 BPMNagenticFactory.eINSTANCE.createStartEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.AGENTIC_LANE__FLOW_OBJECTS,
				 BPMNagenticFactory.eINSTANCE.createIntermediateEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.AGENTIC_LANE__FLOW_OBJECTS,
				 BPMNagenticFactory.eINSTANCE.createEndEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.AGENTIC_LANE__FLOW_OBJECTS,
				 BPMNagenticFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.AGENTIC_LANE__FLOW_OBJECTS,
				 BPMNagenticFactory.eINSTANCE.createAgenticTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.AGENTIC_LANE__AGENT_ROLE,
				 BPMNagenticFactory.eINSTANCE.createAgentWorker()));

		newChildDescriptors.add
			(createChildParameter
				(BPMNagenticPackage.Literals.AGENTIC_LANE__AGENT_ROLE,
				 BPMNagenticFactory.eINSTANCE.createAgentManager()));
	}

}
