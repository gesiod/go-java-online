package ua.goit.module11.module5;

import org.junit.Test;
import ua.goit.module5.SortingAlgorithm;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SortingAlgorithmTest {

    @Test (timeout = 2000)
    public void insertionSort() {
        SortingAlgorithm sortingAlgorithm = new SortingAlgorithm();
        int[] arr = {3, 5, 1, 20, 8, 0, -6};
        String expected = "[-6, 0, 1, 3, 5, 8, 20]";
        String result = Arrays.toString(sortingAlgorithm.insertionSort(arr));
        assertEquals(expected, result);
    }
}