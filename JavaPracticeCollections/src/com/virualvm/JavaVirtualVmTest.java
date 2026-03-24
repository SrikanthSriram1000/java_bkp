package com.virualvm;

import java.util.ArrayList;
import java.util.List;

public class JavaVirtualVmTest {

	public static void main(String[] args) {
		System.out.println("Java Virtual Machine Test Started");
		List<UserTest> userList = new ArrayList<>();
		for (int i = 0; i < 1000000; i++) {
			userList.add(new UserTest("User" + i, i));
		}
		System.out.println("Java Virtual Machine Test Ended");
	}

}
