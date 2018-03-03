package com.yuzf.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {

	@Test
	public void test() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("anno2.xml");
		Man man = (Man) applicationContext.getBean("man");
		man.add();
	}
	
}
