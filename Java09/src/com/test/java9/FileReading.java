package com.test.java9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) throws IOException {

		try (var bufferedReader = new BufferedReader(new FileReader("C:\\Users\\ssrik\\OneDrive\\Desktop\\practice\\pending topics.txt"))) {
			while (bufferedReader.readLine() != null) {
				String line1=bufferedReader.readLine();
				System.out.println(line1);
			}
		}
		
	}

}
