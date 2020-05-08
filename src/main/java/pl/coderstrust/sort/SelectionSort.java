package pl.coderstrust.sort;

import static pl.coderstrust.sort.Helper.swap;

public class SelectionSort {

  public static int[] sort(int[] array) {
    int arrayLength = array.length;
    for (int i = 0; i < arrayLength - 1; i++) {
      int indexOfMinimalElementInArrayRange = findIndexOfMinimalElementInArrayRange(array, arrayLength, i);
      swap(array, i, indexOfMinimalElementInArrayRange);
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
