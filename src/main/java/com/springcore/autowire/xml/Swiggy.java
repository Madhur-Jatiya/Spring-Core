package com.springcore.autowire.xml;

public class Swiggy {
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Swiggy(Address address) {
		super();
		this.address = address;
		System.out.println("Using Constructor");
	}

	public Swiggy() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Swiggy [address=" + address + "]";
	}
	
	
}
