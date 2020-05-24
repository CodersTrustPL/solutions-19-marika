package pl.coderstrust.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSort implements SortingMethod {

  public void sort(int[] array) {
    List<Integer> intList = new ArrayList<>();
    for (int i : array) {
      intList.add(i);
    }
    Collections.sort(intList);
    for (int i = 0; i < array.length; i++) {
      array[i] = intList.get(i);
    }
  }
}
