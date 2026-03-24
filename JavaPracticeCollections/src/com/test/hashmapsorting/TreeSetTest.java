package com.test.hashmapsorting;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		   TreeSet<String> treeSet = new TreeSet<>();	

	        // Adding elements to the TreeSet
	        treeSet.add("Banana");
	        treeSet.add("Apple");
	        treeSet.add("Orange");
	        treeSet.add("Grapes");
	        treeSet.add(null); // This will throw NullPointerException

	        // Printing the TreeSet (elements will be sorted)
	        System.out.println("TreeSet elements: " + treeSet);

	        // Checking if an element exists
	        System.out.println("Does the set contain 'Apple'? " + treeSet.contains("Apple"));

	        // Removing an element
	        treeSet.remove("Banana");
	        System.out.println("TreeSet after removing 'Banana': " + treeSet);

	        // Getting the first and last element
	        System.out.println("First element: " + treeSet.first());
	        System.out.println("Last element: " + treeSet.last());

	        // Iterating through the TreeSet
	        System.out.println("Iterating through the set:");
	        for(String element : treeSet){
	          System.out.println(element);
	        }

	        // Clearing the TreeSet
	        treeSet.clear();
	        System.out.println("TreeSet after clearing: " + treeSet);
	}

}
