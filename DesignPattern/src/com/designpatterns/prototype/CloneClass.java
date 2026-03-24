package com.designpatterns.prototype;

public class CloneClass implements CloneInterface{

	@Override
	public ActualClass getInstance(ActualClass actualClass)  {
		return actualClass.getInstance(actualClass);
	}

}