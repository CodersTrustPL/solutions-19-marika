package pl.codrestrust.numbers;

public class NumbersProcessor {

  public String processLine(String line) {
    StringBuilder additionOperation = new StringBuilder();
    char[] separateNumbers = line.toCharArray();
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
}
