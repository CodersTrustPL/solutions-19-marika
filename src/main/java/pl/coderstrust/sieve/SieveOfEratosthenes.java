package pl.coderstrust.sieve;

import java.util.Arrays;

public class SieveOfEratosthenes {

    public static void main(String[] args) {
        int maximumNumber = 12;
        int[] primeNumbersArray = sieve(maximumNumber);
        System.out.println(Arrays.toString(primeNumbersArray));
    }

    public static int[] sieve(int maximumNumber) {
        int[] array = initialiseArrayWithDefaultValues(maximumNumber);
        boolean[] booleansArray = markNotPrimeNumbersAsFalse(maximumNumber);
        int primeNumbersCounter = countPrimeNumbers(booleansArray);
        int[] primeArray = movePrimeNumbersToFinalList(array, booleansArray, primeNumbersCounter);
        return primeArray;
    }

    public static int[] initialiseArrayWithDefaultValues(int maximumNumber) {
        int[] array = new int[maximumNumber];
        for (int i = 0; i < maximumNumber; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public static boolean[] markNotPrimeNumbersAsFalse(int maximumNumber) {
        boolean[] array = new boolean[maximumNumber];
        for (int i = 0; i < maximumNumber; i++) {
            array[i] = true;
        }
        for (int p = 2; p * p < array.length; p++) {
            if (array[p] == true) {
                for (int i = p * p; i < array.length; i += p)
                    array[i] = false;
            }
        }
        return array;
    }

    public static int countPrimeNumbers(boolean[] array) {
        int primeNumbersAmount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]) {
                primeNumbersAmount += 1;
            }
        }
        return primeNumbersAmount;
    }

    public static int[] movePrimeNumbersToFinalList(int[] array, boolean[] primeNumbersArray, int primeNumbersCounter) {
        int[] primeArray = new int[primeNumbersCounter];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (primeNumbersArray[i] == true) {
                primeArray[count] = array[i];
                count += 1;
            }
        }
        return primeArray;
    }
}

