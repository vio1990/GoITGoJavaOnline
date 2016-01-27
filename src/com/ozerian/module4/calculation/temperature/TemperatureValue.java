package com.ozerian.module4.calculation.temperature;

public class TemperatureValue {

    public double celsiusToFahrenheit(double temperatureValue) {
        double convertedFahrenheitValue = (temperatureValue * 1.8) + 32;
        return convertedFahrenheitValue;
    }

    public double fahrenheitToCelsius(double temperatureValue) {
        double convertedCelsiusValue = (temperatureValue - 32) / 1.8;
        return convertedCelsiusValue;
    }

}

