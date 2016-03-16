package com.ozerian.enterprise.module1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.CharacterCodingException;

/**
 * File creation ad writing data in it.
 */
public class FileWriterForTable {

    /**
     * Method creates the file in default directory.
     * Then method writes the data in this file.
     * @param elementsAmount amount of collections' elements.
     * @param message data for writing into the file.
     * @throws IOException
     */
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
