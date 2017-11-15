package de.kuweh.jwt.content;

import com.google.gson.GsonBuilder;
import de.kuweh.jwt.json.EncodeableInterface;
import de.kuweh.jwt.json.fields.FieldInterface;
import java.util.HashMap;

public class AbstractContent implements EncodeableInterface {

    HashMap<String, FieldInterface> data = new HashMap<>();

    void add(String name, FieldInterface value) {
        data.put(name, value);
    }

    HashMap<String, FieldInterface> getData() {
        return this.data;
    }

    @Override
    public String toJson(GsonBuilder gsonBuilder) {
        return gsonBuilder.create().toJson(this.data);
    }
}
