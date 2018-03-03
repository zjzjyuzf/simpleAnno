package com.yuzf.aopAnno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyBook {

	@Before(value="execution(* com.yuzf.aopAnno.Book.*(..))")
	public void before() {
		System.out.println("before...");
	}
	
}
