/**
 */
package airport;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Common Area Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see airport.AirportPackage#getCommonAreaTypes()
 * @model
 * @generated
 */
public enum CommonAreaTypes implements Enumerator {
	/**
	 * The '<em><b>Sitting</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SITTING_VALUE
	 * @generated
	 * @ordered
	 */
	SITTING(0, "Sitting", "SittingLiteral\tSitting"),

	/**
	 * The '<em><b>Dining</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DINING_VALUE
	 * @generated
	 * @ordered
	 */
	DINING(0, "Dining", "Dining"),

	/**
	 * The '<em><b>Working</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKING_VALUE
	 * @generated
	 * @ordered
	 */
	WORKING(0, "Working", "Working"),

	/**
	 * The '<em><b>Playing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAYING_VALUE
	 * @generated
	 * @ordered
	 */
	PLAYING(0, "Playing", "Playing"),

	/**
	 * The '<em><b>Restroom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESTROOM_VALUE
	 * @generated
	 * @ordered
	 */
	RESTROOM(0, "Restroom", "Restroom"),

	/**
	 * The '<em><b>Retail</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETAIL_VALUE
	 * @generated
	 * @ordered
	 */
	RETAIL(0, "Retail", "Retail"),

	/**
	 * The '<em><b>Lounge</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOUNGE_VALUE
	 * @generated
	 * @ordered
	 */
	LOUNGE(0, "Lounge", "Lounge");

	/**
	 * The '<em><b>Sitting</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SITTING
	 * @model name="Sitting" literal="SittingLiteral\tSitting"
	 * @generated
	 * @ordered
	 */
	public static final int SITTING_VALUE = 0;

	/**
	 * The '<em><b>Dining</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DINING
	 * @model name="Dining"
	 * @generated
	 * @ordered
	 */
	public static final int DINING_VALUE = 0;

	/**
	 * The '<em><b>Working</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKING
	 * @model name="Working"
	 * @generated
	 * @ordered
	 */
	public static final int WORKING_VALUE = 0;

	/**
	 * The '<em><b>Playing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAYING
	 * @model name="Playing"
	 * @generated
	 * @ordered
	 */
	public static final int PLAYING_VALUE = 0;

	/**
	 * The '<em><b>Restroom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESTROOM
	 * @model name="Restroom"
	 * @generated
	 * @ordered
	 */
	public static final int RESTROOM_VALUE = 0;

	/**
	 * The '<em><b>Retail</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETAIL
	 * @model name="Retail"
	 * @generated
	 * @ordered
	 */
	public static final int RETAIL_VALUE = 0;

	/**
	 * The '<em><b>Lounge</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOUNGE
	 * @model name="Lounge"
	 * @generated
	 * @ordered
	 */
	public static final int LOUNGE_VALUE = 0;

	/**
	 * An array of all the '<em><b>Common Area Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CommonAreaTypes[] VALUES_ARRAY =
		new CommonAreaTypes[] {
			SITTING,
			DINING,
			WORKING,
			PLAYING,
			RESTROOM,
			RETAIL,
			LOUNGE,
		};

	/**
	 * A public read-only list of all the '<em><b>Common Area Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CommonAreaTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Common Area Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CommonAreaTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CommonAreaTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Common Area Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CommonAreaTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CommonAreaTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Common Area Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CommonAreaTypes get(int value) {
		switch (value) {
			case SITTING_VALUE: return SITTING;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CommonAreaTypes(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //CommonAreaTypes
