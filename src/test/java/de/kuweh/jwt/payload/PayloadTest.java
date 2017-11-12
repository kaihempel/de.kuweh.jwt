package de.kuweh.jwt.payload;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PayloadTest {

    @Test
    public void testAddStringField() {

        StringField field = new StringField("sub", "1234567890");
        Payload payload = new Payload();

        payload.add(field);

        ArrayList<FieldInterface> fields = payload.getData();

        try {

            assertEquals("1234567890", fields.get(0).getValue());

        } catch (FieldEmptyException e) {
            e.printStackTrace();
        }
    }
}