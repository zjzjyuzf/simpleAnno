package com.yuzf.anno;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDao {

	public void say() {
		System.out.println("say....dao.....");
	}
	
}
