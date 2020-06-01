package pl.coderstrust.figures;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CircleTest extends FigureTest {

  @Override
  public Figure getFigure() {
    return new Circle(5);
  }

  @Test
  void shouldCheckIfMethodReturnsCorrectValue() {
    // given
    double side = 10;
    double expected = 314.1592653589793;
    Circle circle = new Circle(side);

    // when
    double area = circle.calculateArea();

    // then
    assertEquals(expected, area);
  }
}
