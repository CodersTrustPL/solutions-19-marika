package pl.coderstrust.sort;

import static pl.coderstrust.sort.Helper.swap;

import java.util.Arrays;

public class BubbleSort {

  public static void main(String[] args) {
    int[] array = {10, 2, 30, 100, 50, 6, 71, 80, 9, 91};
    System.out.println(Arrays.toString(sort(array)));
  }

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
