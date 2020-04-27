package pl.coderstrust.pascal;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static void main(String[] args) {
        int height = 2;
        List<String> pascalTriangle = createPascalTriangle(height);
        printPascalTriangle(pascalTriangle);
    }

    public static List<String> createPascalTriangle(int height) {
        throwExceptionIfHeightIsSmallerThanOne(height);
        List<String> pascalTriangle = new ArrayList<>();
        StringBuilder pascalElement = new StringBuilder();
        int number;
        for (int i = 0; i < height; i++) {
            for (int j = i; j < height; j++) {
                pascalElement.append(String.format("%2s", ""));
            }
            for (int j = 0; j <= i; j++) {
                number = factorial(i) / (factorial(j) * factorial(i - j));
                pascalElement.append(String.format("%4s", number));
            }
            pascalTriangle.add(pascalElement.toString());
            pascalElement.setLength(0);
        }
        System.out.println(pascalTriangle);
        return pascalTriangle;
    }

    public static void printPascalTriangle(List<String> pascalTriangle) {
        for (int i = 0; i < pascalTriangle.size(); i++) {
            System.out.println(pascalTriangle.get(i));
        }
    }

    private static void throwExceptionIfHeightIsSmallerThanOne(int height) {
        if (height < 1) {
            throw new IllegalArgumentException("The value must be greater than 0! Provided value was: " + height);
        }
    }

    private static int factorial(int number) {
        int result = 1;
        while (number >= 1) {
            result *= number;
            number--;
        }
        return result;
    }
}
