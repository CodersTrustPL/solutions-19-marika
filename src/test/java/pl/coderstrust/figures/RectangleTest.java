package pl.coderstrust.figures;

class RectangleTest extends FigureTest {

  @Override
  public Figure getFigure() {
    return new Rectangle(10, 12);
  }

  @Override
  public double getExpected() {
    return 120;
  }
}
