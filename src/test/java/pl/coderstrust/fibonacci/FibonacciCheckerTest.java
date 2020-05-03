package pl.coderstrust.fibonacci;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

class FibonacciCheckerTest {
    
    @ParameterizedTest
    @CsvFileSource(resources = "/fibonacci.csv", numLinesToSkip = 1)
    void shouldReturnsTrueForEachNumberFromFibonacciSet(String input) throws IOException {
        Long actualValue = Long.parseLong(input);
        assertTrue(FibonacciChecker.isFibonacciNumber(actualValue));
    }
}
