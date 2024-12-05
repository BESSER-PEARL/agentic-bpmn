/**
 */
package BPMNagentic.util;

import BPMNagentic.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see BPMNagentic.BPMNagenticPackage
 * @generated
 */
public class BPMNagenticSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BPMNagenticPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNagenticSwitch() {
		if (modelPackage == null) {
			modelPackage = BPMNagenticPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BPMNagenticPackage.BUSINESS_PROCESS_DIAGRAM: {
				BusinessProcessDiagram businessProcessDiagram = (BusinessProcessDiagram)theEObject;
				T result = caseBusinessProcessDiagram(businessProcessDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.BPMN_ELEMENT: {
				BPMNElement bpmnElement = (BPMNElement)theEObject;
				T result = caseBPMNElement(bpmnElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.SWIMLANE: {
				Swimlane swimlane = (Swimlane)theEObject;
				T result = caseSwimlane(swimlane);
				if (result == null) result = caseBPMNElement(swimlane);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.LANE: {
				Lane lane = (Lane)theEObject;
				T result = caseLane(lane);
				if (result == null) result = caseSwimlane(lane);
				if (result == null) result = caseBPMNElement(lane);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.AGENTIC_LANE: {
				AgenticLane agenticLane = (AgenticLane)theEObject;
				T result = caseAgenticLane(agenticLane);
				if (result == null) result = caseSwimlane(agenticLane);
				if (result == null) result = caseBPMNElement(agenticLane);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.POOL: {
				Pool pool = (Pool)theEObject;
				T result = casePool(pool);
				if (result == null) result = caseSwimlane(pool);
				if (result == null) result = caseBPMNElement(pool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.CONNECTING_OBJECT: {
				ConnectingObject connectingObject = (ConnectingObject)theEObject;
				T result = caseConnectingObject(connectingObject);
				if (result == null) result = caseBPMNElement(connectingObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.MESSAGE_FLOW: {
				MessageFlow messageFlow = (MessageFlow)theEObject;
				T result = caseMessageFlow(messageFlow);
				if (result == null) result = caseConnectingObject(messageFlow);
				if (result == null) result = caseBPMNElement(messageFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.SEQUENCE_FLOW: {
				SequenceFlow sequenceFlow = (SequenceFlow)theEObject;
				T result = caseSequenceFlow(sequenceFlow);
				if (result == null) result = caseConnectingObject(sequenceFlow);
				if (result == null) result = caseBPMNElement(sequenceFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.ASSOCIATION: {
				Association association = (Association)theEObject;
				T result = caseAssociation(association);
				if (result == null) result = caseConnectingObject(association);
				if (result == null) result = caseBPMNElement(association);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.FLOW_OBJECT: {
				FlowObject flowObject = (FlowObject)theEObject;
				T result = caseFlowObject(flowObject);
				if (result == null) result = caseBPMNElement(flowObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.GATEWAY: {
				Gateway gateway = (Gateway)theEObject;
				T result = caseGateway(gateway);
				if (result == null) result = caseFlowObject(gateway);
				if (result == null) result = caseBPMNElement(gateway);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.XOR: {
				XOR xor = (XOR)theEObject;
				T result = caseXOR(xor);
				if (result == null) result = caseGateway(xor);
				if (result == null) result = caseFlowObject(xor);
				if (result == null) result = caseBPMNElement(xor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.OR: {
				OR or = (OR)theEObject;
				T result = caseOR(or);
				if (result == null) result = caseGateway(or);
				if (result == null) result = caseFlowObject(or);
				if (result == null) result = caseBPMNElement(or);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.AND: {
				AND and = (AND)theEObject;
				T result = caseAND(and);
				if (result == null) result = caseGateway(and);
				if (result == null) result = caseFlowObject(and);
				if (result == null) result = caseBPMNElement(and);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.AGENTIC_GATEWAY: {
				AgenticGateway agenticGateway = (AgenticGateway)theEObject;
				T result = caseAgenticGateway(agenticGateway);
				if (result == null) result = caseGateway(agenticGateway);
				if (result == null) result = caseFlowObject(agenticGateway);
				if (result == null) result = caseBPMNElement(agenticGateway);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.DIVERGING_AGENTIC_AND_ROLE: {
				DivergingAgenticANDRole divergingAgenticANDRole = (DivergingAgenticANDRole)theEObject;
				T result = caseDivergingAgenticANDRole(divergingAgenticANDRole);
				if (result == null) result = caseAgenticGateway(divergingAgenticANDRole);
				if (result == null) result = caseGateway(divergingAgenticANDRole);
				if (result == null) result = caseFlowObject(divergingAgenticANDRole);
				if (result == null) result = caseBPMNElement(divergingAgenticANDRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.DIVERGING_AGENTIC_AND_VOTING: {
				DivergingAgenticANDVoting divergingAgenticANDVoting = (DivergingAgenticANDVoting)theEObject;
				T result = caseDivergingAgenticANDVoting(divergingAgenticANDVoting);
				if (result == null) result = caseAgenticGateway(divergingAgenticANDVoting);
				if (result == null) result = caseGateway(divergingAgenticANDVoting);
				if (result == null) result = caseFlowObject(divergingAgenticANDVoting);
				if (result == null) result = caseBPMNElement(divergingAgenticANDVoting);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.DIVERGING_AGENTIC_AND_DEBATE: {
				DivergingAgenticANDDebate divergingAgenticANDDebate = (DivergingAgenticANDDebate)theEObject;
				T result = caseDivergingAgenticANDDebate(divergingAgenticANDDebate);
				if (result == null) result = caseAgenticGateway(divergingAgenticANDDebate);
				if (result == null) result = caseGateway(divergingAgenticANDDebate);
				if (result == null) result = caseFlowObject(divergingAgenticANDDebate);
				if (result == null) result = caseBPMNElement(divergingAgenticANDDebate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.DIVERGING_AGENTIC_AND_COMPETITION: {
				DivergingAgenticANDCompetition divergingAgenticANDCompetition = (DivergingAgenticANDCompetition)theEObject;
				T result = caseDivergingAgenticANDCompetition(divergingAgenticANDCompetition);
				if (result == null) result = caseAgenticGateway(divergingAgenticANDCompetition);
				if (result == null) result = caseGateway(divergingAgenticANDCompetition);
				if (result == null) result = caseFlowObject(divergingAgenticANDCompetition);
				if (result == null) result = caseBPMNElement(divergingAgenticANDCompetition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.MERGING_AGENTIC_AND_ROLE_LEADER: {
				MergingAgenticANDRoleLeader mergingAgenticANDRoleLeader = (MergingAgenticANDRoleLeader)theEObject;
				T result = caseMergingAgenticANDRoleLeader(mergingAgenticANDRoleLeader);
				if (result == null) result = caseAgenticGateway(mergingAgenticANDRoleLeader);
				if (result == null) result = caseGateway(mergingAgenticANDRoleLeader);
				if (result == null) result = caseFlowObject(mergingAgenticANDRoleLeader);
				if (result == null) result = caseBPMNElement(mergingAgenticANDRoleLeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.MERGING_AGENTIC_AND_ROLE_COMPOSED: {
				MergingAgenticANDRoleComposed mergingAgenticANDRoleComposed = (MergingAgenticANDRoleComposed)theEObject;
				T result = caseMergingAgenticANDRoleComposed(mergingAgenticANDRoleComposed);
				if (result == null) result = caseAgenticGateway(mergingAgenticANDRoleComposed);
				if (result == null) result = caseGateway(mergingAgenticANDRoleComposed);
				if (result == null) result = caseFlowObject(mergingAgenticANDRoleComposed);
				if (result == null) result = caseBPMNElement(mergingAgenticANDRoleComposed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.MERGING_AGENTIC_AND_COMPETITION_FASTEST: {
				MergingAgenticANDCompetitionFastest mergingAgenticANDCompetitionFastest = (MergingAgenticANDCompetitionFastest)theEObject;
				T result = caseMergingAgenticANDCompetitionFastest(mergingAgenticANDCompetitionFastest);
				if (result == null) result = caseAgenticGateway(mergingAgenticANDCompetitionFastest);
				if (result == null) result = caseGateway(mergingAgenticANDCompetitionFastest);
				if (result == null) result = caseFlowObject(mergingAgenticANDCompetitionFastest);
				if (result == null) result = caseBPMNElement(mergingAgenticANDCompetitionFastest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.MERGING_AGENTIC_AND_COMPETITION_MOST_COMPLETE: {
				MergingAgenticANDCompetitionMostComplete mergingAgenticANDCompetitionMostComplete = (MergingAgenticANDCompetitionMostComplete)theEObject;
				T result = caseMergingAgenticANDCompetitionMostComplete(mergingAgenticANDCompetitionMostComplete);
				if (result == null) result = caseAgenticGateway(mergingAgenticANDCompetitionMostComplete);
				if (result == null) result = caseGateway(mergingAgenticANDCompetitionMostComplete);
				if (result == null) result = caseFlowObject(mergingAgenticANDCompetitionMostComplete);
				if (result == null) result = caseBPMNElement(mergingAgenticANDCompetitionMostComplete);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.MERGING_AGENTIC_AND_VOTING_ABSOLUTE_MAJORITY: {
				MergingAgenticANDVotingAbsoluteMajority mergingAgenticANDVotingAbsoluteMajority = (MergingAgenticANDVotingAbsoluteMajority)theEObject;
				T result = caseMergingAgenticANDVotingAbsoluteMajority(mergingAgenticANDVotingAbsoluteMajority);
				if (result == null) result = caseAgenticGateway(mergingAgenticANDVotingAbsoluteMajority);
				if (result == null) result = caseGateway(mergingAgenticANDVotingAbsoluteMajority);
				if (result == null) result = caseFlowObject(mergingAgenticANDVotingAbsoluteMajority);
				if (result == null) result = caseBPMNElement(mergingAgenticANDVotingAbsoluteMajority);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.MERGING_AGENTIC_AND_VOTING_MAJORITY: {
				MergingAgenticANDVotingMajority mergingAgenticANDVotingMajority = (MergingAgenticANDVotingMajority)theEObject;
				T result = caseMergingAgenticANDVotingMajority(mergingAgenticANDVotingMajority);
				if (result == null) result = caseAgenticGateway(mergingAgenticANDVotingMajority);
				if (result == null) result = caseGateway(mergingAgenticANDVotingMajority);
				if (result == null) result = caseFlowObject(mergingAgenticANDVotingMajority);
				if (result == null) result = caseBPMNElement(mergingAgenticANDVotingMajority);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.MERGING_AGENTIC_AND_VOTING_MINORITY: {
				MergingAgenticANDVotingMinority mergingAgenticANDVotingMinority = (MergingAgenticANDVotingMinority)theEObject;
				T result = caseMergingAgenticANDVotingMinority(mergingAgenticANDVotingMinority);
				if (result == null) result = caseAgenticGateway(mergingAgenticANDVotingMinority);
				if (result == null) result = caseGateway(mergingAgenticANDVotingMinority);
				if (result == null) result = caseFlowObject(mergingAgenticANDVotingMinority);
				if (result == null) result = caseBPMNElement(mergingAgenticANDVotingMinority);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.DIVERGING_AGENTIC_OR_VOTING: {
				DivergingAgenticORVoting divergingAgenticORVoting = (DivergingAgenticORVoting)theEObject;
				T result = caseDivergingAgenticORVoting(divergingAgenticORVoting);
				if (result == null) result = caseAgenticGateway(divergingAgenticORVoting);
				if (result == null) result = caseGateway(divergingAgenticORVoting);
				if (result == null) result = caseFlowObject(divergingAgenticORVoting);
				if (result == null) result = caseBPMNElement(divergingAgenticORVoting);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.DIVERGING_AGENTIC_OR_DEBATE: {
				DivergingAgenticORDebate divergingAgenticORDebate = (DivergingAgenticORDebate)theEObject;
				T result = caseDivergingAgenticORDebate(divergingAgenticORDebate);
				if (result == null) result = caseAgenticGateway(divergingAgenticORDebate);
				if (result == null) result = caseGateway(divergingAgenticORDebate);
				if (result == null) result = caseFlowObject(divergingAgenticORDebate);
				if (result == null) result = caseBPMNElement(divergingAgenticORDebate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.DIVERGING_AGENTIC_OR_COMPETITION: {
				DivergingAgenticORCompetition divergingAgenticORCompetition = (DivergingAgenticORCompetition)theEObject;
				T result = caseDivergingAgenticORCompetition(divergingAgenticORCompetition);
				if (result == null) result = caseAgenticGateway(divergingAgenticORCompetition);
				if (result == null) result = caseGateway(divergingAgenticORCompetition);
				if (result == null) result = caseFlowObject(divergingAgenticORCompetition);
				if (result == null) result = caseBPMNElement(divergingAgenticORCompetition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.MERGING_AGENTIC_OR_ROLE_LEADER: {
				MergingAgenticORRoleLeader mergingAgenticORRoleLeader = (MergingAgenticORRoleLeader)theEObject;
				T result = caseMergingAgenticORRoleLeader(mergingAgenticORRoleLeader);
				if (result == null) result = caseAgenticGateway(mergingAgenticORRoleLeader);
				if (result == null) result = caseGateway(mergingAgenticORRoleLeader);
				if (result == null) result = caseFlowObject(mergingAgenticORRoleLeader);
				if (result == null) result = caseBPMNElement(mergingAgenticORRoleLeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.MERGING_AGENTIC_OR_ROLE_COMPOSED: {
				MergingAgenticORRoleComposed mergingAgenticORRoleComposed = (MergingAgenticORRoleComposed)theEObject;
				T result = caseMergingAgenticORRoleComposed(mergingAgenticORRoleComposed);
				if (result == null) result = caseAgenticGateway(mergingAgenticORRoleComposed);
				if (result == null) result = caseGateway(mergingAgenticORRoleComposed);
				if (result == null) result = caseFlowObject(mergingAgenticORRoleComposed);
				if (result == null) result = caseBPMNElement(mergingAgenticORRoleComposed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.MERGING_AGENTIC_OR_COMPETITION_FASTEST: {
				MergingAgenticORCompetitionFastest mergingAgenticORCompetitionFastest = (MergingAgenticORCompetitionFastest)theEObject;
				T result = caseMergingAgenticORCompetitionFastest(mergingAgenticORCompetitionFastest);
				if (result == null) result = caseAgenticGateway(mergingAgenticORCompetitionFastest);
				if (result == null) result = caseGateway(mergingAgenticORCompetitionFastest);
				if (result == null) result = caseFlowObject(mergingAgenticORCompetitionFastest);
				if (result == null) result = caseBPMNElement(mergingAgenticORCompetitionFastest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.MERGING_AGENTIC_OR_COMPETITION_MOST_COMPLETE: {
				MergingAgenticORCompetitionMostComplete mergingAgenticORCompetitionMostComplete = (MergingAgenticORCompetitionMostComplete)theEObject;
				T result = caseMergingAgenticORCompetitionMostComplete(mergingAgenticORCompetitionMostComplete);
				if (result == null) result = caseAgenticGateway(mergingAgenticORCompetitionMostComplete);
				if (result == null) result = caseGateway(mergingAgenticORCompetitionMostComplete);
				if (result == null) result = caseFlowObject(mergingAgenticORCompetitionMostComplete);
				if (result == null) result = caseBPMNElement(mergingAgenticORCompetitionMostComplete);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.MERGING_AGENTIC_OR_VOTING_ABSOLUTE_MAJORITY: {
				MergingAgenticORVotingAbsoluteMajority mergingAgenticORVotingAbsoluteMajority = (MergingAgenticORVotingAbsoluteMajority)theEObject;
				T result = caseMergingAgenticORVotingAbsoluteMajority(mergingAgenticORVotingAbsoluteMajority);
				if (result == null) result = caseAgenticGateway(mergingAgenticORVotingAbsoluteMajority);
				if (result == null) result = caseGateway(mergingAgenticORVotingAbsoluteMajority);
				if (result == null) result = caseFlowObject(mergingAgenticORVotingAbsoluteMajority);
				if (result == null) result = caseBPMNElement(mergingAgenticORVotingAbsoluteMajority);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.MERGING_AGENTIC_OR_VOTING_MAJORITY: {
				MergingAgenticORVotingMajority mergingAgenticORVotingMajority = (MergingAgenticORVotingMajority)theEObject;
				T result = caseMergingAgenticORVotingMajority(mergingAgenticORVotingMajority);
				if (result == null) result = caseAgenticGateway(mergingAgenticORVotingMajority);
				if (result == null) result = caseGateway(mergingAgenticORVotingMajority);
				if (result == null) result = caseFlowObject(mergingAgenticORVotingMajority);
				if (result == null) result = caseBPMNElement(mergingAgenticORVotingMajority);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.MERGING_AGENTIC_OR_VOTING_MINORITY: {
				MergingAgenticORVotingMinority mergingAgenticORVotingMinority = (MergingAgenticORVotingMinority)theEObject;
				T result = caseMergingAgenticORVotingMinority(mergingAgenticORVotingMinority);
				if (result == null) result = caseAgenticGateway(mergingAgenticORVotingMinority);
				if (result == null) result = caseGateway(mergingAgenticORVotingMinority);
				if (result == null) result = caseFlowObject(mergingAgenticORVotingMinority);
				if (result == null) result = caseBPMNElement(mergingAgenticORVotingMinority);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.START_EVENT: {
				StartEvent startEvent = (StartEvent)theEObject;
				T result = caseStartEvent(startEvent);
				if (result == null) result = caseFlowObject(startEvent);
				if (result == null) result = caseBPMNElement(startEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.INTERMEDIATE_EVENT: {
				IntermediateEvent intermediateEvent = (IntermediateEvent)theEObject;
				T result = caseIntermediateEvent(intermediateEvent);
				if (result == null) result = caseFlowObject(intermediateEvent);
				if (result == null) result = caseBPMNElement(intermediateEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.END_EVENT: {
				EndEvent endEvent = (EndEvent)theEObject;
				T result = caseEndEvent(endEvent);
				if (result == null) result = caseFlowObject(endEvent);
				if (result == null) result = caseBPMNElement(endEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				T result = caseActivity(activity);
				if (result == null) result = caseFlowObject(activity);
				if (result == null) result = caseBPMNElement(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.AGENTIC_TASK: {
				AgenticTask agenticTask = (AgenticTask)theEObject;
				T result = caseAgenticTask(agenticTask);
				if (result == null) result = caseFlowObject(agenticTask);
				if (result == null) result = caseBPMNElement(agenticTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.ARTIFACT: {
				Artifact artifact = (Artifact)theEObject;
				T result = caseArtifact(artifact);
				if (result == null) result = caseBPMNElement(artifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.DATA_OBJECT: {
				DataObject dataObject = (DataObject)theEObject;
				T result = caseDataObject(dataObject);
				if (result == null) result = caseArtifact(dataObject);
				if (result == null) result = caseBPMNElement(dataObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.GROUP: {
				Group group = (Group)theEObject;
				T result = caseGroup(group);
				if (result == null) result = caseArtifact(group);
				if (result == null) result = caseBPMNElement(group);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.AGENT: {
				Agent agent = (Agent)theEObject;
				T result = caseAgent(agent);
				if (result == null) result = caseBPMNElement(agent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.AGENTIC: {
				Agentic agentic = (Agentic)theEObject;
				T result = caseAgentic(agentic);
				if (result == null) result = caseAgent(agentic);
				if (result == null) result = caseBPMNElement(agentic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.AGENT_ROLE: {
				AgentRole agentRole = (AgentRole)theEObject;
				T result = caseAgentRole(agentRole);
				if (result == null) result = caseAgent(agentRole);
				if (result == null) result = caseBPMNElement(agentRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.AGENT_WORKER: {
				AgentWorker agentWorker = (AgentWorker)theEObject;
				T result = caseAgentWorker(agentWorker);
				if (result == null) result = caseAgentRole(agentWorker);
				if (result == null) result = caseAgent(agentWorker);
				if (result == null) result = caseBPMNElement(agentWorker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.AGENT_MANAGER: {
				AgentManager agentManager = (AgentManager)theEObject;
				T result = caseAgentManager(agentManager);
				if (result == null) result = caseAgentRole(agentManager);
				if (result == null) result = caseAgent(agentManager);
				if (result == null) result = caseBPMNElement(agentManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.REFLECTION_MODE: {
				ReflectionMode reflectionMode = (ReflectionMode)theEObject;
				T result = caseReflectionMode(reflectionMode);
				if (result == null) result = caseBPMNElement(reflectionMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.SELF_REFLECTION: {
				SelfReflection selfReflection = (SelfReflection)theEObject;
				T result = caseSelfReflection(selfReflection);
				if (result == null) result = caseReflectionMode(selfReflection);
				if (result == null) result = caseBPMNElement(selfReflection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.CROSS_REFLECTION: {
				CrossReflection crossReflection = (CrossReflection)theEObject;
				T result = caseCrossReflection(crossReflection);
				if (result == null) result = caseReflectionMode(crossReflection);
				if (result == null) result = caseBPMNElement(crossReflection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNagenticPackage.HUMAN_REFLECTION: {
				HumanReflection humanReflection = (HumanReflection)theEObject;
				T result = caseHumanReflection(humanReflection);
				if (result == null) result = caseReflectionMode(humanReflection);
				if (result == null) result = caseBPMNElement(humanReflection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Process Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Process Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessProcessDiagram(BusinessProcessDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BPMN Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BPMN Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBPMNElement(BPMNElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Swimlane</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Swimlane</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwimlane(Swimlane object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lane</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lane</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLane(Lane object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agentic Lane</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agentic Lane</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgenticLane(AgenticLane object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePool(Pool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connecting Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connecting Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectingObject(ConnectingObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageFlow(MessageFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceFlow(SequenceFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociation(Association object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowObject(FlowObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGateway(Gateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XOR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XOR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXOR(XOR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOR(OR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AND</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AND</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAND(AND object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agentic Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agentic Gateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgenticGateway(AgenticGateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diverging Agentic AND Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diverging Agentic AND Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivergingAgenticANDRole(DivergingAgenticANDRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diverging Agentic AND Voting</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diverging Agentic AND Voting</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivergingAgenticANDVoting(DivergingAgenticANDVoting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diverging Agentic AND Debate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diverging Agentic AND Debate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivergingAgenticANDDebate(DivergingAgenticANDDebate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diverging Agentic AND Competition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diverging Agentic AND Competition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivergingAgenticANDCompetition(DivergingAgenticANDCompetition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merging Agentic AND Role Leader</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merging Agentic AND Role Leader</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergingAgenticANDRoleLeader(MergingAgenticANDRoleLeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merging Agentic AND Role Composed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merging Agentic AND Role Composed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergingAgenticANDRoleComposed(MergingAgenticANDRoleComposed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merging Agentic AND Competition Fastest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merging Agentic AND Competition Fastest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergingAgenticANDCompetitionFastest(MergingAgenticANDCompetitionFastest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merging Agentic AND Competition Most Complete</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merging Agentic AND Competition Most Complete</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergingAgenticANDCompetitionMostComplete(MergingAgenticANDCompetitionMostComplete object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merging Agentic AND Voting Absolute Majority</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merging Agentic AND Voting Absolute Majority</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergingAgenticANDVotingAbsoluteMajority(MergingAgenticANDVotingAbsoluteMajority object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merging Agentic AND Voting Majority</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merging Agentic AND Voting Majority</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergingAgenticANDVotingMajority(MergingAgenticANDVotingMajority object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merging Agentic AND Voting Minority</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merging Agentic AND Voting Minority</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergingAgenticANDVotingMinority(MergingAgenticANDVotingMinority object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diverging Agentic OR Voting</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diverging Agentic OR Voting</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivergingAgenticORVoting(DivergingAgenticORVoting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diverging Agentic OR Debate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diverging Agentic OR Debate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivergingAgenticORDebate(DivergingAgenticORDebate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diverging Agentic OR Competition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diverging Agentic OR Competition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivergingAgenticORCompetition(DivergingAgenticORCompetition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merging Agentic OR Role Leader</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merging Agentic OR Role Leader</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergingAgenticORRoleLeader(MergingAgenticORRoleLeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merging Agentic OR Role Composed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merging Agentic OR Role Composed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergingAgenticORRoleComposed(MergingAgenticORRoleComposed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merging Agentic OR Competition Fastest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merging Agentic OR Competition Fastest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergingAgenticORCompetitionFastest(MergingAgenticORCompetitionFastest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merging Agentic OR Competition Most Complete</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merging Agentic OR Competition Most Complete</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergingAgenticORCompetitionMostComplete(MergingAgenticORCompetitionMostComplete object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merging Agentic OR Voting Absolute Majority</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merging Agentic OR Voting Absolute Majority</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergingAgenticORVotingAbsoluteMajority(MergingAgenticORVotingAbsoluteMajority object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merging Agentic OR Voting Majority</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merging Agentic OR Voting Majority</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergingAgenticORVotingMajority(MergingAgenticORVotingMajority object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merging Agentic OR Voting Minority</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merging Agentic OR Voting Minority</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergingAgenticORVotingMinority(MergingAgenticORVotingMinority object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartEvent(StartEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intermediate Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intermediate Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntermediateEvent(IntermediateEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndEvent(EndEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agentic Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agentic Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgenticTask(AgenticTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifact(Artifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataObject(DataObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroup(Group object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgent(Agent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agentic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agentic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgentic(Agentic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agent Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agent Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgentRole(AgentRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agent Worker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agent Worker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgentWorker(AgentWorker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agent Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agent Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgentManager(AgentManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reflection Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reflection Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReflectionMode(ReflectionMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Self Reflection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Self Reflection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelfReflection(SelfReflection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cross Reflection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cross Reflection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCrossReflection(CrossReflection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Human Reflection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Human Reflection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHumanReflection(HumanReflection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BPMNagenticSwitch
