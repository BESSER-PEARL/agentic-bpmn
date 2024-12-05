/**
 */
package BPMNagentic.tests;

import BPMNagentic.AgenticLane;
import BPMNagentic.BPMNagenticFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Agentic Lane</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AgenticLaneTest extends SwimlaneTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AgenticLaneTest.class);
	}

	/**
	 * Constructs a new Agentic Lane test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgenticLaneTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Agentic Lane test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AgenticLane getFixture() {
		return (AgenticLane)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BPMNagenticFactory.eINSTANCE.createAgenticLane());
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

} //AgenticLaneTest
