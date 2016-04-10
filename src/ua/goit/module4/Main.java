package ua.goit.module4;

public class Main {

    public static void main(String[] args) {

        Area area = new Area();
        System.out.println(area.triangleArea(5, 5, 5));
        System.out.println(area.rectangleArea(5, 10));
        System.out.println(area.circleArea(5));

        TemperatureConverter tempConverter = new TemperatureConverter();
        System.out.println(tempConverter.celsiusToFahrenheit(100));
        System.out.println(tempConverter.fahrenheitToCelsius(100));

        Distance distance = new Distance();
        System.out.println(distance.distanceBetweenTwoSpots(5, 5, 10, 10));
    }
}