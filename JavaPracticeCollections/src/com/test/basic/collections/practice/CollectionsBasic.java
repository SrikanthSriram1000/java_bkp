package com.test.basic.collections.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsBasic {
	public static void main(String[] args) {
		
		int[] i = new int[5];
		i[0] = 1;
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}
		
		
		List<Pair<String, String>> dataList = new ArrayList<>();
		Pair<Integer, String> s = new Pair<Integer, String>(null, null);
        // Add elements
        dataList.add(new Pair<>("Name", "Alice"));
        dataList.add(new Pair<>("ID", "XYZ789"));
        dataList.add(new Pair<>("Department", "Engineering"));

        // Iterate and access elements
        for (Pair<String, String> pair : dataList) {
            System.out.println(pair.getKey() + " -> " + pair.getValue());
        }
        Set<String> set= new HashSet<String>();	
	}
}
