package com.ozerian.core.module4.calculation.temperature;

public class TemperatureConverter {
    public static void main(String[] args) {
        TemperatureValue value = new TemperatureValue();

        System.out.printf("%.2f oC equals: %.2f oF\n", 50.0, value.celsiusToFahrenheit(50));
        System.out.printf("%.2f oF equals: %.2f oC\n", 30.0, value.fahrenheitToCelsius(30));
    }
}
