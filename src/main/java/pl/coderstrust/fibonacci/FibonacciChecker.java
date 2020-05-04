package pl.coderstrust.fibonacci;

import java.util.Set;

public class FibonacciChecker {

    static Set<Long> fibonacciNumbers = FibonacciNumbersGenerator.generateFibonacciNumbers();

    public static void main(String[] args) {
        long number = 10;
        throwExceptionIfHeightIsSmallerThanZero(number);
        System.out.println(isFibonacciNumber(number));
    }

    public static boolean isFibonacciNumber(long number) {
        return fibonacciNumbers.contains(number);
    }

    private static void throwExceptionIfHeightIsSmallerThanZero(long number) {
        if (number < 0) {
            throw new IllegalArgumentException("The value must be greater than -1! Provided value was: " + number);
        }
    }
}
