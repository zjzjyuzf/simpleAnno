package com.yuzf.anno;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {
	
//	@Autowired
//	private UserDao userDao;
	
	@Resource(name = "userDao")
	private UserDao userDao;
	
	public void say() {
		System.out.println("say....service....");
		userDao.say();
	}
	
}
