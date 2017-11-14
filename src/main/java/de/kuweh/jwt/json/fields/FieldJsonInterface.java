package de.kuweh.jwt.json.fields;

import com.google.gson.stream.JsonWriter;

/**
 * Field writer interface
 *
 * Field objects should implement to add there value to the json
 */
public interface FieldJsonInterface {

    /**
     * Adds the field value to the json writer
     *
     * @param jsonWriter
     */
    void addValueToJsonWriter(JsonWriter jsonWriter);
}
