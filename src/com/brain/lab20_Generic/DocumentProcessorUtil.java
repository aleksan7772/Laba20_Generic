package com.brain.lab20_Generic;

public class DocumentProcessorUtil {
    static Integer ID_COUNTER = 0;

    private DocumentProcessorUtil() {
    }

    public static  <T extends AbstractData & Storable> StringData convert(T data) {

        return new StringData(ID_COUNTER++, data.getType(), data);
    }

    static <T> void build(Storable storeObj, T data) {
        storeObj.write(data);
    }
}
