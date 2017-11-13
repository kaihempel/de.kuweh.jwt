package de.kuweh.jwt.payload;

public class IntegerField implements FieldInterface<Integer> {

    private Integer value;

    IntegerField() {}

    IntegerField(Integer value) {
        this.setValue(value);
    }

    @Override
    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public Integer getValue() throws FieldEmptyException {

        if (this.value == null) {
            throw new FieldEmptyException("No value set!");
        }
        return this.value;
    }
}
