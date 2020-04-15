package pl.coderstrust.sort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {10, 2, 30, 100, 50, 6, 71, 80, 9, 91};
        System.out.println(Arrays.toString(sort(array)));
    }

    public static int[] sort(int[] array) {
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength - 1; i++) {
            int indexOfMinimalElementInArrayRange = findIndexOfMinimalElementInArrayRange(array, arrayLength, i);
            Helper.swap(array, i, indexOfMinimalElementInArrayRange);
        }
        return array;
    }

    private static int findIndexOfMinimalElementInArrayRange(int[] sortedArray, int arrayLength, int indexOfFirstElementInArrayRange) {
        int indexOfMinimalElementInArrayRange = indexOfFirstElementInArrayRange;
        for (int i = indexOfFirstElementInArrayRange + 1; i < arrayLength; i++) {
            if (sortedArray[i] < sortedArray[indexOfMinimalElementInArrayRange]) {
                indexOfMinimalElementInArrayRange = i;
            }
        }
        return indexOfMinimalElementInArrayRange;
    }
}
