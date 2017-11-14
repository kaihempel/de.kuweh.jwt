package de.kuweh.jwt.json.fields;

import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/**
 * Json integer field
 */
public class IntegerField implements FieldInterface<Integer>, FieldJsonInterface {

    private Integer value;

    public IntegerField() {}

    public IntegerField(Integer value) {
        this.setValue(value);
    }

    @Override
    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public Integer getValue() throws FieldEmptyException {

        if (this.value == null) {
            throw new FieldEmptyException("No value set!");
        }
        return this.value;
    }

    @Override
    public void addValueToJsonWriter(JsonWriter jsonWriter) {
        try {
            jsonWriter.value(this.getValue().intValue());
        } catch (IOException | FieldEmptyException e) {
            e.printStackTrace();
        }
    }
}
