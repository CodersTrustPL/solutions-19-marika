package pl.coderstrust.foobar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class FooBarTest {

    @Test
    public void shouldReturnEmptyList() {
        //given
        int number = -1;
        List<String> expected = Collections.emptyList();
        //when
        List<String> result = FooBar.createFooBarArray(number);
        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void shouldReturnOneElementListAsExpected() {
        //given
        int number = 0;
        List<String> expected = Collections.singletonList("0FooBar");
        //when
        List<String> result = FooBar.createFooBarArray(number);
        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void shouldReturnSixElementListAsExpected() {
        //given
        int number = 5;
        List<String> expected = Arrays.asList("0FooBar", "1", "2", "3Foo", "4", "5Bar");
        //when
        List<String> result = FooBar.createFooBarArray(number);
        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void shouldReturnElevenElementListAsExpected() {
        //given
        int number = 10;
        List<String> expected = Arrays.asList("0FooBar", "1", "2", "3Foo", "4", "5Bar", "6Foo", "7", "8", "9Foo", "10Bar");
        //when
        List<String> result = FooBar.createFooBarArray(number);
        //then
        Assertions.assertEquals(expected, result);
    }
}
