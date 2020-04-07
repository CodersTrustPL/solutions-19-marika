public class Pascal {
    public static void main(String[] args) {
        int height = 7;
        printPascalTriangle(height);
    }

    public static void printPascalTriangle(int height) {
        int number;
        for (int i = 0; i < height; i++) {
            for (int j = i; j < height; j++) {
                System.out.printf("%2s", "");
            }
            for (int j = 0; j <= i; j++) {
                number = factorial(i) / (factorial(j) * factorial(i - j));
                System.out.printf("%4d", number);
            }
            System.out.println();
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
