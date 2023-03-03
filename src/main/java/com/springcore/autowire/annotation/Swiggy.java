package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Swiggy {
	@Autowired
	@Qualifier("address2")
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Using setter");
		this.address = address;
	}

	public Swiggy(Address address) {
		super();
		System.out.println("Using Constructor");
		this.address = address;
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
