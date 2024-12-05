/**
 */
package BPMNagentic;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see BPMNagentic.BPMNagenticFactory
 * @model kind="package"
 *        annotation="aconite iconFolder='lu.uni.snt.besser.bpmn-agentic/svg/'"
 * @generated
 */
public interface BPMNagenticPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "BPMNagentic";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://lu.uni.snt.besser.bpmn-agentic";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bpmnagentic";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BPMNagenticPackage eINSTANCE = BPMNagentic.impl.BPMNagenticPackageImpl.init();

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.BusinessProcessDiagramImpl <em>Business Process Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.BusinessProcessDiagramImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getBusinessProcessDiagram()
	 * @generated
	 */
	int BUSINESS_PROCESS_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_DIAGRAM__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Business Process Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_DIAGRAM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Business Process Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.BPMNElementImpl <em>BPMN Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.BPMNElementImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getBPMNElement()
	 * @generated
	 */
	int BPMN_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>BPMN Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>BPMN Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.SwimlaneImpl <em>Swimlane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.SwimlaneImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getSwimlane()
	 * @generated
	 */
	int SWIMLANE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIMLANE__NAME = BPMN_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Swimlane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIMLANE_FEATURE_COUNT = BPMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Swimlane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIMLANE_OPERATION_COUNT = BPMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.LaneImpl <em>Lane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.LaneImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getLane()
	 * @generated
	 */
	int LANE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__NAME = SWIMLANE__NAME;

	/**
	 * The feature id for the '<em><b>Flow Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__FLOW_OBJECTS = SWIMLANE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_FEATURE_COUNT = SWIMLANE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_OPERATION_COUNT = SWIMLANE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.AgenticLaneImpl <em>Agentic Lane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.AgenticLaneImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getAgenticLane()
	 * @generated
	 */
	int AGENTIC_LANE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENTIC_LANE__NAME = SWIMLANE__NAME;

	/**
	 * The feature id for the '<em><b>Flow Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENTIC_LANE__FLOW_OBJECTS = SWIMLANE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Agent Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENTIC_LANE__AGENT_ROLE = SWIMLANE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENTIC_LANE__UNCERTAINTY = SWIMLANE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Agentic Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENTIC_LANE_FEATURE_COUNT = SWIMLANE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Agentic Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENTIC_LANE_OPERATION_COUNT = SWIMLANE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.PoolImpl <em>Pool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.PoolImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getPool()
	 * @generated
	 */
	int POOL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__NAME = SWIMLANE__NAME;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__LANES = SWIMLANE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Agentic Lanes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__AGENTIC_LANES = SWIMLANE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL_FEATURE_COUNT = SWIMLANE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL_OPERATION_COUNT = SWIMLANE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.ConnectingObjectImpl <em>Connecting Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.ConnectingObjectImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getConnectingObject()
	 * @generated
	 */
	int CONNECTING_OBJECT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTING_OBJECT__NAME = BPMN_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTING_OBJECT__FROM = BPMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTING_OBJECT__TO = BPMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connecting Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTING_OBJECT_FEATURE_COUNT = BPMN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Connecting Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTING_OBJECT_OPERATION_COUNT = BPMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.MessageFlowImpl <em>Message Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.MessageFlowImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getMessageFlow()
	 * @generated
	 */
	int MESSAGE_FLOW = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW__NAME = CONNECTING_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW__FROM = CONNECTING_OBJECT__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW__TO = CONNECTING_OBJECT__TO;

	/**
	 * The number of structural features of the '<em>Message Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW_FEATURE_COUNT = CONNECTING_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Message Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW_OPERATION_COUNT = CONNECTING_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.SequenceFlowImpl <em>Sequence Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.SequenceFlowImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getSequenceFlow()
	 * @generated
	 */
	int SEQUENCE_FLOW = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__NAME = CONNECTING_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__FROM = CONNECTING_OBJECT__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__TO = CONNECTING_OBJECT__TO;

	/**
	 * The number of structural features of the '<em>Sequence Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_FEATURE_COUNT = CONNECTING_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sequence Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_OPERATION_COUNT = CONNECTING_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.AssociationImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAME = CONNECTING_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__FROM = CONNECTING_OBJECT__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TO = CONNECTING_OBJECT__TO;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = CONNECTING_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OPERATION_COUNT = CONNECTING_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.FlowObjectImpl <em>Flow Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.FlowObjectImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getFlowObject()
	 * @generated
	 */
	int FLOW_OBJECT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_OBJECT__NAME = BPMN_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Flow Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_OBJECT_FEATURE_COUNT = BPMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Flow Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_OBJECT_OPERATION_COUNT = BPMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.GatewayImpl <em>Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.GatewayImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getGateway()
	 * @generated
	 */
	int GATEWAY = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__NAME = FLOW_OBJECT__NAME;

	/**
	 * The number of structural features of the '<em>Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_FEATURE_COUNT = FLOW_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_OPERATION_COUNT = FLOW_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.XORImpl <em>XOR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.XORImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getXOR()
	 * @generated
	 */
	int XOR = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__NAME = GATEWAY__NAME;

	/**
	 * The number of structural features of the '<em>XOR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_COUNT = GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XOR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_OPERATION_COUNT = GATEWAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.ORImpl <em>OR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.ORImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getOR()
	 * @generated
	 */
	int OR = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__NAME = GATEWAY__NAME;

	/**
	 * The number of structural features of the '<em>OR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = GATEWAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.ANDImpl <em>AND</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.ANDImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getAND()
	 * @generated
	 */
	int AND = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__NAME = GATEWAY__NAME;

	/**
	 * The number of structural features of the '<em>AND</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>AND</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = GATEWAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.AgenticGatewayImpl <em>Agentic Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.AgenticGatewayImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getAgenticGateway()
	 * @generated
	 */
	int AGENTIC_GATEWAY = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENTIC_GATEWAY__NAME = GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENTIC_GATEWAY__UNCERTAINTY = GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Agentic Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENTIC_GATEWAY_FEATURE_COUNT = GATEWAY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Agentic Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENTIC_GATEWAY_OPERATION_COUNT = GATEWAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.DivergingAgenticANDRoleImpl <em>Diverging Agentic AND Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.DivergingAgenticANDRoleImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getDivergingAgenticANDRole()
	 * @generated
	 */
	int DIVERGING_AGENTIC_AND_ROLE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVERGING_AGENTIC_AND_ROLE__NAME = AGENTIC_GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVERGING_AGENTIC_AND_ROLE__UNCERTAINTY = AGENTIC_GATEWAY__UNCERTAINTY;

	/**
	 * The number of structural features of the '<em>Diverging Agentic AND Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVERGING_AGENTIC_AND_ROLE_FEATURE_COUNT = AGENTIC_GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Diverging Agentic AND Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVERGING_AGENTIC_AND_ROLE_OPERATION_COUNT = AGENTIC_GATEWAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.DivergingAgenticANDVotingImpl <em>Diverging Agentic AND Voting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.DivergingAgenticANDVotingImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getDivergingAgenticANDVoting()
	 * @generated
	 */
	int DIVERGING_AGENTIC_AND_VOTING = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVERGING_AGENTIC_AND_VOTING__NAME = AGENTIC_GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVERGING_AGENTIC_AND_VOTING__UNCERTAINTY = AGENTIC_GATEWAY__UNCERTAINTY;

	/**
	 * The number of structural features of the '<em>Diverging Agentic AND Voting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVERGING_AGENTIC_AND_VOTING_FEATURE_COUNT = AGENTIC_GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Diverging Agentic AND Voting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVERGING_AGENTIC_AND_VOTING_OPERATION_COUNT = AGENTIC_GATEWAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.DivergingAgenticANDDebateImpl <em>Diverging Agentic AND Debate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.DivergingAgenticANDDebateImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getDivergingAgenticANDDebate()
	 * @generated
	 */
	int DIVERGING_AGENTIC_AND_DEBATE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVERGING_AGENTIC_AND_DEBATE__NAME = AGENTIC_GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVERGING_AGENTIC_AND_DEBATE__UNCERTAINTY = AGENTIC_GATEWAY__UNCERTAINTY;

	/**
	 * The number of structural features of the '<em>Diverging Agentic AND Debate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVERGING_AGENTIC_AND_DEBATE_FEATURE_COUNT = AGENTIC_GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Diverging Agentic AND Debate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVERGING_AGENTIC_AND_DEBATE_OPERATION_COUNT = AGENTIC_GATEWAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.DivergingAgenticANDCompetitionImpl <em>Diverging Agentic AND Competition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.DivergingAgenticANDCompetitionImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getDivergingAgenticANDCompetition()
	 * @generated
	 */
	int DIVERGING_AGENTIC_AND_COMPETITION = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVERGING_AGENTIC_AND_COMPETITION__NAME = AGENTIC_GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVERGING_AGENTIC_AND_COMPETITION__UNCERTAINTY = AGENTIC_GATEWAY__UNCERTAINTY;

	/**
	 * The number of structural features of the '<em>Diverging Agentic AND Competition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVERGING_AGENTIC_AND_COMPETITION_FEATURE_COUNT = AGENTIC_GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Diverging Agentic AND Competition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVERGING_AGENTIC_AND_COMPETITION_OPERATION_COUNT = AGENTIC_GATEWAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.MergingAgenticANDRoleLeaderImpl <em>Merging Agentic AND Role Leader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.MergingAgenticANDRoleLeaderImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getMergingAgenticANDRoleLeader()
	 * @generated
	 */
	int MERGING_AGENTIC_AND_ROLE_LEADER = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_AND_ROLE_LEADER__NAME = AGENTIC_GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_AND_ROLE_LEADER__UNCERTAINTY = AGENTIC_GATEWAY__UNCERTAINTY;

	/**
	 * The number of structural features of the '<em>Merging Agentic AND Role Leader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_AND_ROLE_LEADER_FEATURE_COUNT = AGENTIC_GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Merging Agentic AND Role Leader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_AND_ROLE_LEADER_OPERATION_COUNT = AGENTIC_GATEWAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.MergingAgenticANDRoleComposedImpl <em>Merging Agentic AND Role Composed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.MergingAgenticANDRoleComposedImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getMergingAgenticANDRoleComposed()
	 * @generated
	 */
	int MERGING_AGENTIC_AND_ROLE_COMPOSED = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_AND_ROLE_COMPOSED__NAME = AGENTIC_GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_AND_ROLE_COMPOSED__UNCERTAINTY = AGENTIC_GATEWAY__UNCERTAINTY;

	/**
	 * The number of structural features of the '<em>Merging Agentic AND Role Composed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_AND_ROLE_COMPOSED_FEATURE_COUNT = AGENTIC_GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Merging Agentic AND Role Composed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_AND_ROLE_COMPOSED_OPERATION_COUNT = AGENTIC_GATEWAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.MergingAgenticANDCompetitionFastestImpl <em>Merging Agentic AND Competition Fastest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.MergingAgenticANDCompetitionFastestImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getMergingAgenticANDCompetitionFastest()
	 * @generated
	 */
	int MERGING_AGENTIC_AND_COMPETITION_FASTEST = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_AND_COMPETITION_FASTEST__NAME = AGENTIC_GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_AND_COMPETITION_FASTEST__UNCERTAINTY = AGENTIC_GATEWAY__UNCERTAINTY;

	/**
	 * The number of structural features of the '<em>Merging Agentic AND Competition Fastest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_AND_COMPETITION_FASTEST_FEATURE_COUNT = AGENTIC_GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Merging Agentic AND Competition Fastest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_AND_COMPETITION_FASTEST_OPERATION_COUNT = AGENTIC_GATEWAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.MergingAgenticANDCompetitionMostCompleteImpl <em>Merging Agentic AND Competition Most Complete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.MergingAgenticANDCompetitionMostCompleteImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getMergingAgenticANDCompetitionMostComplete()
	 * @generated
	 */
	int MERGING_AGENTIC_AND_COMPETITION_MOST_COMPLETE = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_AND_COMPETITION_MOST_COMPLETE__NAME = AGENTIC_GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_AND_COMPETITION_MOST_COMPLETE__UNCERTAINTY = AGENTIC_GATEWAY__UNCERTAINTY;

	/**
	 * The number of structural features of the '<em>Merging Agentic AND Competition Most Complete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_AND_COMPETITION_MOST_COMPLETE_FEATURE_COUNT = AGENTIC_GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Merging Agentic AND Competition Most Complete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_AND_COMPETITION_MOST_COMPLETE_OPERATION_COUNT = AGENTIC_GATEWAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.MergingAgenticANDVotingAbsoluteMajorityImpl <em>Merging Agentic AND Voting Absolute Majority</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.MergingAgenticANDVotingAbsoluteMajorityImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getMergingAgenticANDVotingAbsoluteMajority()
	 * @generated
	 */
	int MERGING_AGENTIC_AND_VOTING_ABSOLUTE_MAJORITY = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_AND_VOTING_ABSOLUTE_MAJORITY__NAME = AGENTIC_GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_AND_VOTING_ABSOLUTE_MAJORITY__UNCERTAINTY = AGENTIC_GATEWAY__UNCERTAINTY;

	/**
	 * The number of structural features of the '<em>Merging Agentic AND Voting Absolute Majority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_AND_VOTING_ABSOLUTE_MAJORITY_FEATURE_COUNT = AGENTIC_GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Merging Agentic AND Voting Absolute Majority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_AND_VOTING_ABSOLUTE_MAJORITY_OPERATION_COUNT = AGENTIC_GATEWAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.MergingAgenticANDVotingMajorityImpl <em>Merging Agentic AND Voting Majority</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.MergingAgenticANDVotingMajorityImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getMergingAgenticANDVotingMajority()
	 * @generated
	 */
	int MERGING_AGENTIC_AND_VOTING_MAJORITY = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_AND_VOTING_MAJORITY__NAME = AGENTIC_GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_AND_VOTING_MAJORITY__UNCERTAINTY = AGENTIC_GATEWAY__UNCERTAINTY;

	/**
	 * The number of structural features of the '<em>Merging Agentic AND Voting Majority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_AND_VOTING_MAJORITY_FEATURE_COUNT = AGENTIC_GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Merging Agentic AND Voting Majority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_AND_VOTING_MAJORITY_OPERATION_COUNT = AGENTIC_GATEWAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.MergingAgenticANDVotingMinorityImpl <em>Merging Agentic AND Voting Minority</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.MergingAgenticANDVotingMinorityImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getMergingAgenticANDVotingMinority()
	 * @generated
	 */
	int MERGING_AGENTIC_AND_VOTING_MINORITY = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_AND_VOTING_MINORITY__NAME = AGENTIC_GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_AND_VOTING_MINORITY__UNCERTAINTY = AGENTIC_GATEWAY__UNCERTAINTY;

	/**
	 * The number of structural features of the '<em>Merging Agentic AND Voting Minority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_AND_VOTING_MINORITY_FEATURE_COUNT = AGENTIC_GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Merging Agentic AND Voting Minority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_AND_VOTING_MINORITY_OPERATION_COUNT = AGENTIC_GATEWAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.DivergingAgenticORVotingImpl <em>Diverging Agentic OR Voting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.DivergingAgenticORVotingImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getDivergingAgenticORVoting()
	 * @generated
	 */
	int DIVERGING_AGENTIC_OR_VOTING = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVERGING_AGENTIC_OR_VOTING__NAME = AGENTIC_GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVERGING_AGENTIC_OR_VOTING__UNCERTAINTY = AGENTIC_GATEWAY__UNCERTAINTY;

	/**
	 * The number of structural features of the '<em>Diverging Agentic OR Voting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVERGING_AGENTIC_OR_VOTING_FEATURE_COUNT = AGENTIC_GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Diverging Agentic OR Voting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVERGING_AGENTIC_OR_VOTING_OPERATION_COUNT = AGENTIC_GATEWAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.DivergingAgenticORDebateImpl <em>Diverging Agentic OR Debate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.DivergingAgenticORDebateImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getDivergingAgenticORDebate()
	 * @generated
	 */
	int DIVERGING_AGENTIC_OR_DEBATE = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVERGING_AGENTIC_OR_DEBATE__NAME = AGENTIC_GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVERGING_AGENTIC_OR_DEBATE__UNCERTAINTY = AGENTIC_GATEWAY__UNCERTAINTY;

	/**
	 * The number of structural features of the '<em>Diverging Agentic OR Debate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVERGING_AGENTIC_OR_DEBATE_FEATURE_COUNT = AGENTIC_GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Diverging Agentic OR Debate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVERGING_AGENTIC_OR_DEBATE_OPERATION_COUNT = AGENTIC_GATEWAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.DivergingAgenticORCompetitionImpl <em>Diverging Agentic OR Competition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.DivergingAgenticORCompetitionImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getDivergingAgenticORCompetition()
	 * @generated
	 */
	int DIVERGING_AGENTIC_OR_COMPETITION = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVERGING_AGENTIC_OR_COMPETITION__NAME = AGENTIC_GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVERGING_AGENTIC_OR_COMPETITION__UNCERTAINTY = AGENTIC_GATEWAY__UNCERTAINTY;

	/**
	 * The number of structural features of the '<em>Diverging Agentic OR Competition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVERGING_AGENTIC_OR_COMPETITION_FEATURE_COUNT = AGENTIC_GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Diverging Agentic OR Competition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVERGING_AGENTIC_OR_COMPETITION_OPERATION_COUNT = AGENTIC_GATEWAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.MergingAgenticORRoleLeaderImpl <em>Merging Agentic OR Role Leader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.MergingAgenticORRoleLeaderImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getMergingAgenticORRoleLeader()
	 * @generated
	 */
	int MERGING_AGENTIC_OR_ROLE_LEADER = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_OR_ROLE_LEADER__NAME = AGENTIC_GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_OR_ROLE_LEADER__UNCERTAINTY = AGENTIC_GATEWAY__UNCERTAINTY;

	/**
	 * The number of structural features of the '<em>Merging Agentic OR Role Leader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_OR_ROLE_LEADER_FEATURE_COUNT = AGENTIC_GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Merging Agentic OR Role Leader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_OR_ROLE_LEADER_OPERATION_COUNT = AGENTIC_GATEWAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.MergingAgenticORRoleComposedImpl <em>Merging Agentic OR Role Composed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.MergingAgenticORRoleComposedImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getMergingAgenticORRoleComposed()
	 * @generated
	 */
	int MERGING_AGENTIC_OR_ROLE_COMPOSED = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_OR_ROLE_COMPOSED__NAME = AGENTIC_GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_OR_ROLE_COMPOSED__UNCERTAINTY = AGENTIC_GATEWAY__UNCERTAINTY;

	/**
	 * The number of structural features of the '<em>Merging Agentic OR Role Composed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_OR_ROLE_COMPOSED_FEATURE_COUNT = AGENTIC_GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Merging Agentic OR Role Composed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_OR_ROLE_COMPOSED_OPERATION_COUNT = AGENTIC_GATEWAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.MergingAgenticORCompetitionFastestImpl <em>Merging Agentic OR Competition Fastest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.MergingAgenticORCompetitionFastestImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getMergingAgenticORCompetitionFastest()
	 * @generated
	 */
	int MERGING_AGENTIC_OR_COMPETITION_FASTEST = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_OR_COMPETITION_FASTEST__NAME = AGENTIC_GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_OR_COMPETITION_FASTEST__UNCERTAINTY = AGENTIC_GATEWAY__UNCERTAINTY;

	/**
	 * The number of structural features of the '<em>Merging Agentic OR Competition Fastest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_OR_COMPETITION_FASTEST_FEATURE_COUNT = AGENTIC_GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Merging Agentic OR Competition Fastest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_OR_COMPETITION_FASTEST_OPERATION_COUNT = AGENTIC_GATEWAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.MergingAgenticORCompetitionMostCompleteImpl <em>Merging Agentic OR Competition Most Complete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.MergingAgenticORCompetitionMostCompleteImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getMergingAgenticORCompetitionMostComplete()
	 * @generated
	 */
	int MERGING_AGENTIC_OR_COMPETITION_MOST_COMPLETE = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_OR_COMPETITION_MOST_COMPLETE__NAME = AGENTIC_GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_OR_COMPETITION_MOST_COMPLETE__UNCERTAINTY = AGENTIC_GATEWAY__UNCERTAINTY;

	/**
	 * The number of structural features of the '<em>Merging Agentic OR Competition Most Complete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_OR_COMPETITION_MOST_COMPLETE_FEATURE_COUNT = AGENTIC_GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Merging Agentic OR Competition Most Complete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_OR_COMPETITION_MOST_COMPLETE_OPERATION_COUNT = AGENTIC_GATEWAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.MergingAgenticORVotingAbsoluteMajorityImpl <em>Merging Agentic OR Voting Absolute Majority</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.MergingAgenticORVotingAbsoluteMajorityImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getMergingAgenticORVotingAbsoluteMajority()
	 * @generated
	 */
	int MERGING_AGENTIC_OR_VOTING_ABSOLUTE_MAJORITY = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_OR_VOTING_ABSOLUTE_MAJORITY__NAME = AGENTIC_GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_OR_VOTING_ABSOLUTE_MAJORITY__UNCERTAINTY = AGENTIC_GATEWAY__UNCERTAINTY;

	/**
	 * The number of structural features of the '<em>Merging Agentic OR Voting Absolute Majority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_OR_VOTING_ABSOLUTE_MAJORITY_FEATURE_COUNT = AGENTIC_GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Merging Agentic OR Voting Absolute Majority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_OR_VOTING_ABSOLUTE_MAJORITY_OPERATION_COUNT = AGENTIC_GATEWAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.MergingAgenticORVotingMajorityImpl <em>Merging Agentic OR Voting Majority</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.MergingAgenticORVotingMajorityImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getMergingAgenticORVotingMajority()
	 * @generated
	 */
	int MERGING_AGENTIC_OR_VOTING_MAJORITY = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_OR_VOTING_MAJORITY__NAME = AGENTIC_GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_OR_VOTING_MAJORITY__UNCERTAINTY = AGENTIC_GATEWAY__UNCERTAINTY;

	/**
	 * The number of structural features of the '<em>Merging Agentic OR Voting Majority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_OR_VOTING_MAJORITY_FEATURE_COUNT = AGENTIC_GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Merging Agentic OR Voting Majority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_OR_VOTING_MAJORITY_OPERATION_COUNT = AGENTIC_GATEWAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.MergingAgenticORVotingMinorityImpl <em>Merging Agentic OR Voting Minority</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.MergingAgenticORVotingMinorityImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getMergingAgenticORVotingMinority()
	 * @generated
	 */
	int MERGING_AGENTIC_OR_VOTING_MINORITY = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_OR_VOTING_MINORITY__NAME = AGENTIC_GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_OR_VOTING_MINORITY__UNCERTAINTY = AGENTIC_GATEWAY__UNCERTAINTY;

	/**
	 * The number of structural features of the '<em>Merging Agentic OR Voting Minority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_OR_VOTING_MINORITY_FEATURE_COUNT = AGENTIC_GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Merging Agentic OR Voting Minority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_AGENTIC_OR_VOTING_MINORITY_OPERATION_COUNT = AGENTIC_GATEWAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.StartEventImpl <em>Start Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.StartEventImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getStartEvent()
	 * @generated
	 */
	int START_EVENT = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__NAME = FLOW_OBJECT__NAME;

	/**
	 * The number of structural features of the '<em>Start Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT_FEATURE_COUNT = FLOW_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Start Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT_OPERATION_COUNT = FLOW_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.IntermediateEventImpl <em>Intermediate Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.IntermediateEventImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getIntermediateEvent()
	 * @generated
	 */
	int INTERMEDIATE_EVENT = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT__NAME = FLOW_OBJECT__NAME;

	/**
	 * The number of structural features of the '<em>Intermediate Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT_FEATURE_COUNT = FLOW_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Intermediate Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT_OPERATION_COUNT = FLOW_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.EndEventImpl <em>End Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.EndEventImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getEndEvent()
	 * @generated
	 */
	int END_EVENT = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__NAME = FLOW_OBJECT__NAME;

	/**
	 * The number of structural features of the '<em>End Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT_FEATURE_COUNT = FLOW_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>End Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT_OPERATION_COUNT = FLOW_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.ActivityImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = FLOW_OBJECT__NAME;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = FLOW_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = FLOW_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.AgenticTaskImpl <em>Agentic Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.AgenticTaskImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getAgenticTask()
	 * @generated
	 */
	int AGENTIC_TASK = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENTIC_TASK__NAME = FLOW_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Agentic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENTIC_TASK__AGENTIC = FLOW_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reflection Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENTIC_TASK__REFLECTION_MODE = FLOW_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENTIC_TASK__UNCERTAINTY = FLOW_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Agentic Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENTIC_TASK_FEATURE_COUNT = FLOW_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Agentic Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENTIC_TASK_OPERATION_COUNT = FLOW_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.ArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.ArtifactImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getArtifact()
	 * @generated
	 */
	int ARTIFACT = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__NAME = BPMN_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_FEATURE_COUNT = BPMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_OPERATION_COUNT = BPMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.DataObjectImpl <em>Data Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.DataObjectImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getDataObject()
	 * @generated
	 */
	int DATA_OBJECT = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__NAME = ARTIFACT__NAME;

	/**
	 * The number of structural features of the '<em>Data Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_FEATURE_COUNT = ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_OPERATION_COUNT = ARTIFACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.GroupImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = ARTIFACT__NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ELEMENTS = ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = ARTIFACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = ARTIFACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.AgentImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getAgent()
	 * @generated
	 */
	int AGENT = 45;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__NAME = BPMN_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_FEATURE_COUNT = BPMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_OPERATION_COUNT = BPMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.AgenticImpl <em>Agentic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.AgenticImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getAgentic()
	 * @generated
	 */
	int AGENTIC = 46;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENTIC__NAME = AGENT__NAME;

	/**
	 * The number of structural features of the '<em>Agentic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENTIC_FEATURE_COUNT = AGENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Agentic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENTIC_OPERATION_COUNT = AGENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.AgentRoleImpl <em>Agent Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.AgentRoleImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getAgentRole()
	 * @generated
	 */
	int AGENT_ROLE = 47;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ROLE__NAME = AGENT__NAME;

	/**
	 * The number of structural features of the '<em>Agent Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ROLE_FEATURE_COUNT = AGENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Agent Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ROLE_OPERATION_COUNT = AGENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.AgentWorkerImpl <em>Agent Worker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.AgentWorkerImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getAgentWorker()
	 * @generated
	 */
	int AGENT_WORKER = 48;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_WORKER__NAME = AGENT_ROLE__NAME;

	/**
	 * The number of structural features of the '<em>Agent Worker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_WORKER_FEATURE_COUNT = AGENT_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Agent Worker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_WORKER_OPERATION_COUNT = AGENT_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.AgentManagerImpl <em>Agent Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.AgentManagerImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getAgentManager()
	 * @generated
	 */
	int AGENT_MANAGER = 49;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_MANAGER__NAME = AGENT_ROLE__NAME;

	/**
	 * The number of structural features of the '<em>Agent Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_MANAGER_FEATURE_COUNT = AGENT_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Agent Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_MANAGER_OPERATION_COUNT = AGENT_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.ReflectionModeImpl <em>Reflection Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.ReflectionModeImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getReflectionMode()
	 * @generated
	 */
	int REFLECTION_MODE = 50;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLECTION_MODE__NAME = BPMN_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Reflection Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLECTION_MODE_FEATURE_COUNT = BPMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Reflection Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLECTION_MODE_OPERATION_COUNT = BPMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.SelfReflectionImpl <em>Self Reflection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.SelfReflectionImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getSelfReflection()
	 * @generated
	 */
	int SELF_REFLECTION = 51;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_REFLECTION__NAME = REFLECTION_MODE__NAME;

	/**
	 * The number of structural features of the '<em>Self Reflection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_REFLECTION_FEATURE_COUNT = REFLECTION_MODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Self Reflection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_REFLECTION_OPERATION_COUNT = REFLECTION_MODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.CrossReflectionImpl <em>Cross Reflection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.CrossReflectionImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getCrossReflection()
	 * @generated
	 */
	int CROSS_REFLECTION = 52;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_REFLECTION__NAME = REFLECTION_MODE__NAME;

	/**
	 * The number of structural features of the '<em>Cross Reflection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_REFLECTION_FEATURE_COUNT = REFLECTION_MODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cross Reflection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_REFLECTION_OPERATION_COUNT = REFLECTION_MODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMNagentic.impl.HumanReflectionImpl <em>Human Reflection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMNagentic.impl.HumanReflectionImpl
	 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getHumanReflection()
	 * @generated
	 */
	int HUMAN_REFLECTION = 53;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_REFLECTION__NAME = REFLECTION_MODE__NAME;

	/**
	 * The number of structural features of the '<em>Human Reflection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_REFLECTION_FEATURE_COUNT = REFLECTION_MODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Human Reflection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_REFLECTION_OPERATION_COUNT = REFLECTION_MODE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link BPMNagentic.BusinessProcessDiagram <em>Business Process Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Process Diagram</em>'.
	 * @see BPMNagentic.BusinessProcessDiagram
	 * @generated
	 */
	EClass getBusinessProcessDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link BPMNagentic.BusinessProcessDiagram#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see BPMNagentic.BusinessProcessDiagram#getElements()
	 * @see #getBusinessProcessDiagram()
	 * @generated
	 */
	EReference getBusinessProcessDiagram_Elements();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.BPMNElement <em>BPMN Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BPMN Element</em>'.
	 * @see BPMNagentic.BPMNElement
	 * @generated
	 */
	EClass getBPMNElement();

	/**
	 * Returns the meta object for the attribute '{@link BPMNagentic.BPMNElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see BPMNagentic.BPMNElement#getName()
	 * @see #getBPMNElement()
	 * @generated
	 */
	EAttribute getBPMNElement_Name();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.Swimlane <em>Swimlane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Swimlane</em>'.
	 * @see BPMNagentic.Swimlane
	 * @generated
	 */
	EClass getSwimlane();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.Lane <em>Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lane</em>'.
	 * @see BPMNagentic.Lane
	 * @generated
	 */
	EClass getLane();

	/**
	 * Returns the meta object for the containment reference list '{@link BPMNagentic.Lane#getFlowObjects <em>Flow Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flow Objects</em>'.
	 * @see BPMNagentic.Lane#getFlowObjects()
	 * @see #getLane()
	 * @generated
	 */
	EReference getLane_FlowObjects();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.AgenticLane <em>Agentic Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agentic Lane</em>'.
	 * @see BPMNagentic.AgenticLane
	 * @generated
	 */
	EClass getAgenticLane();

	/**
	 * Returns the meta object for the containment reference list '{@link BPMNagentic.AgenticLane#getFlowObjects <em>Flow Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flow Objects</em>'.
	 * @see BPMNagentic.AgenticLane#getFlowObjects()
	 * @see #getAgenticLane()
	 * @generated
	 */
	EReference getAgenticLane_FlowObjects();

	/**
	 * Returns the meta object for the containment reference '{@link BPMNagentic.AgenticLane#getAgentRole <em>Agent Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Agent Role</em>'.
	 * @see BPMNagentic.AgenticLane#getAgentRole()
	 * @see #getAgenticLane()
	 * @generated
	 */
	EReference getAgenticLane_AgentRole();

	/**
	 * Returns the meta object for the attribute '{@link BPMNagentic.AgenticLane#getUncertainty <em>Uncertainty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uncertainty</em>'.
	 * @see BPMNagentic.AgenticLane#getUncertainty()
	 * @see #getAgenticLane()
	 * @generated
	 */
	EAttribute getAgenticLane_Uncertainty();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.Pool <em>Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pool</em>'.
	 * @see BPMNagentic.Pool
	 * @generated
	 */
	EClass getPool();

	/**
	 * Returns the meta object for the containment reference list '{@link BPMNagentic.Pool#getLanes <em>Lanes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lanes</em>'.
	 * @see BPMNagentic.Pool#getLanes()
	 * @see #getPool()
	 * @generated
	 */
	EReference getPool_Lanes();

	/**
	 * Returns the meta object for the containment reference list '{@link BPMNagentic.Pool#getAgenticLanes <em>Agentic Lanes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agentic Lanes</em>'.
	 * @see BPMNagentic.Pool#getAgenticLanes()
	 * @see #getPool()
	 * @generated
	 */
	EReference getPool_AgenticLanes();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.ConnectingObject <em>Connecting Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connecting Object</em>'.
	 * @see BPMNagentic.ConnectingObject
	 * @generated
	 */
	EClass getConnectingObject();

	/**
	 * Returns the meta object for the reference '{@link BPMNagentic.ConnectingObject#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see BPMNagentic.ConnectingObject#getFrom()
	 * @see #getConnectingObject()
	 * @generated
	 */
	EReference getConnectingObject_From();

	/**
	 * Returns the meta object for the reference '{@link BPMNagentic.ConnectingObject#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see BPMNagentic.ConnectingObject#getTo()
	 * @see #getConnectingObject()
	 * @generated
	 */
	EReference getConnectingObject_To();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.MessageFlow <em>Message Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Flow</em>'.
	 * @see BPMNagentic.MessageFlow
	 * @generated
	 */
	EClass getMessageFlow();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.SequenceFlow <em>Sequence Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Flow</em>'.
	 * @see BPMNagentic.SequenceFlow
	 * @generated
	 */
	EClass getSequenceFlow();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see BPMNagentic.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.FlowObject <em>Flow Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Object</em>'.
	 * @see BPMNagentic.FlowObject
	 * @generated
	 */
	EClass getFlowObject();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.Gateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway</em>'.
	 * @see BPMNagentic.Gateway
	 * @generated
	 */
	EClass getGateway();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.XOR <em>XOR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XOR</em>'.
	 * @see BPMNagentic.XOR
	 * @generated
	 */
	EClass getXOR();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.OR <em>OR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OR</em>'.
	 * @see BPMNagentic.OR
	 * @generated
	 */
	EClass getOR();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.AND <em>AND</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AND</em>'.
	 * @see BPMNagentic.AND
	 * @generated
	 */
	EClass getAND();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.AgenticGateway <em>Agentic Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agentic Gateway</em>'.
	 * @see BPMNagentic.AgenticGateway
	 * @generated
	 */
	EClass getAgenticGateway();

	/**
	 * Returns the meta object for the attribute '{@link BPMNagentic.AgenticGateway#getUncertainty <em>Uncertainty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uncertainty</em>'.
	 * @see BPMNagentic.AgenticGateway#getUncertainty()
	 * @see #getAgenticGateway()
	 * @generated
	 */
	EAttribute getAgenticGateway_Uncertainty();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.DivergingAgenticANDRole <em>Diverging Agentic AND Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diverging Agentic AND Role</em>'.
	 * @see BPMNagentic.DivergingAgenticANDRole
	 * @generated
	 */
	EClass getDivergingAgenticANDRole();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.DivergingAgenticANDVoting <em>Diverging Agentic AND Voting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diverging Agentic AND Voting</em>'.
	 * @see BPMNagentic.DivergingAgenticANDVoting
	 * @generated
	 */
	EClass getDivergingAgenticANDVoting();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.DivergingAgenticANDDebate <em>Diverging Agentic AND Debate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diverging Agentic AND Debate</em>'.
	 * @see BPMNagentic.DivergingAgenticANDDebate
	 * @generated
	 */
	EClass getDivergingAgenticANDDebate();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.DivergingAgenticANDCompetition <em>Diverging Agentic AND Competition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diverging Agentic AND Competition</em>'.
	 * @see BPMNagentic.DivergingAgenticANDCompetition
	 * @generated
	 */
	EClass getDivergingAgenticANDCompetition();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.MergingAgenticANDRoleLeader <em>Merging Agentic AND Role Leader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merging Agentic AND Role Leader</em>'.
	 * @see BPMNagentic.MergingAgenticANDRoleLeader
	 * @generated
	 */
	EClass getMergingAgenticANDRoleLeader();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.MergingAgenticANDRoleComposed <em>Merging Agentic AND Role Composed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merging Agentic AND Role Composed</em>'.
	 * @see BPMNagentic.MergingAgenticANDRoleComposed
	 * @generated
	 */
	EClass getMergingAgenticANDRoleComposed();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.MergingAgenticANDCompetitionFastest <em>Merging Agentic AND Competition Fastest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merging Agentic AND Competition Fastest</em>'.
	 * @see BPMNagentic.MergingAgenticANDCompetitionFastest
	 * @generated
	 */
	EClass getMergingAgenticANDCompetitionFastest();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.MergingAgenticANDCompetitionMostComplete <em>Merging Agentic AND Competition Most Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merging Agentic AND Competition Most Complete</em>'.
	 * @see BPMNagentic.MergingAgenticANDCompetitionMostComplete
	 * @generated
	 */
	EClass getMergingAgenticANDCompetitionMostComplete();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.MergingAgenticANDVotingAbsoluteMajority <em>Merging Agentic AND Voting Absolute Majority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merging Agentic AND Voting Absolute Majority</em>'.
	 * @see BPMNagentic.MergingAgenticANDVotingAbsoluteMajority
	 * @generated
	 */
	EClass getMergingAgenticANDVotingAbsoluteMajority();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.MergingAgenticANDVotingMajority <em>Merging Agentic AND Voting Majority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merging Agentic AND Voting Majority</em>'.
	 * @see BPMNagentic.MergingAgenticANDVotingMajority
	 * @generated
	 */
	EClass getMergingAgenticANDVotingMajority();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.MergingAgenticANDVotingMinority <em>Merging Agentic AND Voting Minority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merging Agentic AND Voting Minority</em>'.
	 * @see BPMNagentic.MergingAgenticANDVotingMinority
	 * @generated
	 */
	EClass getMergingAgenticANDVotingMinority();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.DivergingAgenticORVoting <em>Diverging Agentic OR Voting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diverging Agentic OR Voting</em>'.
	 * @see BPMNagentic.DivergingAgenticORVoting
	 * @generated
	 */
	EClass getDivergingAgenticORVoting();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.DivergingAgenticORDebate <em>Diverging Agentic OR Debate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diverging Agentic OR Debate</em>'.
	 * @see BPMNagentic.DivergingAgenticORDebate
	 * @generated
	 */
	EClass getDivergingAgenticORDebate();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.DivergingAgenticORCompetition <em>Diverging Agentic OR Competition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diverging Agentic OR Competition</em>'.
	 * @see BPMNagentic.DivergingAgenticORCompetition
	 * @generated
	 */
	EClass getDivergingAgenticORCompetition();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.MergingAgenticORRoleLeader <em>Merging Agentic OR Role Leader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merging Agentic OR Role Leader</em>'.
	 * @see BPMNagentic.MergingAgenticORRoleLeader
	 * @generated
	 */
	EClass getMergingAgenticORRoleLeader();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.MergingAgenticORRoleComposed <em>Merging Agentic OR Role Composed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merging Agentic OR Role Composed</em>'.
	 * @see BPMNagentic.MergingAgenticORRoleComposed
	 * @generated
	 */
	EClass getMergingAgenticORRoleComposed();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.MergingAgenticORCompetitionFastest <em>Merging Agentic OR Competition Fastest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merging Agentic OR Competition Fastest</em>'.
	 * @see BPMNagentic.MergingAgenticORCompetitionFastest
	 * @generated
	 */
	EClass getMergingAgenticORCompetitionFastest();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.MergingAgenticORCompetitionMostComplete <em>Merging Agentic OR Competition Most Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merging Agentic OR Competition Most Complete</em>'.
	 * @see BPMNagentic.MergingAgenticORCompetitionMostComplete
	 * @generated
	 */
	EClass getMergingAgenticORCompetitionMostComplete();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.MergingAgenticORVotingAbsoluteMajority <em>Merging Agentic OR Voting Absolute Majority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merging Agentic OR Voting Absolute Majority</em>'.
	 * @see BPMNagentic.MergingAgenticORVotingAbsoluteMajority
	 * @generated
	 */
	EClass getMergingAgenticORVotingAbsoluteMajority();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.MergingAgenticORVotingMajority <em>Merging Agentic OR Voting Majority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merging Agentic OR Voting Majority</em>'.
	 * @see BPMNagentic.MergingAgenticORVotingMajority
	 * @generated
	 */
	EClass getMergingAgenticORVotingMajority();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.MergingAgenticORVotingMinority <em>Merging Agentic OR Voting Minority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merging Agentic OR Voting Minority</em>'.
	 * @see BPMNagentic.MergingAgenticORVotingMinority
	 * @generated
	 */
	EClass getMergingAgenticORVotingMinority();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.StartEvent <em>Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Event</em>'.
	 * @see BPMNagentic.StartEvent
	 * @generated
	 */
	EClass getStartEvent();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.IntermediateEvent <em>Intermediate Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intermediate Event</em>'.
	 * @see BPMNagentic.IntermediateEvent
	 * @generated
	 */
	EClass getIntermediateEvent();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.EndEvent <em>End Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Event</em>'.
	 * @see BPMNagentic.EndEvent
	 * @generated
	 */
	EClass getEndEvent();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see BPMNagentic.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.AgenticTask <em>Agentic Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agentic Task</em>'.
	 * @see BPMNagentic.AgenticTask
	 * @generated
	 */
	EClass getAgenticTask();

	/**
	 * Returns the meta object for the containment reference '{@link BPMNagentic.AgenticTask#getAgentic <em>Agentic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Agentic</em>'.
	 * @see BPMNagentic.AgenticTask#getAgentic()
	 * @see #getAgenticTask()
	 * @generated
	 */
	EReference getAgenticTask_Agentic();

	/**
	 * Returns the meta object for the containment reference '{@link BPMNagentic.AgenticTask#getReflectionMode <em>Reflection Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reflection Mode</em>'.
	 * @see BPMNagentic.AgenticTask#getReflectionMode()
	 * @see #getAgenticTask()
	 * @generated
	 */
	EReference getAgenticTask_ReflectionMode();

	/**
	 * Returns the meta object for the attribute '{@link BPMNagentic.AgenticTask#getUncertainty <em>Uncertainty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uncertainty</em>'.
	 * @see BPMNagentic.AgenticTask#getUncertainty()
	 * @see #getAgenticTask()
	 * @generated
	 */
	EAttribute getAgenticTask_Uncertainty();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see BPMNagentic.Artifact
	 * @generated
	 */
	EClass getArtifact();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.DataObject <em>Data Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Object</em>'.
	 * @see BPMNagentic.DataObject
	 * @generated
	 */
	EClass getDataObject();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see BPMNagentic.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link BPMNagentic.Group#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see BPMNagentic.Group#getElements()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Elements();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent</em>'.
	 * @see BPMNagentic.Agent
	 * @generated
	 */
	EClass getAgent();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.Agentic <em>Agentic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agentic</em>'.
	 * @see BPMNagentic.Agentic
	 * @generated
	 */
	EClass getAgentic();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.AgentRole <em>Agent Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent Role</em>'.
	 * @see BPMNagentic.AgentRole
	 * @generated
	 */
	EClass getAgentRole();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.AgentWorker <em>Agent Worker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent Worker</em>'.
	 * @see BPMNagentic.AgentWorker
	 * @generated
	 */
	EClass getAgentWorker();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.AgentManager <em>Agent Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent Manager</em>'.
	 * @see BPMNagentic.AgentManager
	 * @generated
	 */
	EClass getAgentManager();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.ReflectionMode <em>Reflection Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reflection Mode</em>'.
	 * @see BPMNagentic.ReflectionMode
	 * @generated
	 */
	EClass getReflectionMode();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.SelfReflection <em>Self Reflection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Self Reflection</em>'.
	 * @see BPMNagentic.SelfReflection
	 * @generated
	 */
	EClass getSelfReflection();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.CrossReflection <em>Cross Reflection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cross Reflection</em>'.
	 * @see BPMNagentic.CrossReflection
	 * @generated
	 */
	EClass getCrossReflection();

	/**
	 * Returns the meta object for class '{@link BPMNagentic.HumanReflection <em>Human Reflection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Human Reflection</em>'.
	 * @see BPMNagentic.HumanReflection
	 * @generated
	 */
	EClass getHumanReflection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BPMNagenticFactory getBPMNagenticFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.BusinessProcessDiagramImpl <em>Business Process Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.BusinessProcessDiagramImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getBusinessProcessDiagram()
		 * @generated
		 */
		EClass BUSINESS_PROCESS_DIAGRAM = eINSTANCE.getBusinessProcessDiagram();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_PROCESS_DIAGRAM__ELEMENTS = eINSTANCE.getBusinessProcessDiagram_Elements();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.BPMNElementImpl <em>BPMN Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.BPMNElementImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getBPMNElement()
		 * @generated
		 */
		EClass BPMN_ELEMENT = eINSTANCE.getBPMNElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BPMN_ELEMENT__NAME = eINSTANCE.getBPMNElement_Name();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.SwimlaneImpl <em>Swimlane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.SwimlaneImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getSwimlane()
		 * @generated
		 */
		EClass SWIMLANE = eINSTANCE.getSwimlane();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.LaneImpl <em>Lane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.LaneImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getLane()
		 * @generated
		 */
		EClass LANE = eINSTANCE.getLane();

		/**
		 * The meta object literal for the '<em><b>Flow Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANE__FLOW_OBJECTS = eINSTANCE.getLane_FlowObjects();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.AgenticLaneImpl <em>Agentic Lane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.AgenticLaneImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getAgenticLane()
		 * @generated
		 */
		EClass AGENTIC_LANE = eINSTANCE.getAgenticLane();

		/**
		 * The meta object literal for the '<em><b>Flow Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENTIC_LANE__FLOW_OBJECTS = eINSTANCE.getAgenticLane_FlowObjects();

		/**
		 * The meta object literal for the '<em><b>Agent Role</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENTIC_LANE__AGENT_ROLE = eINSTANCE.getAgenticLane_AgentRole();

		/**
		 * The meta object literal for the '<em><b>Uncertainty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENTIC_LANE__UNCERTAINTY = eINSTANCE.getAgenticLane_Uncertainty();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.PoolImpl <em>Pool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.PoolImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getPool()
		 * @generated
		 */
		EClass POOL = eINSTANCE.getPool();

		/**
		 * The meta object literal for the '<em><b>Lanes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POOL__LANES = eINSTANCE.getPool_Lanes();

		/**
		 * The meta object literal for the '<em><b>Agentic Lanes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POOL__AGENTIC_LANES = eINSTANCE.getPool_AgenticLanes();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.ConnectingObjectImpl <em>Connecting Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.ConnectingObjectImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getConnectingObject()
		 * @generated
		 */
		EClass CONNECTING_OBJECT = eINSTANCE.getConnectingObject();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTING_OBJECT__FROM = eINSTANCE.getConnectingObject_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTING_OBJECT__TO = eINSTANCE.getConnectingObject_To();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.MessageFlowImpl <em>Message Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.MessageFlowImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getMessageFlow()
		 * @generated
		 */
		EClass MESSAGE_FLOW = eINSTANCE.getMessageFlow();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.SequenceFlowImpl <em>Sequence Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.SequenceFlowImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getSequenceFlow()
		 * @generated
		 */
		EClass SEQUENCE_FLOW = eINSTANCE.getSequenceFlow();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.AssociationImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.FlowObjectImpl <em>Flow Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.FlowObjectImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getFlowObject()
		 * @generated
		 */
		EClass FLOW_OBJECT = eINSTANCE.getFlowObject();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.GatewayImpl <em>Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.GatewayImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getGateway()
		 * @generated
		 */
		EClass GATEWAY = eINSTANCE.getGateway();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.XORImpl <em>XOR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.XORImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getXOR()
		 * @generated
		 */
		EClass XOR = eINSTANCE.getXOR();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.ORImpl <em>OR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.ORImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getOR()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOR();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.ANDImpl <em>AND</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.ANDImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getAND()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAND();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.AgenticGatewayImpl <em>Agentic Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.AgenticGatewayImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getAgenticGateway()
		 * @generated
		 */
		EClass AGENTIC_GATEWAY = eINSTANCE.getAgenticGateway();

		/**
		 * The meta object literal for the '<em><b>Uncertainty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENTIC_GATEWAY__UNCERTAINTY = eINSTANCE.getAgenticGateway_Uncertainty();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.DivergingAgenticANDRoleImpl <em>Diverging Agentic AND Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.DivergingAgenticANDRoleImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getDivergingAgenticANDRole()
		 * @generated
		 */
		EClass DIVERGING_AGENTIC_AND_ROLE = eINSTANCE.getDivergingAgenticANDRole();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.DivergingAgenticANDVotingImpl <em>Diverging Agentic AND Voting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.DivergingAgenticANDVotingImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getDivergingAgenticANDVoting()
		 * @generated
		 */
		EClass DIVERGING_AGENTIC_AND_VOTING = eINSTANCE.getDivergingAgenticANDVoting();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.DivergingAgenticANDDebateImpl <em>Diverging Agentic AND Debate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.DivergingAgenticANDDebateImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getDivergingAgenticANDDebate()
		 * @generated
		 */
		EClass DIVERGING_AGENTIC_AND_DEBATE = eINSTANCE.getDivergingAgenticANDDebate();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.DivergingAgenticANDCompetitionImpl <em>Diverging Agentic AND Competition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.DivergingAgenticANDCompetitionImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getDivergingAgenticANDCompetition()
		 * @generated
		 */
		EClass DIVERGING_AGENTIC_AND_COMPETITION = eINSTANCE.getDivergingAgenticANDCompetition();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.MergingAgenticANDRoleLeaderImpl <em>Merging Agentic AND Role Leader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.MergingAgenticANDRoleLeaderImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getMergingAgenticANDRoleLeader()
		 * @generated
		 */
		EClass MERGING_AGENTIC_AND_ROLE_LEADER = eINSTANCE.getMergingAgenticANDRoleLeader();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.MergingAgenticANDRoleComposedImpl <em>Merging Agentic AND Role Composed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.MergingAgenticANDRoleComposedImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getMergingAgenticANDRoleComposed()
		 * @generated
		 */
		EClass MERGING_AGENTIC_AND_ROLE_COMPOSED = eINSTANCE.getMergingAgenticANDRoleComposed();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.MergingAgenticANDCompetitionFastestImpl <em>Merging Agentic AND Competition Fastest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.MergingAgenticANDCompetitionFastestImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getMergingAgenticANDCompetitionFastest()
		 * @generated
		 */
		EClass MERGING_AGENTIC_AND_COMPETITION_FASTEST = eINSTANCE.getMergingAgenticANDCompetitionFastest();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.MergingAgenticANDCompetitionMostCompleteImpl <em>Merging Agentic AND Competition Most Complete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.MergingAgenticANDCompetitionMostCompleteImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getMergingAgenticANDCompetitionMostComplete()
		 * @generated
		 */
		EClass MERGING_AGENTIC_AND_COMPETITION_MOST_COMPLETE = eINSTANCE.getMergingAgenticANDCompetitionMostComplete();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.MergingAgenticANDVotingAbsoluteMajorityImpl <em>Merging Agentic AND Voting Absolute Majority</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.MergingAgenticANDVotingAbsoluteMajorityImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getMergingAgenticANDVotingAbsoluteMajority()
		 * @generated
		 */
		EClass MERGING_AGENTIC_AND_VOTING_ABSOLUTE_MAJORITY = eINSTANCE.getMergingAgenticANDVotingAbsoluteMajority();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.MergingAgenticANDVotingMajorityImpl <em>Merging Agentic AND Voting Majority</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.MergingAgenticANDVotingMajorityImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getMergingAgenticANDVotingMajority()
		 * @generated
		 */
		EClass MERGING_AGENTIC_AND_VOTING_MAJORITY = eINSTANCE.getMergingAgenticANDVotingMajority();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.MergingAgenticANDVotingMinorityImpl <em>Merging Agentic AND Voting Minority</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.MergingAgenticANDVotingMinorityImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getMergingAgenticANDVotingMinority()
		 * @generated
		 */
		EClass MERGING_AGENTIC_AND_VOTING_MINORITY = eINSTANCE.getMergingAgenticANDVotingMinority();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.DivergingAgenticORVotingImpl <em>Diverging Agentic OR Voting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.DivergingAgenticORVotingImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getDivergingAgenticORVoting()
		 * @generated
		 */
		EClass DIVERGING_AGENTIC_OR_VOTING = eINSTANCE.getDivergingAgenticORVoting();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.DivergingAgenticORDebateImpl <em>Diverging Agentic OR Debate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.DivergingAgenticORDebateImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getDivergingAgenticORDebate()
		 * @generated
		 */
		EClass DIVERGING_AGENTIC_OR_DEBATE = eINSTANCE.getDivergingAgenticORDebate();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.DivergingAgenticORCompetitionImpl <em>Diverging Agentic OR Competition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.DivergingAgenticORCompetitionImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getDivergingAgenticORCompetition()
		 * @generated
		 */
		EClass DIVERGING_AGENTIC_OR_COMPETITION = eINSTANCE.getDivergingAgenticORCompetition();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.MergingAgenticORRoleLeaderImpl <em>Merging Agentic OR Role Leader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.MergingAgenticORRoleLeaderImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getMergingAgenticORRoleLeader()
		 * @generated
		 */
		EClass MERGING_AGENTIC_OR_ROLE_LEADER = eINSTANCE.getMergingAgenticORRoleLeader();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.MergingAgenticORRoleComposedImpl <em>Merging Agentic OR Role Composed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.MergingAgenticORRoleComposedImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getMergingAgenticORRoleComposed()
		 * @generated
		 */
		EClass MERGING_AGENTIC_OR_ROLE_COMPOSED = eINSTANCE.getMergingAgenticORRoleComposed();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.MergingAgenticORCompetitionFastestImpl <em>Merging Agentic OR Competition Fastest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.MergingAgenticORCompetitionFastestImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getMergingAgenticORCompetitionFastest()
		 * @generated
		 */
		EClass MERGING_AGENTIC_OR_COMPETITION_FASTEST = eINSTANCE.getMergingAgenticORCompetitionFastest();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.MergingAgenticORCompetitionMostCompleteImpl <em>Merging Agentic OR Competition Most Complete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.MergingAgenticORCompetitionMostCompleteImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getMergingAgenticORCompetitionMostComplete()
		 * @generated
		 */
		EClass MERGING_AGENTIC_OR_COMPETITION_MOST_COMPLETE = eINSTANCE.getMergingAgenticORCompetitionMostComplete();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.MergingAgenticORVotingAbsoluteMajorityImpl <em>Merging Agentic OR Voting Absolute Majority</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.MergingAgenticORVotingAbsoluteMajorityImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getMergingAgenticORVotingAbsoluteMajority()
		 * @generated
		 */
		EClass MERGING_AGENTIC_OR_VOTING_ABSOLUTE_MAJORITY = eINSTANCE.getMergingAgenticORVotingAbsoluteMajority();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.MergingAgenticORVotingMajorityImpl <em>Merging Agentic OR Voting Majority</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.MergingAgenticORVotingMajorityImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getMergingAgenticORVotingMajority()
		 * @generated
		 */
		EClass MERGING_AGENTIC_OR_VOTING_MAJORITY = eINSTANCE.getMergingAgenticORVotingMajority();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.MergingAgenticORVotingMinorityImpl <em>Merging Agentic OR Voting Minority</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.MergingAgenticORVotingMinorityImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getMergingAgenticORVotingMinority()
		 * @generated
		 */
		EClass MERGING_AGENTIC_OR_VOTING_MINORITY = eINSTANCE.getMergingAgenticORVotingMinority();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.StartEventImpl <em>Start Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.StartEventImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getStartEvent()
		 * @generated
		 */
		EClass START_EVENT = eINSTANCE.getStartEvent();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.IntermediateEventImpl <em>Intermediate Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.IntermediateEventImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getIntermediateEvent()
		 * @generated
		 */
		EClass INTERMEDIATE_EVENT = eINSTANCE.getIntermediateEvent();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.EndEventImpl <em>End Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.EndEventImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getEndEvent()
		 * @generated
		 */
		EClass END_EVENT = eINSTANCE.getEndEvent();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.ActivityImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.AgenticTaskImpl <em>Agentic Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.AgenticTaskImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getAgenticTask()
		 * @generated
		 */
		EClass AGENTIC_TASK = eINSTANCE.getAgenticTask();

		/**
		 * The meta object literal for the '<em><b>Agentic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENTIC_TASK__AGENTIC = eINSTANCE.getAgenticTask_Agentic();

		/**
		 * The meta object literal for the '<em><b>Reflection Mode</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENTIC_TASK__REFLECTION_MODE = eINSTANCE.getAgenticTask_ReflectionMode();

		/**
		 * The meta object literal for the '<em><b>Uncertainty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENTIC_TASK__UNCERTAINTY = eINSTANCE.getAgenticTask_Uncertainty();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.ArtifactImpl <em>Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.ArtifactImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getArtifact()
		 * @generated
		 */
		EClass ARTIFACT = eINSTANCE.getArtifact();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.DataObjectImpl <em>Data Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.DataObjectImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getDataObject()
		 * @generated
		 */
		EClass DATA_OBJECT = eINSTANCE.getDataObject();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.GroupImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__ELEMENTS = eINSTANCE.getGroup_Elements();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.AgentImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getAgent()
		 * @generated
		 */
		EClass AGENT = eINSTANCE.getAgent();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.AgenticImpl <em>Agentic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.AgenticImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getAgentic()
		 * @generated
		 */
		EClass AGENTIC = eINSTANCE.getAgentic();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.AgentRoleImpl <em>Agent Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.AgentRoleImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getAgentRole()
		 * @generated
		 */
		EClass AGENT_ROLE = eINSTANCE.getAgentRole();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.AgentWorkerImpl <em>Agent Worker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.AgentWorkerImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getAgentWorker()
		 * @generated
		 */
		EClass AGENT_WORKER = eINSTANCE.getAgentWorker();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.AgentManagerImpl <em>Agent Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.AgentManagerImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getAgentManager()
		 * @generated
		 */
		EClass AGENT_MANAGER = eINSTANCE.getAgentManager();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.ReflectionModeImpl <em>Reflection Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.ReflectionModeImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getReflectionMode()
		 * @generated
		 */
		EClass REFLECTION_MODE = eINSTANCE.getReflectionMode();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.SelfReflectionImpl <em>Self Reflection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.SelfReflectionImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getSelfReflection()
		 * @generated
		 */
		EClass SELF_REFLECTION = eINSTANCE.getSelfReflection();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.CrossReflectionImpl <em>Cross Reflection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.CrossReflectionImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getCrossReflection()
		 * @generated
		 */
		EClass CROSS_REFLECTION = eINSTANCE.getCrossReflection();

		/**
		 * The meta object literal for the '{@link BPMNagentic.impl.HumanReflectionImpl <em>Human Reflection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMNagentic.impl.HumanReflectionImpl
		 * @see BPMNagentic.impl.BPMNagenticPackageImpl#getHumanReflection()
		 * @generated
		 */
		EClass HUMAN_REFLECTION = eINSTANCE.getHumanReflection();

	}

} //BPMNagenticPackage
