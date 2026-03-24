package com.test.java9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SampleTest {

	public static void main(String[] args) throws IOException {

		BufferedReader  bufferedReader = new BufferedReader(new FileReader("C:\\Users\\ssrik\\Downloads\\Telegram Desktop\\01-Mini Project .pdf"));
		String line;
        // Read lines until the end of the file (readLine() returns null)
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
	}	

}
