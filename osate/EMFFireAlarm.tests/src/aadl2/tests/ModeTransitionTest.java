/**
 */
package aadl2.tests;

import aadl2.Aadl2Factory;
import aadl2.ModeTransition;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mode Transition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModeTransitionTest extends ModeFeatureTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ModeTransitionTest.class);
	}

	/**
	 * Constructs a new Mode Transition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeTransitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Mode Transition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ModeTransition getFixture() {
		return (ModeTransition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Aadl2Factory.eINSTANCE.createModeTransition());
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

} //ModeTransitionTest
