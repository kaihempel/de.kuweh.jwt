package de.kuweh.jwt.payload;

/**
 * Payload field definition
 *
 * @param <T> Type of the field
 */
interface FieldInterface<T> {

    /**
     * Field name
     *
     * @param name The name of the field
     */
    void setName(String name);

    /**
     * Returns the name of the field
     *
     * @return The name of the field
     * @throws FieldEmptyException
     */
    String getName() throws FieldEmptyException;

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
