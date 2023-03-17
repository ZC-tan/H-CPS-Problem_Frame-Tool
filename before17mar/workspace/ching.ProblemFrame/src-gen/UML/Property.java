/**
 */
package UML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UML.Property#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see UML.UMLPackage#getProperty()
 * @model annotation="aspect"
 * @generated
 */
public interface Property extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see UML.UMLPackage#getProperty_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        annotation="aspect"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link UML.Property#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // Property
