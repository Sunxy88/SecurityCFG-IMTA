/**
 */
package xisong.model.programmaticAC;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xisong.model.programmaticAC.Permission#getAction <em>Action</em>}</li>
 *   <li>{@link xisong.model.programmaticAC.Permission#getObject <em>Object</em>}</li>
 * </ul>
 *
 * @see xisong.model.programmaticAC.ProgrammaticACPackage#getPermission()
 * @model
 * @generated
 */
public interface Permission extends EObject {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(Action)
	 * @see xisong.model.programmaticAC.ProgrammaticACPackage#getPermission_Action()
	 * @model
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link xisong.model.programmaticAC.Permission#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' reference.
	 * @see #setObject(xisong.model.programmaticAC.Object)
	 * @see xisong.model.programmaticAC.ProgrammaticACPackage#getPermission_Object()
	 * @model
	 * @generated
	 */
	xisong.model.programmaticAC.Object getObject();

	/**
	 * Sets the value of the '{@link xisong.model.programmaticAC.Permission#getObject <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(xisong.model.programmaticAC.Object value);

} // Permission
