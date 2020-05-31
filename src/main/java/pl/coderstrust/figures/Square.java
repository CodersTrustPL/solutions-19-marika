package pl.coderstrust.figures;

public class Square extends Rectangle {

  double length;
  double width;

  public Square() {
    this.length = 10;
    this.width = 10;
  }

  public Square(double length, double width) {
    this.length = length;
    this.width = width;
  }

  @Override
  public double calculateArea() {
    return length * width;
  }
}
