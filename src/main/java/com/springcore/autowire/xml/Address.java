package com.springcore.autowire.xml;

public class Address {
	private String street1;
	private String city;

	public String getStreet1() {
		return street1;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [street1=" + street1 + ", city=" + city + "]";
	}

}
