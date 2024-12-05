/**
 */
package BPMNagentic.tests;

import BPMNagentic.BPMNagenticFactory;
import BPMNagentic.HumanReflection;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Human Reflection</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HumanReflectionTest extends ReflectionModeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HumanReflectionTest.class);
	}

	/**
	 * Constructs a new Human Reflection test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumanReflectionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Human Reflection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HumanReflection getFixture() {
		return (HumanReflection)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BPMNagenticFactory.eINSTANCE.createHumanReflection());
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

} //HumanReflectionTest
