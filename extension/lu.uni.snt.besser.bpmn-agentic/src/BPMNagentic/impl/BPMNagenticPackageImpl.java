/**
 */
package BPMNagentic.impl;

import BPMNagentic.Activity;
import BPMNagentic.Agent;
import BPMNagentic.AgentManager;
import BPMNagentic.AgentRole;
import BPMNagentic.AgentWorker;
import BPMNagentic.Agentic;
import BPMNagentic.AgenticGateway;
import BPMNagentic.AgenticLane;
import BPMNagentic.AgenticTask;
import BPMNagentic.Artifact;
import BPMNagentic.Association;
import BPMNagentic.BPMNElement;
import BPMNagentic.BPMNagenticFactory;
import BPMNagentic.BPMNagenticPackage;
import BPMNagentic.BusinessProcessDiagram;
import BPMNagentic.ConnectingObject;
import BPMNagentic.CrossReflection;
import BPMNagentic.DataObject;
import BPMNagentic.DivergingAgenticANDCompetition;
import BPMNagentic.DivergingAgenticANDDebate;
import BPMNagentic.DivergingAgenticANDRole;
import BPMNagentic.DivergingAgenticANDVoting;
import BPMNagentic.DivergingAgenticORCompetition;
import BPMNagentic.DivergingAgenticORDebate;
import BPMNagentic.DivergingAgenticORVoting;
import BPMNagentic.EndEvent;
import BPMNagentic.FlowObject;
import BPMNagentic.Gateway;
import BPMNagentic.Group;
import BPMNagentic.HumanReflection;
import BPMNagentic.IntermediateEvent;
import BPMNagentic.Lane;
import BPMNagentic.MergingAgenticANDCompetitionFastest;
import BPMNagentic.MergingAgenticANDCompetitionMostComplete;
import BPMNagentic.MergingAgenticANDRoleComposed;
import BPMNagentic.MergingAgenticANDRoleLeader;
import BPMNagentic.MergingAgenticANDVotingAbsoluteMajority;
import BPMNagentic.MergingAgenticANDVotingMajority;
import BPMNagentic.MergingAgenticANDVotingMinority;
import BPMNagentic.MergingAgenticORCompetitionFastest;
import BPMNagentic.MergingAgenticORCompetitionMostComplete;
import BPMNagentic.MergingAgenticORRoleComposed;
import BPMNagentic.MergingAgenticORRoleLeader;
import BPMNagentic.MergingAgenticORVotingAbsoluteMajority;
import BPMNagentic.MergingAgenticORVotingMajority;
import BPMNagentic.MergingAgenticORVotingMinority;
import BPMNagentic.MessageFlow;
import BPMNagentic.Pool;
import BPMNagentic.ReflectionMode;
import BPMNagentic.SelfReflection;
import BPMNagentic.SequenceFlow;
import BPMNagentic.StartEvent;
import BPMNagentic.Swimlane;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BPMNagenticPackageImpl extends EPackageImpl implements BPMNagenticPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessProcessDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swimlaneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass laneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agenticLaneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectingObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agenticGatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divergingAgenticANDRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divergingAgenticANDVotingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divergingAgenticANDDebateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divergingAgenticANDCompetitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergingAgenticANDRoleLeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergingAgenticANDRoleComposedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergingAgenticANDCompetitionFastestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergingAgenticANDCompetitionMostCompleteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergingAgenticANDVotingAbsoluteMajorityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergingAgenticANDVotingMajorityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergingAgenticANDVotingMinorityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divergingAgenticORVotingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divergingAgenticORDebateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divergingAgenticORCompetitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergingAgenticORRoleLeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergingAgenticORRoleComposedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergingAgenticORCompetitionFastestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergingAgenticORCompetitionMostCompleteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergingAgenticORVotingAbsoluteMajorityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergingAgenticORVotingMajorityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergingAgenticORVotingMinorityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intermediateEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agenticTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agenticEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agentRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agentWorkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agentManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reflectionModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selfReflectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crossReflectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass humanReflectionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see BPMNagentic.BPMNagenticPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BPMNagenticPackageImpl() {
		super(eNS_URI, BPMNagenticFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link BPMNagenticPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BPMNagenticPackage init() {
		if (isInited) return (BPMNagenticPackage)EPackage.Registry.INSTANCE.getEPackage(BPMNagenticPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBPMNagenticPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BPMNagenticPackageImpl theBPMNagenticPackage = registeredBPMNagenticPackage instanceof BPMNagenticPackageImpl ? (BPMNagenticPackageImpl)registeredBPMNagenticPackage : new BPMNagenticPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theBPMNagenticPackage.createPackageContents();

		// Initialize created meta-data
		theBPMNagenticPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBPMNagenticPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BPMNagenticPackage.eNS_URI, theBPMNagenticPackage);
		return theBPMNagenticPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBusinessProcessDiagram() {
		return businessProcessDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBusinessProcessDiagram_Elements() {
		return (EReference)businessProcessDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBPMNElement() {
		return bpmnElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBPMNElement_Name() {
		return (EAttribute)bpmnElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSwimlane() {
		return swimlaneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLane() {
		return laneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLane_FlowObjects() {
		return (EReference)laneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgenticLane() {
		return agenticLaneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgenticLane_FlowObjects() {
		return (EReference)agenticLaneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgenticLane_AgentRole() {
		return (EReference)agenticLaneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgenticLane_Uncertainty() {
		return (EAttribute)agenticLaneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPool() {
		return poolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPool_Lanes() {
		return (EReference)poolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPool_AgenticLanes() {
		return (EReference)poolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnectingObject() {
		return connectingObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectingObject_From() {
		return (EReference)connectingObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectingObject_To() {
		return (EReference)connectingObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMessageFlow() {
		return messageFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSequenceFlow() {
		return sequenceFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlowObject() {
		return flowObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGateway() {
		return gatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXOR() {
		return xorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOR() {
		return orEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAND() {
		return andEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgenticGateway() {
		return agenticGatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgenticGateway_Uncertainty() {
		return (EAttribute)agenticGatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDivergingAgenticANDRole() {
		return divergingAgenticANDRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDivergingAgenticANDVoting() {
		return divergingAgenticANDVotingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDivergingAgenticANDDebate() {
		return divergingAgenticANDDebateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDivergingAgenticANDCompetition() {
		return divergingAgenticANDCompetitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMergingAgenticANDRoleLeader() {
		return mergingAgenticANDRoleLeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMergingAgenticANDRoleComposed() {
		return mergingAgenticANDRoleComposedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMergingAgenticANDCompetitionFastest() {
		return mergingAgenticANDCompetitionFastestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMergingAgenticANDCompetitionMostComplete() {
		return mergingAgenticANDCompetitionMostCompleteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMergingAgenticANDVotingAbsoluteMajority() {
		return mergingAgenticANDVotingAbsoluteMajorityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMergingAgenticANDVotingMajority() {
		return mergingAgenticANDVotingMajorityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMergingAgenticANDVotingMinority() {
		return mergingAgenticANDVotingMinorityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDivergingAgenticORVoting() {
		return divergingAgenticORVotingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDivergingAgenticORDebate() {
		return divergingAgenticORDebateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDivergingAgenticORCompetition() {
		return divergingAgenticORCompetitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMergingAgenticORRoleLeader() {
		return mergingAgenticORRoleLeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMergingAgenticORRoleComposed() {
		return mergingAgenticORRoleComposedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMergingAgenticORCompetitionFastest() {
		return mergingAgenticORCompetitionFastestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMergingAgenticORCompetitionMostComplete() {
		return mergingAgenticORCompetitionMostCompleteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMergingAgenticORVotingAbsoluteMajority() {
		return mergingAgenticORVotingAbsoluteMajorityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMergingAgenticORVotingMajority() {
		return mergingAgenticORVotingMajorityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMergingAgenticORVotingMinority() {
		return mergingAgenticORVotingMinorityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStartEvent() {
		return startEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntermediateEvent() {
		return intermediateEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEndEvent() {
		return endEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgenticTask() {
		return agenticTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgenticTask_Agentic() {
		return (EReference)agenticTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgenticTask_ReflectionMode() {
		return (EReference)agenticTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgenticTask_Uncertainty() {
		return (EAttribute)agenticTaskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArtifact() {
		return artifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataObject() {
		return dataObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGroup_Elements() {
		return (EReference)groupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgent() {
		return agentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgentic() {
		return agenticEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgentRole() {
		return agentRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgentWorker() {
		return agentWorkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgentManager() {
		return agentManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReflectionMode() {
		return reflectionModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSelfReflection() {
		return selfReflectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCrossReflection() {
		return crossReflectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHumanReflection() {
		return humanReflectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BPMNagenticFactory getBPMNagenticFactory() {
		return (BPMNagenticFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		businessProcessDiagramEClass = createEClass(BUSINESS_PROCESS_DIAGRAM);
		createEReference(businessProcessDiagramEClass, BUSINESS_PROCESS_DIAGRAM__ELEMENTS);

		bpmnElementEClass = createEClass(BPMN_ELEMENT);
		createEAttribute(bpmnElementEClass, BPMN_ELEMENT__NAME);

		swimlaneEClass = createEClass(SWIMLANE);

		laneEClass = createEClass(LANE);
		createEReference(laneEClass, LANE__FLOW_OBJECTS);

		agenticLaneEClass = createEClass(AGENTIC_LANE);
		createEReference(agenticLaneEClass, AGENTIC_LANE__FLOW_OBJECTS);
		createEReference(agenticLaneEClass, AGENTIC_LANE__AGENT_ROLE);
		createEAttribute(agenticLaneEClass, AGENTIC_LANE__UNCERTAINTY);

		poolEClass = createEClass(POOL);
		createEReference(poolEClass, POOL__LANES);
		createEReference(poolEClass, POOL__AGENTIC_LANES);

		connectingObjectEClass = createEClass(CONNECTING_OBJECT);
		createEReference(connectingObjectEClass, CONNECTING_OBJECT__FROM);
		createEReference(connectingObjectEClass, CONNECTING_OBJECT__TO);

		messageFlowEClass = createEClass(MESSAGE_FLOW);

		sequenceFlowEClass = createEClass(SEQUENCE_FLOW);

		associationEClass = createEClass(ASSOCIATION);

		flowObjectEClass = createEClass(FLOW_OBJECT);

		gatewayEClass = createEClass(GATEWAY);

		xorEClass = createEClass(XOR);

		orEClass = createEClass(OR);

		andEClass = createEClass(AND);

		agenticGatewayEClass = createEClass(AGENTIC_GATEWAY);
		createEAttribute(agenticGatewayEClass, AGENTIC_GATEWAY__UNCERTAINTY);

		divergingAgenticANDRoleEClass = createEClass(DIVERGING_AGENTIC_AND_ROLE);

		divergingAgenticANDVotingEClass = createEClass(DIVERGING_AGENTIC_AND_VOTING);

		divergingAgenticANDDebateEClass = createEClass(DIVERGING_AGENTIC_AND_DEBATE);

		divergingAgenticANDCompetitionEClass = createEClass(DIVERGING_AGENTIC_AND_COMPETITION);

		mergingAgenticANDRoleLeaderEClass = createEClass(MERGING_AGENTIC_AND_ROLE_LEADER);

		mergingAgenticANDRoleComposedEClass = createEClass(MERGING_AGENTIC_AND_ROLE_COMPOSED);

		mergingAgenticANDCompetitionFastestEClass = createEClass(MERGING_AGENTIC_AND_COMPETITION_FASTEST);

		mergingAgenticANDCompetitionMostCompleteEClass = createEClass(MERGING_AGENTIC_AND_COMPETITION_MOST_COMPLETE);

		mergingAgenticANDVotingAbsoluteMajorityEClass = createEClass(MERGING_AGENTIC_AND_VOTING_ABSOLUTE_MAJORITY);

		mergingAgenticANDVotingMajorityEClass = createEClass(MERGING_AGENTIC_AND_VOTING_MAJORITY);

		mergingAgenticANDVotingMinorityEClass = createEClass(MERGING_AGENTIC_AND_VOTING_MINORITY);

		divergingAgenticORVotingEClass = createEClass(DIVERGING_AGENTIC_OR_VOTING);

		divergingAgenticORDebateEClass = createEClass(DIVERGING_AGENTIC_OR_DEBATE);

		divergingAgenticORCompetitionEClass = createEClass(DIVERGING_AGENTIC_OR_COMPETITION);

		mergingAgenticORRoleLeaderEClass = createEClass(MERGING_AGENTIC_OR_ROLE_LEADER);

		mergingAgenticORRoleComposedEClass = createEClass(MERGING_AGENTIC_OR_ROLE_COMPOSED);

		mergingAgenticORCompetitionFastestEClass = createEClass(MERGING_AGENTIC_OR_COMPETITION_FASTEST);

		mergingAgenticORCompetitionMostCompleteEClass = createEClass(MERGING_AGENTIC_OR_COMPETITION_MOST_COMPLETE);

		mergingAgenticORVotingAbsoluteMajorityEClass = createEClass(MERGING_AGENTIC_OR_VOTING_ABSOLUTE_MAJORITY);

		mergingAgenticORVotingMajorityEClass = createEClass(MERGING_AGENTIC_OR_VOTING_MAJORITY);

		mergingAgenticORVotingMinorityEClass = createEClass(MERGING_AGENTIC_OR_VOTING_MINORITY);

		startEventEClass = createEClass(START_EVENT);

		intermediateEventEClass = createEClass(INTERMEDIATE_EVENT);

		endEventEClass = createEClass(END_EVENT);

		activityEClass = createEClass(ACTIVITY);

		agenticTaskEClass = createEClass(AGENTIC_TASK);
		createEReference(agenticTaskEClass, AGENTIC_TASK__AGENTIC);
		createEReference(agenticTaskEClass, AGENTIC_TASK__REFLECTION_MODE);
		createEAttribute(agenticTaskEClass, AGENTIC_TASK__UNCERTAINTY);

		artifactEClass = createEClass(ARTIFACT);

		dataObjectEClass = createEClass(DATA_OBJECT);

		groupEClass = createEClass(GROUP);
		createEReference(groupEClass, GROUP__ELEMENTS);

		agentEClass = createEClass(AGENT);

		agenticEClass = createEClass(AGENTIC);

		agentRoleEClass = createEClass(AGENT_ROLE);

		agentWorkerEClass = createEClass(AGENT_WORKER);

		agentManagerEClass = createEClass(AGENT_MANAGER);

		reflectionModeEClass = createEClass(REFLECTION_MODE);

		selfReflectionEClass = createEClass(SELF_REFLECTION);

		crossReflectionEClass = createEClass(CROSS_REFLECTION);

		humanReflectionEClass = createEClass(HUMAN_REFLECTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		swimlaneEClass.getESuperTypes().add(this.getBPMNElement());
		laneEClass.getESuperTypes().add(this.getSwimlane());
		agenticLaneEClass.getESuperTypes().add(this.getSwimlane());
		poolEClass.getESuperTypes().add(this.getSwimlane());
		connectingObjectEClass.getESuperTypes().add(this.getBPMNElement());
		messageFlowEClass.getESuperTypes().add(this.getConnectingObject());
		sequenceFlowEClass.getESuperTypes().add(this.getConnectingObject());
		associationEClass.getESuperTypes().add(this.getConnectingObject());
		flowObjectEClass.getESuperTypes().add(this.getBPMNElement());
		gatewayEClass.getESuperTypes().add(this.getFlowObject());
		xorEClass.getESuperTypes().add(this.getGateway());
		orEClass.getESuperTypes().add(this.getGateway());
		andEClass.getESuperTypes().add(this.getGateway());
		agenticGatewayEClass.getESuperTypes().add(this.getGateway());
		divergingAgenticANDRoleEClass.getESuperTypes().add(this.getAgenticGateway());
		divergingAgenticANDVotingEClass.getESuperTypes().add(this.getAgenticGateway());
		divergingAgenticANDDebateEClass.getESuperTypes().add(this.getAgenticGateway());
		divergingAgenticANDCompetitionEClass.getESuperTypes().add(this.getAgenticGateway());
		mergingAgenticANDRoleLeaderEClass.getESuperTypes().add(this.getAgenticGateway());
		mergingAgenticANDRoleComposedEClass.getESuperTypes().add(this.getAgenticGateway());
		mergingAgenticANDCompetitionFastestEClass.getESuperTypes().add(this.getAgenticGateway());
		mergingAgenticANDCompetitionMostCompleteEClass.getESuperTypes().add(this.getAgenticGateway());
		mergingAgenticANDVotingAbsoluteMajorityEClass.getESuperTypes().add(this.getAgenticGateway());
		mergingAgenticANDVotingMajorityEClass.getESuperTypes().add(this.getAgenticGateway());
		mergingAgenticANDVotingMinorityEClass.getESuperTypes().add(this.getAgenticGateway());
		divergingAgenticORVotingEClass.getESuperTypes().add(this.getAgenticGateway());
		divergingAgenticORDebateEClass.getESuperTypes().add(this.getAgenticGateway());
		divergingAgenticORCompetitionEClass.getESuperTypes().add(this.getAgenticGateway());
		mergingAgenticORRoleLeaderEClass.getESuperTypes().add(this.getAgenticGateway());
		mergingAgenticORRoleComposedEClass.getESuperTypes().add(this.getAgenticGateway());
		mergingAgenticORCompetitionFastestEClass.getESuperTypes().add(this.getAgenticGateway());
		mergingAgenticORCompetitionMostCompleteEClass.getESuperTypes().add(this.getAgenticGateway());
		mergingAgenticORVotingAbsoluteMajorityEClass.getESuperTypes().add(this.getAgenticGateway());
		mergingAgenticORVotingMajorityEClass.getESuperTypes().add(this.getAgenticGateway());
		mergingAgenticORVotingMinorityEClass.getESuperTypes().add(this.getAgenticGateway());
		startEventEClass.getESuperTypes().add(this.getFlowObject());
		intermediateEventEClass.getESuperTypes().add(this.getFlowObject());
		endEventEClass.getESuperTypes().add(this.getFlowObject());
		activityEClass.getESuperTypes().add(this.getFlowObject());
		agenticTaskEClass.getESuperTypes().add(this.getFlowObject());
		artifactEClass.getESuperTypes().add(this.getBPMNElement());
		dataObjectEClass.getESuperTypes().add(this.getArtifact());
		groupEClass.getESuperTypes().add(this.getArtifact());
		agentEClass.getESuperTypes().add(this.getBPMNElement());
		agenticEClass.getESuperTypes().add(this.getAgent());
		agentRoleEClass.getESuperTypes().add(this.getAgent());
		agentWorkerEClass.getESuperTypes().add(this.getAgentRole());
		agentManagerEClass.getESuperTypes().add(this.getAgentRole());
		reflectionModeEClass.getESuperTypes().add(this.getBPMNElement());
		selfReflectionEClass.getESuperTypes().add(this.getReflectionMode());
		crossReflectionEClass.getESuperTypes().add(this.getReflectionMode());
		humanReflectionEClass.getESuperTypes().add(this.getReflectionMode());

		// Initialize classes, features, and operations; add parameters
		initEClass(businessProcessDiagramEClass, BusinessProcessDiagram.class, "BusinessProcessDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusinessProcessDiagram_Elements(), this.getBPMNElement(), null, "elements", null, 0, -1, BusinessProcessDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bpmnElementEClass, BPMNElement.class, "BPMNElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBPMNElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, BPMNElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swimlaneEClass, Swimlane.class, "Swimlane", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(laneEClass, Lane.class, "Lane", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLane_FlowObjects(), this.getFlowObject(), null, "flowObjects", null, 0, -1, Lane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agenticLaneEClass, AgenticLane.class, "AgenticLane", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgenticLane_FlowObjects(), this.getFlowObject(), null, "flowObjects", null, 0, -1, AgenticLane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgenticLane_AgentRole(), this.getAgentRole(), null, "agentRole", null, 1, 1, AgenticLane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgenticLane_Uncertainty(), ecorePackage.getEDouble(), "uncertainty", null, 0, 1, AgenticLane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(poolEClass, Pool.class, "Pool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPool_Lanes(), this.getLane(), null, "lanes", null, 0, -1, Pool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPool_AgenticLanes(), this.getAgenticLane(), null, "agenticLanes", null, 0, -1, Pool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectingObjectEClass, ConnectingObject.class, "ConnectingObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectingObject_From(), this.getFlowObject(), null, "from", null, 0, 1, ConnectingObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectingObject_To(), this.getFlowObject(), null, "to", null, 0, 1, ConnectingObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageFlowEClass, MessageFlow.class, "MessageFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sequenceFlowEClass, SequenceFlow.class, "SequenceFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(flowObjectEClass, FlowObject.class, "FlowObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gatewayEClass, Gateway.class, "Gateway", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xorEClass, BPMNagentic.XOR.class, "XOR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orEClass, BPMNagentic.OR.class, "OR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andEClass, BPMNagentic.AND.class, "AND", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(agenticGatewayEClass, AgenticGateway.class, "AgenticGateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAgenticGateway_Uncertainty(), ecorePackage.getEDouble(), "uncertainty", null, 0, 1, AgenticGateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(divergingAgenticANDRoleEClass, DivergingAgenticANDRole.class, "DivergingAgenticANDRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(divergingAgenticANDVotingEClass, DivergingAgenticANDVoting.class, "DivergingAgenticANDVoting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(divergingAgenticANDDebateEClass, DivergingAgenticANDDebate.class, "DivergingAgenticANDDebate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(divergingAgenticANDCompetitionEClass, DivergingAgenticANDCompetition.class, "DivergingAgenticANDCompetition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mergingAgenticANDRoleLeaderEClass, MergingAgenticANDRoleLeader.class, "MergingAgenticANDRoleLeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mergingAgenticANDRoleComposedEClass, MergingAgenticANDRoleComposed.class, "MergingAgenticANDRoleComposed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mergingAgenticANDCompetitionFastestEClass, MergingAgenticANDCompetitionFastest.class, "MergingAgenticANDCompetitionFastest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mergingAgenticANDCompetitionMostCompleteEClass, MergingAgenticANDCompetitionMostComplete.class, "MergingAgenticANDCompetitionMostComplete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mergingAgenticANDVotingAbsoluteMajorityEClass, MergingAgenticANDVotingAbsoluteMajority.class, "MergingAgenticANDVotingAbsoluteMajority", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mergingAgenticANDVotingMajorityEClass, MergingAgenticANDVotingMajority.class, "MergingAgenticANDVotingMajority", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mergingAgenticANDVotingMinorityEClass, MergingAgenticANDVotingMinority.class, "MergingAgenticANDVotingMinority", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(divergingAgenticORVotingEClass, DivergingAgenticORVoting.class, "DivergingAgenticORVoting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(divergingAgenticORDebateEClass, DivergingAgenticORDebate.class, "DivergingAgenticORDebate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(divergingAgenticORCompetitionEClass, DivergingAgenticORCompetition.class, "DivergingAgenticORCompetition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mergingAgenticORRoleLeaderEClass, MergingAgenticORRoleLeader.class, "MergingAgenticORRoleLeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mergingAgenticORRoleComposedEClass, MergingAgenticORRoleComposed.class, "MergingAgenticORRoleComposed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mergingAgenticORCompetitionFastestEClass, MergingAgenticORCompetitionFastest.class, "MergingAgenticORCompetitionFastest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mergingAgenticORCompetitionMostCompleteEClass, MergingAgenticORCompetitionMostComplete.class, "MergingAgenticORCompetitionMostComplete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mergingAgenticORVotingAbsoluteMajorityEClass, MergingAgenticORVotingAbsoluteMajority.class, "MergingAgenticORVotingAbsoluteMajority", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mergingAgenticORVotingMajorityEClass, MergingAgenticORVotingMajority.class, "MergingAgenticORVotingMajority", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mergingAgenticORVotingMinorityEClass, MergingAgenticORVotingMinority.class, "MergingAgenticORVotingMinority", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(startEventEClass, StartEvent.class, "StartEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intermediateEventEClass, IntermediateEvent.class, "IntermediateEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(endEventEClass, EndEvent.class, "EndEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(agenticTaskEClass, AgenticTask.class, "AgenticTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgenticTask_Agentic(), this.getAgentic(), null, "agentic", null, 1, 1, AgenticTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgenticTask_ReflectionMode(), this.getReflectionMode(), null, "reflectionMode", null, 1, 1, AgenticTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgenticTask_Uncertainty(), ecorePackage.getEDouble(), "uncertainty", null, 0, 1, AgenticTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artifactEClass, Artifact.class, "Artifact", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataObjectEClass, DataObject.class, "DataObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroup_Elements(), this.getBPMNElement(), null, "elements", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agentEClass, Agent.class, "Agent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(agenticEClass, Agentic.class, "Agentic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(agentRoleEClass, AgentRole.class, "AgentRole", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(agentWorkerEClass, AgentWorker.class, "AgentWorker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(agentManagerEClass, AgentManager.class, "AgentManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reflectionModeEClass, ReflectionMode.class, "ReflectionMode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(selfReflectionEClass, SelfReflection.class, "SelfReflection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(crossReflectionEClass, CrossReflection.class, "CrossReflection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(humanReflectionEClass, HumanReflection.class, "HumanReflection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// aconite
		createAconiteAnnotations();
		// aconite.diagram
		createAconite_1Annotations();
		// aconite.container
		createAconite_2Annotations();
		// aconite.edge
		createAconite_3Annotations();
		// aconite.node
		createAconite_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>aconite</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAconiteAnnotations() {
		String source = "aconite";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "iconFolder", "lu.uni.snt.besser.bpmn-agentic/svg/"
		   });
	}

	/**
	 * Initializes the annotations for <b>aconite.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAconite_1Annotations() {
		String source = "aconite.diagram";
		addAnnotation
		  (businessProcessDiagramEClass,
		   source,
		   new String[] {
			   "name", "BPD"
		   });
	}

	/**
	 * Initializes the annotations for <b>aconite.container</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAconite_2Annotations() {
		String source = "aconite.container";
		addAnnotation
		  (laneEClass,
		   source,
		   new String[] {
			   "name", "Lane",
			   "container", "BPD, Group, Pool"
		   });
		addAnnotation
		  (agenticLaneEClass,
		   source,
		   new String[] {
			   "name", "AgenticLane",
			   "container", "BPD, Group, Pool"
		   });
		addAnnotation
		  (poolEClass,
		   source,
		   new String[] {
			   "name", "Pool",
			   "container", "BPD, Group"
		   });
		addAnnotation
		  (agenticTaskEClass,
		   source,
		   new String[] {
			   "name", "AgenticTask",
			   "container", "AgenticLane"
		   });
		addAnnotation
		  (groupEClass,
		   source,
		   new String[] {
			   "container", "BPD",
			   "name", "Group"
		   });
	}

	/**
	 * Initializes the annotations for <b>aconite.edge</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAconite_3Annotations() {
		String source = "aconite.edge";
		addAnnotation
		  (connectingObjectEClass,
		   source,
		   new String[] {
			   "container", "BPD",
			   "name", "Link",
			   "abstract", "true",
			   "source", "from",
			   "target", "to",
			   "color", "black"
		   });
		addAnnotation
		  (messageFlowEClass,
		   source,
		   new String[] {
			   "extend", "Link",
			   "lineStyle", "dash",
			   "name", "Message Flow"
		   });
		addAnnotation
		  (sequenceFlowEClass,
		   source,
		   new String[] {
			   "extend", "Link",
			   "name", "Sequence Flow"
		   });
		addAnnotation
		  (associationEClass,
		   source,
		   new String[] {
			   "extend", "Link",
			   "lineStlye", "dot",
			   "name", "Association"
		   });
	}

	/**
	 * Initializes the annotations for <b>aconite.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAconite_4Annotations() {
		String source = "aconite.node";
		addAnnotation
		  (flowObjectEClass,
		   source,
		   new String[] {
			   "abstract", "true",
			   "container", "Lane, AgenticLane",
			   "name", "Flow",
			   "shape", "image",
			   "borderSize", "0"
		   });
		addAnnotation
		  (xorEClass,
		   source,
		   new String[] {
			   "extend", "Flow",
			   "name", "XOR",
			   "imagePath", "xor-gateway.svg"
		   });
		addAnnotation
		  (orEClass,
		   source,
		   new String[] {
			   "extend", "Flow",
			   "name", "OR",
			   "imagePath", "or-gateway.svg"
		   });
		addAnnotation
		  (andEClass,
		   source,
		   new String[] {
			   "extend", "Flow",
			   "name", "AND",
			   "imagePath", "and-gateway.svg"
		   });
		addAnnotation
		  (agenticGatewayEClass,
		   source,
		   new String[] {
			   "extend", "Flow",
			   "name", "AgenticGateway",
			   "abstract", "true",
			   "container", "AgenticLane"
		   });
		addAnnotation
		  (divergingAgenticANDRoleEClass,
		   source,
		   new String[] {
			   "extend", "AgenticGateway",
			   "name", "Diverging AgenticAND Role",
			   "imagePath", "and-agentic-gateway-diverging-role.svg"
		   });
		addAnnotation
		  (divergingAgenticANDVotingEClass,
		   source,
		   new String[] {
			   "extend", "AgenticGateway",
			   "name", "Diverging AgenticAND Voting",
			   "imagePath", "and-agentic-gateway-diverging-voting.svg"
		   });
		addAnnotation
		  (divergingAgenticANDDebateEClass,
		   source,
		   new String[] {
			   "extend", "AgenticGateway",
			   "name", "Diverging AgenticAND Debate",
			   "imagePath", "and-agentic-gateway-diverging-debate.svg"
		   });
		addAnnotation
		  (divergingAgenticANDCompetitionEClass,
		   source,
		   new String[] {
			   "extend", "AgenticGateway",
			   "name", "Diverging AgenticAND Competition",
			   "imagePath", "and-agentic-gateway-diverging-Competition.svg"
		   });
		addAnnotation
		  (mergingAgenticANDRoleLeaderEClass,
		   source,
		   new String[] {
			   "extend", "AgenticGateway",
			   "name", "Merging AgenticAND Role Leader",
			   "imagePath", "and-agentic-gateway-merging-r-l.png"
		   });
		addAnnotation
		  (mergingAgenticANDRoleComposedEClass,
		   source,
		   new String[] {
			   "extend", "AgenticGateway",
			   "name", "Merging AgenticAND Role Composed",
			   "imagePath", "and-agentic-gateway-merging-r-c.png"
		   });
		addAnnotation
		  (mergingAgenticANDCompetitionFastestEClass,
		   source,
		   new String[] {
			   "extend", "AgenticGateway",
			   "name", "Merging AgenticAND Competition Fastest",
			   "imagePath", "and-agentic-gateway-merging-c-f.png"
		   });
		addAnnotation
		  (mergingAgenticANDCompetitionMostCompleteEClass,
		   source,
		   new String[] {
			   "extend", "AgenticGateway",
			   "name", "Merging AgenticAND Competition MostComplete",
			   "imagePath", "and-agentic-gateway-merging-c-mc.png"
		   });
		addAnnotation
		  (mergingAgenticANDVotingAbsoluteMajorityEClass,
		   source,
		   new String[] {
			   "extend", "AgenticGateway",
			   "name", "Merging AgenticAND Voting AbsoluteMajority",
			   "imagePath", "and-agentic-gateway-merging-v-a.png"
		   });
		addAnnotation
		  (mergingAgenticANDVotingMajorityEClass,
		   source,
		   new String[] {
			   "extend", "AgenticGateway",
			   "name", "Merging AgenticAND Voting Majority",
			   "imagePath", "and-agentic-gateway-merging-v-ma.png"
		   });
		addAnnotation
		  (mergingAgenticANDVotingMinorityEClass,
		   source,
		   new String[] {
			   "extend", "AgenticGateway",
			   "name", "Merging AgenticAND Voting Minority",
			   "imagePath", "and-agentic-gateway-merging-v-mi.png"
		   });
		addAnnotation
		  (divergingAgenticORVotingEClass,
		   source,
		   new String[] {
			   "extend", "AgenticGateway",
			   "name", "Diverging AgenticOR Voting",
			   "imagePath", "or-agentic-gateway-diverging-voting.svg"
		   });
		addAnnotation
		  (divergingAgenticORDebateEClass,
		   source,
		   new String[] {
			   "extend", "AgenticGateway",
			   "name", "Diverging AgenticOR Debate",
			   "imagePath", "or-agentic-gateway-diverging-debate.svg"
		   });
		addAnnotation
		  (divergingAgenticORCompetitionEClass,
		   source,
		   new String[] {
			   "extend", "AgenticGateway",
			   "name", "Diverging AgenticOR Competition",
			   "imagePath", "or-agentic-gateway-diverging-Competition.svg"
		   });
		addAnnotation
		  (mergingAgenticORRoleLeaderEClass,
		   source,
		   new String[] {
			   "extend", "AgenticGateway",
			   "name", "Merging AgenticOR Role Leader",
			   "imagePath", "or-agentic-gateway-merging-r-l.png"
		   });
		addAnnotation
		  (mergingAgenticORRoleComposedEClass,
		   source,
		   new String[] {
			   "extend", "AgenticGateway",
			   "name", "Merging AgenticOR Role Composed",
			   "imagePath", "or-agentic-gateway-merging-r-c.png"
		   });
		addAnnotation
		  (mergingAgenticORCompetitionFastestEClass,
		   source,
		   new String[] {
			   "extend", "AgenticGateway",
			   "name", "Merging AgenticOR Competition Fastest",
			   "imagePath", "or-agentic-gateway-merging-c-f.png"
		   });
		addAnnotation
		  (mergingAgenticORCompetitionMostCompleteEClass,
		   source,
		   new String[] {
			   "extend", "AgenticGateway",
			   "name", "Merging AgenticOR Competition MostComplete",
			   "imagePath", "or-agentic-gateway-merging-c-mc.png"
		   });
		addAnnotation
		  (mergingAgenticORVotingAbsoluteMajorityEClass,
		   source,
		   new String[] {
			   "extend", "AgenticGateway",
			   "name", "Merging AgenticOR Voting AbsoluteMajority",
			   "imagePath", "or-agentic-gateway-merging-v-a.png"
		   });
		addAnnotation
		  (mergingAgenticORVotingMajorityEClass,
		   source,
		   new String[] {
			   "extend", "AgenticGateway",
			   "name", "Merging AgenticOR Voting Majority",
			   "imagePath", "or-agentic-gateway-merging-v-ma.png"
		   });
		addAnnotation
		  (mergingAgenticORVotingMinorityEClass,
		   source,
		   new String[] {
			   "extend", "AgenticGateway",
			   "name", "Merging AgenticOR Voting Minority",
			   "imagePath", "or-agentic-gateway-merging-v-mi.png"
		   });
		addAnnotation
		  (startEventEClass,
		   source,
		   new String[] {
			   "extend", "Flow",
			   "name", "Start Event",
			   "imagePath", "start-event.svg"
		   });
		addAnnotation
		  (intermediateEventEClass,
		   source,
		   new String[] {
			   "extend", "Flow",
			   "name", "Intermediate Event",
			   "imagePath", "intermediate-event.svg"
		   });
		addAnnotation
		  (endEventEClass,
		   source,
		   new String[] {
			   "extend", "Flow",
			   "name", "End Event",
			   "imagePath", "end-event.svg"
		   });
		addAnnotation
		  (activityEClass,
		   source,
		   new String[] {
			   "name", "Activity",
			   "container", "Lane, AgenticLane"
		   });
		addAnnotation
		  (dataObjectEClass,
		   source,
		   new String[] {
			   "container", "Lane",
			   "name", "Data Object",
			   "shape", "image",
			   "imagePath", "data-object.svg"
		   });
		addAnnotation
		  (agentEClass,
		   source,
		   new String[] {
			   "name", "Agent",
			   "borderSize", "0",
			   "shape", "image",
			   "abstract", "true"
		   });
		addAnnotation
		  (agenticEClass,
		   source,
		   new String[] {
			   "extend", "Agent",
			   "name", "Agentic",
			   "container", "AgenticTask",
			   "imagePath", "agent.svg"
		   });
		addAnnotation
		  (agentRoleEClass,
		   source,
		   new String[] {
			   "extend", "Agent",
			   "container", "AgenticLane",
			   "name", "AgentRole",
			   "abstract", "true"
		   });
		addAnnotation
		  (agentWorkerEClass,
		   source,
		   new String[] {
			   "extend", "AgentRole",
			   "name", "AgentWorker",
			   "imagePath", "agent-worker.svg"
		   });
		addAnnotation
		  (agentManagerEClass,
		   source,
		   new String[] {
			   "extend", "AgentRole",
			   "name", "AgentManager",
			   "imagePath", "agent-manager.svg"
		   });
		addAnnotation
		  (reflectionModeEClass,
		   source,
		   new String[] {
			   "name", "ReflectionMode",
			   "abstract", "true",
			   "container", "AgenticTask",
			   "shape", "image",
			   "borderSize", "0"
		   });
		addAnnotation
		  (selfReflectionEClass,
		   source,
		   new String[] {
			   "name", "SelfReflection",
			   "extend", "ReflectionMode",
			   "imagePath", "reflection-self.svg"
		   });
		addAnnotation
		  (crossReflectionEClass,
		   source,
		   new String[] {
			   "name", "CrossReflection",
			   "extend", "ReflectionMode",
			   "imagePath", "reflection-cross.svg"
		   });
		addAnnotation
		  (humanReflectionEClass,
		   source,
		   new String[] {
			   "name", "HumanReflection",
			   "extend", "ReflectionMode",
			   "imagePath", "reflection-human.svg"
		   });
	}

} //BPMNagenticPackageImpl
