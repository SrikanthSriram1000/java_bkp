package com.DSA.internalimpl.collection;

public class CustomArrayListMain {
	public static void main(String[] args) {
		CustomArralyListClass arralyListClass = new CustomArralyListClass(5);
		arralyListClass.add(1);
		arralyListClass.add(2);
		arralyListClass.add("sri");
		System.out.println("output "+arralyListClass.toString());
		System.out.println("value at index 2.. "+arralyListClass.get(2));
		arralyListClass.remove(2);
		System.out.println("remove index value at 2.. "+arralyListClass.toString());
	}

}
