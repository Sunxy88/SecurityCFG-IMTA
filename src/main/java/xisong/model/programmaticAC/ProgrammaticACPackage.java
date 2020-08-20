/**
 */
package xisong.model.programmaticAC;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see xisong.model.programmaticAC.ProgrammaticACFactory
 * @model kind="package"
 * @generated
 */
public interface ProgrammaticACPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "programmaticAC";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "xisong.model.programmaticAC";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xisong.model.programmaticAC";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProgrammaticACPackage eINSTANCE = xisong.model.programmaticAC.impl.ProgrammaticACPackageImpl.init();

	/**
	 * The meta object id for the '{@link xisong.model.programmaticAC.impl.ACPolicyImpl <em>AC Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xisong.model.programmaticAC.impl.ACPolicyImpl
	 * @see xisong.model.programmaticAC.impl.ProgrammaticACPackageImpl#getACPolicy()
	 * @generated
	 */
	int AC_POLICY = 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_POLICY__ROLES = 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_POLICY__ACTIONS = 1;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_POLICY__OBJECTS = 2;

	/**
	 * The number of structural features of the '<em>AC Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_POLICY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>AC Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_POLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xisong.model.programmaticAC.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xisong.model.programmaticAC.impl.RoleImpl
	 * @see xisong.model.programmaticAC.impl.ProgrammaticACPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 1;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__PERMISSIONS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xisong.model.programmaticAC.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xisong.model.programmaticAC.impl.ActionImpl
	 * @see xisong.model.programmaticAC.impl.ProgrammaticACPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 2;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xisong.model.programmaticAC.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xisong.model.programmaticAC.impl.ObjectImpl
	 * @see xisong.model.programmaticAC.impl.ProgrammaticACPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 3;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xisong.model.programmaticAC.impl.PermissionImpl <em>Permission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xisong.model.programmaticAC.impl.PermissionImpl
	 * @see xisong.model.programmaticAC.impl.ProgrammaticACPackageImpl#getPermission()
	 * @generated
	 */
	int PERMISSION = 4;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__ACTION = 0;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__OBJECT = 1;

	/**
	 * The number of structural features of the '<em>Permission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Permission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xisong.model.programmaticAC.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xisong.model.programmaticAC.impl.StatementImpl
	 * @see xisong.model.programmaticAC.impl.ProgrammaticACPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 5;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xisong.model.programmaticAC.impl.ExecuteImpl <em>Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xisong.model.programmaticAC.impl.ExecuteImpl
	 * @see xisong.model.programmaticAC.impl.ProgrammaticACPackageImpl#getExecute()
	 * @generated
	 */
	int EXECUTE = 6;

	/**
	 * The feature id for the '<em><b>Executed Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE__EXECUTED_STATEMENT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Ct Statement</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.code.CtStatement
	 * @see xisong.model.programmaticAC.impl.ProgrammaticACPackageImpl#getCtStatement()
	 * @generated
	 */
	int CT_STATEMENT = 7;


	/**
	 * Returns the meta object for class '{@link xisong.model.programmaticAC.ACPolicy <em>AC Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AC Policy</em>'.
	 * @see xisong.model.programmaticAC.ACPolicy
	 * @generated
	 */
	EClass getACPolicy();

	/**
	 * Returns the meta object for the containment reference list '{@link xisong.model.programmaticAC.ACPolicy#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see xisong.model.programmaticAC.ACPolicy#getRoles()
	 * @see #getACPolicy()
	 * @generated
	 */
	EReference getACPolicy_Roles();

	/**
	 * Returns the meta object for the containment reference list '{@link xisong.model.programmaticAC.ACPolicy#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see xisong.model.programmaticAC.ACPolicy#getActions()
	 * @see #getACPolicy()
	 * @generated
	 */
	EReference getACPolicy_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link xisong.model.programmaticAC.ACPolicy#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objects</em>'.
	 * @see xisong.model.programmaticAC.ACPolicy#getObjects()
	 * @see #getACPolicy()
	 * @generated
	 */
	EReference getACPolicy_Objects();

	/**
	 * Returns the meta object for class '{@link xisong.model.programmaticAC.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see xisong.model.programmaticAC.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the containment reference list '{@link xisong.model.programmaticAC.Role#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Permissions</em>'.
	 * @see xisong.model.programmaticAC.Role#getPermissions()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Permissions();

	/**
	 * Returns the meta object for the attribute '{@link xisong.model.programmaticAC.Role#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see xisong.model.programmaticAC.Role#getName()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Name();

	/**
	 * Returns the meta object for class '{@link xisong.model.programmaticAC.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see xisong.model.programmaticAC.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link xisong.model.programmaticAC.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see xisong.model.programmaticAC.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for class '{@link xisong.model.programmaticAC.Permission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Permission</em>'.
	 * @see xisong.model.programmaticAC.Permission
	 * @generated
	 */
	EClass getPermission();

	/**
	 * Returns the meta object for the reference '{@link xisong.model.programmaticAC.Permission#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see xisong.model.programmaticAC.Permission#getAction()
	 * @see #getPermission()
	 * @generated
	 */
	EReference getPermission_Action();

	/**
	 * Returns the meta object for the reference '{@link xisong.model.programmaticAC.Permission#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object</em>'.
	 * @see xisong.model.programmaticAC.Permission#getObject()
	 * @see #getPermission()
	 * @generated
	 */
	EReference getPermission_Object();

	/**
	 * Returns the meta object for class '{@link xisong.model.programmaticAC.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see xisong.model.programmaticAC.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link xisong.model.programmaticAC.Execute <em>Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execute</em>'.
	 * @see xisong.model.programmaticAC.Execute
	 * @generated
	 */
	EClass getExecute();

	/**
	 * Returns the meta object for the attribute '{@link xisong.model.programmaticAC.Execute#getExecutedStatement <em>Executed Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Executed Statement</em>'.
	 * @see xisong.model.programmaticAC.Execute#getExecutedStatement()
	 * @see #getExecute()
	 * @generated
	 */
	EAttribute getExecute_ExecutedStatement();

	/**
	 * Returns the meta object for data type '{@link spoon.reflect.code.CtStatement <em>Ct Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ct Statement</em>'.
	 * @see spoon.reflect.code.CtStatement
	 * @model instanceClass="spoon.reflect.code.CtStatement"
	 * @generated
	 */
	EDataType getCtStatement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProgrammaticACFactory getProgrammaticACFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link xisong.model.programmaticAC.impl.ACPolicyImpl <em>AC Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xisong.model.programmaticAC.impl.ACPolicyImpl
		 * @see xisong.model.programmaticAC.impl.ProgrammaticACPackageImpl#getACPolicy()
		 * @generated
		 */
		EClass AC_POLICY = eINSTANCE.getACPolicy();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AC_POLICY__ROLES = eINSTANCE.getACPolicy_Roles();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AC_POLICY__ACTIONS = eINSTANCE.getACPolicy_Actions();

		/**
		 * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AC_POLICY__OBJECTS = eINSTANCE.getACPolicy_Objects();

		/**
		 * The meta object literal for the '{@link xisong.model.programmaticAC.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xisong.model.programmaticAC.impl.RoleImpl
		 * @see xisong.model.programmaticAC.impl.ProgrammaticACPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__PERMISSIONS = eINSTANCE.getRole_Permissions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

		/**
		 * The meta object literal for the '{@link xisong.model.programmaticAC.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xisong.model.programmaticAC.impl.ActionImpl
		 * @see xisong.model.programmaticAC.impl.ProgrammaticACPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link xisong.model.programmaticAC.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xisong.model.programmaticAC.impl.ObjectImpl
		 * @see xisong.model.programmaticAC.impl.ProgrammaticACPackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '{@link xisong.model.programmaticAC.impl.PermissionImpl <em>Permission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xisong.model.programmaticAC.impl.PermissionImpl
		 * @see xisong.model.programmaticAC.impl.ProgrammaticACPackageImpl#getPermission()
		 * @generated
		 */
		EClass PERMISSION = eINSTANCE.getPermission();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERMISSION__ACTION = eINSTANCE.getPermission_Action();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERMISSION__OBJECT = eINSTANCE.getPermission_Object();

		/**
		 * The meta object literal for the '{@link xisong.model.programmaticAC.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xisong.model.programmaticAC.impl.StatementImpl
		 * @see xisong.model.programmaticAC.impl.ProgrammaticACPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link xisong.model.programmaticAC.impl.ExecuteImpl <em>Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xisong.model.programmaticAC.impl.ExecuteImpl
		 * @see xisong.model.programmaticAC.impl.ProgrammaticACPackageImpl#getExecute()
		 * @generated
		 */
		EClass EXECUTE = eINSTANCE.getExecute();

		/**
		 * The meta object literal for the '<em><b>Executed Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTE__EXECUTED_STATEMENT = eINSTANCE.getExecute_ExecutedStatement();

		/**
		 * The meta object literal for the '<em>Ct Statement</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.code.CtStatement
		 * @see xisong.model.programmaticAC.impl.ProgrammaticACPackageImpl#getCtStatement()
		 * @generated
		 */
		EDataType CT_STATEMENT = eINSTANCE.getCtStatement();

	}

} //ProgrammaticACPackage
