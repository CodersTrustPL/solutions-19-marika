package pl.coderstrust.figures;

public class Triangle implements Figure {

  double b = 10;
  double h = 15;

  public Triangle() {
    this.b = 10;
    this.h = 15;
  }

  public Triangle(double b, double h) {
    this.b = b;
    this.h = h;
  }

  @Override
  public double calculateArea() {
    return (b * h) / 2;
  }
}
