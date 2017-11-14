package de.kuweh.jwt.json.fields;

/**
 * Payload field definition
 *
 * @param <T> Type of the field
 */
public interface FieldInterface<T> {

    /**
     * The value of the field
     *
     * @param value Field value as the defined type
     */
    void setValue(T value);

    /**
     * Returns the current value of the field
     *
     * @return Field value as the defined type
     * @throws FieldEmptyException
     */
    T getValue() throws FieldEmptyException;
}
