package pl.coderstrust.sort;

import static pl.coderstrust.sort.Helper.swap;

public class BubbleSort {

  public static int[] sort(int[] array) {
    int arrayLength = array.length - 1;
    for (int i = arrayLength; i > 0; i--) {
      for (int j = arrayLength; j > 0; j--) {
        if (array[j] < array[j - 1]) {
          swap(array, j - 1, j);
        }
      }
    }
    return array;
  }
}
