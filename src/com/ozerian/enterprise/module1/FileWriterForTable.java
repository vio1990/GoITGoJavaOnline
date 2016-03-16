package com.ozerian.enterprise.module1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.CharacterCodingException;

public class FileWriterForTable {

    public static void fileWriter(int elementsAmount, String message) throws IOException {
        File file = new File("Comparing collections table with " + elementsAmount + " elements.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(message);
        } catch (CharacterCodingException ex) {
            ex.printStackTrace();
            System.out.println("Wrong coding process!");
        }
    }
}
