/**
 */
package BPMNagentic.util;

import BPMNagentic.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see BPMNagentic.BPMNagenticPackage
 * @generated
 */
public class BPMNagenticAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BPMNagenticPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNagenticAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BPMNagenticPackage.eINSTANCE;
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
	protected BPMNagenticSwitch<Adapter> modelSwitch =
		new BPMNagenticSwitch<Adapter>() {
			@Override
			public Adapter caseBusinessProcessDiagram(BusinessProcessDiagram object) {
				return createBusinessProcessDiagramAdapter();
			}
			@Override
			public Adapter caseBPMNElement(BPMNElement object) {
				return createBPMNElementAdapter();
			}
			@Override
			public Adapter caseSwimlane(Swimlane object) {
				return createSwimlaneAdapter();
			}
			@Override
			public Adapter caseLane(Lane object) {
				return createLaneAdapter();
			}
			@Override
			public Adapter caseAgenticLane(AgenticLane object) {
				return createAgenticLaneAdapter();
			}
			@Override
			public Adapter casePool(Pool object) {
				return createPoolAdapter();
			}
			@Override
			public Adapter caseConnectingObject(ConnectingObject object) {
				return createConnectingObjectAdapter();
			}
			@Override
			public Adapter caseMessageFlow(MessageFlow object) {
				return createMessageFlowAdapter();
			}
			@Override
			public Adapter caseSequenceFlow(SequenceFlow object) {
				return createSequenceFlowAdapter();
			}
			@Override
			public Adapter caseAssociation(Association object) {
				return createAssociationAdapter();
			}
			@Override
			public Adapter caseFlowObject(FlowObject object) {
				return createFlowObjectAdapter();
			}
			@Override
			public Adapter caseGateway(Gateway object) {
				return createGatewayAdapter();
			}
			@Override
			public Adapter caseXOR(XOR object) {
				return createXORAdapter();
			}
			@Override
			public Adapter caseOR(OR object) {
				return createORAdapter();
			}
			@Override
			public Adapter caseAND(AND object) {
				return createANDAdapter();
			}
			@Override
			public Adapter caseAgenticGateway(AgenticGateway object) {
				return createAgenticGatewayAdapter();
			}
			@Override
			public Adapter caseDivergingAgenticANDRole(DivergingAgenticANDRole object) {
				return createDivergingAgenticANDRoleAdapter();
			}
			@Override
			public Adapter caseDivergingAgenticANDVoting(DivergingAgenticANDVoting object) {
				return createDivergingAgenticANDVotingAdapter();
			}
			@Override
			public Adapter caseDivergingAgenticANDDebate(DivergingAgenticANDDebate object) {
				return createDivergingAgenticANDDebateAdapter();
			}
			@Override
			public Adapter caseDivergingAgenticANDCompetition(DivergingAgenticANDCompetition object) {
				return createDivergingAgenticANDCompetitionAdapter();
			}
			@Override
			public Adapter caseMergingAgenticANDRoleLeader(MergingAgenticANDRoleLeader object) {
				return createMergingAgenticANDRoleLeaderAdapter();
			}
			@Override
			public Adapter caseMergingAgenticANDRoleComposed(MergingAgenticANDRoleComposed object) {
				return createMergingAgenticANDRoleComposedAdapter();
			}
			@Override
			public Adapter caseMergingAgenticANDCompetitionFastest(MergingAgenticANDCompetitionFastest object) {
				return createMergingAgenticANDCompetitionFastestAdapter();
			}
			@Override
			public Adapter caseMergingAgenticANDCompetitionMostComplete(MergingAgenticANDCompetitionMostComplete object) {
				return createMergingAgenticANDCompetitionMostCompleteAdapter();
			}
			@Override
			public Adapter caseMergingAgenticANDVotingAbsoluteMajority(MergingAgenticANDVotingAbsoluteMajority object) {
				return createMergingAgenticANDVotingAbsoluteMajorityAdapter();
			}
			@Override
			public Adapter caseMergingAgenticANDVotingMajority(MergingAgenticANDVotingMajority object) {
				return createMergingAgenticANDVotingMajorityAdapter();
			}
			@Override
			public Adapter caseMergingAgenticANDVotingMinority(MergingAgenticANDVotingMinority object) {
				return createMergingAgenticANDVotingMinorityAdapter();
			}
			@Override
			public Adapter caseDivergingAgenticORVoting(DivergingAgenticORVoting object) {
				return createDivergingAgenticORVotingAdapter();
			}
			@Override
			public Adapter caseDivergingAgenticORDebate(DivergingAgenticORDebate object) {
				return createDivergingAgenticORDebateAdapter();
			}
			@Override
			public Adapter caseDivergingAgenticORCompetition(DivergingAgenticORCompetition object) {
				return createDivergingAgenticORCompetitionAdapter();
			}
			@Override
			public Adapter caseMergingAgenticORRoleLeader(MergingAgenticORRoleLeader object) {
				return createMergingAgenticORRoleLeaderAdapter();
			}
			@Override
			public Adapter caseMergingAgenticORRoleComposed(MergingAgenticORRoleComposed object) {
				return createMergingAgenticORRoleComposedAdapter();
			}
			@Override
			public Adapter caseMergingAgenticORCompetitionFastest(MergingAgenticORCompetitionFastest object) {
				return createMergingAgenticORCompetitionFastestAdapter();
			}
			@Override
			public Adapter caseMergingAgenticORCompetitionMostComplete(MergingAgenticORCompetitionMostComplete object) {
				return createMergingAgenticORCompetitionMostCompleteAdapter();
			}
			@Override
			public Adapter caseMergingAgenticORVotingAbsoluteMajority(MergingAgenticORVotingAbsoluteMajority object) {
				return createMergingAgenticORVotingAbsoluteMajorityAdapter();
			}
			@Override
			public Adapter caseMergingAgenticORVotingMajority(MergingAgenticORVotingMajority object) {
				return createMergingAgenticORVotingMajorityAdapter();
			}
			@Override
			public Adapter caseMergingAgenticORVotingMinority(MergingAgenticORVotingMinority object) {
				return createMergingAgenticORVotingMinorityAdapter();
			}
			@Override
			public Adapter caseStartEvent(StartEvent object) {
				return createStartEventAdapter();
			}
			@Override
			public Adapter caseIntermediateEvent(IntermediateEvent object) {
				return createIntermediateEventAdapter();
			}
			@Override
			public Adapter caseEndEvent(EndEvent object) {
				return createEndEventAdapter();
			}
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter caseAgenticTask(AgenticTask object) {
				return createAgenticTaskAdapter();
			}
			@Override
			public Adapter caseArtifact(Artifact object) {
				return createArtifactAdapter();
			}
			@Override
			public Adapter caseDataObject(DataObject object) {
				return createDataObjectAdapter();
			}
			@Override
			public Adapter caseGroup(Group object) {
				return createGroupAdapter();
			}
			@Override
			public Adapter caseAgent(Agent object) {
				return createAgentAdapter();
			}
			@Override
			public Adapter caseAgentic(Agentic object) {
				return createAgenticAdapter();
			}
			@Override
			public Adapter caseAgentRole(AgentRole object) {
				return createAgentRoleAdapter();
			}
			@Override
			public Adapter caseAgentWorker(AgentWorker object) {
				return createAgentWorkerAdapter();
			}
			@Override
			public Adapter caseAgentManager(AgentManager object) {
				return createAgentManagerAdapter();
			}
			@Override
			public Adapter caseReflectionMode(ReflectionMode object) {
				return createReflectionModeAdapter();
			}
			@Override
			public Adapter caseSelfReflection(SelfReflection object) {
				return createSelfReflectionAdapter();
			}
			@Override
			public Adapter caseCrossReflection(CrossReflection object) {
				return createCrossReflectionAdapter();
			}
			@Override
			public Adapter caseHumanReflection(HumanReflection object) {
				return createHumanReflectionAdapter();
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
	 * Creates a new adapter for an object of class '{@link BPMNagentic.BusinessProcessDiagram <em>Business Process Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.BusinessProcessDiagram
	 * @generated
	 */
	public Adapter createBusinessProcessDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.BPMNElement <em>BPMN Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.BPMNElement
	 * @generated
	 */
	public Adapter createBPMNElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.Swimlane <em>Swimlane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.Swimlane
	 * @generated
	 */
	public Adapter createSwimlaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.Lane <em>Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.Lane
	 * @generated
	 */
	public Adapter createLaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.AgenticLane <em>Agentic Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.AgenticLane
	 * @generated
	 */
	public Adapter createAgenticLaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.Pool <em>Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.Pool
	 * @generated
	 */
	public Adapter createPoolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.ConnectingObject <em>Connecting Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.ConnectingObject
	 * @generated
	 */
	public Adapter createConnectingObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.MessageFlow <em>Message Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.MessageFlow
	 * @generated
	 */
	public Adapter createMessageFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.SequenceFlow <em>Sequence Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.SequenceFlow
	 * @generated
	 */
	public Adapter createSequenceFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.Association
	 * @generated
	 */
	public Adapter createAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.FlowObject <em>Flow Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.FlowObject
	 * @generated
	 */
	public Adapter createFlowObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.Gateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.Gateway
	 * @generated
	 */
	public Adapter createGatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.XOR <em>XOR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.XOR
	 * @generated
	 */
	public Adapter createXORAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.OR <em>OR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.OR
	 * @generated
	 */
	public Adapter createORAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.AND <em>AND</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.AND
	 * @generated
	 */
	public Adapter createANDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.AgenticGateway <em>Agentic Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.AgenticGateway
	 * @generated
	 */
	public Adapter createAgenticGatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.DivergingAgenticANDRole <em>Diverging Agentic AND Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.DivergingAgenticANDRole
	 * @generated
	 */
	public Adapter createDivergingAgenticANDRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.DivergingAgenticANDVoting <em>Diverging Agentic AND Voting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.DivergingAgenticANDVoting
	 * @generated
	 */
	public Adapter createDivergingAgenticANDVotingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.DivergingAgenticANDDebate <em>Diverging Agentic AND Debate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.DivergingAgenticANDDebate
	 * @generated
	 */
	public Adapter createDivergingAgenticANDDebateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.DivergingAgenticANDCompetition <em>Diverging Agentic AND Competition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.DivergingAgenticANDCompetition
	 * @generated
	 */
	public Adapter createDivergingAgenticANDCompetitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.MergingAgenticANDRoleLeader <em>Merging Agentic AND Role Leader</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.MergingAgenticANDRoleLeader
	 * @generated
	 */
	public Adapter createMergingAgenticANDRoleLeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.MergingAgenticANDRoleComposed <em>Merging Agentic AND Role Composed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.MergingAgenticANDRoleComposed
	 * @generated
	 */
	public Adapter createMergingAgenticANDRoleComposedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.MergingAgenticANDCompetitionFastest <em>Merging Agentic AND Competition Fastest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.MergingAgenticANDCompetitionFastest
	 * @generated
	 */
	public Adapter createMergingAgenticANDCompetitionFastestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.MergingAgenticANDCompetitionMostComplete <em>Merging Agentic AND Competition Most Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.MergingAgenticANDCompetitionMostComplete
	 * @generated
	 */
	public Adapter createMergingAgenticANDCompetitionMostCompleteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.MergingAgenticANDVotingAbsoluteMajority <em>Merging Agentic AND Voting Absolute Majority</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.MergingAgenticANDVotingAbsoluteMajority
	 * @generated
	 */
	public Adapter createMergingAgenticANDVotingAbsoluteMajorityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.MergingAgenticANDVotingMajority <em>Merging Agentic AND Voting Majority</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.MergingAgenticANDVotingMajority
	 * @generated
	 */
	public Adapter createMergingAgenticANDVotingMajorityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.MergingAgenticANDVotingMinority <em>Merging Agentic AND Voting Minority</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.MergingAgenticANDVotingMinority
	 * @generated
	 */
	public Adapter createMergingAgenticANDVotingMinorityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.DivergingAgenticORVoting <em>Diverging Agentic OR Voting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.DivergingAgenticORVoting
	 * @generated
	 */
	public Adapter createDivergingAgenticORVotingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.DivergingAgenticORDebate <em>Diverging Agentic OR Debate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.DivergingAgenticORDebate
	 * @generated
	 */
	public Adapter createDivergingAgenticORDebateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.DivergingAgenticORCompetition <em>Diverging Agentic OR Competition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.DivergingAgenticORCompetition
	 * @generated
	 */
	public Adapter createDivergingAgenticORCompetitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.MergingAgenticORRoleLeader <em>Merging Agentic OR Role Leader</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.MergingAgenticORRoleLeader
	 * @generated
	 */
	public Adapter createMergingAgenticORRoleLeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.MergingAgenticORRoleComposed <em>Merging Agentic OR Role Composed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.MergingAgenticORRoleComposed
	 * @generated
	 */
	public Adapter createMergingAgenticORRoleComposedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.MergingAgenticORCompetitionFastest <em>Merging Agentic OR Competition Fastest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.MergingAgenticORCompetitionFastest
	 * @generated
	 */
	public Adapter createMergingAgenticORCompetitionFastestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.MergingAgenticORCompetitionMostComplete <em>Merging Agentic OR Competition Most Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.MergingAgenticORCompetitionMostComplete
	 * @generated
	 */
	public Adapter createMergingAgenticORCompetitionMostCompleteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.MergingAgenticORVotingAbsoluteMajority <em>Merging Agentic OR Voting Absolute Majority</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.MergingAgenticORVotingAbsoluteMajority
	 * @generated
	 */
	public Adapter createMergingAgenticORVotingAbsoluteMajorityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.MergingAgenticORVotingMajority <em>Merging Agentic OR Voting Majority</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.MergingAgenticORVotingMajority
	 * @generated
	 */
	public Adapter createMergingAgenticORVotingMajorityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.MergingAgenticORVotingMinority <em>Merging Agentic OR Voting Minority</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.MergingAgenticORVotingMinority
	 * @generated
	 */
	public Adapter createMergingAgenticORVotingMinorityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.StartEvent <em>Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.StartEvent
	 * @generated
	 */
	public Adapter createStartEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.IntermediateEvent <em>Intermediate Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.IntermediateEvent
	 * @generated
	 */
	public Adapter createIntermediateEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.EndEvent <em>End Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.EndEvent
	 * @generated
	 */
	public Adapter createEndEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.AgenticTask <em>Agentic Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.AgenticTask
	 * @generated
	 */
	public Adapter createAgenticTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.Artifact
	 * @generated
	 */
	public Adapter createArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.DataObject <em>Data Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.DataObject
	 * @generated
	 */
	public Adapter createDataObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.Group
	 * @generated
	 */
	public Adapter createGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.Agent
	 * @generated
	 */
	public Adapter createAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.Agentic <em>Agentic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.Agentic
	 * @generated
	 */
	public Adapter createAgenticAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.AgentRole <em>Agent Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.AgentRole
	 * @generated
	 */
	public Adapter createAgentRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.AgentWorker <em>Agent Worker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.AgentWorker
	 * @generated
	 */
	public Adapter createAgentWorkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.AgentManager <em>Agent Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.AgentManager
	 * @generated
	 */
	public Adapter createAgentManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.ReflectionMode <em>Reflection Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.ReflectionMode
	 * @generated
	 */
	public Adapter createReflectionModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.SelfReflection <em>Self Reflection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.SelfReflection
	 * @generated
	 */
	public Adapter createSelfReflectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.CrossReflection <em>Cross Reflection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.CrossReflection
	 * @generated
	 */
	public Adapter createCrossReflectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMNagentic.HumanReflection <em>Human Reflection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMNagentic.HumanReflection
	 * @generated
	 */
	public Adapter createHumanReflectionAdapter() {
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

} //BPMNagenticAdapterFactory
