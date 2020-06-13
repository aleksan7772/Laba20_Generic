package com.brain.lab20_Generic;

public class XmlData extends AbstractData implements Storable<XmlData> {
    private final Type type = Type.XML;
    private String data;

    public XmlData(long id) {
        super(id);
    }

    @Override
    String convertToString() {
        return null;
    }


    @Override
    public XmlData data() {
        return null;
    }

    @Override
    public XmlData read() {
        return null;
    }

    @Override
    public void write(XmlData data) {

    }

    @Override
    public Type getType() {
        return null;
    }
}
