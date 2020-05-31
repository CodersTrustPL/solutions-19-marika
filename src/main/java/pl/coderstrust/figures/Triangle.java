package pl.coderstrust.figures;

public class Triangle implements Figure {

  double base;
  double height;

  public Triangle() {
    this.base = 10;
    this.height = 15;
  }

  public Triangle(double base, double height) {
    this.base = base;
    this.height = height;
  }

  @Override
  public double calculateArea() {
    return (base * height) / 2;
  }
}
