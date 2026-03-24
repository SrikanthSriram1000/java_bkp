package com.test.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

import com.test.resouceutil.Employee;
//Collectors.groupingBy				-->.collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()))
//Collectors.counting				-->.collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()))
//Collectors.averagingInt(function) -->.collect(Collectors.groupingBy(e -> e.getGender(), Collectors.averagingInt(e -> e.getAge())))
//Collectors.maxBy(comparator)		-->.collect(Collectors.groupingBy(e -> e.getDeptName(), Collectors.maxBy((x, y) -> Integer.compare(x.getAge(), y.getAge()))));
//Collectors.filtering		 -->.collect(Collectors.groupingBy(e->e.getSalary(),Collectors.filtering(s->s.getSalary() >60000, Collectors.toList()))
//Collectors.partitioningBy       -->collect(Collectors.partitioningBy(i->i%2==0))
//Collectors.joining              -->collect(Collectors.joining(","))

//Collectors.toMap                -->(keyMapper(function),valueMapper(function),mergeFunction)
									//.collect(Collectors.toMap(Employee::getId,Employee::getName, (existing, replacement) -> existing));
//Collectors.toConcurrentMap   -->(keyMapper(function),valueMapper(function),mergeFunction)
									//.collect(Collectors.toConcurrentMap(Employee::getId,Employee::getName, (existing, replacement) -> existing));
public class HashMapTest {
	// ::::dept wise employee list --i.i--//find count of employees in an
	// dept-i.i2-filter- // find list of employee whose salary is >50,000
	// :::: department wise count
	// ::::which department has max employees
	// ::::average age of all employees
	// ::::average age of male and female employee
	// ::::find the highest age /highest rank in each department
	// ::::max min avg
	public static void main(String[] args) {
		List<Employee> employees = extracted();
		// ::::dept wise employee list
		Map<String, List<Employee>> map22 = employees.stream()
				.collect(Collectors.groupingBy(e->e.getDeptName(), Collectors.toList()));
		System.out.println("map22 -->"+map22);
		// :::: department wise count
		Map<String, Long> deptWiseCounting = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()));
	
		deptWiseCounting.forEach((x,y)->System.out.println("value is"+y +"key is "+x) );
		
		List<Employee> studentsWithDuplicates = List.of(
			    new Employee(1, "Alice"),
			    new Employee(2, "Bob"),
			    new Employee(1, "David") // Duplicate key "1"
			);
		List<Employee> strCompareList=studentsWithDuplicates.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName()))
				.collect(Collectors.toList());
		System.out.println(" strCompareList "+strCompareList);
		// Comparator.comparing with out method reference
		List<Employee> nameList = studentsWithDuplicates.stream().sorted(Comparator.comparing(e -> e.getId()))
				.collect(Collectors.toList());
		List<Employee> nameAndThenSalList=studentsWithDuplicates.stream().sorted(Comparator.comparing(Employee::getId)
				.thenComparing(Employee::getSalary)).collect(Collectors.toList());
		System.out.println(" nameAndThenSalList "+nameAndThenSalList);
		List<Employee> sortedList = studentsWithDuplicates.stream() .sorted(Comparator.comparing(e -> ((Employee) e).getId())
				.thenComparing(e -> ((Employee) e).getSalary())) .collect(Collectors.toList());
		System.out.println(" sortedList "+sortedList);
		Map<Integer, String> assigningOldValuesToduplicateKeys = studentsWithDuplicates.stream()
				.collect(Collectors.toMap(Employee::getId,Employee::getName, (existing, replacement) -> replacement));
		
		Map<Object, Integer> increasingCountEveryTimeSameNameGetsAddSAMEASCOUNTING = studentsWithDuplicates.stream()
				.collect(Collectors.toMap(x->x.getName(),x->x.getId(), (existing, replacement) -> existing+replacement));
		
		ConcurrentMap<Integer, String> assigningOldValuesToduplicateKeys2 = studentsWithDuplicates.stream()
				.collect(Collectors.toConcurrentMap(Employee::getId,Employee::getName, (existing, replacement) -> existing));
		System.out.println(" assigningOldValuesToduplicateKeys "+assigningOldValuesToduplicateKeys);
		System.out.println(" increasingCountEveryTimeSameNameGetsAddSAMEASCOUNTING "+increasingCountEveryTimeSameNameGetsAddSAMEASCOUNTING);

