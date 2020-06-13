package com.brain.lab20_Generic;


public interface Storable <S> {
     S data();

    S read();

    void write(S data);

    Type getType();
}
