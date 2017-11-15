package de.kuweh.jwt.content;

import com.google.gson.GsonBuilder;
import de.kuweh.jwt.json.FieldTypeAdapter;
import de.kuweh.jwt.json.fields.*;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class PayloadTest {

    @Test
    void addStringField() {

        StringField field = new StringField("1234567890");
        Payload payload = new Payload();

        payload.add("sub", field);

        HashMap<String, FieldInterface> fields = payload.getData();

        try {
            assertEquals("1234567890", fields.get("sub").getValue());

        } catch (FieldEmptyException e) {
            e.printStackTrace();
        }
    }

    @Test
    void addIntegerField() {

        IntegerField field = new IntegerField(123);
        Payload payload = new Payload();

        payload.add("id", field);

        HashMap<String, FieldInterface> fields = payload.getData();

        try {

            IntegerField current = (IntegerField) fields.get("id");
            assertEquals(123, current.getValue().intValue());

        } catch (FieldEmptyException e) {
            e.printStackTrace();
        }
    }

    @Test
    void addDoubleField() {

        DoubleField field = new DoubleField(1.23);
        Payload payload = new Payload();

        payload.add("id", field);

        HashMap<String, FieldInterface> fields = payload.getData();

        try {

            DoubleField current = (DoubleField) fields.get("id");
            assertEquals(1.23, current.getValue().doubleValue());

        } catch (FieldEmptyException e) {
            e.printStackTrace();
        }
    }

    @Test
    void addBooleanField() {

        BooleanField field = new BooleanField(true);
        Payload payload = new Payload();

        payload.add("admin", field);

        HashMap<String, FieldInterface> fields = payload.getData();

        try {

            BooleanField current = (BooleanField) fields.get("admin");
            assertTrue(current.getValue());

        } catch (FieldEmptyException e) {
            e.printStackTrace();
        }
    }

    @Test
    void toJsonString() {

        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(StringField.class, new FieldTypeAdapter());
        builder.registerTypeAdapter(IntegerField.class, new FieldTypeAdapter());
        builder.registerTypeAdapter(BooleanField.class, new FieldTypeAdapter());

        String expected = "{\"sub\":\"1234567890\",\"name\":\"John Doe\",\"admin\":true}";

        Payload payload = new Payload();
        payload.addString("sub", "1234567890");
        payload.addString("name", "John Doe");
        payload.addBoolean("admin", true);

        assertEquals(expected, payload.toJson(builder));
    }
}