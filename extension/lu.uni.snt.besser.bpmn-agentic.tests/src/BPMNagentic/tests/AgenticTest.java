/**
 */
package BPMNagentic.tests;

import BPMNagentic.Agentic;
import BPMNagentic.BPMNagenticFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Agentic</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AgenticTest extends AgentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AgenticTest.class);
	}

	/**
	 * Constructs a new Agentic test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgenticTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Agentic test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Agentic getFixture() {
		return (Agentic)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BPMNagenticFactory.eINSTANCE.createAgentic());
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

} //AgenticTest
