package pl.coderstrust.fibonacci;

import java.util.Set;

public class FibonacciChecker {

    private static final Set<Long> fibonacciNumbers = FibonacciNumbersGenerator.generateFibonacciNumbers();

    public static void main(String[] args) {
        long number = 2;
        throwExceptionIfNumberIsSmallerThanZero(number);
        System.out.println(isFibonacciNumber(number));
    }

    public static boolean isFibonacciNumber(long number) {
        return fibonacciNumbers.contains(number);
    }

    private static void throwExceptionIfNumberIsSmallerThanZero(long number) {
        if (number < 0) {
            throw new IllegalArgumentException("The value must be greater than -1! Provided value was: " + number);
        }
    }
}
