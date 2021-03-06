package com.mvc.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.unitils.UnitilsJUnit4;
import org.unitils.spring.annotation.SpringApplicationContext;
import org.unitils.spring.annotation.SpringBean;
import org.unitils.spring.annotation.SpringBeanByType;

import com.mvc.controller.UserController;
import com.mvc.model.User;

public class UnitilsTestSpring  extends UnitilsJUnit4{
	
	@SpringApplicationContext("servlet-context.xml")
	private ApplicationContext applicationContext;
	
	@SpringBeanByType
	private UserController userController;
	
	@Test
	public void test1(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("servlet-context.xml");
		UserController userController = ac.getBean(UserController.class);
		User user = new User(10,"name","password");
		userController.getUser(user);
	}
}
