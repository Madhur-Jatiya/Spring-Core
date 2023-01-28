package com.springcore.constructorInjection;

import java.util.List;

public class Person {
	private String personName;
	private int personId;
	private Certificate cer;
	private List<String> list;
	
	
	public Person(String personName, int personId, Certificate cer, List<String> list) {
		super();
		this.personName = personName;
		this.personId = personId;
		this.cer = cer;
		this.list = list;
	}

	@Override
	public String toString() {
		return personName + " = " + personId + " = " + cer +  " = " + list;
	}
}
