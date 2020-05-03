package pl.coderstrust.fibonacci;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FibonacciCheckerTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/fibonacci.csv", numLinesToSkip = 1)
    void shouldReturnsTrueForEachNumberFromFibonacciSet(String input) throws IOException {
        Long actualValue = Long.parseLong(input);
        assertTrue(FibonacciChecker.isFibonacciNumber(actualValue));
    }

    @ParameterizedTest
    @MethodSource("randomNumbers")
    void shouldReturnFalseForAllRandomNumbers(long actualValue) throws IOException {
        assertFalse(FibonacciChecker.isFibonacciNumber(actualValue));
    }

    private static Stream<Long> randomNumbers() throws IOException {
        Set<Long> randomNumbers = new HashSet<>();
        Random randomGenerator = new Random();
        for (int i = 0; i < 1000000; i++) {
            randomNumbers.add(randomGenerator.nextLong());
        }
        List<String> fibonacciList = Files.readAllLines(Paths.get("src/test/resources/fibonacci.csv"),
                StandardCharsets.UTF_8);
        Set<Long> fibonacciNumbers = new HashSet<>();
        for(String item: fibonacciList) {
            fibonacciNumbers.add(Long.parseLong(item));
        }
        randomNumbers.removeAll(fibonacciNumbers);
        return randomNumbers.stream();
    }
}
