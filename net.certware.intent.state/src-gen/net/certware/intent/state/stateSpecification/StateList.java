/**
 */
package net.certware.intent.state.stateSpecification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.certware.intent.state.stateSpecification.StateList#getStateList <em>State List</em>}</li>
 * </ul>
 *
 * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getStateList()
 * @model
 * @generated
 */
public interface StateList extends EObject
{
  /**
   * Returns the value of the '<em><b>State List</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.intent.state.stateSpecification.StateValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State List</em>' containment reference list.
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getStateList_StateList()
   * @model containment="true"
   * @generated
   */
  EList<StateValue> getStateList();

} // StateList
