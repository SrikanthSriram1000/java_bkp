package com.test.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {
public static void main(String[] args) {
	List<String> fruits = new ArrayList<>();  
	fruits.add("Apple"); 	 
	fruits.add("Banana");  
	fruits.add("Orange");  
	ListIterator<String> listIterator = fruits.listIterator();  
	while (listIterator.hasNext()) {  
	    String fruit = listIterator.next();  
	    System.out.println("forward ="+fruit);  
	}  
	System.out.println("==============\n");
	while (listIterator.hasPrevious()) {  
	    String fruit = listIterator.previous();
	    System.out.println("recerse ="+fruit);
	}  
}
}
