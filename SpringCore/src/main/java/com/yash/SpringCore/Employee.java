package com.yash.SpringCore;

public class Employee 
{
int E_id;
String E_name;
String E_city;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int e_id, String e_name, String e_city) {
	super();
	E_id = e_id;
	E_name = e_name;
	E_city = e_city;
}
/**
 * @return the e_id
 */
public int getE_id() {
	return E_id;
}
/**
 * @param e_id the e_id to set
 */
public void setE_id(int e_id) {
	E_id = e_id;
}
/**
 * @return the e_name
 */
public String getE_name() {
	return E_name;
}
/**
 * @param e_name the e_name to set
 */
public void setE_name(String e_name) {
	E_name = e_name;
}
/**
 * @return the e_city
 */
public String getE_city() {
	return E_city;
}
/**
 * @param e_city the e_city to set
 */
public void setE_city(String e_city) {
	E_city = e_city;
}
@Override
public String toString() {
	return "Employee [E_id=" + E_id + ", E_name=" + E_name + ", E_city=" + E_city + "]";
}
}
