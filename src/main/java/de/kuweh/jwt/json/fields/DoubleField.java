package de.kuweh.jwt.json.fields;

import com.google.gson.stream.JsonWriter;
import java.io.IOException;

public class DoubleField implements FieldInterface<Double>, FieldJsonInterface {

    private Double value;

    public DoubleField() {}

    public DoubleField(Double value) {
        this.setValue(value);
    }

    @Override
    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public Double getValue() throws FieldEmptyException {

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
