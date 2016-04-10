package ua.goit.module7.module5;

public class Runner {

    public static void main(String[] args) {

        int[] arr = {3, 5, 1, 20, 8, 0, -6};
        ArrayProcessing arrayProcessing = new ArrayProcessing();

        try {
            // Task 1 (Find max and min number in "arr" array)
            System.out.println("Max number: " + arrayProcessing.findMaxNumber(arr));
            System.out.println("Min number: " + arrayProcessing.findMinNumber(arr));
            // Task 2 (Sorting Algorithm)
            SortingAlgorithm sortingAlgorithm = new SortingAlgorithm();
            int[] sortedArray = sortingAlgorithm.insertionSort(arr);
            for (int num : sortedArray) System.out.print(num + " ");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}