package pl.coderstrust.figures;

class CircleTest extends FigureTest {

  @Override
  public Figure getFigure() {
    return new Circle(10);
  }

  @Override
  public double getExpected() {
    return 314.1592653589793;
  }
}
