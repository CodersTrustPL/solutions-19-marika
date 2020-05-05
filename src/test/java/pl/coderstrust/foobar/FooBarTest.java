package pl.coderstrust.foobar;

import static pl.coderstrust.foobar.FooBar.createFooBarArray;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FooBarTest {

  @Test
  public void shouldReturnEmptyList() {

    //given
    int number = -1;
    List<String> expected = Collections.emptyList();

    //when
    List<String> result = createFooBarArray(number);

    //then
    Assertions.assertEquals(expected, result);
  }

  @Test
  public void shouldReturnEmptyListTo() {

    //given
    int number = 0;
    List<String> expected = Collections.emptyList();

    //when
    List<String> result = createFooBarArray(number);

    //then
    Assertions.assertEquals(expected, result);
  }

  @Test
  public void shouldReturnFiveElementListAsExpected() {

    //given
    int number = 5;
    List<String> expected = Arrays.asList(
        "1",
        "2",
        "3 Foo",
        "4",
        "5 Bar"
    );

    //when
    List<String> result = createFooBarArray(number);

    //then
    Assertions.assertEquals(expected, result);
  }

  @Test
  public void shouldReturnFifteenElementListAsExpected() {

    //given
    int number = 15;
    List<String> expected = Arrays.asList(
        "1",
        "2",
        "3 Foo",
        "4",
        "5 Bar",
        "6 Foo",
        "7",
        "8",
        "9 Foo",
        "10 Bar",
        "11",
        "12 Foo",
        "13",
        "14",
        "15 Foo Bar"
    );

    //when
    List<String> result = createFooBarArray(number);

    //then
    Assertions.assertEquals(expected, result);
  }
}
