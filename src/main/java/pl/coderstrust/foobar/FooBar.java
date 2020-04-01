package pl.coderstrust.foobar;

public class FooBar {
    public static void main(String[] args) {
        int number = 100;
        printFooBar(number);
    }

    public static void printFooBar(int number) {
        StringBuilder message = new StringBuilder();
        for (int i = 0; i <= number; i++) {
            message.append(i);
            if (i % 3 == 0) {
                message.append("Foo");
            }
            if (i % 5 == 0) {
                message.append("Bar");
            }
            System.out.println(message);
            message.setLength(0);
        }
    }
}
