package com.ozerian.module10;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            File textMessageFile = new File("Encode text message.txt");
            String message = MessageWriterReader.enter();
            MessageWriterReader.encodingMessageTextFileCreator(message, 5, textMessageFile);
            MessageWriterReader.decodingMessageFilePrinter(textMessageFile, 5);
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Error!");
        }
    }
}
