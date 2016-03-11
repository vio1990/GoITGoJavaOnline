package com.ozerian.core.module5.array_sorter_finder;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SorterTest {
    private static int[] numbers;

    @BeforeClass
    public static void setUp() throws Exception {
        numbers = new int[]{9, 5, 3, 6, 7, 2, 1, 4, 8, 10};
    }

    @Test
    public void testBubbleSort() throws Exception {
        int[] expectedArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] actualArray = Sorter.bubbleSort(numbers);

        assertArrayEquals(expectedArray,actualArray);
    }

    @Test
    public void testGnomeSort() throws Exception {
        int[] expectedArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] actualArray = Sorter.gnomeSort(numbers);

        assertArrayEquals(expectedArray,actualArray);
    }
}