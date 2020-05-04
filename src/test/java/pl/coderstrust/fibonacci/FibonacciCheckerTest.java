package pl.coderstrust.fibonacci;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FibonacciCheckerTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/fibonacci.csv", numLinesToSkip = 1)
    void shouldReturnsTrueForEachNumberFromFibonacciSet(String input) {
        long actualValue = Long.parseLong(input);
        assertTrue(FibonacciChecker.isFibonacciNumber(actualValue));
    }

    @ParameterizedTest
    @MethodSource("randomNumbers")
    void shouldReturnFalseForAllRandomNumbers(long actualValue) {
        assertFalse(FibonacciChecker.isFibonacciNumber(actualValue));
    }

    private static Stream<Long> randomNumbers() {
        Set<Long> randomNumbers = new HashSet<>();
        Random randomGenerator = new Random();
        for (int i = 0; i < 1000000; i++) {
            randomNumbers.add(randomGenerator.nextLong());
        }
        Set<Long> fibonacciNumbers = FibonacciChecker.fibonacciNumbers;
        randomNumbers.removeAll(fibonacciNumbers);
        return randomNumbers.stream();
    }
}
