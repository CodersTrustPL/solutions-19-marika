package pl.coderstrust.sort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static pl.coderstrust.sort.SelectionSort.sort;

import org.junit.jupiter.api.Test;

class SelectionSortTest {

  @Test
  public void shouldCheckIfResultIsCorrect() {
    // given
    int[] array = {10, 2, 30, 100, 50, 6, 71, 80, 9, 91};
    int[] expected = {2, 6, 9, 10, 30, 50, 71, 80, 91, 100};

    // when
    int[] result = sort(array);

    // then
    assertArrayEquals(expected, result);
  }

  @Test
  public void shouldCheckIfResultIsCorrectWithOtherArray() {
    // given
    int[] array = {100, 12, 70, 99, 53, 13, 11};
    int[] expected = {11, 12, 13, 53, 70, 99, 100};

    // when
    int[] result = sort(array);

    // then
    assertArrayEquals(expected, result);
  }

  @Test
  public void shouldCheckIfResultIsCorrectWithOtherArray2() {
    // given
    int[] array = {258, 1, 78, 7895, 12, 1};
    int[] expected = {1, 1, 12, 78, 258, 7895};

    // when
    int[] result = sort(array);

    // then
    assertArrayEquals(expected, result);
  }

  @Test
  public void shouldReturnEmptyArrayWhenGivenEmptyArray() {
    // given
    int[] array = {};
    int[] expected = {};

    // when
    int[] result = sort(array);

    // then
    assertArrayEquals(expected, result);
  }
}