//1 way- don't like
//		Map.Entry<String, Long> mapComparingValue = employees.stream()
//				.collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting())).entrySet().stream()
//				.max(Map.Entry.comparingByValue()).get();

		//// 2nd way- length process
//		Map.Entry<String, Long> mapComparingValue2 = employees.stream()
//				.collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting())).entrySet().stream()
//				.max(new Comparator<Map.Entry<String, Long>>() {
//
//					@Override
//					public int compare(Entry<String, Long> x, Entry<String, Long> y) {
//						return (x.getValue() < y.getValue()) ? -1 : ((x.getValue() == y.getValue()) ? 0 : 1);
//					}
//
//				}).get();
		/// 3nd way- bit length process

//		Map.Entry<String, Long> mapComparingValue3 = employees.stream()
//				.collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting())).entrySet().stream()
//				.max((x, y) -> (x.getValue() < y.getValue()) ? -1 : ((x.getValue() == y.getValue()) ? 0 : 1)).get();
		/// 4th way- good --i liked it
		Map.Entry<String, Long> mapComparingValue4 = employees.stream()
				.collect(Collectors.groupingBy(e->e.getName(), Collectors.counting())).entrySet().stream()
				.max((x, y) -> Long.compare(x.getValue(), y.getValue())).get();
		
		Map<String, Long> map4 = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()));
		System.out.println("map4  "+map4);
		
		HashMap<String, Long> temp  = map4.entrySet().stream().sorted((i1, i2)-> i2.getKey().compareTo(i1.getKey()))
				.collect(Collectors.toMap(
                 x->x.getKey(),
                 x->x.getValue(),
                 (e1, e2) -> e1,
                 () -> new LinkedHashMap<>()));
		System.out.println("temp  "+temp);
		
		
		Set<Entry<String, Long>> entrySet=map4.entrySet();
		Iterator<Entry<String, Long>> itr=entrySet.iterator();
		while (itr.hasNext()) {
			Entry<String, Long> entry = itr.next();
			System.out.println("key is " + entry.getKey());
			System.out.println("value is " + entry.getValue());
		}
		
		
	//this is also works --just tried
		List deptWithHighestEmployees=deptWiseCounting.entrySet().stream().sorted((e1,e2)->Long.compare(e2.getValue(), e1.getValue())).limit(1).collect(Collectors.toList());
		System.out.println(" deptWithHighestEmployees"+deptWithHighestEmployees);
		System.out.println("mapComparingValue4  " + mapComparingValue4);

		// ::::average age of all employees
		double avgAge = employees.stream().mapToInt(x -> x.getAge()).average().orElse(0);
	
		
		System.out.println("avgAge :" + avgAge);
		// ::::average age of male and female employee
		Map<Object, Double> genderMap = employees.stream()
				.collect(Collectors.groupingBy(e -> e.getGender(), Collectors.averagingInt(e -> e.getAge())));
		Map<Object, Optional<Employee>> maxAgeDeptWise = employees.stream().collect(Collectors
				.groupingBy(e -> e.getDeptName(), Collectors.maxBy((x, y) -> Integer.compare(x.getAge(), y.getAge()))));
		
		
		Map<String, Optional<Employee>> maxSalDeptWise = employees.stream().collect(Collectors
				.groupingBy(e -> e.getDeptName(), Collectors.maxBy((x, y) -> Double.compare(x.getSalary(), y.getSalary()))));
		
		List<Entry<String, Long>> deptWiseMaxEmployee =employees.stream().collect(Collectors.
				groupingBy((x->x.getDeptName()),
				Collectors.counting())).entrySet().stream().sorted((a,b)->Long.compare(a.getValue(), b.getValue())).limit(1).collect(Collectors.toList());;
		
				for(Entry<String,Long> e:deptWiseMaxEmployee) {
					System.out.println("key &&&&&&"+e.getKey());
					System.out.println("Value &&&&&&"+e.getValue());
					
				}
				
		Map<Object, Double> maxSalDeptWise1 = employees.stream().collect(Collectors
				.groupingBy(e -> e.getDeptName(), Collectors.averagingDouble(e->e.getSalary())));
