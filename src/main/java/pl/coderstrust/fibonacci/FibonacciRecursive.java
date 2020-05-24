package pl.coderstrust.fibonacci;

public class FibonacciRecursive {

  public static long fibonacci(int fibonacciNumberInOrder) {
    if (fibonacciNumberInOrder < 0) {
      throw new IllegalArgumentException("Fibonacci number in order cannot be lower than zero. Provided value was: " + fibonacciNumberInOrder);
    }
    if (fibonacciNumberInOrder <= 1) {
      return fibonacciNumberInOrder;
    } else {
      return fibonacci(fibonacciNumberInOrder - 1) + fibonacci(fibonacciNumberInOrder - 2);
    }
  }
}
