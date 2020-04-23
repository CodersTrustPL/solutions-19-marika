package pl.coderstrust.christmas;

import java.util.ArrayList;
import java.util.List;

public class Christmas {

    public static void main(String[] args) {
        int height = 10;
        List<String> christmasTree = createChristmasTree(height);
        printChristmasTreeIfSizeIsBiggerThanZero(height, christmasTree);
    }

    public static List<String> createChristmasTree(int height) {
        List<String> christmasTree = new ArrayList<>();
        for (int i = 0; i < height; i++) {
            String treeElement = "";
            for (int j = 0; j < (height - i); j++) {
                treeElement += " ";
            }
            for (int j = 1; j <= (2 * i + 1); j++) {
                treeElement += "*";
            }
            christmasTree.add(treeElement);
        }
        String treeElement = "";
        for (int i = 1; i < height; i++) {
            treeElement += " ";
        }
        treeElement += "**";
        christmasTree.add(treeElement);
        return christmasTree;
    }

    public static void printChristmasTreeIfSizeIsBiggerThanZero(int height, List<String> christmasTree) {
        if (height > 0) {
            for (int i = 0; i < christmasTree.size(); i++) {
                System.out.println(christmasTree.get(i));
            }
        }
    }
}
