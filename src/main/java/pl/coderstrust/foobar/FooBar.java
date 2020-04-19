package pl.coderstrust.foobar;

import java.util.ArrayList;
import java.util.List;

public class FooBar {
    public static void main(String[] args) {
        int number = 15;
        List<String> result = createFooBarArray(number);
        System.out.println(result);
    }

    public static List<String> createFooBarArray(int number) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            String message = "";
            message += Integer.toString(i);
            if (i % 3 == 0) {
                message += " Foo";
            }
            if (i % 5 == 0) {
                message += " Bar";
            }
            result.add(message);
        }
        return result;
    }
}
