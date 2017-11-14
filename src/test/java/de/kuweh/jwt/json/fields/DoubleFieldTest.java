package de.kuweh.jwt.json.fields;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleFieldTest {

    @Test
    void setValueByConstructor() {

        DoubleField field = new DoubleField(1.2);

        try {
            assertEquals(1.2, field.getValue().doubleValue());

        } catch (FieldEmptyException e) {
            e.printStackTrace();
        }
    }

    @Test
    void setValue() {

        DoubleField field = new DoubleField();
        field.setValue(1.2);

        try {
            assertEquals(1.2, field.getValue().doubleValue());

        } catch (FieldEmptyException e) {
            e.printStackTrace();
        }
    }

    @Test
    void emptyField() {

        DoubleField field = new DoubleField();

        Throwable exception = assertThrows(FieldEmptyException.class, () -> {
            field.getValue();
        });
        assertEquals("No value set!", exception.getMessage());
    }
}