/**
 */
package aadl2.tests;

import aadl2.Aadl2Factory;
import aadl2.FeaturePrototype;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Feature Prototype</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeaturePrototypeTest extends PrototypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FeaturePrototypeTest.class);
	}

	/**
	 * Constructs a new Feature Prototype test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturePrototypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Feature Prototype test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FeaturePrototype getFixture() {
		return (FeaturePrototype)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Aadl2Factory.eINSTANCE.createFeaturePrototype());
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

} //FeaturePrototypeTest
