package com.ozerian.module7.magicNumberAntiPattern;

public class TemperatureConverter {
    public static void main(String[] args) {
        TemperatureValue value = new TemperatureValue();

        value.celsiusToFahrenheit(50);
        value.fahrenheitToCelsius(40);
        value.fahrenheitToCelsius(-15);
        value.celsiusToFahrenheit(-24);
    }
}
