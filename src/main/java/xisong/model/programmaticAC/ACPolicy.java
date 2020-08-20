/**
 */
package xisong.model.programmaticAC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AC Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xisong.model.programmaticAC.ACPolicy#getRoles <em>Roles</em>}</li>
 *   <li>{@link xisong.model.programmaticAC.ACPolicy#getActions <em>Actions</em>}</li>
 *   <li>{@link xisong.model.programmaticAC.ACPolicy#getObjects <em>Objects</em>}</li>
 * </ul>
 *
 * @see xisong.model.programmaticAC.ProgrammaticACPackage#getACPolicy()
 * @model
 * @generated
 */
public interface ACPolicy extends EObject {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link xisong.model.programmaticAC.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see xisong.model.programmaticAC.ProgrammaticACPackage#getACPolicy_Roles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link xisong.model.programmaticAC.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see xisong.model.programmaticAC.ProgrammaticACPackage#getACPolicy_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
	 * The list contents are of type {@link xisong.model.programmaticAC.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects</em>' containment reference list.
	 * @see xisong.model.programmaticAC.ProgrammaticACPackage#getACPolicy_Objects()
	 * @model containment="true"
	 * @generated
	 */
	EList<xisong.model.programmaticAC.Object> getObjects();

} // ACPolicy
