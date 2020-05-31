package pl.coderstrust.figures;

public class Trapezoid implements Figure {

  double base1 = 10.00;
  double base2 = 12.00;
  double height = 4.00;

  @Override
  public double calculateArea() {
    return 0.5 * (base1 + base2) * height;
  }
}
