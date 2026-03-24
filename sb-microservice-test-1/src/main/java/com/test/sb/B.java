package com.test.sb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class B {
@Autowired
@Lazy
	public A a;
}
