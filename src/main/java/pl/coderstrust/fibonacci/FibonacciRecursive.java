package pl.coderstrust.fibonacci;

import java.util.Arrays;

public class FibonacciRecursive {
    public static void main(String[] args) {
        int length = 5;
        long[] table = new long[length];
        for (int i = 1; i < length; i++) {
            table[i] = fibonacci(i);
        }
        System.out.print(Arrays.toString(table));
    }

    private static long fibonacci(int fibonacciNumberInOrder) {
        if (fibonacciNumberInOrder == 1 || fibonacciNumberInOrder == 2) {
            return 1;
        }
        return fibonacci(fibonacciNumberInOrder - 1) + fibonacci(fibonacciNumberInOrder - 2);
    }
}
