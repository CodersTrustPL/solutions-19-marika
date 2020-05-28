package pl.codrestrust.numbers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Processor {

  private final NumbersProcessor numbersProcessor;
  private final FileProcessor fileProcessor;

  public Processor(NumbersProcessor numbersProcessor, FileProcessor fileProcessor) {
    this.numbersProcessor = numbersProcessor;
    this.fileProcessor = fileProcessor;
  }

  public void process(String fileName, String resultFileName) throws IOException {
    List<String> linesFromFile = fileProcessor.readLinesFromFile(fileName);
    removeWhiteSpace(linesFromFile);
    List<String> linesThatContainNumberOnly = skipLinesThatDoNotContainNumberOnly(linesFromFile);
    linesFromFile = new ArrayList<>(linesThatContainNumberOnly);
    List<String> resultLines = new ArrayList<>();
    for (String line : linesFromFile) {
      resultLines.add(numbersProcessor.processLine(line));
    }
    fileProcessor.writeLinesToFile(resultLines, resultFileName);
  }

  public void removeWhiteSpace(List<String> lineFromFile) {
    for (int i = 0; i < lineFromFile.size(); i++) {
      String lineWithoutWhitespace = lineFromFile.get(i).replaceAll(" ", "");
      lineFromFile.set(i, lineWithoutWhitespace);
    }
  }

  public List<String> skipLinesThatDoNotContainNumberOnly(List<String> linesFromFile) {
    List<String> linesThatContainNumberOnly = new ArrayList<>();
    for (String s : linesFromFile) {
      try {
        String numberOnly = String.valueOf(Integer.parseInt(s));
        linesThatContainNumberOnly.add(numberOnly);
      } catch (NumberFormatException ex) {
        System.out.println(ex);
      }
    }
    return linesThatContainNumberOnly;
  }
}
