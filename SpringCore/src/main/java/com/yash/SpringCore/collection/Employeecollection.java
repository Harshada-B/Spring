package com.yash.SpringCore.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employeecollection {
	private String E_name;
	private List<String> mobileno;
	private Set<String> addresses;
	private Map<String , String> courses;
	
	public Employeecollection() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employeecollection(String e_name, List<String> mobileno, Set<String> addresses, Map<String, String> courses) {
		super();
		E_name = e_name;
		this.mobileno = mobileno;
		this.addresses = addresses;
		this.courses = courses;
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
	 * @return the mobileno
	 */
	public List<String> getMobileno() {
		return mobileno;
	}
	/**
	 * @param mobileno the mobileno to set
	 */
	public void setMobileno(List<String> mobileno) {
		this.mobileno = mobileno;
	}
	/**
	 * @return the addresses
	 */
	public Set<String> getAddresses() {
		return addresses;
	}
	/**
	 * @param addresses the addresses to set
	 */
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	/**
	 * @return the courses
	 */
	public Map<String, String> getCourses() {
		return courses;
	}
	/**
	 * @param courses the courses to set
	 */
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	
}
