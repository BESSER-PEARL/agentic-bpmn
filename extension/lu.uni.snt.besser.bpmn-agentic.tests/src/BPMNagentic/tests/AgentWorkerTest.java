/**
 */
package BPMNagentic.tests;

import BPMNagentic.AgentWorker;
import BPMNagentic.BPMNagenticFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Agent Worker</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AgentWorkerTest extends AgentRoleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AgentWorkerTest.class);
	}

	/**
	 * Constructs a new Agent Worker test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentWorkerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Agent Worker test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AgentWorker getFixture() {
		return (AgentWorker)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BPMNagenticFactory.eINSTANCE.createAgentWorker());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //AgentWorkerTest
