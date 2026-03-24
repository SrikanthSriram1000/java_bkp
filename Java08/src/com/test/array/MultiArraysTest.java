package com.test.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MultiArraysTest {

	public static void main(String[] args) {

		Integer[] array1 = { 1, 2, 3, 4 };
		Integer[] array2 = { 4, 5, 6 };
		List<Integer> list22 =List.of(1,2,3,4);
		List<Integer> list = Arrays.asList(array2);
		List list2 = Arrays.stream(array1).filter(x -> list.contains(x)).collect(Collectors.toList());
		System.out.println(list2);
		int number=Arrays.stream(array1).reduce((a,b)->a*b).get();
		boolean b=Arrays.stream(array1).allMatch(x->x>0);
		
		boolean b2=Arrays.stream(array1).noneMatch(x->x>0);
		//findfirst
		//findany
		
		list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		Optional<Integer> maxNumber=Arrays.stream(array1).max((x,y)->Integer.compare(x, y));
		Optional<Integer> maxNumber2=Arrays.stream(array1).max(Comparator.comparing(i->i));
		int maxNumber222=Arrays.stream(array1).mapToInt(x->x).summaryStatistics().getMax();
		//maxnumber ifPresent or elseget
		maxNumber.ifPresentOrElse(c->System.out.println(c), ()->System.out.println("no value found"));

		
		List<Integer> liststr=Arrays.asList(array1);
		Integer[] backToStrArray=liststr.stream().toArray(Integer[]::new);
		Integer[] backToStrArray2=liststr.stream().toArray(x -> new Integer[x]);
		
	}

}
