package pl.coderstrust.sort;

public class Helper {
    public static void swap(int[] sortedArray, int indexOfFirstElementInArrayRange, int indexOfMinimalElementInArrayRange) {
        int smallerElement = sortedArray[indexOfMinimalElementInArrayRange];
        sortedArray[indexOfMinimalElementInArrayRange] = sortedArray[indexOfFirstElementInArrayRange];
        sortedArray[indexOfFirstElementInArrayRange] = smallerElement;
    }
}
