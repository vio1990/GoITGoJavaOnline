package com.ozerian.core.module7.magicNumberAntiPattern;

public class TemperatureValue {

    /*
    The last version of this mini-program had "Magic numbers" anti-pattern.
    The numbers was designated as a constants with corresponding names.
     */
    public static final double CONVERTER_COEFFICIENT = 1.8;
    public static final int TEMPERATURE_DIFFERENCE = 32;

    public void celsiusToFahrenheit(double temperatureValue) {
        double convertedFahrenheitValue = (temperatureValue * CONVERTER_COEFFICIENT) + TEMPERATURE_DIFFERENCE;
        System.out.printf("%.2f oC equals: %.2f oF\n", temperatureValue, convertedFahrenheitValue);
    }

    public void fahrenheitToCelsius(double temperatureValue) {
        double convertedCelsiusValue = (temperatureValue - TEMPERATURE_DIFFERENCE) / CONVERTER_COEFFICIENT;
        System.out.printf("%.2f oF equals: %.2f oC\n", temperatureValue, convertedCelsiusValue);
    }

}


