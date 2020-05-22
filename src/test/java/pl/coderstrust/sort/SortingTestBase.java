package pl.coderstrust.sort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public abstract class SortingTestBase {

  public abstract SortingMethod getSortingMethod();

  @Test
  public void shouldSortSimpleArray() {
    // given
    int[] given = new int[] {5, 4, 3, 2, 1};
    int[] expected = new int[] {1, 2, 3, 4, 5};
    // when
    sortAndGetTimer(given);
    // then
    assertArrayEquals(expected, given);
  }

  @Test
  public void shouldSortSortedArray() {
    // given
    int[] given = new int[] {1, 3, 7, 9, 15};
    int[] expected = new int[] {1, 3, 7, 9, 15};
    // when
    sortAndGetTimer(given);
    // then
    assertArrayEquals(expected, given);
  }

  @Test
  public void shouldSortEmptyArray() {
    // given
    int[] given = new int[] {};
    int[] expected = new int[] {};
    // when
    sortAndGetTimer(given);
    // then
    assertArrayEquals(expected, given);
  }

  @Test
  public void shouldSortArrayReverseOrder() {
    // given
    int[] given = new int[] {13, 7, 25, 789, 4};
    int[] expected = new int[] {789, 25, 13, 7, 4};
    // when
    long startTime = System.currentTimeMillis();
    sortInReverseOrder(given);
    long endTime = System.currentTimeMillis();
    System.out.println(endTime - startTime);
    // then
    assertArrayEquals(expected, given);
  }

  @ParameterizedTest
  @ValueSource(ints = {1000, 10000, 100000})
  void shouldReturnTrueForAllArraysOfTheRandomValues(int number) {
    // given
    int[] array = generateArrayWithRandomNumbers(number);
    int[] expected = array;
    Arrays.sort(expected);
    // when
    getSortingMethod().sort(array);
    // then
    assertArrayEquals(expected, array);
  }

  private static int[] generateArrayWithRandomNumbers(int number) {
    int[] randomNumbers = new int[number];
    Random randomGenerator = new Random();
    for (int i = 0; i < number; i++) {
      randomNumbers[i] = randomGenerator.nextInt(1000);
    }
    return randomNumbers;
  }

  private void sortAndGetTimer(int[] given) {
    long startTime = System.currentTimeMillis();
    getSortingMethod().sort(given);
    long endTime = System.currentTimeMillis();
    System.out.println(endTime - startTime);
  }

  private void sortInReverseOrder(int[] given) {
    getSortingMethod().sort(given);
    List<Integer> intList = new ArrayList<Integer>(given.length);
    for (int i : given) {
      intList.add(i);
    }
    intList.sort(Collections.reverseOrder());
    for (int i = 0; i < given.length; i++) {
      given[i] = intList.get(i);
    }
  }
}
