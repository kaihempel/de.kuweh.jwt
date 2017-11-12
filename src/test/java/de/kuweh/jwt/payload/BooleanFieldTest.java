package de.kuweh.jwt.payload;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BooleanFieldTest {

    @Test
    void setValueByConstructor() {
        BooleanField field1 = new BooleanField("field1", Boolean.valueOf(true));
        BooleanField field2 = new BooleanField("field2", Boolean.valueOf(false));

        try {

            assertEquals("field1", field1.getName());
            assertTrue(field1.getValue().booleanValue());

            assertEquals("field2", field2.getName());
            assertFalse(field2.getValue().booleanValue());

        } catch (FieldEmptyException e) {
            e.printStackTrace();
        }

    }

    @Test
    void setValue() {

        BooleanField field = new BooleanField();
        field.setValue(true);

        try {
            assertEquals(true, field.getValue());
        } catch (FieldEmptyException e) {
            e.printStackTrace();
        }
    }

    @Test
    void emptyField() {

        BooleanField field = new BooleanField();

        Throwable exception = assertThrows(FieldEmptyException.class, () -> {
            field.getName();
        });
        assertEquals("No name set!", exception.getMessage());

        exception = assertThrows(FieldEmptyException.class, () -> {
            field.getValue();
        });
        assertEquals("No value set!", exception.getMessage());
    }
}