package de.kuweh.jwt.payload;

public class BooleanField implements FieldInterface<Boolean> {

    private Boolean value;

    BooleanField() {}

    BooleanField(Boolean value) {
        this.setValue(value);
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
