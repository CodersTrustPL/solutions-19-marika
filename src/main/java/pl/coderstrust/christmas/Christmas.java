package pl.coderstrust.christmas;

import java.util.ArrayList;
import java.util.List;

public class Christmas {

  public static void main(String[] args) {
    int height = 5;
    List<String> christmasTree = createChristmasTree(height);
    printChristmasTree(christmasTree);
  }

  private static void throwExceptionIfHeightIsSmallerThanOne(int height) {
    if (height < 1) {
      throw new IllegalArgumentException("The value must be greater than 0! Provided value was: " + height);
    }
  }

  public static List<String> createChristmasTree(int height) {
    throwExceptionIfHeightIsSmallerThanOne(height);
    List<String> christmasTree = new ArrayList<>();
    StringBuilder treeElement = new StringBuilder();
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < (height - i); j++) {
        treeElement.append(" ");
      }
      for (int j = 1; j <= (2 * i + 1); j++) {
        treeElement.append("*");
      }
      christmasTree.add(treeElement.toString());
      treeElement.setLength(0);
    }
    for (int i = 1; i < height; i++) {
      treeElement.append(" ");
    }
    treeElement.append("**");
    christmasTree.add(treeElement.toString());
    return christmasTree;
  }

  public static void printChristmasTree(List<String> christmasTree) {
    for (int i = 0; i < christmasTree.size(); i++) {
      System.out.println(christmasTree.get(i));
    }
  }
}
