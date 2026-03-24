package com.practice.threads;

import java.util.ArrayList;
import java.util.List;

public class ExtendsThread {

	public static void main(String[] args) {

		Customer c1 = new Customer();
		c1.setId(1);
		c1.setName("first empl");
		Customer c2 = new Customer();
		c2.setId(1);
		c2.setName("second empl");
		Customer c3 = new Customer();
		c3.setId(1);
		c3.setName("third empl");
		List<Customer> list = new ArrayList<Customer>();
		list.add(c3);
		list.add(c2);
		list.add(c1);
		for (int i = 0; i < list.size(); i++) {
			TriggerEmail t = new TriggerEmail(list.get(i));
			t.start();
		}

	}

}
