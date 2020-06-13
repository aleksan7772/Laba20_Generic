package com.brain.lab20_Generic;

public abstract class AbstractData {
    private long id;

    public long getId() {
        return id;
    }

    public AbstractData(long id) {
        this.id = id;
    }
    abstract String convertToString();

}

