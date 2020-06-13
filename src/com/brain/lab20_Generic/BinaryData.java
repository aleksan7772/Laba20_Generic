package com.brain.lab20_Generic;

public class BinaryData extends AbstractData implements Storable<BinaryData> {
    private final Type type;
    private byte[] data;

    public BinaryData(long id, byte[] data) {
        super(id);
        this.data = data;
        this.type = Type.BIN;
    }


    @Override
    public BinaryData data() {
        return null;
    }

    @Override
    public BinaryData read() {
        return null;
    }

    @Override
    public void write(BinaryData data) {

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
