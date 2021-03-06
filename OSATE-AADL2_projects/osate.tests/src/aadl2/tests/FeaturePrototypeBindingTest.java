/**
 */
package aadl2.tests;

import aadl2.Aadl2Factory;
import aadl2.FeaturePrototypeBinding;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Feature Prototype Binding</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeaturePrototypeBindingTest extends PrototypeBindingTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FeaturePrototypeBindingTest.class);
	}

	/**
	 * Constructs a new Feature Prototype Binding test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturePrototypeBindingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Feature Prototype Binding test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FeaturePrototypeBinding getFixture() {
		return (FeaturePrototypeBinding)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Aadl2Factory.eINSTANCE.createFeaturePrototypeBinding());
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

} //FeaturePrototypeBindingTest
