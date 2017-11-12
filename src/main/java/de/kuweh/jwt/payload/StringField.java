package de.kuweh.jwt.payload;

public class StringField implements FieldInterface<String> {

    private String name;
    private String value;

    StringField() {}

    StringField(String name, String value) {
        this.setName(name);
        this.setValue(value);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() throws FieldEmptyException {

        if (this.value == null) {
            throw new FieldEmptyException("No name set!");
        }
        return this.name;
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
