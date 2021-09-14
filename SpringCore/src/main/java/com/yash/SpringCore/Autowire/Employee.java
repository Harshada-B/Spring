package com.yash.SpringCore.Autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee 
{
	@Autowired
	@Qualifier("address2")//if we have more bean and want to inject one particular bean than use this annoataion
private Address address;

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

public Employee(Address address) {
	super();
	this.address = address;
}

/**
 * @return the address
 */
public Address getAddress() {
	return address;
}

/**
 * @param address the address to set
 */
public void setAddress(Address address) {
	this.address = address;
}

@Override
public String toString() {
	return "Employee [address=" + address + "]";
}

}
