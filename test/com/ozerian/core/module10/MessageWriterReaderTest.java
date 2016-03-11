package com.ozerian.core.module10;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import static org.junit.Assert.*;

public class MessageWriterReaderTest {
    static File file;
    static String message;
    static FileWriter fileWriter;
    static FileReader fileReader;

    @BeforeClass
    public static void setUp() throws Exception {
        file = new File("TestFile.txt");
        fileWriter = new FileWriter(file);
        fileReader = new FileReader(file);
        message = "ABcdEFG";
    }

    @Test
    public void testEncodingMessageTextFileCreator() throws Exception {
        final String expectedMessage = "BCdeFGH";
        char[] expectedChars = expectedMessage.toCharArray();
        final String actualString = MessageWriterReader.encodingMessageFileWriter(message, 1, file);
        char[] actualChars = actualString.toCharArray();

        assertArrayEquals(expectedChars, actualChars);
    }

    @Test
    public void testDecodingMessageFilePrinter() throws Exception {
        final String expectedMessage = "ABcdEFG";
        char[] expectedChars = expectedMessage.toCharArray();
        final String actualString = MessageWriterReader.decodingMessageReader(file, 1);
        char[] actualChars = actualString.toCharArray();

        assertArrayEquals(expectedChars, actualChars);
    }

}