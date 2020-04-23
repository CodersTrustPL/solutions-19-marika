package pl.coderstrust.multiplication;

public class Multiplication {

    public static void main(String[] args) {
        int size = 10;
        int[][] multiplicationTable = createMultiplicationArray(size);
        printMultiplicationTable(size, multiplicationTable);
    }

    private static void throwExceptionIfSizeIsSmallerThanOne(int size) {
        if (size < 1) {
            throw new IllegalArgumentException("The value must be greater than 0! Provided value was: " + size);
        }
    }

    public static int[][] createMultiplicationArray(int size) {
        int[][] multiplicationTable = new int[size + 1][size + 1];
        for (int i = 0; i <= size; i++) {
            multiplicationTable[0][i] = i;
        }
        for (int i = 1; i <= size; i++) {
            multiplicationTable[i][0] = i;
            for (int j = 1; j <= size; j++) {
                multiplicationTable[i][j] = j * i;
            }
        }
        return multiplicationTable;
    }

    public static void printMultiplicationTable(int size, int[][] multiplicationTable) {
        throwExceptionIfSizeIsSmallerThanOne(size);
        for (int[] row : multiplicationTable) {
            for (int item : row) {
                if (item == 0) {
                    System.out.print("    ");
                } else if (item < 10) {
                    System.out.print(item + "   ");
                } else {
                    System.out.print(item + "  ");
                }
            }
            System.out.println();
        }
    }
}
