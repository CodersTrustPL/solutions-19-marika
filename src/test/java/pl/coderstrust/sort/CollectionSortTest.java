package pl.coderstrust.sort;

import static org.junit.jupiter.api.Assertions.*;

class CollectionSortTest extends SortingTestBase {

  public SortingMethod getSortingMethod() {
    return new CollectionSort();
  }
}
