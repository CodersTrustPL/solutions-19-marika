package pl.coderstrust.array;

import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<String> myList = new MyArrayList<>();

    System.out.println(myList.add("ABC"));
    System.out.println(myList.add("CBD"));
    System.out.println(myList.add("THC"));

    System.out.println("size: " + myList.size());

    for (int i = 0; i < myList.size(); i++) {
      System.out.println(myList.get(i));
    }

    System.out.println(myList.remove("CBD"));

    System.out.println("contains false: " + myList.contains("ABS"));
    System.out.println("contains true: " + myList.contains("ABC"));

    System.out.println("index Of: " + myList.indexOf("THC"));

    for (int i = 0; i < myList.size(); i++) {
      System.out.println(myList.get(i));
    }

    myList.add("ABS");
    myList.add("ABS");
    myList.add("ABS");
    System.out.println("index Of: " + myList.indexOf("ABS"));
    System.out.println("last index Of: " + myList.lastIndexOf("ABS"));

    System.out.println("contains: " + myList.contains("CBD"));

    System.out.println("is empty: " + myList.isEmpty());

    System.out.println("sub list: " + myList.subList(1, 3));
    for (int i = 0; i < myList.size(); i++) {
      System.out.println(">>> " + myList.get(i));
    }

    myList.clear();

    System.out.println("size: " + myList.size());
    System.out.println("is empty: " + myList.isEmpty());
  }
}
