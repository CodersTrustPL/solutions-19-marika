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
            int counter = 1;
            while(counter<=size) {
                multiplicationTable.append(i * counter).append("\t");
                counter++;
            }
            multiplicationTable.append("\n");
        }
        System.out.println(multiplicationTable);
    }
}
