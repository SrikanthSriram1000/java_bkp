package com.DSA.internalimpl.collection;

import java.util.Arrays;

public class CustomArralyListClass {
	Object[] arrayObj = null;
	int index = 0;

	public CustomArralyListClass(int length) {
		arrayObj = new Object[length];
	}

	public void add(Object obj) {
		//2nd step of coding --if index is greater than the length mentioned in array i.e., int a[] =new int[5-->this one];
		if (index >= arrayObj.length) {
			int newlength = arrayObj.length + 
							(arrayObj.length / 2);// this is increasign the size to 50 % same as
																	// arraylist
			//this one 
			arrayObj = Arrays.copyOf(arrayObj, newlength);
			//or below code--but below is good for understanding
//			Object[] oa = new Object[newlength];
//			for (int i = 0; i < arrayObj.length; i++) {
//				oa[i]=arrayObj[i];
//			}
//			arrayObj=oa;
		}
		//step 1 of code
		arrayObj[index] = obj;
		index++;

	}

	public Object get(int arrayIndex) {
		return arrayObj[arrayIndex];

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		for (int i = 0; i < arrayObj.length; i++) {
			if (i == (arrayObj.length - 1)) {
				builder.append(arrayObj[i]);
			} else {
				if (null != arrayObj[i]) {
					builder.append(arrayObj[i] + ",");
				}

			}

		}
		builder.append("]");
		return builder.toString();
	}

	public void remove(int indexRemove) {
		for (int i = indexRemove; i < arrayObj.length; i++) {
			if (i+1 == arrayObj.length) {
				arrayObj[indexRemove]=null;
			}else {
				arrayObj[indexRemove] = arrayObj[indexRemove + 1];
			}

		}

	}
}
