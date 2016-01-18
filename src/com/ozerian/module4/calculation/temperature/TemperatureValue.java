package com.ozerian.module4.calculation.temperature;

public class TemperatureValue {

    public void celsiusToFahrenheit(double temperatureValue) {
        double convertedFahrenheitValue = (temperatureValue * 1.8) + 32;
        System.out.printf("%.2f oC equals: %.2f oF\n", temperatureValue, convertedFahrenheitValue);
    }

    public void fahrenheitToCelsius(double temperatureValue) {
        double convertedCelsiusValue = (temperatureValue - 32) / 1.8;
        System.out.printf("%.2f oF equals: %.2f oC\n", temperatureValue, convertedCelsiusValue);
    }

}

