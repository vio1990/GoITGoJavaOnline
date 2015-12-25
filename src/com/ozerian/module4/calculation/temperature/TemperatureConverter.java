package com.ozerian.module4.calculation.temperature;

public class TemperatureConverter {
    public static void main(String[] args) {
        TemperatureValue value = new TemperatureValue();

        value.celciusToFahrenheit(50);
        value.fahrenheitToCelcius(40);
        value.fahrenheitToCelcius(-15);
        value.celciusToFahrenheit(-20);
    }
}
