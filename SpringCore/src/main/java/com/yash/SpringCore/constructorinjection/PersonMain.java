package com.yash.SpringCore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =new ClassPathXmlApplicationContext("com/yash/SpringCore/constructorinjection/ciconfig.xml");
		Person person=(Person) context.getBean("person");
		System.out.println(person);
	}

}