//maxAgeDeptWise :
		//{CSE=Optional[Employee [id=4, name=reddy, salary=80000.0, age=30, deptName=CSE, gender=F,phoneNumbers=[7654321098, 5432109876]]], 
		//IT=Optional[Employee [id=3, name=srikanth, salary=50000.0, age=100, deptName=IT, gender=M, phoneNumbers=[9876543210, 5432109876]]]}

		System.out.println("maxAgeDeptWise :" + maxAgeDeptWise);
		System.out.println("maxSalDeptWise *** :" + maxSalDeptWise);
		//// ::::find the highest age /highest rank in each department
		int maxAge = employees.stream().mapToInt(e -> e.getAge()).summaryStatistics().getMax();
		System.out.println("maxAge :" + maxAge);
		List<Employee> listEmp = employees.stream().skip(2).limit(3).collect(Collectors.toList());
		System.out.println("listEmp  " + listEmp);

		List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8);
		Map<Boolean, List<Integer>> partitionMap = integers.stream()
				.collect(Collectors.partitioningBy(i -> i % 2 == 0));
		System.out.println("partitionMap :" + partitionMap);
		
		List<String> strIntegersList = List.of("1", "2", "3", "4", "5", "6", "7", "8");
		employees.stream().mapToInt(x->x.getAge()).summaryStatistics();
		Integer.parseInt("1");
		strIntegersList.stream().mapToInt(a->Integer.parseInt(a)).summaryStatistics();
		integers.stream().filter(i->(i%2==0) && (i >3)).forEach(c->System.out.println("&& in a filter "+c));
		List<String> nameList1= List.of("srikanth","sriram");
		String name=nameList1.stream().collect(Collectors.joining(","));
		System.out.println("combined anme is "+name);
		
		Map<Double,List<Employee>> salaryWiseFiltering=employees.stream()
															.collect(Collectors.groupingBy(e->e.getSalary(),
																			Collectors.filtering(s->s.getSalary() >60000, Collectors.toList())));
		System.out.println("salaryWiseFiltering  "+salaryWiseFiltering);
		employees.stream().flatMap(e->e.getPhoneNumbers().stream()).forEach(c->System.out.println("combined anme is "+c));
		
		//employees.stream() .flatMap(emp -> emp.getMobileNumbers() .stream() .map(mobile -> emp.getName() + " (" + emp.getId() + ") -> " + mobile)) .forEach(System.out::println);
	}

	private static List<Employee> extracted() {
		List<String> listOfPhoneNumbers1 = List.of("9876543210", "5432109876");
		List<String> listOfPhoneNumbers2= List.of("5432109876","9876543210");
		List<String> listOfPhoneNumbers3= List.of("5432109876","9876543210","7654321098");
		List<String> listOfPhoneNumbers4= List.of("7654321098","5432109876");
		Employee e1 = new Employee(3, "srikanth", 50000, 100, "IT", "M",listOfPhoneNumbers1);
		Employee e2 = new Employee(1, "sriram", 60000, 25, "IT", "M",listOfPhoneNumbers2);
		Employee e5 = new Employee(5, "patel", 90000, 45, "IT", "M",listOfPhoneNumbers3);
		Employee e3 = new Employee(2, "kumar", 90000, 28, "CSE", "F",listOfPhoneNumbers4);
		Employee e4 = new Employee(4, "reddy", 80000, 30, "CSE", "F",listOfPhoneNumbers4);
		List<Employee> empList = List.of(e1, e2, e3, e4, e5);
		return empList;
	}
}
