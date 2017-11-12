package de.kuweh.jwt.payload;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringFieldTest {

    @Test
    void setValueByConstrutor() {
        String expected = "Test by Constructor";

        StringField field = new StringField("test", expected);

        try {

            assertEquals("test", field.getName());
            assertEquals(expected, field.getValue());

        } catch (FieldEmptyException e) {
            e.printStackTrace();
        }
    }

    @Test
    void setValue() {

        StringField field = new StringField();
        field.setName("test");
        field.setValue("TEST");

        try {

            assertEquals("test", field.getName());
            assertEquals("TEST", field.getValue());

        } catch (FieldEmptyException e) {
            e.printStackTrace();
        }
    }

    @Test
    void emptyField() {

        StringField field = new StringField();

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