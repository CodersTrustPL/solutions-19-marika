package pl.coderstrust.figures;

public class Triangle implements Figure {

  double b = 10;
  double h = 15;

  @Override
  public double calculateArea() {
    return (b * h) / 2;
  }
}
