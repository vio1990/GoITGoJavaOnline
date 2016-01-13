package com.ozerian.module4.calculation.temperature;

public class TemperatureConverter {
    public static void main(String[] args) {
        TemperatureValue value = new TemperatureValue();

        value.celsiusToFahrenheit(50);
        value.fahrenheitToCelsius(40);
        value.fahrenheitToCelsius(-15);
        value.celsiusToFahrenheit(-20);
    }
}
