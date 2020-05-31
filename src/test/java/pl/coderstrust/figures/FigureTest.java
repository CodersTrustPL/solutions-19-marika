package pl.coderstrust.figures;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;

import org.junit.jupiter.api.Test;

public abstract class FigureTest {

  public abstract Figure getFigure();

  @Test
  void shouldCheckIfMethodReturnsSomething() {
    double area = getFigure().calculateArea();
    assertNotNull(area);
  }

  @Test
  void shouldCheckIfMethodNotReturnsZero() {
    double area = getFigure().calculateArea();
    double expected = 0;
    assertNotSame(area, expected);
  }
}
