package ua.goit.module11.module4;

import org.junit.BeforeClass;
import org.junit.Test;
import ua.goit.module4.TemperatureConverter;

import static org.junit.Assert.assertEquals;

public class TemperatureConverterTest {

    private static TemperatureConverter temperatureConverter = null;
    private static final double DELTA = 1;

    @BeforeClass
    public static void setUp() {
        temperatureConverter = new TemperatureConverter();
    }

    @Test(timeout = 2000)
    public void celsiusToFahrenheit() {
        double celsius = 100;
        double expected = 212.0;
        double result = temperatureConverter.celsiusToFahrenheit(celsius);
        assertEquals(expected, result, DELTA);
    }

    @Test(timeout = 2000)
    public void fahrenheitToCelsius() {
        double fahrenheit = 100;
        double expected = 37.77;
        double result = temperatureConverter.fahrenheitToCelsius(fahrenheit);
        assertEquals(expected, result, DELTA);
    }
}