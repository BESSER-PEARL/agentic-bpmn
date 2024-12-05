/**
 */
package BPMNagentic.tests;

import BPMNagentic.BPMNagenticFactory;
import BPMNagentic.CrossReflection;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cross Reflection</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CrossReflectionTest extends ReflectionModeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CrossReflectionTest.class);
	}

	/**
	 * Constructs a new Cross Reflection test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrossReflectionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Cross Reflection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CrossReflection getFixture() {
		return (CrossReflection)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BPMNagenticFactory.eINSTANCE.createCrossReflection());
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

} //CrossReflectionTest
