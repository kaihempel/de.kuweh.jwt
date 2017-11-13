package de.kuweh.jwt.payload;

public class StringField implements FieldInterface<String> {

    private String value;

    StringField() {}

    StringField(String value) {
        this.setValue(value);
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String getValue() throws FieldEmptyException {

        if (this.value == null) {
            throw new FieldEmptyException("No value set!");
        }
        return this.value;
    }
}
