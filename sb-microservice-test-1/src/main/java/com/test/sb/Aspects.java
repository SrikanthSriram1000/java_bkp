package com.test.sb;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aspects{	
	
private static final Logger logger = LogManager.getLogger(HelloController.class);
	@Before("execution(* com.test.sb..*.*(..))")
    public void logBefore(JoinPoint joinPoint) {
		logger.info("Logging Before method: " + joinPoint.getSignature().getName());
    }
	
	@After("execution(* com.test.sb..*.*(..))")
    public void logAfter(JoinPoint joinPoint) {
		logger.info("Logging After method: " + joinPoint.getSignature().getName());
    }
}