package pl.coderstrust.figures;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RectangleTest extends FigureTest {

  @Override
  public Figure getFigure() {
    return new Rectangle(10, 12);
  }

  @Test
  void shouldCheckIfMethodReturnsCorrectValue() {
    // given
    double length = 15;
    double width = 10;
    double expected = 150;
    Rectangle rectangle = new Rectangle(length, width);

    // when
    double area = rectangle.calculateArea();

    // then
    assertEquals(expected, area);
  }
}
