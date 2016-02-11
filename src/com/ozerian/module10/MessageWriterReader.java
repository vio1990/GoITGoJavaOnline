package com.ozerian.module10;


import com.ozerian.module9.CaesarCipher;

import java.io.*;
import java.nio.charset.CharacterCodingException;

public class MessageWriterReader {

    public static String enter() throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((System.in)))) {
            return bufferedReader.readLine();
        }
    }

    public static void decodingMessageFilePrinter(File file, int decodingKey)throws IOException {
        try (BufferedReader fileReader = new BufferedReader(new FileReader(file))) {
            StringBuilder stringBuilder = new StringBuilder();
            String decodeMessage = fileReader.readLine();
            decodeMessage = CaesarCipher.caesarDecode(decodeMessage, decodingKey);
            stringBuilder.append(decodeMessage);
            System.out.println(stringBuilder.toString());
        } catch (FileNotFoundException ex) {
            System.out.println("The required file isn't found!");
        } catch (CharacterCodingException ex) {
            System.out.println("Error! There are problems with encoding");
        }
    }

    public static void encodingMessageTextFileCreator(String message, int codingKey, File file) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            message = CaesarCipher.caesarEncode(message, codingKey);
            writer.write(message);
        } catch (CharacterCodingException ex) {
            System.out.println("Error! There are problems with decoding");
        }
    }
}

