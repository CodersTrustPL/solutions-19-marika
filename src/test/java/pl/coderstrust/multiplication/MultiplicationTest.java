package pl.coderstrust.multiplication;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static pl.coderstrust.multiplication.Multiplication.createMultiplicationArray;
import static pl.coderstrust.multiplication.Multiplication.printMultiplicationTable;


import org.junit.jupiter.api.Test;

class MultiplicationTest {

  @Test
  public void shouldCheckIfAllValuesAreCorrectWhenTheSizeIsTwo() {
    //given
    int size = 2;
    int[][] expected = {
        {0, 1, 2},
        {1, 1, 2},
        {2, 2, 4}
    };

    //when
    int[][] result = createMultiplicationArray(size);

    //then
    assertArrayEquals(expected, result);
  }

  @Test
  public void shouldCheckIfAllValuesAreCorrectWhenTheSizeIsFive() {
    //given
    int size = 5;
    int[][] expected = {
        {0, 1, 2, 3, 4, 5},
        {1, 1, 2, 3, 4, 5},
        {2, 2, 4, 6, 8, 10},
        {3, 3, 6, 9, 12, 15},
        {4, 4, 8, 12, 16, 20},
        {5, 5, 10, 15, 20, 25}
    };

    //when
    int[][] result = createMultiplicationArray(size);

    //then
    assertArrayEquals(expected, result);
  }

  @Test
  public void shouldCheckIfAllValuesAreCorrectWhenTheSizeIsTen() {
    //given
    int size = 10;
    int[][] expected = {
        {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
        {1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
        {2, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20},
        {3, 3, 6, 9, 12, 15, 18, 21, 24, 27, 30},
        {4, 4, 8, 12, 16, 20, 24, 28, 32, 36, 40},
        {5, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50},
        {6, 6, 12, 18, 24, 30, 36, 42, 48, 54, 60},
        {7, 7, 14, 21, 28, 35, 42, 49, 56, 63, 70},
        {8, 8, 16, 24, 32, 40, 48, 56, 64, 72, 80},
        {9, 9, 18, 27, 36, 45, 54, 63, 72, 81, 90},
        {10, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100}
    };

    //when
    int[][] result = createMultiplicationArray(size);

    //then
    assertArrayEquals(expected, result);
  }

  @Test
  public void shouldCheckIfRandomValueIsCorrect() {
    //given
    int size = 5;
    int expected = 25;

    //when
    int result = createMultiplicationArray(size)[5][5];

    //then
    assertEquals(expected, result);
  }

  @Test
  public void shouldCheckTfThrowExceptionIfSizeIsSmallerThanOne() {
    //given
    int size = -1;
    int[][] multiplicationTable = {{}, {}};
    String expected = "The value must be greater than 0!";

    //when
    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
      printMultiplicationTable(size, multiplicationTable);
    });

    //then
    String result = exception.getMessage();
    assertTrue(result.contains(expected));
  }
}
