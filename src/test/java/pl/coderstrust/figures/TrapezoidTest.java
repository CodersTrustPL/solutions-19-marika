package pl.coderstrust.figures;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TrapezoidTest extends FigureTest {

  @Override
  public Figure getFigure() {
    return new Trapezoid();
  }

  @Test
  void shouldCheckIfMethodReturnsCorrectValue() {
    // given
    double base1 = 10;
    double base2 = 12;
    double height = 5;
    double expected = 55;
    Trapezoid trapezoid = new Trapezoid(base1, base2, height);

    // when
    double area = trapezoid.calculateArea();

    // then
    assertEquals(expected, area);
  }
}
