package com.yash.SpringCore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeCollectionMain {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ApplicationContext context =new ClassPathXmlApplicationContext("com/yash/SpringCore/collection/collectionconfig.xml");
		Employeecollection employee=(Employeecollection) context.getBean("Employee");
		System.out.println(employee.getE_name());
		System.out.println(employee.getMobileno());
		System.out.println(employee.getAddresses());
		System.out.println(employee.getCourses());
	}

}
