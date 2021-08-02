package com.slokam.edu.learning.controller;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
	private Logger LOGGER=LoggerFactory.getLogger(LoggingAspect.class);
	
	@Before("execution(* com.slokam.edu.learning.*.*.*(..))")
	public void beforeMethod(JoinPoint joinPoint)
	{
		String methodName=joinPoint.getSignature().getName();
		String className=joinPoint.getTarget().getClass().getName();
		LOGGER.info("ENTER INTO THE METHOD"+methodName+"        "+className);
		
	}
	@After("execution(* com.slokam.edu.learning.*.*.*(..))")
	public void AfterMethod(JoinPoint joinPoint)
	{
		String methodName=joinPoint.getSignature().getName();
		String className=joinPoint.getTarget().getClass().getName();
		LOGGER.info("exit from the method"+methodName+"        "+className);

		
	}

}
