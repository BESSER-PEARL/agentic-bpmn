/**
 */
package BPMNagentic.tests;

import BPMNagentic.BPMNagenticFactory;
import BPMNagentic.SelfReflection;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Self Reflection</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SelfReflectionTest extends ReflectionModeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SelfReflectionTest.class);
	}

	/**
	 * Constructs a new Self Reflection test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelfReflectionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Self Reflection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SelfReflection getFixture() {
		return (SelfReflection)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BPMNagenticFactory.eINSTANCE.createSelfReflection());
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

} //SelfReflectionTest
