package com.yuzf.anno;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnno {

	@Test
	public void testService() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("anno.xml");
		UserService userService = (UserService) applicationContext.getBean("userService");
		System.out.println(userService);
		userService.say();
	}
	
	@Test
	public void testAnno() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("anno.xml");
		SimpleAnno simpleAnno = (SimpleAnno) applicationContext.getBean("SimpleAnno");
		System.out.println(simpleAnno);
		simpleAnno.add();
	}
}
