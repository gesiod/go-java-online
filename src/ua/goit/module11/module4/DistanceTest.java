package ua.goit.module11.module4;

import org.junit.Test;
import ua.goit.module4.Distance;

import static org.junit.Assert.assertEquals;

public class DistanceTest {

    @Test (timeout = 2000)
    public void distanceBetweenTwoSpots() throws Exception {
        double x1 = 5;
        double y1 = 5;
        double x2 = 10;
        double y2 = 10;
        double expected = 7.07;
        double result = new Distance().distanceBetweenTwoSpots(x1, y1, x2, y2);
        double delta = 2;
        assertEquals(expected, result, delta);
    }
}