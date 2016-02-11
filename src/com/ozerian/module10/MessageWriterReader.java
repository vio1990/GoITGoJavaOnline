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

    public static String encodingMessageFileWriter(String message, int codingKey, File file) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            message = CaesarCipher.caesarEncode(message, codingKey);
            writer.write(message);
        } catch (CharacterCodingException ex) {
            System.out.println("Wrong coding process!");
        }
        return message;
    }

    public static String decodingMessageReader(File file, int decodingKey)throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader fileReader = new BufferedReader(new FileReader(file))) {
            String decodeMessage = fileReader.readLine();
            decodeMessage = CaesarCipher.caesarDecode(decodeMessage, decodingKey);
            stringBuilder.append(decodeMessage);
        } catch (FileNotFoundException ex) {
            System.out.println("The required file isn't found!");
        } catch (CharacterCodingException ex) {
            System.out.println("Wrong decoding process!");
        }
        return stringBuilder.toString();
    }

}