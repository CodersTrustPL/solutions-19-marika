package pl.coderstrust.figures;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TriangleTest extends FigureTest {

  @Override
  public Figure getFigure() {
    return new Triangle();
  }

  @Test
  void shouldCheckIfMethodReturnsCorrectValue() {
    // given
    double base = 15;
    double height = 10;
    double expected = 75;
    Triangle triangle = new Triangle(base, height);

    // when
    double area = triangle.calculateArea();

    // then
    assertEquals(expected, area);
  }
}
