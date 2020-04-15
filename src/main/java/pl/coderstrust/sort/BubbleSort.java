package pl.coderstrust.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] data = {10, 2, 30, 100, 50, 6, 71, 80, 9, 91};
        System.out.println(Arrays.toString(sortArray(data)));
    }

    public static int[] sortArray(int[] array) {
        int[] sortedArray = array;
        return sort(sortedArray);
    }

    private static int[] sort(int[] sortedArray) {
        for (int i = sortedArray.length - 1; i > 0; i--) {
            for (int j = sortedArray.length - 1; j > 0; j--) {
                if (sortedArray[j] < sortedArray[j - 1]) {
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j - 1];
                    sortedArray[j - 1] = temp;
                }
            }
        }
        return sortedArray;
    }
}
