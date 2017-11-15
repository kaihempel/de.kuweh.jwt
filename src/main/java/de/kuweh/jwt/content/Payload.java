package de.kuweh.jwt.content;

import de.kuweh.jwt.json.fields.*;

/**
 * JWT Payload container
 */
public class Payload extends AbstractContent {

    void addString(String name, String value) {
        this.add(name, new StringField(value));
    }

    void addInteger(String name, int value) {
        this.add(name, new IntegerField(value));
    }

    void addDouble(String name, double value) {
        this.add(name, new DoubleField(value));
    }

    void addBoolean(String name, boolean value) {
        this.add(name, new BooleanField(value));
    }

}
