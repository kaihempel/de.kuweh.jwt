package de.kuweh.jwt.payload;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PayloadTest {

    @Test
    void addStringField() {

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

    @Test
    void addIntegerField() {

        IntegerField field = new IntegerField("id", 123);
        Payload payload = new Payload();

        payload.add(field);

        ArrayList<FieldInterface> fields = payload.getData();

        try {

            IntegerField current = (IntegerField) fields.get(0);
            assertEquals(123, current.getValue().intValue());

        } catch (FieldEmptyException e) {
            e.printStackTrace();
        }
    }

    @Test
    void addBooleanField() {

        BooleanField field = new BooleanField("admin", true);
        Payload payload = new Payload();

        payload.add(field);

        ArrayList<FieldInterface> fields = payload.getData();

        try {

            BooleanField current = (BooleanField) fields.get(0);
            assertTrue(current.getValue());

        } catch (FieldEmptyException e) {
            e.printStackTrace();
        }
    }
}