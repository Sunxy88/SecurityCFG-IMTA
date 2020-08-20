/**
 */
package xisong.model.programmaticAC.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import spoon.reflect.code.CtStatement;

import xisong.model.programmaticAC.Execute;
import xisong.model.programmaticAC.ProgrammaticACPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xisong.model.programmaticAC.impl.ExecuteImpl#getExecutedStatement <em>Executed Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecuteImpl extends ActionImpl implements Execute {
	/**
	 * The default value of the '{@link #getExecutedStatement() <em>Executed Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutedStatement()
	 * @generated
	 * @ordered
	 */
	protected static final CtStatement EXECUTED_STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExecutedStatement() <em>Executed Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutedStatement()
	 * @generated
	 * @ordered
	 */
	protected CtStatement executedStatement = EXECUTED_STATEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecuteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProgrammaticACPackage.Literals.EXECUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CtStatement getExecutedStatement() {
		return executedStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExecutedStatement(CtStatement newExecutedStatement) {
		CtStatement oldExecutedStatement = executedStatement;
		executedStatement = newExecutedStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammaticACPackage.EXECUTE__EXECUTED_STATEMENT, oldExecutedStatement, executedStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProgrammaticACPackage.EXECUTE__EXECUTED_STATEMENT:
				return getExecutedStatement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProgrammaticACPackage.EXECUTE__EXECUTED_STATEMENT:
				setExecutedStatement((CtStatement)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProgrammaticACPackage.EXECUTE__EXECUTED_STATEMENT:
				setExecutedStatement(EXECUTED_STATEMENT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProgrammaticACPackage.EXECUTE__EXECUTED_STATEMENT:
				return EXECUTED_STATEMENT_EDEFAULT == null ? executedStatement != null : !EXECUTED_STATEMENT_EDEFAULT.equals(executedStatement);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (executedStatement: ");
		result.append(executedStatement);
		result.append(')');
		return result.toString();
	}

} //ExecuteImpl
