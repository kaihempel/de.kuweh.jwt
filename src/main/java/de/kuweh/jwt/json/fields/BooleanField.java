package de.kuweh.jwt.json.fields;

import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/**
 * Json boolean field
 */
public class BooleanField implements FieldInterface<Boolean>, FieldJsonInterface {

    private Boolean value;

    public BooleanField() {}

    public BooleanField(Boolean value) {
        this.setValue(value);
    }

    @Override
    public void setValue(Boolean value) {
        this.value = value;
    }

    @Override
    public Boolean getValue() throws FieldEmptyException {

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
