package ua.goit.module7.module4;

import java.util.HashMap;
import java.util.Map;

public class Area {

    // Triangle area
    public double triangleArea(int sideA, int sideB, int sideC) {

        // Save sides to hashMap
        HashMap<String, Integer> sides = new HashMap();
        sides.put("Side A", sideA);
        sides.put("Side B", sideB);
        sides.put("Side C", sideC);

        // Check sides
        for (Map.Entry<String, Integer> side : sides.entrySet()) {
            if (side.getValue() == 0) {
                throw new IllegalArgumentException("[Error]: " + side.getKey() + " can not be 0!");
            }
            if (side.getValue() < 0) {
                throw new IllegalArgumentException("[Error]: " + side.getKey() + " can not be a negative number!");
            }
        }

        double semiPerimeter = (sideA + sideB + sideC) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
    }

    // Rectangle area
    public double rectangleArea(int sideA, int sideB) {
        if (sideA <= 0 || sideB <= 0) {
            throw new IllegalArgumentException("[Error]: Side A or B can not be 0 or a negative number!");
        }

        return sideA * sideB;
    }

    // Circle area
    public double circleArea(int radius) throws NegativeAgeException, ZeroAgeException {
        if (radius < 0) {
            throw new NegativeAgeException("[Error]: Entered radius: " + radius + ". Radius can not be negative.");
        }
        if (radius == 0) {
            throw new ZeroAgeException("[Error]: Entered radius: " + radius + ". Radius can not be 0.");
        }

        return Math.PI * Math.pow(radius, 2);
    }
}