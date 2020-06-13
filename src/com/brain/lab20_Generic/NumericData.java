package com.brain.lab20_Generic;

public class NumericData extends AbstractData implements Storable<NumericData> {
    private final Type type = Type.NUM;
    private Double data;

    public NumericData(long id, Double data) {
        super(id);
        this.data = data;
    }


    @Override
    public NumericData data() {
        return null;
    }

    @Override
    public NumericData read() {
        return null;
    }

    @Override
    public void write(NumericData data) {

    }

    @Override
    public Type getType() {
        return null;
    }

    @Override
    String convertToString() {
        return null;
    }
}
