package com.yuzf.anno;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "SimpleAnno")
@Scope(value = "prototype") //配置对象是单例模式还是原型模式
public class SimpleAnno {
	
	public void add() {
		System.out.println("add.....");
	}
	
}
