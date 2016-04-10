package ua.goit.module5;

public class Main {

    public static void main(String[] args) {

        int[] arr = {3, 5, 1, 20, 8, 0, -6};

        // Task 1
        ArrayProcessing arrayProcessing = new ArrayProcessing();
        Integer maxNumber = arrayProcessing.findMaxNumber(arr);
        Integer minNumber = arrayProcessing.findMinNumber(arr);
        System.out.println("Max number: " + maxNumber + ", Min number: " + minNumber);

        // Task 2
        SortingAlgorithm sortingAlgorithm = new SortingAlgorithm();
        int[] sortedArray = sortingAlgorithm.insertionSort(arr);
        for (int num : sortedArray) System.out.print(num + " ");
    }
}