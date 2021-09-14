package com.yash.SpringCore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductMain 
{
public static void main(String args[])
{
	AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/yash/SpringCore/lifecycle/lifecycleconfig.xml");
	Product product=(Product) context.getBean("p1");
	System.out.println(product);
	
	context.registerShutdownHook();//this method is required to call destroy method
}
}
