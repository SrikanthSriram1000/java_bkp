package com.DSA.internalimpl.collection;
import java.util.LinkedList;
import java.util.List;

public class ActualLinkedListMain {
  public static void main(String[] args) {
    List<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
  }
}