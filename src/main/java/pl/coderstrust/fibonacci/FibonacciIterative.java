package pl.coderstrust.fibonacci;

public class FibonacciIterative {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibonacci(n));
    }

    public static long fibonacci(int fibonacciNumberInOrder) { 
        long first = 1, second = 1, sum = 1;
        if (fibonacciNumberInOrder < 0) {
            throw new IllegalArgumentException("Fibonacci number in order cannot be lower than zero.");
        }
        else if (fibonacciNumberInOrder == 0) {
            return fibonacciNumberInOrder;
        }
        for (int i = 3; i <= fibonacciNumberInOrder; i++) {
            sum = first + second;
            first = second;
            second = sum;
        }
        return sum;
    }
}
