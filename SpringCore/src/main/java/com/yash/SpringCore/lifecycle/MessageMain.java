package com.yash.SpringCore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageMain 
{
public static void main(String args[])
{
	AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/yash/SpringCore/lifecycle/messageconfig.xml");
	Message message=(Message) context.getBean("p1");
	System.out.println(message);
	context.close();
}
}
