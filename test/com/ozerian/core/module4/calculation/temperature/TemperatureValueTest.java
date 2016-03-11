package com.ozerian.core.module4.calculation.temperature;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class TemperatureValueTest {
    private static TemperatureValue temperatureValue;

    @BeforeClass
    public static void setUp() throws Exception {
        temperatureValue = new TemperatureValue();
    }

    @Test
    public void testCelsiusToFahrenheit() throws Exception {
        final double celciusValue = 35;
        final double convertedValue = celciusValue * 1.8 + 32;
        final double expectedValue = convertedValue;

        final double actualValue = temperatureValue.celsiusToFahrenheit(celciusValue);

        assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    public void testFahrenheitToCelsius() throws Exception {
        final double fahrenheitValue = 35;
        final double convertedValue = (fahrenheitValue - 32) / 1.8;
        final double expectedValue = convertedValue;

        final double actualValue = temperatureValue.fahrenheitToCelsius(fahrenheitValue);

        assertEquals(expectedValue, actualValue, 0);
    }
}