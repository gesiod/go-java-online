package ua.goit.module4;

public class TemperatureConverter {

    private static final double FAHRENHEIT_EQUIVALENT_TO_ZERO_CELSIUS = 32;
    private static final double CELSIUS_IN_ONE_FAHRENHEIT = 1.8;

    public double celsiusToFahrenheit(double celsius) {
        return (celsius * CELSIUS_IN_ONE_FAHRENHEIT) + FAHRENHEIT_EQUIVALENT_TO_ZERO_CELSIUS;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - FAHRENHEIT_EQUIVALENT_TO_ZERO_CELSIUS) / CELSIUS_IN_ONE_FAHRENHEIT;
    }
}