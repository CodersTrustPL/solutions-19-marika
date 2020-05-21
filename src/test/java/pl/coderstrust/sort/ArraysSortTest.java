package pl.coderstrust.sort;

import static org.junit.jupiter.api.Assertions.*;

class ArraysSortTest extends SortingTestBase {

  public SortingMethod getSortingMethod() {
    return new ArraysSort();
  }
}
