package de.kuweh.jwt.payload;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IntegerFieldTest {

    @Test
    void setValueByConstructor() {

        IntegerField field = new IntegerField(232323);

        try {
            assertEquals(232323, field.getValue().intValue());

        } catch (FieldEmptyException e) {
            e.printStackTrace();
        }
    }

    @Test
    void setValue() {

        IntegerField field = new IntegerField();
        field.setValue(123);

        try {
            assertEquals(123, field.getValue().intValue());

        } catch (FieldEmptyException e) {
            e.printStackTrace();
        }
    }

    @Test
    void emptyField() {

        IntegerField field = new IntegerField();

        Throwable exception = assertThrows(FieldEmptyException.class, () -> {
            field.getValue();
        });
        assertEquals("No value set!", exception.getMessage());
    }
}