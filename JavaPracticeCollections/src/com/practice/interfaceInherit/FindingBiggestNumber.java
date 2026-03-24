package com.practice.interfaceInherit;

import java.util.ArrayList;
import java.util.List;

public class FindingBiggestNumber {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 0;
		List<Integer> l = new ArrayList<>();
		l.add(a);
		l.add(b);
		l.add(c);
		int j = 1;
		for (int i = 0; i < l.size(); i++) {
			if (l.size()   != j) {
				if (l.get(i) > l.get(i + 1)) {
					d = l.get(i);
					System.out.println("d "+d);

				}else {
					d = l.get(i+1);
				}
			}else if(l.size()   == j) {
				
				if (l.get(i-1) > l.get(i)) {
					d = l.get(i);
					System.out.println("dd "+d);

				}
			}
			j++;
		}
		System.out.println("the biggest number is =" + d);
	}
}
