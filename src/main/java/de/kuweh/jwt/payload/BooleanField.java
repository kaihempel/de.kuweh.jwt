package de.kuweh.jwt.payload;

public class BooleanField implements FieldInterface<Boolean> {

    private String name;
    private Boolean value;

    BooleanField() {}

    BooleanField(String name, Boolean value) {
        this.setName(name);
        this.setValue(value);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() throws FieldEmptyException {

        if (this.name == null) {
            throw new FieldEmptyException("No name set!");
        }
        return this.name;
    }

    @Override
    public void setValue(Boolean value) {
        this.value = value;
    }

    @Override
    public Boolean getValue() throws FieldEmptyException {

        if (this.value == null) {
            throw new FieldEmptyException("No value set!");
        }
        return this.value;
    }
}
