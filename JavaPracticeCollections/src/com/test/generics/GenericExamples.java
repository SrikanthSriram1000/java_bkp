package com.test.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericExamples {
	public static void main(String[] args) {
//		 that are a superclass of T. 
		//If T is Integer, then List<? super T> could be List<Integer>, List<Number> or List<Object>.
		//The code below shows the use of the merge method. In line 6, T is Integer and "? super T" is Number. In line 10, T is Number and "? super T" is Object.
		List<? super Integer> aNums = new ArrayList<Number>() ;	
	}
}
