package de.kuweh.jwt.payload;

import com.google.gson.GsonBuilder;
import de.kuweh.jwt.json.EncodeableInterface;
import java.util.ArrayList;
import java.util.HashMap;

public class Payload implements EncodeableInterface {

    HashMap<String, FieldInterface> data = new HashMap<>();

    void add(String name, FieldInterface value) {
        data.put(name, value);
    }

    HashMap<String, FieldInterface> getData() {
        return this.data;
    }

    @Override
    public String toJson(GsonBuilder gson) {

        return null;
    }
}
