package ua.goit.module6.task1.module4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Area area = new Area();
        Scanner scanner = new Scanner(System.in);

        try {
            // Area calculations
            System.out.println("\n <Area calculations>");
            // Triangle area
            double triangleArea = area.triangleArea(5, 5, 5);
            System.out.println("Triangle area: " + triangleArea);
            // Rectangle area
            double rectangleArea = area.rectangleArea(5, 5);
            System.out.println("Rectangle area: " + rectangleArea);
            // Circle area
            System.out.println("Enter circleArea radius: ");
            String userInput = scanner.nextLine();
            Integer radius = Integer.parseInt(userInput);
            double circleArea = area.circleArea(radius);
            System.out.println("Circle area: " + circleArea);

            // Temperature converter
            System.out.println("\n <Temperature calculation>");
            TemperatureConverter tempConverter = new TemperatureConverter();
            System.out.println("Enter celsius: ");
            int temperature = scanner.nextInt();
            double tempInFahrenheit = tempConverter.celsiusToFahrenheit(temperature);
            System.out.println("In fahrenheits: " + tempInFahrenheit);
            System.out.println("Enter fahrenheits: ");
            temperature = scanner.nextInt();
            double tempInCelsius = tempConverter.fahrenheitToCelsius(temperature);
            System.out.println("In celsius: " + tempInCelsius);
        } catch (NegativeAgeException e) {
            System.out.println(e.getMessage());
        } catch (ZeroAgeException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Distance

        System.out.println("\n <Distance calculation>");
        Distance distance = new Distance();
        double distanceBetweenTwoSpots = distance.distanceBetweenTwoSpots(5, 5, 10, 10);
        System.out.println("Distance between spots: " + distanceBetweenTwoSpots);
    }
}