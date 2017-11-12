package de.kuweh.jwt.payload;

public class IntegerField implements FieldInterface<Integer> {

    private String name;
    private Integer value;

    IntegerField() {}

    IntegerField(String name, Integer value) {
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
