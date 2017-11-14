package de.kuweh.jwt.json;

import com.google.gson.GsonBuilder;
import de.kuweh.jwt.json.fields.BooleanField;
import de.kuweh.jwt.json.fields.IntegerField;
import de.kuweh.jwt.json.fields.StringField;

public class Json {

    public static String encode(EncodeableInterface object) {
        return object.toJson(initializeGsonBuilder());
    }

    private static GsonBuilder initializeGsonBuilder() {
        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(StringField.class, new FieldTypeAdapter());
        builder.registerTypeAdapter(IntegerField.class, new FieldTypeAdapter());
        builder.registerTypeAdapter(BooleanField.class, new FieldTypeAdapter());

        return builder;
    }

    public static void decode() {

    }
}
