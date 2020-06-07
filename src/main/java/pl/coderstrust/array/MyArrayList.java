package pl.coderstrust.array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<T> implements List<T> {

  private Object[] myArrayList = new Object[0];
  private int size = 0;

  @Override
  public int size() {
    return myArrayList.length;
  }

  @Override
  public boolean isEmpty() {
    return myArrayList.length == 0;
  }

  @Override
  public boolean contains(Object o) {
    for (Object value : myArrayList) {
      if(value == o) {
        return true;
      }
    }
    return false;
  }

  @Override
  public boolean add(T t) {
    if (size == myArrayList.length) {
      Object[] myArrayListSecond = new Object[myArrayList.length + 1];
      size++;
      System.arraycopy(myArrayList, 0, myArrayListSecond, 0, myArrayList.length);
      myArrayListSecond[myArrayListSecond.length - 1] = t;
      myArrayList = myArrayListSecond;
    } else {
      myArrayList[size] = t;
      size ++;
    }
    return true;
  }

  @Override
  public boolean remove(Object o) {
    for (int i = 0; i < myArrayList.length; i++) {
      if (myArrayList[i] == o) {
        myArrayList[i] = null;
        break;
      }
    }
    Object[] myArrayListSecond = new Object[myArrayList.length - 1];
    int index = 0;
    for (Object value : myArrayList) {
      if (value != null) {
        myArrayListSecond[index] = value;
        index++;
      }
    }
    myArrayList = myArrayListSecond;
    size--;
    return true;
  }

  @Override
  public void clear() {
    myArrayList = new Object[0];
    size = 0;
  }

  @SuppressWarnings("unchecked")
  @Override
  public T get(int i) {
    return (T)myArrayList[i];
  }

  @SuppressWarnings("unchecked")
  @Override
  public T remove(int i) {
    myArrayList[i] = null;
    Object[] myArrayListSecond = new Object[myArrayList.length - 1];
    int index = 0;
    for (Object o : myArrayList) {
      if (o != null) {
        myArrayListSecond[index] = myArrayList[i];
        index++;
      }
    }
    myArrayList = myArrayListSecond;
    size--;
    return (T) myArrayList;
  }

  @Override
  public int indexOf(Object o) {
    int index = 1;
    for (int i = 0; i < myArrayList.length; i++) {
      if(myArrayList[i] == o) {
        index = i;
        break;
      }
    }
    return index;
  }

  @Override
  public int lastIndexOf(Object o) {
    int index = 1;
    for (int i = 0; i < myArrayList.length; i++) {
      if(myArrayList[i] == o) {
        index = i;
      }
    }
    return index;
  }

  @SuppressWarnings("unchecked")
  @Override
  public List<T> subList(int i, int i1) {
    List<T> myArrayListSecond = new ArrayList<>();
    int counter = 0;
    for (int j = i; j < i1; j++) {
      myArrayListSecond.add((T) myArrayList[j]);
      counter++;
    }
    return myArrayListSecond;
  }

  @Override
  public T set(int i, T t) {
    Object[] myArrayListSecond = new Object[myArrayList.length];
    for (int j = 0; j < myArrayList.length; j++) {
      if (j != i) {
        myArrayListSecond[j] = myArrayList[j];
      } else {
        myArrayListSecond[j] = t;
      }
    }
    myArrayList = myArrayListSecond;
    return null;
  }

  @Override
  public void add(int i, T t) {
    Object[] myArrayListSecond = new Object[myArrayList.length + 1];
    for (int j = 0; j < myArrayList.length; j++) {
      if (j != i) {
        myArrayListSecond[j] = myArrayList[j];
      } else {
        myArrayListSecond[j] = t;
        break;
      }
    }
    if (myArrayList.length - i >= 0) System.arraycopy(myArrayList, i, myArrayListSecond, i + 1, myArrayList.length - i);
    size ++;
    myArrayList = myArrayListSecond;
  }

  @Override
  public boolean containsAll(Collection<?> collection) {
    int isTrue = 0;
    for (Object o : myArrayList) {
      for (int j = 0; j < collection.size(); j++) {
        if (o == collection.toArray()[j]) {
          isTrue++;
        }
      }
    }
    return isTrue >= collection.size();
  }

  @Override
  public boolean addAll(Collection<? extends T> collection) {
    Object[] myArrayListSecond = new Object[myArrayList.length + collection.size()];
    size += collection.size();
    int counter = 0;
    for (int i = 0; i < myArrayList.length; i++) {
      myArrayListSecond[i] = myArrayList[i];
      counter++;
    }
    for ( T element : collection) {
      myArrayListSecond[counter] = element;
      counter++;
    }
    myArrayList = myArrayListSecond;
    return true;
  }

  @Override
  public boolean addAll(int i, Collection<? extends T> collection) {
    Object[] myArrayListSecond = new Object[myArrayList.length + collection.size()];
    size += collection.size();
    for (int j = 0; j < myArrayList.length; j++) {
      if (j != i) {
        myArrayListSecond[j] = myArrayList[j];
      } else {
        break;
      }
    }
    int indexCounter = i;
    for (T element: collection) {
      myArrayListSecond[indexCounter] = element;
      indexCounter ++;
    }
    for (int j = i; j < myArrayList.length; j++) {
      myArrayListSecond[indexCounter] = myArrayList[j];
      indexCounter++;
    }
    myArrayList = myArrayListSecond;
    return false;
  }

  @Override
  public boolean removeAll(Collection<?> collection) {
    for (int i = 0; i < myArrayList.length; i++) {
      for (Object item : collection) {
        if (myArrayList[i] == item) {
          myArrayList[i] = null;
          break;
        }
      }
    }
    for (Object el : myArrayList) {
      System.out.println(el);
    }
    Object[] myArrayListSecond = new Object[myArrayList.length - collection.size()];
    int index = 0;
    for (Object o : myArrayList) {
      if (o != null) {
        myArrayListSecond[index] = o;
        index++;
      }
    }
    myArrayList = myArrayListSecond;
    size -= collection.size();
    return false;
  }

  @Override
  public boolean retainAll(Collection<?> collection) {
    for (Object element: collection) {
      for (Object item: myArrayList) {
        if (element == item) {
          collection.remove(item);
        }
      }
    }
    return true;
  }

  @Override
  public Object[] toArray() {
    return new Object[0];
  }

  @Override
  public <T1> T1[] toArray(T1[] t1s) {
    return null;
  }

  @Override
  public Iterator<T> iterator() {
    return null;
  }

  @Override
  public ListIterator<T> listIterator() {
    return null;
  }

  @Override
  public ListIterator<T> listIterator(int i) {
    return null;
  }
}
