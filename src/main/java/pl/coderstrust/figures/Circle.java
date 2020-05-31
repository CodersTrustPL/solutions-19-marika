package pl.coderstrust.figures;

public class Circle implements Figure {

  double side = 10;

  @Override
  public double calculateArea() {
    return side * side;
  }
}
