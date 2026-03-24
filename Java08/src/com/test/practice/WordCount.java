package com.test.practice;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class WordCount {
    public static void main(String[] args) {
       extracted();
    }

	private static void extracted() {
		List<String> strings = Arrays.asList("java scala ruby", "java react spring java");
		   String word = "java";
		   long count = strings.stream()
		                       .flatMap(s -> Arrays.stream(s.split(" ")))
		                       .filter(w -> w.equals(word))
		                       .count();
		   System.out.println("Occurrences of \"" + word + "\": " + count);
	}
	
	private static void extracted1() {
		List<String> s = Arrays.asList("java scala ruby", "java react spring java");
		   String word = "java";
//using normal java
			int count = 0;
			//using normal for loop
			for (int i = 0; i < s.size(); i++) {
				String[] words = s.get(i).split(" ");
				//using normal for loop
				for (int j = 0; j < words.length; j++) {
					if (words[j].equals(word)) {
						count++;
					}
				}
			}
			System.out.println("Occurrences of \"" + word + "\": " + count);
	}
}