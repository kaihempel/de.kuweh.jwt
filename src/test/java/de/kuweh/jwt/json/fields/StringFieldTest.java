package de.kuweh.jwt.json.fields;

import de.kuweh.jwt.json.fields.FieldEmptyException;
import de.kuweh.jwt.json.fields.StringField;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringFieldTest {

    @Test
    void setValueByConstrutor() {
        String expected = "Test by Constructor";

        StringField field = new StringField(expected);

        try {
            assertEquals(expected, field.getValue());

        } catch (FieldEmptyException e) {
            e.printStackTrace();
        }
    }

    @Test
    void setValue() {

        StringField field = new StringField();
        field.setValue("TEST");

        try {
            assertEquals("TEST", field.getValue());

        } catch (FieldEmptyException e) {
            e.printStackTrace();
        }
    }

    @Test
    void emptyField() {

        StringField field = new StringField();

        Throwable exception = assertThrows(FieldEmptyException.class, () -> {
            field.getValue();
        });
        assertEquals("No value set!", exception.getMessage());
    }
}