package com.test.practice;

import java.time.LocalDate;
import java.util.Date;

public class StrToDate {

	public static void main(String[] args) {

		String str = "2024-06-01";
		String[] parts = str.split("-");
		int year = Integer.parseInt(parts[0]);
		int month = Integer.parseInt(parts[1]);
		int day = Integer.parseInt(parts[2]);
		System.out.println("str date: " + str);
		LocalDate localDate = LocalDate.of(year, month, day);
		System.out.println("LocalDate: " + localDate);	
	}

}
