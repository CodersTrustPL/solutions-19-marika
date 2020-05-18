package pl.coderstrust.fibonacci;

public class FibonacciIterative {

  public static void main(String[] args) {
    int n = 5;
    System.out.println(fibonacci(n));
  }

  public static long fibonacci(int fibonacciNumberInOrder) {
    long first = 1;
    long second = 1;
    long sum = 1;
    if (fibonacciNumberInOrder <= 0) {
      throw new IllegalArgumentException(
          "Fibonacci number in order cannot be zero or lower than zero. Provided value was: " + fibonacciNumberInOrder);
    }
    for (int i = 3; i <= fibonacciNumberInOrder; i++) {
      sum = first + second;
      first = second;
      second = sum;
    }
    return sum;
  }
}
