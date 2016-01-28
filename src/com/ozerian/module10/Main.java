package com.ozerian.module10;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            File textMessageFile = new File("Encode text message.txt");
            String message = MessageWriterReader.enter();
            String encodeMessage = MessageWriterReader.encodingMessageFileWriter(message, 5, textMessageFile);
            System.out.println(encodeMessage);
            String decodeMessage = MessageWriterReader.decodingMessageReader(textMessageFile, 5);
            System.out.println(decodeMessage);
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Error!");
        }
    }
}
