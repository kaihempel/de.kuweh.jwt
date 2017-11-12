package de.kuweh.jwt.payload;

import java.util.ArrayList;

class Payload {

    ArrayList<FieldInterface> data = new ArrayList<FieldInterface>();

    void add(FieldInterface value) {
        data.add(value);
    }

    ArrayList<FieldInterface> getData() {
        return this.data;
    }
}
