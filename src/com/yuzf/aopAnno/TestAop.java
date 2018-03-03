package com.yuzf.aopAnno;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {

	
	
	@Test
	public void testAop() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("anno3.xml");
		Book book = (Book) applicationContext.getBean("book");
		book.add();
	}
	
}
