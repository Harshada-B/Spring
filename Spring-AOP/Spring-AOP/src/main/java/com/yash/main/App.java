package com.yash.main;
import org.apache.log4j.BasicConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.service.EmployeeService;
/**
 * main class Aop concept
 * @author harshada.buchude
 *
 */
public class App {
	public static void main(String[] args) {
		BasicConfigurator.configure();
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/yash/main/config.xml");
		EmployeeService emps=appContext.getBean("Employee",EmployeeService.class);
		emps.List(101 ,"harshada");
	}
}