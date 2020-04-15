package pl.coderstrust.sort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] data = {10, 2, 30, 100, 50, 6, 71, 80, 9, 91};
        System.out.println(Arrays.toString(sort(data)));
    }

    public static int[] sort(int[] array) {
        int[] sortedArray = array;
        findIndexOfMinimalElementInArrayRange(sortedArray);
        return sortedArray;
    }

    private static void findIndexOfMinimalElementInArrayRange(int[] sortedArray) {
        for (int i = 0; i < sortedArray.length - 1; i++) {
            int temp = i;
            for (int j = i + 1; j < sortedArray.length; j++) {
                if (sortedArray[j] < sortedArray[temp]) {
                    temp = j;
                }
            }
            swap(sortedArray, temp, i);
        }
    }

    private static void swap(int[] sortedArray, int temp, int i) {
        int smallerElement = sortedArray[temp];
        sortedArray[temp] = sortedArray[i];
        sortedArray[i] = smallerElement;
    }
}
