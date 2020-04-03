package pl.coderstrust.christmas;

public class Christmas {
    public static void main(String[] args) {
        int height = 6;
        printChristmasTree(height);
    }

    public static void printChristmasTree(int height) {
        StringBuilder christmasTree = new StringBuilder("\n");
        int starWidthCounter = 1;
        for(int i = 1; i <= height; i++) {
            int emptySpaceWidthCounter = height - i;
            for(int j = 1; j <= emptySpaceWidthCounter; j++) {
                christmasTree.append(" ");
            }
            for(int j = 1; j <= starWidthCounter; j++) {
                christmasTree.append("*");
            }
            christmasTree.append("\n");
            starWidthCounter += 2;
        }
        int halfStarWidth = (starWidthCounter - 2) / 2 - 1;
        for(int j = 1; j <= starWidthCounter; j++) {
            christmasTree.append(" ");
            if(j == halfStarWidth) {
                christmasTree.append("**");
            }
        }
        System.out.println(christmasTree);
    }
}
