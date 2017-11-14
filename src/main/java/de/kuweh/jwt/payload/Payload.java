package de.kuweh.jwt.payload;

import com.google.gson.GsonBuilder;
import de.kuweh.jwt.json.EncodeableInterface;
import de.kuweh.jwt.json.fields.BooleanField;
import de.kuweh.jwt.json.fields.FieldInterface;
import de.kuweh.jwt.json.fields.IntegerField;
import de.kuweh.jwt.json.fields.StringField;
import java.util.HashMap;

/**
 * JWT Payload container
 */
public class Payload implements EncodeableInterface {

    HashMap<String, FieldInterface> data = new HashMap<>();

    void add(String name, FieldInterface value) {
        data.put(name, value);
    }

    void addString(String name, String value) {
        this.add(name, new StringField(value));
    }

    void addInteger(String name, int value) {
        this.add(name, new IntegerField(value));
    }

    void addBoolean(String name, boolean value) {
        this.add(name, new BooleanField(value));
    }

    HashMap<String, FieldInterface> getData() {
        return this.data;
    }

    @Override
    public String toJson(GsonBuilder gsonBuilder) {
        return gsonBuilder.create().toJson(this.data);
    }
}
