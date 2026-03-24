package com.sriram.class12.practice.corejava.examples.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Aspect	
@Configuration

public class InvoiceAspect {
	@Pointcut("execution(public void com.sriram.class12.practice.corejava.examples.ExceptionController.sucessCase())")
	public void p1() { }
	
	@AfterReturning("p1()")
	public void commitTransaction() {
		System.out.println("Transaction committed !");
	}
}