package com.yuzf.aopAnno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyBook {

	@Before(value="execution(* com.yuzf.aopAnno.Book.*(..))")
	public void before() {
		System.out.println("before...");
	}
	
	@Around(value="execution(* com.yuzf.aopAnno.Book.*(..))")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("around!!!");
		joinPoint.proceed();
		System.out.println("around???");
	}
}
