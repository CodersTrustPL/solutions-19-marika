package pl.coderstrust.figures;

public class Rectangle implements Figure {

  double length;
  double width;

  public Rectangle() {
    this.length = 10;
    this.width = 5;
  }

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  @Override
  public double calculateArea() {
    return length * width;
  }
}
