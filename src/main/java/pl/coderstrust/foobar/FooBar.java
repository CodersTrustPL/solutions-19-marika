package pl.coderstrust.foobar;

public class FooBar {
    public static void main(String[] args) {
        for(int i = 0; i <= 100; i++) {
            System.out.println(i);
            if (i != 0) {
                if (i % 3 == 0 || i % 5 == 0) {
                    if (i % 3 == 0) {
                        System.out.print("Foo");
                    }
                    if (i % 5 == 0) {
                        System.out.print("Bar");
                    }
                    System.out.println();
                }
            }
        }
    }
}