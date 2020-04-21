package pl.coderstrust.multiplication;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static pl.coderstrust.multiplication.Multiplication.createMultiplicationArray;
import static pl.coderstrust.multiplication.Multiplication.ifSizeIsSmallerThanOneThrowException;

class MultiplicationTest {

    @Test
    public void shouldCalledException() {
        //given
        int size = -1;

        //then
        assertThrows(IllegalArgumentException.class, () -> {
            ifSizeIsSmallerThanOneThrowException(size);
        });
    }

    @Test
    public void shouldCheckTfExceptionMessageIsCorrect() {
        //given
        int size = -1;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ifSizeIsSmallerThanOneThrowException(size);
        });
        String expected = "The value must be greater than 0!";

        //when
        String result = exception.getMessage();

        //then
        assertTrue(result.contains(expected));
    }

    @Test
    public void shouldCheckIfArrayLengthIsCorrect() {
        //given
        int size = 5;
        int expected = 6;

        //when
        int result = createMultiplicationArray(size).length;

        //then
        assertEquals(expected, result);
    }

    @Test
    public void shouldCheckIfGivenRowLengthIsCorrect() {
        //given
        int size = 5;
        int expected = 6;

        //when
        int result = createMultiplicationArray(size)[0].length;

        //then
        assertEquals(expected, result);
    }


    @Test
    public void shouldCheckIfAllValuesAreCorrect() {
        //given
        int size = 5;
        int[][] expected = {{0, 1, 2, 3, 4, 5}, {1, 1, 2, 3, 4, 5}, {2, 2, 4, 6, 8, 10},
                {3, 3, 6, 9, 12, 15}, {4, 4, 8, 12, 16, 20}, {5, 5, 10, 15, 20, 25}};

        //when
        int[][] result = createMultiplicationArray(size);

        //then
        assertArrayEquals(expected, result);
    }

    @Test
    public void shouldCheckIfRandomValueIsCorrect() {
        //given
        int size = 5;
        int expected = 25;

        //when
        int result = createMultiplicationArray(size)[5][5];

        //then
        assertEquals(expected, result);
    }
}
