package ua.goit.module6.task1.module4;

public class Distance {

    public double distanceBetweenTwoSpots(double x1, double y1, double x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}