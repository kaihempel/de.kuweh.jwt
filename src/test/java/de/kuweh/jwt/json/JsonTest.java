package de.kuweh.jwt.json;

import de.kuweh.jwt.content.Payload;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JsonTest {

    @Test
    void encode() {

        Payload payload = new Payload();

        assertEquals("{}", Json.encode(payload));
    }

}