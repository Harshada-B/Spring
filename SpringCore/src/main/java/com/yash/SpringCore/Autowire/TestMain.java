package com.yash.SpringCore.Autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String args[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("com/yash/SpringCore/Autowire/annotaion.xml");
		Employee emp=(Employee) context.getBean("emp",Employee.class);
		System.out.println(emp);
	}

}
