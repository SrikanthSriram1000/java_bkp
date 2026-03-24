package com.test.collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectTest {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Srikanth");
		list.add("Sriram");
		list.add("Reddy");
		String name="srikanthhhhh";
		String[] strArray=name.split("");
		List<String> listStr=Arrays.asList(strArray);
		System.out.println(listStr);

	  list.stream().collect(Collectors.joining(",  ")).toString();
	  Map<String,Long> map=	Arrays.stream(strArray).collect(Collectors.groupingBy(x->x,Collectors.counting()));
	  System.out.println(" map  "+map);
	 Map<String,Long> map2= map.entrySet().stream().sorted((e1,e2)->Long.compare(e2.getValue(), e1.getValue()))
			 .collect(Collectors.toMap(e->e.getKey(),
					 e->e.getValue(),
					 (oldValue, newValue) -> oldValue, 
					 LinkedHashMap::new))
			 ;
	System.out.println(" map 2-->"+map2.entrySet().iterator().next()); 
	
	Map<Integer,String> map22 =new HashMap<>();
	map22.put(1, "Srikanth");
	map22.put(2, "Sriram");
	map22.put(3, "ReddyOld");
	map22.put(3, "ReddyNew");
	Set<Map.Entry<Integer,String>> set=map22.entrySet();
	Iterator itr=set.iterator();
	while ( itr.hasNext()) {
		Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) itr.next();
		System.out.println(" key  " + entry.getKey() + " value  " + entry.getValue());
	}
	Map<Integer, String> map23 = map22.entrySet().stream().sorted((e1, e2) -> e1.getValue().compareTo(e2.getValue()))
			.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (oldValue, newValue) -> newValue,
					LinkedHashMap::new));
	System.out.println("map23  "+map23);
	
	//highest paid employee
	
	}
}
