package pl.coderstrust.figures;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SquareTest extends FigureTest {

  @Override
  public Figure getFigure() {
    return new Square(10);
  }

  @Test
  void shouldCheckIfMethodReturnsCorrectValue() {
    // given
    double width = 10;
    double expected = 100;
    Square square = new Square(width);

    // when
    double area = square.calculateArea();

    // then
    assertEquals(expected, area);
  }
}
