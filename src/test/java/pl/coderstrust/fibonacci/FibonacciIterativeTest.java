package pl.coderstrust.fibonacci;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static pl.coderstrust.fibonacci.FibonacciIterative.fibonacci;


import org.junit.jupiter.api.Test;

class FibonacciIterativeTest {

  @Test
  public void shouldCheckIfExceptionHasBeenThrown() {
    // given
    int number = -1;
    String expected = "Fibonacci number in order cannot be zero or lower than zero. Provided value was: " + number;

    // when
    Exception exception = assertThrows(
        IllegalArgumentException.class, () ->
            fibonacci(number));

    // then
    String result = exception.getMessage();
    assertTrue(result.contains(expected));
  }

  @Test
  public void shouldCheckIfValueIsCorrectWhenNumberIsOne() {
    // given
    int number = 1;
    long expected = 1;

    // when
    long result = fibonacci(number);

    // then
    assertEquals(expected, result);
  }

  @Test
  public void shouldCheckIfValueIsCorrectWhenNumberIsTen() {
    // given
    int number = 10;
    long expected = 55;

    // when
    long result = fibonacci(number);

    // then
    assertEquals(expected, result);
  }
}
