package de.kuweh.jwt.json;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import de.kuweh.jwt.json.fields.FieldJsonInterface;
import java.io.IOException;

public class FieldTypeAdapter extends TypeAdapter<FieldJsonInterface> {

    @Override
    public void write(JsonWriter jsonWriter, FieldJsonInterface field) throws IOException {
        field.addValueToJsonWriter(jsonWriter);
    }

    @Override
    public FieldJsonInterface read(JsonReader jsonReader) throws IOException {
        return null;
    }
}
