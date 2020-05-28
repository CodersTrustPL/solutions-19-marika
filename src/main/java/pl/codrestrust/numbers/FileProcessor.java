package pl.codrestrust.numbers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileProcessor {

  public List<String> readLinesFromFile(String filename) throws IOException {
    List<String> linesFromFile = new ArrayList<>();
    try (Scanner scanner = new Scanner(new File(filename))) {
      while (scanner.hasNextLine()) {
        linesFromFile.add(scanner.nextLine());
      }
    }
    return linesFromFile;
  }

  public void writeLinesToFile(List<String> resultLines, String resultFileName) throws IOException {
    FileWriter fileWriter = new FileWriter(resultFileName);
    PrintWriter printWriter = new PrintWriter(fileWriter);
    for (String resultLine : resultLines) {
      printWriter.println(resultLine);
    }
    printWriter.close();
  }
}
