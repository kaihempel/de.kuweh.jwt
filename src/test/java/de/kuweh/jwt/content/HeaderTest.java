package de.kuweh.jwt.content;

import de.kuweh.jwt.json.fields.FieldEmptyException;
import de.kuweh.jwt.json.fields.FieldInterface;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class HeaderTest {

    @Test
    void setAlgorithm() {
        Header header = new Header();
        header.setAlgorithm("HS256");

        HashMap<String, FieldInterface> fields = header.getData();

        try {
            assertEquals("HS256", fields.get("alg").getValue());

        } catch (FieldEmptyException e) {
            e.printStackTrace();
        }
    }
}