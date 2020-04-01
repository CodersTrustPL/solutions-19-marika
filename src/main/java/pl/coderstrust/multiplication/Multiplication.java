package pl.coderstrust.multiplication;

public class Multiplication {
    public static void main(String[] args) {
        int size = 10;
        printMultiplicationTable(size);
    }
    public static void printMultiplicationTable(int size) {
        StringBuilder multiplicationTable = new StringBuilder();
        for(int i = 1; i<=size; i++) {
            multiplicationTable.append("\t").append(i);
        }
        multiplicationTable.append("\n");
        for(int i = 1; i<=size; i++) {
            multiplicationTable.append(i).append("\t");
            for(int j = 1; j<=size; j++) {
                multiplicationTable.append(j * i).append("\t");
            }
            multiplicationTable.append("\n");
        }
        System.out.println(multiplicationTable);
    }
}
