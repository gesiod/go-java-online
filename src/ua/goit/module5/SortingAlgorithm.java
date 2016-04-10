package ua.goit.module5;

public class SortingAlgorithm {

    public int[] insertionSort(int[] arr) {
        int i, j, temp;
        for (i = 1; i < arr.length; i++){
            for (j = i; j > 0 && arr[j-1] > arr[j]; j--){
                temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }

        return arr;
    }
}