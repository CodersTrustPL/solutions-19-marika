package pl.coderstrust.christmas;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static pl.coderstrust.christmas.Christmas.createChristmasTree;

class ChristmasTest {

    @Test
    public void shouldCheckIfAllValuesAreCorrectWhenHeightIsTwo() {
        //given
        int height = 2;
        List<String> expected = Arrays.asList(
                "  *",
                " ***",
                " **"
        );

        //when
        List<String> result = createChristmasTree(height);

        //then
        assertEquals(expected, result);
    }

    @Test
    public void shouldCheckIfAllValuesAreCorrectWhenHeightIsFive() {
        //given
        int height = 5;
        List<String> expected = Arrays.asList(
                "     *",
                "    ***",
                "   *****",
                "  *******",
                " *********",
                "    **"
        );

        //when
        List<String> result = createChristmasTree(height);

        //then
        assertEquals(expected, result);
    }

    @Test
    public void shouldCheckIfAllValuesAreCorrectWhenHeightIsTen() {
        //given
        int height = 10;
        List<String> expected = Arrays.asList(
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
        );

        //when
        List<String> result = createChristmasTree(height);

        //then
        assertEquals(expected, result);
    }
}
