package de.kuweh.jwt.content;

import de.kuweh.jwt.json.fields.StringField;

public class Header extends AbstractContent {

    public Header() {
        this.add("typ", new StringField("JWT"));
    }

    void setAlgorithm(String value) {
        this.add("alg", new StringField(value));
    }
}
