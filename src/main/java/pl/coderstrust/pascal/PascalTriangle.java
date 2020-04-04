package pl.coderstrust.pascal;

public class PascalTriangle {
    public static void main(String[] args) {
        int height = 7;
        printPascalTriangle(height);
    }

    public static int calculateFactorial(int n) {
        int factorial = 1;
        while (n >= 1) {
            factorial *= n;
            n--;
        }
        return factorial;
    }

    public static void printPascalTriangle(int height) {
        int number;
        for (int n = 0; n < height; n++) {
            for (int i = n; i < height; i++) {
                System.out.printf("%2s", " ");
            }
            for (int j = 0; j <= n; j++) {
                number = calculateFactorial(n) / (calculateFactorial(j) * calculateFactorial(n - j));
                System.out.printf("%4d", number);
            }
            System.out.println();
        }
    }
}
