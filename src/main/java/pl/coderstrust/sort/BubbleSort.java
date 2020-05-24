package pl.coderstrust.sort;

public class BubbleSort implements SortingMethod {

  public void sort(int[] array) {
    int arrayLength = array.length - 1;
    for (int i = arrayLength; i > 0; i--) {
      for (int j = arrayLength; j > 0; j--) {
        if (array[j] < array[j - 1]) {
          swap(array, j - 1, j);
        }
      }
    }
  }

  private static void swap(int[] array, int index1, int index2) {
    int tmpValue = array[index2];
    array[index2] = array[index1];
    array[index1] = tmpValue;
  }
}
