package pl.coderstrust.figures;

public class Circle implements Figure {

  private double side;
  private double pi = Math.PI;

  public Circle(double side) {
    this.side = side;
  }

  @Override
  public double calculateArea() {
    return pi * side * side;
  }
}
