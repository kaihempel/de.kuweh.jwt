package de.kuweh.jwt.json.fields;

import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/**
 * Json string field
 */
public class StringField implements FieldInterface<String>, FieldJsonInterface {

    private String value;

    public StringField() {}

    public StringField(String value) {
        this.setValue(value);
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String getValue() throws FieldEmptyException {

        if (this.value == null) {
            throw new FieldEmptyException("No value set!");
        }
        return this.value;
    }

    @Override
    public void addValueToJsonWriter(JsonWriter jsonWriter) {
        try {
            jsonWriter.value(this.getValue());
        } catch (IOException | FieldEmptyException e) {
            e.printStackTrace();
        }
    }
}
