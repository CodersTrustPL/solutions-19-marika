package pl.coderstrust.pascal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static pl.coderstrust.pascal.PascalTriangle.createPascalTriangle;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class PascalTriangleTest {

  @Test
  public void shouldCreatePascalTriangleWhenHeightIsTwo() {
    // given
    int height = 2;
    String expected = Arrays.asList(
        "       1",
        "     1   1"
    ).toString();

    // when
    String result = createPascalTriangle(height).toString();

    // then
    assertEquals(result, expected);
  }

  @Test
  public void shouldCreatePascalTriangleWhenHeightIsFive() {
    // given
    int height = 5;
    String expected = Arrays.asList(
        "             1",
        "           1   1",
        "         1   2   1",
        "       1   3   3   1",
        "     1   4   6   4   1"
    ).toString();

    // when
    String result = createPascalTriangle(height).toString();

    // then
    assertEquals(result, expected);
  }

  @Test
  public void shouldCreatePascalTriangleWhenHeightIsTen() {
    // given
    int height = 10;
    String expected = Arrays.asList(
        "                       1",
        "                     1   1",
        "                   1   2   1",
        "                 1   3   3   1",
        "               1   4   6   4   1",
        "             1   5  10  10   5   1",
        "           1   6  15  20  15   6   1",
        "         1   7  21  35  35  21   7   1",
        "       1   8  28  56  70  56  28   8   1",
        "     1   9  36  84 126 126  84  36   9   1"
    ).toString();

    // when
    String result = createPascalTriangle(height).toString();

    // then
    assertEquals(result, expected);
  }

  @Test
  public void shouldCheckTfThrowExceptionWhenHeightIsSmallerThanOne() {
    // given
    int height = -1;
    String expected = "The value must be greater than 0!";

    // when
    Exception exception = assertThrows(IllegalArgumentException.class,
        () -> createPascalTriangle(height));

    // then
    String result = exception.getMessage();
    assertTrue(result.contains(expected));
  }
}
