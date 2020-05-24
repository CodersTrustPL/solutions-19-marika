package pl.coderstrust.sieve;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static pl.coderstrust.sieve.SieveOfEratosthenes.sieve;

import org.junit.jupiter.api.Test;

class SieveOfEratosthenesTest {

  @Test
  public void shouldCheckIfAllValuesAreCorrectWhenMaximumNumberIsFive() {
    // given
    int maximumNumber = 5;
    int[] expected = {1, 2, 3};

    // when
    int[] result = sieve(maximumNumber);

    // then
    assertArrayEquals(expected, result);
  }

  @Test
  public void shouldCheckIfAllValuesAreCorrectWhenMaximumNumberIsTen() {
    // given
    int maximumNumber = 10;
    int[] expected = {1, 2, 3, 5, 7};

    // when
    int[] result = sieve(maximumNumber);

    // then
    assertArrayEquals(expected, result);
  }

  @Test
  public void shouldCheckIfAllValuesAreCorrectWhenMaximumNumberIsHundred() {
    // given
    int maximumNumber = 100;
    int[] expected = {1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

    // when
    int[] result = sieve(maximumNumber);

    // then
    assertArrayEquals(expected, result);
  }

  @Test
  public void shouldCheckIfReturnEmptyListWhenMaximumNumberIsZero() {
    // given
    int maximumNumber = 0;
    int[] expected = {};

    // when
    int[] result = sieve(maximumNumber);

    // then
    assertArrayEquals(expected, result);
  }

}
