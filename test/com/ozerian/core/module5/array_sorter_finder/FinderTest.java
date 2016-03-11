package com.ozerian.core.module5.array_sorter_finder;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class FinderTest {
    private static int[] numbers;

    @BeforeClass
    public static void setUp() throws Exception {
        numbers = new int[]{5, 3, 15, 72, 4, 14, 11, 12};
    }

    @Test
    public void testMinArrayValue() throws Exception {
        final int minValue = 3;
        final int expectedValue = minValue;

        final int actualValue = Finder.minArrayValue(numbers);

        assertEquals(expectedValue, actualValue);
    }



    @Test
    public void testMaxArrayValue() throws Exception {
        final int maxValue = 72;
        final int expectedValue = maxValue;

        final int actualValue = Finder.maxArrayValue(numbers);

        assertEquals(expectedValue, actualValue);
    }
}