package com.yash.SpringCore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Message {
	private int id;
	private String message;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Message [id=" + id + ", message=" + message + "]";
	}
	@PostConstruct
	public void init() throws Exception
	{
		System.out.println("bean is going through init method");
	}
	@PreDestroy
	public void destroy() throws Exception
	{
		System.out.println("bean is inside destroy method");
	}

}
