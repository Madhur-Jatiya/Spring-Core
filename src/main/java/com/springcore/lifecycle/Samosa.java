package com.springcore.lifecycle;

public class Samosa {
	private int price;

	public int getPrice() {
		System.out.println("getter in samosa");
		return price;
	}

	public void setPrice(int price) {
		System.out.println("Setter in samosa");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void init()
	{
		System.out.println("init method samosa");
	}
	
	public void destroy()
	{
		System.out.println("destroy method samosa");
	}
}
