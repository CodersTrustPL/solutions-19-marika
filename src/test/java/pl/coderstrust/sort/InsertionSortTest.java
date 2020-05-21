package pl.coderstrust.sort;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest extends SortingTestBase {

  public SortingMethod getSortingMethod() {
    return new InsertionSort();
  }
}
