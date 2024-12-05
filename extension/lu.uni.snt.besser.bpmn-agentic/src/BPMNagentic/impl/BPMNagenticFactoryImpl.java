/**
 */
package BPMNagentic.impl;

import BPMNagentic.*;

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
public class BPMNagenticFactoryImpl extends EFactoryImpl implements BPMNagenticFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BPMNagenticFactory init() {
		try {
			BPMNagenticFactory theBPMNagenticFactory = (BPMNagenticFactory)EPackage.Registry.INSTANCE.getEFactory(BPMNagenticPackage.eNS_URI);
			if (theBPMNagenticFactory != null) {
				return theBPMNagenticFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BPMNagenticFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNagenticFactoryImpl() {
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
			case BPMNagenticPackage.BUSINESS_PROCESS_DIAGRAM: return createBusinessProcessDiagram();
			case BPMNagenticPackage.BPMN_ELEMENT: return createBPMNElement();
			case BPMNagenticPackage.LANE: return createLane();
			case BPMNagenticPackage.AGENTIC_LANE: return createAgenticLane();
			case BPMNagenticPackage.POOL: return createPool();
			case BPMNagenticPackage.MESSAGE_FLOW: return createMessageFlow();
			case BPMNagenticPackage.SEQUENCE_FLOW: return createSequenceFlow();
			case BPMNagenticPackage.ASSOCIATION: return createAssociation();
			case BPMNagenticPackage.XOR: return createXOR();
			case BPMNagenticPackage.OR: return createOR();
			case BPMNagenticPackage.AND: return createAND();
			case BPMNagenticPackage.AGENTIC_GATEWAY: return createAgenticGateway();
			case BPMNagenticPackage.DIVERGING_AGENTIC_AND_ROLE: return createDivergingAgenticANDRole();
			case BPMNagenticPackage.DIVERGING_AGENTIC_AND_VOTING: return createDivergingAgenticANDVoting();
			case BPMNagenticPackage.DIVERGING_AGENTIC_AND_DEBATE: return createDivergingAgenticANDDebate();
			case BPMNagenticPackage.DIVERGING_AGENTIC_AND_COMPETITION: return createDivergingAgenticANDCompetition();
			case BPMNagenticPackage.MERGING_AGENTIC_AND_ROLE_LEADER: return createMergingAgenticANDRoleLeader();
			case BPMNagenticPackage.MERGING_AGENTIC_AND_ROLE_COMPOSED: return createMergingAgenticANDRoleComposed();
			case BPMNagenticPackage.MERGING_AGENTIC_AND_COMPETITION_FASTEST: return createMergingAgenticANDCompetitionFastest();
			case BPMNagenticPackage.MERGING_AGENTIC_AND_COMPETITION_MOST_COMPLETE: return createMergingAgenticANDCompetitionMostComplete();
			case BPMNagenticPackage.MERGING_AGENTIC_AND_VOTING_ABSOLUTE_MAJORITY: return createMergingAgenticANDVotingAbsoluteMajority();
			case BPMNagenticPackage.MERGING_AGENTIC_AND_VOTING_MAJORITY: return createMergingAgenticANDVotingMajority();
			case BPMNagenticPackage.MERGING_AGENTIC_AND_VOTING_MINORITY: return createMergingAgenticANDVotingMinority();
			case BPMNagenticPackage.DIVERGING_AGENTIC_OR_VOTING: return createDivergingAgenticORVoting();
			case BPMNagenticPackage.DIVERGING_AGENTIC_OR_DEBATE: return createDivergingAgenticORDebate();
			case BPMNagenticPackage.DIVERGING_AGENTIC_OR_COMPETITION: return createDivergingAgenticORCompetition();
			case BPMNagenticPackage.MERGING_AGENTIC_OR_ROLE_LEADER: return createMergingAgenticORRoleLeader();
			case BPMNagenticPackage.MERGING_AGENTIC_OR_ROLE_COMPOSED: return createMergingAgenticORRoleComposed();
			case BPMNagenticPackage.MERGING_AGENTIC_OR_COMPETITION_FASTEST: return createMergingAgenticORCompetitionFastest();
			case BPMNagenticPackage.MERGING_AGENTIC_OR_COMPETITION_MOST_COMPLETE: return createMergingAgenticORCompetitionMostComplete();
			case BPMNagenticPackage.MERGING_AGENTIC_OR_VOTING_ABSOLUTE_MAJORITY: return createMergingAgenticORVotingAbsoluteMajority();
			case BPMNagenticPackage.MERGING_AGENTIC_OR_VOTING_MAJORITY: return createMergingAgenticORVotingMajority();
			case BPMNagenticPackage.MERGING_AGENTIC_OR_VOTING_MINORITY: return createMergingAgenticORVotingMinority();
			case BPMNagenticPackage.START_EVENT: return createStartEvent();
			case BPMNagenticPackage.INTERMEDIATE_EVENT: return createIntermediateEvent();
			case BPMNagenticPackage.END_EVENT: return createEndEvent();
			case BPMNagenticPackage.ACTIVITY: return createActivity();
			case BPMNagenticPackage.AGENTIC_TASK: return createAgenticTask();
			case BPMNagenticPackage.DATA_OBJECT: return createDataObject();
			case BPMNagenticPackage.GROUP: return createGroup();
			case BPMNagenticPackage.AGENTIC: return createAgentic();
			case BPMNagenticPackage.AGENT_WORKER: return createAgentWorker();
			case BPMNagenticPackage.AGENT_MANAGER: return createAgentManager();
			case BPMNagenticPackage.SELF_REFLECTION: return createSelfReflection();
			case BPMNagenticPackage.CROSS_REFLECTION: return createCrossReflection();
			case BPMNagenticPackage.HUMAN_REFLECTION: return createHumanReflection();
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
	public BusinessProcessDiagram createBusinessProcessDiagram() {
		BusinessProcessDiagramImpl businessProcessDiagram = new BusinessProcessDiagramImpl();
		return businessProcessDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BPMNElement createBPMNElement() {
		BPMNElementImpl bpmnElement = new BPMNElementImpl();
		return bpmnElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lane createLane() {
		LaneImpl lane = new LaneImpl();
		return lane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgenticLane createAgenticLane() {
		AgenticLaneImpl agenticLane = new AgenticLaneImpl();
		return agenticLane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pool createPool() {
		PoolImpl pool = new PoolImpl();
		return pool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageFlow createMessageFlow() {
		MessageFlowImpl messageFlow = new MessageFlowImpl();
		return messageFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SequenceFlow createSequenceFlow() {
		SequenceFlowImpl sequenceFlow = new SequenceFlowImpl();
		return sequenceFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XOR createXOR() {
		XORImpl xor = new XORImpl();
		return xor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OR createOR() {
		ORImpl or = new ORImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AND createAND() {
		ANDImpl and = new ANDImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgenticGateway createAgenticGateway() {
		AgenticGatewayImpl agenticGateway = new AgenticGatewayImpl();
		return agenticGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DivergingAgenticANDRole createDivergingAgenticANDRole() {
		DivergingAgenticANDRoleImpl divergingAgenticANDRole = new DivergingAgenticANDRoleImpl();
		return divergingAgenticANDRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DivergingAgenticANDVoting createDivergingAgenticANDVoting() {
		DivergingAgenticANDVotingImpl divergingAgenticANDVoting = new DivergingAgenticANDVotingImpl();
		return divergingAgenticANDVoting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DivergingAgenticANDDebate createDivergingAgenticANDDebate() {
		DivergingAgenticANDDebateImpl divergingAgenticANDDebate = new DivergingAgenticANDDebateImpl();
		return divergingAgenticANDDebate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DivergingAgenticANDCompetition createDivergingAgenticANDCompetition() {
		DivergingAgenticANDCompetitionImpl divergingAgenticANDCompetition = new DivergingAgenticANDCompetitionImpl();
		return divergingAgenticANDCompetition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MergingAgenticANDRoleLeader createMergingAgenticANDRoleLeader() {
		MergingAgenticANDRoleLeaderImpl mergingAgenticANDRoleLeader = new MergingAgenticANDRoleLeaderImpl();
		return mergingAgenticANDRoleLeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MergingAgenticANDRoleComposed createMergingAgenticANDRoleComposed() {
		MergingAgenticANDRoleComposedImpl mergingAgenticANDRoleComposed = new MergingAgenticANDRoleComposedImpl();
		return mergingAgenticANDRoleComposed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MergingAgenticANDCompetitionFastest createMergingAgenticANDCompetitionFastest() {
		MergingAgenticANDCompetitionFastestImpl mergingAgenticANDCompetitionFastest = new MergingAgenticANDCompetitionFastestImpl();
		return mergingAgenticANDCompetitionFastest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MergingAgenticANDCompetitionMostComplete createMergingAgenticANDCompetitionMostComplete() {
		MergingAgenticANDCompetitionMostCompleteImpl mergingAgenticANDCompetitionMostComplete = new MergingAgenticANDCompetitionMostCompleteImpl();
		return mergingAgenticANDCompetitionMostComplete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MergingAgenticANDVotingAbsoluteMajority createMergingAgenticANDVotingAbsoluteMajority() {
		MergingAgenticANDVotingAbsoluteMajorityImpl mergingAgenticANDVotingAbsoluteMajority = new MergingAgenticANDVotingAbsoluteMajorityImpl();
		return mergingAgenticANDVotingAbsoluteMajority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MergingAgenticANDVotingMajority createMergingAgenticANDVotingMajority() {
		MergingAgenticANDVotingMajorityImpl mergingAgenticANDVotingMajority = new MergingAgenticANDVotingMajorityImpl();
		return mergingAgenticANDVotingMajority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MergingAgenticANDVotingMinority createMergingAgenticANDVotingMinority() {
		MergingAgenticANDVotingMinorityImpl mergingAgenticANDVotingMinority = new MergingAgenticANDVotingMinorityImpl();
		return mergingAgenticANDVotingMinority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DivergingAgenticORVoting createDivergingAgenticORVoting() {
		DivergingAgenticORVotingImpl divergingAgenticORVoting = new DivergingAgenticORVotingImpl();
		return divergingAgenticORVoting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DivergingAgenticORDebate createDivergingAgenticORDebate() {
		DivergingAgenticORDebateImpl divergingAgenticORDebate = new DivergingAgenticORDebateImpl();
		return divergingAgenticORDebate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DivergingAgenticORCompetition createDivergingAgenticORCompetition() {
		DivergingAgenticORCompetitionImpl divergingAgenticORCompetition = new DivergingAgenticORCompetitionImpl();
		return divergingAgenticORCompetition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MergingAgenticORRoleLeader createMergingAgenticORRoleLeader() {
		MergingAgenticORRoleLeaderImpl mergingAgenticORRoleLeader = new MergingAgenticORRoleLeaderImpl();
		return mergingAgenticORRoleLeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MergingAgenticORRoleComposed createMergingAgenticORRoleComposed() {
		MergingAgenticORRoleComposedImpl mergingAgenticORRoleComposed = new MergingAgenticORRoleComposedImpl();
		return mergingAgenticORRoleComposed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MergingAgenticORCompetitionFastest createMergingAgenticORCompetitionFastest() {
		MergingAgenticORCompetitionFastestImpl mergingAgenticORCompetitionFastest = new MergingAgenticORCompetitionFastestImpl();
		return mergingAgenticORCompetitionFastest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MergingAgenticORCompetitionMostComplete createMergingAgenticORCompetitionMostComplete() {
		MergingAgenticORCompetitionMostCompleteImpl mergingAgenticORCompetitionMostComplete = new MergingAgenticORCompetitionMostCompleteImpl();
		return mergingAgenticORCompetitionMostComplete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MergingAgenticORVotingAbsoluteMajority createMergingAgenticORVotingAbsoluteMajority() {
		MergingAgenticORVotingAbsoluteMajorityImpl mergingAgenticORVotingAbsoluteMajority = new MergingAgenticORVotingAbsoluteMajorityImpl();
		return mergingAgenticORVotingAbsoluteMajority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MergingAgenticORVotingMajority createMergingAgenticORVotingMajority() {
		MergingAgenticORVotingMajorityImpl mergingAgenticORVotingMajority = new MergingAgenticORVotingMajorityImpl();
		return mergingAgenticORVotingMajority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MergingAgenticORVotingMinority createMergingAgenticORVotingMinority() {
		MergingAgenticORVotingMinorityImpl mergingAgenticORVotingMinority = new MergingAgenticORVotingMinorityImpl();
		return mergingAgenticORVotingMinority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StartEvent createStartEvent() {
		StartEventImpl startEvent = new StartEventImpl();
		return startEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntermediateEvent createIntermediateEvent() {
		IntermediateEventImpl intermediateEvent = new IntermediateEventImpl();
		return intermediateEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EndEvent createEndEvent() {
		EndEventImpl endEvent = new EndEventImpl();
		return endEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgenticTask createAgenticTask() {
		AgenticTaskImpl agenticTask = new AgenticTaskImpl();
		return agenticTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataObject createDataObject() {
		DataObjectImpl dataObject = new DataObjectImpl();
		return dataObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Agentic createAgentic() {
		AgenticImpl agentic = new AgenticImpl();
		return agentic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgentWorker createAgentWorker() {
		AgentWorkerImpl agentWorker = new AgentWorkerImpl();
		return agentWorker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgentManager createAgentManager() {
		AgentManagerImpl agentManager = new AgentManagerImpl();
		return agentManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelfReflection createSelfReflection() {
		SelfReflectionImpl selfReflection = new SelfReflectionImpl();
		return selfReflection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CrossReflection createCrossReflection() {
		CrossReflectionImpl crossReflection = new CrossReflectionImpl();
		return crossReflection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HumanReflection createHumanReflection() {
		HumanReflectionImpl humanReflection = new HumanReflectionImpl();
		return humanReflection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BPMNagenticPackage getBPMNagenticPackage() {
		return (BPMNagenticPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BPMNagenticPackage getPackage() {
		return BPMNagenticPackage.eINSTANCE;
	}

} //BPMNagenticFactoryImpl
