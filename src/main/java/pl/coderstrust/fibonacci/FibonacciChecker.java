package pl.coderstrust.fibonacci;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FibonacciChecker {

    public static void main(String[] args) throws IOException {
        long number = 5;
        System.out.println(isFibonacciNumber(number));
    }

    public static Set<Long> fibonacciListFromFile(String fileName) throws IOException {
        List<String> fibonacciList = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        Set<Long> fibonacciNumbers = new HashSet<>();
        for(String item: fibonacciList) {
            fibonacciNumbers.add(Long.parseLong(item));
        }
        return fibonacciNumbers;
    }

    public static boolean isFibonacciNumber(long number) throws IOException {
        Set<Long> fibonacciNumbers = fibonacciListFromFile("src/test/resources/fibonacci.csv");
        return fibonacciNumbers.contains(number);
    }
}
