package com.yash.SpringCore.constructorinjection;

public class Person 
{
private int id;
private String name;
/**
 * @param id
 * @param name
 */
public Person(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + "]";
}

}
