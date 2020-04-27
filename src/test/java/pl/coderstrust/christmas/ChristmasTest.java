package pl.coderstrust.christmas;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static pl.coderstrust.christmas.Christmas.createChristmasTree;

class ChristmasTest {

    @Test
    public void shouldCreateChristmasTreeWhenHeightIsTwo() {
        //given
        int height = 2;
        String expected = Arrays.asList(
                "  *",
                " ***",
                " **"
        ).toString();

        //when
        String result = createChristmasTree(height).toString();

        //then
        assertEquals(expected, result);
    }

    @Test
    public void shouldCreateChristmasTreeWhenHeightIsFive() {
        //given
        int height = 5;
        String expected = Arrays.asList(
                "     *",
                "    ***",
                "   *****",
                "  *******",
                " *********",
                "    **"
        ).toString();

        //when
        String result = createChristmasTree(height).toString();

        //then
        assertEquals(expected, result);
    }

    @Test
    public void shouldCreateChristmasTreeWhenHeightIsTen() {
        //given
        int height = 10;
        String expected = Arrays.asList(
                "          *",
                "         ***",
                "        *****",
                "       *******",
                "      *********",
                "     ***********",
                "    *************",
                "   ***************",
                "  *****************",
                " *******************",
                "         **"
        ).toString();

        //when
        String result = createChristmasTree(height).toString();

        //then
        assertEquals(expected, result);
    }

    @Test
    public void shouldCheckTfThrowExceptionWhenHeightIsSmallerThanOne() {
        //given
        int height = -1;
        String expected = "The value must be greater than 0!";

        //when
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            createChristmasTree(height);
        });

        //then
        String result = exception.getMessage();
        assertTrue(result.contains(expected));
    }
}
