package de.kuweh.jwt.payload;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IntegerFieldTest {

    @Test
    void setValueByConstructor() {

        IntegerField field = new IntegerField("test",232323);

        try {

            assertEquals("test", field.getName());
            assertEquals(232323, field.getValue().intValue());

        } catch (FieldEmptyException e) {
            e.printStackTrace();
        }
    }

    @Test
    void setValue() {

        IntegerField field = new IntegerField();
        field.setName("test");
        field.setValue(123);

        try {

            assertEquals("test", field.getName());
            assertEquals(123, field.getValue().intValue());

        } catch (FieldEmptyException e) {
            e.printStackTrace();
        }
    }

    @Test
    void emptyField() {

        IntegerField field = new IntegerField();

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