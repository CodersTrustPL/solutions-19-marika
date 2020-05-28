package pl.codrestrust.numbers;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class ProcessorTest {

  @Test
  public void shouldProcessProvidedInputFileAndSaveResultToProvidedOutputFile() throws IOException {
    // given
    FileProcessor fileProcessor = mock(FileProcessor.class);
    when(fileProcessor.readLinesFromFile("numbers.txt")).thenReturn(Arrays.asList("1 2 3"));
    NumbersProcessor numbersProcessor = mock(NumbersProcessor.class);
    when(numbersProcessor.processLine("123")).thenReturn("1+2+3=6");
    Processor processor = new Processor(numbersProcessor, fileProcessor);
    List<String> result = new ArrayList<>();
    result.add("1+2+3=6");

    // when
    processor.process("numbers.txt", "num.txt");

    // then
    verify(fileProcessor).readLinesFromFile("numbers.txt");
    verify(numbersProcessor).processLine("123");
    verify(fileProcessor).writeLinesToFile(result, "num.txt");
  }

  @Test
  public void shouldCheckIfFileWasCreated() throws IOException {
    // given
    FileProcessor fileProcessor = new FileProcessor();
    NumbersProcessor numbersProcessor = new NumbersProcessor();
    Processor processor = new Processor(numbersProcessor, fileProcessor);

    // when
    processor.process("numbers.txt", "num.txt");

    // then
    File file = new File("num.txt");
    assertTrue(file.exists());
  }
}
