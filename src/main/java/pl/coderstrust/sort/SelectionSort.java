package pl.coderstrust.sort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] data = {10, 2, 30, 100, 50, 6, 71, 80, 9, 91};
        System.out.println(Arrays.toString(sort(data)));
    }

    public static int[] sort(int[] array) {
        int[] sortedArray = array;
        for (int i = 1; i < sortedArray.length; i++) {
            int j, temp;
            temp = sortedArray[i];
            j = i - 1;
            while (j >= 0 && sortedArray[j] > temp) {
                sortedArray[j + 1] = sortedArray[j];
                j = j - 1;
            }
            sortedArray[j + 1] = temp;
        }
        return sortedArray;
    }
}
