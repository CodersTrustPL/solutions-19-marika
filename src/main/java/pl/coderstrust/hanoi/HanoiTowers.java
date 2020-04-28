package pl.coderstrust.hanoi;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HanoiTowers {

    public static void main(String[] args) throws IOException {
        int disks = 3;
        List<String> pillarA = new ArrayList<String>();
        pillarA.add("pillar A");
        fillPillarOne(disks, pillarA);
        List<String> pillarB = new ArrayList<String>();
        pillarB.add("pillar B");
        List<String> pillarC = new ArrayList<String>();
        pillarC.add("pillar C");
        hanoiTowers(disks, pillarA, pillarB, pillarC);
    }

    public static void hanoiTowers(int disks, List<String> pillarA, List<String> pillarB, List<String> pillarC) throws IOException {
        throwExceptionIfHeightIsSmallerThanOne(disks);
        if (disks == 1) {
            String disk = pillarA.get(pillarA.size() -1);
            pillarA.remove(disk);
            pillarC.add(disk);
            String message = "Move disk: " + disk + " from: " + pillarA.get(0) + " to: " + pillarC.get(0);
            writeToFile(message, pillarA, pillarB, pillarC);
            System.out.println(message);
            System.out.println(pillarA);
            System.out.println(pillarB);
            System.out.println(pillarC);
            return;
        }
        hanoiTowers(disks - 1, pillarA, pillarC, pillarB);
        String disk = pillarA.get(pillarA.size() -1);
        pillarA.remove(disk);
        pillarC.add(disk);
        String message = "Move disk: " + disk + " from: " + pillarA.get(0) + " to: " + pillarC.get(0);
        writeToFile(message, pillarA, pillarB, pillarC);
        System.out.println(message);
        System.out.println(pillarA);
        System.out.println(pillarB);
        System.out.println(pillarC);
        hanoiTowers(disks - 1, pillarB, pillarA, pillarC);
    }

    private static void fillPillarOne(int disks, List<String> pillar) {
        for (int i = 0; i < disks; i++) {
            pillar.add(Integer.toString(i + 1));
        }
    }

    private static void throwExceptionIfHeightIsSmallerThanOne(int disks) {
        if (disks < 1) {
            throw new IllegalArgumentException("The value must be greater than 0! Provided value was: " + disks);
        }
    }

    private static void writeToFile(String message, List<String> pillarA, List<String> pillarB, List<String> pillarC
                                    ) throws IOException {
        File myFile = new File("text.txt");
        myFile.createNewFile();
        FileWriter myWriter = new FileWriter(myFile.getAbsoluteFile(), true);
        BufferedWriter myBufferedWriter = new BufferedWriter(myWriter);
        myBufferedWriter.write(message);
        myBufferedWriter.newLine();
        myBufferedWriter.write(pillarA.toString());
        myBufferedWriter.newLine();
        myBufferedWriter.write(pillarB.toString());
        myBufferedWriter.newLine();
        myBufferedWriter.write(pillarC.toString());
        myBufferedWriter.newLine();
        myBufferedWriter.close();
    }
}


