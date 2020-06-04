package pl.coderstrust.array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class MyArrayListTest {

  @Test
  void shouldCheckIfHaveCorrectSizeAfterAdding() {
    // given
    List<Integer> list = new MyArrayList<>();

    // when
    list.add(1);
    list.add(2);

    // then
    assertEquals(list.size(), 1);
  }

  @Test
  void shouldCheckIfHaveCorrectSizeAfterRemove() {
    // given
    List<Integer> list = new MyArrayList<>();
    list.add(1);
    list.add(2);

    // when
    list.remove(1);

    // then
    assertEquals(list.size(), 1);
  }

  @Test
  void shouldCheckIfHaveCorrectSizeAfterClear() {
    // given
    List<Integer> list = new MyArrayList<>();
    list.add(1);

    // when
    list.clear();

    // then
    assertEquals(list.size(), 0);
  }

  @Test
  void shouldReturnCorrectValueAfterGet() {
    // given
    List<Integer> list = new MyArrayList<>();
    list.add(3);
    list.add(1);
    list.add(2);

    // then
    assertEquals(list.get(1), 1);
  }

  @Test
  void shouldReturnTrueIfContainsValue() {
    // given
    List<Integer> list = new MyArrayList<>();
    list.add(1);
    list.add(2);

    // then
    assertTrue(list.contains(1));
  }

  @Test
  void shouldReturnCorrectValueAfterIndexOf() {
    // given
    List<Integer> list = new MyArrayList<>();
    list.add(1);
    list.add(2);

    // then
    assertEquals(list.indexOf(1), 0);
  }

  @Test
  void shouldReturnCorrectValueAfterLastIndexOf() {
    // given
    List<Integer> list = new MyArrayList<>();
    list.add(1);
    list.add(2);
    list.add(1);

    // then
    assertEquals(list.lastIndexOf(1), 2);
  }

  @Test
  void shouldReturnCorrectSubList() {
    // given
    List<Integer> expected = new ArrayList<>();
    expected.add(2);
    expected.add(3);
    List<Integer> list = new MyArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    // then
    assertEquals(list.subList(1, 3), expected);
  }

  @Test
  void shouldCheckIfHaveCorrectSizeAfterSet() {
    // given
    List<Integer> list = new MyArrayList<>();
    list.add(10);
    list.add(15);

    // when
    list.set(1, 1);

    // then
    assertEquals(list.size(), 2);
  }
}
