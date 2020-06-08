package pl.coderstrust.figures;

class TrapezoidTest extends FigureTest {

  @Override
  public Figure getFigure() {
    return new Trapezoid(10, 12, 5);
  }

  @Override
  public double getExpected() {
    return 55;
  }
}
