package pl.coderstrust.figures;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public abstract class FigureTest {

  public abstract Figure getFigure();

  public abstract double getExpected();

  @Test
  void shouldCheckIfMethodReturnsCorrectValue() {
    // given
    double expected = getExpected();

    // when
    double area = getFigure().calculateArea();

    // then
    assertEquals(area, expected);
  }
}
