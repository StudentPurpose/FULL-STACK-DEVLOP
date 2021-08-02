package com.slokam.edu.learning.controller;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AroundClassMethod {
	private Logger LOGGER=LoggerFactory.getLogger(AroundClassMethod.class);
	@Around("execution (* com.slokam.edu.learning.*.*.*(..))")
	public Object aroundMethod(ProceedingJoinPoint pjp)
	{
		long start=System.currentTimeMillis();
		Object obj=null;
		try
		{
			obj=pjp.proceed();
		}
		catch(Throwable e)
		{
			e.printStackTrace();
		}
		long end=System.currentTimeMillis();
		long timetaken=end-start;
		String methodName=pjp.getSignature().getName();
		String className=pjp.getTarget().getClass().getName();
		LOGGER.info("time taken by the method"+methodName+"in the class"+className+"is "+timetaken);
		return obj;
	}
}
