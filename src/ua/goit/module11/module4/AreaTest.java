package ua.goit.module11.module4;

import org.junit.BeforeClass;
import org.junit.Test;
import ua.goit.module4.Area;

import static org.junit.Assert.assertEquals;

public class AreaTest {

    private static Area area = null;
    private static final double DELTA = 1;

    @BeforeClass
    public static void setUp() throws Exception {
        area = new Area();
    }

    @Test (timeout = 2000)
    public void triangleArea() throws Exception {
        int sideA = 5;
        int sideB = 5;
        int sideC = 5;
        double expected = 7.48;
        double result = area.triangleArea(sideA, sideB, sideC);
        assertEquals(expected, result, DELTA);
    }

    @Test (timeout = 2000)
    public void rectangleArea() throws Exception {
        int sideA = 5;
        int sideB = 10;
        double expected = 50;
        double result = area.rectangleArea(sideA, sideB);
        assertEquals(expected, result, DELTA);
    }

    @Test (timeout = 2000)
    public void circleArea() throws Exception {
        int radius = 5;
        double expected = 78.53;
        double result = area.circleArea(radius);
        assertEquals(expected, result, DELTA);
    }
}