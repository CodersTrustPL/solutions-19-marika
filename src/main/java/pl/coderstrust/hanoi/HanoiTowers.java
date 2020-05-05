package pl.coderstrust.hanoi;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Stack;

public class HanoiTowers {

  public static void main(String[] args) throws IOException {
    int disks = 3;
    Stack<String> pillarA = new Stack<>();
    Stack<String> pillarB = new Stack<>();
    Stack<String> pillarC = new Stack<>();
    writeToFile();
    addNamesToPillar(pillarA, pillarB, pillarC);
    addDisksToFirstPillar(disks, pillarA);
    hanoiTowers(disks, pillarA, pillarB, pillarC);
  }

  public static void hanoiTowers(int disks, Stack<String> pillarA, Stack<String> pillarB, Stack<String> pillarC) throws IOException {
    throwExceptionIfHeightIsSmallerThanOne(disks);
    if (disks == 1) {
      String currentState = moveDisk(pillarA, pillarC);
      printCurrentState(currentState, pillarA, pillarB, pillarC);
      return;
    }
    hanoiTowers(disks - 1, pillarA, pillarC, pillarB);
    String currentState = moveDisk(pillarA, pillarC);
    printCurrentState(currentState, pillarA, pillarB, pillarC);
    hanoiTowers(disks - 1, pillarB, pillarA, pillarC);
  }

  private static void addNamesToPillar(Stack<String> pillarA, Stack<String> pillarB, Stack<String> pillarC) {
    pillarA.add("pillar A");
    pillarB.add("pillar B");
    pillarC.add("pillar C");
  }

  private static void addDisksToFirstPillar(int disks, Stack<String> pillar) {
    for (int i = 0; i < disks; i++) {
      pillar.add(Integer.toString(i + 1));
    }
  }

  private static void throwExceptionIfHeightIsSmallerThanOne(int disks) {
    if (disks < 1) {
      throw new IllegalArgumentException("The value must be greater than 0! Provided value was: " + disks);
    }
  }

  private static String moveDisk(Stack<String> pillarA, Stack<String> pillarC) {
    String disk = pillarA.pop();
    pillarC.add(disk);
    return "Move disk: " + disk + " from: " + pillarA.get(0) + " to: " + pillarC.get(0);
  }

  private static void printCurrentState(String message, Stack<String> pillarA, Stack<String> pillarB, Stack<String> pillarC) {
    System.out.println(message);
    System.out.println(pillarA);
    System.out.println(pillarB);
    System.out.println(pillarC);
  }

  private static void writeToFile() throws IOException {
    PrintStream out = new PrintStream("hanoi.txt");
    System.setOut(out);
  }
}
