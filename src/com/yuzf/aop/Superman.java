package com.yuzf.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class Superman {
	public void before() {
		System.out.println("before...");
	}
	
	public void around(ProceedingJoinPoint proceedingJoinPoint) {
		System.out.println("环绕前。。。。。。。。");
		
		
		System.out.println("环绕后。。。。。。。。。。");
	}
}
