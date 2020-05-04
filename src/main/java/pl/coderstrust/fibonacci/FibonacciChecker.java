package pl.coderstrust.fibonacci;

import java.util.HashSet;
import java.util.Set;

public class FibonacciChecker {

    public static void main(String[] args) {
        long number = 10;
        throwExceptionIfHeightIsSmallerThanZero(number);
        System.out.println(isFibonacciNumber(number));
    }

    public static boolean isFibonacciNumber(long number) {
        Set<Long> fibonacciNumbers = fibonacciNumbersGenerator();
        return fibonacciNumbers.contains(number);
    }

    public static Set<Long> fibonacciNumbersGenerator() {
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

    private static void throwExceptionIfHeightIsSmallerThanZero(long number) {
        if (number < 0) {
            throw new IllegalArgumentException("The value must be greater than -1! Provided value was: " + number);
        }
    }
}
