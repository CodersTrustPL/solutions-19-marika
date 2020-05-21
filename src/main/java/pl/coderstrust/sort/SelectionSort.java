package pl.coderstrust.sort;

public class SelectionSort implements SortingMethod {

  public void sort(int[] array) {
    int arrayLength = array.length;
    for (int i = 0; i < arrayLength - 1; i++) {
      int indexOfMinimalElementInArrayRange = findIndexOfMinimalElementInArrayRange(array, arrayLength, i);
      swap(array, i, indexOfMinimalElementInArrayRange);
    }
  }

  public static void swap(int[] array, int index1, int index2) {
    int tmpValue = array[index2];
    array[index2] = array[index1];
    array[index1] = tmpValue;
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
