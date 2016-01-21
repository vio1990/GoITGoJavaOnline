package com.ozerian.module9;
/*
 It used ASCII table. The value of constants represents appropriate
 char's value in ASCII table. From "65" to "90" - Capital english letters
 in alphabet order. From "97" to "122" - Small english letters
 in alphabet order. "32" - it is a "space" symbol.
 */
public class CaesarCipher {

    public static final int CAPITAL_LETTER_ASCII_FIRST_A = 65;
    public static final int CAPITAL_LETTER_ASCII_LAST_Z = 90;
    public static final int SMALL_LETTER_ASCII_FIRST_A = 97;
    public static final int SMALL_LETTER_ASCII_LAST_Z = 122;
    public static final int ENGLISH_ALPHABET_CAPACITY = 26;
    public static final int SPACE_SYMBOL_ASCII = 32;

    public static String caesarEncode(String text, int shift) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char letterFromText = chars[i];
            if (letterFromText >= CAPITAL_LETTER_ASCII_FIRST_A && letterFromText <= CAPITAL_LETTER_ASCII_LAST_Z) {
                int letterPosition = letterFromText - CAPITAL_LETTER_ASCII_FIRST_A;
                letterPosition = (letterPosition + shift) % ENGLISH_ALPHABET_CAPACITY;
                if (shift < 0) {
                    letterPosition = +ENGLISH_ALPHABET_CAPACITY;
                }
                chars[i] = (char) (letterPosition + CAPITAL_LETTER_ASCII_FIRST_A);
            } else if (letterFromText >= SMALL_LETTER_ASCII_FIRST_A && letterFromText <= SMALL_LETTER_ASCII_LAST_Z) {
                int letterPosition = letterFromText - SMALL_LETTER_ASCII_FIRST_A;
                letterPosition = (letterPosition + shift) % ENGLISH_ALPHABET_CAPACITY;
                if (shift < 0) {
                    letterPosition = +ENGLISH_ALPHABET_CAPACITY;
                }
                chars[i] = (char) (letterPosition + SMALL_LETTER_ASCII_FIRST_A);
            } else if (letterFromText == SPACE_SYMBOL_ASCII) {
                chars[i] = (char) SPACE_SYMBOL_ASCII;
            }
        }
        return String.valueOf(chars);
    }

    public static String caesarDecode(String text, int shift) {
        char[] textAsChar = text.toCharArray();
        for (int i = 0; i < textAsChar.length; i++) {
            char letterFromText = textAsChar[i];
            if (letterFromText >= CAPITAL_LETTER_ASCII_FIRST_A && letterFromText <= CAPITAL_LETTER_ASCII_LAST_Z) {
                int letterPosition = letterFromText - CAPITAL_LETTER_ASCII_FIRST_A;
                letterPosition = (letterPosition - shift + ENGLISH_ALPHABET_CAPACITY) % ENGLISH_ALPHABET_CAPACITY;
                if (shift < 0) {
                    letterPosition = +ENGLISH_ALPHABET_CAPACITY;
                }
                textAsChar[i] = (char) (letterPosition + CAPITAL_LETTER_ASCII_FIRST_A);
            } else if (letterFromText >= SMALL_LETTER_ASCII_FIRST_A && letterFromText <= SMALL_LETTER_ASCII_LAST_Z) {
                int letterPosition = letterFromText - SMALL_LETTER_ASCII_FIRST_A;
                letterPosition = (letterPosition - shift + ENGLISH_ALPHABET_CAPACITY) % ENGLISH_ALPHABET_CAPACITY;
                if (shift < 0) {
                    letterPosition = +ENGLISH_ALPHABET_CAPACITY;
                }
                textAsChar[i] = (char) (letterPosition + SMALL_LETTER_ASCII_FIRST_A);
            } else if (letterFromText == SPACE_SYMBOL_ASCII) {
                textAsChar[i] = (char) SPACE_SYMBOL_ASCII;
            }
        }
        return String.valueOf(textAsChar);
    }
}
