package ua.goit.module11.module5;

import org.junit.BeforeClass;
import org.junit.Test;
import ua.goit.module5.ArrayProcessing;

import static org.junit.Assert.assertEquals;

public class ArrayProcessingTest {

    private static ArrayProcessing arrayProcessingessing = null;

    @BeforeClass
    public static void setUp() {
        arrayProcessingessing = new ArrayProcessing();
    }

    @Test (timeout = 2000)
    public void findMaxNumber() {
        int[] arr = {3, 5, 1, 20, 8, 0, -6};
        Integer expected = 20;
        Integer result = arrayProcessingessing.findMaxNumber(arr);
        assertEquals(expected, result);
    }

    @Test (timeout = 2000)
    public void findMinNumber() {
        int[] arr = {3, 5, 1, 20, 8, 0, -6};
        Integer expected = -6;
        Integer result = arrayProcessingessing.findMinNumber(arr);
        assertEquals(expected, result);
    }
}