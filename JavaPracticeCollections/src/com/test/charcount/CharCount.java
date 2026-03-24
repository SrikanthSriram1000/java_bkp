package com.test.charcount;

import java.util.HashMap;
import java.util.Map;

public class CharCount {

	public static void main(String[] args) {
		  String str = "abracadabra";
	        printCharCount(str);
	    }

	    public static void printCharCount(String str) {
	        Map<Character, Integer> charCountMap = new HashMap<>();
	        System.out.println(str);
	        for (char c : str.toCharArray()) {
	        	System.out.println(c +" ="+charCountMap.get(c));
	            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
	        }

	        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	    }
	}
