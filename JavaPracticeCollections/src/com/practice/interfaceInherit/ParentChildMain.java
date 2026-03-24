package com.practice.interfaceInherit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParentChildMain {
public static void main(String[] args) {
	ParentClass p = new ChildClass();
	System.out.println(p.index);
	System.out.println(p.sayHi());
	
	Map map = new HashMap<String,String>();
		map.put("1","1");	
		map.put("2","2");
		map.put("3","3");
		map.remove("2");
		System.out.println(map);
		
		List list = new ArrayList<>();	
		list.add("JAVA");
		list.add("JAVA");
		list.add("JSP");
		list.add("JAVA");
		System.out.println(list.indexOf("JAVA"));
		System.out.println(list.lastIndexOf("JAVA"));
}
}
