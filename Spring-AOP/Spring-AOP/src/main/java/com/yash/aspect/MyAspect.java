package com.yash.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
/**
 * 
 * @author harshada.buchude
 *
 */
@Aspect
public class MyAspect {
	Logger logger = Logger.getLogger(MyAspect.class);
	@Before("execution(* com.yash.service.EmployeeService.List(..))")
	public void PrintBefore()
	{
		logger.info("Collect the information of employee...............");
	}
	@After("execution(* com.yash.service.EmployeeService.List(..))")
	public void PrintAfter()
	{
		logger.info("this is after method.......");
	}
}
