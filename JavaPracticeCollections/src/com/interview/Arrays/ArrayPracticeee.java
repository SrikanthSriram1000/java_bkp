package com.interview.Arrays;

import java.util.Iterator;

public class ArrayPracticeee {

	public static void main(String[] args) {

		String[] str= {"sri","ram","sri","kanth"};
		str[0]="sree";//this replaces
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
		
		//*****************
		//*****************
		//*****************
		//*****************
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		System.out.println(myNumbers[1][2]); // Outputs 7
		//*****************
		//*****************
		//*****************
		//*****************
		 int[][] myNumberss = { {1, 2, 3, 4}, {5, 6, 7} };
	     for (int i = 0; i < myNumberss.length; ++i) {
	        for(int j = 0; j < myNumberss[i].length; ++j) {
	           System.out.print(myNumberss[i][j]);
	        }
	          System.out.println();
	     }
	}

}
