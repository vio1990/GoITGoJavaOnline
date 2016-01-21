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

    public static String caesarDecode(String m, int key) {
        char[] chars = m.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c >= CAPITAL_LETTER_ASCII_FIRST_A && c <= CAPITAL_LETTER_ASCII_LAST_Z) {
                int x = c - CAPITAL_LETTER_ASCII_FIRST_A;
                x = (x - key + ENGLISH_ALPHABET_CAPACITY) % ENGLISH_ALPHABET_CAPACITY;
                if (key < 0) {
                    x = +ENGLISH_ALPHABET_CAPACITY;
                }
                chars[i] = (char) (x + CAPITAL_LETTER_ASCII_FIRST_A);
            } else if (c >= SMALL_LETTER_ASCII_FIRST_A && c <= SMALL_LETTER_ASCII_LAST_Z) {
                int x = c - SMALL_LETTER_ASCII_FIRST_A;
                x = (x - key + ENGLISH_ALPHABET_CAPACITY) % ENGLISH_ALPHABET_CAPACITY;
                if (key < 0) {
                    x = +ENGLISH_ALPHABET_CAPACITY;
                }
                chars[i] = (char) (x + SMALL_LETTER_ASCII_FIRST_A);
            } else if (c == SPACE_SYMBOL_ASCII) {
                chars[i] = (char) SPACE_SYMBOL_ASCII;
            }
        }
        return String.valueOf(chars);
    }


    public static String caesarEncode(String m, int key) {
        char[] chars = m.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c >= CAPITAL_LETTER_ASCII_FIRST_A && c <= CAPITAL_LETTER_ASCII_LAST_Z) {
                int x = c - CAPITAL_LETTER_ASCII_FIRST_A;
                x = (x + key) % ENGLISH_ALPHABET_CAPACITY;
                if (key < 0) {
                    x = +ENGLISH_ALPHABET_CAPACITY;
                }
                chars[i] = (char) (x + CAPITAL_LETTER_ASCII_FIRST_A);
            } else if (c >= SMALL_LETTER_ASCII_FIRST_A && c <= SMALL_LETTER_ASCII_LAST_Z) {
                int x = c - SMALL_LETTER_ASCII_FIRST_A;
                x = (x + key) % ENGLISH_ALPHABET_CAPACITY;
                if (key < 0) {
                    x = +ENGLISH_ALPHABET_CAPACITY;
                }
                chars[i] = (char) (x + SMALL_LETTER_ASCII_FIRST_A);
            } else if (c == SPACE_SYMBOL_ASCII) {
                chars[i] = (char) SPACE_SYMBOL_ASCII;
            }
        }
        return String.valueOf(chars);
    }
}
