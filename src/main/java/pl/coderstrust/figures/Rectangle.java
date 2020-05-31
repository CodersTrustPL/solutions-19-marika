package pl.coderstrust.figures;

public class Rectangle implements Figure {

  double length = 10;
  double width = 5;

  @Override
  public double calculateArea() {
    return length * width;
  }
}
