package pl.coderstrust.fibonacci;

import java.util.HashSet;
import java.util.Set;

public class FibonacciChecker {

    static Set<Long> fibonacciNumbers = generateFibonacciNumbers();

    public static void main(String[] args) {
        long number = 2;
        System.out.println(isFibonacciNumber(number));
    }

    public static boolean isFibonacciNumber(long number) {
        return fibonacciNumbers.contains(number);
    }

    private static Set<Long> generateFibonacciNumbers() {
        Set<Long> fibonacciNumbers = new HashSet<>();
        long first = 0;
        fibonacciNumbers.add(first);
        long second = 0;
        long sum = 1;
        for (int i = 1; i < 92; i++) {
            first = second;
            second = sum;
            sum = first + second;
            fibonacciNumbers.add(sum);
        }
        return fibonacciNumbers;
    }

    public static Set<Long> getFibonacciNumbers() {
        return fibonacciNumbers;

    }
}
