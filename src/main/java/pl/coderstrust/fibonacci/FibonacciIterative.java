package pl.coderstrust.fibonacci;

import java.util.Arrays;

public class FibonacciIterative {
    public static void main(String[] args) {
        int length = 5;
        long[] fibonacciArray = fibonacci(length);
        System.out.print(Arrays.toString(fibonacciArray));
    }

    private static long[] fibonacci(int fibonacciNumberInOrder) {
        long[] table = new long[fibonacciNumberInOrder];
        for (int i = 0; i < fibonacciNumberInOrder; i++) {
            if (i == 0 || i == 1) {
                table[i] = i;
            }
            else {
                table[i] = table[i - 1] + table[i - 2];
            }
        }
        return table;
    }
}
