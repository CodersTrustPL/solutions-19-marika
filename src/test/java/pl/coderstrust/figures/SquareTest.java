package pl.coderstrust.figures;

class SquareTest extends FigureTest {

  @Override
  public Figure getFigure() {
    return new Square(10);
  }

  @Override
  public double getExpected() {
    return 100;
  }
}
