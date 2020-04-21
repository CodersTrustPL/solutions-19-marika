package pl.coderstrust.multiplication;

public class Multiplication {

    public static void main(String[] args) {
        int size = 5;
        ifSizeIsSmallerThanOneThrowException(size);
        int[][] multiplicationTable = createMultiplicationArray(size);
        PrintMultiplicationTable(multiplicationTable);
    }

    public static void ifSizeIsSmallerThanOneThrowException(int size) {
        if (size < 1) {
            throw new IllegalArgumentException("The value must be greater than 0!");
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

    public static void PrintMultiplicationTable(int[][] multiplicationTable) {
        for (int[] x : multiplicationTable) {
            for (int y : x) {
                if (y == 0) {
                    System.out.print("\t");
                } else {
                    System.out.print(y + "\t");
                }
            }
            System.out.println();
        }
    }
}
