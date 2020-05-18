package pl.coderstrust.sort;

public class Helper {

  public static void swap(int[] array, int index1, int index2) {
    int tmpValue = array[index2];
    array[index2] = array[index1];
    array[index1] = tmpValue;
  }
}
