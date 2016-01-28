package com.ozerian.module10;


import com.ozerian.module9.CaesarCipher;

import java.io.*;

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
            return message;
        }
    }

    public static String decodingMessageReader(File file, int decodingKey)throws IOException {
        try (BufferedReader fileReader = new BufferedReader(new FileReader(file))) {
            StringBuilder stringBuilder = new StringBuilder();
            String decodeMessage = fileReader.readLine();
            decodeMessage = CaesarCipher.caesarDecode(decodeMessage, decodingKey);
            stringBuilder.append(decodeMessage);
            return stringBuilder.toString();
        }
    }

}

