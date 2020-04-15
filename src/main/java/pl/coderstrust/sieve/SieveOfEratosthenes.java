package pl.coderstrust.sieve;

import java.util.ArrayList;
import java.util.Arrays;

public class SieveOfEratosthenes {

    public static void main(String[] args) {
        int maximumNumber = 12;
        int[] array = sieve(maximumNumber);
        System.out.println(Arrays.toString(array));
    }

    public static int[] sieve(int maximumNumber) {
        int[] array = new int[maximumNumber];
        for (int i = 0; i < maximumNumber; i++) {
            array[i] = i + 1;
        }
        ArrayList<Integer> primeNumbersList = new ArrayList<>();
        int primeNumbersAmount = 0;
        for (int i = 0; i < maximumNumber; i++) {
            if (!(array[i] != 2 && array[i] % 2 == 0 || array[i] != 3 && array[i] % 3 == 0 || array[i] != 5 && array[i] % 5 == 0 || array[i] != 7 && array[i] % 7 == 0)) {
                primeNumbersList.add(array[i]);
                primeNumbersAmount += 1;
            }
        }
        int[] primeNumbersArray = new int[primeNumbersAmount];
        for (int i = 0; i < primeNumbersList.size(); i++) {
            primeNumbersArray[i] = primeNumbersList.get(i);
        }
        return primeNumbersArray;
    }
}
