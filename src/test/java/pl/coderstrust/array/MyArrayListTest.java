package pl.coderstrust.array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class MyArrayListTest {

  @Test
  void shouldCheckIfReturnCorrectSize() {
    // given
    List<Integer> list = new MyArrayList<>();

    // when
    list.add(1);
    list.add(2);

    // then
    assertEquals(list.size(), 2);
  }

  @Test
  void shouldCheckIfReturnTrueIfIsEmpty() {
    // given
    List<Integer> list = new MyArrayList<>();
    list.add(1);

    // then
    assertFalse(list.isEmpty());
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
  void shouldReturnTrueIfContainsCollection() {
    // given
    List<Integer> list = new MyArrayList<>();
    list.add(1);
    list.add(2);
    List<Integer> listTwo = new ArrayList<>();
    list.add(1);
    list.add(2);

    // then
    assertTrue(list.containsAll(listTwo));
  }

  @Test
  void shouldCheckIfHaveCorrectSizeAfterAdding() { //check value too
    // given
    List<Integer> list = new MyArrayList<>();

    // when
    list.add(1);
    list.add(2);

    // then
    assertEquals(list.size(), 2);
  }

  @Test
  void shouldCheckIfHaveCorrectSizeAfterAddingAndIndex() { //check value too
    // given
    List<Integer> list = new MyArrayList<>();
    list.add(1);
    list.add(2);

    // when
    list.add(1, 33);

    // then
    assertEquals(list.size(), 3);
  }

  @Test
  void shouldCheckIfHaveCorrectSizeAfterAddingAll() { //check value too
    // given
    List<Integer> list = new MyArrayList<>();
    list.add(1);
    list.add(2);
    List<Integer> listTwo = new ArrayList<>();
    list.add(11);
    list.add(12);

    // when
    list.addAll(listTwo);

    // then
    assertEquals(list.size(), 4);
  }

  @Test
  void shouldCheckIfHaveCorrectSizeAfterAddingAllAndIndex() { //check value too
    // given
    List<Integer> list = new MyArrayList<>();
    list.add(1);
    list.add(2);
    List<Integer> listTwo = new ArrayList<>();
    listTwo.add(11);
    listTwo.add(12);

    // when
    list.addAll(1, listTwo);

    // then
    assertEquals(list.size(), 4);
  }

  @Test
  void shouldCheckIfHaveCorrectSizeAfterRemove() { // too
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
  void shouldCheckIfHaveCorrectSizeAfterRemoveAll() { // too
    // given
    List<Integer> list = new MyArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    List<Integer> listTwo = new ArrayList<>();
    listTwo.add(1);
    listTwo.add(2);

    // when
    list.removeAll(listTwo);

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
