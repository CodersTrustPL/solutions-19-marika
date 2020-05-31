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
    List<String> resultLines = new ArrayList<>();
    for (String line : linesFromFile) {
      resultLines.add(numbersProcessor.processLine(line));
    }
    fileProcessor.writeLinesToFile(resultLines, resultFileName);
  }
}
