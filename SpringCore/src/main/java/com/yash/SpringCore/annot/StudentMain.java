package com.yash.SpringCore.annot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/yash/SpringCore/annot/studentconfig.xml");
		Student student=context.getBean("student",Student.class);
		System.out.println(student);
		System.out.println(student.getAddress());

	}

}
