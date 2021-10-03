package com.yash.ems.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.yash.ems.daoimpl.EmployeeDaoImpl;
import com.yash.ems.model.Employee;

public class EmployeeDaoTest {
	private DriverManagerDataSource datasource;
	private EmployeeDao dao;
	@Test
	public void testSave() {
		datasource= new DriverManagerDataSource();
		datasource.setDriverClassName("com.mysql.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/test");
		datasource.setUsername("root");
		datasource.setPassword("root");

		dao=new EmployeeDaoImpl(datasource);
		
		Employee employee=new Employee("madhavi",90000,"Abc","Hr","karanataka");
		int result=dao.save(employee);
		
		assertTrue(result>0);
	}
	@Test
	public void testUpdate() {
		datasource= new DriverManagerDataSource();
		datasource.setDriverClassName("com.mysql.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/test");
		datasource.setUsername("root");
		datasource.setPassword("root");

		dao=new EmployeeDaoImpl(datasource);
		
		Employee employee=new Employee(1,"ushashree",10000,"Abc","Hr","up");
		int result=dao.update(employee);
		
		assertTrue(result>0);
	}

	@Test
	public void testDelete() {
		datasource= new DriverManagerDataSource();
		datasource.setDriverClassName("com.mysql.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/test");
		datasource.setUsername("root");
		datasource.setPassword("root");

		dao=new EmployeeDaoImpl(datasource);
		
		int id=5;
		int result=dao.delete(id);
		
		assertTrue(result>0);
	}

}
