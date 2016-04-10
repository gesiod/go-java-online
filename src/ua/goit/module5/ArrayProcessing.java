package ua.goit.module5;

public class ArrayProcessing {

    public Integer findMaxNumber(int[] arr) {
        int maxNum = arr[0];
        for (int arrItem : arr) {
            if (arrItem > maxNum) {
                maxNum = arrItem;
            }
        }

        return maxNum;
    }

    public Integer findMinNumber(int[] arr) {
        int minNum = arr[0];
        for (int arrItem : arr) {
            if (arrItem < minNum) {
                minNum = arrItem;
            }
        }

        return minNum;
    }
}