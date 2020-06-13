package com.brain.lab20_Generic;

public class Main {
    public static void main(String[] args) {
//        byte[] data = new byte[]{Byte.parseByte("Данные в байтах")};
        Double d = 123.456789;
        XmlData xmlData = new XmlData(DocumentProcessorUtil.ID_COUNTER++);
//        BinaryData binaryData = new BinaryData(DocumentProcessorUtil.ID_COUNTER++, data);
        NumericData numericData = new NumericData(DocumentProcessorUtil.ID_COUNTER++, d);
        DocumentProcessorUtil.build(xmlData, "“ <?xml version=\"1.0\"?><Tests>qwerty</Tests>");
        DocumentProcessorUtil.convert(xmlData);
        System.out.println(xmlData);
    }
}
