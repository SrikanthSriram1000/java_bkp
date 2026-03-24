package com.designpatterns.prototype;

public class ActualClass implements Cloneable, CloneInterface {
	@Override
	public ActualClass getInstance(ActualClass actualClass) {
		if (actualClass == null) {
			actualClass = new ActualClass();
		} else {
			try {
				actualClass.clone();
				System.out.println("in clone method..");
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return actualClass;
	}

}