package pl.coderstrust.christmas;

public class Christmas {
    public static void main(String[] args) {
        int height = 6;
        printChristmasTree(height);
    }

    public static void printChristmasTree(int height) {
        StringBuilder christmasTree = new StringBuilder("\n");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < (height - i); j++) {
                christmasTree.append(" ");
            }
            for (int j = 1; j <= (2 * i + 1); j++) {
                christmasTree.append("*");
            }
            christmasTree.append("\n");
        }
        for (int i = 1; i < height; i++) {
            christmasTree.append(" ");
        }
        christmasTree.append("**");
        System.out.println(christmasTree);
    }
}
