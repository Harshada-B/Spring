package com.yash.springdatajpa.repository;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.yash.springdatajpa.model.Employee;
@DataJpaTest
public class EmployeeRepositoryTest {
	
	@Autowired
	private EmployeeRepository employeerepository;
	@Test
	public void saveEmployeetest() {
		Employee emp=new Employee(1,"harshada","hr");
		employeerepository.save(emp);
		assertNotNull(emp);
		assertTrue(emp.getId()>0);
	}

}
