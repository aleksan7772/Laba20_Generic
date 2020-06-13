package com.brain.lab20_Generic;

public class StringData extends AbstractData {

    Type type;
    private String data;
    public <T extends AbstractData> StringData(long id,Type type, T data) {
        super(id);
        convertToString();
    }

    @Override
    public String toString() {
        return "StringData{" +
                "type=" + type +
                ", data='" + data + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StringData that = (StringData) o;

        if (type != that.type) return false;
        return data != null ? data.equals(that.data) : that.data == null;
    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + (data != null ? data.hashCode() : 0);
        return result;
    }

    @Override
    String convertToString() {
        return null;
    }
}
