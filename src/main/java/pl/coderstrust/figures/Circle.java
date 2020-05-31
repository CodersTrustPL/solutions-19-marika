package pl.coderstrust.figures;

public class Circle implements Figure {

  double side;
  double pi = 3.14;

  public Circle() {
    this.side = 10;
  }

  public Circle(double side) {
    this.side = side;
  }

  @Override
  public double calculateArea() {
    return pi * side * side;
  }
}
