/**
 */
package xisong.model.programmaticAC;

import spoon.reflect.code.CtStatement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xisong.model.programmaticAC.Execute#getExecutedStatement <em>Executed Statement</em>}</li>
 * </ul>
 *
 * @see xisong.model.programmaticAC.ProgrammaticACPackage#getExecute()
 * @model
 * @generated
 */
public interface Execute extends Action {
	/**
	 * Returns the value of the '<em><b>Executed Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executed Statement</em>' attribute.
	 * @see #setExecutedStatement(CtStatement)
	 * @see xisong.model.programmaticAC.ProgrammaticACPackage#getExecute_ExecutedStatement()
	 * @model dataType="xisong.model.programmaticAC.CtStatement"
	 * @generated
	 */
	CtStatement getExecutedStatement();

	/**
	 * Sets the value of the '{@link xisong.model.programmaticAC.Execute#getExecutedStatement <em>Executed Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executed Statement</em>' attribute.
	 * @see #getExecutedStatement()
	 * @generated
	 */
	void setExecutedStatement(CtStatement value);

} // Execute
