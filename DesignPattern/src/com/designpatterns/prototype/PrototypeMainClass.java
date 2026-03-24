package com.designpatterns.prototype;

public class PrototypeMainClass {
	public static void main(String[] args) {
		ActualClass actualClass = new ActualClass();
		CloneClass class1 = new CloneClass();
		class1.getInstance(actualClass);
	}

	

}
