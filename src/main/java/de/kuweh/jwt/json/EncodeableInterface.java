package de.kuweh.jwt.json;

import com.google.gson.GsonBuilder;

/**
 * Encodeable interface
 *
 * Objects must implement the json encode method
 */
public interface EncodeableInterface {

    /**
     * Injects the gson builder into object for json serialization
     *
     * @param gson Json builder instance
     * @return Json string
     */
    String toJson(GsonBuilder gson);
}
