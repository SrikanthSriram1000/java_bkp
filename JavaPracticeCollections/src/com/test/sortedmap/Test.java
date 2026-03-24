package com.test.sortedmap;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Stream;

public class Test {

   public static void main(String args[]) {
      // Create a hash map
      SortedMap<String, Double> map = new TreeMap<>();

      // Put elements to the map
      map.put("Zara", Double.valueOf(3434.34));
      map.put("Mahnaz", Double.valueOf(123.22));
      map.put("Ayan", Double.valueOf(1378.00));
      map.put("Daisy", Double.valueOf(99.22));
      map.put("Qadir", Double.valueOf(-19.08));
      
      // Get a set of the entries
      Set<Map.Entry<String, Double>> set = map.entrySet();
      System.out.println("set ..+"+set);
      
      // Get an iterator
      Iterator<Map.Entry<String, Double>> i = set.iterator();
     
      // Display elements 
      while(i.hasNext()) {
         Map.Entry<String, Double> me = i.next();
         System.out.print(me.getKey() + ": ");
         System.out.println(me.getValue());
      }
      
      Set<Map.Entry<String, Double>> set2 = map.entrySet();
      List<Map.Entry<String, Double>> ll = new LinkedList<>(set2);
      System.out.println("..."+ll);
      Collections.sort(ll,new Comparator<Map.Entry<String, Double>>() {
    	  public int compare(Map.Entry<String, Double> o1, Map.Entry<String, Double> o2) {
    		  return Double.compare(o1.getValue(),o2.getValue());
    	  };
	});
      System.out.println("linked list ..+"+ll);
      Map linkedHmap = new LinkedHashMap<>();
      for(int i2=0;i2<ll.size();i2++) {
    	  linkedHmap.put(ll.get(i2).getKey(), ll.get(i2).getValue());
    	  
      }
      
      HashMap<String, String> capitalCities = new HashMap<String, String>();
      capitalCities.put("England", "London");
      capitalCities.put("Germany", "Berlin");
      capitalCities.put("USA", "Washington DC");
      capitalCities.put("Norway", "Oslo");
      
      
     Set<Map.Entry<String, String>> me= capitalCities.entrySet();
     List<Map.Entry<String, String>> ll2= new LinkedList<>(me);
     Collections.sort(ll2,(x,y)->x.getKey().compareTo(y.getKey()));
     System.out.println("ll2  .."+ll2);
   }
}