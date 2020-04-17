package pl.coderstrust.sieve;

import java.util.Arrays;

public class SieveOfEratosthenes {

    public static void main(String[] args) {
        int maximumNumber = 16;
        int[] primeNumbersArray = sieve(maximumNumber);
        System.out.println(Arrays.toString(primeNumbersArray));
    }

    public static int[] sieve(int maximumNumber) {
        boolean[] arrayWithPrimeNumbersMarkedAsTrue = initialiseArrayWithDefaultValues(maximumNumber);
        markNotPrimeNumbersAsFalse(arrayWithPrimeNumbersMarkedAsTrue);
        int primeNumbersCounter = countPrimeNumbers(arrayWithPrimeNumbersMarkedAsTrue);
        return movePrimeNumbersToFinalList(arrayWithPrimeNumbersMarkedAsTrue, primeNumbersCounter);
    }

    public static boolean[] initialiseArrayWithDefaultValues(int maximumNumber) {
        boolean[] arrayWithPrimeNumbersMarkedAsTrue = new boolean[maximumNumber];
        for (int i = 1; i < maximumNumber; i++) {
            arrayWithPrimeNumbersMarkedAsTrue[i] = true;
        }
        return arrayWithPrimeNumbersMarkedAsTrue;
    }

    public static void markNotPrimeNumbersAsFalse(boolean[] arrayWithPrimeNumbersMarkedAsTrue) {
        for (int i = 2; i * i < arrayWithPrimeNumbersMarkedAsTrue.length; i++) {
            if (arrayWithPrimeNumbersMarkedAsTrue[i]) {
                for (int j = i * i; j < arrayWithPrimeNumbersMarkedAsTrue.length; j += i)
                    arrayWithPrimeNumbersMarkedAsTrue[j] = false;
            }
        }
    }

    public static int countPrimeNumbers(boolean[] arrayWithPrimeNumbersMarkedAsTrue) {
        int primeNumbersAmount = 0;
        for (boolean item : arrayWithPrimeNumbersMarkedAsTrue) {
            if (item) {
                primeNumbersAmount++;
            }
        }
        return primeNumbersAmount;
    }

    public static int[] movePrimeNumbersToFinalList(boolean[] arrayWithPrimeNumbersMarkedAsTrue, int primeNumbersCounter) {
        int[] primeArray = new int[primeNumbersCounter];

        int indexInArray = 0;
        for (int i = 1; i < arrayWithPrimeNumbersMarkedAsTrue.length; i++) {
            if (arrayWithPrimeNumbersMarkedAsTrue[i]) {
                primeArray[indexInArray++] = i;
            }
        }
        return primeArray;
    }
}

