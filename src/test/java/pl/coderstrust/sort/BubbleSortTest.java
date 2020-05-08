package pl.coderstrust.sort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static pl.coderstrust.sort.BubbleSort.sort;

import org.junit.jupiter.api.Test;

class BubbleSortTest {

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
  public void shouldCheckIfResultIsCorrectWithOtherArray1() {
    // given
    int[] array = {3, 17, 789, 32, 147};
    int[] expected = {3, 17, 32, 147, 789};

    // when
    int[] result = sort(array);

    // then
    assertArrayEquals(expected, result);
  }

  @Test
  public void shouldCheckIfResultIsCorrectWithOtherArray2() {
    // given
    int[] array = {278, 11, 96, 3};
    int[] expected = {3, 11, 96, 278};

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
