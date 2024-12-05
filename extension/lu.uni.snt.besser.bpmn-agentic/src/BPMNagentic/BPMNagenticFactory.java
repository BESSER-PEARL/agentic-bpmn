/**
 */
package BPMNagentic;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see BPMNagentic.BPMNagenticPackage
 * @generated
 */
public interface BPMNagenticFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BPMNagenticFactory eINSTANCE = BPMNagentic.impl.BPMNagenticFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Business Process Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Process Diagram</em>'.
	 * @generated
	 */
	BusinessProcessDiagram createBusinessProcessDiagram();

	/**
	 * Returns a new object of class '<em>BPMN Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BPMN Element</em>'.
	 * @generated
	 */
	BPMNElement createBPMNElement();

	/**
	 * Returns a new object of class '<em>Lane</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lane</em>'.
	 * @generated
	 */
	Lane createLane();

	/**
	 * Returns a new object of class '<em>Agentic Lane</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agentic Lane</em>'.
	 * @generated
	 */
	AgenticLane createAgenticLane();

	/**
	 * Returns a new object of class '<em>Pool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pool</em>'.
	 * @generated
	 */
	Pool createPool();

	/**
	 * Returns a new object of class '<em>Message Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Flow</em>'.
	 * @generated
	 */
	MessageFlow createMessageFlow();

	/**
	 * Returns a new object of class '<em>Sequence Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Flow</em>'.
	 * @generated
	 */
	SequenceFlow createSequenceFlow();

	/**
	 * Returns a new object of class '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Association</em>'.
	 * @generated
	 */
	Association createAssociation();

	/**
	 * Returns a new object of class '<em>XOR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XOR</em>'.
	 * @generated
	 */
	XOR createXOR();

	/**
	 * Returns a new object of class '<em>OR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OR</em>'.
	 * @generated
	 */
	OR createOR();

	/**
	 * Returns a new object of class '<em>AND</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AND</em>'.
	 * @generated
	 */
	AND createAND();

	/**
	 * Returns a new object of class '<em>Agentic Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agentic Gateway</em>'.
	 * @generated
	 */
	AgenticGateway createAgenticGateway();

	/**
	 * Returns a new object of class '<em>Diverging Agentic AND Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diverging Agentic AND Role</em>'.
	 * @generated
	 */
	DivergingAgenticANDRole createDivergingAgenticANDRole();

	/**
	 * Returns a new object of class '<em>Diverging Agentic AND Voting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diverging Agentic AND Voting</em>'.
	 * @generated
	 */
	DivergingAgenticANDVoting createDivergingAgenticANDVoting();

	/**
	 * Returns a new object of class '<em>Diverging Agentic AND Debate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diverging Agentic AND Debate</em>'.
	 * @generated
	 */
	DivergingAgenticANDDebate createDivergingAgenticANDDebate();

	/**
	 * Returns a new object of class '<em>Diverging Agentic AND Competition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diverging Agentic AND Competition</em>'.
	 * @generated
	 */
	DivergingAgenticANDCompetition createDivergingAgenticANDCompetition();

	/**
	 * Returns a new object of class '<em>Merging Agentic AND Role Leader</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merging Agentic AND Role Leader</em>'.
	 * @generated
	 */
	MergingAgenticANDRoleLeader createMergingAgenticANDRoleLeader();

	/**
	 * Returns a new object of class '<em>Merging Agentic AND Role Composed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merging Agentic AND Role Composed</em>'.
	 * @generated
	 */
	MergingAgenticANDRoleComposed createMergingAgenticANDRoleComposed();

	/**
	 * Returns a new object of class '<em>Merging Agentic AND Competition Fastest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merging Agentic AND Competition Fastest</em>'.
	 * @generated
	 */
	MergingAgenticANDCompetitionFastest createMergingAgenticANDCompetitionFastest();

	/**
	 * Returns a new object of class '<em>Merging Agentic AND Competition Most Complete</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merging Agentic AND Competition Most Complete</em>'.
	 * @generated
	 */
	MergingAgenticANDCompetitionMostComplete createMergingAgenticANDCompetitionMostComplete();

	/**
	 * Returns a new object of class '<em>Merging Agentic AND Voting Absolute Majority</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merging Agentic AND Voting Absolute Majority</em>'.
	 * @generated
	 */
	MergingAgenticANDVotingAbsoluteMajority createMergingAgenticANDVotingAbsoluteMajority();

	/**
	 * Returns a new object of class '<em>Merging Agentic AND Voting Majority</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merging Agentic AND Voting Majority</em>'.
	 * @generated
	 */
	MergingAgenticANDVotingMajority createMergingAgenticANDVotingMajority();

	/**
	 * Returns a new object of class '<em>Merging Agentic AND Voting Minority</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merging Agentic AND Voting Minority</em>'.
	 * @generated
	 */
	MergingAgenticANDVotingMinority createMergingAgenticANDVotingMinority();

	/**
	 * Returns a new object of class '<em>Diverging Agentic OR Voting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diverging Agentic OR Voting</em>'.
	 * @generated
	 */
	DivergingAgenticORVoting createDivergingAgenticORVoting();

	/**
	 * Returns a new object of class '<em>Diverging Agentic OR Debate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diverging Agentic OR Debate</em>'.
	 * @generated
	 */
	DivergingAgenticORDebate createDivergingAgenticORDebate();

	/**
	 * Returns a new object of class '<em>Diverging Agentic OR Competition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diverging Agentic OR Competition</em>'.
	 * @generated
	 */
	DivergingAgenticORCompetition createDivergingAgenticORCompetition();

	/**
	 * Returns a new object of class '<em>Merging Agentic OR Role Leader</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merging Agentic OR Role Leader</em>'.
	 * @generated
	 */
	MergingAgenticORRoleLeader createMergingAgenticORRoleLeader();

	/**
	 * Returns a new object of class '<em>Merging Agentic OR Role Composed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merging Agentic OR Role Composed</em>'.
	 * @generated
	 */
	MergingAgenticORRoleComposed createMergingAgenticORRoleComposed();

	/**
	 * Returns a new object of class '<em>Merging Agentic OR Competition Fastest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merging Agentic OR Competition Fastest</em>'.
	 * @generated
	 */
	MergingAgenticORCompetitionFastest createMergingAgenticORCompetitionFastest();

	/**
	 * Returns a new object of class '<em>Merging Agentic OR Competition Most Complete</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merging Agentic OR Competition Most Complete</em>'.
	 * @generated
	 */
	MergingAgenticORCompetitionMostComplete createMergingAgenticORCompetitionMostComplete();

	/**
	 * Returns a new object of class '<em>Merging Agentic OR Voting Absolute Majority</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merging Agentic OR Voting Absolute Majority</em>'.
	 * @generated
	 */
	MergingAgenticORVotingAbsoluteMajority createMergingAgenticORVotingAbsoluteMajority();

	/**
	 * Returns a new object of class '<em>Merging Agentic OR Voting Majority</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merging Agentic OR Voting Majority</em>'.
	 * @generated
	 */
	MergingAgenticORVotingMajority createMergingAgenticORVotingMajority();

	/**
	 * Returns a new object of class '<em>Merging Agentic OR Voting Minority</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merging Agentic OR Voting Minority</em>'.
	 * @generated
	 */
	MergingAgenticORVotingMinority createMergingAgenticORVotingMinority();

	/**
	 * Returns a new object of class '<em>Start Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Event</em>'.
	 * @generated
	 */
	StartEvent createStartEvent();

	/**
	 * Returns a new object of class '<em>Intermediate Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intermediate Event</em>'.
	 * @generated
	 */
	IntermediateEvent createIntermediateEvent();

	/**
	 * Returns a new object of class '<em>End Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Event</em>'.
	 * @generated
	 */
	EndEvent createEndEvent();

	/**
	 * Returns a new object of class '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity</em>'.
	 * @generated
	 */
	Activity createActivity();

	/**
	 * Returns a new object of class '<em>Agentic Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agentic Task</em>'.
	 * @generated
	 */
	AgenticTask createAgenticTask();

	/**
	 * Returns a new object of class '<em>Data Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Object</em>'.
	 * @generated
	 */
	DataObject createDataObject();

	/**
	 * Returns a new object of class '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group</em>'.
	 * @generated
	 */
	Group createGroup();

	/**
	 * Returns a new object of class '<em>Agentic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agentic</em>'.
	 * @generated
	 */
	Agentic createAgentic();

	/**
	 * Returns a new object of class '<em>Agent Worker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agent Worker</em>'.
	 * @generated
	 */
	AgentWorker createAgentWorker();

	/**
	 * Returns a new object of class '<em>Agent Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agent Manager</em>'.
	 * @generated
	 */
	AgentManager createAgentManager();

	/**
	 * Returns a new object of class '<em>Self Reflection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Self Reflection</em>'.
	 * @generated
	 */
	SelfReflection createSelfReflection();

	/**
	 * Returns a new object of class '<em>Cross Reflection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cross Reflection</em>'.
	 * @generated
	 */
	CrossReflection createCrossReflection();

	/**
	 * Returns a new object of class '<em>Human Reflection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Human Reflection</em>'.
	 * @generated
	 */
	HumanReflection createHumanReflection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BPMNagenticPackage getBPMNagenticPackage();

} //BPMNagenticFactory
