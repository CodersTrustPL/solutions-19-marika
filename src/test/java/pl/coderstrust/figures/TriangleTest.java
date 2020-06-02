package pl.coderstrust.figures;

class TriangleTest extends FigureTest {

  @Override
  public Figure getFigure() {
    return new Triangle(15, 10);
  }

  @Override
  public double getExpected() {
    return 75;
  }
}
