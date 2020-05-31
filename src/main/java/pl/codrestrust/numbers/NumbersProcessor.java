package pl.codrestrust.numbers;

public class NumbersProcessor {

  public String processLine(String line) {
    String lineWithoutWhiteSpaces = line.replaceAll(" ", "");
    if (isInvalid(lineWithoutWhiteSpaces)) {
      return null;
    }
    StringBuilder additionOperation = new StringBuilder();
    char[] separateNumbers = lineWithoutWhiteSpaces.toCharArray();
    int sumOfNumbers = 0;
    for (int i = 0; i < separateNumbers.length; i++) {
      sumOfNumbers += Integer.parseInt(String.valueOf(separateNumbers[i]));
      additionOperation.append(separateNumbers[i]);
      if (i < separateNumbers.length - 1) {
        additionOperation.append("+");
      }
    }
    additionOperation.append("=").append(sumOfNumbers);
    return additionOperation.toString();
  }

  public boolean isInvalid(String line) {
    return !line.matches("[0-9]+") || line.length() <= 2;
  }
}
