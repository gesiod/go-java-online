package ua.goit.module4;

public class Area {

    public double triangleArea(int sideA, int sideB, int sideC) {
        double semiperimeter = (sideA + sideB + sideC) / 2;
        return Math.sqrt(semiperimeter * (semiperimeter - sideA) * (semiperimeter - sideB) * (semiperimeter - sideC));
    }

    public double rectangleArea(int sideA, int sideB) {
        return sideA * sideB;
    }

    public double circleArea(int radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}