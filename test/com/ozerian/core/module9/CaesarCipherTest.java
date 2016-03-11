package com.ozerian.core.module9;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CaesarCipherTest {
    String text;

    @Before
    public void setUp() throws Exception {
        text = "ABCDefg";
    }

    @Test
    public void testCaesarEncode() throws Exception {
        final int key = 1;
        final String expectedString = "BCDEfgh";
        final char[] expectedChar = expectedString.toCharArray();
        final String actualString = CaesarCipher.caesarEncode(text, 1);
        final char[] actualChar = actualString.toCharArray();
        assertArrayEquals(expectedChar, actualChar);
    }

    @Test
    public void testCaesarDecode() throws Exception {
        final int key = 1;
        final String expectedString = "ZABCdef";
        final char[] expectedChar = expectedString.toCharArray();
        final String actualString = CaesarCipher.caesarDecode(text, 1);
        final char[] actualChar = actualString.toCharArray();
        assertArrayEquals(expectedChar, actualChar);
    }
}