/**
 */
package airport;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Transportation Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see airport.AirportPackage#getTransportationTypes()
 * @model
 * @generated
 */
public enum TransportationTypes implements Enumerator {
	/**
	 * The '<em><b>Taxi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAXI_VALUE
	 * @generated
	 * @ordered
	 */
	TAXI(0, "Taxi", "Taxi"),

	/**
	 * The '<em><b>Bus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUS_VALUE
	 * @generated
	 * @ordered
	 */
	BUS(0, "Bus", "Bus"),

	/**
	 * The '<em><b>Train</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAIN_VALUE
	 * @generated
	 * @ordered
	 */
	TRAIN(0, "Train", "Train");

	/**
	 * The '<em><b>Taxi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAXI
	 * @model name="Taxi"
	 * @generated
	 * @ordered
	 */
	public static final int TAXI_VALUE = 0;

	/**
	 * The '<em><b>Bus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUS
	 * @model name="Bus"
	 * @generated
	 * @ordered
	 */
	public static final int BUS_VALUE = 0;

	/**
	 * The '<em><b>Train</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAIN
	 * @model name="Train"
	 * @generated
	 * @ordered
	 */
	public static final int TRAIN_VALUE = 0;

	/**
	 * An array of all the '<em><b>Transportation Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TransportationTypes[] VALUES_ARRAY =
		new TransportationTypes[] {
			TAXI,
			BUS,
			TRAIN,
		};

	/**
	 * A public read-only list of all the '<em><b>Transportation Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TransportationTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Transportation Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransportationTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransportationTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transportation Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransportationTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransportationTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transportation Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransportationTypes get(int value) {
		switch (value) {
			case TAXI_VALUE: return TAXI;
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
	private TransportationTypes(int value, String name, String literal) {
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
	
} //TransportationTypes
