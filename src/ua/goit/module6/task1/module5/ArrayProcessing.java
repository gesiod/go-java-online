package ua.goit.module6.task1.module5;

public class ArrayProcessing {

    public Integer findMaxNumber(int[] arr) {
        if (arr.length == 0) throw new IllegalArgumentException("[Error]: Array can not be empty.");
        int maxNum = arr[0];
        for (int arrItem : arr) {
            if (arrItem > maxNum) {
                maxNum = arrItem;
            }
        }

        return maxNum;
    }

    public Integer findMinNumber(int[] arr) {
        if (arr.length == 0) throw new IllegalArgumentException("[Error]: Array can not be empty.");
        int minNum = arr[0];
        for (int arrItem : arr) {
            if (arrItem < minNum) {
                minNum = arrItem;
            }
        }

        return minNum;
    }
}