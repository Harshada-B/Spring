package com.yash.SpringCore.lifecycle;

public class Product 
{
	private double price;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Product [price=" + price + "]";
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void init()
	{
		System.out.println("iniside init method");
	}
	public void destroy()
	{
		System.out.println("inside destroy method");
	}
}
